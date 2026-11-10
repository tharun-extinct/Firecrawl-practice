package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oq2 implements xy1 {
    public final /* synthetic */ qq2 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ x32 t;

    public /* synthetic */ oq2(x32 x32Var, qq2 qq2Var, byte b) {
        this.j = b;
        this.t = x32Var;
        this.a = qq2Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        qq2 qq2Var = this.a;
        x32 x32Var = this.t;
        qg qgVar = (qg) obj;
        switch (b) {
            case 0:
                x32Var.v(((Number) qgVar.n()).floatValue());
                qq2Var.r.g();
                break;
            default:
                x32Var.v(((Number) qgVar.n()).floatValue());
                qq2Var.r.g();
                break;
        }
        return og5Var;
    }
}
