package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g6 implements bz1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object w;

    public /* synthetic */ g6(int i, my1 my1Var, qr0 qr0Var, jd3 jd3Var, wm4 wm4Var, int i2) {
        this.j = (byte) 3;
        this.a = i;
        this.m = my1Var;
        this.t = qr0Var;
        this.q = jd3Var;
        this.w = wm4Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        int i = this.a;
        Object obj3 = this.q;
        Object obj4 = this.t;
        og5 og5Var = og5.g;
        Object obj5 = this.w;
        Object obj6 = this.m;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                p6.n((my1) obj6, (j73) obj4, (o91) obj3, (nm0) obj5, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kh6.g((cz1) obj6, (j73) obj4, (xy1) obj3, (xy1) obj5, (h02) obj, aq2.J(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i) | 1;
                ((nm0) obj5).v((xy) obj6, this.t, this.q, (h02) obj, iJ);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(33281);
                wa6.g(this.a, (my1) obj6, (qr0) obj4, (jd3) obj3, (wm4) obj5, (h02) obj, iJ2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                uf6.y((j73) obj4, (xq) obj6, (aj6) obj3, (nm0) obj5, (h02) obj, aq2.J(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                hc6.r((zf5) obj6, (j73) obj4, (uj2) obj3, (xy1) obj5, (h02) obj, aq2.J(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                yd6.r((my1) obj6, (j73) obj4, (kw3) obj3, (nm0) obj5, (h02) obj, aq2.J(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xj4.y((String) obj4, (qr0) obj3, (my1) obj6, (xy1) obj5, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ g6(nm0 nm0Var, xy xyVar, Object obj, Object obj2, int i) {
        this.j = (byte) 2;
        this.w = nm0Var;
        this.m = xyVar;
        this.t = obj;
        this.q = obj2;
        this.a = i;
    }

    public /* synthetic */ g6(j73 j73Var, xq xqVar, aj6 aj6Var, nm0 nm0Var, int i) {
        this.j = (byte) 4;
        this.t = j73Var;
        this.m = xqVar;
        this.q = aj6Var;
        this.w = nm0Var;
        this.a = i;
    }

    public /* synthetic */ g6(Object obj, j73 j73Var, Object obj2, jz1 jz1Var, int i, byte b) {
        this.j = b;
        this.m = obj;
        this.t = j73Var;
        this.q = obj2;
        this.w = jz1Var;
        this.a = i;
    }

    public /* synthetic */ g6(String str, qr0 qr0Var, my1 my1Var, xy1 xy1Var, int i) {
        this.j = (byte) 7;
        this.t = str;
        this.q = qr0Var;
        this.m = my1Var;
        this.w = xy1Var;
        this.a = i;
    }
}
