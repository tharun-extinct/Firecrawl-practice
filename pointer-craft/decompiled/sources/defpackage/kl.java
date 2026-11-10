package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class kl {
    public static final jl j = new jl(new dp1((byte) 2));
    public static int t = -100;
    public static ux2 a = null;
    public static ux2 m = null;
    public static Boolean q = null;
    public static boolean w = false;
    public static final or c = new or(0);
    public static final Object i = new Object();
    public static final Object b = new Object();

    public static void v(tl tlVar) {
        synchronized (i) {
            try {
                or orVar = c;
                orVar.getClass();
                lr lrVar = new lr(orVar);
                while (lrVar.hasNext()) {
                    kl klVar = (kl) ((WeakReference) lrVar.next()).get();
                    if (klVar == tlVar || klVar == null) {
                        lrVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean y(Context context) {
        if (q == null) {
            try {
                int i2 = so.j;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) so.class), 640).metaData;
                if (bundle != null) {
                    q = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                q = Boolean.FALSE;
            }
        }
        return q.booleanValue();
    }

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void g();

    public abstract void l(int i2);

    public abstract void m(CharSequence charSequence);

    public abstract void n();

    public abstract void r();

    public abstract void t(View view);

    public abstract boolean x(int i2);
}
