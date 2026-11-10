package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hb5 extends zz4 implements cz1 {
    public final /* synthetic */ vu3 b;
    public final /* synthetic */ my1 c;
    public final /* synthetic */ xy1 i;
    public boolean q;
    public /* synthetic */ kx3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb5(my1 my1Var, xy1 xy1Var, vu3 vu3Var, mu0 mu0Var) {
        super(3, mu0Var);
        this.c = my1Var;
        this.i = xy1Var;
        this.b = vu3Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        kx3 kx3Var = this.w;
        boolean z = this.q;
        if (!z) {
            js2.o(obj);
            gb5 gb5Var = new gb5(kx3Var, this.c, this.i, this.b, null);
            this.w = null;
            this.q = true;
            Object objB = k33.B(gb5Var, this);
            px0 px0Var = px0.j;
            if (objB == px0Var) {
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
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        long j = ((wi3) obj2).g;
        xy1 xy1Var = this.i;
        vu3 vu3Var = this.b;
        hb5 hb5Var = new hb5(this.c, xy1Var, vu3Var, (mu0) obj3);
        hb5Var.w = (kx3) obj;
        return hb5Var.u(og5.g);
    }
}
