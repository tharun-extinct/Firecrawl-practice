package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iq2 extends i73 implements lm2 {
    public static final gq2 d = new gq2();
    public y22 f;
    public um3 k;
    public jq2 o;

    public final boolean Q0(eq2 eq2Var, int i) {
        if (!fz5.n(i, 5) && !fz5.n(i, 6)) {
            if (fz5.n(i, 3) || fz5.n(i, 4)) {
                if (this.k != um3.j) {
                }
            } else if (!fz5.n(i, 1) && !fz5.n(i, 2)) {
                l0.z("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (R0(i)) {
            }
        } else if (this.k != um3.t) {
            if (R0(i) ? eq2Var.g > 0 : eq2Var.y < this.o.g() - 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean R0(int i) {
        if (fz5.n(i, 1)) {
            return false;
        }
        if (fz5.n(i, 2)) {
            return true;
        }
        if (fz5.n(i, 5)) {
            return false;
        }
        if (fz5.n(i, 6)) {
            return true;
        }
        if (fz5.n(i, 3)) {
            int iOrdinal = k33.V(this).G.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            uo1.g();
            return false;
        }
        if (!fz5.n(i, 4)) {
            l0.z("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = k33.V(this).G.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        uo1.g();
        return false;
    }

    @Override // defpackage.lm2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        us3 us3VarV = p33Var.v(j);
        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new t9(us3VarV, (byte) 2));
    }
}
