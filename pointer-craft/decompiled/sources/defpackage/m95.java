package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class m95 {
    public static final l95 n = new l95();
    public boolean g;
    public long r;
    public long y;

    public m95 g() {
        this.g = false;
        return this;
    }

    public m95 l(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j >= 0) {
            this.r = timeUnit.toNanos(j);
            return this;
        }
        up.t("timeout < 0: ", j);
        return null;
    }

    public m95 n(long j) {
        this.g = true;
        this.y = j;
        return this;
    }

    public long r() {
        if (this.g) {
            return this.y;
        }
        l0.z("No deadline");
        return 0L;
    }

    public boolean v() {
        return this.g;
    }

    public void x() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.g && this.y - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public m95 y() {
        this.r = 0L;
        return this;
    }
}
