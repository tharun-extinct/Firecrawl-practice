package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gd0 extends ou0 {
    public int c;
    public Object m;
    public /* synthetic */ Object q;
    public final /* synthetic */ hd0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(hd0 hd0Var, mu0 mu0Var) {
        super(mu0Var);
        this.w = hd0Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.q = obj;
        this.c |= Integer.MIN_VALUE;
        return this.w.c(null, this);
    }
}
