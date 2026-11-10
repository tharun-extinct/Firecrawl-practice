package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wd implements bz1 {
    public final /* synthetic */ ob3 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ sv3 t;

    public /* synthetic */ wd(sv3 sv3Var, ob3 ob3Var, byte b) {
        this.j = b;
        this.t = sv3Var;
        this.a = ob3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.a;
        sv3 sv3Var = this.t;
        byte b2 = 1;
        h02 h02Var = (h02) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    og0.y(de.y.g(Boolean.TRUE), ue5.m0(1022273628, new wd(sv3Var, ob3Var, b2), h02Var), h02Var, 56);
                }
                break;
            default:
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    Object objK = h02Var.K();
                    l76 l76Var = oo0.g;
                    if (objK == l76Var) {
                        objK = new m9((byte) 5);
                        h02Var.i0(objK);
                    }
                    j73 j73VarG = dj4.g(g73.g, false, (xy1) objK);
                    boolean zJ = h02Var.j(sv3Var);
                    Object objK2 = h02Var.K();
                    if (zJ || objK2 == l76Var) {
                        objK2 = new vd(sv3Var, (byte) 0);
                        h02Var.i0(objK2);
                    }
                    j73 j73VarY = jg6.y(uc6.v(j73VarG, (xy1) objK2), sv3Var.getCanCalculatePosition() ? 1.0f : 0.0f);
                    bz1 bz1Var = (bz1) ob3Var.getValue();
                    Object objK3 = h02Var.K();
                    if (objK3 == l76Var) {
                        objK3 = mb.r;
                        h02Var.i0(objK3);
                    }
                    t33 t33Var = (t33) objK3;
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, j73VarY);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, t33Var);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    du4.o(0, bz1Var, h02Var, true);
                }
                break;
        }
        return og5Var;
    }
}
