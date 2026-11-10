package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ka0 {
    public final i75 g;

    public ka0(i75 i75Var) {
        this.g = i75Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        i75 i75Var = this.g;
        cj cjVar = i75Var.g;
        i75 i75Var2 = ((ka0) obj).g;
        return yf2.p(cjVar, i75Var2.g) && i75Var.y.r(i75Var2.y) && yf2.p(i75Var.r, i75Var2.r) && i75Var.n == i75Var2.n && i75Var.v == i75Var2.v && i75Var.x == i75Var2.x && yf2.p(i75Var.l, i75Var2.l) && i75Var.j == i75Var2.j && i75Var.t == i75Var2.t && ws0.r(i75Var.a, i75Var2.a);
    }

    public final int hashCode() {
        i75 i75Var = this.g;
        int iHashCode = i75Var.g.hashCode() * 31;
        k85 k85Var = i75Var.y;
        ju4 ju4Var = k85Var.g;
        long j = ju4Var.y;
        o85[] o85VarArr = n85.y;
        int iHashCode2 = Long.hashCode(j) * 31;
        qv1 qv1Var = ju4Var.r;
        int i = (iHashCode2 + (qv1Var != null ? qv1Var.j : 0)) * 31;
        lv1 lv1Var = ju4Var.n;
        int iHashCode3 = (i + (lv1Var != null ? Integer.hashCode(lv1Var.g) : 0)) * 31;
        mv1 mv1Var = ju4Var.v;
        int iHashCode4 = (iHashCode3 + (mv1Var != null ? Integer.hashCode(mv1Var.g) : 0)) * 31;
        lu1 lu1Var = ju4Var.x;
        int iHashCode5 = (iHashCode4 + (lu1Var != null ? lu1Var.hashCode() : 0)) * 31;
        String str = ju4Var.l;
        int iV = xi3.v((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, ju4Var.j);
        ry ryVar = ju4Var.t;
        int iHashCode6 = (iV + (ryVar != null ? Float.hashCode(ryVar.g) : 0)) * 31;
        n65 n65Var = ju4Var.a;
        int iHashCode7 = (iHashCode6 + (n65Var != null ? n65Var.hashCode() : 0)) * 31;
        tx2 tx2Var = ju4Var.m;
        int iHashCode8 = (iHashCode7 + (tx2Var != null ? tx2Var.j.hashCode() : 0)) * 31;
        long j2 = ju4Var.q;
        int i2 = jj0.t;
        int iV2 = xi3.v(iHashCode8, 31, j2);
        tt3 tt3Var = ju4Var.i;
        int iHashCode9 = (k85Var.y.hashCode() + ((iV2 + (tt3Var != null ? tt3Var.hashCode() : 0)) * 31)) * 31;
        zt3 zt3Var = k85Var.r;
        return Long.hashCode(i75Var.a) + ((i75Var.t.hashCode() + ((i75Var.j.hashCode() + ((i75Var.l.hashCode() + du4.r(i75Var.x, xi3.l((((i75Var.r.hashCode() + ((iHashCode9 + (zt3Var != null ? zt3Var.hashCode() : 0) + iHashCode) * 31)) * 31) + i75Var.n) * 31, 31, i75Var.v), 31)) * 31)) * 31)) * 31);
    }
}
