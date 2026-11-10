package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca2 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object w;

    public /* synthetic */ ca2(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.q = obj3;
        this.w = obj4;
        this.t = i;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        Object obj3 = this.m;
        og5 og5Var = og5.g;
        int i = this.t;
        Object obj4 = this.w;
        Object obj5 = this.q;
        Object obj6 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ra.t((he) obj6, (String) obj3, (o22) obj5, (mj0) obj4, (h02) obj, aq2.J(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(i | 1);
                aq2.n((Boolean) obj6, this.m, (gu2) obj5, (xy1) obj4, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                lr2.g((p04) obj6, (xy1) obj3, (o22) obj5, (Integer) obj4, (h02) obj, aq2.J(i | 1));
                break;
        }
        return og5Var;
    }
}
