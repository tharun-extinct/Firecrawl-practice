package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class t82 implements bq4 {
    public boolean a;
    public final boolean j;
    public final /* synthetic */ w82 m;
    public final c70 t = new c70();

    public t82(w82 w82Var, boolean z) {
        this.m = w82Var;
        this.j = z;
    }

    @Override // defpackage.bq4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w82 w82Var = this.m;
        TimeZone timeZone = ws5.g;
        synchronized (w82Var) {
            if (this.a) {
                return;
            }
            boolean z = w82Var.l() == null;
            w82 w82Var2 = this.m;
            if (!w82Var2.b.j) {
                if (this.t.t > 0) {
                    while (this.t.t > 0) {
                        y(true);
                    }
                } else if (z) {
                    w82Var2.t.i(w82Var2.j, true, null, 0L);
                }
            }
            w82 w82Var3 = this.m;
            synchronized (w82Var3) {
                this.a = true;
                w82Var3.notifyAll();
            }
            this.m.t.E.flush();
            this.m.y();
        }
    }

    @Override // defpackage.bq4, java.io.Flushable
    public final void flush() {
        w82 w82Var = this.m;
        TimeZone timeZone = ws5.g;
        synchronized (w82Var) {
            w82Var.r();
        }
        while (this.t.t > 0) {
            y(false);
            this.m.t.E.flush();
        }
    }

    @Override // defpackage.bq4
    public final m95 r() {
        return this.m.p;
    }

    public final void y(boolean z) {
        long jMin;
        boolean z2;
        w82 w82Var = this.m;
        synchronized (w82Var) {
            w82Var.p.j();
            while (w82Var.m >= w82Var.q && !this.j && !this.a && w82Var.l() == null) {
                try {
                    try {
                        w82Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    w82Var.p.m();
                    throw th;
                }
            }
            w82Var.p.m();
            w82Var.r();
            jMin = Math.min(w82Var.q - w82Var.m, this.t.t);
            w82Var.m += jMin;
            z2 = z && jMin == this.t.t;
        }
        this.m.p.j();
        try {
            w82 w82Var2 = this.m;
            w82Var2.t.i(w82Var2.j, z2, this.t, jMin);
        } finally {
            this.m.p.m();
        }
    }

    @Override // defpackage.bq4
    public final void z(long j, c70 c70Var) {
        TimeZone timeZone = ws5.g;
        c70 c70Var2 = this.t;
        c70Var2.z(j, c70Var);
        while (c70Var2.t >= 16384) {
            y(false);
        }
    }
}
