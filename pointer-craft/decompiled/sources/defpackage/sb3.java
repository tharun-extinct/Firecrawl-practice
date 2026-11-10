package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sb3 {
    public static final void g(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            r(i, size);
        }
    }

    private static final void n(int i) {
        throw new IndexOutOfBoundsException(du4.w(i, "fromIndex (", ") is less than 0."));
    }

    private static final void r(int i, int i2) {
        throw new IndexOutOfBoundsException(du4.q(i, i2, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void v(int i, int i2) {
        throw new IndexOutOfBoundsException(du4.q(i, i2, "toIndex (", ") is more than than the list size (", ")"));
    }

    private static final void x(int i, int i2) {
        throw new IllegalArgumentException(du4.q(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }

    public static final void y(List list, int i, int i2) {
        if (i > i2) {
            x(i, i2);
        }
        if (i < 0) {
            n(i);
        }
        if (i2 > list.size()) {
            v(i2, list.size());
        }
    }
}
