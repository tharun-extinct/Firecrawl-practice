package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m7 extends zz4 implements dz1 {
    public final /* synthetic */ p8 b;
    public /* synthetic */ i13 c;
    public /* synthetic */ Object i;
    public boolean q;
    public final /* synthetic */ float s;
    public /* synthetic */ l8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(p8 p8Var, float f, mu0 mu0Var) {
        super(4, mu0Var);
        this.b = p8Var;
        this.s = f;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        m7 m7Var = new m7(this.b, this.s, (mu0) obj4);
        m7Var.w = (l8) obj;
        m7Var.c = (i13) obj2;
        m7Var.i = obj3;
        return m7Var.u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        if (!z) {
            js2.o(obj);
            l8 l8Var = this.w;
            float fN = this.c.n(this.i);
            if (!Float.isNaN(fN)) {
                r54 r54Var = new r54();
                p8 p8Var = this.b;
                float fD = Float.isNaN(((pp3) p8Var.q).d()) ? 0.0f : ((pp3) p8Var.q).d();
                r54Var.j = fD;
                no1 no1Var = ((xo4) ((m63) p8Var.r).t).r;
                l7 l7Var = new l7(l8Var, r54Var, (byte) 0);
                this.w = null;
                this.c = null;
                this.q = true;
                Object objT = kq2.t(fD, fN, this.s, no1Var, l7Var, this);
                px0 px0Var = px0.j;
                if (objT == px0Var) {
                    return px0Var;
                }
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
