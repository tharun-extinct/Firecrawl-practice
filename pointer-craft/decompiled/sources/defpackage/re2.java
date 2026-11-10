package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class re2 {
    public int[] g;
    public int y;

    public re2() {
        this.g = new int[10];
    }

    public int g(int i) {
        int i2 = this.y - 1;
        return i2 >= 0 ? this.g[i2] : i;
    }

    public void l(int i, int i2) {
        int[] iArr = this.g;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public void n(int i, int i2, int i3) {
        int i4 = this.y;
        int[] iArrCopyOf = this.g;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.g = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.y = i5;
    }

    public void r(int i) {
        int[] iArrCopyOf = this.g;
        if (this.y >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.g = iArrCopyOf;
        }
        int i2 = this.y;
        this.y = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    public void v(int i, int i2, int i3, int i4) {
        int i5 = this.y;
        int[] iArrCopyOf = this.g;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.g = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.y = i6;
    }

    public void x(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.g;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    l(i3, i4);
                }
            }
            l(i3 + 3, i2);
            x(i, i3);
            x(i3 + 6, i2);
        }
    }

    public int y() {
        int[] iArr = this.g;
        int i = this.y - 1;
        this.y = i;
        return iArr[i];
    }

    public re2(int i) {
        this.g = new int[i];
    }
}
