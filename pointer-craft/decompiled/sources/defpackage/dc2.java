package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dc2 extends zz4 implements bz1 {
    public /* synthetic */ float q;

    public dc2() {
        super(2, null);
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        dc2 dc2Var = new dc2(2, mu0Var);
        dc2Var.q = ((Number) obj).floatValue();
        return dc2Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((dc2) b((mu0) obj2, Float.valueOf(((Number) obj).floatValue()))).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        js2.o(obj);
        return Boolean.valueOf(this.q > 0.0f);
    }
}
