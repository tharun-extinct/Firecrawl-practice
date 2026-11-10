package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hn1 {
    public final float g;
    public final no1 y;

    public hn1(float f, no1 no1Var) {
        this.g = f;
        this.y = no1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn1)) {
            return false;
        }
        hn1 hn1Var = (hn1) obj;
        return Float.compare(this.g, hn1Var.g) == 0 && yf2.p(this.y, hn1Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (Float.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.g + ", animationSpec=" + this.y + ")";
    }
}
