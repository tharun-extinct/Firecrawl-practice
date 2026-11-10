package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class bj6 {
    public final Object g = new Object();
    public boolean r;
    public ArrayDeque y;

    public final void g(wi6 wi6Var) {
        synchronized (this.g) {
            try {
                ArrayDeque arrayDeque = this.y;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.y = arrayDeque;
                }
                arrayDeque.add(wi6Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(nj6 nj6Var) {
        wi6 wi6Var;
        synchronized (this.g) {
            if (this.y != null && !this.r) {
                this.r = true;
                while (true) {
                    synchronized (this.g) {
                        try {
                            wi6Var = (wi6) this.y.poll();
                            if (wi6Var == null) {
                                this.r = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    wi6Var.g(nj6Var);
                }
            }
        }
    }
}
