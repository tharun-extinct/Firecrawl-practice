package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wz0 extends ou0 {
    public int c;
    public kb5 m;
    public /* synthetic */ Object q;
    public final /* synthetic */ kb5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(kb5 kb5Var, ou0 ou0Var) {
        super(ou0Var);
        this.w = kb5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.q = obj;
        this.c |= Integer.MIN_VALUE;
        return this.w.c(this);
    }
}
