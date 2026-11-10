package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nv4 implements oi {
    public final oi g;
    public final long y;

    public nv4(no1 no1Var, long j) {
        this.g = no1Var;
        this.y = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nv4)) {
            return false;
        }
        nv4 nv4Var = (nv4) obj;
        return nv4Var.y == this.y && yf2.p(nv4Var.g, this.g);
    }

    @Override // defpackage.oi
    public final jj5 g(te5 te5Var) {
        return new ov4(this.g.g(te5Var), this.y);
    }

    public final int hashCode() {
        return Long.hashCode(this.y) + (this.g.hashCode() * 31);
    }
}
