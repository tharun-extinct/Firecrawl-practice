package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d95 {
    public final int g;
    public final /* synthetic */ e95 j;
    public long l = Long.MIN_VALUE;
    public d95 n;
    public final m r;
    public long v;
    public long x;
    public final nv y;

    public d95(e95 e95Var, int i, nv nvVar, m mVar) {
        this.j = e95Var;
        this.g = i;
        this.y = nvVar;
        this.r = mVar;
    }

    public final void g(long j, long j2, long j3, long j4, float[] fArr) {
        g64 g64VarX = iy5.x(j, j2, j3, j4, this.j.x, this.y, fArr);
        if (g64VarX == null) {
            return;
        }
        this.r.a(g64VarX);
    }

    public final void y() {
        e95 e95Var = this.j;
        ha3 ha3Var = e95Var.g;
        int i = this.g;
        d95 d95Var = (d95) ha3Var.l(i);
        if (d95Var != null) {
            if (d95Var == this) {
                d95 d95Var2 = this.n;
                this.n = null;
                if (d95Var2 != null) {
                    int iN = ha3Var.n(i);
                    Object[] objArr = ha3Var.r;
                    Object obj = objArr[iN];
                    ha3Var.y[iN] = i;
                    objArr[iN] = d95Var2;
                    return;
                }
                um2 um2VarV = k33.V(this.y.j);
                if (um2VarV.J()) {
                    m44 rectManager = ((ba) xm2.g(um2VarV)).getRectManager();
                    rectManager.getClass();
                    if (um2VarV.c != -4) {
                        bm bmVar = rectManager.r;
                        int iN2 = rectManager.n(um2VarV);
                        long[] jArr = (long[]) bmVar.y;
                        int i2 = iN2 + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iN3 = ha3Var.n(i);
            Object[] objArr2 = ha3Var.r;
            Object obj2 = objArr2[iN3];
            ha3Var.y[iN3] = i;
            objArr2[iN3] = d95Var;
            while (true) {
                d95 d95Var3 = d95Var.n;
                if (d95Var3 == null) {
                    break;
                }
                if (d95Var3 == this) {
                    d95Var.n = this.n;
                    this.n = null;
                    return;
                }
                d95Var = d95Var3;
            }
        }
        d95 d95Var4 = e95Var.y;
        if (d95Var4 == this) {
            e95Var.y = d95Var4.n;
            this.n = null;
            return;
        }
        d95 d95Var5 = d95Var4 != null ? d95Var4.n : null;
        while (true) {
            d95 d95Var6 = d95Var4;
            d95Var4 = d95Var5;
            if (d95Var4 == null) {
                return;
            }
            if (d95Var4 == this) {
                if (d95Var6 != null) {
                    d95Var6.n = d95Var4.n;
                }
                this.n = null;
                return;
            }
            d95Var5 = d95Var4.n;
        }
    }
}
