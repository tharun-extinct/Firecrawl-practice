package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gi2 implements bz1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ j73 t;
    public final /* synthetic */ Object w;

    public /* synthetic */ gi2(j73 j73Var, cn4 cn4Var, long j, zn3 zn3Var, nm0 nm0Var, int i) {
        this.t = j73Var;
        this.m = cn4Var;
        this.a = j;
        this.q = zn3Var;
        this.w = nm0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.w;
        Object obj4 = this.q;
        Object obj5 = this.m;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(1769473);
                hc6.n(this.t, (cn4) obj5, this.a, (zn3) obj4, (nm0) obj3, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(1);
                hc6.g((String) obj5, this.t, (k85) obj4, this.a, (n85[]) obj3, (h02) obj, iJ2);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ gi2(String str, j73 j73Var, k85 k85Var, long j, n85[] n85VarArr, int i) {
        this.m = str;
        this.t = j73Var;
        this.q = k85Var;
        this.a = j;
        this.w = n85VarArr;
    }
}
