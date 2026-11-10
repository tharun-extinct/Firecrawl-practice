package defpackage;

import java.io.EOFException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes2.dex */
public final class fj3 implements HostnameVerifier {
    public static final fj3 g = new fj3();

    public static List g(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && yf2.p(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return pi1.j;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    public static boolean r(String str, X509Certificate x509Certificate) throws EOFException {
        boolean zEquals;
        int length;
        str.getClass();
        if (ss5.g.n(str)) {
            String strY = ss5.y(str);
            if (strY != null) {
                List listG = g(x509Certificate, 7);
                if (!listG.isEmpty()) {
                    Iterator it = listG.iterator();
                    while (it.hasNext()) {
                        if (strY.equals(ss5.y((String) it.next()))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        if (y(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> listG2 = g(x509Certificate, 2);
        if (!listG2.isEmpty()) {
            for (String lowerCase : listG2) {
                if (str.length() == 0 || ay4.P(str, ".", false) || str.endsWith("..") || lowerCase == null || lowerCase.length() == 0 || ay4.P(lowerCase, ".", false) || lowerCase.endsWith("..")) {
                    zEquals = false;
                } else {
                    String strConcat = !str.endsWith(".") ? str.concat(".") : str;
                    if (!lowerCase.endsWith(".")) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (y(lowerCase)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        lowerCase = lowerCase.toLowerCase(locale2);
                        lowerCase.getClass();
                    }
                    if (!tx4.Q(lowerCase, "*", false)) {
                        zEquals = strConcat.equals(lowerCase);
                    } else if (!ay4.P(lowerCase, "*.", false) || tx4.V(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zEquals = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (strConcat.endsWith(strSubstring) && ((length = strConcat.length() - strSubstring.length()) <= 0 || tx4.Z(strConcat, '.', length - 1, 4) == -1)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    }
                }
                if (zEquals) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean y(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            l0.t(du4.w(length2, "endIndex < beginIndex: ", " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            StringBuilder sbP = du4.p(length2, "endIndex > string.length: ", " > ");
            sbP.append(str.length());
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (y(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return r(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
