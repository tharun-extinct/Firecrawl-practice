package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mr3 implements cx0 {
    public final float g;

    public mr3(float f) {
        this.g = f;
        if (f < 0.0f || f > 100.0f) {
            pc2.g("The percent should be in the range of [0, 100]");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr3) && Float.compare(this.g, ((mr3) obj).g) == 0;
    }

    @Override // defpackage.cx0
    public final float g(long j, j51 j51Var) {
        return (this.g / 100.0f) * cq4.y(j);
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    public final String toString() {
        return "CornerSize(size = " + this.g + "%)";
    }
}
