package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class c25 {
    public final String g;
    public final int l;
    public final int n;
    public final boolean r;
    public final String v;
    public final byte x;
    public final String y;

    /* JADX WARN: Multi-variable type inference failed */
    public c25(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.g = str;
        this.y = str2;
        this.r = z;
        this.n = i;
        this.v = str3;
        this.x = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.l = tx4.Q(upperCase, "INT", false) ? 3 : (tx4.Q(upperCase, "CHAR", false) || tx4.Q(upperCase, "CLOB", false) || tx4.Q(upperCase, "TEXT", false)) ? 2 : tx4.Q(upperCase, "BLOB", false) ? 5 : (tx4.Q(upperCase, "REAL", false) || tx4.Q(upperCase, "FLOA", false) || tx4.Q(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c25) {
                boolean z = this.n > 0;
                c25 c25Var = (c25) obj;
                byte b = c25Var.x;
                if (z == (c25Var.n > 0) && yf2.p(this.g, c25Var.g) && this.r == c25Var.r) {
                    String str = c25Var.v;
                    byte b2 = this.x;
                    String str2 = this.v;
                    if ((b2 != 1 || b != 2 || str2 == null || eh6.y(str2, str)) && ((b2 != 2 || b != 1 || str == null || eh6.y(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : eh6.y(str2, str))) && this.l == c25Var.l))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.g.hashCode() * 31) + this.l) * 31) + (this.r ? 1231 : 1237)) * 31) + this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.g);
        sb.append("',\n            |   type = '");
        sb.append(this.y);
        sb.append("',\n            |   affinity = '");
        sb.append(this.l);
        sb.append("',\n            |   notNull = '");
        sb.append(this.r);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.n);
        sb.append("',\n            |   defaultValue = '");
        String str = this.v;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return ux4.G(ux4.I(sb.toString()), "    ");
    }
}
