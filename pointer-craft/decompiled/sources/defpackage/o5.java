package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o5 {
    public byte g;
    public int n;
    public Object r;
    public int y;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof o5)) {
                return false;
            }
            o5 o5Var = (o5) obj;
            byte b = this.g;
            if (b != o5Var.g) {
                return false;
            }
            if (b != 8 || Math.abs(this.n - this.y) != 1 || this.n != o5Var.y || this.y != o5Var.n) {
                if (this.n != o5Var.n || this.y != o5Var.y) {
                    return false;
                }
                Object obj2 = this.r;
                Object obj3 = o5Var.r;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.g * 31) + this.y) * 31) + this.n;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        byte b = this.g;
        if (b == 1) {
            str = "add";
        } else if (b == 2) {
            str = "rm";
        } else if (b != 4) {
            str = b != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.y);
        sb.append("c:");
        sb.append(this.n);
        sb.append(",p:");
        sb.append(this.r);
        sb.append("]");
        return sb.toString();
    }
}
