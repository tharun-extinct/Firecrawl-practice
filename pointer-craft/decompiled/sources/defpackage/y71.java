package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y71 implements dz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 t;

    public /* synthetic */ y71(Object obj, my1 my1Var, byte b) {
        this.j = b;
        this.a = obj;
        this.t = my1Var;
    }

    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.j;
        og5 og5Var = og5.g;
        my1 my1Var = this.t;
        Object obj5 = this.a;
        switch (b) {
            case 0:
                g61 g61Var = (g61) obj5;
                String str = (String) obj2;
                h02 h02Var = (h02) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((gk0) obj).getClass();
                str.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= h02Var.x(str) ? 32 : 16;
                }
                if (!h02Var.N(iIntValue & 1, (iIntValue & 145) != 144)) {
                    h02Var.Q();
                } else if (!str.equals("ConnectionCard")) {
                    h02Var.X(-1436238700);
                    h02Var.b(false);
                } else {
                    h02Var.X(-1437375160);
                    fb6.r(null, null, null, null, null, ue5.m0(-2002956006, new ev0(g61Var, my1Var, (byte) 9), h02Var), h02Var, 196608, 31);
                    h02Var.b(false);
                }
                break;
            default:
                sk2 sk2Var = (sk2) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                h02 h02Var2 = (h02) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= h02Var2.l(zBooleanValue) ? 32 : 16;
                }
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    h02Var2.Q();
                } else if (!zBooleanValue) {
                    h02Var2.X(1736943821);
                    gp4.r(nb4.g, sk2Var.n != null, null, null, null, null, ue5.m0(-849704130, new th0(my1Var, (byte) 2), h02Var2), h02Var2, 1572864, 30);
                    h02Var2.b(false);
                } else {
                    h02Var2.X(1736587073);
                    b04.g(mq4.j(ue5.e0(g73.g, 8.0f), 24.0f), ((jj0) h02Var2.a(mt0.g)).g, 2.0f, 0L, 0, 0.0f, h02Var2, 390, 56);
                    h02Var2.b(false);
                }
                break;
        }
        return og5Var;
    }
}
