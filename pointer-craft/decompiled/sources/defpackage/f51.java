package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f51 implements ug1 {
    public final int g;
    public final int y;

    public f51(int i, int i2) {
        this.g = i;
        this.y = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        nc2.g("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f51)) {
            return false;
        }
        f51 f51Var = (f51) obj;
        return this.g == f51Var.g && this.y == f51Var.y;
    }

    @Override // defpackage.ug1
    public final void g(vg1 vg1Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.g; i2++) {
            int i3 = i + 1;
            int i4 = vg1Var.t;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(vg1Var.y((i4 - i3) + (-1))) && Character.isLowSurrogate(vg1Var.y(vg1Var.t - i3))) ? i + 2 : i3;
        }
        int iR = 0;
        for (int i5 = 0; i5 < this.y; i5++) {
            int i6 = iR + 1;
            int i7 = vg1Var.a;
            aq3 aq3Var = (aq3) vg1Var.w;
            if (i7 + i6 >= aq3Var.r()) {
                iR = aq3Var.r() - vg1Var.a;
                break;
            }
            iR = (Character.isHighSurrogate(vg1Var.y((vg1Var.a + i6) + (-1))) && Character.isLowSurrogate(vg1Var.y(vg1Var.a + i6))) ? iR + 2 : i6;
        }
        int i8 = vg1Var.a;
        vg1Var.g(i8, iR + i8);
        int i9 = vg1Var.t;
        vg1Var.g(i9 - i, i9);
    }

    public final int hashCode() {
        return (this.g * 31) + this.y;
    }

    public final String toString() {
        return du4.q(this.g, this.y, "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}
