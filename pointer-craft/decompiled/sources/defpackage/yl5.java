package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yl5 extends pl5 {
    public final hb3 y;

    public yl5() {
        long[] jArr = ee4.g;
        this.y = new hb3();
    }

    @Override // defpackage.pl5
    public final void n() {
        hb3 hb3Var = this.y;
        hb3 hb3VarG = db6.g(hb3Var);
        Object[] objArr = hb3VarG.r;
        long[] jArr = hb3VarG.g;
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
                        xl5 xl5Var = (xl5) objArr[(i << 3) + i3];
                        xl5Var.r = true;
                        xl5 xl5Var2 = (xl5) hb3Var.q(xl5Var.g);
                        if (xl5Var2 != null) {
                            xl5Var2.y.g();
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
