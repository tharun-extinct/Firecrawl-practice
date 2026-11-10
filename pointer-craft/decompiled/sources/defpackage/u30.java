package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u30 extends zz4 implements bz1 {
    public final /* synthetic */ er1 c;
    public final /* synthetic */ s30 i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u30(er1 er1Var, s30 s30Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = er1Var;
        this.i = s30Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        s30 s30Var = this.i;
        er1 er1Var = this.c;
        switch (b) {
            case 0:
                return new u30(er1Var, s30Var, mu0Var, (byte) 0);
            default:
                return new u30(er1Var, s30Var, mu0Var, (byte) 1);
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
        return ((u30) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        byte b = this.q;
        s30 s30Var = this.i;
        er1 er1Var = this.c;
        px0 px0Var = px0.j;
        mu0 mu0Var = null;
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
                mt mtVar = new mt(s30Var, mu0Var, (byte) 2);
                this.w = true;
                Object objN = ue5.N(er1Var, mtVar, this);
                return objN == px0Var ? px0Var : objN;
            default:
                boolean z2 = this.w;
                byte b2 = 0;
                if (!z2) {
                    js2.o(obj);
                    u30 u30Var = new u30(er1Var, s30Var, mu0Var, b2);
                    this.w = true;
                    obj = br2.E(7000L, u30Var, this);
                    if (obj == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return Boolean.valueOf(obj != null);
        }
    }
}
