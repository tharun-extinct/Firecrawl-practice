package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mu2 extends pl5 {
    public final ha3 y;

    public mu2() {
        ha3 ha3Var = ie2.g;
        this.y = new ha3();
    }

    @Override // defpackage.pl5
    public final void n() {
        ha3 ha3Var = this.y;
        int[] iArr = ha3Var.y;
        Object[] objArr = ha3Var.r;
        long[] jArr = ha3Var.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        xa3 xa3Var = (xa3) objArr[i4];
                        Object[] objArr2 = xa3Var.g;
                        int i6 = xa3Var.y;
                        for (int i7 = 0; i7 < i6; i7++) {
                            lu2 lu2Var = (lu2) objArr2[i7];
                            jb0 jb0Var = lu2Var.n;
                            if (jb0Var != null) {
                                jb0Var.cancel();
                            }
                            lu2Var.n = null;
                            y03 y03Var = (y03) lu2Var.g.t;
                            y03Var.t = true;
                            y03Var.j = false;
                            y03Var.g();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
