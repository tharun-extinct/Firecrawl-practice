package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n6 implements bz1 {
    public final /* synthetic */ nm0 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ bz1 t;

    public /* synthetic */ n6(bz1 bz1Var, nm0 nm0Var, byte b) {
        this.j = b;
        this.t = bz1Var;
        this.a = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        nm0 nm0Var = this.a;
        bz1 bz1Var = this.t;
        byte b2 = 0;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    if (bz1Var == null) {
                        h02Var.X(-1102039173);
                    } else {
                        h02Var.X(795734342);
                        bz1Var.l(h02Var, 0);
                    }
                    h02Var.b(false);
                    nm0Var.l(h02Var, 0);
                }
                break;
            default:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    bo3 bo3Var = p6.g;
                    p6.y(ue5.m0(-459506658, new n6(bz1Var, nm0Var, b2), h02Var2), h02Var2, 438);
                }
                break;
        }
        return og5Var;
    }
}
