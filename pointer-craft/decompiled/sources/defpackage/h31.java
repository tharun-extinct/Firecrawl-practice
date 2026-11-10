package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class h31 {
    public static final h31 g = new h31();

    public final void g(yp4 yp4Var, h02 h02Var, int i) {
        h02 h02Var2 = h02Var;
        float f = yp4Var.l;
        h02Var2.Z(2137486921);
        byte b = 2;
        int i2 = i | (h02Var2.x(yp4Var) ? 4 : 2);
        byte b2 = 1;
        if (h02Var2.N(i2 & 1, (i2 & 3) != 2)) {
            bb5 bb5Var = yp4Var.t;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                l0.u("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zX = h02Var2.x(bb5Var) | h02Var2.x(null);
            Object objK = h02Var2.K();
            l76 l76Var = oo0.g;
            if (zX || objK == l76Var) {
                objK = pt4.y(new g31(yp4Var, (byte) 0));
                h02Var2.i0(objK);
            }
            bw4 bw4VarG = aq4.g(((jj0) ((bw4) objK).getValue()).g, jr2.F(f83.a, h02Var2), null, h02Var2, 0, 12);
            nm0 nm0VarM0 = ue5.m0(-1658896622, new q9(yp4Var, b2), h02Var2);
            h02Var2.X(690108113);
            h02Var2.b(false);
            j73 j73Var = yp4Var.g;
            g73 g73Var = g73.g;
            j73 j73VarN = j73Var.n(g73Var);
            boolean zX2 = h02Var2.x(bw4VarG);
            Object objK2 = h02Var2.K();
            if (zX2 || objK2 == l76Var) {
                objK2 = new z6(bw4VarG, (byte) 12);
                h02Var2.i0(objK2);
            }
            j73 j73VarW = a11.w(j73VarN, (xy1) objK2);
            Object objK3 = h02Var2.K();
            if (objK3 == l76Var) {
                objK3 = new q21(b);
                h02Var2.i0(objK3);
            }
            j73 j73VarG = dj4.g(j73VarW, false, (xy1) objK3);
            Object objK4 = h02Var2.K();
            if (objK4 == l76Var) {
                objK4 = f31.y;
                h02Var2.i0(objK4);
            }
            j73 j73VarG2 = b05.g(j73VarG, og5.g, (PointerInputEventHandler) objK4);
            t33 t33VarR = z50.r(hi0.t, false);
            int iS = pw5.s(h02Var2);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW2 = m50.W(h02Var2, j73VarG2);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, t33VarR);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var2.S || !yf2.p(h02Var2.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var2, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var2, j73VarW2);
            j73 j73VarO = y94.o(yf2.d0(g73Var, yp4Var.j));
            vf1 vf1Var = mk.g;
            boolean z = (i2 & 14) == 4;
            Object objK5 = h02Var2.K();
            if (z || objK5 == l76Var) {
                objK5 = new e31();
                h02Var2.i0(objK5);
            }
            jq1 jq1Var = (jq1) objK5;
            long j = bb5Var.r;
            long j2 = bb5Var.n;
            long j3 = bb5Var.v;
            long j4 = bb5Var.x;
            nm0 nm0Var = yp4Var.y;
            k85 k85Var = yp4Var.r;
            k85 k85Var2 = yp4Var.n;
            nm0 nm0Var2 = yp4Var.v;
            float f2 = yp4Var.l;
            Object objK6 = h02Var2.K();
            if (objK6 == l76Var) {
                objK6 = new cp0((byte) 27);
                h02Var2.i0(objK6);
            }
            mk.r(j73VarO, jq1Var, j, j2, j4, j3, nm0Var, k85Var, k85Var2, (my1) objK6, nm0Var2, nm0VarM0, f2, h02Var2, 0);
            h02Var2 = h02Var2;
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new vn((byte) 7, i, this, yp4Var);
        }
    }
}
