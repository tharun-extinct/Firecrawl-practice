package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ni3 {
    public static final Object[] g = new Object[0];
    public static final xa3 y = new xa3(0);

    public static final void g(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            cf6.t("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void y(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            cf6.l("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            cf6.t("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        cf6.t("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
