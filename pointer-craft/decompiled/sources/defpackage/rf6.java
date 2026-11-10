package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rf6 {
    public static final boolean n(gj4 gj4Var) {
        aj4 aj4VarM = gj4Var.m();
        return aj4VarM.j.r(kj4.B);
    }

    public static zo1 v(Application application) {
        boolean z;
        zo1 zo1VarG;
        application.getClass();
        ro1.x(application);
        r11 r11Var = (r11) ro1.r().y(r11.class);
        ro1 ro1Var = r11Var.g;
        ro1Var.g();
        sz0 sz0Var = (sz0) ro1Var.l.get();
        synchronized (sz0Var) {
            z = sz0Var.g;
        }
        r11Var.q = (eu3) r11Var.g.y(eu3.class);
        r11Var.x.x = z;
        x25 x25Var = zo1.t;
        qz1 qz1Var = (qz1) ro1.r().y(qz1.class);
        jr2.q(qz1Var, "Functions component does not exist.");
        synchronized (qz1Var) {
            zo1VarG = (zo1) qz1Var.y.get("us-central1");
            if (zo1VarG == null) {
                zo1VarG = qz1Var.g.g();
                qz1Var.y.put("us-central1", zo1VarG);
            }
        }
        return zo1VarG;
    }

    public boolean g(k0 k0Var, f0 f0Var, f0 f0Var2) {
        synchronized (k0Var) {
            try {
                if (k0Var.t != f0Var) {
                    return false;
                }
                k0Var.t = f0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(j0 j0Var, Thread thread) {
        j0Var.g = thread;
    }

    public boolean r(k0 k0Var, j0 j0Var, j0 j0Var2) {
        synchronized (k0Var) {
            try {
                if (k0Var.a != j0Var) {
                    return false;
                }
                k0Var.a = j0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x(j0 j0Var, j0 j0Var2) {
        j0Var.y = j0Var2;
    }

    public boolean y(k0 k0Var, Object obj, Object obj2) {
        synchronized (k0Var) {
            try {
                if (k0Var.j != obj) {
                    return false;
                }
                k0Var.j = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
