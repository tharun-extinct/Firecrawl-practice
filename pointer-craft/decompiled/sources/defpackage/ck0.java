package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ck0 {
    public static final ek0 g = new ek0(v70.n, hi0.h);

    public static final ek0 g(ar arVar, i00 i00Var, h02 h02Var, int i) {
        if (arVar.equals(v70.n) && i00Var.equals(hi0.h)) {
            h02Var.X(-1446604504);
            h02Var.b(false);
            return g;
        }
        h02Var.X(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && h02Var.x(arVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !h02Var.x(i00Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = h02Var.K();
        if (z3 || objK == oo0.g) {
            objK = new ek0(arVar, i00Var);
            h02Var.i0(objK);
        }
        ek0 ek0Var = (ek0) objK;
        h02Var.b(false);
        return ek0Var;
    }
}
