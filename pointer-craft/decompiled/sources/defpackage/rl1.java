package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes2.dex */
public final class rl1 implements bq4 {
    public final boolean a;
    public boolean c;
    public final /* synthetic */ tl1 i;
    public final bq4 j;
    public boolean m;
    public long q;
    public final long t;
    public boolean w;

    public rl1(tl1 tl1Var, bq4 bq4Var, long j, boolean z) {
        bq4Var.getClass();
        this.i = tl1Var;
        this.j = bq4Var;
        this.t = j;
        this.a = z;
        this.w = z;
    }

    @Override // defpackage.bq4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        long j = this.t;
        if (j != -1 && this.q != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            y();
            x(null);
        } catch (IOException e) {
            IOException iOExceptionX = x(e);
            iOExceptionX.getClass();
            throw iOExceptionX;
        }
    }

    @Override // defpackage.bq4, java.io.Flushable
    public final void flush() throws IOException {
        try {
            t();
        } catch (IOException e) {
            IOException iOExceptionX = x(e);
            iOExceptionX.getClass();
            throw iOExceptionX;
        }
    }

    @Override // defpackage.bq4
    public final m95 r() {
        return this.j.r();
    }

    public final void t() {
        this.j.flush();
    }

    public final String toString() {
        return rl1.class.getSimpleName() + '(' + this.j + ')';
    }

    public final IOException x(IOException iOException) {
        if (this.m) {
            return iOException;
        }
        this.m = true;
        return tl1.g(this.i, this.a, iOException, 4);
    }

    public final void y() {
        this.j.close();
    }

    @Override // defpackage.bq4
    public final void z(long j, c70 c70Var) throws IOException {
        if (this.c) {
            l0.z("closed");
            return;
        }
        long j2 = this.t;
        if (j2 != -1 && this.q + j > j2) {
            throw new ProtocolException("expected " + this.t + " bytes but received " + (this.q + j));
        }
        try {
            if (this.w) {
                this.w = false;
                this.i.g.m.getClass();
            }
            this.j.z(j, c70Var);
            this.q += j;
        } catch (IOException e) {
            IOException iOExceptionX = x(e);
            iOExceptionX.getClass();
            throw iOExceptionX;
        }
    }
}
