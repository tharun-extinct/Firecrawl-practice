package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bs4 implements wr4 {
    public final cs4 g;
    public final ib0 y;

    public bs4(cs4 cs4Var, ib0 ib0Var) {
        this.g = cs4Var;
        this.y = ib0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bs4.class == obj.getClass()) {
            bs4 bs4Var = (bs4) obj;
            return yf2.p(this.g, bs4Var.g) && this.y == bs4Var.y;
        }
        return false;
    }

    public final void g() {
        ib0 ib0Var = this.y;
        if (ib0Var.h() instanceof th3) {
            ib0Var.j(ns4.j);
        }
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final cs4 y() {
        return this.g;
    }
}
