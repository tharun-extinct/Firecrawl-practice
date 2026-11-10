package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class yl1 {
    public final ReentrantLock g;
    public final cd2 y;
    public static final aj6 r = new aj6(18);
    public static final LinkedHashMap n = new LinkedHashMap();

    public yl1(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (r) {
            try {
                LinkedHashMap linkedHashMap = n;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = reentrantLock;
        this.y = z ? new cd2(str) : null;
    }
}
