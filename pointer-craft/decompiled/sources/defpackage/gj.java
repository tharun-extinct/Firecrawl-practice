package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class gj {
    public static final fp3 g;

    static {
        pi1 pi1Var = pi1.j;
        g = new fp3(pi1Var, pi1Var);
    }

    public static final void g(cj cjVar, List list, h02 h02Var, int i) {
        h02Var.Z(-1794596951);
        int i2 = (i & 6) == 0 ? (h02Var.x(cjVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= h02Var.j(list) ? 32 : 16;
        }
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                bj bjVar = (bj) list.get(i3);
                cz1 cz1Var = (cz1) bjVar.g;
                int i4 = bjVar.y;
                int i5 = bjVar.r;
                Object objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = mb.n;
                    h02Var.i0(objK);
                }
                t33 t33Var = (t33) objK;
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
                xs2.E(tg1.w, h02Var, t33Var);
                xs2.E(tg1.q, h02Var, tr3VarQ);
                xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                xs2.D(h02Var);
                xs2.E(tg1.m, h02Var, j73VarW);
                cz1Var.x(cjVar.subSequence(i4, i5).t, h02Var, 0);
                h02Var.b(true);
            }
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ej(b, i, cjVar, list);
        }
    }
}
