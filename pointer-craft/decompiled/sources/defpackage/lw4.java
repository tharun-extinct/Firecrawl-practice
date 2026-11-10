package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lw4 extends yw4 {
    public int n;
    public y0 r;
    public int v;

    public lw4(long j, y0 y0Var) {
        super(j);
        this.r = y0Var;
    }

    @Override // defpackage.yw4
    public final void g(yw4 yw4Var) {
        synchronized (yf2.s) {
            yw4Var.getClass();
            this.r = ((lw4) yw4Var).r;
            this.n = ((lw4) yw4Var).n;
            this.v = ((lw4) yw4Var).v;
        }
    }

    @Override // defpackage.yw4
    public final yw4 y(long j) {
        return new lw4(j, this.r);
    }
}
