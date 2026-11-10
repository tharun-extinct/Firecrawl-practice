package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class pl5 {
    public final ql5 g = new ql5();

    public final void g(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        ql5 ql5Var = this.g;
        if (ql5Var.n) {
            ql5.g(autoCloseable);
            return;
        }
        synchronized (ql5Var.g) {
            autoCloseable2 = (AutoCloseable) ql5Var.y.put(str, autoCloseable);
        }
        ql5.g(autoCloseable2);
    }

    public final AutoCloseable r(String str) {
        AutoCloseable autoCloseable;
        ql5 ql5Var = this.g;
        synchronized (ql5Var.g) {
            autoCloseable = (AutoCloseable) ql5Var.y.get(str);
        }
        return autoCloseable;
    }

    public final void y() {
        ql5 ql5Var = this.g;
        if (!ql5Var.n) {
            ql5Var.n = true;
            synchronized (ql5Var.g) {
                try {
                    Iterator it = ql5Var.y.values().iterator();
                    while (it.hasNext()) {
                        ql5.g((AutoCloseable) it.next());
                    }
                    Iterator it2 = ql5Var.r.iterator();
                    while (it2.hasNext()) {
                        ql5.g((AutoCloseable) it2.next());
                    }
                    ql5Var.r.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        n();
    }

    public void n() {
    }
}
