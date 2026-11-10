package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zf2 extends e84 {
    public final /* synthetic */ bz1 a;
    public final /* synthetic */ mu0 m;
    public byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf2(mu0 mu0Var, mu0 mu0Var2, bz1 bz1Var) {
        super(mu0Var);
        this.a = bz1Var;
        this.m = mu0Var2;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.t;
        if (b != 0) {
            if (b != 1) {
                l0.z("This coroutine had already completed");
                return null;
            }
            this.t = (byte) 2;
            js2.o(obj);
            return obj;
        }
        this.t = (byte) 1;
        js2.o(obj);
        bz1 bz1Var = this.a;
        bz1Var.getClass();
        ue5.f(2, bz1Var);
        return bz1Var.l(this.m, this);
    }
}
