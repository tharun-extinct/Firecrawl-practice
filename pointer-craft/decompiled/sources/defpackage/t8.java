package defpackage;

import android.content.Context;
import android.net.ssl.EchConfigList;
import android.os.Build;
import android.os.StrictMode;
import android.util.CloseGuard;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class t8 extends ys3 implements fu0 {
    public static final boolean v;
    public final ArrayList n;
    public Context r;

    static {
        v = Build.VERSION.SDK_INT >= 29;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t8() {
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        ArrayList arrayListW = pr.W(new wt4[]{i >= 37 ? new u8((byte) 1) : null, i >= 29 ? new u8(0 == true ? 1 : 0) : null, new j41(te.v), new j41(yr0.g), new j41(n50.g)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListW.size();
        while (i2 < size) {
            Object obj = arrayListW.get(i2);
            i2++;
            if (((wt4) obj).y()) {
                arrayList.add(obj);
            }
        }
        this.n = arrayList;
    }

    @Override // defpackage.fu0
    public final void g(Context context) {
        this.r = context;
    }

    @Override // defpackage.ys3
    public final Object j() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.j();
        }
        CloseGuard closeGuardL = c2.l();
        closeGuardL.open("response.body().close()");
        return closeGuardL;
    }

    @Override // defpackage.ys3
    public final String l(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!((wt4) obj).g(sSLSocket));
        wt4 wt4Var = (wt4) obj;
        if (wt4Var != null) {
            return wt4Var.r(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ys3
    public final void m(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.m(obj, str);
        } else {
            obj.getClass();
            c2.j(obj).warnIfOpen();
        }
    }

    @Override // defpackage.ys3
    public final void n(SSLSocket sSLSocket, String str, List list, fa0 fa0Var) {
        Object obj;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i);
                i++;
            }
        } while (!((wt4) obj).g(sSLSocket));
        wt4 wt4Var = (wt4) obj;
        if (wt4Var != null) {
            wt4Var.n(sSLSocket, str, list, fa0Var);
        }
    }

    @Override // defpackage.ys3
    public final hb6 r(X509TrustManager x509TrustManager) {
        e9 e9VarG = pg6.g(x509TrustManager);
        if (e9VarG != null) {
            return e9VarG;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new uy(new a00((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // defpackage.ys3
    public final eg1 x(SSLException sSLException) {
        String publicHostname;
        byte[] bytes;
        fa0 fa0VarF = null;
        if (Build.VERSION.SDK_INT < 37 || !s8.x(sSLException) || (publicHostname = s8.r(sSLException).getPublicHostname()) == null) {
            return null;
        }
        y54 y54Var = eg1.r;
        EchConfigList retryConfigList = s8.r(sSLException).getRetryConfigList();
        if (retryConfigList != null && (bytes = retryConfigList.toBytes()) != null) {
            fa0 fa0Var = fa0.m;
            fa0VarF = aj6.f(bytes);
        }
        return af6.g(fa0VarF, publicHostname);
    }

    @Override // defpackage.fu0
    public final Context y() {
        return this.r;
    }
}
