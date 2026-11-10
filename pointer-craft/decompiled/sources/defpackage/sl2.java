package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sl2 extends zz4 implements bz1 {
    public final /* synthetic */ tl2 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl2(tl2 tl2Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = tl2Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        tl2 tl2Var = this.c;
        switch (b) {
            case 0:
                return new sl2(tl2Var, mu0Var, (byte) 0);
            default:
                return new sl2(tl2Var, mu0Var, (byte) 1);
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
        }
        return ((sl2) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        px0 px0Var = px0.j;
        tl2 tl2Var = this.c;
        og5 og5Var = og5.g;
        mu0 mu0Var = null;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        js2.o(obj);
                    }
                    return null;
                }
                js2.o(obj);
                xl2 xl2Var = tl2Var.o0;
                if (xl2Var == null) {
                    return og5Var;
                }
                f34 f34Var = xl2Var.x;
                rc rcVar = new rc(tl2Var, (byte) 7);
                this.w = true;
                if (f34Var.j.r(rcVar, this) == px0Var) {
                    return px0Var;
                }
                up.q();
                return null;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    xx1 xx1VarB = tl2Var.b();
                    sl2 sl2Var = new sl2(tl2Var, mu0Var, (byte) 0);
                    this.w = true;
                    xx1VarB.n();
                    Object objA = br2.A(xx1VarB.q, wt2.m, sl2Var, this);
                    if (objA != px0Var) {
                        objA = og5Var;
                    }
                    if (objA == px0Var) {
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
        }
    }
}
