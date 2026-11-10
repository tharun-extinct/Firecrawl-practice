package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ip3 {
    public final kd g;
    public final int r;
    public final int y;

    public ip3(kd kdVar, int i, int i2) {
        this.g = kdVar;
        this.y = i;
        this.r = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ip3) {
            ip3 ip3Var = (ip3) obj;
            if (this.g == ip3Var.g && this.y == ip3Var.y && this.r == ip3Var.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.r) + du4.r(this.y, this.g.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.g);
        sb.append(", startIndex=");
        sb.append(this.y);
        sb.append(", endIndex=");
        return xi3.m(sb, this.r, ")");
    }
}
