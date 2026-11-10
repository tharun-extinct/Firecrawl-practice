package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ft implements bz1 {
    public final /* synthetic */ g61 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ g61 t;

    public /* synthetic */ ft(g61 g61Var, g61 g61Var2, byte b) {
        this.j = b;
        this.t = g61Var;
        this.a = g61Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        g61 g61Var = this.a;
        g61 g61Var2 = this.t;
        switch (b) {
            case 0:
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h02Var.Q();
                } else {
                    ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var, 0);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, g73.g);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(um2.Z);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, ek0VarG);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    String str = g61Var2.j;
                    if (str == null) {
                        str = "Unknown";
                    }
                    g75.y(str, null, 0L, 0L, yf2.p(g61Var2.t, g61Var != null ? g61Var.t : null) ? qv1.f : qv1.z, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(of5.g)).a, h02Var, 0, 0, 131006);
                    h02Var.b(true);
                }
                break;
            default:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    String str2 = g61Var2.j;
                    if (str2 == null) {
                        str2 = "";
                    }
                    g75.y(str2, null, 0L, 0L, yf2.p(g61Var2.t, g61Var != null ? g61Var.t : null) ? qv1.f : null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var2, 0, 0, 262078);
                }
                break;
        }
        return og5Var;
    }
}
