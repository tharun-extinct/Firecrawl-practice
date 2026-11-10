package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yp0 implements cz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ String t;

    public /* synthetic */ yp0(String str, byte b) {
        this.j = b;
        this.t = str;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h02Var.Q();
                } else {
                    g75.y(this.t, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var, 0, 0, 262142);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    h02Var2.Q();
                } else {
                    pw5.x(ue5.i0(g73.g, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0L, 0.0f, yf2.p(this.t, "screen_on"), 0.0f, h02Var2, 6);
                }
                break;
            default:
                h02 h02Var3 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    h02Var3.Q();
                } else {
                    g75.y(this.t, null, ((rj0) h02Var3.a(tj0.g)).y, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var3, 0, 0, 262138);
                }
                break;
        }
        return og5Var;
    }
}
