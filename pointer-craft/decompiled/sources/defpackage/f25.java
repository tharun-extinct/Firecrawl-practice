package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f25 {
    public final String g;
    public final Set n;
    public final Set r;
    public final Map y;

    public f25(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.g = str;
        this.y = map;
        this.r = abstractSet;
        this.n = abstractSet2;
    }

    public static final f25 g(zx1 zx1Var, String str) {
        return dh6.v(new fz4(zx1Var), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f25)) {
            return false;
        }
        f25 f25Var = (f25) obj;
        if (!this.g.equals(f25Var.g) || !this.y.equals(f25Var.y) || !this.r.equals(f25Var.r)) {
            return false;
        }
        Set set2 = this.n;
        if (set2 == null || (set = f25Var.n) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.r.hashCode() + ((this.y.hashCode() + (this.g.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.g);
        sb.append("',\n            |    columns = {");
        sb.append(eh6.r(cj0.B0(this.y.values(), new fu1((byte) 14))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(eh6.r(this.r));
        sb.append("\n            |    indices = {");
        Set set = this.n;
        sb.append(eh6.r(set != null ? cj0.B0(set, new fu1((byte) 15)) : pi1.j));
        sb.append("\n            |}\n        ");
        return ux4.I(sb.toString());
    }
}
