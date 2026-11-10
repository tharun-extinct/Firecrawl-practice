package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n56 extends l56 {
    public final byte[] a;

    public n56(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.l56
    public final byte g(int i) {
        return this.a[i];
    }

    @Override // defpackage.l56
    public final boolean j(l56 l56Var) {
        boolean z = l56Var instanceof n56;
        byte[] bArr = this.a;
        if (z) {
            return Arrays.equals(bArr, ((n56) l56Var).a);
        }
        boolean z2 = l56Var instanceof h56;
        if (!z2) {
            return l56Var.j(this);
        }
        int iV = l56Var.v();
        int length = bArr.length;
        if (length > iV) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > l56Var.v()) {
            l0.u(du4.m(length, l56Var.v(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        if (z) {
            return l56.q(0, 0, length, bArr, ((n56) l56Var).a);
        }
        if (!z2) {
            return l56Var.x(0, length).equals(x(0, length));
        }
        h56 h56Var = (h56) l56Var;
        return l56.q(0, h56Var.m, length, bArr, h56Var.a);
    }

    @Override // defpackage.l56
    public final void l(u56 u56Var) {
        byte[] bArr = this.a;
        u56Var.y(bArr, 0, bArr.length);
    }

    @Override // defpackage.l56
    public final int n(int i, int i2) {
        return m76.g(i, this.a, 0, i2);
    }

    @Override // defpackage.l56
    public final int v() {
        return this.a.length;
    }

    @Override // defpackage.l56
    public final l56 x(int i, int i2) {
        byte[] bArr = this.a;
        int iA = l56.a(0, i2, bArr.length);
        return iA == 0 ? l56.t : new h56(bArr, 0, iA);
    }

    @Override // defpackage.l56
    public final byte y(int i) {
        return this.a[i];
    }
}
