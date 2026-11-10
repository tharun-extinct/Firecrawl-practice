package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x83 {
    public final int g;
    public final int y;

    public x83(int i, int i2) {
        this.g = i;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x83)) {
            return false;
        }
        x83 x83Var = (x83) obj;
        return this.g == x83Var.g && this.y == x83Var.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Integer.hashCode(this.g) * 31);
    }

    public final String toString() {
        return du4.q(this.g, this.y, "Movement(x=", ", y=", ")");
    }
}
