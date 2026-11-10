package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h56 extends l56 {
    public final byte[] a;
    public final int m;
    public final int q;

    public h56(byte[] bArr, int i, int i2) {
        l56.a(i, i + i2, bArr.length);
        this.a = bArr;
        this.m = i;
        this.q = i2;
    }

    @Override // defpackage.l56
    public final byte g(int i) {
        int i2 = this.q;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.a[this.m + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(xi3.j("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(du4.m(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.l56
    public final boolean j(l56 l56Var) {
        boolean z = l56Var instanceof n56;
        if (!z && !(l56Var instanceof h56)) {
            return l56Var.j(this);
        }
        int iV = l56Var.v();
        int i = this.q;
        if (i > iV) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > l56Var.v()) {
            l0.u(du4.m(i, l56Var.v(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = this.a;
        int i2 = this.m;
        if (z) {
            return l56.q(i2, 0, i, bArr, ((n56) l56Var).a);
        }
        if (!(l56Var instanceof h56)) {
            return l56Var.x(0, i).equals(x(i2, i + i2));
        }
        h56 h56Var = (h56) l56Var;
        return l56.q(i2, h56Var.m, i, bArr, h56Var.a);
    }

    @Override // defpackage.l56
    public final void l(u56 u56Var) {
        u56Var.y(this.a, this.m, this.q);
    }

    @Override // defpackage.l56
    public final int n(int i, int i2) {
        return m76.g(i, this.a, this.m, i2);
    }

    @Override // defpackage.l56
    public final int v() {
        return this.q;
    }

    @Override // defpackage.l56
    public final l56 x(int i, int i2) {
        int iA = l56.a(i, i2, this.q);
        if (iA == 0) {
            return l56.t;
        }
        return new h56(this.a, this.m + i, iA);
    }

    @Override // defpackage.l56
    public final byte y(int i) {
        return this.a[this.m + i];
    }
}
