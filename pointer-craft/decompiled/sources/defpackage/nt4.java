package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nt4 extends yw4 {
    public Object r;

    public nt4(long j, Object obj) {
        super(j);
        this.r = obj;
    }

    @Override // defpackage.yw4
    public final void g(yw4 yw4Var) {
        yw4Var.getClass();
        this.r = ((nt4) yw4Var).r;
    }

    @Override // defpackage.yw4
    public final yw4 y(long j) {
        return new nt4(j, this.r);
    }
}
