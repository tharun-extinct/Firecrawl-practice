package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cb2 {
    public final int g;
    public final Object y;

    public cb2(int i, Object obj) {
        this.g = i;
        this.y = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb2)) {
            return false;
        }
        cb2 cb2Var = (cb2) obj;
        return this.g == cb2Var.g && yf2.p(this.y, cb2Var.y);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.g) * 31;
        Object obj = this.y;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.g + ", value=" + this.y + ')';
    }
}
