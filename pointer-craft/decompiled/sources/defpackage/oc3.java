package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc3 implements bz1 {
    public final /* synthetic */ qc4 a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ nm0 m;
    public final /* synthetic */ mc3 t;

    public /* synthetic */ oc3(mc3 mc3Var, qc4 qc4Var, nm0 nm0Var, int i) {
        this.t = mc3Var;
        this.a = qc4Var;
        this.m = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        nm0 nm0Var = this.m;
        qc4 qc4Var = this.a;
        mc3 mc3Var = this.t;
        h02 h02Var = (h02) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    kq2.n(qc4Var, ue5.m0(65670941, new vn(mc3Var, nm0Var, (byte) 15), h02Var), h02Var, 48);
                }
                break;
            default:
                num.getClass();
                kq2.y(mc3Var, qc4Var, nm0Var, h02Var, aq2.J(385));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ oc3(qc4 qc4Var, mc3 mc3Var, nm0 nm0Var) {
        this.a = qc4Var;
        this.t = mc3Var;
        this.m = nm0Var;
    }
}
