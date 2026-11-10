package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class te3 implements xy1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ te1 t;

    public /* synthetic */ te3(te1 te1Var, boolean z, byte b) {
        this.j = b;
        this.t = te1Var;
        this.a = z;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        boolean z = this.a;
        te1 te1Var = this.t;
        o84 o84Var = (o84) obj;
        switch (b) {
            case 0:
                float fL = ef3.l(o84Var, te1Var);
                o84Var.j(fL == 0.0f ? 1.0f : ef3.j(o84Var, te1Var) / fL);
                o84Var.c(xs2.r(z ? 0.0f : 1.0f, 0.0f));
                break;
            default:
                o84Var.j(ef3.l(o84Var, te1Var));
                o84Var.t(ef3.j(o84Var, te1Var));
                o84Var.c(xs2.r(z ? 1.0f : 0.0f, 0.5f));
                break;
        }
        return og5Var;
    }
}
