package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wb1 implements cx0 {
    public final float g;

    public wb1(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb1) && vb1.y(this.g, ((wb1) obj).g);
    }

    @Override // defpackage.cx0
    public final float g(long j, j51 j51Var) {
        return j51Var.e(this.g);
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    public final String toString() {
        return "CornerSize(size = " + this.g + ".dp)";
    }
}
