package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j35 extends o73 {
    public final xy1 a;
    public final cj g;
    public final int j;
    public final int l;
    public final xy1 m;
    public final xy1 n;
    public final ku1 r;
    public final List t;
    public final int v;
    public final boolean x;
    public final k85 y;

    public j35(cj cjVar, k85 k85Var, ku1 ku1Var, xy1 xy1Var, int i, boolean z, int i2, int i3, List list, xy1 xy1Var2, xy1 xy1Var3) {
        this.g = cjVar;
        this.y = k85Var;
        this.r = ku1Var;
        this.n = xy1Var;
        this.v = i;
        this.x = z;
        this.l = i2;
        this.j = i3;
        this.t = list;
        this.a = xy1Var2;
        this.m = xy1Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j35)) {
            return false;
        }
        j35 j35Var = (j35) obj;
        return yf2.p(this.g, j35Var.g) && yf2.p(this.y, j35Var.y) && yf2.p(this.t, j35Var.t) && yf2.p(this.r, j35Var.r) && this.n == j35Var.n && this.m == j35Var.m && this.v == j35Var.v && this.x == j35Var.x && this.l == j35Var.l && this.j == j35Var.j && this.a == j35Var.a;
    }

    public final int hashCode() {
        int iHashCode = (this.r.hashCode() + ei3.r(this.y, this.g.hashCode() * 31, 31)) * 31;
        xy1 xy1Var = this.n;
        int iL = (((xi3.l(du4.r(this.v, (iHashCode + (xy1Var != null ? xy1Var.hashCode() : 0)) * 31, 31), 31, this.x) + this.l) * 31) + this.j) * 31;
        List list = this.t;
        int iHashCode2 = (iL + (list != null ? list.hashCode() : 0)) * 31;
        xy1 xy1Var2 = this.a;
        int iHashCode3 = (iHashCode2 + (xy1Var2 != null ? xy1Var2.hashCode() : 0)) * 29791;
        xy1 xy1Var3 = this.m;
        return iHashCode3 + (xy1Var3 != null ? xy1Var3.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0123  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        boolean z;
        cj cjVar;
        boolean zP;
        boolean z2;
        boolean z3;
        List list;
        List list2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        ku1 ku1Var;
        ku1 ku1Var2;
        int i5;
        int i6;
        xy1 xy1Var;
        xy1 xy1Var2;
        xy1 xy1Var3;
        xy1 xy1Var4;
        xy1 xy1Var5;
        xy1 xy1Var6;
        j93 j93VarQ0;
        boolean zR;
        m35 m35Var = (m35) i73Var;
        k85 k85Var = m35Var.f;
        boolean z6 = false;
        boolean z7 = true;
        k85 k85Var2 = this.y;
        if (k85Var2 != k85Var) {
            if (!k85Var2.g.y(k85Var.g)) {
                z = true;
            }
            String str = m35Var.o.t;
            cjVar = this.g;
            zP = yf2.p(str, cjVar.t);
            boolean zP2 = yf2.p(m35Var.o.j, cjVar.j);
            if (zP || !zP2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                m35Var.o = cjVar;
            }
            if (!zP) {
                m35Var.J = null;
            }
            z3 = !m35Var.f.r(k85Var2);
            m35Var.f = k85Var2;
            list = m35Var.D;
            list2 = this.t;
            if (!yf2.p(list, list2)) {
                m35Var.D = list2;
                z3 = true;
            }
            i = m35Var.C;
            i2 = this.j;
            if (i != i2) {
                m35Var.C = i2;
                z3 = true;
            }
            i3 = m35Var.B;
            i4 = this.l;
            if (i3 != i4) {
                m35Var.B = i4;
                z3 = true;
            }
            z4 = m35Var.A;
            z5 = this.x;
            if (z4 != z5) {
                m35Var.A = z5;
                z3 = true;
            }
            ku1Var = m35Var.k;
            ku1Var2 = this.r;
            if (!yf2.p(ku1Var, ku1Var2)) {
                m35Var.k = ku1Var2;
                z3 = true;
            }
            i5 = m35Var.e;
            i6 = this.v;
            if (i5 != i6) {
                m35Var.e = i6;
                z3 = true;
            }
            xy1Var = m35Var.d;
            xy1Var2 = this.n;
            if (xy1Var != xy1Var2) {
                m35Var.d = xy1Var2;
                z6 = true;
            }
            xy1Var3 = m35Var.E;
            xy1Var4 = this.a;
            if (xy1Var3 != xy1Var4) {
                m35Var.E = xy1Var4;
                z6 = true;
            }
            xy1Var5 = m35Var.F;
            xy1Var6 = this.m;
            if (xy1Var5 != xy1Var6) {
                m35Var.F = xy1Var6;
            } else {
                z7 = z6;
            }
            if (!z2 || z3 || z7) {
                j93VarQ0 = m35Var.Q0();
                cj cjVar2 = m35Var.o;
                k85 k85Var3 = m35Var.f;
                ku1 ku1Var3 = m35Var.k;
                int i7 = m35Var.e;
                boolean z8 = m35Var.A;
                int i8 = m35Var.B;
                int i9 = m35Var.C;
                List list3 = m35Var.D;
                j93VarQ0.g = cjVar2;
                zR = k85Var3.r(j93VarQ0.m);
                j93VarQ0.m = k85Var3;
                if (!zR) {
                    j93VarQ0.s <<= 2;
                    j93VarQ0.q = null;
                    j93VarQ0.c = null;
                    j93VarQ0.b = -1;
                    j93VarQ0.i = -1;
                }
                j93VarQ0.y = ku1Var3;
                j93VarQ0.r = i7;
                j93VarQ0.n = z8;
                j93VarQ0.v = i8;
                j93VarQ0.x = i9;
                j93VarQ0.l = list3;
                j93VarQ0.s = (j93VarQ0.s << 2) | 2;
                j93VarQ0.q = null;
                j93VarQ0.c = null;
                j93VarQ0.b = -1;
                j93VarQ0.i = -1;
            } else {
                z3 = z3;
            }
            if (m35Var.h) {
                if (z2 || (z && m35Var.I != null)) {
                    br2.d(m35Var);
                }
                if (z2 || z3 || z7) {
                    c93.B(m35Var);
                    c93.A(m35Var);
                }
                if (z) {
                    c93.A(m35Var);
                }
            }
            return;
        }
        k85Var2.getClass();
        z = false;
        String str2 = m35Var.o.t;
        cjVar = this.g;
        zP = yf2.p(str2, cjVar.t);
        boolean zP3 = yf2.p(m35Var.o.j, cjVar.j);
        if (zP) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (z2) {
            m35Var.o = cjVar;
        }
        if (!zP) {
            m35Var.J = null;
        }
        z3 = !m35Var.f.r(k85Var2);
        m35Var.f = k85Var2;
        list = m35Var.D;
        list2 = this.t;
        if (!yf2.p(list, list2)) {
            m35Var.D = list2;
            z3 = true;
        }
        i = m35Var.C;
        i2 = this.j;
        if (i != i2) {
            m35Var.C = i2;
            z3 = true;
        }
        i3 = m35Var.B;
        i4 = this.l;
        if (i3 != i4) {
            m35Var.B = i4;
            z3 = true;
        }
        z4 = m35Var.A;
        z5 = this.x;
        if (z4 != z5) {
            m35Var.A = z5;
            z3 = true;
        }
        ku1Var = m35Var.k;
        ku1Var2 = this.r;
        if (!yf2.p(ku1Var, ku1Var2)) {
            m35Var.k = ku1Var2;
            z3 = true;
        }
        i5 = m35Var.e;
        i6 = this.v;
        if (i5 != i6) {
            m35Var.e = i6;
            z3 = true;
        }
        xy1Var = m35Var.d;
        xy1Var2 = this.n;
        if (xy1Var != xy1Var2) {
            m35Var.d = xy1Var2;
            z6 = true;
        }
        xy1Var3 = m35Var.E;
        xy1Var4 = this.a;
        if (xy1Var3 != xy1Var4) {
            m35Var.E = xy1Var4;
            z6 = true;
        }
        xy1Var5 = m35Var.F;
        xy1Var6 = this.m;
        if (xy1Var5 != xy1Var6) {
            m35Var.F = xy1Var6;
        } else {
            z7 = z6;
        }
        if (z2) {
            j93VarQ0 = m35Var.Q0();
            cj cjVar3 = m35Var.o;
            k85 k85Var4 = m35Var.f;
            ku1 ku1Var4 = m35Var.k;
            int i10 = m35Var.e;
            boolean z9 = m35Var.A;
            int i11 = m35Var.B;
            int i12 = m35Var.C;
            List list4 = m35Var.D;
            j93VarQ0.g = cjVar3;
            zR = k85Var4.r(j93VarQ0.m);
            j93VarQ0.m = k85Var4;
            if (!zR) {
                j93VarQ0.s <<= 2;
                j93VarQ0.q = null;
                j93VarQ0.c = null;
                j93VarQ0.b = -1;
                j93VarQ0.i = -1;
            }
            j93VarQ0.y = ku1Var4;
            j93VarQ0.r = i10;
            j93VarQ0.n = z9;
            j93VarQ0.v = i11;
            j93VarQ0.x = i12;
            j93VarQ0.l = list4;
            j93VarQ0.s = (j93VarQ0.s << 2) | 2;
            j93VarQ0.q = null;
            j93VarQ0.c = null;
            j93VarQ0.b = -1;
            j93VarQ0.i = -1;
        } else {
            j93VarQ0 = m35Var.Q0();
            cj cjVar4 = m35Var.o;
            k85 k85Var5 = m35Var.f;
            ku1 ku1Var5 = m35Var.k;
            int i13 = m35Var.e;
            boolean z10 = m35Var.A;
            int i14 = m35Var.B;
            int i15 = m35Var.C;
            List list5 = m35Var.D;
            j93VarQ0.g = cjVar4;
            zR = k85Var5.r(j93VarQ0.m);
            j93VarQ0.m = k85Var5;
            if (!zR) {
                j93VarQ0.s <<= 2;
                j93VarQ0.q = null;
                j93VarQ0.c = null;
                j93VarQ0.b = -1;
                j93VarQ0.i = -1;
            }
            j93VarQ0.y = ku1Var5;
            j93VarQ0.r = i13;
            j93VarQ0.n = z10;
            j93VarQ0.v = i14;
            j93VarQ0.x = i15;
            j93VarQ0.l = list5;
            j93VarQ0.s = (j93VarQ0.s << 2) | 2;
            j93VarQ0.q = null;
            j93VarQ0.c = null;
            j93VarQ0.b = -1;
            j93VarQ0.i = -1;
        }
        if (m35Var.h) {
            return;
        }
        if (z2) {
            br2.d(m35Var);
        } else {
            br2.d(m35Var);
        }
        if (z2) {
            c93.B(m35Var);
            c93.A(m35Var);
        } else {
            c93.B(m35Var);
            c93.A(m35Var);
        }
        if (z) {
            c93.A(m35Var);
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        m35 m35Var = new m35();
        m35Var.o = this.g;
        m35Var.f = this.y;
        m35Var.k = this.r;
        m35Var.d = this.n;
        m35Var.e = this.v;
        m35Var.A = this.x;
        m35Var.B = this.l;
        m35Var.C = this.j;
        m35Var.D = this.t;
        m35Var.E = this.a;
        m35Var.F = this.m;
        return m35Var;
    }
}
