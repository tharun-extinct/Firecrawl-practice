package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wa0 extends bd0 {
    public final bz1 q;

    public wa0(bz1 bz1Var, fx0 fx0Var, int i, f70 f70Var) {
        super(bz1Var, fx0Var, i, f70Var);
        this.q = bz1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.bd0, defpackage.ad0
    public final Object v(ez3 ez3Var, mu0 mu0Var) {
        va0 va0Var;
        if (mu0Var instanceof va0) {
            va0Var = (va0) mu0Var;
            int i = va0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                va0Var.c = i - Integer.MIN_VALUE;
            } else {
                va0Var = new va0(this, (ou0) mu0Var);
            }
        } else {
            va0Var = new va0(this, (ou0) mu0Var);
        }
        Object obj = va0Var.q;
        int i2 = va0Var.c;
        if (i2 == 0) {
            js2.o(obj);
            va0Var.m = ez3Var;
            va0Var.c = 1;
            Object objV = super.v(ez3Var, va0Var);
            Object obj2 = px0.j;
            if (objV == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ez3Var = va0Var.m;
            js2.o(obj);
        }
        if (ez3Var.q.d()) {
            return og5.g;
        }
        l0.z("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // defpackage.bd0, defpackage.ad0
    public final ad0 x(fx0 fx0Var, int i, f70 f70Var) {
        return new wa0(this.q, fx0Var, i, f70Var);
    }
}
