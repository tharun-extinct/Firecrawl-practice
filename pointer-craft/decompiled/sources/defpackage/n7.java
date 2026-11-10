package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n7 extends zz4 implements dz1 {
    public final /* synthetic */ q8 b;
    public /* synthetic */ l11 c;
    public /* synthetic */ Object i;
    public boolean q;
    public final /* synthetic */ oi s;
    public /* synthetic */ m8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(q8 q8Var, oi oiVar, mu0 mu0Var) {
        super(4, mu0Var);
        this.b = q8Var;
        this.s = oiVar;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        n7 n7Var = new n7(this.b, this.s, (mu0) obj4);
        n7Var.w = (m8) obj;
        n7Var.c = (l11) obj2;
        n7Var.i = obj3;
        return n7Var.u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        if (!z) {
            js2.o(obj);
            m8 m8Var = this.w;
            l11 l11Var = this.c;
            Object obj2 = this.i;
            q8 q8Var = this.b;
            float fD = q8Var.m.d();
            this.w = null;
            this.c = null;
            this.q = true;
            Object objL = og0.l(q8Var, fD, m8Var, l11Var, obj2, this.s, this);
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
