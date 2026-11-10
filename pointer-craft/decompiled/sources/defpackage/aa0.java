package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aa0 extends da0 {
    public final int q;
    public final int w;

    public aa0(byte[] bArr, int i, int i2) {
        super(bArr);
        da0.y(i, i + i2, bArr.length);
        this.q = i;
        this.w = i2;
    }

    @Override // defpackage.da0
    public final byte g(int i) {
        int i2 = this.w;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.t[this.q + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(xi3.j("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(du4.m(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.da0
    public final byte l(int i) {
        return this.t[this.q + i];
    }

    @Override // defpackage.da0
    public final int size() {
        return this.w;
    }

    @Override // defpackage.da0
    public final void v(int i, byte[] bArr) {
        System.arraycopy(this.t, this.q, bArr, 0, i);
    }

    @Override // defpackage.da0
    public final int x() {
        return this.q;
    }
}
