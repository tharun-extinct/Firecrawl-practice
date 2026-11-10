package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ph4 {
    public static final mh4 g = new mh4(new byte[0], 0, 0, false);
    public static final AtomicReference[] r;
    public static final int y;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        y = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        r = atomicReferenceArr;
    }

    public static final void g(mh4 mh4Var) {
        mh4Var.getClass();
        if (mh4Var.x != null || mh4Var.l != null) {
            l0.u("Failed requirement.");
            return;
        }
        if (mh4Var.n) {
            return;
        }
        AtomicReference atomicReference = r[(int) (Thread.currentThread().getId() & (((long) y) - 1))];
        mh4 mh4Var2 = g;
        mh4 mh4Var3 = (mh4) atomicReference.getAndSet(mh4Var2);
        if (mh4Var3 == mh4Var2) {
            return;
        }
        int i = mh4Var3 != null ? mh4Var3.r : 0;
        if (i >= 65536) {
            atomicReference.set(mh4Var3);
            return;
        }
        mh4Var.x = mh4Var3;
        mh4Var.y = 0;
        mh4Var.r = i + 8192;
        atomicReference.set(mh4Var);
    }

    public static final mh4 y() {
        AtomicReference atomicReference = r[(int) (Thread.currentThread().getId() & (((long) y) - 1))];
        mh4 mh4Var = g;
        mh4 mh4Var2 = (mh4) atomicReference.getAndSet(mh4Var);
        if (mh4Var2 == mh4Var) {
            return new mh4();
        }
        if (mh4Var2 == null) {
            atomicReference.set(null);
            return new mh4();
        }
        atomicReference.set(mh4Var2.x);
        mh4Var2.x = null;
        mh4Var2.r = 0;
        return mh4Var2;
    }
}
