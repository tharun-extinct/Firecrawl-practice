package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ml4 implements ug1 {
    public final int g;
    public final int y;

    public ml4(int i, int i2) {
        this.g = i;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml4)) {
            return false;
        }
        ml4 ml4Var = (ml4) obj;
        return this.g == ml4Var.g && this.y == ml4Var.y;
    }

    @Override // defpackage.ug1
    public final void g(vg1 vg1Var) {
        int iW = xs2.w(this.g, 0, ((aq3) vg1Var.w).r());
        int iW2 = xs2.w(this.y, 0, ((aq3) vg1Var.w).r());
        if (iW < iW2) {
            vg1Var.x(iW, iW2);
        } else {
            vg1Var.x(iW2, iW);
        }
    }

    public final int hashCode() {
        return (this.g * 31) + this.y;
    }

    public final String toString() {
        return du4.q(this.g, this.y, "SetSelectionCommand(start=", ", end=", ")");
    }
}
