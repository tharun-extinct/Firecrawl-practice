package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v63 extends zz4 implements bz1 {
    public final /* synthetic */ xo4 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v63(xo4 xo4Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = xo4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        xo4 xo4Var = this.c;
        switch (b) {
            case 0:
                return new v63(xo4Var, mu0Var, (byte) 0);
            case 1:
                return new v63(xo4Var, mu0Var, (byte) 1);
            case 2:
                return new v63(xo4Var, mu0Var, (byte) 2);
            case 3:
                return new v63(xo4Var, mu0Var, (byte) 3);
            case 4:
                return new v63(xo4Var, mu0Var, (byte) 4);
            case 5:
                return new v63(xo4Var, mu0Var, (byte) 5);
            case 6:
                return new v63(xo4Var, mu0Var, (byte) 6);
            default:
                return new v63(xo4Var, mu0Var, (byte) 7);
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
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((v63) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        xo4 xo4Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.w = true;
                    return xo4Var.v(this) == px0Var ? px0Var : og5Var;
                }
                if (z) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    this.w = true;
                    return xo4Var.r(this) == px0Var ? px0Var : og5Var;
                }
                if (z2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    this.w = true;
                    return xo4Var.x(this) == px0Var ? px0Var : og5Var;
                }
                if (z3) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    this.w = true;
                    return xo4Var.r(this) == px0Var ? px0Var : og5Var;
                }
                if (z4) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.w;
                if (!z5) {
                    js2.o(obj);
                    this.w = true;
                    return xo4Var.y(this) == px0Var ? px0Var : og5Var;
                }
                if (z5) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.w;
                if (!z6) {
                    js2.o(obj);
                    this.w = true;
                    return xo4Var.x(this) == px0Var ? px0Var : og5Var;
                }
                if (z6) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.w;
                if (!z7) {
                    js2.o(obj);
                    this.w = true;
                    return xo4Var.y(this) == px0Var ? px0Var : og5Var;
                }
                if (z7) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z8 = this.w;
                if (!z8) {
                    js2.o(obj);
                    this.w = true;
                    return xo4Var.v(this) == px0Var ? px0Var : og5Var;
                }
                if (z8) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
