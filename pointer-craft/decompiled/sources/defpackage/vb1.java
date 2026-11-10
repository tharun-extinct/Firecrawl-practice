package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vb1 implements Comparable {
    public final float j;

    public static int g(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static String r(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean y(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return g(this.j, ((vb1) obj).j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vb1) {
            return Float.compare(this.j, ((vb1) obj).j) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.j);
    }

    public final String toString() {
        return r(this.j);
    }
}
