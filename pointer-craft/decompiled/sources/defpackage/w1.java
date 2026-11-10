package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 extends u1 {
    public static w1 v;
    public gj4 n;
    public j75 r;
    public static final n74 x = n74.t;
    public static final n74 l = n74.j;

    public final void c(String str, j75 j75Var, gj4 gj4Var) {
        this.g = str;
        this.r = j75Var;
        this.n = gj4Var;
    }

    @Override // defpackage.u1
    public final int[] m(int i) {
        int iV;
        if (j().length() > 0 && i > 0) {
            try {
                gj4 gj4Var = this.n;
                if (gj4Var == null) {
                    yf2.Y("node");
                    throw null;
                }
                k44 k44VarL = gj4Var.l();
                int iRound = Math.round(k44VarL.n - k44VarL.y);
                int length = j().length();
                if (length <= i) {
                    i = length;
                }
                j75 j75Var = this.r;
                if (j75Var == null) {
                    yf2.Y("layoutResult");
                    throw null;
                }
                int iN = j75Var.y.n(i);
                j75 j75Var2 = this.r;
                if (j75Var2 == null) {
                    yf2.Y("layoutResult");
                    throw null;
                }
                float fX = j75Var2.y.x(iN) - iRound;
                if (fX > 0.0f) {
                    j75 j75Var3 = this.r;
                    if (j75Var3 == null) {
                        yf2.Y("layoutResult");
                        throw null;
                    }
                    iV = j75Var3.y.v(fX);
                } else {
                    iV = 0;
                }
                if (i == j().length() && iV < iN) {
                    iV++;
                }
                return l(w(iV, x), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.u1
    public final int[] v(int i) {
        int iV;
        if (j().length() > 0 && i < j().length()) {
            try {
                gj4 gj4Var = this.n;
                if (gj4Var == null) {
                    yf2.Y("node");
                    throw null;
                }
                k44 k44VarL = gj4Var.l();
                int iRound = Math.round(k44VarL.n - k44VarL.y);
                if (i <= 0) {
                    i = 0;
                }
                j75 j75Var = this.r;
                if (j75Var == null) {
                    yf2.Y("layoutResult");
                    throw null;
                }
                int iN = j75Var.y.n(i);
                j75 j75Var2 = this.r;
                if (j75Var2 == null) {
                    yf2.Y("layoutResult");
                    throw null;
                }
                float fX = j75Var2.y.x(iN) + iRound;
                j75 j75Var3 = this.r;
                if (j75Var3 == null) {
                    yf2.Y("layoutResult");
                    throw null;
                }
                h93 h93Var = j75Var3.y;
                float fX2 = h93Var.x(h93Var.x - 1);
                j75 j75Var4 = this.r;
                if (fX < fX2) {
                    if (j75Var4 == null) {
                        yf2.Y("layoutResult");
                        throw null;
                    }
                    iV = j75Var4.y.v(fX);
                } else {
                    if (j75Var4 == null) {
                        yf2.Y("layoutResult");
                        throw null;
                    }
                    iV = j75Var4.y.x;
                }
                return l(i, w(iV - 1, l) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int w(int i, n74 n74Var) {
        j75 j75Var = this.r;
        if (j75Var == null) {
            yf2.Y("layoutResult");
            throw null;
        }
        int iL = j75Var.l(i);
        j75 j75Var2 = this.r;
        if (j75Var2 == null) {
            yf2.Y("layoutResult");
            throw null;
        }
        n74 n74VarJ = j75Var2.j(iL);
        j75 j75Var3 = this.r;
        if (n74Var != n74VarJ) {
            if (j75Var3 != null) {
                return j75Var3.l(i);
            }
            yf2.Y("layoutResult");
            throw null;
        }
        if (j75Var3 != null) {
            return j75Var3.y.r(i, false) - 1;
        }
        yf2.Y("layoutResult");
        throw null;
    }
}
