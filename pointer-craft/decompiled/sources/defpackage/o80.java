package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o80 implements bz1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ jz1 c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ int q;
    public final /* synthetic */ j73 t;
    public final /* synthetic */ Object w;

    public /* synthetic */ o80(j73 j73Var, boolean z, boolean z2, i05 i05Var, bz1 bz1Var, ve2 ve2Var, cn4 cn4Var, int i) {
        this.t = j73Var;
        this.a = z;
        this.m = z2;
        this.w = i05Var;
        this.c = bz1Var;
        this.i = ve2Var;
        this.b = cn4Var;
        this.q = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.b;
        Object obj4 = this.i;
        jz1 jz1Var = this.c;
        Object obj5 = this.w;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(1);
                rz5.m(this.t, this.a, this.m, (String) obj5, this.q, (xy1) jz1Var, (xy1) obj4, (xy1) obj3, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(this.q | 1);
                k05.y(this.t, this.a, this.m, (i05) obj5, (bz1) jz1Var, (ve2) obj4, (cn4) obj3, (h02) obj, iJ2);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ o80(j73 j73Var, boolean z, boolean z2, String str, int i, xy1 xy1Var, xy1 xy1Var2, xy1 xy1Var3, int i2) {
        this.t = j73Var;
        this.a = z;
        this.m = z2;
        this.w = str;
        this.q = i;
        this.c = xy1Var;
        this.i = xy1Var2;
        this.b = xy1Var3;
    }
}
