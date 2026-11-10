package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cr {
    public int g;
    public int n;
    public Object r;
    public long y;

    public cr(us1 us1Var, long j, int i, int i2) {
        this.r = us1Var;
        this.y = j;
        this.g = i;
        this.n = i2;
    }

    public tf6 g(rs1 rs1Var, boolean z, int i, int i2, int i3, int i4) {
        if (!rs1Var.y) {
            return null;
        }
        ((us1) this.r).getClass();
        return null;
    }

    public rs1 y(boolean z, int i, long j, ee2 ee2Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = this.g;
        int i6 = this.n;
        long j2 = this.y;
        us1 us1Var = (us1) this.r;
        int i7 = i3 + i4;
        if (ee2Var == null) {
            return new rs1(true, true);
        }
        long j3 = ee2Var.g;
        us1Var.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) < 0) {
            return new rs1(true, true);
        }
        if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j3 >> 32)) < 0)) {
            return z2 ? new rs1(true, true) : new rs1(true, y(z, 0, ee2.g(ws0.t(j2), (((int) (j & 4294967295L)) - i6) - i4), new ee2(ee2.g(((int) (j3 >> 32)) - i5, (int) (j3 & 4294967295L))), i2 + 1, i7, 0, true, false).y);
        }
        return new rs1(false, false);
    }

    public cr(h66 h66Var) {
        h66Var.getClass();
    }
}
