package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oh2 {
    public final Integer g;
    public final Object y;

    public oh2(Integer num, Object obj) {
        this.g = num;
        this.y = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh2)) {
            return false;
        }
        oh2 oh2Var = (oh2) obj;
        return this.g.equals(oh2Var.g) && yf2.p(this.y, oh2Var.y);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.g.hashCode() * 31;
        Object obj = this.y;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.g + ", right=" + this.y + ")";
    }
}
