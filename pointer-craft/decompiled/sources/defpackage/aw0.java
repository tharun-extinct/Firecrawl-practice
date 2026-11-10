package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class aw0 {
    public final String a;
    public final String g;
    public final boolean j;
    public final boolean l;
    public final String n;
    public final long r;
    public final boolean t;
    public final String v;
    public final boolean x;
    public final String y;
    public static final Pattern m = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern q = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern w = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern c = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public aw0(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.g = str;
        this.y = str2;
        this.r = j;
        this.n = str3;
        this.v = str4;
        this.x = z;
        this.l = z2;
        this.j = z3;
        this.t = z4;
        this.a = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aw0)) {
            return false;
        }
        aw0 aw0Var = (aw0) obj;
        return aw0Var.g.equals(this.g) && aw0Var.y.equals(this.y) && aw0Var.r == this.r && aw0Var.n.equals(this.n) && aw0Var.v.equals(this.v) && aw0Var.x == this.x && aw0Var.l == this.l && aw0Var.j == this.j && aw0Var.t == this.t && yf2.p(aw0Var.a, this.a);
    }

    public final int hashCode() {
        int iL = xi3.l(xi3.l(xi3.l(xi3.l(xi3.x(xi3.x(xi3.v(xi3.x(xi3.x(527, 31, this.g), 31, this.y), 31, this.r), 31, this.n), 31, this.v), 31, this.x), 31, this.l), 31, this.j), 31, this.t);
        String str = this.a;
        return iL + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.g);
        sb.append('=');
        sb.append(this.y);
        if (this.j) {
            long j = this.r;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) u01.g.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.t) {
            sb.append("; domain=");
            sb.append(this.n);
        }
        sb.append("; path=");
        sb.append(this.v);
        if (this.x) {
            sb.append("; secure");
        }
        if (this.l) {
            sb.append("; httponly");
        }
        String str2 = this.a;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
