package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rg5 {
    public static pg5 g(Object obj) {
        b12 b12Var = (b12) obj;
        pg5 pg5Var = b12Var.unknownFields;
        if (pg5Var != pg5.x) {
            return pg5Var;
        }
        pg5 pg5VarR = pg5.r();
        b12Var.unknownFields = pg5VarR;
        return pg5VarR;
    }

    public static boolean y(int i, si0 si0Var, Object obj) throws hg2 {
        int iX = si0Var.x();
        int iX2 = rb6.x(iX);
        int iL = rb6.l(iX);
        if (iL == 0) {
            ((pg5) obj).n(rb6.j(iX2, 0), Long.valueOf(si0Var.B()));
            return true;
        }
        if (iL == 1) {
            ((pg5) obj).n(rb6.j(iX2, 1), Long.valueOf(si0Var.h()));
            return true;
        }
        if (iL == 2) {
            ((pg5) obj).n(rb6.j(iX2, 2), si0Var.w());
            return true;
        }
        if (iL != 3) {
            if (iL == 4) {
                return false;
            }
            if (iL != 5) {
                throw hg2.r();
            }
            ((pg5) obj).n(rb6.j(iX2, 5), Integer.valueOf(si0Var.u()));
            return true;
        }
        pg5 pg5VarR = pg5.r();
        int iJ = rb6.j(iX2, 4);
        int i2 = i + 1;
        if (i2 >= 100) {
            throw new hg2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (si0Var.v() != Integer.MAX_VALUE && y(i2, si0Var, pg5VarR)) {
        }
        if (iJ != si0Var.x()) {
            throw new hg2("Protocol message end-group tag did not match expected tag.");
        }
        if (pg5VarR.v) {
            pg5VarR.v = false;
        }
        ((pg5) obj).n(rb6.j(iX2, 3), pg5VarR);
        return true;
    }
}
