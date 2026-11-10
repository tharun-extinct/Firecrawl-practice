package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vn implements bz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ vn(byte b, int i, Object obj, Object obj2) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        boolean z;
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj3 = this.a;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                m50.h((qr0) obj4, (g61) obj3, (h02) obj, aq2.J(9));
                return og5Var;
            case 1:
                ((Integer) obj2).getClass();
                c93.m((String) obj4, (my1) obj3, (h02) obj, aq2.J(1));
                return og5Var;
            case 2:
                nk nkVar = (nk) obj4;
                my1 my1Var = (my1) obj3;
                h02 h02Var = (h02) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (h02Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c93.r(nkVar.r, my1Var, h02Var, 0);
                } else {
                    h02Var.Q();
                }
                return og5Var;
            case 3:
                ((Integer) obj2).getClass();
                c93.b((Context) obj4, (List) obj3, (h02) obj, aq2.J(1));
                return og5Var;
            case 4:
                ((Integer) obj2).getClass();
                k33.n((qr0) obj4, (nm0) obj3, (h02) obj, aq2.J(57));
                return og5Var;
            case 5:
                ((Integer) obj2).getClass();
                ue5.v((j73) obj4, (xy1) obj3, (h02) obj, aq2.J(1));
                return og5Var;
            case 6:
                bz1 bz1Var = (bz1) obj4;
                nm0 nm0Var = (nm0) obj3;
                h02 h02Var2 = (h02) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!h02Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h02Var2.Q();
                    return og5Var;
                }
                g73 g73Var = g73.g;
                j73 j73VarE0 = ue5.e0(g73Var, 16.0f);
                i00 i00Var = hi0.f;
                vq vqVar = v70.n;
                ek0 ek0VarG = ck0.g(vqVar, i00Var, h02Var2, 48);
                int iHashCode = Long.hashCode(h02Var2.T);
                tr3 tr3VarQ = h02Var2.q();
                j73 j73VarW = m50.W(h02Var2, j73VarE0);
                jo0.n.getClass();
                h02Var2.b0();
                boolean z2 = h02Var2.S;
                sx1 sx1Var = um2.Z;
                if (z2) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                on0 on0Var = tg1.w;
                xs2.E(on0Var, h02Var2, ek0VarG);
                on0 on0Var2 = tg1.q;
                xs2.E(on0Var2, h02Var2, tr3VarQ);
                Integer numValueOf = Integer.valueOf(iHashCode);
                on0 on0Var3 = tg1.c;
                xs2.E(on0Var3, h02Var2, numValueOf);
                xs2.D(h02Var2);
                on0 on0Var4 = tg1.m;
                xs2.E(on0Var4, h02Var2, j73VarW);
                kb4 kb4VarG = jb4.g(v70.y, hi0.p, h02Var2, 48);
                int iHashCode2 = Long.hashCode(h02Var2.T);
                tr3 tr3VarQ2 = h02Var2.q();
                j73 j73VarW2 = m50.W(h02Var2, g73Var);
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var, h02Var2, kb4VarG);
                xs2.E(on0Var2, h02Var2, tr3VarQ2);
                du4.k(iHashCode2, h02Var2, on0Var3, h02Var2);
                xs2.E(on0Var4, h02Var2, j73VarW2);
                j73 j73VarH = y94.h(mq4.j(ue5.i0(g73Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), 40.0f), na4.g);
                vf1 vf1Var = tj0.g;
                j73 j73VarA = og0.a(j73VarH, ((rj0) h02Var2.a(vf1Var)).b, yf2.b);
                t33 t33VarR = z50.r(hi0.w, false);
                int iHashCode3 = Long.hashCode(h02Var2.T);
                tr3 tr3VarQ3 = h02Var2.q();
                j73 j73VarW3 = m50.W(h02Var2, j73VarA);
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var, h02Var2, t33VarR);
                xs2.E(on0Var2, h02Var2, tr3VarQ3);
                du4.k(iHashCode3, h02Var2, on0Var3, h02Var2);
                xs2.E(on0Var4, h02Var2, j73VarW3);
                t92.g(k33.I(), null, null, ((rj0) h02Var2.a(vf1Var)).f, h02Var2, 48, 4);
                h02Var2.b(true);
                j73 j73VarR = mq4.r(g73Var, 1.0f);
                ek0 ek0VarG2 = ck0.g(vqVar, hi0.h, h02Var2, 0);
                int iHashCode4 = Long.hashCode(h02Var2.T);
                tr3 tr3VarQ4 = h02Var2.q();
                j73 j73VarW4 = m50.W(h02Var2, j73VarR);
                h02Var2.b0();
                if (h02Var2.S) {
                    h02Var2.m(sx1Var);
                } else {
                    h02Var2.l0();
                }
                xs2.E(on0Var, h02Var2, ek0VarG2);
                xs2.E(on0Var2, h02Var2, tr3VarQ4);
                du4.k(iHashCode4, h02Var2, on0Var3, h02Var2);
                xs2.E(on0Var4, h02Var2, j73VarW4);
                nm0Var.x(gk0.g, h02Var2, 6);
                h02Var2.b(true);
                h02Var2.b(true);
                if (bz1Var == null) {
                    h02Var2.X(1777303910);
                    z = false;
                } else {
                    z = false;
                    h02Var2.X(-1189593605);
                    bz1Var.l(h02Var2, 0);
                }
                h02Var2.b(z);
                h02Var2.b(true);
                return og5Var;
            case 7:
                ((Integer) obj2).getClass();
                ((h31) obj4).g((yp4) obj3, (h02) obj, aq2.J(1));
                return og5Var;
            case 8:
                ((Integer) obj2).getClass();
                a11.r((List) obj4, (Collection) obj3, (h02) obj, aq2.J(1));
                return og5Var;
            case 9:
                bf4 bf4Var = (bf4) obj4;
                gx3 gx3Var = (gx3) obj3;
                h02 h02Var3 = (h02) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!h02Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    h02Var3.Q();
                } else if (!bf4Var.n || gx3Var.g) {
                    h02Var3.X(-1107607602);
                    h02Var3.b(false);
                } else {
                    h02Var3.X(-1107647964);
                    xs2.y(null, h02Var3, 0, 1);
                    h02Var3.b(false);
                }
                return og5Var;
            case 10:
                ((Integer) obj2).getClass();
                a11.y((wf1) obj4, (nm0) obj3, (h02) obj, aq2.J(49));
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                an2 an2Var = (an2) obj4;
                bz1 bz1Var2 = (bz1) obj3;
                h02 h02Var4 = (h02) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (h02Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Boolean bool = (Boolean) an2Var.l.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    h02Var4.a0(bool);
                    boolean zL = h02Var4.l(zBooleanValue);
                    if (zBooleanValue) {
                        bz1Var2.l(h02Var4, 0);
                    } else {
                        if (h02Var4.q != 0) {
                            qo0.g("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!h02Var4.S) {
                            if (zL) {
                                lr4 lr4Var = h02Var4.G;
                                int i = lr4Var.l;
                                int i2 = lr4Var.j;
                                po0 po0Var = h02Var4.M;
                                po0Var.getClass();
                                po0Var.n(false);
                                po0Var.y.C.N(xk3.r);
                                a11.B(h02Var4.u, i, i2);
                                h02Var4.G.z();
                            } else {
                                h02Var4.P();
                            }
                        }
                    }
                    if (h02Var4.d && h02Var4.G.t == h02Var4.e) {
                        h02Var4.e = -1;
                        h02Var4.d = false;
                    }
                    h02Var4.b(false);
                } else {
                    h02Var4.Q();
                }
                return og5Var;
            case 12:
                wq2 wq2Var = (wq2) obj4;
                vq2 vq2Var = (vq2) obj3;
                h02 h02Var5 = (h02) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (h02Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    yq2 yq2Var = (yq2) wq2Var.y.g();
                    int iV = vq2Var.r;
                    Object obj5 = vq2Var.g;
                    if ((iV >= yq2Var.g() || !yq2Var.y(iV).equals(obj5)) && (iV = yq2Var.v(obj5)) != -1) {
                        vq2Var.r = iV;
                    }
                    int i3 = iV;
                    if (i3 != -1) {
                        h02Var5.X(-1664741271);
                        xq2.r(yq2Var, wq2Var.g, i3, vq2Var.g, h02Var5, 0);
                        h02Var5.b(false);
                    } else {
                        h02Var5.X(-1664505826);
                        h02Var5.b(false);
                    }
                    boolean zJ = h02Var5.j(vq2Var);
                    Object objK = h02Var5.K();
                    if (zJ || objK == oo0.g) {
                        objK = new z6(vq2Var, (byte) 19);
                        h02Var5.i0(objK);
                    }
                    k33.j(obj5, (xy1) objK, h02Var5);
                } else {
                    h02Var5.Q();
                }
                return og5Var;
            case 13:
                return ((cr2) obj3).g(new dr2((wq2) obj4, (qy4) obj), ((ws0) obj2).g);
            case 14:
                nm0 nm0Var2 = (nm0) obj4;
                vs2 vs2Var = (vs2) obj3;
                h02 h02Var6 = (h02) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (h02Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nm0Var2.x(vs2Var, h02Var6, 0);
                } else {
                    h02Var6.Q();
                }
                return og5Var;
            case kq2.x /* 15 */:
                mc3 mc3Var = (mc3) obj4;
                nm0 nm0Var3 = (nm0) obj3;
                h02 h02Var7 = (h02) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (h02Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    og0.r(new m14[]{rx2.g.g(mc3Var), ix2.g.g(mc3Var), qx2.g.g(mc3Var)}, nm0Var3, h02Var7, 8);
                } else {
                    h02Var7.Q();
                }
                return og5Var;
            case 16:
                ((Integer) obj2).getClass();
                kq2.n((qc4) obj4, (nm0) obj3, (h02) obj, aq2.J(49));
                return og5Var;
            case 17:
                mc3 mc3Var2 = (mc3) obj4;
                hh hhVar = (hh) obj3;
                h02 h02Var8 = (h02) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (h02Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ad3 ad3Var = mc3Var2.t;
                    ad3Var.getClass();
                    ((tn0) ad3Var).w.i(hhVar, mc3Var2, h02Var8, 0);
                } else {
                    h02Var8.Q();
                }
                return og5Var;
            case 18:
                gh3 gh3Var = (gh3) obj4;
                bh3 bh3Var = (bh3) obj3;
                nb0 nb0Var = (nb0) obj;
                x32 x32Var = (x32) obj2;
                um2 um2Var = gh3Var.B;
                if (um2Var.K()) {
                    gh3Var.W = nb0Var;
                    gh3Var.V = x32Var;
                    ((ba) xm2.g(um2Var)).getSnapshotObserver().g.n(gh3Var, gh3.d0, bh3Var);
                    gh3Var.Z = false;
                } else {
                    gh3Var.Z = true;
                }
                return og5Var;
            default:
                ((Integer) obj2).getClass();
                mq2.g((List) obj4, (vt2) obj3, (h02) obj, aq2.J(1));
                return og5Var;
        }
    }

    public /* synthetic */ vn(Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }
}
