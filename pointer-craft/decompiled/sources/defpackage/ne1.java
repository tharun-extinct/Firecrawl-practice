package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ne1 implements bz1 {
    public final /* synthetic */ nm0 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object w;

    public /* synthetic */ ne1(Object obj, int i, Object obj2, nm0 nm0Var, int i2, byte b) {
        this.j = b;
        this.q = obj;
        this.t = i;
        this.w = obj2;
        this.a = nm0Var;
        this.m = i2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.m;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i | 1);
                int i2 = this.t;
                yf2.i((gk0) this.q, i2, (cz1) obj3, this.a, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(i | 1);
                Object obj4 = this.q;
                int i3 = this.t;
                lr2.y(obj4, i3, (mr2) obj3, this.a, (h02) obj, iJ2);
                break;
        }
        return og5Var;
    }
}
