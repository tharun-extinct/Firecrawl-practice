package defpackage;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class sf {
    public int g;
    public Object n;
    public int r;
    public Object v;
    public int[] y;

    public int g(long j) {
        int i = this.g + 1;
        long[] jArr = (long[]) this.n;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            pr.N(jArr, jArr2, 0, 0, jArr.length);
            pr.P(0, 0, 14, this.y, iArr);
            this.n = jArr2;
            this.y = iArr;
        }
        int i3 = this.g;
        this.g = i3 + 1;
        int[] iArr2 = (int[]) this.v;
        int length2 = iArr2.length;
        if (this.r >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            pr.P(0, 0, 14, (int[]) this.v, iArr2);
            this.v = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.r;
        this.r = iArr2[i7];
        long[] jArr3 = (long[]) this.n;
        jArr3[i3] = j;
        this.y[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (yf2.k(jArr3[i8], j) <= 0) {
                break;
            }
            r(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public void n(int i) {
        this.g = i | this.g;
    }

    public void r(int i, int i2) {
        long[] jArr = (long[]) this.n;
        int[] iArr = this.y;
        int[] iArr2 = (int[]) this.v;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public float y(TypedArray typedArray, String str, int i, float f) {
        if (xq2.p((XmlPullParser) this.n, str)) {
            f = typedArray.getFloat(i, f);
        }
        n(typedArray.getChangingConfigurations());
        return f;
    }
}
