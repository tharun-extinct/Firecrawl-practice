package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kc5 extends zz4 implements bz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ nc5 i;
    public float q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc5(nc5 nc5Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = nc5Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        kc5 kc5Var = new kc5(this.i, mu0Var);
        kc5Var.c = obj;
        return kc5Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((kc5) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        final float fC;
        ox0 ox0Var;
        boolean z = this.w;
        if (!z) {
            js2.o(obj);
            ox0 ox0Var2 = (ox0) this.c;
            fC = kq2.C(ox0Var2.w());
            ox0Var = ox0Var2;
        } else {
            if (!z) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fC = this.q;
            ox0Var = (ox0) this.c;
            js2.o(obj);
        }
        while (k33.M(ox0Var)) {
            final nc5 nc5Var = this.i;
            xy1 xy1Var = new xy1() { // from class: jc5
                @Override // defpackage.xy1
                public final Object a(Object obj2) {
                    long jLongValue = ((Long) obj2).longValue();
                    nc5 nc5Var2 = nc5Var;
                    boolean zL = nc5Var2.l();
                    rp3 rp3Var = nc5Var2.j;
                    if (!zL) {
                        if (rp3Var.d() == Long.MIN_VALUE) {
                            rp3Var.e(jLongValue);
                            ((tp3) nc5Var2.g.g).setValue(Boolean.TRUE);
                        }
                        long jD = jLongValue - rp3Var.d();
                        float f = fC;
                        if (f != 0.0f) {
                            jD = k33.a0(jD / ((double) f));
                        }
                        nc5Var2.c(jD);
                        nc5Var2.j(jD, f == 0.0f);
                    }
                    return og5.g;
                }
            };
            this.c = ox0Var;
            this.q = fC;
            this.w = true;
            fx0 fx0Var = this.t;
            fx0Var.getClass();
            Object objI = br2.u(fx0Var).I(this, xy1Var);
            px0 px0Var = px0.j;
            if (objI == px0Var) {
                return px0Var;
            }
        }
        return og5.g;
    }
}
