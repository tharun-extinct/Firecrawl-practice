package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class if4 extends zz4 implements bz1 {
    public final /* synthetic */ float c;
    public /* synthetic */ Object q;
    public final /* synthetic */ r54 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if4(r54 r54Var, float f, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = r54Var;
        this.c = f;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        if4 if4Var = new if4(this.w, this.c, mu0Var);
        if4Var.q = obj;
        return if4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        if4 if4Var = (if4) b((mu0) obj2, (pf4) obj);
        og5 og5Var = og5.g;
        if4Var.u(og5Var);
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        js2.o(obj);
        this.w.j = ((pf4) this.q).g(this.c);
        return og5.g;
    }
}
