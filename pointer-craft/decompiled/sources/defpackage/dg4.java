package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dg4 extends zz4 implements bz1 {
    public /* synthetic */ Object q;
    public final /* synthetic */ long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg4(long j, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = j;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        dg4 dg4Var = new dg4(this.w, mu0Var);
        dg4Var.q = obj;
        return dg4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        dg4 dg4Var = (dg4) b((mu0) obj2, (lg4) obj);
        og5 og5Var = og5.g;
        dg4Var.u(og5Var);
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        js2.o(obj);
        ng4 ng4Var = ((lg4) this.q).g;
        ng4Var.n(ng4Var.m, this.w, 1);
        return og5.g;
    }
}
