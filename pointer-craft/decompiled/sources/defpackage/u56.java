package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class u56 {
    public static final boolean v = va6.v;
    public et4 g;
    public int n;
    public final int r;
    public final byte[] y;

    public u56(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            l0.u(du4.m(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.y = bArr;
        this.n = 0;
        this.r = i;
    }

    public static int c(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int i(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void a(int i, int i2) {
        m(i << 3);
        m(i2);
    }

    public final void g(byte b) throws ui0 {
        int i = this.n;
        try {
            int i2 = i + 1;
            try {
                this.y[i] = b;
                this.n = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new ui0(i, this.r, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void j(int i) throws ui0 {
        if (i >= 0) {
            m(i);
        } else {
            w(i);
        }
    }

    public final void l(int i, int i2) throws ui0 {
        m(i << 3);
        j(i2);
    }

    public final void m(int i) {
        int i2;
        int i3 = this.n;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.y;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.n = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new ui0(i2, this.r, 1, e);
                }
            }
            throw new ui0(i2, this.r, 1, e);
        }
    }

    public final void n(int i) throws ui0 {
        int i2 = this.n;
        try {
            byte[] bArr = this.y;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.n = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new ui0(i2, this.r, 4, e);
        }
    }

    public final void q(int i, long j) throws ui0 {
        m(i << 3);
        w(j);
    }

    public final void r(int i, int i2) throws ui0 {
        m((i << 3) | 5);
        n(i2);
    }

    public final void t(int i, int i2) {
        m((i << 3) | i2);
    }

    public final void v(int i, long j) throws ui0 {
        m((i << 3) | 1);
        x(j);
    }

    public final void w(long j) throws ui0 {
        int i;
        int i2 = this.n;
        boolean z = v;
        byte[] bArr = this.y;
        int i3 = this.r;
        if (!z || i3 - i2 < 10) {
            int i4 = i2;
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i5 = i4 + 1;
                try {
                    bArr[i4] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i4 = i5;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i5;
                    throw new ui0(i, i3, 1, e);
                }
            }
            i = i4 + 1;
            try {
                bArr[i4] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new ui0(i, i3, 1, e);
            }
        } else {
            int i6 = i2;
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                va6.r.c(bArr, va6.x + ((long) i6), (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i6++;
            }
            i = i6 + 1;
            va6.r.c(bArr, va6.x + ((long) i6), (byte) j3);
        }
        this.n = i;
    }

    public final void x(long j) throws ui0 {
        int i = this.n;
        try {
            byte[] bArr = this.y;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.n = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new ui0(i, this.r, 8, e);
        }
    }

    public final void y(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.y, this.n, i2);
            this.n += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new ui0(this.n, this.r, i2, e);
        }
    }
}
