package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.view.inputmethod.HandwritingGesture;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pg6 {
    public static e9 g(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            return new e9(x509TrustManager, x509TrustManagerExtensions);
        }
        return null;
    }

    public static final bj n(bj bjVar) {
        Object obj = bjVar.g;
        obj.getClass();
        return new bj(bjVar.y, bjVar.r, ((qx4) obj).g, bjVar.n);
    }

    public static void r(long j, cj cjVar, boolean z, ll2 ll2Var) {
        if (z) {
            int i = u75.r;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(cjVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < cjVar.t.length() ? Character.codePointAt(cjVar, iCharCount2) : 10;
            if (qg6.m(iCodePointBefore) && (qg6.a(iCodePointAt) || qg6.t(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(cjVar, iCharCount);
                    }
                } while (qg6.m(iCodePointBefore));
                j = sp2.y(iCharCount, iCharCount2);
            } else if (qg6.m(iCodePointAt) && (qg6.a(iCodePointBefore) || qg6.t(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == cjVar.t.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(cjVar, iCharCount2);
                    }
                } while (qg6.m(iCodePointAt));
                j = sp2.y(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        ll2Var.a(new x42(new ug1[]{new ml4(i2, i2), new e51(u75.n(j), 0)}));
    }

    public static int y(HandwritingGesture handwritingGesture, ll2 ll2Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        ll2Var.a(new rk0(fallbackText, 1));
        return 5;
    }
}
