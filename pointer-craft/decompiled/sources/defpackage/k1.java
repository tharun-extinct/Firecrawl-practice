package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends zz4 implements bz1 {
    public final /* synthetic */ fg4 c;
    public boolean q;
    public /* synthetic */ long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(fg4 fg4Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = fg4Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        k1 k1Var = new k1(this.c, mu0Var);
        k1Var.w = ((wi3) obj).g;
        return k1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        long j = ((wi3) obj).g;
        k1 k1Var = new k1(this.c, (mu0) obj2);
        k1Var.w = j;
        return k1Var.u(og5.g);
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
        long j = this.w;
        this.q = true;
        Object objY = yf4.y(this.c.Y, j, this);
        px0 px0Var = px0.j;
        return objY == px0Var ? px0Var : objY;
    }
}
