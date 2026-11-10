package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wg extends kk2 implements bz1 {
    public final /* synthetic */ j73 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xy1 c;
    public final /* synthetic */ nm0 i;
    public final /* synthetic */ xy1 m;
    public final /* synthetic */ u6 q;
    public final /* synthetic */ byte s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wg(Object obj, j73 j73Var, xy1 xy1Var, u6 u6Var, String str, xy1 xy1Var2, nm0 nm0Var, int i, int i2) {
        super(2);
        this.t = obj;
        this.a = j73Var;
        this.m = xy1Var;
        this.q = u6Var;
        this.w = str;
        this.c = xy1Var2;
        this.i = nm0Var;
        this.b = i;
        this.s = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        y94.y(this.t, this.a, this.m, this.q, this.w, this.c, this.i, (h02) obj, aq2.J(this.b | 1), this.s);
        return og5.g;
    }
}
