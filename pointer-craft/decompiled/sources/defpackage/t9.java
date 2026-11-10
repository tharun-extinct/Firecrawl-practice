package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t9 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ us3 t;

    public /* synthetic */ t9(us3 us3Var, byte b) {
        this.j = b;
        this.t = us3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        us3 us3Var = this.t;
        ts3 ts3Var = (ts3) obj;
        switch (b) {
            case 0:
                ts3Var.j(us3Var, 0, 0, 0.0f);
                break;
            case 1:
                ts3.m(ts3Var, us3Var, 0, 0);
                break;
            case 2:
                ts3Var.j(us3Var, 0, 0, 0.0f);
                break;
            case 3:
                ts3.m(ts3Var, us3Var, 0, 0);
                break;
            case 4:
                ts3.q(ts3Var, us3Var, 0, 0);
                break;
            case 5:
                ts3.m(ts3Var, us3Var, 0, 0);
                break;
            case 6:
                ts3Var.j(us3Var, 0, 0, 0.0f);
                break;
            case 7:
                ts3Var.j(us3Var, 0, 0, 0.0f);
                break;
            default:
                ts3.m(ts3Var, us3Var, 0, 0);
                break;
        }
        return og5Var;
    }
}
