package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ez3 extends e implements yc0, ox0, wj4 {
    public final m70 q;

    public ez3(fx0 fx0Var, m70 m70Var) {
        super(fx0Var, true);
        this.q = m70Var;
    }

    @Override // defpackage.nh2
    public final void K(CancellationException cancellationException) {
        this.q.n(cancellationException, true);
        J(cancellationException);
    }

    @Override // defpackage.yc0
    public final wh4 c() {
        return this.q.c();
    }

    @Override // defpackage.yc0
    public final Object e(jk0 jk0Var) {
        m70 m70Var = this.q;
        m70Var.getClass();
        return m70.F(m70Var, jk0Var);
    }

    @Override // defpackage.wj4
    public final boolean g(Throwable th) {
        return this.q.n(th, false);
    }

    @Override // defpackage.yc0
    public final h70 iterator() {
        m70 m70Var = this.q;
        m70Var.getClass();
        return new h70(m70Var);
    }

    @Override // defpackage.yc0
    public final Object l(mu0 mu0Var) {
        return this.q.l(mu0Var);
    }

    @Override // defpackage.yc0
    public final Object p() {
        return this.q.p();
    }

    @Override // defpackage.wj4
    public final Object r(mu0 mu0Var, Object obj) {
        return this.q.r(mu0Var, obj);
    }

    @Override // defpackage.e
    public final void r0(Throwable th, boolean z) {
        if (this.q.n(th, false) || z) {
            return;
        }
        ae6.y(this.m, th);
    }

    @Override // defpackage.e
    public final void s0(Object obj) {
        this.q.g(null);
    }

    public final void u0(x60 x60Var) {
        Unsafe unsafe;
        Unsafe unsafe2;
        m70 m70Var = this.q;
        m70Var.getClass();
        long j = m70.u;
        do {
            unsafe = qr.g;
            if (unsafe.compareAndSwapObject(m70Var, m70.u, (Object) null, x60Var)) {
                return;
            }
        } while (unsafe.getObjectVolatile(m70Var, j) == null);
        while (true) {
            Object objectVolatile = qr.g.getObjectVolatile(m70Var, j);
            ky2 ky2Var = o70.s;
            if (objectVolatile != ky2Var) {
                if (objectVolatile == o70.p) {
                    l0.z("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    l0.b(objectVolatile, "Another handler is already registered: ");
                    return;
                }
            }
            ky2 ky2Var2 = o70.p;
            do {
                unsafe2 = qr.g;
                if (unsafe2.compareAndSwapObject(m70Var, m70.u, ky2Var, ky2Var2)) {
                    x60Var.a(m70Var.w());
                    return;
                }
            } while (unsafe2.getObjectVolatile(m70Var, j) == ky2Var);
        }
    }

    @Override // defpackage.nh2, defpackage.dh2, defpackage.yc0
    public final void x(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new eh2(O(), null, this);
        }
        K(cancellationException);
    }

    @Override // defpackage.wj4
    public final Object z(Object obj) {
        return this.q.z(obj);
    }
}
