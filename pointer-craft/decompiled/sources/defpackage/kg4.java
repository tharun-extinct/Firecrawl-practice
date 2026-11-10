package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kg4 extends zz4 implements bz1 {
    public /* synthetic */ Object b;
    public long c;
    public boolean i;
    public final /* synthetic */ t54 p;
    public ng4 q;
    public final /* synthetic */ ng4 s;
    public final /* synthetic */ long u;
    public t54 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg4(ng4 ng4Var, t54 t54Var, long j, mu0 mu0Var) {
        super(2, mu0Var);
        this.s = ng4Var;
        this.p = t54Var;
        this.u = j;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        kg4 kg4Var = new kg4(this.s, this.p, this.u, mu0Var);
        kg4Var.b = obj;
        return kg4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((kg4) b((mu0) obj2, (lg4) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        ng4 ng4Var;
        t54 t54Var;
        ng4 ng4Var2;
        long j;
        boolean z = this.i;
        um3 um3Var = um3.t;
        byte b = 1;
        if (!z) {
            js2.o(obj);
            lg4 lg4Var = (lg4) this.b;
            ng4Var = this.s;
            z7 z7Var = new z7(ng4Var, lg4Var, b);
            bq1 bq1Var = ng4Var.r;
            t54 t54Var2 = this.p;
            long j2 = t54Var2.j;
            um3 um3Var2 = ng4Var.n;
            long j3 = this.u;
            float fV = ng4Var.v(um3Var2 == um3Var ? vj5.n(j3) : vj5.v(j3));
            this.b = ng4Var;
            this.q = ng4Var;
            this.w = t54Var2;
            this.c = j2;
            this.i = true;
            obj = bq1Var.g(z7Var, fV, this);
            px0 px0Var = px0.j;
            if (obj == px0Var) {
                return px0Var;
            }
            t54Var = t54Var2;
            ng4Var2 = ng4Var;
            j = j2;
        } else {
            if (!z) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.c;
            t54Var = this.w;
            ng4Var = this.q;
            ng4Var2 = (ng4) this.b;
            js2.o(obj);
        }
        float fV2 = ng4Var2.v(((Number) obj).floatValue());
        t54Var.j = ng4Var.n == um3Var ? vj5.y(j, fV2, 0.0f, 2) : vj5.y(j, 0.0f, fV2, 1);
        return og5.g;
    }
}
