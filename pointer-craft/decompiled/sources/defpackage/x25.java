package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x25 {
    public final nj6 g = new nj6();

    public x25(s25 s25Var) {
        s25Var.v(new s25(this));
    }

    public final void g(Exception exc) {
        this.g.w(exc);
    }

    public final boolean r(Exception exc) {
        nj6 nj6Var = this.g;
        nj6Var.getClass();
        jr2.q(exc, "Exception must not be null");
        synchronized (nj6Var.g) {
            try {
                if (nj6Var.r) {
                    return false;
                }
                nj6Var.r = true;
                nj6Var.x = exc;
                nj6Var.y.y(nj6Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(Object obj) {
        this.g.m(obj);
    }

    public x25() {
    }
}
