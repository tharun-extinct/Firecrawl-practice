package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dw3 implements bz1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ nm0 m;
    public final /* synthetic */ kw3 t;

    public /* synthetic */ dw3(kw3 kw3Var, my1 my1Var, nm0 nm0Var, byte b) {
        this.j = b;
        this.t = kw3Var;
        this.a = my1Var;
        this.m = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        nm0 nm0Var = this.m;
        my1 my1Var = this.a;
        kw3 kw3Var = this.t;
        h02 h02Var = (h02) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    yd6.g(kw3Var, my1Var, h02Var, 0);
                    nm0Var.l(h02Var, 0);
                }
                break;
            default:
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    yd6.g(kw3Var, my1Var, h02Var, 0);
                    nm0Var.l(h02Var, 0);
                }
                break;
        }
        return og5Var;
    }
}
