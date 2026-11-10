package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class mh3 extends a0 implements dh2 {
    public static final mh3 t = new mh3(d52.m);

    @Override // defpackage.dh2
    public final ya1 A(xy1 xy1Var) {
        return nh3.j;
    }

    @Override // defpackage.dh2
    public final ya1 D(boolean z, boolean z2, fd fdVar) {
        return nh3.j;
    }

    @Override // defpackage.dh2
    public final Object M(ou0 ou0Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.dh2
    public final be0 i(nh2 nh2Var) {
        return nh3.j;
    }

    @Override // defpackage.dh2
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.dh2
    public final CancellationException k() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.dh2
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.dh2
    public final boolean y() {
        return true;
    }

    @Override // defpackage.dh2, defpackage.yc0
    public final void x(CancellationException cancellationException) {
    }
}
