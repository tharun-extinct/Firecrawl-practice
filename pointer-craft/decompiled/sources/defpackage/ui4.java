package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ui4 {
    public final /* synthetic */ byte g;

    public /* synthetic */ ui4(byte b) {
        this.g = b;
    }

    public static final void g(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final String r(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = oy0.g;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        y94.p(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }

    public static final boolean y(int i, int i2) {
        return i == i2;
    }
}
