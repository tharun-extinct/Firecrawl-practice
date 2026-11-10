package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class tx4 extends ay4 {
    public static boolean Q(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return W(charSequence, str, 0, z, 2) >= 0;
    }

    public static boolean R(CharSequence charSequence, char c) {
        charSequence.getClass();
        return V(charSequence, c, 0, 2) >= 0;
    }

    public static boolean S(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : c0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static Character T(String str, int i) {
        if (i < 0 || i >= str.length()) {
            return null;
        }
        return Character.valueOf(str.charAt(i));
    }

    public static final int U(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        me2 me2Var = new me2(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = me2Var.a;
        int i3 = me2Var.t;
        if (!z2) {
            boolean z3 = z;
            if ((i2 <= 0 || i > i3) && (i2 >= 0 || i3 > i)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z4 = z3;
                z3 = z4;
                if (c0(str, 0, charSequence2, i, str.length(), z4)) {
                    return i;
                }
                if (i == i3) {
                    return -1;
                }
                i += i2;
                charSequence = charSequence2;
            }
        } else {
            if ((i2 <= 0 || i > i3) && (i2 >= 0 || i3 > i)) {
                return -1;
            }
            int i4 = i;
            while (true) {
                String str2 = str;
                boolean z5 = z;
                if (ay4.K(0, i4, str.length(), str2, (String) charSequence, z5)) {
                    return i4;
                }
                if (i4 == i3) {
                    return -1;
                }
                i4 += i2;
                str = str2;
                z = z5;
            }
        }
    }

    public static int V(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? X(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int W(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return U(charSequence, str, i, z);
    }

    public static final int X(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(pr.g0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (a11.b(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean Y(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!a11.h(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int Z(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = charSequence.length() - 1;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(pr.g0(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (a11.b(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static List a0(CharSequence charSequence) {
        lv2 lv2Var = new lv2(charSequence);
        if (!lv2Var.hasNext()) {
            return pi1.j;
        }
        Object next = lv2Var.next();
        if (!lv2Var.hasNext()) {
            return pw5.k(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (lv2Var.hasNext()) {
            arrayList.add(lv2Var.next());
        }
        return arrayList;
    }

    public static String b0(String str, int i) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            l0.u(du4.w(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean c0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!a11.b(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String d0(CharSequence charSequence, String str) {
        str.getClass();
        return j0(str, charSequence) ? str.substring(charSequence.length()) : str;
    }

    public static StringBuilder e0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            l0.p(du4.q(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static Character f0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    public static final List g0(CharSequence charSequence, String str) {
        int iU = U(charSequence, str, 0, false);
        if (iU == -1) {
            return pw5.k(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iU).toString());
            length = str.length() + iU;
            iU = U(charSequence, str, length, false);
        } while (iU != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List h0(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return g0(charSequence, str);
            }
        }
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        gk4 gk4Var = new gk4(new h51(charSequence, new zl4(listAsList, (byte) 8)));
        ArrayList arrayList = new ArrayList(dj0.Y(gk4Var, 10));
        Iterator it = gk4Var.iterator();
        while (true) {
            g51 g51Var = (g51) it;
            if (!g51Var.hasNext()) {
                return arrayList;
            }
            me2 me2Var = (me2) g51Var.next();
            me2Var.getClass();
            arrayList.add(charSequence.subSequence(me2Var.j, me2Var.t + 1).toString());
        }
    }

    public static List i0(String str, char[] cArr) {
        if (cArr.length == 1) {
            return g0(str, String.valueOf(cArr[0]));
        }
        gk4 gk4Var = new gk4(new h51(str, new zl4(cArr, (byte) 7)));
        ArrayList arrayList = new ArrayList(dj0.Y(gk4Var, 10));
        Iterator it = gk4Var.iterator();
        while (true) {
            g51 g51Var = (g51) it;
            if (!g51Var.hasNext()) {
                return arrayList;
            }
            me2 me2Var = (me2) g51Var.next();
            me2Var.getClass();
            arrayList.add(str.subSequence(me2Var.j, me2Var.t + 1).toString());
        }
    }

    public static boolean j0(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? ay4.P((String) charSequence, (String) charSequence2, false) : c0(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static String k0(String str, String str2, String str3) {
        int iW = W(str, str2, 0, false, 6);
        return iW == -1 ? str3 : str.substring(str2.length() + iW, str.length());
    }

    public static String l0(String str, String str2) {
        int iW = W(str, str2, 0, false, 6);
        return iW == -1 ? str : str.substring(0, iW);
    }

    public static CharSequence m0(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0) {
            l0.t(du4.w(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String n0(String str, int i) {
        if (i < 0) {
            l0.t(du4.w(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String o0(String str, int i) {
        str.getClass();
        if (i < 0) {
            l0.t(du4.w(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static List p0(String str) {
        int length = str.length();
        if (length == 0) {
            return pi1.j;
        }
        if (length == 1) {
            return pw5.k(Character.valueOf(str.charAt(0)));
        }
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Character.valueOf(str.charAt(i)));
        }
        return arrayList;
    }

    public static CharSequence q0(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zH = a11.h(str.charAt(!z ? i : length));
            if (z) {
                if (!zH) {
                    break;
                }
                length--;
            } else if (zH) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
