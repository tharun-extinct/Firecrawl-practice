package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class fw4 extends o1 {
    public final AtomicReference g = new AtomicReference(null);

    @Override // defpackage.o1
    public final boolean g(n1 n1Var) {
        AtomicReference atomicReference = this.g;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(y94.q);
        return true;
    }

    @Override // defpackage.o1
    public final mu0[] y(n1 n1Var) {
        this.g.set(null);
        return m50.g;
    }
}
