package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ln0 implements cz1 {
    public final /* synthetic */ byte j;
    public static final ln0 t = new ln0(0);
    public static final ln0 a = new ln0(1);

    public /* synthetic */ ln0(byte b) {
        this.j = b;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                wr4 wr4Var = (wr4) obj;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= h02Var.x(wr4Var) ? 4 : 2;
                }
                if (h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fg6.r(wr4Var, null, null, 0L, 0L, 0L, 0L, 0L, h02Var, iIntValue & 14);
                } else {
                    h02Var.Q();
                }
                return og5.g;
            default:
                return null;
        }
    }
}
