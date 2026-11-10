package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class zx2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(zx2.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long y = qr.g.objectFieldOffset(zx2.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new by2(8, false);

    public final boolean g(Runnable runnable) {
        zx2 zx2Var;
        while (true) {
            Unsafe unsafe = qr.g;
            long j = y;
            by2 by2Var = (by2) unsafe.getObjectVolatile(this, j);
            int iG = by2Var.g(runnable);
            if (iG == 0) {
                return true;
            }
            if (iG == 1) {
                by2 by2VarR = by2Var.r();
                while (true) {
                    Unsafe unsafe2 = qr.g;
                    zx2Var = this;
                    if (unsafe2.compareAndSwapObject(zx2Var, y, by2Var, by2VarR) || unsafe2.getObjectVolatile(zx2Var, j) != by2Var) {
                        break;
                    }
                    this = zx2Var;
                }
            } else {
                if (iG == 2) {
                    return false;
                }
                zx2Var = this;
            }
            this = zx2Var;
        }
    }

    public final Object r() {
        zx2 zx2Var;
        while (true) {
            Unsafe unsafe = qr.g;
            long j = y;
            by2 by2Var = (by2) unsafe.getObjectVolatile(this, j);
            Object objN = by2Var.n();
            if (objN != by2.x) {
                return objN;
            }
            by2 by2VarR = by2Var.r();
            while (true) {
                zx2Var = this;
                if (qr.g.compareAndSwapObject(zx2Var, y, by2Var, by2VarR) || qr.g.getObjectVolatile(zx2Var, j) != by2Var) {
                    break;
                }
                this = zx2Var;
            }
            this = zx2Var;
        }
    }

    public final int y() {
        by2 by2Var = (by2) qr.g.getObjectVolatile(this, y);
        by2Var.getClass();
        long longVolatile = qr.g.getLongVolatile(by2Var, by2.j);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }
}
