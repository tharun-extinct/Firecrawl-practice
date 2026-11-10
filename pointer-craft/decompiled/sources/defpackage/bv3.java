package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bv3 {
    public final int g;

    public /* synthetic */ bv3(int i) {
        this.g = i;
    }

    public static final /* synthetic */ bv3 g(int i) {
        return new bv3(i);
    }

    public static String r(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i != 3) {
            return i != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public static final boolean y(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bv3) {
            return this.g == ((bv3) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final /* synthetic */ int n() {
        return this.g;
    }

    public final String toString() {
        return r(this.g);
    }
}
