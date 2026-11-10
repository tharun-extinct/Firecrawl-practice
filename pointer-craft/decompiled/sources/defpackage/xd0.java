package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xd0 implements bz1 {
    public final /* synthetic */ j73 a;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 2;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Object w;

    public /* synthetic */ xd0(j73 j73Var, kr4 kr4Var, boolean z, ja3 ja3Var, nm0 nm0Var, cz1 cz1Var, int i) {
        this.a = j73Var;
        this.q = kr4Var;
        this.t = z;
        this.w = ja3Var;
        this.c = nm0Var;
        this.i = cz1Var;
        this.m = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        int i = this.m;
        Object obj3 = this.i;
        Object obj4 = this.c;
        Object obj5 = this.w;
        Object obj6 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i | 1);
                cc6.y(this.t, (ca5) obj6, this.a, (td0) obj5, (by4) obj4, (by4) obj3, (h02) obj, iJ);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(i | 1);
                ju0.r((String) obj6, this.t, (gu0) obj5, this.a, (cz1) obj4, (my1) obj3, (h02) obj, iJ2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iJ3 = aq2.J(i | 1);
                jr4.r(this.a, (kr4) obj6, this.t, (ja3) obj5, (nm0) obj4, (cz1) obj3, (h02) obj, iJ3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ4 = aq2.J(i | 1);
                ua5.y((vv3) obj6, (nm0) obj5, (ya5) obj4, this.a, this.t, (nm0) obj3, (h02) obj, iJ4);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ xd0(vv3 vv3Var, nm0 nm0Var, ya5 ya5Var, j73 j73Var, boolean z, nm0 nm0Var2, int i) {
        this.q = vv3Var;
        this.w = nm0Var;
        this.c = ya5Var;
        this.a = j73Var;
        this.t = z;
        this.i = nm0Var2;
        this.m = i;
    }

    public /* synthetic */ xd0(String str, boolean z, gu0 gu0Var, j73 j73Var, cz1 cz1Var, my1 my1Var, int i) {
        this.q = str;
        this.t = z;
        this.w = gu0Var;
        this.a = j73Var;
        this.c = cz1Var;
        this.i = my1Var;
        this.m = i;
    }

    public /* synthetic */ xd0(boolean z, ca5 ca5Var, j73 j73Var, td0 td0Var, by4 by4Var, by4 by4Var2, int i) {
        this.t = z;
        this.q = ca5Var;
        this.a = j73Var;
        this.w = td0Var;
        this.c = by4Var;
        this.i = by4Var2;
        this.m = i;
    }
}
