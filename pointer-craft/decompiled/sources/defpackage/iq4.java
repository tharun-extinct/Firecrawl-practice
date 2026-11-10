package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iq4 implements bz1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ pq4 m;
    public final /* synthetic */ bz1 t;

    public /* synthetic */ iq4(int i, long j, bz1 bz1Var, pq4 pq4Var) {
        this.m = pq4Var;
        this.a = j;
        this.t = bz1Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kq2.g(aq2.J(1), this.a, this.t, (h02) obj, this.m);
                return og5Var;
            default:
                h02 h02Var = (h02) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && h02Var.e()) {
                    h02Var.Q();
                } else {
                    Object objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = kq4.i;
                        h02Var.i0(objK);
                    }
                    my1 my1Var = (my1) ((nz1) objK);
                    h02Var.Y(-683746039);
                    h02Var.Y(-548224868);
                    if (!(h02Var.g instanceof lq)) {
                        pw5.f();
                        throw null;
                    }
                    h02Var.V();
                    if (h02Var.S) {
                        h02Var.m(my1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(new od4((byte) 19), h02Var, new yb1(this.a));
                    xs2.E(new od4((byte) 20), h02Var, this.m);
                    this.t.l(h02Var, 0);
                    h02Var.b(true);
                    h02Var.b(false);
                    h02Var.b(false);
                }
                return og5Var;
        }
    }

    public /* synthetic */ iq4(bz1 bz1Var, long j, pq4 pq4Var) {
        this.t = bz1Var;
        this.a = j;
        this.m = pq4Var;
    }
}
