package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u15 implements bz1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ nm0 c;
    public final /* synthetic */ int i;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ long m;
    public final /* synthetic */ cz1 q;
    public final /* synthetic */ j73 t;
    public final /* synthetic */ bz1 w;

    public /* synthetic */ u15(int i, j73 j73Var, long j, long j2, cz1 cz1Var, bz1 bz1Var, nm0 nm0Var, int i2) {
        this.i = i;
        this.t = j73Var;
        this.a = j;
        this.m = j2;
        this.q = cz1Var;
        this.w = bz1Var;
        this.c = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(1572865);
                q62.r(this.i, this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(this.i | 1);
                q62.n(this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj, iJ2);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ u15(j73 j73Var, long j, long j2, cz1 cz1Var, bz1 bz1Var, nm0 nm0Var, int i) {
        this.t = j73Var;
        this.a = j;
        this.m = j2;
        this.q = cz1Var;
        this.w = bz1Var;
        this.c = nm0Var;
        this.i = i;
    }
}
