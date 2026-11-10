package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ms1 extends zz4 implements bz1 {
    public /* synthetic */ int q;

    public ms1() {
        super(2, null);
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        ms1 ms1Var = new ms1(2, mu0Var);
        ms1Var.q = ((Number) obj).intValue();
        return ms1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((ms1) b((mu0) obj2, Integer.valueOf(((Number) obj).intValue()))).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        int i = this.q;
        js2.o(obj);
        return Boolean.valueOf(i > 0);
    }
}
