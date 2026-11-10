package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class by3 {
    public final String g;
    public final Integer y;

    public by3(Integer num, String str) {
        this.g = str;
        this.y = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by3)) {
            return false;
        }
        by3 by3Var = (by3) obj;
        return this.g.equals(by3Var.g) && yf2.p(this.y, by3Var.y);
    }

    public final Integer g() {
        return this.y;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        Integer num = this.y;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ProMessage(origin=" + this.g + ", message=" + this.y + ")";
    }

    public final String y() {
        return this.g;
    }
}
