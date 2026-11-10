package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yn implements bz1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ my1 t;

    public /* synthetic */ yn(my1 my1Var, my1 my1Var2, byte b) {
        this.j = b;
        this.t = my1Var;
        this.a = my1Var2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        sx1 sx1Var = um2.Z;
        g73 g73Var = g73.g;
        og5 og5Var = og5.g;
        my1 my1Var = this.a;
        my1 my1Var2 = this.t;
        byte b2 = 2;
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
                    j73 j73VarW = m50.W(h02Var, g73Var);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, ek0VarG);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    g75.y(xs2.I(R.string.keyboard_banner_text, h02Var), ue5.e0(g73Var, 16.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var.a(of5.g)).m, h02Var, 48, 0, 131068);
                    uf6.g(ue5.e0(g73Var, 8.0f).n(new d72(hi0.f)), new yq(8.0f, true, new up((byte) 1)), null, null, 0, 0, ue5.m0(1645726465, new ev0(my1Var2, my1Var, b2), h02Var), h02Var, 1572912);
                    h02Var.b(true);
                }
                break;
            case 1:
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                } else {
                    kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var2, 48);
                    int iHashCode2 = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ2 = h02Var2.q();
                    j73 j73VarW2 = m50.W(h02Var2, g73Var);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(sx1Var);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, kb4VarG);
                    xs2.E(tg1.q, h02Var2, tr3VarQ2);
                    xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode2));
                    xs2.D(h02Var2);
                    xs2.E(tg1.m, h02Var2, j73VarW2);
                    yf2.j(xs2.I(R.string.classic_mode_setup_button_unlocked, h02Var2), my1Var2, null, h02Var2, 0);
                    mq2.y(h02Var2, mq4.q(g73Var, 8.0f));
                    yf2.j(xs2.I(R.string.button_restart_bluetooth, h02Var2), my1Var, null, h02Var2, 0);
                    h02Var2.b(true);
                }
                break;
            default:
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else {
                    boolean zX = h02Var3.x(my1Var2) | h02Var3.x(my1Var);
                    Object objK = h02Var3.K();
                    if (zX || objK == oo0.g) {
                        objK = new o82((Object) my1Var2, (Object) my1Var, (byte) 6);
                        h02Var3.i0(objK);
                    }
                    c93.s((my1) objK, null, false, null, null, null, mz5.b, h02Var3, 805306368, 510);
                }
                break;
        }
        return og5Var;
    }
}
