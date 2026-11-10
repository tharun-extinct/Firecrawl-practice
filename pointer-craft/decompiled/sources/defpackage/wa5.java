package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wa5 implements vv3 {
    public final int j;

    public wa5(int i) {
        this.j = i;
    }

    @Override // defpackage.vv3
    public final long v(ne2 ne2Var, long j, fl2 fl2Var, long j2) {
        int i = (int) (j2 >> 32);
        int iN = ((ne2Var.n() - i) / 2) + ne2Var.g;
        if (iN < 0) {
            iN = ne2Var.g;
        } else if (iN + i > ((int) (j >> 32))) {
            iN = ne2Var.r - i;
        }
        int i2 = ne2Var.y - ((int) (j2 & 4294967295L));
        int i3 = this.j;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = ne2Var.n + i3;
        }
        return (((long) iN) << 32) | (((long) i4) & 4294967295L);
    }
}
