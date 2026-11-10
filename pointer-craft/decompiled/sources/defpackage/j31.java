package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class j31 implements hu4 {
    public final /* synthetic */ ty a;
    public final InputStream j;
    public final xt4 t;

    public j31(ty tyVar) {
        this.a = tyVar;
        Socket socket = (Socket) tyVar.t;
        this.j = socket.getInputStream();
        this.t = new xt4(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        ty tyVar = this.a;
        xt4 xt4Var = this.t;
        xt4Var.j();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) tyVar.a;
                Socket socket = (Socket) tyVar.t;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    xt4Var.t();
                    return;
                }
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    xt4Var.t();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.j.close();
                    }
                }
                if (xt4Var.t()) {
                    throw xt4Var.m(null);
                }
            } catch (IOException e) {
                if (!xt4Var.t()) {
                    throw e;
                }
                throw xt4Var.m(e);
            }
        } catch (Throwable th) {
            xt4Var.t();
            throw th;
        }
    }

    @Override // defpackage.hu4
    public final long j(long j, c70 c70Var) throws IOException {
        xt4 xt4Var = this.t;
        xt4Var.x();
        mh4 mh4VarA = c70Var.A(1);
        int iMin = (int) Math.min(8192L, 8192 - mh4VarA.r);
        try {
            xt4Var.j();
            try {
                try {
                    int i = this.j.read(mh4VarA.g, mh4VarA.r, iMin);
                    if (xt4Var.t()) {
                        throw xt4Var.m(null);
                    }
                    if (i != -1) {
                        mh4VarA.r += i;
                        long j2 = i;
                        c70Var.t += j2;
                        return j2;
                    }
                    if (mh4VarA.y != mh4VarA.r) {
                        return -1L;
                    }
                    c70Var.j = mh4VarA.g();
                    ph4.g(mh4VarA);
                    return -1L;
                } catch (IOException e) {
                    if (xt4Var.t()) {
                        throw xt4Var.m(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                xt4Var.t();
                throw th;
            }
        } catch (AssertionError e2) {
            if (ts5.g(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.hu4, defpackage.bq4
    public final m95 r() {
        return this.t;
    }

    public final String toString() {
        return "source(" + ((Socket) this.a.t) + ')';
    }
}
