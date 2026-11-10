package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wx extends zz4 implements bz1 {
    public final /* synthetic */ gy c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx(gy gyVar, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = gyVar;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        gy gyVar = this.c;
        switch (b) {
            case 0:
                return new wx(gyVar, mu0Var, (byte) 0);
            case 1:
                return new wx(gyVar, mu0Var, (byte) 1);
            default:
                return new wx(gyVar, mu0Var, (byte) 2);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                ((wx) b(mu0Var, ox0Var)).u(og5Var);
                break;
            case 1:
                ((wx) b(mu0Var, ox0Var)).u(og5Var);
                break;
            default:
                ((wx) b(mu0Var, ox0Var)).u(og5Var);
                break;
        }
        return px0Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        px0 px0Var = px0.j;
        gy gyVar = this.c;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        js2.o(obj);
                        l0.x();
                    }
                    return null;
                }
                js2.o(obj);
                ew4 ew4Var = gyVar.T().z;
                vx vxVar = new vx(gyVar, (byte) 0);
                this.w = true;
                ew4Var.r(vxVar, this);
                return px0Var;
            case 1:
                boolean z2 = this.w;
                if (z2) {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        js2.o(obj);
                    }
                    return null;
                }
                js2.o(obj);
                f34 f34Var = gyVar.W().l;
                vx vxVar2 = new vx(gyVar, b2);
                this.w = true;
                if (f34Var.j.r(vxVar2, this) == px0Var) {
                    return px0Var;
                }
                l0.x();
                return null;
            default:
                boolean z3 = this.w;
                if (z3) {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        js2.o(obj);
                    }
                    return null;
                }
                js2.o(obj);
                f34 f34Var2 = gyVar.W().b;
                vx vxVar3 = new vx(gyVar, (byte) 2);
                this.w = true;
                if (f34Var2.j.r(vxVar3, this) == px0Var) {
                    return px0Var;
                }
                l0.x();
                return null;
        }
    }
}
