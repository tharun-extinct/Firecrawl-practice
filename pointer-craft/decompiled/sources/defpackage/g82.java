package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class g82 {
    public static final fa0 g;
    public static final String[] n;
    public static final String[] r;
    public static final String[] y;

    static {
        fa0 fa0Var = fa0.m;
        g = aj6.p("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        y = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        r = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = ws5.n("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        n = strArr;
        String[] strArr2 = r;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = du4.b(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = r;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = du4.b(sb, strArr3[i4], "|PADDED");
        }
        int length = r.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = r;
            if (strArr4[i7] == null) {
                strArr4[i7] = n[i7];
            }
        }
    }

    public static String g(int i) {
        String[] strArr = y;
        return i < strArr.length ? strArr[i] : ws5.n("0x%02x", Integer.valueOf(i));
    }

    public static String r(boolean z, int i, int i2, long j) {
        return ws5.n("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), g(8), Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0055  */
    public static String y(boolean z, int i, int i2, int i3, int i4) {
        String strM;
        String str;
        String strG = g(i3);
        if (i4 == 0) {
            strM = "";
        } else {
            String[] strArr = n;
            if (i3 == 2 || i3 == 3) {
                strM = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strM = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 == 7 || i3 == 8) {
                strM = strArr[i4];
            } else {
                String[] strArr2 = r;
                if (i4 < strArr2.length) {
                    str = strArr2[i4];
                    str.getClass();
                } else {
                    str = strArr[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strM = (i3 != 0 || (i4 & 32) == 0) ? str : ay4.M(str, "PRIORITY", "COMPRESSED");
                } else {
                    strM = ay4.M(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return ws5.n("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strG, strM);
    }
}
