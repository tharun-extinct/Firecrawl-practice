package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class in1 {
    public final Object g;
    public final nm0 y;

    public in1(wr4 wr4Var, nm0 nm0Var) {
        this.g = wr4Var;
        this.y = nm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof in1) {
            in1 in1Var = (in1) obj;
            return yf2.p(this.g, in1Var.g) && this.y == in1Var.y;
        }
        return false;
    }

    public final Object g() {
        return this.g;
    }

    public final int hashCode() {
        Object obj = this.g;
        return this.y.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final Object r() {
        return this.g;
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.g + ", transition=" + this.y + ')';
    }

    public final cz1 y() {
        return this.y;
    }
}
