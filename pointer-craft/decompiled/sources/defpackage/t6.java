package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t6 {
    public final int g;
    public final int y;
    public static final t6 r = new t6(0, 0);
    public static final t6 n = new t6(1, 1);

    public t6(int i, int i2) {
        this.g = i;
        this.y = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t6.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        t6 t6Var = (t6) obj;
        return this.g == t6Var.g && this.y == t6Var.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (Integer.hashCode(this.g) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) q6.y(this.g)) + ", vertical=" + ((Object) s6.y(this.y)) + ')';
    }
}
