package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k50 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ xo4 t;

    public /* synthetic */ k50(xo4 xo4Var, byte b) {
        this.j = b;
        this.t = xo4Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        xo4 xo4Var = this.t;
        o84 o84Var = (o84) obj;
        switch (b) {
            case 0:
                p8 p8Var = xo4Var.n;
                float fD = ((pp3) p8Var.q).d();
                float fR = p8Var.n().r();
                float f = fD < fR ? fR - fD : 0.0f;
                o84Var.t(f > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (o84Var.d & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & o84Var.d))) : 1.0f);
                o84Var.c(xs2.r(0.5f, 0.0f));
                break;
            default:
                p8 p8Var2 = xo4Var.n;
                float fD2 = ((pp3) p8Var2.q).d();
                float fR2 = p8Var2.n().r();
                float f2 = fD2 < fR2 ? fR2 - fD2 : 0.0f;
                o84Var.t(f2 > 0.0f ? (Float.intBitsToFloat((int) (o84Var.d & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & o84Var.d)) : 1.0f);
                o84Var.c(xs2.r(0.5f, 0.0f));
                break;
        }
        return og5Var;
    }
}
