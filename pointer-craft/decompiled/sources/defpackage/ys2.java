package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ys2 implements n14 {
    public volatile Set g;
    public volatile Set y;

    @Override // defpackage.n14
    public final Object get() {
        if (this.y == null) {
            synchronized (this) {
                try {
                    if (this.y == null) {
                        this.y = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.g.iterator();
                                while (it.hasNext()) {
                                    this.y.add(((n14) it.next()).get());
                                }
                                this.g = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.y);
    }
}
