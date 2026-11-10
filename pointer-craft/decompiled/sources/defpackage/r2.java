package defpackage;

import android.view.View;
import androidx.compose.ui.tooling.PreviewActivity;
import io.appground.blek.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r2 implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ r2(my1 my1Var, xy1 xy1Var, my1 my1Var2) {
        this.j = (byte) 8;
        this.t = my1Var;
        this.m = xy1Var;
        this.a = my1Var2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Exception {
        long j;
        View view;
        long j2;
        byte b = this.j;
        byte b2 = 14;
        sx1 sx1Var = um2.Z;
        byte b3 = 9;
        l76 l76Var = oo0.g;
        boolean z = false;
        byte b4 = 3;
        og5 og5Var = og5.g;
        Object obj3 = this.m;
        Object obj4 = this.t;
        Object obj5 = this.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                bg6.g((gu2) obj5, (xy1) obj3, (my1) obj4, (h02) obj, aq2.J(1));
                return og5Var;
            case 1:
                ((Integer) obj2).getClass();
                tg6.g((my1) obj4, (o91) obj5, (nm0) obj3, (h02) obj, aq2.J(385));
                return og5Var;
            case 2:
                j73 j73Var = (j73) obj5;
                ob3 ob3Var = (ob3) obj3;
                nm0 nm0Var = (nm0) obj4;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = h02Var.K();
                    if (objK == l76Var) {
                        objK = new ff(ob3Var, z ? (byte) 1 : (byte) 0);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN = k33.N(j73Var, (xy1) objK);
                    t33 t33VarR = z50.r(hi0.t, true);
                    int iHashCode = Long.hashCode(h02Var.T);
                    tr3 tr3VarQ = h02Var.q();
                    j73 j73VarW = m50.W(h02Var, j73VarN);
                    jo0.n.getClass();
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(sx1Var);
                    } else {
                        h02Var.l0();
                    }
                    xs2.E(tg1.w, h02Var, t33VarR);
                    xs2.E(tg1.q, h02Var, tr3VarQ);
                    xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
                    xs2.D(h02Var);
                    xs2.E(tg1.m, h02Var, j73VarW);
                    du4.h(0, nm0Var, h02Var, true);
                } else {
                    h02Var.Q();
                }
                return og5Var;
            case 3:
                ((Integer) obj2).getClass();
                ot.x((qr0) obj5, (String) obj3, (my1) obj4, (h02) obj, aq2.J(9));
                return og5Var;
            case 4:
                ((Integer) obj2).getClass();
                iz5.g((j73) obj5, (u6) obj3, (nm0) obj4, (h02) obj, aq2.J(3073));
                return og5Var;
            case 5:
                ((Integer) obj2).getClass();
                rz5.a((b90) obj5, (g90) obj3, (String) obj4, (h02) obj, aq2.J(9));
                return og5Var;
            case 6:
                ((Integer) obj2).getClass();
                rz5.y((b90) obj5, (qr0) obj3, (g90) obj4, (h02) obj, aq2.J(583));
                return og5Var;
            case 7:
                List list = (List) obj5;
                qp3 qp3Var = (qp3) obj3;
                ob3 ob3Var2 = (ob3) obj4;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int i = 0;
                    for (Object obj6 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            pw5.R();
                            throw null;
                        }
                        String str = (String) obj6;
                        if (qp3Var.d() == i) {
                            h02Var2.X(739698471);
                            j = ((rj0) h02Var2.a(tj0.g)).g;
                            h02Var2.b(false);
                        } else {
                            h02Var2.X(739792990);
                            j = ((rj0) h02Var2.a(tj0.g)).u;
                            h02Var2.b(false);
                        }
                        h02 h02Var3 = h02Var2;
                        bw4 bw4VarG = aq4.g(j, null, "TabColor", h02Var3, 384, 10);
                        boolean z2 = qp3Var.d() == i;
                        boolean zX = h02Var3.x(qp3Var) | h02Var3.n(i) | h02Var3.x(ob3Var2);
                        Object objK2 = h02Var3.K();
                        if (zX || objK2 == l76Var) {
                            objK2 = new z80(i, qp3Var, ob3Var2);
                            h02Var3.i0(objK2);
                        }
                        p15.g(z2, (my1) objK2, null, false, 0L, 0L, ue5.m0(1747360309, new ev0(str, bw4VarG, b4), h02Var3), h02Var3, 12582912, 124);
                        i = i2;
                        h02Var2 = h02Var3;
                    }
                } else {
                    h02Var2.Q();
                }
                return og5Var;
            case 8:
                my1 my1Var = (my1) obj4;
                xy1 xy1Var = (xy1) obj3;
                my1 my1Var2 = (my1) obj5;
                h02 h02Var4 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (h02Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g73 g73Var = g73.g;
                    j73 j73VarE0 = ue5.e0(mq4.r(g73Var, 1.0f), 16.0f);
                    ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var4, 0);
                    int iHashCode2 = Long.hashCode(h02Var4.T);
                    tr3 tr3VarQ2 = h02Var4.q();
                    j73 j73VarW2 = m50.W(h02Var4, j73VarE0);
                    jo0.n.getClass();
                    h02Var4.b0();
                    if (h02Var4.S) {
                        h02Var4.m(sx1Var);
                    } else {
                        h02Var4.l0();
                    }
                    on0 on0Var = tg1.w;
                    xs2.E(on0Var, h02Var4, ek0VarG);
                    on0 on0Var2 = tg1.q;
                    xs2.E(on0Var2, h02Var4, tr3VarQ2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    on0 on0Var3 = tg1.c;
                    xs2.E(on0Var3, h02Var4, numValueOf);
                    xs2.D(h02Var4);
                    on0 on0Var4 = tg1.m;
                    xs2.E(on0Var4, h02Var4, j73VarW2);
                    g75.y(xs2.I(R.string.add_component, h02Var4), ue5.i0(mq4.r(g73Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var4.a(of5.g)).c, h02Var4, 48, 0, 131068);
                    j73 j73VarR = mq4.r(g73Var, 1.0f);
                    kb4 kb4VarG = jb4.g(v70.y, hi0.u, h02Var4, 48);
                    int iHashCode3 = Long.hashCode(h02Var4.T);
                    tr3 tr3VarQ3 = h02Var4.q();
                    j73 j73VarW3 = m50.W(h02Var4, j73VarR);
                    h02Var4.b0();
                    if (h02Var4.S) {
                        h02Var4.m(sx1Var);
                    } else {
                        h02Var4.l0();
                    }
                    xs2.E(on0Var, h02Var4, kb4VarG);
                    xs2.E(on0Var2, h02Var4, tr3VarQ3);
                    du4.k(iHashCode3, h02Var4, on0Var3, h02Var4);
                    xs2.E(on0Var4, h02Var4, j73VarW3);
                    uc6.y(my1Var, xy1Var, h02Var4, 0);
                    mq2.y(h02Var4, mq4.q(g73Var, 8.0f));
                    uc6.r(xs2.I(R.string.component_button, h02Var4), yf2.I(), my1Var2, new tp2(1.0f, true), h02Var4, 0, 0);
                    h02Var4.b(true);
                    h02Var4.b(true);
                } else {
                    h02Var4.Q();
                }
                return og5Var;
            case 9:
                uk1 uk1Var = (uk1) obj5;
                my1 my1Var3 = (my1) obj4;
                my1 my1Var4 = (my1) obj3;
                h02 h02Var5 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (h02Var5.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ok1 ok1Var = (ok1) uk1Var;
                    int iOrdinal = (ok1Var.x ? uw.t : uw.j).ordinal();
                    if (iOrdinal == 0) {
                        h02Var5.X(1284788520);
                        yf2.j(xs2.I(ok1Var.y == f61.a ? R.string.connection_button_connect_anyway : R.string.connection_button_connect, h02Var5), my1Var4, null, h02Var5, 0);
                        h02Var5.b(false);
                    } else {
                        if (iOrdinal != 1) {
                            h02Var5.X(1284778002);
                            h02Var5.b(false);
                            up.y();
                            return null;
                        }
                        h02Var5.X(1284780281);
                        yf2.j(xs2.I(R.string.connection_show_notifications, h02Var5), my1Var3, null, h02Var5, 0);
                        h02Var5.b(false);
                    }
                } else {
                    h02Var5.Q();
                }
                return og5Var;
            case 10:
                ((Integer) obj2).getClass();
                ua6.g((qr0) obj5, (wm4) obj3, (p04) obj4, (h02) obj, aq2.J(73));
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                ua6.y((j73) obj5, (sv0) obj3, (nm0) obj4, (h02) obj, aq2.J(455));
                return og5Var;
            case 12:
                ((Integer) obj2).getClass();
                vd6.y((j73) obj5, (b65) obj3, (nm0) obj4, (h02) obj, aq2.J(385));
                return og5Var;
            case 13:
                ne5 ne5Var = (ne5) obj5;
                rf4 rf4Var = (rf4) obj3;
                ob3 ob3Var3 = (ob3) obj4;
                h02 h02Var6 = (h02) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!h02Var6.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    h02Var6.Q();
                } else if (((Boolean) ob3Var3.getValue()).booleanValue()) {
                    h02Var6.X(1494640228);
                    hf6.n(ne5Var, h02Var6, 0, 0);
                    h02Var6.b(false);
                } else {
                    h02Var6.X(1494730593);
                    g73 g73Var2 = g73.g;
                    j73 j73VarX = ah6.x(gp4.P(g73Var2, rf4Var, true), rf4Var, h02Var6);
                    ek0 ek0VarG2 = ck0.g(v70.n, hi0.h, h02Var6, 0);
                    int iHashCode4 = Long.hashCode(h02Var6.T);
                    tr3 tr3VarQ4 = h02Var6.q();
                    j73 j73VarW4 = m50.W(h02Var6, j73VarX);
                    jo0.n.getClass();
                    h02Var6.b0();
                    if (h02Var6.S) {
                        h02Var6.m(sx1Var);
                    } else {
                        h02Var6.l0();
                    }
                    xs2.E(tg1.w, h02Var6, ek0VarG2);
                    xs2.E(tg1.q, h02Var6, tr3VarQ4);
                    xs2.E(tg1.c, h02Var6, Integer.valueOf(iHashCode4));
                    xs2.D(h02Var6);
                    xs2.E(tg1.m, h02Var6, j73VarW4);
                    g75.r(xs2.e(R.string.help_text, new Object[0], h02Var6), ue5.i0(g73Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, h02Var6, 48, 0, 524284);
                    h02Var6.b(true);
                    h02Var6.b(false);
                }
                return og5Var;
            case 14:
                ql4 ql4Var = (ql4) obj5;
                vi2 vi2Var = (vi2) obj3;
                ox0 ox0Var = (ox0) obj4;
                int iIntValue6 = ((Integer) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (zBooleanValue && ql4Var.d && (view = vi2Var.O) != null) {
                    view.performHapticFeedback(3, 2);
                }
                m50.T(ox0Var, null, new d40(vi2Var, iIntValue6, zBooleanValue, (mu0) null), 3);
                return og5Var;
            case kq2.x /* 15 */:
                wi2 wi2Var = (wi2) obj5;
                ol1 ol1Var = (ol1) obj3;
                bz1 bz1Var = (bz1) obj4;
                h02 h02Var7 = (h02) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (h02Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zJ = h02Var7.j(ol1Var) | h02Var7.x(bz1Var);
                    Object objK3 = h02Var7.K();
                    if (zJ || objK3 == l76Var) {
                        objK3 = new ta(ol1Var, bz1Var, (byte) 20);
                        h02Var7.i0(objK3);
                    }
                    by5.g(wi2Var, (bz1) objK3, h02Var7, 8);
                } else {
                    h02Var7.Q();
                }
                return og5Var;
            case 16:
                ((Integer) obj2).getClass();
                nc6.y((sk2) obj5, (my1) obj4, (my1) obj3, (h02) obj, aq2.J(393));
                return og5Var;
            case 17:
                ((Integer) obj2).getClass();
                nc6.l((String) obj5, (xy1) obj3, (my1) obj4, (h02) obj, aq2.J(385));
                return og5Var;
            case 18:
                xy1 xy1Var2 = (xy1) obj3;
                my1 my1Var5 = (my1) obj4;
                ob3 ob3Var4 = (ob3) obj5;
                h02 h02Var8 = (h02) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (h02Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zX2 = h02Var8.x(xy1Var2) | h02Var8.x(my1Var5);
                    Object objK4 = h02Var8.K();
                    if (zX2 || objK4 == l76Var) {
                        objK4 = new lt(xy1Var2, my1Var5, ob3Var4, b3);
                        h02Var8.i0(objK4);
                    }
                    c93.s((my1) objK4, null, false, null, null, null, mz5.w, h02Var8, 805306368, 510);
                } else {
                    h02Var8.Q();
                }
                return og5Var;
            case 19:
                ((Integer) obj2).getClass();
                nc6.n((sk2) obj5, (xy1) obj3, (my1) obj4, (h02) obj, aq2.J(393));
                return og5Var;
            case 20:
                ((Integer) obj2).getClass();
                aq2.r((vt2) obj3, (gu2) obj5, (my1) obj4, (h02) obj, aq2.J(7));
                return og5Var;
            case 21:
                String str2 = (String) obj5;
                String str3 = (String) obj3;
                Object[] objArr = (Object[]) obj4;
                h02 h02Var9 = (h02) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i3 = PreviewActivity.D;
                if (h02Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    vc6.n(str2, str3, h02Var9, Arrays.copyOf(objArr, 0));
                } else {
                    h02Var9.Q();
                }
                return og5Var;
            case 22:
                ((Integer) obj2).getClass();
                ge6.n((c84) obj5, (my1) obj4, (my1) obj3, (h02) obj, aq2.J(1));
                return og5Var;
            case 23:
                r54 r54Var = (r54) obj5;
                ng4 ng4Var = (ng4) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jT = ng4Var.t(ng4Var.v(fFloatValue - r54Var.j));
                ng4 ng4Var2 = ((lg4) obj4).g;
                r54Var.j += ng4Var.v(ng4Var.j(ng4Var2.n(ng4Var2.m, jT, 1)));
                return og5Var;
            case 24:
                ((Integer) obj2).getClass();
                mf6.n((bz1) obj5, (nm0) obj3, (zn3) obj4, (h02) obj, aq2.J(1));
                return og5Var;
            case 25:
                ((Integer) obj2).getClass();
                xj4.g((g61) obj5, (List) obj4, (xy1) obj3, (h02) obj, aq2.J(1));
                return og5Var;
            case 26:
                gx3 gx3Var = (gx3) obj5;
                gm3 gm3Var = (gm3) obj3;
                ob3 ob3Var5 = (ob3) obj4;
                h02 h02Var10 = (h02) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (h02Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    Boolean bool = (Boolean) ob3Var5.getValue();
                    Boolean bool2 = Boolean.TRUE;
                    boolean zP = yf2.p(bool, bool2);
                    boolean zJ2 = h02Var10.j(gx3Var) | h02Var10.j(gm3Var) | h02Var10.x(ob3Var5);
                    Object objK5 = h02Var10.K();
                    if (zJ2 || objK5 == l76Var) {
                        objK5 = new q2((Object) gx3Var, (Object) gm3Var, (Object) ob3Var5, (byte) 24);
                        h02Var10.i0(objK5);
                    }
                    k05.g(zP, (xy1) objK5, null, yf2.p((Boolean) ob3Var5.getValue(), bool2) ? sz5.n : null, false, ah6.y(((rj0) h02Var10.a(tj0.g)).g, h02Var10), h02Var10, 0, 84);
                } else {
                    h02Var10.Q();
                }
                return og5Var;
            case 27:
                gx3 gx3Var2 = (gx3) obj5;
                lm3 lm3Var = (lm3) obj3;
                ob3 ob3Var6 = (ob3) obj4;
                h02 h02Var11 = (h02) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (h02Var11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zBooleanValue2 = ((Boolean) ob3Var6.getValue()).booleanValue();
                    boolean zJ3 = h02Var11.j(gx3Var2) | h02Var11.j(lm3Var) | h02Var11.x(ob3Var6);
                    Object objK6 = h02Var11.K();
                    if (zJ3 || objK6 == l76Var) {
                        objK6 = new q2((Object) gx3Var2, (Object) lm3Var, (Object) ob3Var6, (byte) 25);
                        h02Var11.i0(objK6);
                    }
                    k05.g(zBooleanValue2, (xy1) objK6, null, ((Boolean) ob3Var6.getValue()).booleanValue() ? sz5.g : null, false, ah6.y(((rj0) h02Var11.a(tj0.g)).g, h02Var11), h02Var11, 0, 84);
                } else {
                    h02Var11.Q();
                }
                return og5Var;
            case 28:
                st4 st4Var = (st4) obj5;
                String[] strArr = (String[]) obj3;
                String[] strArr2 = (String[]) obj4;
                h02 h02Var12 = (h02) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (h02Var12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zJ4 = h02Var12.j(strArr) | h02Var12.j(strArr2);
                    Object objK7 = h02Var12.K();
                    if (zJ4 || objK7 == l76Var) {
                        objK7 = new kn2(strArr, strArr2, b2);
                        h02Var12.i0(objK7);
                    }
                    g75.y(cj0.q0(st4Var, null, null, null, (xy1) objK7, 31), ue5.i0(g73.g, 0.0f, 0.0f, 0.0f, 6.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, h02Var12, 48, 0, 262140);
                } else {
                    h02Var12.Q();
                }
                return og5Var;
            default:
                List<xl4> list2 = (List) obj5;
                xl4 xl4Var = (xl4) obj4;
                xy1 xy1Var3 = (xy1) obj3;
                h02 h02Var13 = (h02) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (h02Var13.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    for (xl4 xl4Var2 : list2) {
                        if (xl4Var2 == xl4Var) {
                            h02Var13.X(1237294880);
                            j2 = ((rj0) h02Var13.a(tj0.g)).g;
                            h02Var13.b(false);
                        } else {
                            h02Var13.X(1237381463);
                            j2 = ((rj0) h02Var13.a(tj0.g)).u;
                            h02Var13.b(false);
                        }
                        h02 h02Var14 = h02Var13;
                        bw4 bw4VarG2 = aq4.g(j2, null, "TabColor", h02Var14, 384, 10);
                        boolean z3 = xl4Var2 == xl4Var;
                        boolean zX3 = h02Var14.x(xy1Var3) | h02Var14.n(xl4Var2.ordinal());
                        Object objK8 = h02Var14.K();
                        if (zX3 || objK8 == l76Var) {
                            objK8 = new o82(xy1Var3, xl4Var2, b2);
                            h02Var14.i0(objK8);
                        }
                        p15.y(z3, (my1) objK8, null, false, ue5.m0(2029719563, new ta(xl4Var2, bw4VarG2, (byte) 28), h02Var14), 0L, 0L, h02Var14, 24576);
                        h02Var13 = h02Var14;
                    }
                } else {
                    h02Var13.Q();
                }
                return og5Var;
        }
    }

    public /* synthetic */ r2(my1 my1Var, o91 o91Var, nm0 nm0Var, int i) {
        this.j = (byte) 1;
        this.t = my1Var;
        this.a = o91Var;
        this.m = nm0Var;
    }

    public /* synthetic */ r2(xy1 xy1Var, my1 my1Var, ob3 ob3Var) {
        this.j = (byte) 18;
        this.m = xy1Var;
        this.t = my1Var;
        this.a = ob3Var;
    }

    public /* synthetic */ r2(vt2 vt2Var, gu2 gu2Var, my1 my1Var, int i) {
        this.j = (byte) 20;
        this.m = vt2Var;
        this.a = gu2Var;
        this.t = my1Var;
    }

    public /* synthetic */ r2(Object obj, Object obj2, jz1 jz1Var, byte b) {
        this.j = b;
        this.a = obj;
        this.t = obj2;
        this.m = jz1Var;
    }

    public /* synthetic */ r2(Object obj, Object obj2, jz1 jz1Var, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.t = obj2;
        this.m = jz1Var;
    }

    public /* synthetic */ r2(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.t = obj3;
    }

    public /* synthetic */ r2(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.t = obj3;
    }
}
