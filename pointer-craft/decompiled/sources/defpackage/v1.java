package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 extends u1 {
    public static v1 l;
    public static v1 v;
    public static v1 x;
    public Object n;
    public final /* synthetic */ byte r;
    public static final n74 j = n74.t;
    public static final n74 t = n74.j;

    public /* synthetic */ v1(byte b) {
        this.r = b;
    }

    public boolean b(int i) {
        if (i < 0 || i >= j().length()) {
            return false;
        }
        return Character.isLetterOrDigit(j().codePointAt(i));
    }

    public void c(String str, j75 j75Var) {
        this.g = str;
        this.n = j75Var;
    }

    public boolean i(int i) {
        if (i <= 0 || !b(i - 1)) {
            return false;
        }
        return i == j().length() || !b(i);
    }

    @Override // defpackage.u1
    public final int[] m(int i) {
        int iN;
        switch (this.r) {
            case 0:
                int length = j().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.n;
                    if (breakIterator == null) {
                        yf2.Y("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.n;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            yf2.Y("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return l(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        yf2.Y("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                int length2 = j().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !b(i - 1) && !i(i)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.n;
                    if (breakIterator3 == null) {
                        yf2.Y("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.n;
                if (breakIterator4 == null) {
                    yf2.Y("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !b(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !b(iPreceding2 - 1)) {
                    return l(iPreceding2, i);
                }
                return null;
            default:
                if (j().length() <= 0 || i <= 0) {
                    return null;
                }
                int length3 = j().length();
                j75 j75Var = (j75) this.n;
                n74 n74Var = t;
                if (i > length3) {
                    if (j75Var == null) {
                        yf2.Y("layoutResult");
                        throw null;
                    }
                    iN = j75Var.y.n(j().length());
                } else {
                    if (j75Var == null) {
                        yf2.Y("layoutResult");
                        throw null;
                    }
                    int iN2 = j75Var.y.n(i);
                    iN = w(iN2, n74Var) + 1 == i ? iN2 : iN2 - 1;
                }
                if (iN < 0) {
                    return null;
                }
                return l(w(iN, j), w(iN, n74Var) + 1);
        }
    }

    @Override // defpackage.u1
    public void t(String str) {
        switch (this.r) {
            case 0:
                this.g = str;
                BreakIterator breakIterator = (BreakIterator) this.n;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    yf2.Y("impl");
                    throw null;
                }
            case 1:
                this.g = str;
                BreakIterator breakIterator2 = (BreakIterator) this.n;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    yf2.Y("impl");
                    throw null;
                }
            default:
                super.t(str);
                return;
        }
    }

    @Override // defpackage.u1
    public final int[] v(int i) {
        int iN;
        switch (this.r) {
            case 0:
                int length = j().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.n;
                    if (breakIterator == null) {
                        yf2.Y("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.n;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            yf2.Y("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return l(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        yf2.Y("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                if (j().length() <= 0 || i >= j().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!b(i) && (!b(i) || (i != 0 && b(i - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.n;
                    if (breakIterator3 == null) {
                        yf2.Y("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.n;
                if (breakIterator4 == null) {
                    yf2.Y("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !i(iFollowing2)) {
                    return null;
                }
                return l(i, iFollowing2);
            default:
                if (j().length() <= 0 || i >= j().length()) {
                    return null;
                }
                j75 j75Var = (j75) this.n;
                n74 n74Var = j;
                if (i < 0) {
                    if (j75Var == null) {
                        yf2.Y("layoutResult");
                        throw null;
                    }
                    iN = j75Var.y.n(0);
                } else {
                    if (j75Var == null) {
                        yf2.Y("layoutResult");
                        throw null;
                    }
                    int iN2 = j75Var.y.n(i);
                    iN = w(iN2, n74Var) == i ? iN2 : iN2 + 1;
                }
                j75 j75Var2 = (j75) this.n;
                if (j75Var2 == null) {
                    yf2.Y("layoutResult");
                    throw null;
                }
                if (iN >= j75Var2.y.x) {
                    return null;
                }
                return l(w(iN, n74Var), w(iN, t) + 1);
        }
    }

    public int w(int i, n74 n74Var) {
        j75 j75Var = (j75) this.n;
        if (j75Var == null) {
            yf2.Y("layoutResult");
            throw null;
        }
        int iL = j75Var.l(i);
        j75 j75Var2 = (j75) this.n;
        if (j75Var2 == null) {
            yf2.Y("layoutResult");
            throw null;
        }
        n74 n74VarJ = j75Var2.j(iL);
        j75 j75Var3 = (j75) this.n;
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
