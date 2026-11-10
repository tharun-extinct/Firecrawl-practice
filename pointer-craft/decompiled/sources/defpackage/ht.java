package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ht implements bz1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ g61 t;

    public /* synthetic */ ht(g61 g61Var, byte b) {
        this.j = b;
        this.t = g61Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        g61 g61Var = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    t92.g(ra.d(g61Var), null, null, 0L, h02Var, 48, 12);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    g75.y(String.valueOf(g61Var.j), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262142);
                }
                break;
            case 2:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    j73 j73VarH0 = ue5.h0(g73.g, 12.0f, 10.0f, 4.0f, 10.0f);
                    kb4 kb4VarG = jb4.g(new yq(8.0f, true, new l0((byte) 2)), hi0.u, h02Var3, 54);
                    int iHashCode = Long.hashCode(h02Var3.T);
                    tr3 tr3VarQ = h02Var3.q();
                    j73 j73VarW = m50.W(h02Var3, j73VarH0);
                    jo0.n.getClass();
                    h02Var3.b0();
                    if (h02Var3.S) {
                        h02Var3.m(um2.Z);
                    } else {
                        h02Var3.l0();
                    }
                    xs2.E(tg1.w, h02Var3, kb4VarG);
                    xs2.E(tg1.q, h02Var3, tr3VarQ);
                    xs2.E(tg1.c, h02Var3, Integer.valueOf(iHashCode));
                    xs2.D(h02Var3);
                    xs2.E(tg1.m, h02Var3, j73VarW);
                    if (g61Var == null) {
                        h02Var3.X(1972557438);
                        h02Var3.b(false);
                    } else {
                        h02Var3.X(1972557439);
                        t92.g(ra.d(g61Var), null, null, 0L, h02Var3, 48, 12);
                        h02Var3.b(false);
                    }
                    String str = g61Var != null ? g61Var.j : null;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    vf1 vf1Var = of5.g;
                    g75.y(str2, new tp2(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((mf5) h02Var3.a(vf1Var)).a, h02Var3, 0, 24960, 110588);
                    if (g61Var == null) {
                        h02Var3.X(1972992678);
                        h02Var3.b(false);
                    } else {
                        h02Var3.X(1972992679);
                        g75.y(xs2.I(ra.e(g61Var).y, h02Var3), null, ((rj0) h02Var3.a(tj0.g)).u, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((mf5) h02Var3.a(vf1Var)).q, h02Var3, 0, 24576, 114682);
                        h02Var3.b(false);
                    }
                    t92.g(k33.H(), null, null, ((rj0) h02Var3.a(tj0.g)).u, h02Var3, 48, 4);
                    h02Var3.b(true);
                }
                break;
            default:
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    h02Var4.Q();
                } else {
                    t92.g(ra.d(g61Var), null, null, 0L, h02Var4, 48, 12);
                }
                break;
        }
        return og5Var;
    }
}
