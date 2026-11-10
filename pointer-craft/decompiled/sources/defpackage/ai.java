package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ai extends kk2 implements bz1 {
    public final /* synthetic */ j73 a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ nm0 c;
    public final /* synthetic */ int i;
    public final /* synthetic */ ek1 m;
    public final /* synthetic */ dm1 q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ai(boolean z, j73 j73Var, ek1 ek1Var, dm1 dm1Var, String str, nm0 nm0Var, int i, int i2) {
        super(2);
        this.t = z;
        this.a = j73Var;
        this.m = ek1Var;
        this.q = dm1Var;
        this.w = str;
        this.c = nm0Var;
        this.i = i;
        this.b = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gp4.n(this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj, aq2.J(this.i | 1), this.b);
        return og5.g;
    }
}
