package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class do4 extends o1 {
    public long g;
    public ib0 y;

    @Override // defpackage.o1
    public final boolean g(n1 n1Var) {
        co4 co4Var = (co4) n1Var;
        if (this.g >= 0) {
            return false;
        }
        long j = co4Var.b;
        if (j < co4Var.s) {
            co4Var.s = j;
        }
        this.g = j;
        return true;
    }

    @Override // defpackage.o1
    public final mu0[] y(n1 n1Var) {
        long j = this.g;
        this.g = -1L;
        this.y = null;
        return ((co4) n1Var).f(j);
    }
}
