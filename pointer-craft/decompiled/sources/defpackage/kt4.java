package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kt4 extends yw4 {
    public int r;

    public kt4(int i, long j) {
        super(j);
        this.r = i;
    }

    @Override // defpackage.yw4
    public final void g(yw4 yw4Var) {
        yw4Var.getClass();
        this.r = ((kt4) yw4Var).r;
    }

    @Override // defpackage.yw4
    public final yw4 y(long j) {
        return new kt4(this.r, j);
    }
}
