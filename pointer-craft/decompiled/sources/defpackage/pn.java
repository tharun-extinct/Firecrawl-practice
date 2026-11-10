package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pn implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int t;

    public /* synthetic */ pn(Object obj, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.t = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.t;
        Object obj3 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                m50.s((wm4) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                m50.y((jd3) obj3, (h02) obj, aq2.J(i | 1));
                break;
            case 2:
                fs2 fs2Var = (fs2) obj3;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    of2 of2VarN = fs2Var.y.g.n(i);
                    ((cs2) of2VarN.r).r.i(fs2Var.r, Integer.valueOf(i - of2VarN.g), h02Var, 0);
                }
                break;
            default:
                jo3 jo3Var = (jo3) obj3;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    of2 of2VarN2 = jo3Var.y.j().n(i);
                    ((go3) of2VarN2.r).y.i(no3.g, Integer.valueOf(i - of2VarN2.g), h02Var2, 0);
                }
                break;
        }
        return og5Var;
    }
}
