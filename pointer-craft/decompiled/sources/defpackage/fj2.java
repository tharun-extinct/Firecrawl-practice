package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fj2 implements bz1 {
    public final /* synthetic */ bw4 a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ my1 t;

    public /* synthetic */ fj2(my1 my1Var, bw4 bw4Var) {
        this.t = my1Var;
        this.a = bw4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        bw4 bw4Var = this.a;
        my1 my1Var = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    ua5.y(ra5.g(384, h02Var), ue5.m0(78438419, new tn(bw4Var, (byte) 6), h02Var), ua5.r(h02Var), null, false, ue5.m0(-2054581717, new fj2(my1Var, bw4Var), h02Var), h02Var, 100663344);
                }
                break;
            default:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    boolean zX = h02Var2.x(my1Var);
                    Object objK = h02Var2.K();
                    if (zX || objK == oo0.g) {
                        objK = new ss(my1Var, (byte) 4);
                        h02Var2.i0(objK);
                    }
                    m50.q(jz5.y, jz5.r, (my1) objK, null, ((Boolean) bw4Var.getValue()).booleanValue(), null, 0L, 0L, null, h02Var2, 54, 1000);
                }
                break;
        }
        return og5Var;
    }

    public /* synthetic */ fj2(bw4 bw4Var, my1 my1Var) {
        this.a = bw4Var;
        this.t = my1Var;
    }
}
