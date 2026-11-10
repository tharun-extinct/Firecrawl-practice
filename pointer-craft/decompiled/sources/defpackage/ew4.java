package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ew4 extends n1 implements er1, b02, cw4, mb3 {
    public static final /* synthetic */ long w = qr.g.objectFieldOffset(ew4.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int q;

    public ew4(Object obj) {
        this._state$volatile = obj;
    }

    public final void a(Object obj) {
        if (obj == null) {
            obj = a11.o;
        }
        m(null, obj);
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        a(obj);
        return og5.g;
    }

    @Override // defpackage.zn4
    public final List g() {
        return pw5.k(getValue());
    }

    @Override // defpackage.cw4
    public final Object getValue() {
        ky2 ky2Var = a11.o;
        Object objectVolatile = qr.g.getObjectVolatile(this, w);
        if (objectVolatile == ky2Var) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        o1[] o1VarArr;
        ky2 ky2Var;
        synchronized (this) {
            Unsafe unsafe = qr.g;
            long j = w;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !yf2.p(objectVolatile, obj)) {
                return false;
            }
            if (yf2.p(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.q;
            if ((i2 & 1) != 0) {
                this.q = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.q = i3;
            o1[] o1VarArr2 = this.j;
            while (true) {
                fw4[] fw4VarArr = (fw4[]) o1VarArr2;
                if (fw4VarArr != null) {
                    for (fw4 fw4Var : fw4VarArr) {
                        if (fw4Var != null) {
                            AtomicReference atomicReference = fw4Var.g;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 == null || obj3 == (ky2Var = y94.w)) {
                                    break;
                                }
                                ky2 ky2Var2 = y94.q;
                                if (obj3 != ky2Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, ky2Var2)) {
                                            ((ib0) obj3).j(og5.g);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, ky2Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.q;
                    if (i == i3) {
                        this.q = i3 + 1;
                        return true;
                    }
                    o1VarArr = this.j;
                }
                o1VarArr2 = o1VarArr;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d9 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0077, B:33:0x007e, B:34:0x0082, B:36:0x0085, B:46:0x00a6, B:49:0x00b6, B:50:0x00d2, B:56:0x00e2, B:53:0x00d9, B:55:0x00df, B:38:0x008b, B:42:0x0092, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00d2->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b5 -> B:28:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.er1
    public final java.lang.Object r(defpackage.gr1 r14, defpackage.mu0 r15) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew4.r(gr1, mu0):java.lang.Object");
    }

    public final boolean t(Object obj, Object obj2) {
        ky2 ky2Var = a11.o;
        if (obj == null) {
            obj = ky2Var;
        }
        if (obj2 == null) {
            obj2 = ky2Var;
        }
        return m(obj, obj2);
    }

    @Override // defpackage.n1
    public final o1 v() {
        return new fw4();
    }

    @Override // defpackage.n1
    public final o1[] x() {
        return new fw4[2];
    }

    @Override // defpackage.b02
    public final er1 y(fx0 fx0Var, int i, f70 f70Var) {
        return (((i < 0 || i >= 2) && i != -2) || f70Var != f70.t) ? v70.u(this, fx0Var, i, f70Var) : this;
    }
}
