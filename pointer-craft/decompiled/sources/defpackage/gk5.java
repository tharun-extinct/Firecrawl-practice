package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gk5 implements im2 {
    public final s55 g;
    public final my1 n;
    public final wb5 r;
    public final int y;

    public gk5(s55 s55Var, int i, wb5 wb5Var, my1 my1Var) {
        this.g = s55Var;
        this.y = i;
        this.r = wb5Var;
        this.n = my1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gk5) {
            gk5 gk5Var = (gk5) obj;
            if (this.g == gk5Var.g && this.y == gk5Var.y && this.r.equals(gk5Var.r) && yf2.p(this.n, gk5Var.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.r.hashCode() + du4.r(this.y, this.g.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.g + ", cursorOffset=" + this.y + ", transformedText=" + this.r + ", textLayoutResultProvider=" + this.n + ")";
    }

    @Override // defpackage.im2
    public final u33 v(v33 v33Var, p33 p33Var, long j) {
        us3 us3VarV = p33Var.v(ws0.y(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(us3VarV.t, ws0.j(j));
        return v33Var.k0(us3VarV.j, iMin, qi1.j, new h22(this, us3VarV, iMin));
    }
}
