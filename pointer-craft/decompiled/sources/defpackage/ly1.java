package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ly1 {
    public final Object g;
    public final ArrayList r;
    public boolean y;

    public ly1(Executor executor, qd qdVar) {
        executor.getClass();
        this.g = new Object();
        this.r = new ArrayList();
    }

    public final void g() {
        synchronized (this.g) {
            try {
                this.y = true;
                ArrayList arrayList = this.r;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((my1) obj).g();
                }
                this.r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean y() {
        boolean z;
        synchronized (this.g) {
            z = this.y;
        }
        return z;
    }
}
