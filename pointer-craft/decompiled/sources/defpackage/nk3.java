package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nk3 extends zz4 implements bz1 {
    public final /* synthetic */ u21 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk3(u21 u21Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = u21Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        u21 u21Var = this.c;
        switch (b) {
            case 0:
                return new nk3(u21Var, mu0Var, (byte) 0);
            case 1:
                return new nk3(u21Var, mu0Var, (byte) 1);
            case 2:
                return new nk3(u21Var, mu0Var, (byte) 2);
            default:
                return new nk3(u21Var, mu0Var, (byte) 3);
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
            case 2:
                break;
        }
        return ((nk3) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        Object objX;
        Object objX2;
        byte b = this.q;
        u21 u21Var = this.c;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        mu0 mu0Var = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    int iM = u21Var.m() + 1;
                    this.w = true;
                    if (u21Var.x(iM, m50.b0(0.0f, 0.0f, null, 7), this) == px0Var) {
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
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    yo3 yo3Var = zo3.g;
                    if (u21Var.m() - 1 < 0 || (objX = u21Var.x(u21Var.m() - 1, m50.b0(0.0f, 0.0f, null, 7), this)) != px0Var) {
                        objX = og5Var;
                    }
                    if (objX == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 2:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    this.w = true;
                    yo3 yo3Var2 = zo3.g;
                    if (u21Var.m() + 1 >= u21Var.w() || (objX2 = u21Var.x(u21Var.m() + 1, m50.b0(0.0f, 0.0f, null, 7), this)) != px0Var) {
                        objX2 = og5Var;
                    }
                    if (objX2 == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            default:
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    this.w = true;
                    Object objP = xo3.p(u21Var, ub3.j, new kf(2, mu0Var, b2), this);
                    if (objP != px0Var) {
                        objP = og5Var;
                    }
                    if (objP == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z4) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
        }
    }
}
