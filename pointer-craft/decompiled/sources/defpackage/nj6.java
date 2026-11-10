package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nj6 {
    public volatile boolean n;
    public boolean r;
    public Object v;
    public Exception x;
    public final Object g = new Object();
    public final bj6 y = new bj6();

    public final nj6 a(Executor executor, vy4 vy4Var) {
        nj6 nj6Var = new nj6();
        this.y.g(new w86(executor, vy4Var, nj6Var));
        i();
        return nj6Var;
    }

    public final void c() {
        synchronized (this.g) {
            try {
                if (this.r) {
                    return;
                }
                this.r = true;
                this.n = true;
                this.y.y(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(xj3 xj3Var) {
        this.y.g(new w86(y25.g, xj3Var));
        i();
    }

    public final void i() {
        synchronized (this.g) {
            try {
                if (this.r) {
                    this.y.y(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j() {
        boolean z;
        synchronized (this.g) {
            z = this.r;
        }
        return z;
    }

    public final Object l() {
        Object obj;
        synchronized (this.g) {
            try {
                jr2.w("Task is not yet complete", this.r);
                if (this.n) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.x;
                if (exc != null) {
                    throw new sb4(exc);
                }
                obj = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final void m(Object obj) {
        synchronized (this.g) {
            if (this.r) {
                throw mi0.g(this);
            }
            this.r = true;
            this.v = obj;
        }
        this.y.y(this);
    }

    public final void n(Executor executor, hk3 hk3Var) {
        this.y.g(new w86(executor, hk3Var));
        i();
    }

    public final boolean q(Object obj) {
        synchronized (this.g) {
            try {
                if (this.r) {
                    return false;
                }
                this.r = true;
                this.v = obj;
                this.y.y(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(Executor executor, ak3 ak3Var) {
        this.y.g(new w86(executor, ak3Var));
        i();
    }

    public final boolean t() {
        boolean z;
        synchronized (this.g) {
            try {
                z = false;
                if (this.r && !this.n && this.x == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final nj6 v(Executor executor, nu0 nu0Var) {
        nj6 nj6Var = new nj6();
        this.y.g(new r26(executor, nu0Var, nj6Var, (byte) 1));
        i();
        return nj6Var;
    }

    public final void w(Exception exc) {
        jr2.q(exc, "Exception must not be null");
        synchronized (this.g) {
            if (this.r) {
                throw mi0.g(this);
            }
            this.r = true;
            this.x = exc;
        }
        this.y.y(this);
    }

    public final Exception x() {
        Exception exc;
        synchronized (this.g) {
            exc = this.x;
        }
        return exc;
    }

    public final void y(Executor executor, xj3 xj3Var) {
        this.y.g(new w86(executor, xj3Var));
        i();
    }
}
