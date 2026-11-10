package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ux4 extends sp2 {
    public static String G(String str, String str2) {
        byte b = 1;
        return dk4.M(new h25(new ek4(str, b), new oz(str2, (byte) 9), b), "\n");
    }

    public static String H(String str) {
        List listA0 = tx4.a0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA0) {
            if (!tx4.Y((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!a11.h(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Integer num = (Integer) cj0.u0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listA0.size();
        vy3 vy3Var = new vy3((byte) 13);
        int size2 = listA0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listA0.iterator();
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length3);
                cj0.p0(arrayList3, sb, null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                pw5.R();
                throw null;
            }
            String str4 = (String) next;
            if ((i != 0 && i != size2) || !tx4.Y(str4)) {
                str4.getClass();
                if (iIntValue < 0) {
                    l0.t(du4.w(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str4.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                str3 = (String) vy3Var.a(str4.substring(length4));
                if (str3 == null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i3;
        }
    }

    public static String I(String str) {
        String str2;
        if (tx4.Y("|")) {
            l0.u("marginPrefix must be non-blank string.");
            return null;
        }
        List listA0 = tx4.a0(str);
        int length = str.length();
        listA0.size();
        vy3 vy3Var = new vy3((byte) 13);
        int size = listA0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listA0) {
            int i2 = i + 1;
            if (i < 0) {
                pw5.R();
                throw null;
            }
            String str3 = (String) obj;
            if ((i == 0 || i == size) && tx4.Y(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!a11.h(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && ay4.O(str3, "|", i3, false)) ? str3.substring("|".length() + i3) : null;
                if (strSubstring != null && (str2 = (String) vy3Var.a(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        cj0.p0(arrayList, sb, null, 124);
        return sb.toString();
    }
}
