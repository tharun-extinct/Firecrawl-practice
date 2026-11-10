package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class k94 {
    public static final vf1 g = new vf1(new lc3((byte) 6), (byte) 0);
    public static final m94 r;
    public static final m94 y;

    static {
        long j = jj0.j;
        y = new m94(true, Float.NaN, j);
        r = new m94(false, Float.NaN, j);
    }

    public static m94 g(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = jj0.j;
        }
        if (vb1.y(f, Float.NaN) && tf5.g(j, jj0.j)) {
            return z ? y : r;
        }
        return new m94(z, f, j);
    }
}
