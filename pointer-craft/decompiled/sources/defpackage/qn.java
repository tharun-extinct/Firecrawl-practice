package defpackage;

import android.content.Context;
import android.os.Bundle;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qn implements cz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object t;

    public /* synthetic */ qn(qr0 qr0Var, jd3 jd3Var, Object obj, byte b) {
        this.j = b;
        this.a = qr0Var;
        this.t = jd3Var;
        this.m = obj;
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        Object obj4;
        byte b = this.j;
        t91 t91Var = t91.g;
        u91 u91Var = u91.g;
        l76 l76Var = oo0.g;
        byte b2 = 2;
        og5 og5Var = og5.g;
        Object obj5 = this.m;
        Object obj6 = this.a;
        Object obj7 = this.t;
        boolean z = false;
        int i = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                nf3 nf3Var = (nf3) obj7;
                qr0 qr0Var = (qr0) obj6;
                Context context = (Context) obj5;
                uk1 uk1Var = (uk1) obj;
                h02 h02Var = (h02) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                uk1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? h02Var.x(uk1Var) : h02Var.j(uk1Var) ? 4 : 2;
                }
                if (h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zJ = h02Var.j(nf3Var);
                    Object objK = h02Var.K();
                    if (zJ || objK == l76Var) {
                        objK = new gf(nf3Var, (byte) 1);
                        h02Var.i0(objK);
                    }
                    my1 my1VarR = kq2.R((my1) objK, h02Var);
                    boolean zJ2 = h02Var.j(qr0Var);
                    Object objK2 = h02Var.K();
                    if (zJ2 || objK2 == l76Var) {
                        objK2 = new rn(qr0Var, z ? (byte) 1 : (byte) 0);
                        h02Var.i0(objK2);
                    }
                    my1 my1VarR2 = kq2.R((my1) objK2, h02Var);
                    boolean zJ3 = h02Var.j(context);
                    Object objK3 = h02Var.K();
                    if (zJ3 || objK3 == l76Var) {
                        objK3 = new sn(context, z ? (byte) 1 : (byte) 0);
                        h02Var.i0(objK3);
                    }
                    my1 my1Var = (my1) objK3;
                    boolean zJ4 = h02Var.j(qr0Var);
                    Object objK4 = h02Var.K();
                    if (zJ4 || objK4 == l76Var) {
                        objK4 = new rn(qr0Var, b3);
                        h02Var.i0(objK4);
                    }
                    my1 my1Var2 = (my1) objK4;
                    boolean zJ5 = h02Var.j(qr0Var);
                    Object objK5 = h02Var.K();
                    if (zJ5 || objK5 == l76Var) {
                        objK5 = new rn(qr0Var, b2);
                        h02Var.i0(objK5);
                    }
                    my1 my1Var3 = (my1) objK5;
                    boolean zJ6 = h02Var.j(context);
                    Object objK6 = h02Var.K();
                    if (zJ6 || objK6 == l76Var) {
                        objK6 = new sn(context, b3);
                        h02Var.i0(objK6);
                    }
                    yf2.a(uk1Var, my1VarR, my1VarR2, my1Var, my1Var2, my1Var3, (my1) objK6, h02Var, 8 | (iIntValue & 14));
                } else {
                    h02Var.Q();
                }
                return og5Var;
            case 1:
                ob3 ob3Var = (ob3) obj7;
                wm4 wm4Var = (wm4) obj6;
                ob3 ob3Var2 = (ob3) obj5;
                h02 h02Var2 = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    g73 g73Var = g73.g;
                    j73 j73VarE0 = ue5.e0(g73Var, 8.0f);
                    kb4 kb4VarG = jb4.g(v70.y, hi0.p, h02Var2, 0);
                    int iHashCode = Long.hashCode(h02Var2.T);
                    tr3 tr3VarQ = h02Var2.q();
                    j73 j73VarW = m50.W(h02Var2, j73VarE0);
                    jo0.n.getClass();
                    h02Var2.b0();
                    if (h02Var2.S) {
                        h02Var2.m(um2.Z);
                    } else {
                        h02Var2.l0();
                    }
                    xs2.E(tg1.w, h02Var2, kb4VarG);
                    xs2.E(tg1.q, h02Var2, tr3VarQ);
                    xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
                    xs2.D(h02Var2);
                    xs2.E(tg1.m, h02Var2, j73VarW);
                    boolean zX = h02Var2.x(ob3Var) | h02Var2.j(wm4Var);
                    Object objK7 = h02Var2.K();
                    if (zX || objK7 == l76Var) {
                        objK7 = new p2(wm4Var, ob3Var, (byte) 5);
                        h02Var2.i0(objK7);
                    }
                    k33.w((my1) objK7, ue5.i0(g73Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), false, null, null, ra.j, h02Var2, 1572912, 60);
                    nm3 nm3Var = (nm3) ob3Var2.getValue();
                    if (nm3Var == null) {
                        h02Var2.X(1902774115);
                        h02Var2.b(false);
                    } else {
                        h02Var2.X(1902774116);
                        Object objK8 = h02Var2.K();
                        if (objK8 == l76Var) {
                            objK8 = new h6((byte) 3);
                            h02Var2.i0(objK8);
                        }
                        yf6.n(nm3Var, (my1) objK8, h02Var2, 56);
                        h02Var2.b(false);
                    }
                    h02Var2.b(true);
                } else {
                    h02Var2.Q();
                }
                return og5Var;
            case 2:
                mc3 mc3Var = (mc3) obj7;
                jd3 jd3Var = (jd3) obj6;
                my1 my1Var4 = (my1) obj5;
                h02 h02Var3 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((gk0) obj).getClass();
                if (h02Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    yf2.b(te4.l, mc3Var, jd3Var, my1Var4, h02Var3, 6);
                } else {
                    h02Var3.Q();
                }
                return og5Var;
            case 3:
                nk nkVar = (nk) obj7;
                jd3 jd3Var2 = (jd3) obj6;
                wm4 wm4Var2 = (wm4) obj5;
                h02 h02Var4 = (h02) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((lb4) obj).getClass();
                if (h02Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    m50.v(nkVar.v, jd3Var2, wm4Var2, h02Var4, 512);
                } else {
                    h02Var4.Q();
                }
                return og5Var;
            case 4:
                qr0 qr0Var2 = (qr0) obj6;
                jd3 jd3Var3 = (jd3) obj7;
                wm4 wm4Var3 = (wm4) obj5;
                h02 h02Var5 = (h02) obj2;
                ((Integer) obj3).getClass();
                ((mc3) obj).getClass();
                Context context2 = (Context) h02Var5.a(sa.y);
                gx3 gx3Var = (gx3) h02Var5.a(gp0.y);
                wl5 wl5VarG = rx2.g(h02Var5);
                if (wl5VarG == null) {
                    l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                ao2 ao2Var = (ao2) js2.A(v54.g(ao2.class), wl5VarG, gp4.N(xs2.d(wl5VarG), h02Var5), xs2.k(wl5VarG), h02Var5);
                boolean zJ7 = h02Var5.j(ao2Var);
                Object objK9 = h02Var5.K();
                if (zJ7 || objK9 == l76Var) {
                    obj4 = objK9;
                    ll2 ll2Var = new ll2(ao2Var, (byte) 13);
                    h02Var5.i0(ll2Var);
                    obj4 = ll2Var;
                }
                my1 my1VarI = nc6.i((xy1) obj4, h02Var5);
                String strI = xs2.I(R.string.menu_restore, h02Var5);
                boolean zX2 = h02Var5.x(my1VarI);
                Object objK10 = h02Var5.K();
                Object obj8 = objK10;
                if (zX2 || objK10 == l76Var) {
                    List listK = pw5.k(new hk(strI, new nn2(gx3Var, my1VarI, (byte) 1)));
                    h02Var5.i0(listK);
                    obj8 = listK;
                }
                nk nkVar2 = new nk(new w75(null, ve4.l.y), null, true, false, (List) obj8);
                c93.n(nkVar2, false, qr0Var2, ue5.m0(-1698300922, new dv0(nkVar2, jd3Var3, wm4Var3, b3), h02Var5), ue5.m0(381994863, new ya4((pl5) ao2Var, (Object) context2, jd3Var3, (byte) 6), h02Var5), h02Var5, 28216);
                return og5Var;
            case 5:
                qr0 qr0Var3 = (qr0) obj6;
                jd3 jd3Var4 = (jd3) obj7;
                String str = (String) obj5;
                mc3 mc3Var2 = (mc3) obj;
                h02 h02Var6 = (h02) obj2;
                ((Integer) obj3).getClass();
                mc3Var2.getClass();
                wl5 wl5VarG2 = rx2.g(h02Var6);
                if (wl5VarG2 == null) {
                    l0.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                q81 q81Var = (q81) js2.A(v54.g(q81.class), wl5VarG2, gp4.N(xs2.d(wl5VarG2), h02Var6), xs2.k(wl5VarG2), h02Var6);
                Bundle bundleG = mc3Var2.g();
                mu0 mu0Var = null;
                String string = bundleG != null ? bundleG.getString("fixDevice") : null;
                if (string != null) {
                    h02Var6.X(1265791408);
                    Bundle bundleG2 = mc3Var2.g();
                    boolean zJ8 = h02Var6.j(mc3Var2) | h02Var6.j(q81Var) | h02Var6.x(string);
                    Object objK11 = h02Var6.K();
                    if (zJ8 || objK11 == l76Var) {
                        objK11 = new mo(mc3Var2, q81Var, string, mu0Var, (byte) 8, false);
                        h02Var6.i0(objK11);
                    }
                    k33.b((bz1) objK11, h02Var6, bundleG2);
                    h02Var6.b(false);
                } else {
                    h02Var6.X(1266035502);
                    h02Var6.b(false);
                }
                k33.n(qr0Var3, ue5.m0(1222128453, new k71(q81Var, qr0Var3, jd3Var4, str), h02Var6), h02Var6, 56);
                return og5Var;
            case 6:
                ArrayList arrayList = (ArrayList) obj7;
                xy1 xy1Var = (xy1) obj6;
                Integer num = (Integer) obj5;
                fk0 fk0Var = (fk0) obj;
                h02 h02Var7 = (h02) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                fk0Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? h02Var7.x(fk0Var) : h02Var7.j(fk0Var) ? 4 : 2;
                }
                if (h02Var7.N(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj9 = arrayList.get(i);
                        i++;
                        xq2.y(new go5(u91Var).n(new k52(t91Var)), 0, ue5.m0(-67028145, new qn(obj9, (Object) xy1Var, (Object) num, (byte) 7), h02Var7), h02Var7, 3072, 6);
                    }
                } else {
                    h02Var7.Q();
                }
                return og5Var;
            default:
                List<r04> list = (List) obj7;
                xy1 xy1Var2 = (xy1) obj6;
                Integer num2 = (Integer) obj5;
                mb4 mb4Var = (mb4) obj;
                h02 h02Var8 = (h02) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mb4Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? h02Var8.x(mb4Var) : h02Var8.j(mb4Var) ? 4 : 2;
                }
                if (h02Var8.N(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    for (r04 r04Var : list) {
                        vn3 vn3VarI = lr2.I(2.0f);
                        lr2.l(r04Var, xy1Var2, new xn3(vn3VarI, vn3VarI, vn3VarI, vn3VarI).n(new k52(u91Var)).n(new go5(t91Var)), num2, h02Var8, 0);
                    }
                } else {
                    h02Var8.Q();
                }
                return og5Var;
        }
    }

    public /* synthetic */ qn(Object obj, Object obj2, Object obj3, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
    }
}
