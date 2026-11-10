package defpackage;

import android.widget.PopupWindow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vd6 {
    public static final sj0 g;
    public static final sj0 n;
    public static final float r;
    public static final float v;
    public static final sj0 x;
    public static final sj0 y;

    static {
        sj0 sj0Var = sj0.i;
        g = sj0Var;
        y = sj0Var;
        r = 20.0f;
        n = sj0.u;
        v = 40.0f;
        x = sj0.b;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26251. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void g(defpackage.k65 r62, defpackage.xy1 r63, defpackage.j73 r64, defpackage.k85 r65, defpackage.zm5 r66, defpackage.xy1 r67, defpackage.ja3 r68, defpackage.cu4 r69, boolean r70, int r71, int r72, defpackage.ma2 r73, defpackage.si2 r74, boolean r75, boolean r76, defpackage.nm0 r77, defpackage.h02 r78, int r79, int r80) {
        /*
            Method dump skipped, instruction units count: 2625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd6.g(k65, xy1, j73, k85, zm5, xy1, ja3, cu4, boolean, int, int, ma2, si2, boolean, boolean, nm0, h02, int, int):void");
    }

    public static final void j(v65 v65Var, mt2 mt2Var, k65 k65Var, ma2 ma2Var, aj3 aj3Var) {
        rk4 rk4Var = mt2Var.n;
        kw0 kw0Var = mt2Var.o;
        kw0 kw0Var2 = mt2Var.f;
        u54 u54Var = new u54();
        q2 q2Var = new q2((Object) rk4Var, (Object) kw0Var, (Object) u54Var, (byte) 27);
        xt3 xt3Var = v65Var.g;
        xt3Var.g(k65Var, ma2Var, q2Var, kw0Var2);
        y65 y65Var = new y65(v65Var, xt3Var);
        v65Var.y.set(y65Var);
        u54Var.j = y65Var;
        mt2Var.v = y65Var;
        x(mt2Var, k65Var, aj3Var);
    }

    public static void l(PopupWindow popupWindow) {
        popupWindow.setWindowLayoutType(2);
    }

    public static final void n(b65 b65Var, h02 h02Var, int i) {
        cj cjVarM;
        h02Var.Z(-1436003720);
        byte b = 4;
        int i2 = (h02Var.j(b65Var) ? 4 : 2) | i;
        byte b2 = 1;
        byte b3 = 0;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            mt2 mt2Var = b65Var.n;
            if (mt2Var == null || !((Boolean) mt2Var.i.getValue()).booleanValue() || (cjVarM = b65Var.m()) == null || cjVarM.t.length() <= 0) {
                h02Var.X(-2111042550);
                h02Var.b(false);
            } else {
                h02Var.X(-2112351432);
                boolean zX = h02Var.x(b65Var);
                Object objK = h02Var.K();
                l76 l76Var = oo0.g;
                if (zX || objK == l76Var) {
                    objK = new w55(b65Var);
                    h02Var.i0(objK);
                }
                r45 r45Var = (r45) objK;
                j51 j51Var = (j51) h02Var.a(hp0.j);
                aj3 aj3Var = b65Var.y;
                long j = b65Var.q().y;
                int i3 = u75.r;
                int iJ = aj3Var.j((int) (j >> 32));
                mt2 mt2Var2 = b65Var.n;
                k75 k75VarN = mt2Var2 != null ? mt2Var2.n() : null;
                k75VarN.getClass();
                j75 j75Var = k75VarN.g;
                k44 k44VarR = j75Var.r(xs2.w(iJ, 0, j75Var.g.g.t.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((j51Var.e(2.0f) / 2.0f) + k44VarR.g)) << 32) | (((long) Float.floatToRawIntBits(k44VarR.n)) & 4294967295L);
                boolean zV = h02Var.v(jFloatToRawIntBits);
                Object objK2 = h02Var.K();
                if (zV || objK2 == l76Var) {
                    objK2 = new sw0(jFloatToRawIntBits);
                    h02Var.i0(objK2);
                }
                cj3 cj3Var = (cj3) objK2;
                boolean zJ = h02Var.j(r45Var) | h02Var.j(b65Var);
                Object objK3 = h02Var.K();
                if (zJ || objK3 == l76Var) {
                    objK3 = new uw0(r45Var, b65Var, b3);
                    h02Var.i0(objK3);
                }
                j73 j73VarG = b05.g(g73.g, r45Var, (PointerInputEventHandler) objK3);
                boolean zV2 = h02Var.v(jFloatToRawIntBits);
                Object objK4 = h02Var.K();
                if (zV2 || objK4 == l76Var) {
                    objK4 = new eb(jFloatToRawIntBits, b2);
                    h02Var.i0(objK4);
                }
                gb.g(cj3Var, dj4.g(j73VarG, false, (xy1) objK4), 0L, h02Var, 0);
                h02Var.b(false);
            }
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ed(b65Var, i, b);
        }
    }

    public static final void r(b65 b65Var, boolean z, h02 h02Var, int i) {
        k75 k75VarN;
        h02Var.Z(626339208);
        int i2 = (h02Var.j(b65Var) ? 4 : 2) | i | (h02Var.l(z) ? 32 : 16);
        byte b = 1;
        if (!h02Var.N(i2 & 1, (i2 & 19) != 18)) {
            h02Var.Q();
        } else if (z) {
            h02Var.X(1530097388);
            mt2 mt2Var = b65Var.n;
            j75 j75Var = null;
            if (mt2Var != null && (k75VarN = mt2Var.n()) != null) {
                j75 j75Var2 = k75VarN.g;
                mt2 mt2Var2 = b65Var.n;
                if (!(mt2Var2 != null ? mt2Var2.b : true)) {
                    j75Var = j75Var2;
                }
            }
            if (j75Var == null) {
                h02Var.X(1530097387);
                h02Var.b(false);
            } else {
                h02Var.X(1530097388);
                if (u75.r(b65Var.q().y)) {
                    h02Var.X(2110860558);
                    h02Var.b(false);
                } else {
                    h02Var.X(2109807302);
                    int iJ = b65Var.y.j((int) (b65Var.q().y >> 32));
                    int iJ2 = b65Var.y.j((int) (b65Var.q().y & 4294967295L));
                    n74 n74VarG = j75Var.g(iJ);
                    n74 n74VarG2 = j75Var.g(Math.max(iJ2 - 1, 0));
                    mt2 mt2Var3 = b65Var.n;
                    if (mt2Var3 == null || !((Boolean) mt2Var3.w.getValue()).booleanValue()) {
                        h02Var.X(2110490542);
                        h02Var.b(false);
                    } else {
                        h02Var.X(2110225306);
                        be2.g(true, n74VarG, b65Var, h02Var, ((i2 << 6) & 896) | 6);
                        h02Var.b(false);
                    }
                    mt2 mt2Var4 = b65Var.n;
                    if (mt2Var4 == null || !((Boolean) mt2Var4.c.getValue()).booleanValue()) {
                        h02Var.X(2110838734);
                        h02Var.b(false);
                    } else {
                        h02Var.X(2110574459);
                        be2.g(false, n74VarG2, b65Var, h02Var, ((i2 << 6) & 896) | 6);
                        h02Var.b(false);
                    }
                    h02Var.b(false);
                }
                mt2 mt2Var5 = b65Var.n;
                if (mt2Var5 != null) {
                    tp3 tp3Var = mt2Var5.q;
                    if (!yf2.p(b65Var.z.g.t, b65Var.q().g.t)) {
                        tp3Var.setValue(Boolean.FALSE);
                    }
                    if (mt2Var5.y()) {
                        if (((Boolean) tp3Var.getValue()).booleanValue()) {
                            b65Var.u();
                        } else {
                            b65Var.w();
                        }
                    }
                }
                h02Var.b(false);
            }
            h02Var.b(false);
        } else {
            h02Var.X(1989076778);
            h02Var.b(false);
            b65Var.w();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new db(b65Var, z, i, b);
        }
    }

    public static final void v(mt2 mt2Var) {
        y65 y65Var = mt2Var.v;
        if (y65Var != null) {
            mt2Var.o.a(k65.g((k65) mt2Var.n.t, null, 0L, 3));
            v65 v65Var = y65Var.g;
            AtomicReference atomicReference = v65Var.y;
            while (!atomicReference.compareAndSet(y65Var, null)) {
                if (atomicReference.get() != y65Var) {
                }
            }
            v65Var.g.l();
        }
        mt2Var.v = null;
    }

    public static final void x(mt2 mt2Var, k65 k65Var, aj3 aj3Var) {
        at4 at4VarM = js2.m();
        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
        at4 at4VarB = js2.b(at4VarM);
        try {
            k75 k75VarN = mt2Var.n();
            if (k75VarN == null) {
                return;
            }
            y65 y65Var = mt2Var.v;
            if (y65Var == null) {
                return;
            }
            bl2 bl2VarR = mt2Var.r();
            if (bl2VarR == null) {
                return;
            }
            lh6.r(k65Var, mt2Var.g, k75VarN.g, bl2VarR, y65Var, mt2Var.y(), aj3Var);
        } finally {
            js2.z(at4VarM, at4VarB, xy1VarV);
        }
    }

    public static final void y(j73 j73Var, b65 b65Var, nm0 nm0Var, h02 h02Var, int i) {
        h02Var.Z(2036174316);
        int i2 = (h02Var.x(j73Var) ? 4 : 2) | i | (h02Var.j(b65Var) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            t33 t33VarR = z50.r(hi0.t, true);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73Var);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            rd6.g(b65Var, nm0Var, h02Var, (i2 >> 3) & 126);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new r2((Object) j73Var, (Object) b65Var, (Object) nm0Var, i, (byte) 12);
        }
    }
}
