package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ze2 extends zz4 implements bz1 {
    public final /* synthetic */ af2 c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze2(af2 af2Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = af2Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new ze2(this.c, mu0Var, (byte) 0);
            default:
                return new ze2(this.c, mu0Var, (byte) 1);
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
        return ((ze2) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        mu0 mu0Var = null;
        switch (this.q) {
            case 0:
                px0 px0Var = px0.j;
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.c.g();
                    af2 af2Var = this.c;
                    this.w = true;
                    ib0 ib0Var = new ib0(1, pw5.o(this));
                    ib0Var.o();
                    synchronized (af2Var.m) {
                        af2Var.q = (byte) 20;
                        af2Var.c = ib0Var;
                    }
                    ib0Var.k(new ce(af2Var, (byte) 4));
                    if (ib0Var.z() == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
            default:
                px0 px0Var2 = px0.j;
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    af2 af2Var2 = this.c;
                    this.w = true;
                    af2Var2.getClass();
                    if (br2.E(5000L, new ze2(af2Var2, mu0Var, (byte) 0), this) == px0Var2) {
                        return px0Var2;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5.g;
        }
    }
}
