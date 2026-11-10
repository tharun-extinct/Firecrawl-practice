package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ub6 extends sp2 {
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater v;
    public final AtomicReferenceFieldUpdater x;
    public final AtomicReferenceFieldUpdater y;

    public ub6(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.y = atomicReferenceFieldUpdater;
        this.r = atomicReferenceFieldUpdater2;
        this.n = atomicReferenceFieldUpdater3;
        this.v = atomicReferenceFieldUpdater4;
        this.x = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.sp2
    public final void B(vf6 vf6Var, vf6 vf6Var2) {
        this.r.lazySet(vf6Var, vf6Var2);
    }

    @Override // defpackage.sp2
    public final void C(vf6 vf6Var, Thread thread) {
        this.y.lazySet(vf6Var, thread);
    }

    @Override // defpackage.sp2
    public final boolean D(wh6 wh6Var, v86 v86Var, v86 v86Var2) {
        return kq2.a0(this.v, wh6Var, v86Var, v86Var2);
    }

    @Override // defpackage.sp2
    public final boolean E(wh6 wh6Var, Object obj, Object obj2) {
        return kq2.a0(this.x, wh6Var, obj, obj2);
    }

    @Override // defpackage.sp2
    public final boolean F(wh6 wh6Var, vf6 vf6Var, vf6 vf6Var2) {
        return kq2.a0(this.n, wh6Var, vf6Var, vf6Var2);
    }
}
