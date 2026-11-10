package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q42 implements vv3 {
    public long a = 0;
    public final u6 j;
    public final cj3 t;

    public q42(u6 u6Var, cj3 cj3Var) {
        this.j = u6Var;
        this.t = cj3Var;
    }

    @Override // defpackage.vv3
    public final long v(ne2 ne2Var, long j, fl2 fl2Var, long j2) {
        long jG = this.t.g();
        if ((9223372034707292159L & jG) == 9205357640488583168L) {
            jG = this.a;
        }
        this.a = jG;
        return je2.n(je2.n(ne2Var.r(), k33.Y(jG)), this.j.g(j2, 0L, fl2Var));
    }
}
