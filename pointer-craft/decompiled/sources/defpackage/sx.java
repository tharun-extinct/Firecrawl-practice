package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sx extends zz4 implements bz1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gy q;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(gy gyVar, int i, int i2, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = gyVar;
        this.w = i;
        this.c = i2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new sx(this.q, this.w, this.c, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        sx sxVar = (sx) b((mu0) obj2, (ox0) obj);
        og5 og5Var = og5.g;
        sxVar.u(og5Var);
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        js2.o(obj);
        this.q.T().w(this.w, this.c, false);
        return og5.g;
    }
}
