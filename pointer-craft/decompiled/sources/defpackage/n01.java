package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n01 extends ou0 {
    public int c;
    public s54 m;
    public /* synthetic */ Object q;
    public final /* synthetic */ p01 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n01(p01 p01Var, ou0 ou0Var) {
        super(ou0Var);
        this.w = p01Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.q = obj;
        this.c |= Integer.MIN_VALUE;
        return this.w.a(null, false, this);
    }
}
