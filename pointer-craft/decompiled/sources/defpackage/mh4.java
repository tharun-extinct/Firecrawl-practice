package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mh4 {
    public final byte[] g;
    public mh4 l;
    public boolean n;
    public int r;
    public final boolean v;
    public mh4 x;
    public int y;

    public mh4(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.g = bArr;
        this.y = i;
        this.r = i2;
        this.n = z;
        this.v = false;
    }

    public final mh4 g() {
        mh4 mh4Var = this.x;
        if (mh4Var == this) {
            mh4Var = null;
        }
        mh4 mh4Var2 = this.l;
        mh4Var2.getClass();
        mh4Var2.x = this.x;
        mh4 mh4Var3 = this.x;
        mh4Var3.getClass();
        mh4Var3.l = this.l;
        this.x = null;
        this.l = null;
        return mh4Var;
    }

    public final void n(mh4 mh4Var, int i) {
        mh4Var.getClass();
        byte[] bArr = mh4Var.g;
        if (!mh4Var.v) {
            l0.z("only owner can write");
            return;
        }
        int i2 = mh4Var.r;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (mh4Var.n) {
                t94.g();
                return;
            }
            int i4 = mh4Var.y;
            if (i3 - i4 > 8192) {
                t94.g();
                return;
            }
            pr.L(0, i4, i2, bArr, bArr);
            i2 = mh4Var.r - mh4Var.y;
            mh4Var.r = i2;
            mh4Var.y = 0;
        }
        int i5 = this.y;
        pr.L(i2, i5, i5 + i, this.g, bArr);
        mh4Var.r += i;
        this.y += i;
    }

    public final mh4 r() {
        this.n = true;
        return new mh4(this.g, this.y, this.r, true);
    }

    public final void y(mh4 mh4Var) {
        mh4Var.getClass();
        mh4Var.l = this;
        mh4Var.x = this.x;
        mh4 mh4Var2 = this.x;
        mh4Var2.getClass();
        mh4Var2.l = mh4Var;
        this.x = mh4Var;
    }

    public mh4() {
        this.g = new byte[8192];
        this.v = true;
        this.n = false;
    }
}
