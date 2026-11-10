package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eg0 extends zz4 implements bz1 {
    public final /* synthetic */ ng0 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg0(ng0 ng0Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = ng0Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        ng0 ng0Var = this.c;
        switch (b) {
            case 0:
                return new eg0(ng0Var, mu0Var, (byte) 0);
            default:
                return new eg0(ng0Var, mu0Var, (byte) 1);
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
        return ((eg0) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        ng0 ng0Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return obj;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                dg0 dg0Var = new dg0(ng0Var.p, (byte) 0);
                this.w = true;
                Object objM = ue5.M(dg0Var, this);
                return objM == px0Var ? px0Var : objM;
            default:
                boolean z2 = this.w;
                if (z2) {
                    if (z2) {
                        js2.o(obj);
                        return og5.g;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                iv4 iv4Var = ng0Var.f;
                if (iv4Var != null) {
                    this.w = true;
                    if (v70.m(iv4Var, this) == px0Var) {
                        return px0Var;
                    }
                    return og5.g;
                }
                return null;
        }
    }
}
