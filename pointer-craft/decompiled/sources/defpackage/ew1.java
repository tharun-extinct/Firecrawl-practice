package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ew1 extends m95 {
    public m95 v;

    public ew1(m95 m95Var) {
        m95Var.getClass();
        this.v = m95Var;
    }

    @Override // defpackage.m95
    public final m95 g() {
        return this.v.g();
    }

    @Override // defpackage.m95
    public final m95 l(long j) {
        TimeUnit.MILLISECONDS.getClass();
        return this.v.l(j);
    }

    @Override // defpackage.m95
    public final m95 n(long j) {
        return this.v.n(j);
    }

    @Override // defpackage.m95
    public final long r() {
        return this.v.r();
    }

    @Override // defpackage.m95
    public final boolean v() {
        return this.v.v();
    }

    @Override // defpackage.m95
    public final void x() throws InterruptedIOException {
        this.v.x();
    }

    @Override // defpackage.m95
    public final m95 y() {
        return this.v.y();
    }
}
