package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t14 {
    public static final fa0 g;

    static {
        fa0 fa0Var = fa0.m;
        g = aj6.p("xn--");
    }

    public static int g(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int y(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        uo1.e("unexpected digit: ", i);
        return 0;
    }
}
