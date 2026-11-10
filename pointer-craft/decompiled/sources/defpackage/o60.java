package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o60 extends zz4 implements bz1 {
    public final /* synthetic */ lt b;
    public final /* synthetic */ gh3 c;
    public final /* synthetic */ p2 i;
    public /* synthetic */ Object q;
    public final /* synthetic */ p60 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(p60 p60Var, gh3 gh3Var, p2 p2Var, lt ltVar, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = p60Var;
        this.c = gh3Var;
        this.i = p2Var;
        this.b = ltVar;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        o60 o60Var = new o60(this.w, this.c, this.i, this.b, mu0Var);
        o60Var.q = obj;
        return o60Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((o60) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        js2.o(obj);
        ox0 ox0Var = (ox0) this.q;
        p2 p2Var = this.i;
        p60 p60Var = this.w;
        m50.T(ox0Var, null, new c(p60Var, this.c, p2Var, null, (byte) 10), 3);
        return m50.T(ox0Var, null, new q(p60Var, this.b, null, (byte) 10), 3);
    }
}
