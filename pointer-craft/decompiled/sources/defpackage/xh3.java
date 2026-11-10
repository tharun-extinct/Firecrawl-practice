package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class xh3 {
    public ho0 a;
    public final ArrayList b;
    public final boolean c;
    public final Context g;
    public final Notification i;
    public byte j;
    public PendingIntent l;
    public Bundle q;
    public CharSequence v;
    public String w;
    public CharSequence x;
    public final ArrayList y = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final boolean t = true;
    public boolean m = false;

    public xh3(Context context, String str) {
        Notification notification = new Notification();
        this.i = notification;
        this.g = context;
        this.w = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = (byte) 0;
        this.b = new ArrayList();
        this.c = true;
    }

    public static CharSequence r(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void g(vh3 vh3Var) {
        this.y.add(vh3Var);
    }

    public final void j(ho0 ho0Var) {
        if (this.a != ho0Var) {
            this.a = ho0Var;
            if (((xh3) ho0Var.g) != this) {
                ho0Var.g = this;
                j(ho0Var);
            }
        }
    }

    public final void l(int i) {
        this.i.icon = i;
    }

    public final void n(PendingIntent pendingIntent) {
        this.l = pendingIntent;
    }

    public final void v(String str) {
        this.x = r(str);
    }

    public final void x(String str) {
        this.v = r(str);
    }

    public final Notification y() {
        Bundle bundle;
        q70 q70Var = new q70(this);
        xh3 xh3Var = (xh3) q70Var.a;
        ho0 ho0Var = xh3Var.a;
        if (ho0Var != null) {
            ho0Var.y(q70Var);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) q70Var.t;
        Notification notificationBuild = i >= 26 ? builder.build() : builder.build();
        if (ho0Var != null) {
            xh3Var.a.getClass();
        }
        if (ho0Var != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", ho0Var.v());
        }
        return notificationBuild;
    }
}
