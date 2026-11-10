package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l70 extends ou0 {
    public /* synthetic */ Object m;
    public final /* synthetic */ m70 q;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l70(m70 m70Var, ou0 ou0Var) {
        super(ou0Var);
        this.q = m70Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.m = obj;
        this.w |= Integer.MIN_VALUE;
        Object objG = this.q.G(null, 0, 0L, this);
        return objG == px0.j ? objG : new ld0(objG);
    }
}
