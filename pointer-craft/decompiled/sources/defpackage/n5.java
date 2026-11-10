package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n5 {
    public final int g;
    public final String y;

    public n5(String str, int i) {
        this.g = i;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return this.g == n5Var.g && this.y.equals(n5Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (Integer.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "AdapterColor(color=" + this.g + ", name=" + this.y + ")";
    }
}
