package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class px extends zz4 implements bz1 {
    public final /* synthetic */ char c;
    public boolean q;
    public final /* synthetic */ gy w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(gy gyVar, char c, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = gyVar;
        this.c = c;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new px(this.w, this.c, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((px) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        og5 og5Var = og5.g;
        if (!z) {
            js2.o(obj);
            vl vlVar = this.w.k0;
            mu0 mu0Var = null;
            if (vlVar == null) {
                yf2.Y("popupWindowManager");
                throw null;
            }
            String strValueOf = String.valueOf(this.c);
            this.q = true;
            x21 x21Var = na1.g;
            Object objF0 = m50.f0(c21.a, new yx((Object) vlVar, false, (Object) strValueOf, mu0Var, (byte) 3), this);
            px0 px0Var = px0.j;
            if (objF0 != px0Var) {
                objF0 = og5Var;
            }
            if (objF0 == px0Var) {
                return px0Var;
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
