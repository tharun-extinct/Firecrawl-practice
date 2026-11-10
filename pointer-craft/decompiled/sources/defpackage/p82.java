package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class p82 implements Closeable {
    public static final pl4 H;
    public final ko5 A;
    public long B;
    public long C;
    public final q70 D;
    public final x82 E;
    public final b71 F;
    public final LinkedHashSet G;
    public final String a;
    public final a35 b;
    public final b35 c;
    public final pl4 d;
    public pl4 e;
    public long f;
    public long h;
    public final a35 i;
    public final m82 j;
    public final hr1 k;
    public int m;
    public long o;
    public final bi6 p;
    public int q;
    public final a35 s;
    public final LinkedHashMap t = new LinkedHashMap();
    public long u;
    public boolean w;
    public long z;

    static {
        pl4 pl4Var = new pl4();
        pl4Var.y(4, 65535);
        pl4Var.y(5, 16384);
        H = pl4Var;
    }

    public p82(p5 p5Var) {
        this.j = (m82) p5Var.v;
        String str = (String) p5Var.n;
        if (str == null) {
            yf2.Y("connectionName");
            throw null;
        }
        this.a = str;
        this.q = 3;
        b35 b35Var = (b35) p5Var.y;
        this.c = b35Var;
        a35 a35VarN = b35Var.n();
        this.i = a35VarN;
        this.b = b35Var.n();
        this.s = b35Var.n();
        this.p = bi6.c;
        this.k = (hr1) p5Var.x;
        pl4 pl4Var = new pl4();
        pl4Var.y(4, 16777216);
        this.d = pl4Var;
        pl4 pl4Var2 = H;
        this.e = pl4Var2;
        this.A = new ko5(0);
        this.C = pl4Var2.g();
        q70 q70Var = (q70) p5Var.r;
        if (q70Var == null) {
            yf2.Y("socket");
            throw null;
        }
        this.D = q70Var;
        this.E = new x82((g34) q70Var.m);
        this.F = new b71(this, new s82((h34) q70Var.a));
        this.G = new LinkedHashSet();
        int i = p5Var.g;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            a35VarN.l(new n34(str.concat(" ping"), new h82(this, nanos), (byte) 2), nanos);
        }
    }

    public final void a(kk1 kk1Var) {
        synchronized (this.E) {
            synchronized (this) {
                if (this.w) {
                    return;
                }
                this.w = true;
                this.E.a(this.m, kk1Var, us5.g);
            }
        }
    }

    public final void b(int i, kk1 kk1Var) {
        a35.y(this.i, this.a + '[' + i + "] writeSynReset", new z80(this, i, kk1Var));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y(kk1.a, kk1.i, null);
    }

    public final void i(int i, boolean z, c70 c70Var, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.E.x(z, i, c70Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.B;
                            j3 = this.C;
                            if (j2 >= j3) {
                                if (!this.t.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.E.a);
                j4 = iMin;
                this.B += j4;
            }
            j -= j4;
            this.E.x(z && j == 0, i, c70Var, iMin);
        }
    }

    public final w82 t(int i) {
        w82 w82Var;
        synchronized (this) {
            w82Var = (w82) this.t.remove(Integer.valueOf(i));
            notifyAll();
        }
        return w82Var;
    }

    public final void u(final int i, final long j) {
        a35.y(this.i, this.a + '[' + i + "] windowUpdate", new my1() { // from class: i82
            @Override // defpackage.my1
            public final Object g() {
                p82 p82Var = this.j;
                try {
                    p82Var.E.u(i, j);
                } catch (IOException e) {
                    kk1 kk1Var = kk1.m;
                    p82Var.y(kk1Var, kk1Var, e);
                }
                return og5.g;
            }
        });
    }

    public final void w(long j) {
        synchronized (this) {
            try {
                ko5.y(this.A, j, 0L, 2);
                long jG = this.A.g();
                if (jG >= this.d.g() / 2) {
                    u(0, jG);
                    ko5.y(this.A, 0L, jG, 1);
                }
                hr1 hr1Var = this.k;
                ko5 ko5Var = this.A;
                hr1Var.getClass();
                ko5Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final w82 x(int i) {
        w82 w82Var;
        synchronized (this) {
            w82Var = (w82) this.t.get(Integer.valueOf(i));
        }
        return w82Var;
    }

    public final void y(kk1 kk1Var, kk1 kk1Var2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = ws5.g;
        try {
            a(kk1Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.t.isEmpty()) {
                array = null;
            } else {
                array = this.t.values().toArray(new w82[0]);
                this.t.clear();
            }
        }
        w82[] w82VarArr = (w82[]) array;
        if (w82VarArr != null) {
            for (w82 w82Var : w82VarArr) {
                try {
                    w82Var.n(kk1Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.E.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((ty) this.D.t).t).close();
        } catch (IOException unused4) {
        }
        this.i.m();
        this.b.m();
        this.s.m();
    }
}
