package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o25 extends zz4 implements bz1 {
    public final /* synthetic */ qu3 b;
    public final /* synthetic */ cz1 c;
    public final /* synthetic */ kx3 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o25(cz1 cz1Var, kx3 kx3Var, qu3 qu3Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = cz1Var;
        this.i = kx3Var;
        this.b = qu3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new o25(this.c, this.i, this.b, mu0Var, (byte) 0);
            default:
                return new o25(this.c, this.i, this.b, mu0Var, (byte) 1);
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
        return ((o25) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        qu3 qu3Var = this.b;
        kx3 kx3Var = this.i;
        cz1 cz1Var = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    wi3 wi3Var = new wi3(qu3Var.r);
                    this.w = true;
                    return cz1Var.x(kx3Var, wi3Var, this) == px0Var ? px0Var : og5Var;
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
                    wi3 wi3Var2 = new wi3(qu3Var.r);
                    this.w = true;
                    return cz1Var.x(kx3Var, wi3Var2, this) == px0Var ? px0Var : og5Var;
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
