package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x05 implements xq5, zl1 {
    public static final String s = iy2.v("SystemFgDispatcher");
    public final Object a = new Object();
    public SystemForegroundService b;
    public final HashSet c;
    public final yq5 i;
    public final kr5 j;
    public String m;
    public final LinkedHashMap q;
    public final zl5 t;
    public final HashMap w;

    public x05(Context context) {
        kr5 kr5VarG = kr5.g(context);
        this.j = kr5VarG;
        zl5 zl5Var = kr5VarG.n;
        this.t = zl5Var;
        this.m = null;
        this.q = new LinkedHashMap();
        this.c = new HashSet();
        this.w = new HashMap();
        this.i = new yq5(context, zl5Var, this);
        kr5VarG.x.y(this);
    }

    public static Intent n(Context context, String str, yv1 yv1Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", yv1Var.g);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", yv1Var.y);
        intent.putExtra("KEY_NOTIFICATION", yv1Var.r);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent x(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    public static Intent y(Context context, String str, yv1 yv1Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", yv1Var.g);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", yv1Var.y);
        intent.putExtra("KEY_NOTIFICATION", yv1Var.r);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.zl1
    public final void g(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.a) {
            try {
                sr5 sr5Var = (sr5) this.w.remove(str);
                if (sr5Var != null ? this.c.remove(sr5Var) : false) {
                    this.i.y(this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yv1 yv1Var = (yv1) this.q.remove(str);
        byte b = 3;
        if (str.equals(this.m) && this.q.size() > 0) {
            Iterator it = this.q.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.m = (String) entry.getKey();
            if (this.b != null) {
                yv1 yv1Var2 = (yv1) entry.getValue();
                SystemForegroundService systemForegroundService = this.b;
                systemForegroundService.t.post(new y05(systemForegroundService, yv1Var2.g, yv1Var2.r, yv1Var2.y));
                SystemForegroundService systemForegroundService2 = this.b;
                systemForegroundService2.t.post(new xa0(systemForegroundService2, yv1Var2.g, b));
            }
        }
        SystemForegroundService systemForegroundService3 = this.b;
        if (yv1Var == null || systemForegroundService3 == null) {
            return;
        }
        iy2 iy2VarR = iy2.r();
        String str2 = s;
        int i = yv1Var.g;
        int i2 = yv1Var.y;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        iy2VarR.g(str2, xi3.m(sb, i2, ")"), new Throwable[0]);
        systemForegroundService3.t.post(new xa0(systemForegroundService3, yv1Var.g, b));
    }

    public final void j() {
        this.b = null;
        synchronized (this.a) {
            this.i.r();
        }
        this.j.x.v(this);
    }

    public final void l(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        iy2 iy2VarR = iy2.r();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        iy2VarR.g(s, xi3.m(sb, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.b == null) {
            return;
        }
        yv1 yv1Var = new yv1(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.q;
        linkedHashMap.put(stringExtra, yv1Var);
        if (TextUtils.isEmpty(this.m)) {
            this.m = stringExtra;
            SystemForegroundService systemForegroundService = this.b;
            systemForegroundService.t.post(new y05(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.b;
        systemForegroundService2.t.post(new q05(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((yv1) ((Map.Entry) it.next()).getValue()).y;
        }
        yv1 yv1Var2 = (yv1) linkedHashMap.get(this.m);
        if (yv1Var2 != null) {
            SystemForegroundService systemForegroundService3 = this.b;
            systemForegroundService3.t.post(new y05(systemForegroundService3, yv1Var2.g, yv1Var2.r, i));
        }
    }

    @Override // defpackage.xq5
    public final void r(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            iy2.r().g(s, xi3.t("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            kr5 kr5Var = this.j;
            kr5Var.n.g(new jx4(kr5Var, str, true));
        }
    }

    @Override // defpackage.xq5
    public final void v(List list) {
    }
}
