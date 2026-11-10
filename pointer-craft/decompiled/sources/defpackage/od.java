package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class od implements oe5 {
    public final X509TrustManager g;
    public final Method y;

    public od(X509TrustManager x509TrustManager, Method method) {
        this.g = x509TrustManager;
        this.y = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return this.g.equals(odVar.g) && this.y.equals(odVar.y);
    }

    @Override // defpackage.oe5
    public final X509Certificate g(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.y.invoke(this.g, x509Certificate);
            objInvoke.getClass();
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.g + ", findByIssuerAndSignatureMethod=" + this.y + ')';
    }
}
