package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o75 {
    public final tp3 g = kq2.M(null);
    public final st4 r;
    public cj y;

    public o75(cj cjVar) {
        vy3 vy3Var = new vy3((byte) 29);
        cjVar.getClass();
        aj ajVar = new aj(cjVar);
        ArrayList arrayList = ajVar.a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) vy3Var.a(((zi) arrayList.get(i)).y(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bj bjVar = (bj) list.get(i2);
                arrayList3.add(new zi(bjVar.y, bjVar.r, bjVar.g, bjVar.n));
            }
            hj0.a0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.y = ajVar.v();
        this.r = new st4();
    }

    public static bj r(bj bjVar, j75 j75Var) {
        h93 h93Var = j75Var.y;
        int iR = h93Var.r(h93Var.x - 1, false);
        if (bjVar.y < iR) {
            return bj.g(bjVar, null, Math.min(bjVar.r, iR), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r28v0, types: [h02] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final void g(int i, h02 h02Var) {
        byte b;
        boolean z;
        Object objN;
        Object obj;
        h02Var.Z(1154651354);
        byte b2 = 2;
        int i2 = (h02Var.j(this) ? 4 : 2) | i;
        ?? r8 = 0;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            rf rfVar = (rf) h02Var.a(hp0.u);
            cj cjVar = this.y;
            List listG = cjVar.g(cjVar.t.length());
            int size = listG.size();
            int i3 = 0;
            while (i3 < size) {
                bj bjVar = (bj) listG.get(i3);
                int i4 = bjVar.y;
                Object obj2 = bjVar.g;
                if (i4 != bjVar.r) {
                    h02Var.X(725478935);
                    Object objK = h02Var.K();
                    l76 l76Var = oo0.g;
                    if (objK == l76Var) {
                        objN = objK;
                        objN = du4.n(h02Var);
                    }
                    objN = objK;
                    ja3 ja3Var = (ja3) objN;
                    j73 j73VarL = yf2.L(g73.g, new kn2(this, bjVar, (byte) 24));
                    Object objK2 = h02Var.K();
                    Object obj3 = objK2;
                    if (objK2 == l76Var) {
                        m75 m75Var = new m75(r8);
                        h02Var.i0(m75Var);
                        obj3 = m75Var;
                    }
                    j73 j73VarJ = cc6.j(dj4.g(j73VarL, r8, (xy1) obj3).n(new v75(new qm3(this, bjVar, (byte) 3))), ja3Var);
                    ou3.g.getClass();
                    j73 j73VarR = hd6.r(j73VarJ, v70.o);
                    boolean zJ = h02Var.j(this) | h02Var.x(bjVar) | h02Var.j(rfVar);
                    Object objK3 = h02Var.K();
                    Object obj4 = objK3;
                    if (zJ || objK3 == l76Var) {
                        o82 o82Var = new o82(this, bjVar, rfVar);
                        h02Var.i0(o82Var);
                        obj4 = o82Var;
                    }
                    z50.g(ue5.J(j73VarR, ja3Var, (my1) obj4), h02Var, 0);
                    ov2 ov2Var = (ov2) obj2;
                    p75 p75VarG = ov2Var.g();
                    if (p75VarG == null || (p75VarG.g == null && p75VarG.y == null && p75VarG.r == null && p75VarG.n == null)) {
                        z = false;
                        b = 2;
                        h02Var.X(728331710);
                        h02Var.b(false);
                    } else {
                        h02Var.X(726303039);
                        Object objK4 = h02Var.K();
                        Object obj5 = objK4;
                        if (objK4 == l76Var) {
                            pv2 pv2Var = new pv2(ja3Var);
                            h02Var.i0(pv2Var);
                            obj5 = pv2Var;
                        }
                        pv2 pv2Var2 = (pv2) obj5;
                        Object objK5 = h02Var.K();
                        boolean z2 = false;
                        if (objK5 == l76Var) {
                            b = 2;
                            x55 x55Var = new x55(pv2Var2, z2 ? 1 : 0, b);
                            h02Var.i0(x55Var);
                            obj = x55Var;
                        } else {
                            b = 2;
                            obj = objK5;
                        }
                        k33.b((bz1) obj, h02Var, og5.g);
                        qp3 qp3Var = pv2Var2.y;
                        qp3 qp3Var2 = pv2Var2.y;
                        Boolean boolValueOf = Boolean.valueOf((qp3Var.d() & b) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((qp3Var2.d() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((qp3Var2.d() & 4) != 0);
                        p75 p75VarG2 = ov2Var.g();
                        ju4 ju4Var = p75VarG2 != null ? p75VarG2.g : null;
                        p75 p75VarG3 = ov2Var.g();
                        ju4 ju4Var2 = p75VarG3 != null ? p75VarG3.y : null;
                        p75 p75VarG4 = ov2Var.g();
                        ju4 ju4Var3 = p75VarG4 != null ? p75VarG4.r : null;
                        p75 p75VarG5 = ov2Var.g();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, ju4Var, ju4Var2, ju4Var3, p75VarG5 != null ? p75VarG5.n : null};
                        boolean zJ2 = h02Var.j(this) | h02Var.x(bjVar);
                        Object objK6 = h02Var.K();
                        Object obj6 = objK6;
                        if (zJ2 || objK6 == l76Var) {
                            kn2 kn2Var = new kn2(this, bjVar, pv2Var2, (byte) 23);
                            h02Var.i0(kn2Var);
                            obj6 = kn2Var;
                        }
                        y(objArr, (xy1) obj6, h02Var, (i2 << 6) & 896);
                        z = false;
                        h02Var.b(false);
                    }
                    h02Var.b(z);
                } else {
                    ?? r16 = r8;
                    b = b2;
                    z = r16 == true ? 1 : 0;
                    h02Var.X(728345598);
                    h02Var.b(z);
                }
                i3++;
                byte b3 = b;
                r8 = z;
                b2 = b3;
            }
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new zl4(this, i, (byte) 11);
        }
    }

    public final void y(Object[] objArr, xy1 xy1Var, h02 h02Var, int i) {
        h02Var.Z(-2083052099);
        int i2 = (i & 48) == 0 ? (h02Var.j(xy1Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= h02Var.j(this) ? 256 : 128;
        }
        h02Var.U(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (h02Var.n(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= h02Var.j(obj) ? 4 : 0;
        }
        h02Var.b(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        byte b = 1;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            v92 v92Var = new v92(2);
            ArrayList arrayList = (ArrayList) v92Var.t;
            arrayList.add(xy1Var);
            v92Var.e(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zJ = h02Var.j(this) | ((i3 & 112) == 32);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new ez(this, xy1Var, b);
                h02Var.i0(objK);
            }
            k33.a(array, (xy1) objK, h02Var);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new je(this, objArr, xy1Var, i, (byte) 7);
        }
    }
}
