package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zr0 implements bk4 {
    public final AtomicReference g;

    public zr0(bk4 bk4Var) {
        this.g = new AtomicReference(bk4Var);
    }

    @Override // defpackage.bk4
    public final Iterator iterator() {
        bk4 bk4Var = (bk4) this.g.getAndSet(null);
        if (bk4Var != null) {
            return bk4Var.iterator();
        }
        l0.z("This sequence can be consumed only once.");
        return null;
    }
}
