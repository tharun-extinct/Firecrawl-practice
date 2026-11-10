package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ee4 {
    public static final long[] g = {-9187201950435737345L, -1};
    public static final hb3 y = new hb3(0);

    public static final int g(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int n(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }

    public static final int r(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int y(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }
}
