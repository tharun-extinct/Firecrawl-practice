package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hh4 extends zz4 implements bz1 {
    public final /* synthetic */ lh4 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ float p;
    public boolean q;
    public final /* synthetic */ nc5 s;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh4(Object obj, Object obj2, lh4 lh4Var, nc5 nc5Var, float f, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = obj;
        this.i = obj2;
        this.b = lh4Var;
        this.s = nc5Var;
        this.p = f;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        hh4 hh4Var = new hh4(this.c, this.i, this.b, this.s, this.p, mu0Var);
        hh4Var.w = obj;
        return hh4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((hh4) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        og5 og5Var = og5.g;
        lh4 lh4Var = this.b;
        if (!z) {
            js2.o(obj);
            ox0 ox0Var = (ox0) this.w;
            Object obj2 = this.c;
            Object obj3 = this.i;
            if (yf2.p(obj2, obj3)) {
                lh4Var.i = null;
                if (yf2.p(lh4Var.r.getValue(), obj2)) {
                    return og5Var;
                }
            } else {
                lh4Var.h();
            }
            boolean zP = yf2.p(obj2, obj3);
            float f = this.p;
            if (!zP) {
                nc5 nc5Var = this.s;
                nc5Var.s(obj2);
                nc5Var.c(0L);
                lh4Var.y.setValue(obj2);
                nc5Var.a(f);
            }
            lh4Var.e(f);
            if (lh4Var.c.a()) {
                m50.T(ox0Var, null, new dy(lh4Var, (mu0) null, (byte) 28), 3);
            } else {
                lh4Var.w = Long.MIN_VALUE;
            }
            this.q = true;
            Object objC = lh4Var.C(this);
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
        lh4Var.d();
        return og5Var;
    }
}
