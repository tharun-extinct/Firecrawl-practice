package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d25 {
    public final String g;
    public final List n;
    public final String r;
    public final List v;
    public final String y;

    public d25(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.g = str;
        this.y = str2;
        this.r = str3;
        this.n = list;
        this.v = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d25)) {
            return false;
        }
        d25 d25Var = (d25) obj;
        if (yf2.p(this.g, d25Var.g) && yf2.p(this.y, d25Var.y) && yf2.p(this.r, d25Var.r) && yf2.p(this.n, d25Var.n)) {
            return yf2.p(this.v, d25Var.v);
        }
        return false;
    }

    public final int hashCode() {
        return this.v.hashCode() + ((this.n.hashCode() + xi3.x(xi3.x(this.g.hashCode() * 31, 31, this.y), 31, this.r)) * 31);
    }

    public final String toString() {
        return ux4.G(ux4.I("\n            |ForeignKey {\n            |   referenceTable = '" + this.g + "',\n            |   onDelete = '" + this.y + "',\n            |   onUpdate = '" + this.r + "',\n            |   columnNames = {" + eh6.l(cj0.A0(this.n)) + "\n            |   referenceColumnNames = {" + eh6.x(cj0.A0(this.v)) + "\n            |}\n        "), "    ");
    }
}
