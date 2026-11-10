package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u7 extends ou0 {
    public int c;
    public Object m;
    public /* synthetic */ Object q;
    public final /* synthetic */ v7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(v7 v7Var, mu0 mu0Var) {
        super(mu0Var);
        this.w = v7Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.q = obj;
        this.c |= Integer.MIN_VALUE;
        return this.w.c(null, this);
    }
}
