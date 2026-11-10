package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i90 implements bz1 {
    public final /* synthetic */ j73 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ zn3 q;
    public final /* synthetic */ Object s;
    public final /* synthetic */ my1 t;
    public final /* synthetic */ int w;

    public /* synthetic */ i90(my1 my1Var, j73 j73Var, boolean z, cn4 cn4Var, a80 a80Var, e90 e90Var, zn3 zn3Var, nm0 nm0Var, int i) {
        this.t = my1Var;
        this.a = j73Var;
        this.m = z;
        this.c = cn4Var;
        this.i = a80Var;
        this.b = e90Var;
        this.q = zn3Var;
        this.s = nm0Var;
        this.w = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.w;
        Object obj3 = this.s;
        Object obj4 = this.b;
        Object obj5 = this.i;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i | 1);
                c93.t(this.t, this.a, this.m, (cn4) obj6, (a80) obj5, (e90) obj4, this.q, (nm0) obj3, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(i | 1);
                v13.y((bz1) obj6, this.t, this.a, (bz1) obj5, (bz1) obj4, this.m, (l43) obj3, this.q, (h02) obj, iJ2);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ i90(bz1 bz1Var, my1 my1Var, j73 j73Var, bz1 bz1Var2, bz1 bz1Var3, boolean z, l43 l43Var, zn3 zn3Var, int i) {
        this.c = bz1Var;
        this.t = my1Var;
        this.a = j73Var;
        this.i = bz1Var2;
        this.b = bz1Var3;
        this.m = z;
        this.s = l43Var;
        this.q = zn3Var;
        this.w = i;
    }
}
