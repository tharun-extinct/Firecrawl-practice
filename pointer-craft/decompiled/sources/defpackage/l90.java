package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l90 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ short i;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ my1 m;
    public final /* synthetic */ Object p;
    public final /* synthetic */ j73 q;
    public final /* synthetic */ Object s;
    public final /* synthetic */ nm0 t;
    public final /* synthetic */ cn4 w;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l90(nm0 nm0Var, boolean z, my1 my1Var, j73 j73Var, bz1 bz1Var, bz1 bz1Var2, cn4 cn4Var, m11 m11Var, int i, int i2) {
        this.t = nm0Var;
        this.a = z;
        this.m = my1Var;
        this.q = j73Var;
        this.b = bz1Var;
        this.s = bz1Var2;
        this.w = cn4Var;
        this.p = m11Var;
        this.c = i;
        this.i = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.c;
        Object obj3 = this.p;
        Object obj4 = this.s;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i | 1);
                c93.i(this.m, this.q, this.a, this.w, (a80) obj5, (z40) obj4, (zn3) obj3, this.t, (h02) obj, iJ, this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(i | 1);
                ef3.v(this.t, this.a, this.m, this.q, (bz1) obj5, (bz1) obj4, this.w, (m11) obj3, (h02) obj, iJ2, this.i);
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l90(my1 my1Var, j73 j73Var, boolean z, cn4 cn4Var, a80 a80Var, z40 z40Var, zn3 zn3Var, nm0 nm0Var, int i, int i2) {
        this.m = my1Var;
        this.q = j73Var;
        this.a = z;
        this.w = cn4Var;
        this.b = a80Var;
        this.s = z40Var;
        this.p = zn3Var;
        this.t = nm0Var;
        this.c = i;
        this.i = i2;
    }
}
