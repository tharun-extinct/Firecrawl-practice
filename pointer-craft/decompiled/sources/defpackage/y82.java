package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y82 {
    static {
        fa0 fa0Var = fa0.m;
        aj6.p("\"\\");
        aj6.p("\t ,=");
    }

    public static final boolean g(z74 z74Var) {
        if (yf2.p(z74Var.j.y, "HEAD")) {
            return false;
        }
        int i = z74Var.m;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || ws5.v(z74Var) != -1) {
            return true;
        }
        String strG = z74Var.w.g("Transfer-Encoding");
        if (strG == null) {
            strG = null;
        }
        return "chunked".equalsIgnoreCase(strG);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x021d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    public static final void y(bi6 bi6Var, a92 a92Var, c52 c52Var) {
        List listUnmodifiableList;
        List listUnmodifiableList2;
        aw0 aw0Var;
        aw0 aw0Var2;
        String strSubstring;
        bi6Var.getClass();
        a92Var.getClass();
        c52Var.getClass();
        if (bi6Var == bi6.q) {
            return;
        }
        Pattern pattern = aw0.m;
        int size = c52Var.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(ec6.v(c52Var, i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(ec6.l(c52Var, i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = null;
        }
        List list = pi1.j;
        List list2 = listUnmodifiableList == null ? list : listUnmodifiableList;
        int size2 = list2.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) list2.get(i2);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = us5.g;
            char c = ';';
            int iV = us5.v(str, ';', 0, str.length());
            char c2 = '=';
            int iV2 = us5.v(str, '=', 0, iV);
            if (iV2 == iV) {
                aw0Var = null;
            } else {
                int iJ = us5.j(0, iV2, str);
                String strSubstring2 = str.substring(iJ, us5.t(iJ, iV2, str));
                if (strSubstring2.length() != 0 && us5.l(strSubstring2) == -1) {
                    int iJ2 = us5.j(iV2 + 1, iV, str);
                    String strSubstring3 = str.substring(iJ2, us5.t(iJ2, iV, str));
                    if (us5.l(strSubstring3) == -1) {
                        int i3 = iV + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long jR = 253402300799999L;
                        String str2 = null;
                        String strSubstring4 = null;
                        long j2 = -1;
                        boolean z4 = true;
                        String str3 = null;
                        while (true) {
                            if (i3 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                                        j = j3;
                                    }
                                } else {
                                    j = jR;
                                }
                                String str4 = a92Var.n;
                                if (str2 != null) {
                                    if (!yf2.p(str4, str2)) {
                                        str4.getClass();
                                        if (!str4.endsWith(str2) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || ss5.g.n(str4)) {
                                            aw0Var2 = null;
                                        }
                                    }
                                    aw0Var = aw0Var2;
                                    break;
                                }
                                str2 = str4;
                                if (str4.length() == str2.length() || PublicSuffixDatabase.n.g(str2) != null) {
                                    if (strSubstring4 == null || !ay4.P(strSubstring4, "/", false)) {
                                        String strY = a92Var.y();
                                        int iZ = tx4.Z(strY, '/', 0, 6);
                                        strSubstring4 = iZ != 0 ? strY.substring(0, iZ) : "/";
                                    }
                                    aw0Var2 = new aw0(strSubstring2, strSubstring3, j, str2, strSubstring4, z, z2, z3, z4, str3);
                                } else {
                                    aw0Var2 = null;
                                }
                                aw0Var = aw0Var2;
                                break;
                            }
                            int iV3 = us5.v(str, c, i3, length);
                            int iV4 = us5.v(str, c2, i3, iV3);
                            int iJ3 = us5.j(i3, iV4, str);
                            String strSubstring5 = str.substring(iJ3, us5.t(iJ3, iV4, str));
                            if (iV4 < iV3) {
                                int iJ4 = us5.j(iV4 + 1, iV3, str);
                                strSubstring = str.substring(iJ4, us5.t(iJ4, iV3, str));
                            } else {
                                strSubstring = "";
                            }
                            if (strSubstring5.equalsIgnoreCase("expires")) {
                                try {
                                    jR = ud6.r(strSubstring, strSubstring.length());
                                    z3 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                try {
                                    long j4 = Long.parseLong(strSubstring);
                                    j2 = j4 <= 0 ? Long.MIN_VALUE : j4;
                                } catch (NumberFormatException e) {
                                    Pattern patternCompile = Pattern.compile("-?\\d+");
                                    patternCompile.getClass();
                                    if (!patternCompile.matcher(strSubstring).matches()) {
                                        throw e;
                                    }
                                    j2 = ay4.P(strSubstring, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z3 = true;
                            } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                if (strSubstring.endsWith(".")) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strY2 = ss5.y(tx4.d0(".", strSubstring));
                                if (strY2 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strY2;
                                z4 = false;
                            } else if (strSubstring5.equalsIgnoreCase("path")) {
                                strSubstring4 = strSubstring;
                            } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                z = true;
                            } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                z2 = true;
                            } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                                str3 = strSubstring;
                            }
                            i3 = iV3 + 1;
                            c = ';';
                            c2 = '=';
                        }
                    } else {
                        aw0Var = null;
                    }
                } else {
                    aw0Var = null;
                }
            }
            if (aw0Var != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(aw0Var);
            }
        }
        if (arrayList2 != null) {
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
            listUnmodifiableList2.getClass();
        } else {
            listUnmodifiableList2 = null;
        }
        if (listUnmodifiableList2 != null) {
            list = listUnmodifiableList2;
        }
        list.isEmpty();
    }
}
