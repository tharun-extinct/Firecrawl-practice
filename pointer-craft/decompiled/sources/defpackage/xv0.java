package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xv0 extends ou0 {
    public int c;
    public String m;
    public /* synthetic */ Object q;
    public final /* synthetic */ yv0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv0(yv0 yv0Var, ou0 ou0Var) {
        super(ou0Var);
        this.w = yv0Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.q = obj;
        this.c |= Integer.MIN_VALUE;
        return this.w.l(null, this);
    }
}
