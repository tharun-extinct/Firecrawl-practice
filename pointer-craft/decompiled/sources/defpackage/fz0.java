package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fz0 extends zz4 implements bz1 {
    public final /* synthetic */ xy1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean i;
    public boolean q;
    public final /* synthetic */ x94 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(mu0 mu0Var, xy1 xy1Var, x94 x94Var, boolean z, boolean z2) {
        super(2, mu0Var);
        this.w = x94Var;
        this.c = z;
        this.i = z2;
        this.b = xy1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new fz0(mu0Var, this.b, this.w, this.c, this.i);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((fz0) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        if (z) {
            if (z) {
                js2.o(obj);
                return obj;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        xy1 xy1Var = this.b;
        x94 x94Var = this.w;
        boolean z2 = this.i;
        boolean z3 = this.c;
        iz0 iz0Var = new iz0(null, xy1Var, x94Var, z2, z3);
        this.q = true;
        Object objP = x94Var.p(z3, iz0Var, this);
        px0 px0Var = px0.j;
        return objP == px0Var ? px0Var : objP;
    }
}
