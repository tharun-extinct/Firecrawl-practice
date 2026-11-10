package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class ri3 {
    public volatile boolean n;
    public final boolean[] r;
    public volatile boolean x;
    public final long[] y;
    public final ReentrantLock g = new ReentrantLock();
    public final ReentrantLock v = new ReentrantLock();

    public ri3(int i) {
        this.y = new long[i];
        this.r = new boolean[i];
    }
}
