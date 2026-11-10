package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class or4 {
    public static final mr4 g(mr4 mr4Var) {
        if (!(mr4Var instanceof mr4)) {
            mr4Var = null;
        }
        if (mr4Var != null) {
            return mr4Var;
        }
        qo0.y("Inconsistent composition");
        l0.x();
        return null;
    }

    public static final int n(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final int r(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((c02) arrayList.get(i4)).g;
            if (i5 < 0) {
                i5 += i2;
            }
            int iF = yf2.f(i5, i);
            if (iF < 0) {
                i3 = i4 + 1;
            } else {
                if (iF <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void v() {
        throw new ConcurrentModificationException();
    }

    public static final void x(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int y(ArrayList arrayList, int i, int i2) {
        int iR = r(arrayList, i, i2);
        return iR >= 0 ? iR : -(iR + 1);
    }
}
