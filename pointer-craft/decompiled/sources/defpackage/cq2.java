package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cq2 extends o73 {
    public final zu4 g;
    public final zu4 r;
    public final zu4 y;

    public cq2(zu4 zu4Var, zu4 zu4Var2, zu4 zu4Var3) {
        this.g = zu4Var;
        this.y = zu4Var2;
        this.r = zu4Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq2)) {
            return false;
        }
        cq2 cq2Var = (cq2) obj;
        return this.g.equals(cq2Var.g) && this.y.equals(cq2Var.y) && this.r.equals(cq2Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        dq2 dq2Var = (dq2) i73Var;
        dq2Var.o = this.g;
        dq2Var.f = this.y;
        dq2Var.k = this.r;
    }

    @Override // defpackage.o73
    public final i73 l() {
        dq2 dq2Var = new dq2();
        dq2Var.o = this.g;
        dq2Var.f = this.y;
        dq2Var.k = this.r;
        return dq2Var;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.g + ", placementSpec=" + this.y + ", fadeOutSpec=" + this.r + ")";
    }
}
