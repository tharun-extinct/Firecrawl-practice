package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dy0 extends kk2 implements bz1 {
    public final /* synthetic */ j73 a;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte i;
    public final /* synthetic */ no1 m;
    public final /* synthetic */ String q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ nm0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dy0(Object obj, j73 j73Var, no1 no1Var, String str, nm0 nm0Var, int i, int i2) {
        super(2);
        this.t = obj;
        this.a = j73Var;
        this.m = no1Var;
        this.q = str;
        this.w = nm0Var;
        this.c = i;
        this.i = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        y94.l(this.t, this.a, this.m, this.q, this.w, (h02) obj, aq2.J(this.c | 1), this.i);
        return og5.g;
    }
}
