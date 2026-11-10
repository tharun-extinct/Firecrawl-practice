package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class vr extends Thread {
    public final /* synthetic */ byte j = 1;

    public /* synthetic */ vr(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.j) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(10);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = wr.a;
                reentrantLock.lock();
                try {
                    wr wrVarG = ey5.g();
                    if (wrVarG == wr.t) {
                        wr.t = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (wrVarG != null) {
                            wrVarG.a();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
                continue;
            }
        }
    }

    public /* synthetic */ vr(String str) {
        super(str);
    }

    public /* synthetic */ vr(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
