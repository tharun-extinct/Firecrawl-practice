package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a8 extends zz4 implements cz1 {
    public final /* synthetic */ float b;
    public final /* synthetic */ c8 c;
    public final /* synthetic */ r54 i;
    public boolean q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(c8 c8Var, r54 r54Var, float f, mu0 mu0Var) {
        super(3, mu0Var);
        this.c = c8Var;
        this.i = r54Var;
        this.b = f;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        r54 r54Var;
        boolean z = this.q;
        if (!z) {
            js2.o(obj);
            c8 c8Var = this.c;
            z7 z7Var = new z7(c8Var, (m8) this.w, (byte) 0);
            bq1 bq1Var = c8Var.S;
            if (bq1Var == null) {
                yf2.Y("resolvedFlingBehavior");
                throw null;
            }
            r54 r54Var2 = this.i;
            this.w = r54Var2;
            this.q = true;
            obj = bq1Var.g(z7Var, this.b, this);
            px0 px0Var = px0.j;
            if (obj == px0Var) {
                return px0Var;
            }
            r54Var = r54Var2;
        } else {
            if (!z) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r54Var = (r54) this.w;
            js2.o(obj);
        }
        r54Var.j = ((Number) obj).floatValue();
        return og5.g;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        r54 r54Var = this.i;
        float f = this.b;
        a8 a8Var = new a8(this.c, r54Var, f, (mu0) obj3);
        a8Var.w = (m8) obj;
        return a8Var.u(og5.g);
    }
}
