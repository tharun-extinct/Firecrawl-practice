package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m41 implements xq5, zl1 {
    public static final String s = iy2.v("DelayMetCommandHandler");
    public final String a;
    public PowerManager.WakeLock i;
    public final Context j;
    public final r05 m;
    public final yq5 q;
    public final int t;
    public boolean b = false;
    public byte c = 0;
    public final Object w = new Object();

    public m41(Context context, int i, String str, r05 r05Var) {
        this.j = context;
        this.t = i;
        this.m = r05Var;
        this.a = str;
        this.q = new yq5(context, r05Var.t, this);
    }

    @Override // defpackage.zl1
    public final void g(String str, boolean z) {
        iy2.r().g(s, "onExecuted " + str + ", " + z, new Throwable[0]);
        y();
        int i = this.t;
        r05 r05Var = this.m;
        Context context = this.j;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            intent.putExtra("KEY_WORKSPEC_ID", this.a);
            r05Var.v(new q05(i, r05Var, intent));
        }
        if (this.b) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            r05Var.v(new q05(i, r05Var, intent2));
        }
    }

    public final void n() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        sb.append(str);
        sb.append(" (");
        sb.append(this.t);
        sb.append(")");
        this.i = cn5.g(this.j, sb.toString());
        iy2 iy2VarR = iy2.r();
        PowerManager.WakeLock wakeLock = this.i;
        String str2 = s;
        iy2VarR.g(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.i.acquire();
        sr5 sr5VarA = this.m.q.r.k().a(str);
        if (sr5VarA == null) {
            x();
            return;
        }
        boolean zY = sr5VarA.y();
        this.b = zY;
        if (zY) {
            this.q.y(Collections.singletonList(sr5VarA));
        } else {
            iy2.r().g(str2, xi3.t("No constraints for ", str), new Throwable[0]);
            v(Collections.singletonList(str));
        }
    }

    @Override // defpackage.xq5
    public final void r(ArrayList arrayList) {
        x();
    }

    @Override // defpackage.xq5
    public final void v(List list) {
        if (list.contains(this.a)) {
            synchronized (this.w) {
                try {
                    if (this.c == 0) {
                        this.c = (byte) 1;
                        iy2.r().g(s, "onAllConstraintsMet for " + this.a, new Throwable[0]);
                        if (this.m.m.l(this.a, null)) {
                            this.m.a.g(this.a, this);
                        } else {
                            y();
                        }
                    } else {
                        iy2.r().g(s, "Already started work for " + this.a, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void x() {
        synchronized (this.w) {
            try {
                if (this.c < 2) {
                    this.c = (byte) 2;
                    iy2 iy2VarR = iy2.r();
                    String str = s;
                    iy2VarR.g(str, "Stopping work for WorkSpec " + this.a, new Throwable[0]);
                    Context context = this.j;
                    String str2 = this.a;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    r05 r05Var = this.m;
                    r05Var.v(new q05(this.t, r05Var, intent));
                    if (this.m.m.n(this.a)) {
                        iy2.r().g(str, "WorkSpec " + this.a + " needs to be rescheduled", new Throwable[0]);
                        Context context2 = this.j;
                        String str3 = this.a;
                        Intent intent2 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent2.setAction("ACTION_SCHEDULE_WORK");
                        intent2.putExtra("KEY_WORKSPEC_ID", str3);
                        r05 r05Var2 = this.m;
                        r05Var2.v(new q05(this.t, r05Var2, intent2));
                    } else {
                        iy2.r().g(str, "Processor does not have WorkSpec " + this.a + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    iy2.r().g(s, "Already stopped work for " + this.a, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y() {
        synchronized (this.w) {
            try {
                this.q.r();
                this.m.a.y(this.a);
                PowerManager.WakeLock wakeLock = this.i;
                if (wakeLock != null && wakeLock.isHeld()) {
                    iy2.r().g(s, "Releasing wakelock " + this.i + " for WorkSpec " + this.a, new Throwable[0]);
                    this.i.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
