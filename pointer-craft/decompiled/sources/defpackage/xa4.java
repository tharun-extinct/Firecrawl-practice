package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xa4 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ jd3 t;

    public /* synthetic */ xa4(jd3 jd3Var, byte b) {
        this.j = b;
        this.t = jd3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        jd3 jd3Var = this.t;
        switch (b) {
            case 0:
                vi2 vi2Var = (vi2) obj;
                vi2Var.getClass();
                vi2Var.u0 = new wa4(jd3Var, (byte) 3);
                break;
            case 1:
                jd3.v(jd3Var, "custom?layoutId=" + ((Integer) obj).intValue());
                break;
            case 2:
                jd3.v(jd3Var, "layoutedit?layoutId=" + ((Integer) obj).intValue());
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                jd3.v(jd3Var, "shared?sharedLayoutId=".concat(str));
                break;
            default:
                xd3 xd3Var = (xd3) obj;
                int i = jd3Var.y.t().w.r;
                xd3Var.getClass();
                xd3Var.g(i);
                xd3Var.x = true;
                xd3Var.l = false;
                break;
        }
        return og5Var;
    }
}
