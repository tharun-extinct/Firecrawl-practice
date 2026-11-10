package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes2.dex */
public final class sl1 implements hu4 {
    public final boolean a;
    public boolean c;
    public final /* synthetic */ tl1 i;
    public final hu4 j;
    public long m;
    public boolean q;
    public final long t;
    public boolean w;

    public sl1(tl1 tl1Var, hu4 hu4Var, long j, boolean z) {
        hu4Var.getClass();
        this.i = tl1Var;
        this.j = hu4Var;
        this.t = j;
        this.a = z;
        this.q = true;
        if (j == 0) {
            x(null);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        try {
            y();
            x(null);
        } catch (IOException e) {
            IOException iOExceptionX = x(e);
            iOExceptionX.getClass();
            throw iOExceptionX;
        }
    }

    @Override // defpackage.hu4
    public final long j(long j, c70 c70Var) throws IOException {
        if (this.c) {
            l0.z("closed");
            return 0L;
        }
        try {
            long j2 = this.j.j(8192L, c70Var);
            if (this.q) {
                this.q = false;
                this.i.g.m.getClass();
            }
            if (j2 == -1) {
                x(null);
                return -1L;
            }
            long j3 = this.m + j2;
            long j4 = this.t;
            if (j4 != -1 && j3 > j4) {
                throw new ProtocolException("expected " + this.t + " bytes but received " + j3);
            }
            this.m = j3;
            if (this.i.r.r()) {
                x(null);
            }
            return j2;
        } catch (IOException e) {
            IOException iOExceptionX = x(e);
            iOExceptionX.getClass();
            throw iOExceptionX;
        }
    }

    @Override // defpackage.hu4, defpackage.bq4
    public final m95 r() {
        return this.j.r();
    }

    public final String toString() {
        return sl1.class.getSimpleName() + '(' + this.j + ')';
    }

    public final IOException x(IOException iOException) {
        if (this.w) {
            return iOException;
        }
        this.w = true;
        if (iOException == null && this.q) {
            this.q = false;
            this.i.g.m.getClass();
        }
        return tl1.g(this.i, this.a, iOException, 8);
    }

    public final void y() throws IOException {
        this.j.close();
    }
}
