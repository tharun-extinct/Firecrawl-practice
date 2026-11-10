package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ke3 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ bw4 t;

    public /* synthetic */ ke3(bw4 bw4Var, byte b) {
        this.j = b;
        this.t = bw4Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        bw4 bw4Var = this.t;
        o84 o84Var = (o84) obj;
        switch (b) {
            case 0:
                o84Var.r(((Number) bw4Var.getValue()).floatValue());
                break;
            default:
                o84Var.r(((Number) bw4Var.getValue()).floatValue());
                break;
        }
        return og5Var;
    }
}
