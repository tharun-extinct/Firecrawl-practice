package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class yq5 {
    public static final String n = iy2.v("WorkConstraintsTracker");
    public final xq5 g;
    public final Object r;
    public final cs0[] y;

    public yq5(Context context, zl5 zl5Var, xq5 xq5Var) {
        Context applicationContext = context.getApplicationContext();
        this.g = xq5Var;
        this.y = new cs0[]{new c00((d00) kb5.z(applicationContext, zl5Var).j, (byte) 0), new c00((e00) kb5.z(applicationContext, zl5Var).t, (byte) 1), new c00((nx4) kb5.z(applicationContext, zl5Var).m, (byte) 4), new c00((rg3) kb5.z(applicationContext, zl5Var).a, (byte) 2), new c00((rg3) kb5.z(applicationContext, zl5Var).a, (byte) 3), new og3((rg3) kb5.z(applicationContext, zl5Var).a), new ng3((rg3) kb5.z(applicationContext, zl5Var).a)};
        this.r = new Object();
    }

    public final boolean g(String str) {
        synchronized (this.r) {
            try {
                for (cs0 cs0Var : this.y) {
                    Object obj = cs0Var.y;
                    if (obj != null && cs0Var.y(obj) && cs0Var.g.contains(str)) {
                        iy2.r().g(n, "Work " + str + " constrained by " + cs0Var.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        synchronized (this.r) {
            try {
                for (cs0 cs0Var : this.y) {
                    ArrayList arrayList = cs0Var.g;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cs0Var.r.y(cs0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(Collection collection) {
        synchronized (this.r) {
            try {
                for (cs0 cs0Var : this.y) {
                    if (cs0Var.n != null) {
                        cs0Var.n = null;
                        cs0Var.n(null, cs0Var.y);
                    }
                }
                for (cs0 cs0Var2 : this.y) {
                    cs0Var2.r(collection);
                }
                for (cs0 cs0Var3 : this.y) {
                    if (cs0Var3.n != this) {
                        cs0Var3.n = this;
                        cs0Var3.n(this, cs0Var3.y);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
