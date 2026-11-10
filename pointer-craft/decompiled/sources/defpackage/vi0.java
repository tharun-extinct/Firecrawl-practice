package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vi0 extends yi0 {
    public final byte[] n;
    public final int v;
    public int x;

    public vi0(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.n = bArr;
        this.x = 0;
        this.v = i;
    }

    @Override // defpackage.yi0
    public final void E(byte b) throws ui0 {
        try {
            byte[] bArr = this.n;
            int i = this.x;
            this.x = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new ui0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.x), Integer.valueOf(this.v), 1), e);
        }
    }

    @Override // defpackage.yi0
    public final void F(int i, boolean z) throws ui0 {
        Q(i, 0);
        E(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.yi0
    public final void G(int i, ea0 ea0Var) throws ui0 {
        Q(i, 2);
        S(ea0Var.size());
        ca0 ca0Var = (ca0) ea0Var;
        N(ca0Var.m, ca0Var.x(), ca0Var.size());
    }

    @Override // defpackage.yi0
    public final void H(int i, int i2) throws ui0 {
        Q(i, 5);
        I(i2);
    }

    @Override // defpackage.yi0
    public final void I(int i) throws ui0 {
        try {
            byte[] bArr = this.n;
            int i2 = this.x;
            int i3 = i2 + 1;
            this.x = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.x = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.x = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.x = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new ui0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.x), Integer.valueOf(this.v), 1), e);
        }
    }

    @Override // defpackage.yi0
    public final void J(int i, long j) throws ui0 {
        Q(i, 1);
        K(j);
    }

    @Override // defpackage.yi0
    public final void K(long j) throws ui0 {
        try {
            byte[] bArr = this.n;
            int i = this.x;
            int i2 = i + 1;
            this.x = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.x = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.x = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.x = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e) {
            throw new ui0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.x), Integer.valueOf(this.v), 1), e);
        }
    }

    @Override // defpackage.yi0
    public final void L(int i, int i2) throws ui0 {
        Q(i, 0);
        M(i2);
    }

    @Override // defpackage.yi0
    public final void M(int i) throws ui0 {
        if (i >= 0) {
            S(i);
        } else {
            U(i);
        }
    }

    @Override // defpackage.yi0
    public final void N(byte[] bArr, int i, int i2) throws ui0 {
        try {
            System.arraycopy(bArr, i, this.n, this.x, i2);
            this.x += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new ui0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.x), Integer.valueOf(this.v), Integer.valueOf(i2)), e);
        }
    }

    @Override // defpackage.yi0
    public final void O(int i, s0 s0Var, le4 le4Var) throws ui0 {
        Q(i, 2);
        S(s0Var.g(le4Var));
        le4Var.v(s0Var, this.g);
    }

    @Override // defpackage.yi0
    public final void P(String str, int i) throws ui0 {
        Q(i, 2);
        int i2 = this.x;
        try {
            int iA = yi0.A(str.length() * 3);
            int iA2 = yi0.A(str.length());
            byte[] bArr = this.n;
            if (iA2 != iA) {
                S(ei5.g(str));
                this.x = ei5.g.r(str, bArr, this.x, V());
                return;
            }
            int i3 = i2 + iA2;
            this.x = i3;
            int iR = ei5.g.r(str, bArr, i3, V());
            this.x = i2;
            S((iR - i2) - iA2);
            this.x = iR;
        } catch (ci5 e) {
            this.x = i2;
            D(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new ui0(e2);
        }
    }

    @Override // defpackage.yi0
    public final void Q(int i, int i2) throws ui0 {
        S((i << 3) | i2);
    }

    @Override // defpackage.yi0
    public final void R(int i, int i2) throws ui0 {
        Q(i, 0);
        S(i2);
    }

    @Override // defpackage.yi0
    public final void S(int i) throws ui0 {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.x;
            byte[] bArr = this.n;
            if (i2 == 0) {
                this.x = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.x = i3 + 1;
                    bArr[i3] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new ui0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.x), Integer.valueOf(this.v), 1), e);
                }
            }
            throw new ui0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.x), Integer.valueOf(this.v), 1), e);
        }
    }

    @Override // defpackage.yi0
    public final void T(int i, long j) throws ui0 {
        Q(i, 0);
        U(j);
    }

    @Override // defpackage.yi0
    public final void U(long j) throws ui0 {
        boolean z = yi0.r;
        byte[] bArr = this.n;
        if (!z || V() < 10) {
            while (true) {
                long j2 = j & (-128);
                int i = this.x;
                if (j2 == 0) {
                    this.x = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        this.x = i + 1;
                        bArr[i] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new ui0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.x), Integer.valueOf(this.v), 1), e);
                    }
                }
                throw new ui0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.x), Integer.valueOf(this.v), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i2 = this.x;
            if (j3 == 0) {
                this.x = i2 + 1;
                ih5.q(bArr, i2, (byte) j);
                return;
            } else {
                this.x = i2 + 1;
                ih5.q(bArr, i2, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
        }
    }

    public final int V() {
        return this.v - this.x;
    }
}
