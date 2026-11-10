package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class z82 {
    public final /* synthetic */ byte g;
    public Object j;
    public Object l;
    public Serializable n;
    public Object r;
    public Object t;
    public Serializable v;
    public Object x;
    public int y;

    public z82(Context context, int i) {
        int next;
        this.g = (byte) 1;
        w();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    iw4.t(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            w();
        }
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iV = tx4.V(str, '&', i, 4);
            if (iV == -1) {
                iV = str.length();
            }
            int iV2 = tx4.V(str, '=', i, 4);
            if (iV2 == -1 || iV2 > iV) {
                arrayList.add(str.substring(i, iV));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iV2));
                arrayList.add(str.substring(iV2 + 1, iV));
            }
            i = iV + 1;
        }
        return arrayList;
    }

    public static /* synthetic */ hw4 g(z82 z82Var) {
        return (hw4) z82Var.t;
    }

    public static /* synthetic */ hw4 j(z82 z82Var) {
        return (hw4) z82Var.j;
    }

    public static /* synthetic */ hw4 l(z82 z82Var) {
        return (hw4) z82Var.l;
    }

    public static /* synthetic */ int[][] n(z82 z82Var) {
        return (int[][]) z82Var.n;
    }

    public static /* synthetic */ fn4 r(z82 z82Var) {
        return (fn4) z82Var.r;
    }

    public static /* synthetic */ fn4[] v(z82 z82Var) {
        return (fn4[]) z82Var.v;
    }

    public static /* synthetic */ hw4 x(z82 z82Var) {
        return (hw4) z82Var.x;
    }

    public a92 a() {
        ArrayList arrayList;
        String str = (String) this.r;
        if (str == null) {
            l0.z("scheme == null");
            return null;
        }
        String strL = kf6.l((String) this.n, 0, 0, 7);
        String strL2 = kf6.l((String) this.v, 0, 0, 7);
        String str2 = (String) this.x;
        if (str2 == null) {
            l0.z("host == null");
            return null;
        }
        int iQ = q();
        ArrayList arrayList2 = (ArrayList) this.j;
        ArrayList arrayList3 = new ArrayList(dj0.Y(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(kf6.l((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.t;
        if (arrayList4 != null) {
            arrayList = new ArrayList(dj0.Y(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? kf6.l(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.l;
        return new a92(str, strL, strL2, str2, iQ, arrayList, str4 != null ? kf6.l(str4, 0, 0, 7) : null, toString());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0029  */
    public void c(a92 a92Var, String str) {
        int i;
        int iN;
        int i2;
        char cCharAt;
        ArrayList arrayList = (ArrayList) this.j;
        byte[] bArr = us5.g;
        int iJ = us5.j(0, str.length(), str);
        int iT = us5.t(iJ, str.length(), str);
        byte b = -1;
        if (iT - iJ < 2) {
            i = -1;
            break;
        }
        char cCharAt2 = str.charAt(iJ);
        char c = 'a';
        if ((yf2.f(cCharAt2, 97) < 0 || yf2.f(cCharAt2, 122) > 0) && (yf2.f(cCharAt2, 65) < 0 || yf2.f(cCharAt2, 90) > 0)) {
            i = -1;
            break;
        }
        i = iJ + 1;
        while (true) {
            if (i < iT) {
                char cCharAt3 = str.charAt(i);
                if ((c > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    if (cCharAt3 != ':') {
                        break;
                    } else {
                        break;
                    }
                } else {
                    i++;
                    c = 'a';
                }
            }
            i = -1;
            break;
        }
        if (i == -1) {
            if (a92Var == null) {
                l0.u("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? tx4.n0(str, 6).concat("...") : str));
                return;
            }
            this.r = a92Var.g;
        } else if (ay4.O(str, "https:", iJ, true)) {
            this.r = "https";
            iJ += 6;
        } else {
            if (!ay4.O(str, "http:", iJ, true)) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
            }
            this.r = "http";
            iJ += 5;
        }
        int i3 = 0;
        for (int i4 = iJ; i4 < iT && ((cCharAt = str.charAt(i4)) == '/' || cCharAt == '\\'); i4++) {
            i3++;
        }
        byte b2 = 35;
        if (i3 >= 2 || a92Var == null || !yf2.p(a92Var.g, (String) this.r)) {
            int i5 = iJ + i3;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iN = us5.n(i5, iT, str, "@/\\?#");
                byte bCharAt = iN != iT ? str.charAt(iN) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z) {
                        this.v = ((String) this.v) + "%40" + kf6.y(str, i5, iN, " \"':;<=>@[]^`{}|/\\?#", 112);
                    } else {
                        int iV = us5.v(str, ':', i5, iN);
                        String strY = kf6.y(str, i5, iV, " \"':;<=>@[]^`{}|/\\?#", 112);
                        if (z2) {
                            strY = du4.b(new StringBuilder((String) this.n), "%40", strY);
                        }
                        this.n = strY;
                        if (iV != iN) {
                            this.v = kf6.y(str, iV + 1, iN, " \"':;<=>@[]^`{}|/\\?#", 112);
                            z = true;
                        }
                        z2 = true;
                    }
                    i5 = iN + 1;
                    b = -1;
                    b2 = 35;
                }
            }
            int i6 = i5;
            while (true) {
                if (i6 >= iN) {
                    i6 = iN;
                    break;
                }
                char cCharAt4 = str.charAt(i6);
                if (cCharAt4 == ':') {
                    break;
                }
                if (cCharAt4 == '[') {
                    do {
                        i6++;
                        if (i6 >= iN) {
                            break;
                        }
                    } while (str.charAt(i6) != ']');
                }
                i6++;
            }
            int i7 = i6 + 1;
            if (i7 < iN) {
                this.x = ss5.y(kf6.l(str, i5, i6, 4));
                try {
                    i2 = Integer.parseInt(kf6.y(str, i7, iN, "", 120));
                    if (1 > i2 || i2 >= 65536) {
                        i2 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.y = i2;
                if (i2 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str.substring(i7, iN) + '\"').toString());
                }
            } else {
                this.x = ss5.y(kf6.l(str, i5, i6, 4));
                String str2 = (String) this.r;
                str2.getClass();
                this.y = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (((String) this.x) == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str.substring(i5, i6) + '\"').toString());
            }
            iJ = iN;
        } else {
            this.n = a92Var.v();
            this.v = a92Var.g();
            this.x = a92Var.n;
            this.y = a92Var.v;
            arrayList.clear();
            arrayList.addAll(a92Var.r());
            if (iJ == iT || str.charAt(iJ) == '#') {
                String strN = a92Var.n();
                this.t = strN != null ? b(kf6.y(strN, 0, 0, " \"'<>#", 83)) : null;
            }
        }
        int iN2 = us5.n(iJ, iT, str, "?#");
        if (iJ != iN2) {
            char cCharAt5 = str.charAt(iJ);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iJ++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iJ < iN2) {
                int iN3 = us5.n(iJ, iN2, str, "/\\");
                boolean z3 = iN3 < iN2;
                String strY2 = kf6.y(str, iJ, iN3, " \"<>^`{}|/\\?#", 112);
                if (!strY2.equals(".") && !strY2.equalsIgnoreCase("%2e")) {
                    if (!strY2.equals("..") && !strY2.equalsIgnoreCase("%2e.") && !strY2.equalsIgnoreCase(".%2e") && !strY2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strY2);
                        } else {
                            arrayList.add(strY2);
                        }
                        if (z3) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iJ = z3 ? iN3 + 1 : iN3;
            }
        }
        if (iN2 < iT && str.charAt(iN2) == '?') {
            int iV2 = us5.v(str, '#', iN2, iT);
            this.t = b(kf6.y(str, iN2 + 1, iV2, " \"'<>#", 80));
            iN2 = iV2;
        }
        if (iN2 >= iT || str.charAt(iN2) != '#') {
            return;
        }
        this.l = kf6.y(str, iN2 + 1, iT, "", 48);
    }

    public void i(hw4 hw4Var, int i) {
        if ((i | 1) == i) {
            this.x = hw4Var;
        }
        if ((i | 2) == i) {
            this.l = hw4Var;
        }
        if ((i | 4) == i) {
            this.j = hw4Var;
        }
        if ((i | 8) == i) {
            this.t = hw4Var;
        }
    }

    public iw4 m() {
        if (this.y == 0) {
            return null;
        }
        return new iw4(this);
    }

    public int q() {
        int i = this.y;
        if (i != -1) {
            return i;
        }
        String str = (String) this.r;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [fn4[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void t(int[] iArr, fn4 fn4Var) {
        int i = this.y;
        if (i == 0 || iArr.length == 0) {
            this.r = fn4Var;
        }
        int[][] iArr2 = (int[][]) this.n;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.n = r3;
            ?? r1 = new fn4[i2];
            System.arraycopy((fn4[]) this.v, 0, r1, 0, i);
            this.v = r1;
        }
        int[][] iArr3 = (int[][]) this.n;
        int i3 = this.y;
        iArr3[i3] = iArr;
        ((fn4[]) this.v)[i3] = fn4Var;
        this.y = i3 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    public String toString() {
        switch (this.g) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.r;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.n).length() > 0 || ((String) this.v).length() > 0) {
                    sb.append((String) this.n);
                    if (((String) this.v).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.v);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.x;
                if (str2 != null) {
                    if (tx4.R(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.x);
                        sb.append(']');
                    } else {
                        sb.append((String) this.x);
                    }
                }
                int i = -1;
                if (this.y != -1 || ((String) this.r) != null) {
                    int iQ = q();
                    String str3 = (String) this.r;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iQ);
                    } else {
                        if (str3.equals("http")) {
                            i = 80;
                        } else if (str3.equals("https")) {
                            i = 443;
                        }
                        if (iQ != i) {
                            sb.append(':');
                            sb.append(iQ);
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) this.j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.t) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.t;
                    arrayList2.getClass();
                    ke2 ke2VarG = xs2.G(xs2.K(0, arrayList2.size()), 2);
                    int i3 = ke2VarG.j;
                    int i4 = ke2VarG.t;
                    int i5 = ke2VarG.a;
                    if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i3);
                            String str5 = (String) arrayList2.get(i3 + 1);
                            if (i3 > 0) {
                                sb.append('&');
                            }
                            sb.append(str4);
                            if (str5 != null) {
                                sb.append('=');
                                sb.append(str5);
                            }
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                }
                if (((String) this.l) != null) {
                    sb.append('#');
                    sb.append((String) this.l);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fn4[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void w() {
        this.r = new fn4();
        this.n = new int[10][];
        this.v = new fn4[10];
    }

    public z82(fn4 fn4Var) {
        this.g = (byte) 1;
        w();
        t(StateSet.WILD_CARD, fn4Var);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [fn4[], java.io.Serializable] */
    public z82(iw4 iw4Var) {
        this.g = (byte) 1;
        int i = iw4Var.g;
        this.y = i;
        this.r = iw4Var.y;
        int[][] iArr = iw4Var.r;
        ?? r2 = new int[iArr.length][];
        this.n = r2;
        fn4[] fn4VarArr = iw4Var.n;
        this.v = new fn4[fn4VarArr.length];
        System.arraycopy(iArr, 0, r2, 0, i);
        System.arraycopy(fn4VarArr, 0, (fn4[]) this.v, 0, this.y);
        this.x = iw4Var.v;
        this.l = iw4Var.x;
        this.j = iw4Var.l;
        this.t = iw4Var.j;
    }

    public z82() {
        this.g = (byte) 0;
        this.n = "";
        this.v = "";
        this.y = -1;
        this.j = pw5.A("");
    }
}
