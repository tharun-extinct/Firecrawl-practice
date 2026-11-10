package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a10 extends zz4 implements bz1 {
    public final /* synthetic */ w10 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a10(w10 w10Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = w10Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        w10 w10Var = this.c;
        switch (b) {
            case 0:
                return new a10(w10Var, mu0Var, (byte) 0);
            case 1:
                return new a10(w10Var, mu0Var, (byte) 1);
            case 2:
                return new a10(w10Var, mu0Var, (byte) 2);
            default:
                return new a10(w10Var, mu0Var, (byte) 3);
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
        return ((a10) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        w10 w10Var = this.c;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    m70 m70Var = w10Var.i;
                    this.w = true;
                    if (m70Var.l(this) == px0Var) {
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
                    ew4 ew4Var = w10Var.D;
                    Boolean bool = Boolean.FALSE;
                    this.w = true;
                    ew4Var.c(bool, this);
                    if (og5Var == px0Var) {
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
                    if (w10Var.k(this) == px0Var) {
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
                    ew4 ew4Var2 = w10Var.D;
                    Boolean bool2 = Boolean.FALSE;
                    this.w = true;
                    ew4Var2.c(bool2, this);
                    if (og5Var == px0Var) {
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
