package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j72 implements im2 {
    public final s55 g;
    public final my1 n;
    public final wb5 r;
    public final int y;

    public j72(s55 s55Var, int i, wb5 wb5Var, my1 my1Var) {
        this.g = s55Var;
        this.y = i;
        this.r = wb5Var;
        this.n = my1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j72) {
            j72 j72Var = (j72) obj;
            if (this.g == j72Var.g && this.y == j72Var.y && this.r.equals(j72Var.r) && yf2.p(this.n, j72Var.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.r.hashCode() + du4.r(this.y, this.g.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.g + ", cursorOffset=" + this.y + ", transformedText=" + this.r + ", textLayoutResultProvider=" + this.n + ")";
    }

    @Override // defpackage.im2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        long j2;
        if (p33Var.Y(ws0.j(j)) < ws0.t(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = ws0.y(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        us3 us3VarV = p33Var.v(j);
        int iMin = Math.min(us3VarV.j, ws0.t(j2));
        return v33Var.k0(iMin, us3VarV.t, qi1.j, new m6(this, v33Var, us3VarV, iMin));
    }
}
