package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class wi0 extends yi0 {
    public final eg5 l;
    public final byte[] n;
    public final int v;
    public int x;

    public wi0(eg5 eg5Var, int i) {
        if (i < 0) {
            l0.u("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.n = new byte[iMax];
        this.v = iMax;
        this.l = eg5Var;
    }

    @Override // defpackage.yi0
    public final void E(byte b) throws IOException {
        if (this.x == this.v) {
            a0();
        }
        int i = this.x;
        this.x = i + 1;
        this.n[i] = b;
    }

    @Override // defpackage.yi0
    public final void F(int i, boolean z) throws IOException {
        b0(11);
        X(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.x;
        this.x = i2 + 1;
        this.n[i2] = b;
    }

    @Override // defpackage.yi0
    public final void G(int i, ea0 ea0Var) throws IOException {
        Q(i, 2);
        S(ea0Var.size());
        ca0 ca0Var = (ca0) ea0Var;
        N(ca0Var.m, ca0Var.x(), ca0Var.size());
    }

    @Override // defpackage.yi0
    public final void H(int i, int i2) throws IOException {
        b0(14);
        X(i, 5);
        V(i2);
    }

    @Override // defpackage.yi0
    public final void I(int i) throws IOException {
        b0(4);
        V(i);
    }

    @Override // defpackage.yi0
    public final void J(int i, long j) throws IOException {
        b0(18);
        X(i, 1);
        W(j);
    }

    @Override // defpackage.yi0
    public final void K(long j) throws IOException {
        b0(8);
        W(j);
    }

    @Override // defpackage.yi0
    public final void L(int i, int i2) throws IOException {
        b0(20);
        X(i, 0);
        if (i2 >= 0) {
            Y(i2);
        } else {
            Z(i2);
        }
    }

    @Override // defpackage.yi0
    public final void M(int i) throws IOException {
        if (i >= 0) {
            S(i);
        } else {
            U(i);
        }
    }

    @Override // defpackage.yi0
    public final void N(byte[] bArr, int i, int i2) throws IOException {
        c0(bArr, i, i2);
    }

    @Override // defpackage.yi0
    public final void O(int i, s0 s0Var, le4 le4Var) throws IOException {
        Q(i, 2);
        S(s0Var.g(le4Var));
        le4Var.v(s0Var, this.g);
    }

    @Override // defpackage.yi0
    public final void P(String str, int i) throws IOException {
        Q(i, 2);
        try {
            int length = str.length() * 3;
            int iA = yi0.A(length);
            int i2 = iA + length;
            int i3 = this.v;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iR = ei5.g.r(str, bArr, 0, length);
                S(iR);
                c0(bArr, 0, iR);
                return;
            }
            if (i2 > i3 - this.x) {
                a0();
            }
            int iA2 = yi0.A(str.length());
            int i4 = this.x;
            byte[] bArr2 = this.n;
            try {
                if (iA2 != iA) {
                    int iG = ei5.g(str);
                    Y(iG);
                    this.x = ei5.g.r(str, bArr2, this.x, iG);
                    return;
                }
                int i5 = i4 + iA2;
                this.x = i5;
                int iR2 = ei5.g.r(str, bArr2, i5, i3 - i5);
                this.x = i4;
                Y((iR2 - i4) - iA2);
                this.x = iR2;
            } catch (ci5 e) {
                this.x = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new ui0(e2);
            }
        } catch (ci5 e3) {
            D(str, e3);
        }
    }

    @Override // defpackage.yi0
    public final void Q(int i, int i2) throws IOException {
        S((i << 3) | i2);
    }

    @Override // defpackage.yi0
    public final void R(int i, int i2) throws IOException {
        b0(20);
        X(i, 0);
        Y(i2);
    }

    @Override // defpackage.yi0
    public final void S(int i) throws IOException {
        b0(5);
        Y(i);
    }

    @Override // defpackage.yi0
    public final void T(int i, long j) throws IOException {
        b0(20);
        X(i, 0);
        Z(j);
    }

    @Override // defpackage.yi0
    public final void U(long j) throws IOException {
        b0(10);
        Z(j);
    }

    public final void V(int i) {
        int i2 = this.x;
        int i3 = i2 + 1;
        this.x = i3;
        byte[] bArr = this.n;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.x = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.x = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.x = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void W(long j) {
        int i = this.x;
        int i2 = i + 1;
        this.x = i2;
        byte[] bArr = this.n;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.x = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.x = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.x = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.x = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.x = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.x = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.x = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void X(int i, int i2) {
        Y((i << 3) | i2);
    }

    public final void Y(int i) {
        boolean z = yi0.r;
        byte[] bArr = this.n;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.x;
                if (i2 == 0) {
                    this.x = i3 + 1;
                    ih5.q(bArr, i3, (byte) i);
                    return;
                } else {
                    this.x = i3 + 1;
                    ih5.q(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.x;
                if (i4 == 0) {
                    this.x = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.x = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void Z(long j) {
        boolean z = yi0.r;
        byte[] bArr = this.n;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.x;
                if (j2 == 0) {
                    this.x = i + 1;
                    ih5.q(bArr, i, (byte) j);
                    return;
                } else {
                    this.x = i + 1;
                    ih5.q(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.x;
                if (j3 == 0) {
                    this.x = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.x = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void a0() throws IOException {
        this.l.write(this.n, 0, this.x);
        this.x = 0;
    }

    public final void b0(int i) throws IOException {
        if (this.v - this.x < i) {
            a0();
        }
    }

    public final void c0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.x;
        int i4 = this.v;
        int i5 = i4 - i3;
        byte[] bArr2 = this.n;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.x += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.x = i4;
        a0();
        if (i7 > i4) {
            this.l.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.x = i7;
        }
    }
}
