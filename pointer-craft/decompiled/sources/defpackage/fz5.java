package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fz5 {
    public static final nm0 g = new nm0(-1092249270, false, new at(11));

    public static final void g(int i, int i2) {
        if (i < 0 || i >= i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
        }
    }

    public static final boolean n(int i, int i2) {
        return i == i2;
    }

    public static final void r(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            l0.j(i3, du4.s(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            l0.u(du4.m(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void y(int i, int i2) {
        if (i < 0 || i > i2) {
            l0.p(du4.m(i, i2, "index: ", ", size: "));
        }
    }
}
