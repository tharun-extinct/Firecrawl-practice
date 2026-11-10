package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jb4 {
    public static final kb4 g = new kb4(v70.y, hi0.p);

    public static final kb4 g(xq xqVar, j00 j00Var, h02 h02Var, int i) {
        if (xqVar.equals(v70.y) && yf2.p(j00Var, hi0.p)) {
            h02Var.X(-1073830487);
            h02Var.b(false);
            return g;
        }
        h02Var.X(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && h02Var.x(xqVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !h02Var.x(j00Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objK = h02Var.K();
        if (z3 || objK == oo0.g) {
            objK = new kb4(xqVar, j00Var);
            h02Var.i0(objK);
        }
        kb4 kb4Var = (kb4) objK;
        h02Var.b(false);
        return kb4Var;
    }
}
