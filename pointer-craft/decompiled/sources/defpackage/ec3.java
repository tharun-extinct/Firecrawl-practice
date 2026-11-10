package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ec3 extends sj4 implements cc3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(ec3.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long u = qr.g.objectFieldOffset(ec3.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public ec3() {
        super(1);
        this.owner$volatile = pw5.t;
    }

    public final boolean n() {
        return Math.max(qr.g.getIntVolatile(this, sj4.i), 0) == 0;
    }

    public final String toString() {
        return "Mutex@" + a11.z(this) + "[isLocked=" + n() + ",owner=" + qr.g.getObjectVolatile(this, u) + ']';
    }

    public final boolean v() {
        ec3 ec3Var;
        while (true) {
            Unsafe unsafe = qr.g;
            long j = sj4.i;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.j) {
                while (true) {
                    Unsafe unsafe2 = qr.g;
                    long j2 = sj4.i;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.j;
                    if (intVolatile2 <= i) {
                        ec3Var = this;
                        break;
                    }
                    ec3 ec3Var2 = this;
                    ec3Var = ec3Var2;
                    if (unsafe2.compareAndSwapInt(ec3Var2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = ec3Var;
                }
            } else {
                ec3Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(ec3Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(ec3Var, u, (Object) null);
                    return true;
                }
            }
            this = ec3Var;
        }
    }

    @Override // defpackage.cc3
    public final void x(Object obj) {
        while (this.n()) {
            Unsafe unsafe = qr.g;
            long j = u;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            ky2 ky2Var = pw5.t;
            if (objectVolatile != ky2Var) {
                if (objectVolatile != obj && obj != null) {
                    uo1.q("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    ec3 ec3Var = this;
                    if (qr.g.compareAndSwapObject(ec3Var, u, objectVolatile, ky2Var)) {
                        ec3Var.r();
                        return;
                    } else {
                        if (qr.g.getObjectVolatile(ec3Var, j) != objectVolatile) {
                            this = ec3Var;
                            break;
                        }
                        this = ec3Var;
                    }
                }
            }
        }
        l0.z("This mutex is not locked");
    }

    @Override // defpackage.cc3
    public final Object y(mu0 mu0Var) {
        boolean zV = v();
        og5 og5Var = og5.g;
        if (!zV) {
            ib0 ib0VarI = gp4.I(pw5.o(mu0Var));
            try {
                dc3 dc3Var = new dc3(this, ib0VarI);
                while (true) {
                    int andDecrement = sj4.c.getAndDecrement(this);
                    if (andDecrement <= this.j) {
                        if (andDecrement > 0) {
                            dc3Var.m(og5Var, this.t);
                            break;
                        }
                        if (g(dc3Var)) {
                            break;
                        }
                    }
                }
                Object objZ = ib0VarI.z();
                px0 px0Var = px0.j;
                if (objZ != px0Var) {
                    objZ = og5Var;
                }
                if (objZ == px0Var) {
                    return objZ;
                }
            } catch (Throwable th) {
                ib0VarI.C();
                throw th;
            }
        }
        return og5Var;
    }
}
