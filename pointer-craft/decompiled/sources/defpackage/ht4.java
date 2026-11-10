package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ht4 implements xy1 {
    public final /* synthetic */ xy1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ xy1 t;

    public /* synthetic */ ht4(xy1 xy1Var, xy1 xy1Var2, byte b) {
        this.j = b;
        this.t = xy1Var;
        this.a = xy1Var2;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        xy1 xy1Var = this.a;
        xy1 xy1Var2 = this.t;
        switch (b) {
            case 0:
                xy1Var2.a(obj);
                xy1Var.a(obj);
                break;
            default:
                xy1Var2.a(obj);
                xy1Var.a(obj);
                break;
        }
        return og5Var;
    }
}
