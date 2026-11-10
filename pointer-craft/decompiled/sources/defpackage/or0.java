package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class or0 extends zz4 implements bz1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean i;
    public boolean q;
    public final /* synthetic */ qr0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or0(qr0 qr0Var, int i, boolean z, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = qr0Var;
        this.c = i;
        this.i = z;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new or0(this.w, this.c, this.i, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((or0) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        og5 og5Var = og5.g;
        if (!z) {
            js2.o(obj);
            e40 e40VarJ = this.w.j();
            if (e40VarJ != null) {
                this.q = true;
                Object objF0 = m50.f0(e40VarJ.g, new d40(this.i, e40VarJ, this.c, (mu0) null), this);
                px0 px0Var = px0.j;
                if (objF0 != px0Var) {
                    objF0 = og5Var;
                }
                if (objF0 == px0Var) {
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
        return og5Var;
    }
}
