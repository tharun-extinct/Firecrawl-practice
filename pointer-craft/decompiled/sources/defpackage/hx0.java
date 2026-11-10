package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hx0 extends a0 implements dx0 {
    public static final gx0 t = new gx0(f73.t, new l1(28));

    public hx0() {
        super(f73.t);
    }

    @Override // defpackage.a0, defpackage.fx0
    public final fx0 E(ex0 ex0Var) {
        ex0Var.getClass();
        if (ex0Var instanceof gx0) {
            gx0 gx0Var = (gx0) ex0Var;
            ex0 ex0Var2 = this.j;
            if ((ex0Var2 != gx0Var && gx0Var.t != ex0Var2) || ((dx0) gx0Var.j.a(this)) == null) {
                return this;
            }
        } else if (f73.t != ex0Var) {
            return this;
        }
        return ni1.j;
    }

    public void L(fx0 fx0Var, Runnable runnable) {
        c21.m.L(fx0Var, runnable);
    }

    public void P(fx0 fx0Var, Runnable runnable) throws ha1 {
        pw5.L(this, fx0Var, runnable);
    }

    public boolean Q(fx0 fx0Var) {
        return !(this instanceof fg5);
    }

    public hx0 R(int i) {
        xq2.l(i);
        return new uu2(this, i);
    }

    @Override // defpackage.a0, defpackage.fx0
    public final dx0 h(ex0 ex0Var) {
        dx0 dx0Var;
        ex0Var.getClass();
        if (ex0Var instanceof gx0) {
            gx0 gx0Var = (gx0) ex0Var;
            ex0 ex0Var2 = this.j;
            if ((ex0Var2 == gx0Var || gx0Var.t == ex0Var2) && (dx0Var = (dx0) gx0Var.j.a(this)) != null) {
                return dx0Var;
            }
        } else if (f73.t == ex0Var) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a11.z(this);
    }
}
