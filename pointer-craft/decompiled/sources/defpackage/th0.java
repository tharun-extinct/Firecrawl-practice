package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class th0 implements cz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 t;

    public /* synthetic */ th0(my1 my1Var, byte b) {
        this.j = b;
        this.t = my1Var;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        ja3 ja3Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj2;
                ((Integer) obj3).getClass();
                h02Var.X(-756081143);
                hb2 hb2Var = (hb2) h02Var.a(db2.g);
                if (hb2Var != null) {
                    h02Var.X(-1604682242);
                    h02Var.b(false);
                    ja3Var = null;
                } else {
                    h02Var.X(-1604549624);
                    Object objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = du4.n(h02Var);
                    }
                    ja3Var = (ja3) objK;
                    h02Var.b(false);
                }
                j73 j73VarG = ue5.G(g73.g, ja3Var, hb2Var, true, null, this.t);
                h02Var.b(false);
                return j73VarG;
            case 1:
                h02 h02Var2 = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c93.x(this.t, null, false, null, null, null, null, null, a11.c, h02Var2, 805306368, 510);
                } else {
                    h02Var2.Q();
                }
                return og5Var;
            case 2:
                h02 h02Var3 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((di) obj).getClass();
                if (h02Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    k33.w(this.t, null, false, null, null, mz5.u, h02Var3, 1572864, 62);
                } else {
                    h02Var3.Q();
                }
                return og5Var;
            default:
                v33 v33Var = (v33) obj;
                p33 p33Var = (p33) obj2;
                ws0 ws0Var = (ws0) obj3;
                float f = ((vb1) this.t.g()).j;
                us3 us3VarV = p33Var.v(ws0.y(ws0Var.g, 0, 0, zs0.x(vb1.y(f, Float.NaN) ? 0 : v33Var.V(f), ws0Var.g), 0, 11));
                return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new sw(us3VarV, (byte) 6));
        }
    }
}
