package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oi3 {
    public final int g;
    public final Integer y;

    public oi3(int i, Integer num) {
        this.g = i;
        this.y = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi3)) {
            return false;
        }
        oi3 oi3Var = (oi3) obj;
        return this.g == oi3Var.g && yf2.p(this.y, oi3Var.y);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.g) * 31;
        Integer num = this.y;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.g + ", dataOffset=" + this.y + ")";
    }
}
