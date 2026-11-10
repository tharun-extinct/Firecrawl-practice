package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class wo1 {
    public final n14 g;
    public final AtomicReference n;
    public final Executor r;
    public final n14 y;

    public wo1(n14 n14Var, n14 n14Var2, rm3 rm3Var, Executor executor) {
        n14 n14Var3;
        n14 n14Var4;
        n14Var.getClass();
        n14Var2.getClass();
        rm3Var.getClass();
        executor.getClass();
        this.g = n14Var;
        this.y = n14Var2;
        this.r = executor;
        this.n = new AtomicReference();
        gc0 gc0Var = new gc0((Object) this, (byte) 2);
        n14 n14Var5 = rm3Var.y;
        jm0 jm0Var = rm3.n;
        if (n14Var5 != jm0Var) {
            gc0Var.r(n14Var5);
            return;
        }
        synchronized (rm3Var) {
            n14Var3 = rm3Var.y;
            if (n14Var3 != jm0Var) {
                n14Var4 = n14Var3;
            } else {
                rm3Var.g = new qm3(rm3Var.g, gc0Var, (byte) 0);
                n14Var4 = null;
            }
        }
        if (n14Var4 != null) {
            gc0Var.r(n14Var3);
        }
    }
}
