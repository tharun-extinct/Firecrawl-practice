package defpackage;

import android.net.ssl.EchConfigList;
import android.net.ssl.InvalidEchDataException;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class u8 implements wt4 {
    public final /* synthetic */ byte g;

    public /* synthetic */ u8(byte b) {
        this.g = b;
    }

    @Override // defpackage.wt4
    public final boolean g(SSLSocket sSLSocket) {
        switch (this.g) {
            case 0:
                break;
        }
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // defpackage.wt4
    public final void n(SSLSocket sSLSocket, String str, List list, fa0 fa0Var) throws IOException {
        EchConfigList echConfigListFromBytes;
        switch (this.g) {
            case 0:
                try {
                    SSLSockets.setUseSessionTickets(sSLSocket, true);
                    SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                    ys3 ys3Var = ys3.g;
                    sSLParameters.setApplicationProtocols((String[]) tg1.g(list).toArray(new String[0]));
                    sSLSocket.setSSLParameters(sSLParameters);
                    return;
                } catch (IllegalArgumentException e) {
                    throw new IOException("Android internal error", e);
                }
            default:
                SSLSockets.setUseSessionTickets(sSLSocket, true);
                try {
                    SSLParameters sSLParameters2 = sSLSocket.getSSLParameters();
                    ys3 ys3Var2 = ys3.g;
                    sSLParameters2.setApplicationProtocols((String[]) tg1.g(list).toArray(new String[0]));
                    sSLSocket.setSSLParameters(sSLParameters2);
                    if (str == null || fa0Var == null) {
                        return;
                    }
                    try {
                        echConfigListFromBytes = EchConfigList.fromBytes(fa0Var.m());
                        break;
                    } catch (InvalidEchDataException unused) {
                        echConfigListFromBytes = null;
                    }
                    if (echConfigListFromBytes != null) {
                        SSLSockets.setEchConfigList(sSLSocket, echConfigListFromBytes);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e2) {
                    throw new IOException("Android internal error", e2);
                }
        }
    }

    @Override // defpackage.wt4
    public final String r(SSLSocket sSLSocket) {
        switch (this.g) {
            case 0:
                try {
                    String applicationProtocol = sSLSocket.getApplicationProtocol();
                    if (applicationProtocol == null || applicationProtocol.equals("")) {
                        return null;
                    }
                    return applicationProtocol;
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            default:
                String applicationProtocol2 = sSLSocket.getApplicationProtocol();
                if (applicationProtocol2 == null || applicationProtocol2.equals("")) {
                    return null;
                }
                return applicationProtocol2;
        }
    }

    @Override // defpackage.wt4
    public final boolean y() {
        switch (this.g) {
            case 0:
                ys3 ys3Var = ys3.g;
                return Build.VERSION.SDK_INT >= 29;
            default:
                ys3 ys3Var2 = ys3.g;
                return Build.VERSION.SDK_INT >= 37;
        }
    }
}
