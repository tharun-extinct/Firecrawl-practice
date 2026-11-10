package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class a92 {
    public final String g;
    public final String j;
    public final String l;
    public final String n;
    public final String r;
    public final int v;
    public final List x;
    public final String y;

    public a92(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.g = str;
        this.y = str2;
        this.r = str3;
        this.n = str4;
        this.v = i;
        this.x = arrayList;
        this.l = str5;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a92) && ((a92) obj).j.equals(this.j);
    }

    public final String g() {
        if (this.r.length() == 0) {
            return "";
        }
        int length = this.g.length() + 3;
        String str = this.j;
        return str.substring(tx4.V(str, ':', length, 4) + 1, tx4.V(str, '@', 0, 6));
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final URI l() {
        String strSubstring;
        String strReplaceAll;
        z82 z82Var = new z82();
        ArrayList arrayList = (ArrayList) z82Var.j;
        String str = this.g;
        z82Var.r = str;
        z82Var.n = v();
        z82Var.v = g();
        z82Var.x = this.n;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.v;
        z82Var.y = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(r());
        String strN = n();
        z82Var.t = strN != null ? z82.b(kf6.y(strN, 0, 0, " \"'<>#", 83)) : null;
        if (this.l == null) {
            strSubstring = null;
        } else {
            String str2 = this.j;
            strSubstring = str2.substring(tx4.V(str2, '#', 0, 6) + 1);
        }
        z82Var.l = strSubstring;
        String str3 = (String) z82Var.x;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        z82Var.x = strReplaceAll;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, kf6.y((String) arrayList.get(i3), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) z82Var.t;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? kf6.y(str4, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str5 = (String) z82Var.l;
        z82Var.l = str5 != null ? kf6.y(str5, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = z82Var.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String n() {
        if (this.x == null) {
            return null;
        }
        String str = this.j;
        int iV = tx4.V(str, '?', 0, 6) + 1;
        return str.substring(iV, us5.v(str, '#', iV, str.length()));
    }

    public final ArrayList r() {
        int length = this.g.length() + 3;
        String str = this.j;
        int iV = tx4.V(str, '/', length, 4);
        int iN = us5.n(iV, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iV < iN) {
            int i = iV + 1;
            int iV2 = us5.v(str, '/', i, iN);
            arrayList.add(str.substring(i, iV2));
            iV = iV2;
        }
        return arrayList;
    }

    public final String toString() {
        return this.j;
    }

    public final String v() {
        if (this.y.length() == 0) {
            return "";
        }
        int length = this.g.length() + 3;
        String str = this.j;
        return str.substring(length, us5.n(length, str.length(), str, ":@"));
    }

    public final String x() {
        z82 z82Var;
        try {
            z82Var = new z82();
            z82Var.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            z82Var = null;
        }
        z82Var.getClass();
        z82Var.n = kf6.y("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        z82Var.v = kf6.y("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return z82Var.a().j;
    }

    public final String y() {
        int length = this.g.length() + 3;
        String str = this.j;
        int iV = tx4.V(str, '/', length, 4);
        return str.substring(iV, us5.n(iV, str.length(), str, "?#"));
    }
}
