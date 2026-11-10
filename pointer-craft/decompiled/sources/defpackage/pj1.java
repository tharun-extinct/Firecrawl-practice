package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pj1 extends kk2 implements bz1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ int m;
    public final /* synthetic */ nc5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj1(nc5 nc5Var, my1 my1Var, int i) {
        super(2);
        this.t = nc5Var;
        this.a = my1Var;
        this.m = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iJ = aq2.J(this.m | 1);
        yj1.g(this.t, this.a, (h02) obj, iJ);
        return og5.g;
    }
}
