package defpackage;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uf6 {
    public static ha2 g;

    public static final void g(final j73 j73Var, final xq xqVar, ar arVar, j00 j00Var, int i, int i2, final nm0 nm0Var, h02 h02Var, final int i3) {
        final ar arVar2;
        final j00 j00Var2;
        final int i4;
        final int i5;
        h02Var.Z(-1303174015);
        int i6 = i3 | (h02Var.x(j73Var) ? 4 : 2) | 224640;
        if (h02Var.N(i6 & 1, (599187 & i6) != 599186)) {
            vq vqVar = v70.n;
            j00 j00Var3 = hi0.p;
            y(j73Var, xqVar, aj6.w, nm0Var, h02Var, (i6 & 14) | 14380464);
            arVar2 = vqVar;
            j00Var2 = j00Var3;
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
        } else {
            h02Var.Q();
            arVar2 = arVar;
            j00Var2 = j00Var;
            i4 = i;
            i5 = i2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(xqVar, arVar2, j00Var2, i4, i5, nm0Var, i3) { // from class: ss1
                public final /* synthetic */ ar a;
                public final /* synthetic */ nm0 c;
                public final /* synthetic */ j00 m;
                public final /* synthetic */ int q;
                public final /* synthetic */ xq t;
                public final /* synthetic */ int w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(1572913);
                    uf6.g(this.j, this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static v1 r(Locale locale) {
        v1 v1Var = v1.v;
        if (v1Var != null) {
            return v1Var;
        }
        v1 v1Var2 = new v1((byte) 0);
        v1Var2.n = BreakIterator.getCharacterInstance(locale);
        v1.v = v1Var2;
        return v1Var2;
    }

    public static final void y(j73 j73Var, xq xqVar, aj6 aj6Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        int i3;
        int i4;
        Object obj = hi0.p;
        vq vqVar = v70.n;
        h02Var.Z(-1956591841);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(xqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.x(vqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.x(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.n(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.n(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= h02Var.x(aj6Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= h02Var.j(nm0Var) ? 8388608 : 4194304;
        }
        int i5 = i2;
        if (h02Var.N(i5 & 1, (i5 & 4793491) != 4793490)) {
            int i6 = i5 & 3670016;
            boolean z = i6 == 1048576;
            Object objK = h02Var.K();
            Object obj2 = oo0.g;
            if (z || objK == obj2) {
                aj6Var.getClass();
                objK = new us1();
                h02Var.i0(objK);
            }
            us1 us1Var = (us1) objK;
            int i7 = i5 >> 3;
            boolean zX = ((((i7 & 896) ^ 384) > 256 && h02Var.x(obj)) || (i7 & 384) == 256) | ((((i7 & 14) ^ 6) > 4 && h02Var.x(xqVar)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && h02Var.x(vqVar)) || (i7 & 48) == 32) | ((((i7 & 7168) ^ 3072) > 2048 && h02Var.n(Integer.MAX_VALUE)) || (i7 & 3072) == 2048) | ((((57344 & i7) ^ 24576) > 16384 && h02Var.n(Integer.MAX_VALUE)) || (i7 & 24576) == 16384) | h02Var.x(us1Var);
            Object objK2 = h02Var.K();
            if (zX || objK2 == obj2) {
                i3 = i6;
                i4 = 8388608;
                Object ws1Var = new ws1(xqVar, vqVar, xqVar.g(), new by0(), 0.0f, us1Var);
                h02Var.i0(ws1Var);
                objK2 = ws1Var;
            } else {
                i3 = i6;
                i4 = 8388608;
            }
            ws1 ws1Var2 = (ws1) objK2;
            boolean z2 = (i3 == 1048576) | ((i5 & 29360128) == i4) | ((i5 & 458752) == 131072);
            Object objK3 = h02Var.K();
            Object obj3 = objK3;
            if (z2 || objK3 == obj2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new nm0(-1192950673, true, new f6(nm0Var)));
                aj6Var.getClass();
                h02Var.i0(arrayList);
                obj3 = arrayList;
            }
            nm0 nm0VarO = yf2.o((List) obj3);
            boolean zX2 = h02Var.x(ws1Var2);
            Object objK4 = h02Var.K();
            if (zX2 || objK4 == obj2) {
                objK4 = new b93(ws1Var2);
                h02Var.i0(objK4);
            }
            t33 t33Var = (t33) objK4;
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
            xs2.E(tg1.w, h02Var, t33Var);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            du4.h(0, nm0VarO, h02Var, true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new g6(j73Var, xqVar, aj6Var, nm0Var, i);
        }
    }
}
