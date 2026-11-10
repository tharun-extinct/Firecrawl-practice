package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eq3 extends zz4 implements xy1 {
    public final /* synthetic */ xy1 c;
    public final /* synthetic */ gq3 q;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq3(gq3 gq3Var, String str, xy1 xy1Var, mu0 mu0Var) {
        super(1, mu0Var);
        this.q = gq3Var;
        this.w = str;
        this.c = xy1Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        String str = this.w;
        xy1 xy1Var = this.c;
        return new eq3(this.q, str, xy1Var, (mu0) obj).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        js2.o(obj);
        cc4 cc4VarO = this.q.y.O(this.w);
        try {
            Object objA = this.c.a(cc4VarO);
            c93.h(cc4VarO, null);
            return objA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c93.h(cc4VarO, th);
                throw th2;
            }
        }
    }
}
