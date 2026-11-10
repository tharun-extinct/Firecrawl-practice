package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xu2 {
    public static final float n;
    public static final float r;
    public static final float y;
    public final float g;

    static {
        g(0.0f);
        g(0.5f);
        y = 0.5f;
        g(-1.0f);
        r = -1.0f;
        g(1.0f);
        n = 1.0f;
    }

    public static void g(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            nc2.y("topRatio should be in [0..1] range or -1");
        }
    }

    public static String y(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == y) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == r) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == n) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xu2) {
            return Float.compare(this.g, ((xu2) obj).g) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g);
    }

    public final String toString() {
        return y(this.g);
    }
}
