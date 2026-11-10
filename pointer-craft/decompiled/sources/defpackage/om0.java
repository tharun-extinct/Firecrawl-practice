package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class om0 implements cz1 {
    public final /* synthetic */ byte j;
    public static final om0 t = new om0(0);
    public static final om0 a = new om0(1);

    public /* synthetic */ om0(byte b) {
        this.j = b;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h02Var.Q();
                }
                break;
            case 1:
                xd1 xd1Var = (xd1) obj;
                long j = ((wi3) obj2).g;
                long j2 = ((jj0) obj3).g;
                cr4 cr4Var = cr4.g;
                xd1.F(xd1Var, j2, xd1Var.e(cr4.r) / 2.0f, j, null, 120);
                break;
            default:
                ((Number) obj3).intValue();
                kn0.g.l((h02) obj2, 0);
                break;
        }
        return og5Var;
    }
}
