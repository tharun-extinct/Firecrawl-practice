package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class by2 {
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(by2.class, Object.class, "_next$volatile");
    public static final ky2 x;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int g;
    public final /* synthetic */ AtomicReferenceArray n;
    public final int r;
    public final boolean y;

    static {
        Unsafe unsafe = qr.g;
        l = unsafe.objectFieldOffset(by2.class.getDeclaredField("_next$volatile"));
        j = unsafe.objectFieldOffset(by2.class.getDeclaredField("_state$volatile"));
        x = new ky2("REMOVE_FROZEN", (byte) 2);
    }

    public by2(int i, boolean z) {
        this.g = i;
        this.y = z;
        int i2 = i - 1;
        this.r = i2;
        this.n = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            l0.z("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        l0.z("Check failed.");
        throw null;
    }

    public final int g(Object obj) {
        by2 by2Var = this;
        while (true) {
            Unsafe unsafe = qr.g;
            long j2 = j;
            long longVolatile = unsafe.getLongVolatile(by2Var, j2);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = by2Var.r;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = by2Var.y;
            AtomicReferenceArray atomicReferenceArray = by2Var.n;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(by2Var, j, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    by2 by2VarR = this;
                    while ((qr.g.getLongVolatile(by2VarR, j2) & 1152921504606846976L) != 0) {
                        by2VarR = by2VarR.r();
                        AtomicReferenceArray atomicReferenceArray2 = by2VarR.n;
                        int i4 = by2VarR.r & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof ay2) && ((ay2) obj2).g == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            by2VarR = null;
                        }
                        if (by2VarR == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                by2Var = this;
            } else {
                int i5 = by2Var.g;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final Object n() {
        by2 by2VarR = this;
        while (true) {
            Unsafe unsafe = qr.g;
            long j2 = j;
            long longVolatile = unsafe.getLongVolatile(by2VarR, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return x;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = by2VarR.r;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = by2VarR.n;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = by2VarR.y;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof ay2)) {
                    long j3 = (i + 1) & 1073741823;
                    if (unsafe.compareAndSwapLong(by2VarR, j2, longVolatile, (longVolatile & (-1073741824)) | j3)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    by2VarR = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = qr.g;
                            long j4 = j;
                            long longVolatile2 = unsafe2.getLongVolatile(by2VarR, j4);
                            int i5 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                by2VarR = by2VarR.r();
                            } else {
                                if (unsafe2.compareAndSwapLong(by2VarR, j4, longVolatile2, (longVolatile2 & (-1073741824)) | j3)) {
                                    by2VarR.n.set(by2VarR.r & i5, null);
                                    by2VarR = null;
                                } else {
                                    continue;
                                }
                            }
                            if (by2VarR == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    public final by2 r() {
        long longVolatile;
        by2 by2Var;
        while (true) {
            Unsafe unsafe = qr.g;
            long j2 = j;
            longVolatile = unsafe.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                by2Var = this;
                break;
            }
            long j3 = 1152921504606846976L | longVolatile;
            by2Var = this;
            if (unsafe.compareAndSwapLong(by2Var, j2, longVolatile, j3)) {
                longVolatile = j3;
                break;
            }
            this = by2Var;
        }
        while (true) {
            by2 by2Var2 = (by2) qr.g.getObjectVolatile(by2Var, l);
            if (by2Var2 != null) {
                return by2Var2;
            }
            by2 by2Var3 = new by2(by2Var.g * 2, by2Var.y);
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            while (true) {
                int i3 = by2Var.r;
                int i4 = i & i3;
                if (i4 != (i3 & i2)) {
                    Object ay2Var = by2Var.n.get(i4);
                    if (ay2Var == null) {
                        ay2Var = new ay2(i);
                    }
                    by2Var3.n.set(by2Var3.r & i, ay2Var);
                    i++;
                }
            }
            qr.g.putLongVolatile(by2Var3, j, longVolatile & (-1152921504606846977L));
            fj.q(by2Var, by2Var3);
        }
    }

    public final boolean y() {
        while (true) {
            long longVolatile = qr.g.getLongVolatile(this, j);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            by2 by2Var = this;
            if (qr.g.compareAndSwapLong(by2Var, j, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = by2Var;
        }
    }
}
