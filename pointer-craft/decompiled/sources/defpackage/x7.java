package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x7 extends zz4 implements cz1 {
    public final /* synthetic */ s3 c;
    public final /* synthetic */ c8 i;
    public boolean q;
    public /* synthetic */ m8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(s3 s3Var, c8 c8Var, mu0 mu0Var) {
        super(3, mu0Var);
        this.c = s3Var;
        this.i = c8Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean z = this.q;
        if (!z) {
            js2.o(obj);
            m mVar = new m(this.i, this.w, (byte) 2);
            this.q = true;
            Object objL = this.c.l(mVar, this);
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
        x7 x7Var = new x7(this.c, this.i, (mu0) obj3);
        x7Var.w = (m8) obj;
        return x7Var.u(og5.g);
    }
}
