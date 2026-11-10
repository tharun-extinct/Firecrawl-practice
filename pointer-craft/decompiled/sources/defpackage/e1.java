package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends gp4 {
    public final AtomicReferenceFieldUpdater K;
    public final AtomicReferenceFieldUpdater L;
    public final AtomicReferenceFieldUpdater M;
    public final AtomicReferenceFieldUpdater N;
    public final AtomicReferenceFieldUpdater O;

    public e1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.K = atomicReferenceFieldUpdater;
        this.L = atomicReferenceFieldUpdater2;
        this.M = atomicReferenceFieldUpdater3;
        this.N = atomicReferenceFieldUpdater4;
        this.O = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.gp4
    public final boolean A(h1 h1Var, g1 g1Var, g1 g1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.M;
            if (atomicReferenceFieldUpdater.compareAndSet(h1Var, g1Var, g1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(h1Var) == g1Var);
        return false;
    }

    @Override // defpackage.gp4
    public final void K(g1 g1Var, g1 g1Var2) {
        this.L.lazySet(g1Var, g1Var2);
    }

    @Override // defpackage.gp4
    public final void L(g1 g1Var, Thread thread) {
        this.K.lazySet(g1Var, thread);
    }

    @Override // defpackage.gp4
    public final boolean d(h1 h1Var, d1 d1Var, d1 d1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.N;
            if (atomicReferenceFieldUpdater.compareAndSet(h1Var, d1Var, d1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(h1Var) == d1Var);
        return false;
    }

    @Override // defpackage.gp4
    public final boolean e(h1 h1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.O;
            if (atomicReferenceFieldUpdater.compareAndSet(h1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(h1Var) == obj);
        return false;
    }
}
