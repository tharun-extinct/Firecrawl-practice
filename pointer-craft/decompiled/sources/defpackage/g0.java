package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends rf6 {
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater v;
    public final AtomicReferenceFieldUpdater y;

    public g0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.g = atomicReferenceFieldUpdater;
        this.y = atomicReferenceFieldUpdater2;
        this.r = atomicReferenceFieldUpdater3;
        this.n = atomicReferenceFieldUpdater4;
        this.v = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.rf6
    public final boolean g(k0 k0Var, f0 f0Var, f0 f0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(k0Var, f0Var, f0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k0Var) == f0Var);
        return false;
    }

    @Override // defpackage.rf6
    public final void l(j0 j0Var, Thread thread) {
        this.g.lazySet(j0Var, thread);
    }

    @Override // defpackage.rf6
    public final boolean r(k0 k0Var, j0 j0Var, j0 j0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(k0Var, j0Var, j0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k0Var) == j0Var);
        return false;
    }

    @Override // defpackage.rf6
    public final void x(j0 j0Var, j0 j0Var2) {
        this.y.lazySet(j0Var, j0Var2);
    }

    @Override // defpackage.rf6
    public final boolean y(k0 k0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.v;
            if (atomicReferenceFieldUpdater.compareAndSet(k0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k0Var) == obj);
        return false;
    }
}
