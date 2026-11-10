package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xy0 implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ int t;

    public /* synthetic */ xy0(int i) {
        this.j = (byte) 1;
        this.t = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                de6.g(i, aq2.J(1), (h02) obj);
                break;
            case 1:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    g75.y(xs2.I(i, h02Var), ue5.f0(g73.g, 16.0f, 8.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(of5.g)).w, h02Var, 48, 0, 131068);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                gy3.v(i, aq2.J(1), (h02) obj);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ xy0(int i, int i2, byte b) {
        this.j = b;
        this.t = i;
    }
}
