package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class vj4 extends nh4 {
    public final /* synthetic */ AtomicReferenceArray c;

    public vj4(long j, vj4 vj4Var, int i) {
        super(j, vj4Var, i);
        this.c = new AtomicReferenceArray(uj4.x);
    }

    @Override // defpackage.nh4
    public final void j(int i, fx0 fx0Var) {
        this.c.set(i, uj4.v);
        t();
    }

    @Override // defpackage.nh4
    public final int l() {
        return uj4.x;
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.m + ", hashCode=" + hashCode() + ']';
    }
}
