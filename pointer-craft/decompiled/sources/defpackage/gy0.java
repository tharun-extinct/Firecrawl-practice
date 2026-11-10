package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gy0 extends kk2 implements bz1 {
    public final /* synthetic */ j73 a;
    public final /* synthetic */ int c;
    public final /* synthetic */ no1 m;
    public final /* synthetic */ xy1 q;
    public final /* synthetic */ nc5 t;
    public final /* synthetic */ nm0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy0(nc5 nc5Var, j73 j73Var, no1 no1Var, xy1 xy1Var, nm0 nm0Var, int i) {
        super(2);
        this.t = nc5Var;
        this.a = j73Var;
        this.m = no1Var;
        this.q = xy1Var;
        this.w = nm0Var;
        this.c = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        y94.x(this.t, this.a, this.m, this.q, this.w, (h02) obj, aq2.J(this.c | 1));
        return og5.g;
    }
}
