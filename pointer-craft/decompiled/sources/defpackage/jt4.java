package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jt4 extends yw4 {
    public float r;

    public jt4(float f, long j) {
        super(j);
        this.r = f;
    }

    @Override // defpackage.yw4
    public final void g(yw4 yw4Var) {
        yw4Var.getClass();
        this.r = ((jt4) yw4Var).r;
    }

    @Override // defpackage.yw4
    public final yw4 y(long j) {
        return new jt4(this.r, j);
    }
}
