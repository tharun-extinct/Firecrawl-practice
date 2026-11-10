package defpackage;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes2.dex */
public abstract class og6 {
    public static ha2 g;

    public static v42 g(SSLSession sSLSession) throws IOException {
        List listW;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            l0.z("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            uo1.t("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        jf0 jf0VarU = jf0.y.u(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            l0.z("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            uo1.t("tlsVersion == NONE");
            return null;
        }
        x95.t.getClass();
        x95 x95VarZ = aj6.z(protocol);
        try {
            listW = ws5.w(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listW = pi1.j;
        }
        return new v42(x95VarZ, jf0VarU, ws5.w(sSLSession.getLocalCertificates()), new t21(listW, (byte) 1));
    }

    public static final void r(z8 z8Var, ViewStructure viewStructure) {
        iv ivVar = z8Var.y;
        if (ivVar.g.isEmpty()) {
            return;
        }
        int iAddChildCount = viewStructure.addChildCount(ivVar.g.size());
        Iterator it = ivVar.g.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                uo1.B();
                return;
            }
            ViewStructure viewStructureNewChild = viewStructure.newChild(iAddChildCount);
            viewStructureNewChild.setAutofillId(z8Var.r, iIntValue);
            viewStructureNewChild.setId(iIntValue, z8Var.g.getContext().getPackageName(), null, null);
            viewStructureNewChild.setAutofillType(1);
            throw null;
        }
    }

    public static final void y(z8 z8Var, SparseArray sparseArray) {
        iv ivVar = z8Var.y;
        if (ivVar.g.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueX = a2.x(sparseArray.get(iKeyAt));
            if (autofillValueX.isText()) {
                autofillValueX.getTextValue().toString();
                if (ivVar.g.get(Integer.valueOf(iKeyAt)) != null) {
                    uo1.B();
                    return;
                }
            } else {
                if (autofillValueX.isDate()) {
                    throw new uh3("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueX.isList()) {
                    throw new uh3("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueX.isToggle()) {
                    throw new uh3("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }
}
