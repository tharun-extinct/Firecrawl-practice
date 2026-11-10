package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lr1 extends zz4 implements bz1 {
    public final /* synthetic */ er1 c;
    public final /* synthetic */ dz3 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr1(er1 er1Var, dz3 dz3Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = er1Var;
        this.i = dz3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new lr1(this.c, this.i, mu0Var, (byte) 0);
            default:
                return new lr1(this.c, this.i, mu0Var, (byte) 1);
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
        return ((lr1) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        dz3 dz3Var = this.i;
        er1 er1Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    kr1 kr1Var = new kr1(dz3Var, (byte) 0);
                    this.w = true;
                    return er1Var.r(kr1Var, this) == px0Var ? px0Var : og5Var;
                }
                if (z) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    kr1 kr1Var2 = new kr1(dz3Var, (byte) 1);
                    this.w = true;
                    return er1Var.r(kr1Var2, this) == px0Var ? px0Var : og5Var;
                }
                if (z2) {
                    js2.o(obj);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
