package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bj0 {
    public final int g;
    public final int y;

    public bj0(int i, int i2) {
        this.g = i;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj0)) {
            return false;
        }
        bj0 bj0Var = (bj0) obj;
        return this.g == bj0Var.g && this.y == bj0Var.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Integer.hashCode(this.g) * 31);
    }

    public final String toString() {
        return du4.q(this.g, this.y, "CollectionInfo(rowCount=", ", columnCount=", ")");
    }
}
