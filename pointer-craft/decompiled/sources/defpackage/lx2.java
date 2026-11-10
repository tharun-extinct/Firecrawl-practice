package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lx2 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ jd3 t;

    public /* synthetic */ lx2(jd3 jd3Var, byte b) {
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
                g61 g61Var = (g61) obj;
                g61Var.getClass();
                jd3.v(jd3Var, "devicesetup?fixDevice=" + g61Var.t + "&fixDeviceName=" + g61Var.j);
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    jd3Var.x();
                }
                jd3.v(jd3Var, "devicesetup");
                break;
        }
        return og5Var;
    }
}
