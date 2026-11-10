package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j90 implements bz1 {
    public final /* synthetic */ zn3 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Object p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object s;
    public final /* synthetic */ j73 t;
    public final /* synthetic */ jz1 u;
    public final /* synthetic */ short w;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j90(my1 my1Var, j73 j73Var, boolean z, cn4 cn4Var, a80 a80Var, e90 e90Var, z40 z40Var, zn3 zn3Var, cz1 cz1Var, int i, int i2) {
        this.c = my1Var;
        this.t = j73Var;
        this.m = z;
        this.i = cn4Var;
        this.b = a80Var;
        this.s = e90Var;
        this.p = z40Var;
        this.a = zn3Var;
        this.u = cz1Var;
        this.q = i;
        this.w = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.q;
        jz1 jz1Var = this.u;
        Object obj3 = this.p;
        Object obj4 = this.s;
        Object obj5 = this.b;
        Object obj6 = this.i;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i | 1);
                c93.x((my1) obj7, this.t, this.m, (cn4) obj6, (a80) obj5, (e90) obj4, (z40) obj3, this.a, (cz1) jz1Var, (h02) obj, iJ, this.w);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(i | 1);
                aq2.g(this.t, (ss2) obj7, this.a, (ar) obj6, (r6) obj5, (bq1) obj4, this.m, (tb) obj3, (xy1) jz1Var, (h02) obj, iJ2, this.w);
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j90(j73 j73Var, ss2 ss2Var, zn3 zn3Var, ar arVar, r6 r6Var, bq1 bq1Var, boolean z, tb tbVar, xy1 xy1Var, int i, int i2) {
        this.t = j73Var;
        this.c = ss2Var;
        this.a = zn3Var;
        this.i = arVar;
        this.b = r6Var;
        this.s = bq1Var;
        this.m = z;
        this.p = tbVar;
        this.u = xy1Var;
        this.q = i;
        this.w = i2;
    }
}
