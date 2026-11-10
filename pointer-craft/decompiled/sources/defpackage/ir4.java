package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ir4 extends zz4 implements cz1 {
    public /* synthetic */ long q;
    public final /* synthetic */ kr4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir4(kr4 kr4Var, mu0 mu0Var) {
        super(3, mu0Var);
        this.w = kr4Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        float fD;
        js2.o(obj);
        long j = this.q;
        kr4 kr4Var = this.w;
        if (kr4Var.u == um3.j) {
            fD = Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            fD = kr4Var.b ? kr4Var.c.d() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
        }
        kr4Var.f.e(fD - kr4Var.o.d());
        return og5.g;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        long j = ((wi3) obj2).g;
        ir4 ir4Var = new ir4(this.w, (mu0) obj3);
        ir4Var.q = j;
        og5 og5Var = og5.g;
        ir4Var.u(og5Var);
        return og5Var;
    }
}
