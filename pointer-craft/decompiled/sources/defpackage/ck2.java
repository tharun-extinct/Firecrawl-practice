package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ck2 implements nf1 {
    public final bk2 g;

    public ck2(bk2 bk2Var) {
        this.g = bk2Var;
    }

    @Override // defpackage.nf1, defpackage.oi
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final qj5 g(te5 te5Var) {
        int[] iArr;
        Object[] objArr;
        bk2 bk2Var = this.g;
        ha3 ha3Var = bk2Var.y;
        ga3 ga3Var = new ga3(ha3Var.v + 2);
        ha3 ha3Var2 = new ha3(ha3Var.v);
        int[] iArr2 = ha3Var.y;
        Object[] objArr2 = ha3Var.r;
        long[] jArr = ha3Var.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            ak2 ak2Var = (ak2) objArr2[i5];
                            ga3Var.g(i6);
                            ha3Var2.t(i6, new pj5((vi) te5Var.g.a(ak2Var.g), ak2Var.y));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!ha3Var.g(0)) {
            int i7 = ga3Var.y;
            if (i7 < 0) {
                cf6.t("Index must be between 0 and size");
                throw null;
            }
            ga3Var.y(i7 + 1);
            int[] iArr3 = ga3Var.g;
            int i8 = ga3Var.y;
            if (i8 != 0) {
                pr.M(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            ga3Var.y++;
        }
        if (!ha3Var.g(bk2Var.g)) {
            ga3Var.g(bk2Var.g);
        }
        int i9 = ga3Var.y;
        if (i9 != 0) {
            int[] iArr4 = ga3Var.g;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new qj5(ga3Var, ha3Var2, bk2Var.g, dg1.r);
    }
}
