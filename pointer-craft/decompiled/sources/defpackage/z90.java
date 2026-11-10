package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z90 extends ca0 {
    public final int q;
    public final int w;

    public z90(byte[] bArr, int i, int i2) {
        super(bArr);
        ea0.y(i, i + i2, bArr.length);
        this.q = i;
        this.w = i2;
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final byte g(int i) {
        int i2 = this.w;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.m[this.q + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(xi3.j("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(du4.m(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.ca0
    public final byte l(int i) {
        return this.m[this.q + i];
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final int size() {
        return this.w;
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final void v(int i, byte[] bArr) {
        System.arraycopy(this.m, this.q, bArr, 0, i);
    }

    @Override // defpackage.ca0
    public final int x() {
        return this.q;
    }
}
