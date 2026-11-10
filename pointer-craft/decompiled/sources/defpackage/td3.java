package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class td3 extends zz4 implements bz1 {
    public final /* synthetic */ lh4 c;
    public final /* synthetic */ mc3 i;
    public byte q;
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td3(float f, lh4 lh4Var, mc3 mc3Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = f;
        this.c = lh4Var;
        this.i = mc3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new td3(this.w, this.c, this.i, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((td3) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        Object objG;
        byte b = this.q;
        og5 og5Var = og5.g;
        lh4 lh4Var = this.c;
        float f = this.w;
        px0 px0Var = px0.j;
        if (b == 0) {
            js2.o(obj);
            if (f > 0.0f) {
                this.q = (byte) 1;
                if (lh4Var.k(f, lh4Var.y.getValue(), this) != px0Var) {
                }
            }
            return px0Var;
        }
        if (b != 1) {
            if (b == 2) {
                js2.o(obj);
                return og5Var;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        if (f == 0.0f) {
            this.q = (byte) 2;
            nc5 nc5Var = lh4Var.v;
            if (nc5Var == null) {
                objG = og5Var;
            } else {
                Object value = lh4Var.r.getValue();
                mc3 mc3Var = this.i;
                if ((yf2.p(value, mc3Var) && yf2.p(lh4Var.y.getValue(), mc3Var)) || (objG = bc3.g(lh4Var.q, new k8(lh4Var, mc3Var, nc5Var, (mu0) null, (byte) 3), this)) != px0Var) {
                    objG = og5Var;
                }
            }
            if (objG == px0Var) {
                return px0Var;
            }
        }
        return og5Var;
    }
}
