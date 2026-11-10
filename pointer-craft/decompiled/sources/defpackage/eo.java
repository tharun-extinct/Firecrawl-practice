package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eo implements bz1 {
    public final /* synthetic */ qr0 a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ wm4 m;
    public final /* synthetic */ ga1 q;
    public final /* synthetic */ jd3 t;
    public final /* synthetic */ boolean w;

    public /* synthetic */ eo(jd3 jd3Var, qr0 qr0Var, wm4 wm4Var, ga1 ga1Var, boolean z) {
        this.t = jd3Var;
        this.a = qr0Var;
        this.m = wm4Var;
        this.q = ga1Var;
        this.w = z;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    m50.l(this.t, this.a, this.m, this.q, this.w, h02Var, 576);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                m50.l(this.t, this.a, this.m, this.q, this.w, (h02) obj, aq2.J(577));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ eo(jd3 jd3Var, qr0 qr0Var, wm4 wm4Var, ga1 ga1Var, boolean z, int i) {
        this.t = jd3Var;
        this.a = qr0Var;
        this.m = wm4Var;
        this.q = ga1Var;
        this.w = z;
    }
}
