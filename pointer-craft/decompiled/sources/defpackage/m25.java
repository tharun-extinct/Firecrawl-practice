package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m25 extends f84 implements bz1 {
    public /* synthetic */ Object a;
    public final /* synthetic */ xy1 c;
    public final /* synthetic */ ox0 m;
    public final /* synthetic */ kx3 q;
    public boolean t;
    public final /* synthetic */ cz1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m25(ox0 ox0Var, kx3 kx3Var, cz1 cz1Var, xy1 xy1Var, mu0 mu0Var) {
        super(mu0Var);
        this.m = ox0Var;
        this.q = kx3Var;
        this.w = cz1Var;
        this.c = xy1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        m25 m25Var = new m25(this.m, this.q, this.w, this.c, mu0Var);
        m25Var.a = obj;
        return m25Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((m25) b((mu0) obj2, (f05) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) throws Throwable {
        boolean z = this.t;
        if (!z) {
            js2.o(obj);
            f05 f05Var = (f05) this.a;
            this.t = true;
            Object objL = r25.l(f05Var, this.m, this.q, this.w, this.c, this);
            px0 px0Var = px0.j;
            if (objL == px0Var) {
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
}
