package defpackage;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xu1 {
    public final String g;
    public final String l;
    public final List n;
    public final String r;
    public final String v;
    public final String x;
    public final String y;

    public xu1(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.g = str;
        str2.getClass();
        this.y = str2;
        this.r = str3;
        list.getClass();
        this.n = list;
        this.v = str4;
        this.x = str5;
        StringBuilder sbZ = du4.z(str, "-", str2, "-", str3);
        sbZ.append("-");
        sbZ.append(str4);
        if (str5 != null) {
            int length = str5.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str5.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    sbZ.append("-VF");
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        this.l = sbZ.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb.append(this.g);
        sb.append(", mProviderPackage: ");
        sb.append(this.y);
        sb.append(", mQuery: ");
        sb.append(this.r);
        sb.append(", mSystemFont: ");
        sb.append(this.v);
        sb.append(", mVariationSettings: ");
        StringBuilder sb2 = new StringBuilder(du4.b(sb, this.x, ", mCertificates:"));
        int i = 0;
        while (true) {
            List list = this.n;
            if (i >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i++;
        }
    }
}
