package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b24 implements cx0 {
    public final float g;

    public b24(float f) {
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b24) && Float.compare(this.g, ((b24) obj).g) == 0;
    }

    @Override // defpackage.cx0
    public final float g(long j, j51 j51Var) {
        return this.g;
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    public final String toString() {
        return "CornerSize(size = " + this.g + ".px)";
    }
}
