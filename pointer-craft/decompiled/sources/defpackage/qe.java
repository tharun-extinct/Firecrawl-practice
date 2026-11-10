package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qe implements bz1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ boolean t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qe(j73 j73Var, my1 my1Var, boolean z, int i) {
        this.m = j73Var;
        this.q = my1Var;
        this.t = z;
        this.a = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.q;
        Object obj4 = this.m;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(this.a | 1);
                gh6.r((j73) obj4, (my1) obj3, this.t, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(1);
                yf6.x((String) obj4, this.t, (k85) obj3, (h02) obj, iJ2, this.a);
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qe(String str, boolean z, k85 k85Var, int i, int i2) {
        this.m = str;
        this.t = z;
        this.q = k85Var;
        this.a = i2;
    }
}
