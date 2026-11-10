package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ak2 {
    public final Float g;
    public cg1 y;

    public ak2(Float f, cg1 cg1Var) {
        this.g = f;
        this.y = cg1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ak2)) {
            return false;
        }
        ak2 ak2Var = (ak2) obj;
        return ak2Var.g.equals(this.g) && yf2.p(ak2Var.y, this.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + du4.r(0, this.g.hashCode() * 31, 31);
    }
}
