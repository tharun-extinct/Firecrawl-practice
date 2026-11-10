package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cb implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ long t;

    public /* synthetic */ cb(Object obj, Object obj2, long j, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.t = j;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.m;
        Object obj4 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(1);
                gb.g((cj3) obj4, (j73) obj3, this.t, (h02) obj, iJ);
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ2 = aq2.J(1);
                zb6.r((String) obj4, (String) obj3, this.t, (h02) obj, iJ2);
                break;
        }
        return og5Var;
    }
}
