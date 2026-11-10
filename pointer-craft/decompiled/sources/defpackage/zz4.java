package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zz4 extends ou0 implements lz1 {
    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    public zz4(int i, mu0 mu0Var) {
        super(mu0Var);
        this.m = i;
    }

    @Override // defpackage.lz1
    public final int r() {
        return this.m;
    }

    @Override // defpackage.ix
    public final String toString() {
        if (this.j != null) {
            return super.toString();
        }
        v54.g.getClass();
        return w54.g(this);
    }
}
