package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vw1 implements r02 {
    public final pw1 a;
    public volatile mz0 j;
    public final Object t = new Object();

    public vw1(pw1 pw1Var) {
        this.a = pw1Var;
    }

    public final mz0 g() {
        pw1 pw1Var = this.a;
        rw1 rw1Var = pw1Var.B;
        if ((rw1Var == null ? null : rw1Var.A) == null) {
            l0.q("Hilt Fragments must be attached before creating the component.");
            return null;
        }
        js2.v((rw1Var == null ? null : rw1Var.A) instanceof s02, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", (rw1Var == null ? null : rw1Var.A).getClass());
        rw1 rw1Var2 = pw1Var.B;
        kz0 kz0Var = (kz0) ((uw1) a11.u(uw1.class, rw1Var2 != null ? rw1Var2.A : null));
        nz0 nz0Var = kz0Var.g;
        return new mz0(kz0Var.r);
    }

    @Override // defpackage.r02
    public final Object n() {
        if (this.j == null) {
            synchronized (this.t) {
                try {
                    if (this.j == null) {
                        this.j = g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.j;
    }
}
