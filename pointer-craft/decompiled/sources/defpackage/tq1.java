package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tq1 implements bz1 {
    public final /* synthetic */ cn4 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j;
    public final /* synthetic */ long m;
    public final /* synthetic */ long q;
    public final /* synthetic */ j73 t;
    public final /* synthetic */ nm0 w;

    public /* synthetic */ tq1(Object obj, j73 j73Var, cn4 cn4Var, long j, long j2, Object obj2, nm0 nm0Var, int i, byte b) {
        this.j = b;
        this.i = obj;
        this.t = j73Var;
        this.a = cn4Var;
        this.m = j;
        this.q = j2;
        this.b = obj2;
        this.w = nm0Var;
        this.c = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.c;
        Object obj3 = this.b;
        Object obj4 = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i | 1);
                m50.c((my1) obj4, this.t, this.a, this.m, this.q, (nq1) obj3, this.w, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(i | 1);
                ef3.r((we1) obj4, this.t, this.a, this.m, this.q, (qo5) obj3, this.w, (h02) obj, iJ2);
                break;
        }
        return og5Var;
    }
}
