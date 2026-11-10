package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eg6 {
    public static final void g(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            l0.t(i != i2 ? du4.q(i, i2, "Both size ", " and step ", " must be greater than zero.") : du4.w(i, "size ", " must be greater than zero."));
        }
    }

    public static final q04 n(byte[] bArr) {
        q04 q04Var;
        bArr.getClass();
        try {
            w04 w04Var = new w04();
            w04Var.t = 0;
            w04Var.j = -1;
            np3.l(w04Var, bArr);
            int i = w04Var.t;
            if (i == 0 || i == 1) {
                p04 p04Var = new p04();
                np3.l(p04Var, bArr);
                q04 q04Var2 = new q04();
                q04Var2.m = 3;
                q04Var2.t = (byte) 6;
                q04Var2.a = p04Var;
                q04Var = q04Var2;
            } else if (2 > i || i >= 4) {
                q04Var = null;
            } else {
                q04Var = new q04();
                np3.l(q04Var, bArr);
                q04Var.m = 3;
            }
            if (q04Var != null) {
                if (q04Var.c == null) {
                    q04Var.c = UUID.randomUUID().toString();
                }
                return q04Var;
            }
        } catch (jg2 unused) {
        }
        return null;
    }

    public static final void r(Activity activity, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            l0.u("List adapter activity trampoline invoked without specifying target intent.");
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            l0.u("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? wa.j(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        int iOrdinal = h4.valueOf(stringExtra).ordinal();
        if (iOrdinal == 0) {
            activity.startActivity(intent2, bundleExtra);
        } else if (iOrdinal == 1) {
            activity.sendBroadcast(intent2);
        } else if (iOrdinal == 2) {
            activity.startService(intent2);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                up.y();
                return;
            }
            activity.sendBroadcast(intent2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            tm.d(activity, intent2);
        } else {
            activity.startService(intent2);
        }
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    public static final Iterator v(Iterator it) {
        it.getClass();
        return !it.hasNext() ? oi1.j : lr2.d(new mh2(it, null, (byte) 1));
    }

    public static final Uri y(ad5 ad5Var, int i, h4 h4Var, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(h4Var.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(ad5Var.y));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", yb1.r(ad5Var.a));
        builder.appendQueryParameter("extraData", str);
        if (ad5Var.x) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(ad5Var.m));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }
}
