package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class gc4 implements mu0, qx0 {
    public static final /* synthetic */ long t = qr.g.objectFieldOffset(gc4.class.getDeclaredField("result"));
    public final mu0 j;
    private volatile Object result;

    public gc4(mu0 mu0Var) {
        px0 px0Var = px0.j;
        this.j = mu0Var;
        this.result = px0Var;
    }

    @Override // defpackage.mu0
    public final void j(Object obj) {
        gc4 gc4Var;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj2 = this.result;
            px0 px0Var = px0.t;
            if (obj2 == px0Var) {
                while (true) {
                    Unsafe unsafe2 = qr.g;
                    long j2 = t;
                    gc4Var = this;
                    if (unsafe2.compareAndSwapObject(gc4Var, j2, px0Var, obj)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(gc4Var, j2) != px0Var) {
                        break;
                    } else {
                        this = gc4Var;
                    }
                }
            } else {
                gc4Var = this;
                px0 px0Var2 = px0.j;
                if (obj2 != px0Var2) {
                    l0.z("Already resumed");
                    return;
                }
                px0 px0Var3 = px0.a;
                do {
                    unsafe = qr.g;
                    j = t;
                    if (unsafe.compareAndSwapObject(gc4Var, j, px0Var2, px0Var3)) {
                        gc4Var.j.j(obj);
                        return;
                    }
                } while (unsafe.getObjectVolatile(gc4Var, j) == px0Var2);
            }
            this = gc4Var;
        }
    }

    @Override // defpackage.qx0
    public final qx0 n() {
        mu0 mu0Var = this.j;
        if (mu0Var instanceof qx0) {
            return (qx0) mu0Var;
        }
        return null;
    }

    public final String toString() {
        return "SafeContinuation for " + this.j;
    }

    @Override // defpackage.mu0
    public final fx0 v() {
        return this.j.v();
    }
}
