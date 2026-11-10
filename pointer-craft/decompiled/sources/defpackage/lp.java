package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lp implements bz1 {
    public final /* synthetic */ bz1 a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ long t;

    public /* synthetic */ lp(long j, nf5 nf5Var, bz1 bz1Var, int i) {
        this.t = j;
        this.m = nf5Var;
        this.a = bz1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                w12 w12Var = (w12) obj3;
                h02 h02Var = (h02) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && h02Var.e()) {
                    h02Var.Q();
                } else {
                    w12Var.getClass();
                    kq2.g(0, this.t, this.a, h02Var, oq4.g);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int iJ = aq2.J(49);
                lr2.j(this.t, (nf5) obj3, this.a, (h02) obj, iJ);
                break;
        }
        return og5Var;
    }

    public /* synthetic */ lp(w12 w12Var, long j, bz1 bz1Var) {
        this.m = w12Var;
        this.t = j;
        this.a = bz1Var;
    }
}
