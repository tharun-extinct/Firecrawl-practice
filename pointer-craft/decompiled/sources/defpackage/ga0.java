package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ga0 {
    public static final Set n;
    public static final String r;
    public static final ga0 v;
    public final String g;
    public final String y;

    static {
        String strS = js2.s("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        r = strS;
        js2.s("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        js2.s("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        n = Collections.unmodifiableSet(new HashSet(Arrays.asList(new dj1("proto"), new dj1("json"))));
        v = new ga0(strS, null);
    }

    public ga0(String str, String str2) {
        this.g = str;
        this.y = str2;
    }

    public static ga0 g(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            l0.u("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            l0.u("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            l0.u("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        return new ga0(str2, str3.isEmpty() ? null : str3);
    }
}
