package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gj4 {
    public final i73 g;
    public final aj4 n;
    public final um2 r;
    public gj4 v;
    public final int x;
    public final boolean y;

    public gj4(i73 i73Var, boolean z, um2 um2Var, aj4 aj4Var) {
        this.g = i73Var;
        this.y = z;
        this.r = um2Var;
        this.n = aj4Var;
        this.x = um2Var.t;
    }

    public final void b(ArrayList arrayList, aj4 aj4Var) {
        if (this.n.m) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            gj4 gj4Var = (gj4) arrayList.get(size2);
            if (!gj4Var.i()) {
                aj4Var.n(gj4Var.n);
                gj4Var.b(arrayList, aj4Var);
            }
        }
    }

    public final boolean c() {
        return this.v != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [i73] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [i73] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final k44 g(gh3 gh3Var) {
        ?? Q;
        gj4 gj4VarQ = q();
        if (gj4VarQ == null) {
            return k44.v;
        }
        i73 i73Var = gj4VarQ.r.M.x;
        if ((i73Var.m & 8) == 0) {
            Q = 0;
            break;
        }
        loop0: while (true) {
            if (i73Var != null) {
                if ((i73Var.a & 8) != 0) {
                    Q = i73Var;
                    ?? rb3Var = 0;
                    while (Q != 0) {
                        if (Q instanceof ej4) {
                            if (((ej4) Q).t()) {
                                break loop0;
                            }
                        } else if ((Q.a & 8) != 0 && (Q instanceof p41)) {
                            i73 i73Var2 = ((p41) Q).f;
                            int i = 0;
                            while (i73Var2 != null) {
                                if ((i73Var2.a & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        Q = Q;
                                        rb3Var = rb3Var;
                                        rb3Var = rb3Var;
                                        Q = i73Var2;
                                    } else {
                                        if (rb3Var == 0) {
                                            rb3Var = new rb3(new i73[16]);
                                        }
                                        if (Q != 0) {
                                            rb3Var.y(Q);
                                            Q = 0;
                                        }
                                        rb3Var.y(i73Var2);
                                    }
                                } else {
                                    Q = Q;
                                    rb3Var = rb3Var;
                                }
                                i73Var2 = i73Var2.w;
                                Q = Q;
                                rb3Var = rb3Var;
                            }
                            if (i == 1) {
                                Q = Q;
                                rb3Var = rb3Var;
                            } else {
                                Q = Q;
                                rb3Var = rb3Var;
                            }
                        }
                        Q = k33.Q(rb3Var);
                    }
                }
                if ((i73Var.m & 8) != 0) {
                    i73Var = i73Var.w;
                }
            }
            Q = 0;
            break;
        }
        ej4 ej4Var = (ej4) Q;
        gh3 gh3VarT = ej4Var != null ? k33.T(ej4Var, 8) : null;
        return gh3VarT == null ? gj4VarQ.g(gh3Var) : gh3VarT.H(gh3Var, true);
    }

    public final boolean i() {
        return this.y && this.n.a;
    }

    public final k44 j() {
        gh3 gh3VarN = n();
        if (gh3VarN != null) {
            if (!gh3VarN.Y0().h) {
                gh3VarN = null;
            }
            if (gh3VarN != null) {
                return m50.E(gh3VarN, true);
            }
        }
        return k44.v;
    }

    public final k44 l() {
        gh3 gh3VarN = n();
        if (gh3VarN != null) {
            if (!gh3VarN.Y0().h) {
                gh3VarN = null;
            }
            if (gh3VarN != null) {
                return m50.K(gh3VarN).H(gh3VarN, true);
            }
        }
        return k44.v;
    }

    public final aj4 m() {
        boolean zI = i();
        aj4 aj4Var = this.n;
        if (!zI) {
            return aj4Var;
        }
        aj4 aj4Var2 = new aj4();
        aj4Var2.a = aj4Var.a;
        aj4Var2.m = aj4Var.m;
        aj4Var2.j.m(aj4Var.j);
        b(new ArrayList(), aj4Var2);
        return aj4Var2;
    }

    public final gh3 n() {
        if (!c()) {
            ej4 ej4VarX = x();
            return ej4VarX != null ? k33.T(ej4VarX, 8) : this.r.M.r;
        }
        gj4 gj4VarQ = q();
        if (gj4VarQ != null) {
            return gj4VarQ.n();
        }
        return null;
    }

    public final gj4 q() {
        um2 um2VarO;
        gj4 gj4Var = this.v;
        if (gj4Var != null) {
            return gj4Var;
        }
        um2 um2Var = this.r;
        boolean z = this.y;
        if (!z) {
            um2VarO = null;
            break;
        }
        um2VarO = um2Var.o();
        while (true) {
            if (um2VarO == null) {
                um2VarO = null;
                break;
            }
            aj4 aj4VarK = um2VarO.k();
            if (aj4VarK != null && aj4VarK.a) {
                break;
            }
            um2VarO = um2VarO.o();
        }
        if (um2VarO == null) {
            for (um2 um2VarO2 = um2Var.o(); um2VarO2 != null; um2VarO2 = um2VarO2.o()) {
                if (um2VarO2.M.r(8)) {
                    um2VarO = um2VarO2;
                }
            }
            um2VarO = null;
        }
        if (um2VarO == null) {
            return null;
        }
        return jr2.n(um2VarO, z);
    }

    public final void r(um2 um2Var, ArrayList arrayList) {
        rb3 rb3VarE = um2Var.e();
        Object[] objArr = rb3VarE.j;
        int i = rb3VarE.a;
        for (int i2 = 0; i2 < i; i2++) {
            um2 um2Var2 = (um2) objArr[i2];
            if (um2Var2.J() && !um2Var2.X) {
                if (um2Var2.M.r(8)) {
                    arrayList.add(jr2.n(um2Var2, this.y));
                } else {
                    r(um2Var2, arrayList);
                }
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        if (c()) {
            return pi1.j;
        }
        r(this.r, arrayList);
        if (z) {
            aj4 aj4Var = this.n;
            hb3 hb3Var = aj4Var.j;
            Object objL = hb3Var.l(kj4.e);
            if (objL == null) {
                objL = null;
            }
            o94 o94Var = (o94) objL;
            if (o94Var != null && aj4Var.a && !arrayList.isEmpty()) {
                arrayList.add(y(o94Var, new s94(o94Var, (byte) 4)));
            }
            mj4 mj4Var = kj4.g;
            if (hb3Var.r(mj4Var) && !arrayList.isEmpty() && aj4Var.a) {
                Object objL2 = hb3Var.l(mj4Var);
                if (objL2 == null) {
                    objL2 = null;
                }
                List list = (List) objL2;
                String str = list != null ? (String) cj0.l0(list) : null;
                if (str != null) {
                    arrayList.add(0, y(null, new r92(str, (byte) 2)));
                }
            }
        }
        return arrayList;
    }

    public final List t(boolean z, boolean z2) {
        if (!z && this.n.m) {
            return pi1.j;
        }
        ArrayList arrayList = new ArrayList();
        if (!i()) {
            return s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        v(arrayList, arrayList2);
        return arrayList2;
    }

    public final void v(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            gj4 gj4Var = (gj4) arrayList.get(size2);
            if (gj4Var.i()) {
                arrayList2.add(gj4Var);
            } else if (!gj4Var.n.m) {
                gj4Var.v(arrayList, arrayList2);
            }
        }
    }

    public final k44 w() {
        Object objX = x();
        if (objX == null) {
            return this.r.M.r.v1();
        }
        i73 i73Var = ((i73) objX).j;
        Object objL = this.n.j.l(yi4.y);
        if (objL == null) {
            objL = null;
        }
        return br2.c(i73Var, objL != null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [i73] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [i73] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final ej4 x() {
        ?? Q;
        boolean z;
        ?? r0;
        boolean z2 = this.n.a;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        um2 um2Var = this.r;
        if (!z2) {
            i73 i73Var = um2Var.M.x;
            if ((i73Var.m & 8) != 0) {
                loop3: while (i73Var != null) {
                    if ((i73Var.a & 8) != 0) {
                        Q = i73Var;
                        ?? rb3Var = 0;
                        while (true) {
                            if (Q != 0) {
                                if (Q instanceof ej4) {
                                    if (((ej4) Q).t()) {
                                        r4 = Q;
                                    }
                                } else if ((Q.a & 8) != 0 && (Q instanceof p41)) {
                                    i73 i73Var2 = ((p41) Q).f;
                                    int i = 0;
                                    while (i73Var2 != null) {
                                        if ((i73Var2.a & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                Q = Q;
                                                rb3Var = rb3Var;
                                                rb3Var = rb3Var;
                                                Q = i73Var2;
                                            } else {
                                                if (rb3Var == 0) {
                                                    rb3Var = new rb3(new i73[16]);
                                                }
                                                if (Q != 0) {
                                                    rb3Var.y(Q);
                                                    Q = 0;
                                                }
                                                rb3Var.y(i73Var2);
                                            }
                                        } else {
                                            Q = Q;
                                            rb3Var = rb3Var;
                                        }
                                        i73Var2 = i73Var2.w;
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                    if (i == 1) {
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    } else {
                                        Q = Q;
                                        rb3Var = rb3Var;
                                    }
                                }
                                Q = k33.Q(rb3Var);
                            }
                        }
                    }
                    if ((i73Var.m & 8) == 0) {
                        break;
                    }
                    i73Var = i73Var.w;
                }
            }
        } else {
            i73 i73Var3 = um2Var.M.x;
            if ((i73Var3.m & 8) != 0) {
                Q = 0;
                while (i73Var3 != null) {
                    if ((i73Var3.a & 8) != 0) {
                        i73 i73VarQ = i73Var3;
                        rb3 rb3Var2 = null;
                        while (i73VarQ != null) {
                            if (i73VarQ instanceof ej4) {
                                ej4 ej4Var = (ej4) i73VarQ;
                                if (ej4Var.t()) {
                                    if (ej4Var.p0()) {
                                        r0 = Q;
                                        r0 = Q;
                                        return ej4Var;
                                    }
                                    if (Q == 0) {
                                        r0 = ej4Var;
                                    }
                                }
                                r0 = Q;
                                z = false;
                                Q = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                Q = Q;
                                if ((i73VarQ.a & 8) != 0 && (i73VarQ instanceof p41)) {
                                    int i2 = 0;
                                    for (i73 i73Var4 = ((p41) i73VarQ).f; i73Var4 != null; i73Var4 = i73Var4.w) {
                                        if ((i73Var4.a & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                i73VarQ = i73Var4;
                                            } else {
                                                if (rb3Var2 == null) {
                                                    rb3Var2 = new rb3(new i73[16]);
                                                }
                                                if (i73VarQ != null) {
                                                    rb3Var2.y(i73VarQ);
                                                    i73VarQ = null;
                                                }
                                                rb3Var2.y(i73Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                Q = Q;
                            }
                            i73VarQ = k33.Q(rb3Var2);
                        }
                    }
                    if ((i73Var3.m & 8) == 0) {
                        break;
                    }
                    i73Var3 = i73Var3.w;
                    Q = Q;
                }
                r4 = Q;
            }
        }
        return (ej4) r4;
    }

    public final gj4 y(o94 o94Var, xy1 xy1Var) {
        aj4 aj4Var = new aj4();
        aj4Var.a = false;
        aj4Var.m = false;
        xy1Var.a(aj4Var);
        gj4 gj4Var = new gj4(new fj4(xy1Var), false, new um2(true, this.x + (o94Var != null ? 1000000000 : 2000000000)), aj4Var);
        gj4Var.v = this;
        return gj4Var;
    }
}
