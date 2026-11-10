package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oj5 implements jj5 {
    public final long a;
    public final lj5 j;
    public final long m = 0;
    public final y64 t;

    public oj5(lj5 lj5Var, y64 y64Var) {
        this.j = lj5Var;
        this.t = y64Var;
        this.a = ((long) (lj5Var.x() + lj5Var.n())) * 1000000;
    }

    @Override // defpackage.jj5
    public final boolean g() {
        return true;
    }

    @Override // defpackage.jj5
    public final vi l(long j, vi viVar, vi viVar2, vi viVar3) {
        return this.j.l(r(j), viVar, viVar2, t(j, viVar, viVar3, viVar2));
    }

    public final long r(long j) {
        long j2 = this.m;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.a;
        long j5 = j3 / j4;
        return (this.t == y64.j || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public final vi t(long j, vi viVar, vi viVar2, vi viVar3) {
        long j2 = this.m;
        long j3 = j + j2;
        long j4 = this.a;
        return j3 > j4 ? this.j.v(j4 - j2, viVar, viVar3, viVar2) : viVar2;
    }

    @Override // defpackage.jj5
    public final vi v(long j, vi viVar, vi viVar2, vi viVar3) {
        return this.j.v(r(j), viVar, viVar2, t(j, viVar, viVar3, viVar2));
    }

    @Override // defpackage.jj5
    public final long y(vi viVar, vi viVar2, vi viVar3) {
        return Long.MAX_VALUE;
    }
}
