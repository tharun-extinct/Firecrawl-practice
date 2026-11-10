package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n8 extends zz4 implements cz1 {
    public final /* synthetic */ s3 c;
    public boolean q;
    public final /* synthetic */ rk4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(rk4 rk4Var, s3 s3Var, mu0 mu0Var) {
        super(3, mu0Var);
        this.w = rk4Var;
        this.c = s3Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        if (!z) {
            js2.o(obj);
            o8 o8Var = (o8) this.w.t;
            this.q = true;
            Object objL = this.c.l(o8Var, this);
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

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        return new n8(this.w, this.c, (mu0) obj3).u(og5.g);
    }
}
