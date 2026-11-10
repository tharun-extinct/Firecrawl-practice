package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ry2 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ r45 t;

    public /* synthetic */ ry2(r45 r45Var, byte b) {
        this.j = b;
        this.t = r45Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        r45 r45Var = this.t;
        switch (b) {
            case 0:
                r45Var.n(((wi3) obj).g, bi6.i);
                break;
            case 1:
                qu3 qu3Var = (qu3) obj;
                r45Var.v(fd6.t(qu3Var, false));
                qu3Var.g();
                break;
            default:
                qu3 qu3Var2 = (qu3) obj;
                r45Var.v(fd6.t(qu3Var2, false));
                qu3Var2.g();
                break;
        }
        return og5Var;
    }
}
