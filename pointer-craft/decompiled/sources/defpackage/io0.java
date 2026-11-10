package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class io0 {
    public final int g;
    public final Integer y;

    public io0(int i, hg6 hg6Var, Integer num) {
        this.g = i;
        this.y = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io0)) {
            return false;
        }
        io0 io0Var = (io0) obj;
        return this.g == io0Var.g && yf2.p(null, null) && yf2.p(this.y, io0Var.y);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.g) * 31) + 0) * 31;
        Integer num = this.y;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.g + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.y + ")";
    }
}
