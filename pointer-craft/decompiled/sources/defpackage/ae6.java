package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ae6 {
    public static final ji g;
    public static final ji n;
    public static final ji r;
    public static final ji v;
    public static final ji y;

    static {
        byte b = 29;
        g = new ji(new vq0((byte) 12), new vy3((byte) 1), b);
        y = new ji(new vq0((byte) 13), new vy3((byte) 2), b);
        r = new ji(new vq0((byte) 14), new vy3((byte) 3), b);
        n = new ji(new vq0((byte) 15), new vy3((byte) 4), b);
        v = new ji(new vq0((byte) 16), new vy3((byte) 5), b);
    }

    public static final void g(t35 t35Var, Context context, final boolean z, final String str, final long j) {
        if (u75.r(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) jd6.g.a(context2);
        if (list.isEmpty()) {
            return;
        }
        xa3 xa3Var = t35Var.g;
        xa3 xa3Var2 = t35Var.g;
        g45 g45Var = g45.y;
        xa3Var.g(g45Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            xa3Var2.g(new c45(new wy3(i), resolveInfo.loadLabel(packageManager).toString(), 0, new xy1() { // from class: xy3
                @Override // defpackage.xy1
                public final Object a(Object obj) {
                    jd6.y.w(context2, resolveInfo, Boolean.valueOf(z), str, new u75(j));
                    ((h45) obj).close();
                    return og5.g;
                }
            }));
            i++;
            context2 = context;
        }
        xa3Var2.g(g45Var);
    }

    public static final void y(fx0 fx0Var, Throwable th) {
        if (th instanceof ha1) {
            th = ((ha1) th).j;
        }
        try {
            ix0 ix0Var = (ix0) fx0Var.h(d93.t);
            if (ix0Var != null) {
                ix0Var.f(fx0Var, th);
            } else {
                yd6.n(fx0Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                kf6.g(runtimeException, th);
                th = runtimeException;
            }
            yd6.n(fx0Var, th);
        }
    }
}
