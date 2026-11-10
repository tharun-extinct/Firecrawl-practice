package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class or1 extends zz4 implements xy1 {
    public final /* synthetic */ u54 c;
    public boolean q;
    public final /* synthetic */ gr1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or1(mu0 mu0Var, gr1 gr1Var, u54 u54Var) {
        super(1, mu0Var);
        this.w = gr1Var;
        this.c = u54Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        return new or1((mu0) obj, this.w, this.c).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        u54 u54Var = this.c;
        if (!z) {
            js2.o(obj);
            ky2 ky2Var = a11.o;
            Object obj2 = u54Var.j;
            if (obj2 == ky2Var) {
                obj2 = null;
            }
            this.q = true;
            Object objC = this.w.c(obj2, this);
            px0 px0Var = px0.j;
            if (objC == px0Var) {
                return px0Var;
            }
        } else {
            if (!z) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        u54Var.j = null;
        return og5.g;
    }
}
