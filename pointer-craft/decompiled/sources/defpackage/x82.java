package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class x82 implements Closeable {
    public static final Logger w = Logger.getLogger(g82.class.getName());
    public int a;
    public final g34 j;
    public boolean m;
    public final x72 q;
    public final c70 t;

    public x82(g34 g34Var) {
        this.j = g34Var;
        c70 c70Var = new c70();
        this.t = c70Var;
        this.a = 16384;
        this.q = new x72(c70Var);
    }

    public final void a(int i, kk1 kk1Var, byte[] bArr) {
        synchronized (this) {
            if (this.m) {
                throw new IOException("closed");
            }
            if (kk1Var.j == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            t(0, bArr.length + 8, 7, 0);
            this.j.t(i);
            this.j.t(kk1Var.j);
            if (bArr.length != 0) {
                g34 g34Var = this.j;
                if (g34Var.a) {
                    throw new IllegalStateException("closed");
                }
                g34Var.t.C(bArr.length, bArr);
                g34Var.y();
            }
            this.j.flush();
        }
    }

    public final void b(int i, kk1 kk1Var) {
        synchronized (this) {
            if (this.m) {
                throw new IOException("closed");
            }
            if (kk1Var.j == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            t(i, 4, 3, 0);
            this.j.t(kk1Var.j);
            this.j.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.m = true;
            this.j.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.m) {
                throw new IOException("closed");
            }
            this.j.flush();
        }
    }

    public final void i(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.m) {
                throw new IOException("closed");
            }
            t(0, 8, 6, z ? 1 : 0);
            this.j.t(i);
            this.j.t(i2);
            this.j.flush();
        }
    }

    public final void t(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = w;
            if (logger.isLoggable(level)) {
                logger.fine(g82.y(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.a) {
            uo1.v(this.a, i2, ": ", "FRAME_SIZE_ERROR length > ");
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            l0.t(xi3.j("reserved bit set: ", i));
            return;
        }
        byte[] bArr = us5.g;
        g34 g34Var = this.j;
        g34Var.x((i2 >>> 16) & 255);
        g34Var.x((i2 >>> 8) & 255);
        g34Var.x(i2 & 255);
        g34Var.x(i3 & 255);
        g34Var.x(i4 & 255);
        g34Var.t(i & Integer.MAX_VALUE);
    }

    public final void u(int i, long j) {
        synchronized (this) {
            try {
                if (this.m) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = w;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(g82.r(false, i, 4, j));
                }
                t(i, 4, 8, 0);
                this.j.t((int) j);
                this.j.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.m) {
                throw new IOException("closed");
            }
            this.q.n(arrayList);
            long j = this.t.t;
            long jMin = Math.min(this.a, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            t(i, (int) jMin, 1, i2);
            this.j.z(jMin, this.t);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.a, j2);
                    j2 -= jMin2;
                    t(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.j.z(jMin2, this.t);
                }
            }
        }
    }

    public final void x(boolean z, int i, c70 c70Var, int i2) {
        synchronized (this) {
            if (this.m) {
                throw new IOException("closed");
            }
            t(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                g34 g34Var = this.j;
                c70Var.getClass();
                g34Var.z(i2, c70Var);
            }
        }
    }

    public final void y(pl4 pl4Var) {
        pl4Var.getClass();
        synchronized (this) {
            try {
                if (this.m) {
                    throw new IOException("closed");
                }
                int i = this.a;
                int i2 = pl4Var.g;
                if ((i2 & 32) != 0) {
                    i = pl4Var.y[5];
                }
                this.a = i;
                if (((i2 & 2) != 0 ? pl4Var.y[1] : -1) != -1) {
                    x72 x72Var = this.q;
                    int iMin = Math.min((i2 & 2) != 0 ? pl4Var.y[1] : -1, 16384);
                    int i3 = x72Var.n;
                    if (i3 != iMin) {
                        if (iMin < i3) {
                            x72Var.y = Math.min(x72Var.y, iMin);
                        }
                        x72Var.r = true;
                        x72Var.n = iMin;
                        int i4 = x72Var.j;
                        if (iMin < i4) {
                            if (iMin == 0) {
                                b52[] b52VarArr = x72Var.v;
                                pr.T(0, b52VarArr.length, null, b52VarArr);
                                x72Var.x = x72Var.v.length - 1;
                                x72Var.l = 0;
                                x72Var.j = 0;
                            } else {
                                x72Var.g(i4 - iMin);
                            }
                        }
                    }
                }
                t(0, 0, 4, 1);
                this.j.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
