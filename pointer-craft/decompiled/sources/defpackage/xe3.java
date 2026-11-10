package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xe3 implements gr1 {
    public final /* synthetic */ r54 a;
    public final /* synthetic */ te1 j;
    public final /* synthetic */ r54 m;
    public final /* synthetic */ r54 q;
    public final /* synthetic */ boolean t;

    public xe3(te1 te1Var, boolean z, r54 r54Var, r54 r54Var2, r54 r54Var3) {
        this.j = te1Var;
        this.t = z;
        this.a = r54Var;
        this.m = r54Var2;
        this.q = r54Var3;
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        sv svVar = (sv) obj;
        float fG = cw.g.g(svVar.r);
        boolean z = svVar.n == 0;
        float f = this.a.j;
        float f2 = this.m.j;
        float f3 = this.q.j;
        te1 te1Var = this.j;
        te1Var.getClass();
        te1Var.g.setValue(Boolean.valueOf(z != this.t));
        if (!te1Var.g()) {
            f = f2;
        }
        te1Var.y.e(lr2.e(0.0f, f, fG));
        te1Var.r.e(lr2.e(0.0f, f3, fG));
        return og5.g;
    }
}
