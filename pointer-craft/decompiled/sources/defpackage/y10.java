package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y10 {
    public static final y54 g = new y54("network request failed|timeout|connection reset|connection abort|unable to resolve host", 0);

    public static final o20 g(fu3 fu3Var, boolean z, f24 f24Var, f24 f24Var2, boolean z2, boolean z3, boolean z4) {
        Object obj;
        fu3Var.getClass();
        f24Var.getClass();
        f24Var2.getClass();
        if (z2) {
            return l20.g;
        }
        if (fu3Var != fu3.j) {
            return m20.g;
        }
        int i = 0;
        ArrayList arrayListW = pr.W(new o20[]{r(f24Var), r(f24Var2)});
        int size = arrayListW.size();
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListW.get(i);
            i++;
        } while (!yf2.p((o20) obj, n20.g));
        o20 o20Var = (o20) obj;
        if (o20Var != null) {
            return o20Var;
        }
        o20 o20Var2 = (o20) cj0.l0(arrayListW);
        if (o20Var2 != null) {
            return o20Var2;
        }
        if (z) {
            return (z3 || z4) ? i20.g : j20.g;
        }
        return k20.g;
    }

    public static final boolean n(f24 f24Var) {
        return yf2.p(r(f24Var), n20.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0018, code lost:
    
        if (r0 != 12) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (r0.j.matcher(r2).find() == true) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.o20 r(defpackage.f24 r2) {
        /*
            int r0 = r2.g
            r1 = -3
            if (r0 == r1) goto L3a
            r1 = -2
            if (r0 == r1) goto L37
            r1 = -1
            if (r0 == r1) goto L3a
            if (r0 == 0) goto L35
            r1 = 2
            if (r0 == r1) goto L3a
            r1 = 3
            if (r0 == r1) goto L37
            r1 = 5
            if (r0 == r1) goto L1b
            r2 = 12
            if (r0 == r2) goto L3a
            goto L32
        L1b:
            java.lang.String r2 = r2.y
            if (r2 == 0) goto L32
            y54 r0 = defpackage.y10.g
            r0.getClass()
            java.util.regex.Pattern r0 = r0.j
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.find()
            r0 = 1
            if (r2 != r0) goto L32
            goto L3a
        L32:
            h20 r2 = defpackage.h20.g
            return r2
        L35:
            r2 = 0
            return r2
        L37:
            g20 r2 = defpackage.g20.g
            return r2
        L3a:
            n20 r2 = defpackage.n20.g
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y10.r(f24):o20");
    }

    public static final String y(f24 f24Var) {
        String str;
        int i = f24Var.g;
        String str2 = f24Var.y;
        if (i != 12) {
            switch (i) {
                case -3:
                    str = "SERVICE_TIMEOUT";
                    break;
                case -2:
                    str = "FEATURE_NOT_SUPPORTED";
                    break;
                case -1:
                    str = "SERVICE_DISCONNECTED";
                    break;
                case 0:
                    str = "OK";
                    break;
                case 1:
                    str = "USER_CANCELED";
                    break;
                case 2:
                    str = "SERVICE_UNAVAILABLE";
                    break;
                case 3:
                    str = "BILLING_UNAVAILABLE";
                    break;
                case 4:
                    str = "ITEM_UNAVAILABLE";
                    break;
                case 5:
                    str = "DEVELOPER_ERROR";
                    break;
                case 6:
                    str = "ERROR";
                    break;
                case 7:
                    str = "ITEM_ALREADY_OWNED";
                    break;
                case 8:
                    str = "ITEM_NOT_OWNED";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "NETWORK_ERROR";
        }
        String str3 = str + "(" + i + ")";
        return (str2 == null || tx4.Y(str2)) ? str3 : du4.i(str3, " ", str2);
    }
}
