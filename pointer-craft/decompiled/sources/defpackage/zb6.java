package defpackage;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zb6 {
    public static ha2 g;

    public static final void g(final boolean z, final boolean z2, final j73 j73Var, h02 h02Var, final int i) {
        j73Var.getClass();
        h02Var.Z(1352923464);
        int i2 = (h02Var.l(z) ? 4 : 2) | i | (h02Var.l(z2) ? 32 : 16);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            t33 t33VarR = z50.r(hi0.w, false);
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
            if (z) {
                h02Var.X(1577541662);
                xs2.y(null, h02Var, 0, 1);
                h02Var.b(false);
            } else {
                h02Var.X(1577588844);
                gp4.n(z2, null, null, null, null, gz5.v, h02Var, ((i2 >> 3) & 14) | 196608, 30);
                h02Var.b(false);
            }
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(z, z2, j73Var, i) { // from class: uz1
                public final /* synthetic */ j73 a;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean t;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(385);
                    zb6.g(this.j, this.t, this.a, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final int n(aq3 aq3Var, int i) {
        int iA;
        int iA2;
        if (aq3Var.v(aq3Var.a(i))) {
            aq3Var.y(i);
            iA = i;
            while (iA != -1 && (aq3Var.t(iA) || !aq3Var.v(iA))) {
                iA = aq3Var.a(iA);
            }
        } else {
            aq3Var.y(i);
            if (aq3Var.n(i)) {
                if (!aq3Var.x(i) || aq3Var.j(i)) {
                    iA2 = aq3Var.a(i);
                    iA = iA2;
                } else {
                    iA = i;
                }
            } else if (aq3Var.j(i)) {
                iA2 = aq3Var.a(i);
                iA = iA2;
            } else {
                iA = -1;
            }
        }
        return iA == -1 ? i : iA;
    }

    public static final void r(String str, String str2, long j, h02 h02Var, int i) {
        long j2;
        long j3;
        str2.getClass();
        h02Var.Z(1345373041);
        int i2 = i | (h02Var.x(str) ? 4 : 2) | (h02Var.x(str2) ? 32 : 16) | 128;
        int i3 = 0;
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                j3 = ((rj0) h02Var.a(tj0.g)).a;
            } else {
                h02Var.Q();
                j3 = j;
            }
            h02Var.s();
            aj ajVar = new aj();
            String strQuote = Pattern.quote(str2);
            strQuote.getClass();
            e12 e12Var = new e12(y54.g(new y54(strQuote, 0), str));
            while (e12Var.hasNext()) {
                c23 c23Var = (c23) e12Var.next();
                int i4 = c23Var.g().j;
                int i5 = c23Var.g().t + 1;
                ajVar.y(str.substring(i3, i4));
                long j4 = j3;
                int iN = ajVar.n(new ju4(j3, 0L, (qv1) null, (lv1) null, (mv1) null, (lu1) null, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65534));
                try {
                    ajVar.y(str.substring(i4, i5));
                    ajVar.r(iN);
                    i3 = i5;
                    j3 = j4;
                } catch (Throwable th) {
                    ajVar.r(iN);
                    throw th;
                }
            }
            long j5 = j3;
            if (i3 < str.length()) {
                ajVar.y(str.substring(i3));
            }
            g75.r(ajVar.v(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, h02Var, 0, 0, 524286);
            j2 = j5;
        } else {
            h02Var.Q();
            j2 = j;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new cb(str, str2, j2, i, (byte) 1);
        }
    }

    public static final int v(aq3 aq3Var, int i) {
        int iM;
        int iM2;
        if (aq3Var.t(aq3Var.m(i))) {
            aq3Var.y(i);
            iM = i;
            while (iM != -1 && (!aq3Var.t(iM) || aq3Var.v(iM))) {
                iM = aq3Var.m(iM);
            }
        } else {
            aq3Var.y(i);
            if (aq3Var.j(i)) {
                if (!aq3Var.x(i) || aq3Var.n(i)) {
                    iM2 = aq3Var.m(i);
                    iM = iM2;
                } else {
                    iM = i;
                }
            } else if (aq3Var.n(i)) {
                iM2 = aq3Var.m(i);
                iM = iM2;
            } else {
                iM = -1;
            }
        }
        return iM == -1 ? i : iM;
    }

    public static final Object x(ss2 ss2Var, int i, zz4 zz4Var) {
        Object objQ = ss2.q(ss2Var, Math.max(i - 1, 0), zz4Var);
        return objQ == px0.j ? objQ : og5.g;
    }

    public static final void y(Integer num, int i, final bz1 bz1Var, boolean z, final xy1 xy1Var, h02 h02Var, int i2) {
        Object next;
        ox0 ox0Var;
        nm0 nm0Var;
        byte b;
        h02 h02Var2 = h02Var;
        bz1Var.getClass();
        xy1Var.getClass();
        h02Var2.Z(-1296489818);
        byte b2 = 2;
        int i3 = i2 | (h02Var2.x(num) ? 4 : 2) | (h02Var2.n(i) ? 32 : 16) | (h02Var2.j(bz1Var) ? 256 : 128) | (h02Var2.l(z) ? 2048 : 1024) | (h02Var2.j(xy1Var) ? 16384 : 8192);
        if (h02Var2.N(i3 & 1, (i3 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objK = h02Var2.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new ym0((byte) 26);
                h02Var2.i0(objK);
            }
            final ob3 ob3Var = (ob3) xq2.f(objArr, (my1) objK, h02Var2);
            final gx3 gx3Var = (gx3) h02Var2.a(gp0.y);
            final ss2 ss2VarG = us2.g(h02Var2);
            Object objK2 = h02Var2.K();
            if (objK2 == l76Var) {
                objK2 = k33.E(h02Var2);
                h02Var2.i0(objK2);
            }
            ox0 ox0Var2 = (ox0) objK2;
            Object objK3 = h02Var2.K();
            if (objK3 == l76Var) {
                objK3 = ft0.u6;
                h02Var2.i0(objK3);
            }
            final ik1 ik1Var = (ik1) objK3;
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objK4 = h02Var2.K();
            mu0 mu0Var = null;
            if (z2 || objK4 == l76Var) {
                t32 t32Var = ft0.m;
                int iIntValue = num != null ? num.intValue() : 0;
                t32Var.getClass();
                Iterator it = ft0.u6.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((ft0) next).j != iIntValue);
                ft0 ft0Var = (ft0) next;
                if (ft0Var != null) {
                    m50.T(ox0Var2, null, new d40(ss2VarG, ((jk1) ik1Var).indexOf(ft0Var), mu0Var, b2), 3);
                } else {
                    ft0Var = null;
                }
                objK4 = kq2.M(ft0Var);
                h02Var2.i0(objK4);
            }
            final ob3 ob3Var2 = (ob3) objK4;
            Object objK5 = h02Var2.K();
            if (objK5 == l76Var) {
                ox0Var = ox0Var2;
                objK5 = pt4.y(new xd(ik1Var, ob3Var, ox0Var, ss2VarG, ob3Var2, (byte) 1));
                h02Var2.i0(objK5);
            } else {
                ox0Var = ox0Var2;
            }
            final bw4 bw4Var = (bw4) objK5;
            ho1 ho1Var = mq4.r;
            Object objK6 = h02Var2.K();
            if (objK6 == l76Var) {
                objK6 = new wm0((byte) 24);
                h02Var2.i0(objK6);
            }
            j73 j73VarG = dj4.g(ho1Var, false, (xy1) objK6);
            t33 t33VarR = z50.r(hi0.t, false);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarG);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, t33VarR);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            j73 j73VarI0 = ue5.i0(e60.g.g(g73.g, hi0.a), 0.0f, 8.0f, 0.0f, 8.0f, 5);
            Object objK7 = h02Var2.K();
            if (objK7 == l76Var) {
                objK7 = new wm0((byte) 25);
                h02Var2.i0(objK7);
            }
            j73 j73VarG2 = dj4.g(j73VarI0, false, (xy1) objK7);
            String str = (String) ob3Var.getValue();
            if (z || ((String) ob3Var.getValue()).length() > 0) {
                h02Var2.X(1067667723);
                nm0 nm0VarM0 = ue5.m0(651948872, new ta(xy1Var, ob3Var, (byte) 15), h02Var2);
                h02Var2.b(false);
                nm0Var = nm0VarM0;
            } else {
                h02Var2.X(1067962130);
                h02Var2.b(false);
                nm0Var = null;
            }
            boolean zX = h02Var2.x(ob3Var);
            Object objK8 = h02Var2.K();
            if (zX || objK8 == l76Var) {
                objK8 = new ff(ob3Var, (byte) 10);
                h02Var2.i0(objK8);
            }
            xy1 xy1Var2 = (xy1) objK8;
            int i4 = 57344 & i3;
            boolean z3 = i4 == 16384;
            Object objK9 = h02Var2.K();
            if (z3 || objK9 == l76Var) {
                b = 2;
                objK9 = new tf(xy1Var, (byte) 2);
                h02Var2.i0(objK9);
            } else {
                b = 2;
            }
            final ox0 ox0Var3 = ox0Var;
            ah4.y(str, xy1Var2, (xy1) objK9, z, xy1Var, j73VarG2, false, gz5.y, gz5.r, nm0Var, null, null, ue5.m0(257067662, new cz1() { // from class: vz1
                @Override // defpackage.cz1
                public final Object x(Object obj, Object obj2, Object obj3) {
                    h02 h02Var3 = (h02) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    ((gk0) obj).getClass();
                    if (h02Var3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                        ik1 ik1Var2 = ik1Var;
                        boolean zJ = h02Var3.j(ik1Var2);
                        gx3 gx3Var2 = gx3Var;
                        boolean zJ2 = zJ | h02Var3.j(gx3Var2);
                        ob3 ob3Var3 = ob3Var;
                        boolean zX2 = zJ2 | h02Var3.x(ob3Var3);
                        xy1 xy1Var3 = xy1Var;
                        boolean zX3 = zX2 | h02Var3.x(xy1Var3);
                        ox0 ox0Var4 = ox0Var3;
                        boolean zJ3 = zX3 | h02Var3.j(ox0Var4);
                        ss2 ss2Var = ss2VarG;
                        boolean zX4 = zJ3 | h02Var3.x(ss2Var);
                        ob3 ob3Var4 = ob3Var2;
                        boolean zX5 = zX4 | h02Var3.x(ob3Var4);
                        bz1 bz1Var2 = bz1Var;
                        boolean zX6 = zX5 | h02Var3.x(bz1Var2);
                        Object objK10 = h02Var3.K();
                        if (zX6 || objK10 == oo0.g) {
                            tz1 tz1Var = new tz1(ox0Var4, ik1Var2, xy1Var3, bz1Var2, ss2Var, ob3Var3, ob3Var4, gx3Var2, bw4Var);
                            h02Var3.i0(tz1Var);
                            objK10 = tz1Var;
                        }
                        aq2.g(null, null, null, null, null, null, false, null, (xy1) objK10, h02Var3, 0, 511);
                    } else {
                        h02Var3.Q();
                    }
                    return og5.g;
                }
            }, h02Var2), h02Var2, i4 | (i3 & 7168) | 113246208);
            bo3 bo3VarS = ue5.s(0.0f, 72.0f, 0.0f, 16.0f, 5);
            yq yqVar = new yq(8.0f, true, new l0(b));
            boolean zJ = h02Var2.j(ik1Var) | h02Var2.j(gx3Var) | ((i3 & 896) == 256) | h02Var2.x(ob3Var2);
            Object objK10 = h02Var2.K();
            if (zJ || objK10 == l76Var) {
                qc qcVar = new qc(bw4Var, ik1Var, gx3Var, bz1Var, ob3Var2, (byte) 5);
                h02Var2.i0(qcVar);
                objK10 = qcVar;
            }
            aq2.g(null, ss2VarG, bo3VarS, yqVar, null, null, false, null, (xy1) objK10, h02Var, 24960, 489);
            h02Var2 = h02Var;
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new g81(num, i, bz1Var, z, xy1Var, i2);
        }
    }
}
