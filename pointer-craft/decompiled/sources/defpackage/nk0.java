package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class nk0 implements fx0, Serializable {
    public final fx0 j;
    public final dx0 t;

    public nk0(dx0 dx0Var, fx0 fx0Var) {
        fx0Var.getClass();
        this.j = fx0Var;
        this.t = dx0Var;
    }

    @Override // defpackage.fx0
    public final fx0 E(ex0 ex0Var) {
        ex0Var.getClass();
        dx0 dx0Var = this.t;
        dx0 dx0VarH = dx0Var.h(ex0Var);
        fx0 fx0Var = this.j;
        if (dx0VarH != null) {
            return fx0Var;
        }
        fx0 fx0VarE = fx0Var.E(ex0Var);
        if (fx0VarE == fx0Var) {
            return this;
        }
        return fx0VarE == ni1.j ? dx0Var : new nk0(dx0Var, fx0VarE);
    }

    @Override // defpackage.fx0
    public final fx0 b(fx0 fx0Var) {
        fx0Var.getClass();
        return fx0Var == ni1.j ? this : (fx0) fx0Var.d(new on0((byte) 6), this);
    }

    @Override // defpackage.fx0
    public final Object d(bz1 bz1Var, Object obj) {
        return bz1Var.l(this.j.d(bz1Var, obj), this.t);
    }

    public final boolean equals(Object obj) {
        boolean zP;
        if (this == obj) {
            return true;
        }
        if (obj instanceof nk0) {
            nk0 nk0Var = (nk0) obj;
            int i = 2;
            nk0 nk0Var2 = nk0Var;
            int i2 = 2;
            while (true) {
                fx0 fx0Var = nk0Var2.j;
                nk0Var2 = fx0Var instanceof nk0 ? (nk0) fx0Var : null;
                if (nk0Var2 == null) {
                    break;
                }
                i2++;
            }
            nk0 nk0Var3 = this;
            while (true) {
                fx0 fx0Var2 = nk0Var3.j;
                nk0Var3 = fx0Var2 instanceof nk0 ? (nk0) fx0Var2 : null;
                if (nk0Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    dx0 dx0Var = this.t;
                    if (!yf2.p(nk0Var.h(dx0Var.getKey()), dx0Var)) {
                        zP = false;
                        break;
                    }
                    fx0 fx0Var3 = this.j;
                    if (!(fx0Var3 instanceof nk0)) {
                        fx0Var3.getClass();
                        dx0 dx0Var2 = (dx0) fx0Var3;
                        zP = yf2.p(nk0Var.h(dx0Var2.getKey()), dx0Var2);
                        break;
                    }
                    this = (nk0) fx0Var3;
                }
                if (zP) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fx0
    public final dx0 h(ex0 ex0Var) {
        ex0Var.getClass();
        while (true) {
            dx0 dx0VarH = this.t.h(ex0Var);
            if (dx0VarH != null) {
                return dx0VarH;
            }
            fx0 fx0Var = this.j;
            if (!(fx0Var instanceof nk0)) {
                return fx0Var.h(ex0Var);
            }
            this = (nk0) fx0Var;
        }
    }

    public final int hashCode() {
        return this.t.hashCode() + this.j.hashCode();
    }

    public final String toString() {
        return "[" + ((String) d(new os((byte) 2), "")) + ']';
    }
}
