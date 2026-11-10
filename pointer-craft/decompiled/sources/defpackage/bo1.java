package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bo1 extends ou0 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ do1 i;
    public do1 m;
    public zn1 q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo1(do1 do1Var, ou0 ou0Var) {
        super(ou0Var);
        this.i = do1Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        this.c = obj;
        this.b |= Integer.MIN_VALUE;
        return this.i.g(null, this);
    }
}
