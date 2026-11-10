package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t66 implements Cloneable {
    public final y66 j;
    public y66 t;

    public t66(y66 y66Var) {
        this.j = y66Var;
        if (y66Var.j()) {
            l0.u("Default instance must be immutable.");
            throw null;
        }
        this.t = y66Var.c();
    }

    public final Object clone() {
        t66 t66Var = (t66) this.j.a(5);
        boolean zJ = this.t.j();
        y66 y66Var = this.t;
        if (zJ) {
            y66Var.b();
            y66Var = this.t;
        }
        t66Var.t = y66Var;
        return t66Var;
    }

    public final y66 g() {
        boolean zJ = this.t.j();
        y66 y66Var = this.t;
        if (zJ) {
            y66Var.b();
            y66Var = this.t;
        }
        y66Var.getClass();
        if (y66.t(y66Var, true)) {
            return y66Var;
        }
        throw new ka6();
    }

    public final void y() {
        if (this.t.j()) {
            return;
        }
        y66 y66VarC = this.j.c();
        l96.r.g(y66VarC.getClass()).y(y66VarC, this.t);
        this.t = y66VarC;
    }
}
