package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zu0 extends zz4 implements bz1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ v04 c;
    public final /* synthetic */ int i;
    public boolean q;
    public final /* synthetic */ av0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu0(av0 av0Var, v04 v04Var, int i, int i2, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = av0Var;
        this.c = v04Var;
        this.i = i;
        this.b = i2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new zu0(this.w, this.c, this.i, this.b, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((zu0) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        if (!z) {
            js2.o(obj);
            k40 k40VarV = this.w.V();
            if (k40VarV != null) {
                boolean z2 = this.c.m;
                int i = this.i;
                if (z2) {
                    i = -i;
                }
                int i2 = -this.b;
                this.q = true;
                Object objJ = k40VarV.j(i, i2, this);
                px0 px0Var = px0.j;
                if (objJ == px0Var) {
                    return px0Var;
                }
            }
        } else {
            if (!z) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        return og5.g;
    }
}
