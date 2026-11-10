package defpackage;

import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eh6 {
    public static pd g() {
        if (pd.v) {
            return new pd();
        }
        return null;
    }

    public static int j(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        uo1.t(du4.m(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static final String l(Collection collection) {
        return ux4.G(cj0.q0(collection, ",", null, null, null, 62), "    ").concat(ux4.G("},", "    "));
    }

    public static void n() {
        boolean z = pd.v;
    }

    public static final String r(Collection collection) {
        return !collection.isEmpty() ? ux4.G(cj0.q0(collection, ",\n", "\n", "\n", null, 56), "    ").concat("},") : " }";
    }

    public static boolean v() {
        return pd.v;
    }

    public static final String x(Collection collection) {
        return ux4.G(cj0.q0(collection, ",", null, null, null, 62), "    ").concat(ux4.G(" }", "    "));
    }

    public static final boolean y(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return yf2.p(tx4.q0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }
}
