package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class et implements bz1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ j73 t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ et(int i, String str, String str2, j73 j73Var, int i2) {
        this.a = i;
        this.m = str;
        this.q = str2;
        this.t = j73Var;
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
                int iJ = aq2.J(7);
                ot.w(this.a, (String) obj4, (String) obj3, this.t, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(1);
                ju0.y(this.t, (gu0) obj4, (xy1) obj3, (h02) obj, iJ2, this.a);
                break;
        }
        return og5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ et(j73 j73Var, gu0 gu0Var, xy1 xy1Var, int i, int i2) {
        this.t = j73Var;
        this.m = gu0Var;
        this.q = xy1Var;
        this.a = i2;
    }
}
