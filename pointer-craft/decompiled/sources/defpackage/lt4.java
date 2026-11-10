package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lt4 extends yw4 {
    public long r;

    public lt4(long j, long j2) {
        super(j);
        this.r = j2;
    }

    @Override // defpackage.yw4
    public final void g(yw4 yw4Var) {
        yw4Var.getClass();
        this.r = ((lt4) yw4Var).r;
    }

    @Override // defpackage.yw4
    public final yw4 y(long j) {
        return new lt4(j, this.r);
    }
}
