package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ag2 extends ou0 {
    public byte m;
    public final /* synthetic */ bz1 q;
    public final /* synthetic */ mu0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag2(mu0 mu0Var, fx0 fx0Var, bz1 bz1Var, mu0 mu0Var2) {
        super(mu0Var, fx0Var);
        this.q = bz1Var;
        this.w = mu0Var2;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.m;
        if (b != 0) {
            if (b != 1) {
                l0.z("This coroutine had already completed");
                return null;
            }
            this.m = (byte) 2;
            js2.o(obj);
            return obj;
        }
        this.m = (byte) 1;
        js2.o(obj);
        bz1 bz1Var = this.q;
        bz1Var.getClass();
        ue5.f(2, bz1Var);
        return bz1Var.l(this.w, this);
    }
}
