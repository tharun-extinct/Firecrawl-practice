package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yn2 extends zz4 implements bz1 {
    public final /* synthetic */ ao2 c;
    public final /* synthetic */ sk2 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn2(ao2 ao2Var, sk2 sk2Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = ao2Var;
        this.i = sk2Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        sk2 sk2Var = this.i;
        ao2 ao2Var = this.c;
        switch (b) {
            case 0:
                return new yn2(ao2Var, sk2Var, mu0Var, (byte) 0);
            case 1:
                return new yn2(ao2Var, sk2Var, mu0Var, (byte) 1);
            default:
                return new yn2(ao2Var, sk2Var, mu0Var, (byte) 2);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((yn2) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        sk2 sk2Var = this.i;
        ao2 ao2Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                el2 el2VarZ = ao2Var.y.z();
                this.w = true;
                Object objF = pw5.F(this, new m(el2VarZ, sk2Var, (byte) 28), el2VarZ.g, false, true);
                if (objF != px0Var) {
                    objF = og5Var;
                }
                return objF == px0Var ? px0Var : og5Var;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    return ao2Var.y.z().g(new sk2[]{sk2Var}, this) == px0Var ? px0Var : og5Var;
                }
                if (z2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    wh4 wh4Var = ao2Var.n;
                    this.w = true;
                    return wh4Var.l(sk2Var, this) == px0Var ? px0Var : og5Var;
                }
                if (z3) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
