package defpackage;

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public final class hk4 implements Runnable {
    public final /* synthetic */ byte j;
    public final Runnable t;

    public /* synthetic */ hk4(Runnable runnable, byte b) {
        this.j = b;
        this.t = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        Runnable runnable = this.t;
        switch (b) {
            case 0:
                runnable.run();
                break;
            case 1:
                Process.setThreadPriority(0);
                runnable.run();
                break;
            case 2:
                h63.t.set(new ArrayDeque());
                runnable.run();
                break;
            default:
                Deque deque = (Deque) h63.t.get();
                jr2.m(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
        }
    }

    public String toString() {
        switch (this.j) {
            case 0:
                return this.t.toString();
            default:
                return super.toString();
        }
    }
}
