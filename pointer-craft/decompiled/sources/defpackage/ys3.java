package defpackage;

import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class ys3 {
    public static volatile ys3 g;
    public static final Logger y;

    static {
        try {
            for (Map.Entry entry : vc.y.entrySet()) {
                vc.y((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        ys3 t8Var = t8.v ? new t8() : null;
        if (t8Var == null) {
            boolean z = pd.v;
            t8Var = eh6.g();
        }
        if (t8Var == null) {
            uo1.z("Expected Android API level 21+ but was ", Build.VERSION.SDK_INT);
        } else {
            g = t8Var;
            y = Logger.getLogger(hj3.class.getName());
        }
    }

    public void a(String str, int i, Throwable th) {
        if (i == 5) {
            boolean z = pd.v;
            eh6.n();
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = pd.v;
            eh6.n();
            Log.i("OkHttp", str, th);
        }
    }

    public Object j() {
        if (y.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract String l(SSLSocket sSLSocket);

    public void m(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        a(str, 5, (Throwable) obj);
    }

    public abstract void n(SSLSocket sSLSocket, String str, List list, fa0 fa0Var);

    public SSLContext q() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    public abstract hb6 r(X509TrustManager x509TrustManager);

    public boolean t(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void v(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public eg1 x(SSLException sSLException) {
        return null;
    }
}
