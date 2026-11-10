package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rz3 {
    public static final rz3 r = new rz3(0.0f, new ki0(0.0f, 0.0f));
    public final float g;
    public final ki0 y;

    public rz3(float f, ki0 ki0Var) {
        this.g = f;
        this.y = ki0Var;
        if (Float.isNaN(f)) {
            l0.u("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz3)) {
            return false;
        }
        rz3 rz3Var = (rz3) obj;
        return this.g == rz3Var.g && yf2.p(this.y, rz3Var.y);
    }

    public final int hashCode() {
        return (this.y.hashCode() + (Float.hashCode(this.g) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.g + ", range=" + this.y + ", steps=0)";
    }
}
