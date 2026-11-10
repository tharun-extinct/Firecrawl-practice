package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class e43 {
    public final String g;
    public final String[] y;
    public static final y54 r = new y54("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final y54 n = new y54(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public e43(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.g = str;
        this.y = strArr;
    }

    public static Charset g(e43 e43Var) {
        String str;
        String[] strArr = e43Var.y;
        int i = 0;
        int iH = br2.h(0, strArr.length - 1, 2);
        if (iH < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!ay4.J(strArr[i], "charset", true)) {
                if (i == iH) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e43) && yf2.p(((e43) obj).g, this.g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return this.g;
    }
}
