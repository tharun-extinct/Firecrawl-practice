package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vn2 implements my1 {
    public final /* synthetic */ sk2 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ xy1 t;

    public vn2(sk2 sk2Var, xy1 xy1Var) {
        this.j = (byte) 3;
        this.a = sk2Var;
        this.t = xy1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        sk2 sk2Var = this.a;
        xy1 xy1Var = this.t;
        switch (b) {
            case 0:
                xy1Var.a(Integer.valueOf(sk2Var.g));
                break;
            case 1:
                xy1Var.a(Integer.valueOf(sk2Var.g));
                break;
            case 2:
                xy1Var.a(sk2Var);
                break;
            case 3:
                String str = sk2Var.x;
                if (str != null) {
                    xy1Var.a(str);
                }
                break;
            default:
                xy1Var.a(sk2Var);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ vn2(xy1 xy1Var, sk2 sk2Var, byte b) {
        this.j = b;
        this.t = xy1Var;
        this.a = sk2Var;
    }
}
