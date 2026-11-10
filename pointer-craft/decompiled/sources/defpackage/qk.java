package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qk implements bz1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ boolean t;

    public /* synthetic */ qk(boolean z, ga1 ga1Var, my1 my1Var, int i) {
        this.t = z;
        this.m = ga1Var;
        this.a = my1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.m;
        my1 my1Var = this.a;
        boolean z = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                yf2.l(z, (ga1) obj3, my1Var, (h02) obj, aq2.J(1));
                break;
            default:
                ((Integer) obj2).getClass();
                m50.z(z, my1Var, (my1) obj3, (h02) obj, aq2.J(1));
                break;
        }
        return og5Var;
    }

    public /* synthetic */ qk(boolean z, my1 my1Var, my1 my1Var2, int i) {
        this.t = z;
        this.a = my1Var;
        this.m = my1Var2;
    }
}
