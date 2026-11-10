package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class xt4 extends wr {
    public final Socket c;

    public xt4(Socket socket) {
        this.c = socket;
    }

    @Override // defpackage.wr
    public final void a() {
        Socket socket = this.c;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!ts5.g(e)) {
                throw e;
            }
            ts5.g.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            ts5.g.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException m(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
