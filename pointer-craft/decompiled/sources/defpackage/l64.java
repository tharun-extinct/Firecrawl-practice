package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l64 extends a0 implements ix0 {
    public final /* synthetic */ m64 a;
    public final /* synthetic */ wo0 t;

    /* JADX WARN: Illegal instructions before constructor call */
    public l64(wo0 wo0Var, m64 m64Var) {
        d93 d93Var = d93.t;
        this.t = wo0Var;
        this.a = m64Var;
        super(d93Var);
    }

    @Override // defpackage.ix0
    public final void f(fx0 fx0Var, Throwable th) throws Throwable {
        wo0 wo0Var = this.t;
        m64 m64Var = this.a;
        yc6.r(th, new p2(wo0Var, m64Var, (byte) 18));
        ix0 ix0Var = (ix0) m64Var.j.h(d93.t);
        if (ix0Var == null) {
            throw th;
        }
        ix0Var.f(fx0Var, th);
    }
}
