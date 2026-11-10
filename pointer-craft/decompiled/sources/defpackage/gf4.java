package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gf4 extends zz4 implements bz1 {
    public final /* synthetic */ r54 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ oi i;
    public boolean q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf4(float f, oi oiVar, r54 r54Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = f;
        this.i = oiVar;
        this.b = r54Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        gf4 gf4Var = new gf4(this.c, this.i, this.b, mu0Var);
        gf4Var.w = obj;
        return gf4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((gf4) b((mu0) obj2, (pf4) obj)).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        if (!z) {
            js2.o(obj);
            ta taVar = new ta(this.b, (pf4) this.w, (byte) 27);
            this.q = true;
            Object objM = kq2.m(0.0f, this.c, this.i, taVar, this, 4);
            px0 px0Var = px0.j;
            if (objM == px0Var) {
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
