package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba2 implements bz1 {
    public final /* synthetic */ short a;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ float t;
    public final /* synthetic */ Object w;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ba2(o22 o22Var, bz1 bz1Var, qj0 qj0Var, float f, nm0 nm0Var, int i, int i2) {
        this.q = o22Var;
        this.w = bz1Var;
        this.c = qj0Var;
        this.t = f;
        this.i = nm0Var;
        this.a = i;
        this.m = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        short s = this.a;
        Object obj3 = this.i;
        Object obj4 = this.c;
        Object obj5 = this.w;
        Object obj6 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(s | 1);
                m50.u((cp3) obj6, (j73) obj5, (u6) obj4, (yt0) obj3, this.t, (h02) obj, iJ, this.m);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(s | 1);
                v13.n((o22) obj6, (bz1) obj5, (qj0) obj4, this.t, (nm0) obj3, (h02) obj, iJ2, this.m);
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ba2(cp3 cp3Var, j73 j73Var, u6 u6Var, yt0 yt0Var, float f, int i, int i2) {
        this.q = cp3Var;
        this.w = j73Var;
        this.c = u6Var;
        this.i = yt0Var;
        this.t = f;
        this.a = i;
        this.m = i2;
    }
}
