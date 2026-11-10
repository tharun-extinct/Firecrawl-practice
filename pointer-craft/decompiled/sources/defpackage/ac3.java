package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ac3 {
    public final AtomicReference g = new AtomicReference(null);
    public final ec3 y = new ec3();

    public final void g(xb3 xb3Var) {
        AtomicReference atomicReference;
        xb3 xb3Var2;
        do {
            atomicReference = this.g;
            xb3Var2 = (xb3) atomicReference.get();
            if (xb3Var2 != null && !xb3Var.g(xb3Var2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!fj.u(atomicReference, xb3Var2, xb3Var));
        if (xb3Var2 != null) {
            xb3Var2.y();
        }
    }
}
