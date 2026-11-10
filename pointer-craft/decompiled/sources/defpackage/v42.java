package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v42 {
    public final x95 g;
    public final o05 n;
    public final List r;
    public final jf0 y;

    public v42(x95 x95Var, jf0 jf0Var, List list, my1 my1Var) {
        this.g = x95Var;
        this.y = jf0Var;
        this.r = list;
        this.n = new o05(new ss(my1Var, (byte) 3));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v42)) {
            return false;
        }
        v42 v42Var = (v42) obj;
        return v42Var.g == this.g && v42Var.y == this.y && yf2.p(v42Var.g(), g()) && v42Var.r.equals(this.r);
    }

    public final List g() {
        return (List) this.n.getValue();
    }

    public final int hashCode() {
        return this.r.hashCode() + ((g().hashCode() + ((this.y.hashCode() + ((this.g.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listG = g();
        ArrayList arrayList = new ArrayList(dj0.Y(listG, 10));
        for (Certificate certificate : listG) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.g);
        sb.append(" cipherSuite=");
        sb.append(this.y);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.r;
        ArrayList arrayList2 = new ArrayList(dj0.Y(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
