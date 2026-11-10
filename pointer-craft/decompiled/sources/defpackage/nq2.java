package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nq2 extends zz4 implements bz1 {
    public final /* synthetic */ qq2 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nq2(qq2 qq2Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = qq2Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        qq2 qq2Var = this.c;
        switch (b) {
            case 0:
                return new nq2(qq2Var, mu0Var, (byte) 0);
            case 1:
                return new nq2(qq2Var, mu0Var, (byte) 1);
            case 2:
                return new nq2(qq2Var, mu0Var, (byte) 2);
            case 3:
                return new nq2(qq2Var, mu0Var, (byte) 3);
            default:
                return new nq2(qq2Var, mu0Var, (byte) 4);
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
        }
        return ((nq2) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        qq2 qq2Var = this.c;
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
                qg qgVar = qq2Var.s;
                Float f = new Float(1.0f);
                this.w = true;
                return qgVar.v(this, f) == px0Var ? px0Var : og5Var;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    qg qgVar2 = qq2Var.b;
                    je2 je2Var = new je2(0L);
                    this.w = true;
                    if (qgVar2.v(this, je2Var) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                qq2Var.n(0L);
                qq2Var.j.setValue(Boolean.FALSE);
                return og5Var;
            case 2:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    qg qgVar3 = qq2Var.b;
                    this.w = true;
                    return qgVar3.x(this) == px0Var ? px0Var : og5Var;
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
                    qg qgVar4 = qq2Var.s;
                    this.w = true;
                    return qgVar4.x(this) == px0Var ? px0Var : og5Var;
                }
                if (z4) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z5 = this.w;
                if (!z5) {
                    js2.o(obj);
                    qg qgVar5 = qq2Var.s;
                    this.w = true;
                    return qgVar5.x(this) == px0Var ? px0Var : og5Var;
                }
                if (z5) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
