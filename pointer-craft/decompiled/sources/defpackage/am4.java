package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class am4 implements bz1 {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ ob3 c;
    public final /* synthetic */ byte j;
    public final /* synthetic */ String[] m;
    public final /* synthetic */ xy1 q;
    public final /* synthetic */ hm3 t;
    public final /* synthetic */ st4 w;

    public /* synthetic */ am4(hm3 hm3Var, String[] strArr, String[] strArr2, xy1 xy1Var, st4 st4Var, ob3 ob3Var, byte b) {
        this.j = b;
        this.t = hm3Var;
        this.a = strArr;
        this.m = strArr2;
        this.q = xy1Var;
        this.w = st4Var;
        this.c = ob3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    uz4.g(mq4.c(mq4.b(g73.g)), ((un4) h02Var.a(vn4.g)).n, 0L, 0L, 0.0f, 0.0f, null, ue5.m0(-647646709, new am4(this.t, this.a, this.m, this.q, this.w, this.c, (byte) 1), h02Var), h02Var, 12582918, 108);
                }
                break;
            default:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    g73 g73Var = g73.g;
                    j73 j73VarI0 = ue5.i0(g73Var, 0.0f, 16.0f, 0.0f, 16.0f, 5);
                    ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var2, 0);
                    int iHashCode = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ = h02Var2.q();
                    j73 j73VarW = m50.W(h02Var2, j73VarI0);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(um2.Z);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, ek0VarG);
                    xs2.E(tg1.q, h02Var2, tr3VarQ);
                    xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
                    xs2.D(h02Var2);
                    xs2.E(tg1.m, h02Var2, j73VarW);
                    hm3 hm3Var = this.t;
                    g75.y(a11.C(hm3Var.g, h02Var2), ue5.e0(g73Var, 16.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(of5.g)).l, h02Var2, 48, 0, 131068);
                    tp2 tp2Var = new tp2(1.0f, false);
                    String[] strArr = this.a;
                    boolean zJ = h02Var2.j(strArr);
                    String[] strArr2 = this.m;
                    boolean zJ2 = zJ | h02Var2.j(strArr2) | h02Var2.j(hm3Var);
                    xy1 xy1Var = this.q;
                    boolean zX = zJ2 | h02Var2.x(xy1Var);
                    Object objK = h02Var2.K();
                    l76 l76Var = oo0.g;
                    if (zX || objK == l76Var) {
                        qc qcVar = new qc(strArr, xy1Var, strArr2, hm3Var, this.w);
                        h02Var2.i0(qcVar);
                        objK = qcVar;
                    }
                    aq2.g(tp2Var, null, null, null, null, null, false, null, (xy1) objK, h02Var2, 0, 510);
                    Object objK2 = h02Var2.K();
                    if (objK2 == l76Var) {
                        objK2 = new za4(this.c, (byte) 9);
                        h02Var2.i0(objK2);
                    }
                    c93.s((my1) objK2, ue5.i0(g73Var, 0.0f, 0.0f, 16.0f, 0.0f, 11).n(new d72(hi0.f)), false, null, null, null, sz5.y, h02Var2, 805306374, 508);
                    h02Var2.b(true);
                }
                break;
        }
        return og5Var;
    }
}
