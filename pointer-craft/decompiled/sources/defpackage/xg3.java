package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xg3 extends lh3 {
    public boolean j;
    public ju3 l;
    public final i73 r;
    public gh3 x;
    public final c6 n = new c6();
    public final uy2 v = new uy2(2);
    public boolean t = true;
    public boolean a = true;

    public xg3(i73 i73Var) {
        this.r = i73Var;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0256  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [i73] */
    /* JADX WARN: Type inference failed for: r5v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [i73] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [rb3] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [rb3] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // defpackage.lh3
    public final boolean g(uy2 uy2Var, bl2 bl2Var, mf2 mf2Var, boolean z) {
        c6 c6Var;
        uy2 uy2Var2;
        Object obj;
        boolean z2;
        boolean z3;
        ju3 ju3Var;
        int i;
        boolean z4;
        int i2;
        boolean zG = super.g(uy2Var, bl2Var, mf2Var, z);
        ?? Q = this.r;
        boolean z5 = true;
        if (Q.h) {
            ?? rb3Var = 0;
            while (Q != 0) {
                if (Q instanceof tu3) {
                    this.x = rd6.n((tu3) Q);
                } else if ((Q.a & 16) != 0 && (Q instanceof p41)) {
                    i73 i73Var = ((p41) Q).f;
                    int i3 = 0;
                    while (i73Var != null) {
                        if ((i73Var.a & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                Q = Q;
                                rb3Var = rb3Var;
                                rb3Var = rb3Var;
                                Q = i73Var;
                            } else {
                                if (rb3Var == 0) {
                                    rb3Var = new rb3(new i73[16]);
                                }
                                if (Q != 0) {
                                    rb3Var.y(Q);
                                    Q = 0;
                                }
                                rb3Var.y(i73Var);
                            }
                        } else {
                            Q = Q;
                            rb3Var = rb3Var;
                        }
                        i73Var = i73Var.w;
                        Q = Q;
                        rb3Var = rb3Var;
                    }
                    if (i3 == 1) {
                        Q = Q;
                        rb3Var = rb3Var;
                    } else {
                        Q = Q;
                        rb3Var = rb3Var;
                    }
                }
                Q = k33.Q(rb3Var);
            }
            if (this.x != null) {
                int iL = uy2Var.l();
                int i4 = 0;
                while (true) {
                    c6Var = this.n;
                    uy2Var2 = this.v;
                    if (i4 >= iL) {
                        break;
                    }
                    long jN = uy2Var.n(i4);
                    qu3 qu3Var = (qu3) uy2Var.j(i4);
                    if (c6Var.n(jN)) {
                        long j = qu3Var.j();
                        z4 = z5;
                        long jV = qu3Var.v();
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((jV & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(qu3Var.r().size());
                            List listR = qu3Var.r();
                            zG = zG;
                            int size = listR.size();
                            iL = iL;
                            int i5 = 0;
                            while (i5 < size) {
                                y62 y62Var = (y62) listR.get(i5);
                                int i6 = size;
                                int i7 = i5;
                                long jR = y62Var.r();
                                if ((((jR & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long jV2 = y62Var.v();
                                    gh3 gh3Var = this.x;
                                    gh3Var.getClass();
                                    arrayList.add(new y62(jV2, gh3Var.C(bl2Var, jR), y62Var.n(), y62Var.y(), y62Var.g()));
                                }
                                i5 = i7 + 1;
                                size = i6;
                                i4 = i4;
                            }
                            i2 = i4;
                            gh3 gh3Var2 = this.x;
                            gh3Var2.getClass();
                            long jC = gh3Var2.C(bl2Var, j);
                            gh3 gh3Var3 = this.x;
                            gh3Var3.getClass();
                            uy2Var2.v(jN, qu3.y(qu3Var, gh3Var3.C(bl2Var, jV), jC, arrayList));
                        }
                        i4 = i2 + 1;
                        z5 = z4;
                        zG = zG;
                        iL = iL;
                    } else {
                        z4 = z5;
                    }
                    i2 = i4;
                    i4 = i2 + 1;
                    z5 = z4;
                    zG = zG;
                    iL = iL;
                }
                boolean z6 = zG;
                boolean z7 = z5;
                if (uy2Var2.l() == 0) {
                    c6Var.r();
                    this.g.j();
                    return z7;
                }
                int iL2 = c6Var.l();
                while (true) {
                    iL2--;
                    if (-1 >= iL2) {
                        break;
                    }
                    if (uy2Var.r(c6Var.x(iL2)) < 0) {
                        c6Var.w(iL2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(uy2Var2.l());
                int iL3 = uy2Var2.l();
                for (int i8 = 0; i8 < iL3; i8++) {
                    arrayList2.add(uy2Var2.j(i8));
                }
                ju3 ju3Var2 = new ju3(arrayList2, mf2Var);
                int size2 = arrayList2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i9);
                    if (mf2Var.g(((qu3) obj).n())) {
                        break;
                    }
                    i9++;
                }
                qu3 qu3Var2 = (qu3) obj;
                if (qu3Var2 != null) {
                    if (z) {
                        z2 = false;
                        if (!this.t && (qu3Var2.x() || qu3Var2.t())) {
                            gh3 gh3Var4 = this.x;
                            gh3Var4.getClass();
                            this.t = !fd6.v(gh3Var4.a, qu3Var2);
                        }
                    } else {
                        z2 = false;
                        this.t = false;
                    }
                    boolean z8 = this.t;
                    boolean z9 = this.j;
                    if (z8 == z9 || !((i = ju3Var2.x) == 3 || i == 4 || i == 5)) {
                        int i10 = ju3Var2.x;
                        if (i10 == 4 && z9 && !this.a) {
                            ju3Var2.x = 3;
                        } else if (i10 == 5 && z8 && qu3Var2.x()) {
                            ju3Var2.x = 3;
                        }
                    } else {
                        ju3Var2.x = z8 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z6 && ju3Var2.x == 3 && (ju3Var = this.l) != null) {
                    ?? r1 = ju3Var.g;
                    int size3 = r1.size();
                    ?? r5 = ju3Var2.g;
                    if (size3 != r5.size()) {
                        z3 = z7;
                        break;
                    }
                    int size4 = r5.size();
                    ?? r6 = z2;
                    while (true) {
                        if (r6 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!wi3.y(((qu3) r1.get(r6)).v(), ((qu3) r5.get(r6)).v())) {
                            z3 = z7;
                            break;
                        }
                        r6++;
                    }
                } else {
                    z3 = z7;
                    break;
                }
                this.l = ju3Var2;
                return z3;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [i73] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [rb3] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [rb3] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean n(mf2 mf2Var) {
        um2 um2Var;
        uy2 uy2Var = this.v;
        boolean z = false;
        z = false;
        z = false;
        if (uy2Var.l() != 0) {
            i73 i73Var = this.r;
            if (i73Var.h) {
                gh3 gh3Var = i73Var.i;
                if ((gh3Var == null || (um2Var = gh3Var.B) == null) ? false : um2Var.K()) {
                    ju3 ju3Var = this.l;
                    ju3Var.getClass();
                    gh3 gh3Var2 = this.x;
                    gh3Var2.getClass();
                    long j = gh3Var2.a;
                    ?? Q = i73Var;
                    ?? rb3Var = 0;
                    while (Q != 0) {
                        if (Q instanceof tu3) {
                            ((tu3) Q).L(ju3Var, ku3.a, j);
                        } else if ((Q.a & 16) != 0 && (Q instanceof p41)) {
                            i73 i73Var2 = ((p41) Q).f;
                            int i = 0;
                            while (i73Var2 != null) {
                                if ((i73Var2.a & 16) != 0) {
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
                    if (i73Var.h) {
                        rb3 rb3Var2 = this.g;
                        Object[] objArr = rb3Var2.j;
                        int i2 = rb3Var2.a;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((xg3) objArr[i3]).n(mf2Var);
                        }
                    }
                    z = true;
                }
            }
        }
        y(mf2Var);
        uy2Var.g();
        this.x = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [rb3] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [rb3] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [i73] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [i73] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void r() {
        rb3 rb3Var = this.g;
        Object[] objArr = rb3Var.j;
        int i = rb3Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            ((xg3) objArr[i2]).r();
        }
        ?? Q = this.r;
        ?? rb3Var2 = 0;
        while (Q != 0) {
            if (Q instanceof tu3) {
                ((tu3) Q).m0();
            } else if ((Q.a & 16) != 0 && (Q instanceof p41)) {
                i73 i73Var = ((p41) Q).f;
                int i3 = 0;
                rb3Var2 = rb3Var2;
                Q = Q;
                while (i73Var != null) {
                    if ((i73Var.a & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            rb3Var2 = rb3Var2;
                            Q = i73Var;
                        } else {
                            if (rb3Var2 == 0) {
                                rb3Var2 = new rb3(new i73[16]);
                            }
                            if (Q != 0) {
                                rb3Var2.y(Q);
                                Q = 0;
                            }
                            rb3Var2.y(i73Var);
                        }
                    }
                    i73Var = i73Var.w;
                    rb3Var2 = rb3Var2;
                    Q = Q;
                }
                if (i3 == 1) {
                }
            }
            Q = k33.Q(rb3Var2);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.r + ", children=" + this.g + ", pointerIds=" + this.n + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [i73] */
    /* JADX WARN: Type inference failed for: r0v3, types: [i73] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [i73] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [rb3] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [rb3] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i73] */
    /* JADX WARN: Type inference failed for: r6v10, types: [i73] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [rb3] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [rb3] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean v(mf2 mf2Var, boolean z) {
        um2 um2Var;
        if (this.v.l() == 0) {
            return false;
        }
        ?? Q = this.r;
        if (Q.h) {
            gh3 gh3Var = Q.i;
            if ((gh3Var == null || (um2Var = gh3Var.B) == null) ? false : um2Var.K()) {
                ju3 ju3Var = this.l;
                ju3Var.getClass();
                gh3 gh3Var2 = this.x;
                gh3Var2.getClass();
                long j = gh3Var2.a;
                ?? Q2 = Q;
                ?? rb3Var = 0;
                while (Q2 != 0) {
                    if (Q2 instanceof tu3) {
                        ((tu3) Q2).L(ju3Var, ku3.j, j);
                    } else if ((Q2.a & 16) != 0 && (Q2 instanceof p41)) {
                        i73 i73Var = ((p41) Q2).f;
                        int i = 0;
                        while (i73Var != null) {
                            if ((i73Var.a & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    Q2 = Q2;
                                    rb3Var = rb3Var;
                                    rb3Var = rb3Var;
                                    Q2 = i73Var;
                                } else {
                                    if (rb3Var == 0) {
                                        rb3Var = new rb3(new i73[16]);
                                    }
                                    if (Q2 != 0) {
                                        rb3Var.y(Q2);
                                        Q2 = 0;
                                    }
                                    rb3Var.y(i73Var);
                                }
                            } else {
                                Q2 = Q2;
                                rb3Var = rb3Var;
                            }
                            i73Var = i73Var.w;
                            Q2 = Q2;
                            rb3Var = rb3Var;
                        }
                        if (i == 1) {
                            Q2 = Q2;
                            rb3Var = rb3Var;
                        } else {
                            Q2 = Q2;
                            rb3Var = rb3Var;
                        }
                    }
                    Q2 = k33.Q(rb3Var);
                }
                if (Q.h) {
                    rb3 rb3Var2 = this.g;
                    Object[] objArr = rb3Var2.j;
                    int i2 = rb3Var2.a;
                    for (int i3 = 0; i3 < i2; i3++) {
                        xg3 xg3Var = (xg3) objArr[i3];
                        this.x.getClass();
                        xg3Var.v(mf2Var, z);
                    }
                }
                if (Q.h) {
                    ?? rb3Var3 = 0;
                    while (Q != 0) {
                        if (Q instanceof tu3) {
                            ((tu3) Q).L(ju3Var, ku3.t, j);
                        } else if ((Q.a & 16) != 0 && (Q instanceof p41)) {
                            i73 i73Var2 = ((p41) Q).f;
                            int i4 = 0;
                            while (i73Var2 != null) {
                                if ((i73Var2.a & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        Q = Q;
                                        rb3Var3 = rb3Var3;
                                        rb3Var3 = rb3Var3;
                                        Q = i73Var2;
                                    } else {
                                        if (rb3Var3 == 0) {
                                            rb3Var3 = new rb3(new i73[16]);
                                        }
                                        if (Q != 0) {
                                            rb3Var3.y(Q);
                                            Q = 0;
                                        }
                                        rb3Var3.y(i73Var2);
                                    }
                                } else {
                                    Q = Q;
                                    rb3Var3 = rb3Var3;
                                }
                                i73Var2 = i73Var2.w;
                                Q = Q;
                                rb3Var3 = rb3Var3;
                            }
                            if (i4 == 1) {
                                Q = Q;
                                rb3Var3 = rb3Var3;
                            } else {
                                Q = Q;
                                rb3Var3 = rb3Var3;
                            }
                        }
                        Q = k33.Q(rb3Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void x(long j, xa3 xa3Var) {
        c6 c6Var = this.n;
        if (c6Var.n(j) && !xa3Var.v(this)) {
            c6Var.m(j);
            this.v.x(j);
        }
        rb3 rb3Var = this.g;
        Object[] objArr = rb3Var.j;
        int i = rb3Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            ((xg3) objArr[i2]).x(j, xa3Var);
        }
    }

    @Override // defpackage.lh3
    public final void y(mf2 mf2Var) {
        super.y(mf2Var);
        ju3 ju3Var = this.l;
        if (ju3Var == null) {
            return;
        }
        this.j = this.t;
        List list = ju3Var.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qu3 qu3Var = (qu3) list.get(i);
            boolean zX = qu3Var.x();
            boolean zG = mf2Var.g(qu3Var.n());
            boolean z = this.t;
            if ((!zX && !zG) || (!zX && !z)) {
                this.n.m(qu3Var.n());
            }
        }
        this.t = false;
        this.a = ju3Var.x == 5;
    }
}
