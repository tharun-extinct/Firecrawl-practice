package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class wr extends m95 {
    public static final ReentrantLock a;
    public static final c6 j;
    public static final Condition m;
    public static final char q;
    public static wr t;
    public static final long w;
    public long l;
    public byte v;
    public int x = -1;

    static {
        c6 c6Var = new c6();
        c6Var.y = new wr[8];
        j = c6Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        a = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        m = conditionNewCondition;
        q = (char) 60000;
        w = 60000000000L;
    }

    public final void j() {
        long j2 = this.r;
        boolean z = this.g;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = a;
            reentrantLock.lock();
            try {
                if (this.v != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.v = (byte) 1;
                ey5.r(this);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean t() {
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            byte b = this.v;
            this.v = (byte) 0;
            if (b != 1) {
                return b == 2;
            }
            j.q(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void a() {
    }
}
