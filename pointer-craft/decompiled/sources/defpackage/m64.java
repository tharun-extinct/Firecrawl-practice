package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m64 implements ox0, j64 {
    public static final mb0 m = new mb0((byte) 0);
    public volatile fx0 a;
    public final fx0 j;
    public final m64 t = this;

    public m64(fx0 fx0Var) {
        this.j = fx0Var;
    }

    @Override // defpackage.j64
    public final void n() {
        y();
    }

    @Override // defpackage.j64
    public final void r() {
        y();
    }

    @Override // defpackage.ox0
    public final fx0 w() {
        fx0 fx0VarB;
        fx0 fx0Var = this.a;
        if (fx0Var == null || fx0Var == m) {
            wo0 wo0Var = (wo0) this.j.h(wo0.t);
            fx0 l64Var = wo0Var != null ? new l64(wo0Var, this) : ni1.j;
            synchronized (this.t) {
                try {
                    fx0 fx0Var2 = this.a;
                    if (fx0Var2 == null) {
                        fx0 fx0Var3 = this.j;
                        fx0VarB = fx0Var3.b(new fh2((dh2) fx0Var3.h(d52.m))).b(ni1.j).b(l64Var);
                    } else if (fx0Var2 == m) {
                        fx0 fx0Var4 = this.j;
                        fh2 fh2Var = new fh2((dh2) fx0Var4.h(d52.m));
                        fh2Var.J(new bw1((byte) 0));
                        fx0VarB = fx0Var4.b(fh2Var).b(ni1.j).b(l64Var);
                    } else {
                        fx0VarB = fx0Var2;
                    }
                    this.a = fx0VarB;
                } catch (Throwable th) {
                    throw th;
                }
            }
            fx0Var = fx0VarB;
        }
        fx0Var.getClass();
        return fx0Var;
    }

    public final void y() {
        synchronized (this.t) {
            try {
                fx0 fx0Var = this.a;
                if (fx0Var == null) {
                    this.a = m;
                } else {
                    v70.a(fx0Var, new bw1((byte) 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.j64
    public final void g() {
    }
}
