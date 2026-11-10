package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x63 extends zz4 implements cz1 {
    public /* synthetic */ float q;
    public final /* synthetic */ xy1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x63(xy1 xy1Var, mu0 mu0Var) {
        super(3, mu0Var);
        this.w = xy1Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        js2.o(obj);
        this.w.a(new Float(this.q));
        return og5.g;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        x63 x63Var = new x63(this.w, (mu0) obj3);
        x63Var.q = fFloatValue;
        og5 og5Var = og5.g;
        x63Var.u(og5Var);
        return og5Var;
    }
}
