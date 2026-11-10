package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class u82 implements hu4 {
    public final long j;
    public boolean q;
    public boolean t;
    public final /* synthetic */ w82 w;
    public final c70 a = new c70();
    public final c70 m = new c70();

    public u82(w82 w82Var, long j, boolean z) {
        this.w = w82Var;
        this.j = j;
        this.t = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        w82 w82Var = this.w;
        synchronized (w82Var) {
            this.q = true;
            c70 c70Var = this.m;
            j = c70Var.t;
            c70Var.k(j);
            w82Var.notifyAll();
        }
        if (j > 0) {
            w82 w82Var2 = this.w;
            TimeZone timeZone = ws5.g;
            w82Var2.t.w(j);
        }
        this.w.y();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b9 A[Catch: all -> 0x0022, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0012, B:13:0x001c, B:47:0x00b9, B:61:0x00df, B:62:0x00e4, B:17:0x0025, B:19:0x002b, B:21:0x002f, B:23:0x0033, B:27:0x0044, B:29:0x0048, B:31:0x0052, B:33:0x006f, B:35:0x0080, B:38:0x0097, B:41:0x00a1, B:43:0x00a7, B:44:0x00b3, B:58:0x00d5, B:59:0x00dc), top: B:66:0x0005, inners: #0 }] */
    @Override // defpackage.hu4
    public final long j(long j, c70 c70Var) throws Throwable {
        boolean z;
        Throwable ox4Var;
        long j2;
        long j3;
        do {
            w82 w82Var = this.w;
            synchronized (w82Var) {
                w82Var.t.getClass();
                t82 t82Var = w82Var.b;
                z = true;
                boolean z2 = t82Var.a || t82Var.j;
                if (z2) {
                    w82Var.s.j();
                }
                try {
                    if (w82Var.l() == null || this.t) {
                        ox4Var = null;
                    } else {
                        ox4Var = w82Var.z;
                        if (ox4Var == null) {
                            kk1 kk1VarL = w82Var.l();
                            kk1VarL.getClass();
                            ox4Var = new ox4(kk1VarL);
                        }
                    }
                    if (this.q) {
                        throw new IOException("stream closed");
                    }
                    c70 c70Var2 = this.m;
                    long j4 = c70Var2.t;
                    if (j4 > 0) {
                        j3 = c70Var2.j(Math.min(8192L, j4), c70Var);
                        ko5.y(w82Var.a, j3, 0L, 2);
                        long jG = w82Var.a.g();
                        if (ox4Var == null) {
                            j2 = -1;
                            if (jG >= w82Var.t.d.g() / 2) {
                                w82Var.t.u(w82Var.j, jG);
                                ko5.y(w82Var.a, 0L, jG, 1);
                            }
                        } else {
                            j2 = -1;
                        }
                    } else {
                        j2 = -1;
                        if (this.t || ox4Var != null) {
                            j3 = -1;
                        } else {
                            try {
                                w82Var.wait();
                                j3 = -1;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        if (z2) {
                            w82Var.s.m();
                        }
                    }
                    z = false;
                    if (z2) {
                        w82Var.s.m();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        w82Var.s.m();
                    }
                    throw th;
                }
            }
            this.w.t.k.getClass();
        } while (z);
        if (j3 != j2) {
            return j3;
        }
        if (ox4Var == null) {
            return j2;
        }
        throw ox4Var;
    }

    @Override // defpackage.hu4, defpackage.bq4
    public final m95 r() {
        return this.w.s;
    }
}
