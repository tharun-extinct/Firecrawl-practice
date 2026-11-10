package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class m70 implements yc0 {
    public static final /* synthetic */ AtomicLongFieldUpdater a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ AtomicLongFieldUpdater m;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ AtomicLongFieldUpdater q;
    public static final /* synthetic */ long s;
    public static final /* synthetic */ AtomicLongFieldUpdater t = AtomicLongFieldUpdater.newUpdater(m70.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ long u;
    public static final /* synthetic */ AtomicReferenceFieldUpdater w;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int j;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = qr.g;
        k = unsafe.objectFieldOffset(m70.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        a = AtomicLongFieldUpdater.newUpdater(m70.class, "receivers$volatile");
        o = unsafe.objectFieldOffset(m70.class.getDeclaredField("receivers$volatile"));
        m = AtomicLongFieldUpdater.newUpdater(m70.class, "bufferEnd$volatile");
        s = unsafe.objectFieldOffset(m70.class.getDeclaredField("bufferEnd$volatile"));
        q = AtomicLongFieldUpdater.newUpdater(m70.class, "completedExpandBuffersAndPauseFlag$volatile");
        z = unsafe.objectFieldOffset(m70.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        w = AtomicReferenceFieldUpdater.newUpdater(m70.class, Object.class, "sendSegment$volatile");
        f = unsafe.objectFieldOffset(m70.class.getDeclaredField("sendSegment$volatile"));
        c = AtomicReferenceFieldUpdater.newUpdater(m70.class, Object.class, "receiveSegment$volatile");
        h = unsafe.objectFieldOffset(m70.class.getDeclaredField("receiveSegment$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(m70.class, Object.class, "bufferEndSegment$volatile");
        p = unsafe.objectFieldOffset(m70.class.getDeclaredField("bufferEndSegment$volatile"));
        b = unsafe.objectFieldOffset(m70.class.getDeclaredField("_closeCause$volatile"));
        u = unsafe.objectFieldOffset(m70.class.getDeclaredField("closeHandler$volatile"));
    }

    public m70(int i2) {
        this.j = i2;
        if (i2 < 0) {
            l0.t(du4.w(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        md0 md0Var = o70.g;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = q();
        md0 md0Var2 = new md0(0L, null, this, 3);
        this.sendSegment$volatile = md0Var2;
        this.receiveSegment$volatile = md0Var2;
        if (B()) {
            md0Var2 = o70.g;
            md0Var2.getClass();
        }
        this.bufferEndSegment$volatile = md0Var2;
        this._closeCause$volatile = o70.u;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object F(m70 m70Var, ou0 ou0Var) {
        k70 k70Var;
        md0 md0Var;
        if (ou0Var instanceof k70) {
            k70Var = (k70) ou0Var;
            int i2 = k70Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k70Var.w = i2 - Integer.MIN_VALUE;
            } else {
                k70Var = new k70(m70Var, ou0Var);
            }
        } else {
            k70Var = new k70(m70Var, ou0Var);
        }
        k70 k70Var2 = k70Var;
        Object obj = k70Var2.m;
        int i3 = k70Var2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                js2.o(obj);
                return ((ld0) obj).g;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        md0 md0Var2 = (md0) qr.g.getObjectVolatile(m70Var, h);
        while (!m70Var.k()) {
            long andIncrement = a.getAndIncrement(m70Var);
            long j = o70.y;
            long j2 = andIncrement / j;
            int i4 = (int) (andIncrement % j);
            if (md0Var2.m != j2) {
                md0 md0VarA = m70Var.a(j2, md0Var2);
                if (md0VarA == null) {
                    continue;
                } else {
                    md0Var = md0VarA;
                }
            } else {
                md0Var = md0Var2;
            }
            m70 m70Var2 = m70Var;
            Object objK = m70Var2.K(md0Var, i4, andIncrement, null);
            if (objK == o70.w) {
                l0.z("unexpected");
                return null;
            }
            if (objK != o70.i) {
                if (objK != o70.c) {
                    md0Var.g();
                    return objK;
                }
                k70Var2.w = 1;
                Object objG = m70Var2.G(md0Var, i4, andIncrement, k70Var2);
                px0 px0Var = px0.j;
                return objG == px0Var ? px0Var : objG;
            }
            if (andIncrement < m70Var2.u()) {
                md0Var.g();
            }
            m70Var = m70Var2;
            md0Var2 = md0Var;
        }
        return new jd0(m70Var.w());
    }

    public boolean A() {
        return false;
    }

    public final boolean B() {
        long jQ = q();
        return jQ == 0 || jQ == Long.MAX_VALUE;
    }

    public final void C(long j, md0 md0Var) {
        md0 md0Var2;
        md0 md0Var3;
        while (md0Var.m < j && (md0Var3 = (md0) md0Var.r()) != null) {
            md0Var = md0Var3;
        }
        while (true) {
            if (!md0Var.n() || (md0Var2 = (md0) md0Var.r()) == null) {
                while (true) {
                    nh4 nh4Var = (nh4) qr.g.getObjectVolatile(this, p);
                    if (nh4Var.m >= md0Var.m) {
                        return;
                    }
                    if (!md0Var.a()) {
                        break;
                    }
                    if (fj.i(this, nh4Var, md0Var)) {
                        if (nh4Var.x()) {
                            nh4Var.v();
                            return;
                        }
                        return;
                    } else if (md0Var.x()) {
                        md0Var.v();
                    }
                }
            } else {
                md0Var = md0Var2;
            }
        }
    }

    public final Object D(mu0 mu0Var, Object obj) {
        ib0 ib0Var = new ib0(1, pw5.o(mu0Var));
        ib0Var.o();
        ib0Var.j(new g84(s()));
        Object objZ = ib0Var.z();
        return objZ == px0.j ? objZ : og5.g;
    }

    public final void E(Object obj, ib0 ib0Var) {
        ib0Var.j(new g84(s()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(md0 md0Var, int i2, long j, ou0 ou0Var) {
        l70 l70Var;
        ld0 ld0Var;
        md0 md0Var2;
        if (ou0Var instanceof l70) {
            l70Var = (l70) ou0Var;
            int i3 = l70Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l70Var.w = i3 - Integer.MIN_VALUE;
            } else {
                l70Var = new l70(this, ou0Var);
            }
        } else {
            l70Var = new l70(this, ou0Var);
        }
        Object objZ = l70Var.m;
        int i4 = l70Var.w;
        if (i4 == 0) {
            js2.o(objZ);
            l70Var.w = 1;
            ib0 ib0VarI = gp4.I(pw5.o(l70Var));
            try {
                s34 s34Var = new s34(ib0VarI);
                Object objK = K(md0Var, i2, j, s34Var);
                if (objK != o70.w) {
                    if (objK == o70.i) {
                        if (j < u()) {
                            md0Var.g();
                        }
                        md0 md0Var3 = (md0) qr.g.getObjectVolatile(this, h);
                        while (true) {
                            if (k()) {
                                ib0VarI.j(new ld0(new jd0(w())));
                                break;
                            }
                            long andIncrement = a.getAndIncrement(this);
                            long j2 = o70.y;
                            long j3 = andIncrement / j2;
                            int i5 = (int) (andIncrement % j2);
                            if (md0Var3.m != j3) {
                                md0 md0VarA = a(j3, md0Var3);
                                if (md0VarA != null) {
                                    md0Var2 = md0VarA;
                                }
                            } else {
                                md0Var2 = md0Var3;
                            }
                            Object objK2 = K(md0Var2, i5, andIncrement, s34Var);
                            md0 md0Var4 = md0Var2;
                            if (objK2 == o70.w) {
                                s34Var.g(md0Var4, i5);
                                break;
                            }
                            if (objK2 == o70.i) {
                                if (andIncrement < u()) {
                                    md0Var4.g();
                                }
                                md0Var3 = md0Var4;
                            } else {
                                if (objK2 == o70.c) {
                                    throw new IllegalStateException("unexpected");
                                }
                                md0Var4.g();
                                ld0Var = new ld0(objK2);
                            }
                        }
                    } else {
                        md0Var.g();
                        ld0Var = new ld0(objK);
                    }
                    ib0VarI.m(ld0Var, null);
                    break;
                }
                s34Var.g(md0Var, i2);
                objZ = ib0VarI.z();
                px0 px0Var = px0.j;
                if (objZ == px0Var) {
                    return px0Var;
                }
            } catch (Throwable th) {
                ib0VarI.C();
                throw th;
            }
        } else {
            if (i4 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objZ);
        }
        return ((ld0) objZ).g;
    }

    public final void H(an5 an5Var, boolean z2) {
        if (an5Var instanceof hb0) {
            ((mu0) an5Var).j(new g84(z2 ? i() : s()));
            return;
        }
        if (an5Var instanceof s34) {
            ((s34) an5Var).j.j(new ld0(new jd0(w())));
            return;
        }
        if (!(an5Var instanceof h70)) {
            if (an5Var instanceof zh4) {
                ((zh4) an5Var).l(this, o70.q);
                return;
            } else {
                l0.b(an5Var, "Unexpected waiter: ");
                return;
            }
        }
        h70 h70Var = (h70) an5Var;
        ib0 ib0Var = h70Var.t;
        ib0Var.getClass();
        h70Var.t = null;
        h70Var.j = o70.q;
        Throwable thW = h70Var.a.w();
        if (thW == null) {
            ib0Var.j(Boolean.FALSE);
        } else {
            ib0Var.j(new g84(thW));
        }
    }

    public final boolean I(Object obj, Object obj2) throws ha1 {
        if (obj instanceof zh4) {
            return ((zh4) obj).l(this, obj2) == 0;
        }
        if (obj instanceof s34) {
            ib0 ib0Var = ((s34) obj).j;
            ld0 ld0Var = new ld0(obj2);
            md0 md0Var = o70.g;
            ky2 ky2VarQ = ib0Var.q(ld0Var, null);
            if (ky2VarQ == null) {
                return false;
            }
            ib0Var.H(ky2VarQ);
            return true;
        }
        if (!(obj instanceof h70)) {
            if (!(obj instanceof hb0)) {
                l0.b(obj, "Unexpected receiver type: ");
                return false;
            }
            hb0 hb0Var = (hb0) obj;
            md0 md0Var2 = o70.g;
            ky2 ky2VarQ2 = hb0Var.q(obj2, null);
            if (ky2VarQ2 == null) {
                return false;
            }
            hb0Var.H(ky2VarQ2);
            return true;
        }
        h70 h70Var = (h70) obj;
        ib0 ib0Var2 = h70Var.t;
        ib0Var2.getClass();
        h70Var.t = null;
        h70Var.j = obj2;
        Boolean bool = Boolean.TRUE;
        h70Var.a.getClass();
        md0 md0Var3 = o70.g;
        ky2 ky2VarQ3 = ib0Var2.q(bool, null);
        if (ky2VarQ3 == null) {
            return false;
        }
        ib0Var2.H(ky2VarQ3);
        return true;
    }

    public final boolean J(Object obj, md0 md0Var, int i2) {
        pe5 pe5Var;
        boolean z2 = obj instanceof hb0;
        og5 og5Var = og5.g;
        if (z2) {
            hb0 hb0Var = (hb0) obj;
            md0 md0Var2 = o70.g;
            ky2 ky2VarQ = hb0Var.q(og5Var, null);
            if (ky2VarQ == null) {
                return false;
            }
            hb0Var.H(ky2VarQ);
            return true;
        }
        if (!(obj instanceof zh4)) {
            l0.b(obj, "Unexpected waiter: ");
            return false;
        }
        int iL = ((zh4) obj).l(this, og5Var);
        pe5 pe5Var2 = pe5.j;
        pe5 pe5Var3 = pe5.t;
        if (iL == 0) {
            pe5Var = pe5Var2;
        } else if (iL == 1) {
            pe5Var = pe5Var3;
        } else if (iL == 2) {
            pe5Var = pe5.a;
        } else {
            if (iL != 3) {
                uo1.e("Unexpected internal result: ", iL);
                return false;
            }
            pe5Var = pe5.m;
        }
        if (pe5Var == pe5Var3) {
            md0Var.c(i2, null);
        }
        return pe5Var == pe5Var2;
    }

    public final Object K(md0 md0Var, int i2, long j, Object obj) {
        Object objQ = md0Var.q(i2);
        AtomicReferenceArray atomicReferenceArray = md0Var.i;
        long j2 = k;
        if (objQ == null) {
            if (j >= (qr.g.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return o70.c;
                }
                if (md0Var.m(i2, objQ, obj)) {
                    t();
                    return o70.w;
                }
            }
        } else if (objQ == o70.n && md0Var.m(i2, objQ, o70.t)) {
            t();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            md0Var.c(i2, null);
            return obj2;
        }
        while (true) {
            Object objQ2 = md0Var.q(i2);
            if (objQ2 == null || objQ2 == o70.v) {
                if (j < (qr.g.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (md0Var.m(i2, objQ2, o70.j)) {
                        t();
                        return o70.i;
                    }
                } else {
                    if (obj == null) {
                        return o70.c;
                    }
                    if (md0Var.m(i2, objQ2, obj)) {
                        t();
                        return o70.w;
                    }
                }
            } else if (objQ2 != o70.n) {
                ky2 ky2Var = o70.a;
                if (objQ2 == ky2Var) {
                    return o70.i;
                }
                if (objQ2 == o70.j) {
                    return o70.i;
                }
                if (objQ2 == o70.q) {
                    t();
                    return o70.i;
                }
                if (objQ2 != o70.l && md0Var.m(i2, objQ2, o70.x)) {
                    boolean z2 = objQ2 instanceof bn5;
                    if (z2) {
                        objQ2 = ((bn5) objQ2).g;
                    }
                    if (J(objQ2, md0Var, i2)) {
                        md0Var.i(i2, o70.t);
                        t();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        md0Var.c(i2, null);
                        return obj3;
                    }
                    md0Var.i(i2, ky2Var);
                    md0Var.t();
                    if (z2) {
                        t();
                    }
                    return o70.i;
                }
            } else if (md0Var.m(i2, objQ2, o70.t)) {
                t();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                md0Var.c(i2, null);
                return obj4;
            }
        }
    }

    public final int L(md0 md0Var, int i2, Object obj, long j, Object obj2, boolean z2) {
        md0Var.c(i2, obj);
        if (z2) {
            return M(md0Var, i2, obj, j, obj2, z2);
        }
        Object objQ = md0Var.q(i2);
        if (objQ == null) {
            if (y(j)) {
                if (md0Var.m(i2, null, o70.n)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (md0Var.m(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objQ instanceof an5) {
            md0Var.c(i2, null);
            if (I(objQ, obj)) {
                md0Var.i(i2, o70.t);
                return 0;
            }
            ky2 ky2Var = o70.m;
            if (md0Var.i.getAndSet((i2 * 2) + 1, ky2Var) == ky2Var) {
                return 5;
            }
            md0Var.w(i2, true);
            return 5;
        }
        return M(md0Var, i2, obj, j, obj2, z2);
    }

    public final int M(md0 md0Var, int i2, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object objQ = md0Var.q(i2);
            if (objQ == null) {
                if (!y(j) || z2) {
                    if (z2) {
                        if (md0Var.m(i2, null, o70.a)) {
                            md0Var.t();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (md0Var.m(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (md0Var.m(i2, null, o70.n)) {
                    break;
                }
            } else {
                if (objQ != o70.v) {
                    ky2 ky2Var = o70.m;
                    if (objQ == ky2Var) {
                        md0Var.c(i2, null);
                        return 5;
                    }
                    if (objQ == o70.j) {
                        md0Var.c(i2, null);
                        return 5;
                    }
                    if (objQ == o70.q) {
                        md0Var.c(i2, null);
                        d();
                        return 4;
                    }
                    md0Var.c(i2, null);
                    if (objQ instanceof bn5) {
                        objQ = ((bn5) objQ).g;
                    }
                    if (I(objQ, obj)) {
                        md0Var.i(i2, o70.t);
                        return 0;
                    }
                    if (md0Var.i.getAndSet((i2 * 2) + 1, ky2Var) != ky2Var) {
                        md0Var.w(i2, true);
                    }
                    return 5;
                }
                if (md0Var.m(i2, objQ, o70.n)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void N(long j) {
        m70 m70Var = this;
        if (m70Var.B()) {
            return;
        }
        while (m70Var.q() <= j) {
            m70Var = this;
        }
        int i2 = o70.r;
        int i3 = 0;
        while (true) {
            long j2 = z;
            if (i3 < i2) {
                long jQ = m70Var.q();
                if (jQ == (qr.g.getLongVolatile(m70Var, j2) & 4611686018427387903L) && jQ == m70Var.q()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = qr.g;
                    long longVolatile = unsafe.getLongVolatile(m70Var, j2);
                    if (unsafe.compareAndSwapLong(m70Var, z, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        m70Var = this;
                    }
                }
                while (true) {
                    long jQ2 = m70Var.q();
                    Unsafe unsafe2 = qr.g;
                    long longVolatile2 = unsafe2.getLongVolatile(m70Var, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z2 = (longVolatile2 & 4611686018427387904L) != 0;
                    if (jQ2 == j3 && jQ2 == m70Var.q()) {
                        break;
                    }
                    if (z2) {
                        m70Var = this;
                    } else {
                        m70Var = this;
                        unsafe2.compareAndSwapLong(m70Var, z, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = qr.g;
                    long longVolatile3 = unsafe3.getLongVolatile(m70Var, j2);
                    if (unsafe3.compareAndSwapLong(m70Var, z, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        m70Var = this;
                    }
                }
            }
        }
    }

    public final md0 a(long j, md0 md0Var) {
        Object objP;
        md0 md0Var2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        md0 md0Var3 = o70.g;
        n70 n70Var = n70.i;
        loop0: while (true) {
            objP = v70.p(md0Var, j, n70Var);
            if (!zq2.h(objP)) {
                nh4 nh4VarU = zq2.u(objP);
                while (true) {
                    Unsafe unsafe3 = qr.g;
                    long j3 = h;
                    nh4 nh4Var = (nh4) unsafe3.getObjectVolatile(this, j3);
                    if (nh4Var.m >= nh4VarU.m) {
                        break loop0;
                    }
                    if (!nh4VarU.a()) {
                        break;
                    }
                    do {
                        unsafe2 = qr.g;
                        if (unsafe2.compareAndSwapObject(this, h, nh4Var, nh4VarU)) {
                            if (!nh4Var.x()) {
                                break loop0;
                            }
                            nh4Var.v();
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == nh4Var);
                    if (nh4VarU.x()) {
                        nh4VarU.v();
                    }
                }
            } else {
                break;
            }
        }
        if (zq2.h(objP)) {
            d();
            if (md0Var.m * ((long) o70.y) < u()) {
                md0Var.g();
                return null;
            }
        } else {
            md0 md0Var4 = (md0) zq2.u(objP);
            long j4 = md0Var4.m;
            if (B() || j > q() / ((long) o70.y)) {
                md0Var2 = md0Var4;
                break;
            }
            loop3: while (true) {
                Unsafe unsafe4 = qr.g;
                long j5 = p;
                nh4 nh4Var2 = (nh4) unsafe4.getObjectVolatile(this, j5);
                if (nh4Var2.m >= j4 || !md0Var4.a()) {
                    md0Var2 = md0Var4;
                    break;
                }
                while (true) {
                    Unsafe unsafe5 = qr.g;
                    md0Var2 = md0Var4;
                    if (unsafe5.compareAndSwapObject(this, p, nh4Var2, md0Var4)) {
                        if (!nh4Var2.x()) {
                            break loop3;
                        }
                        nh4Var2.v();
                        break loop3;
                    }
                    if (unsafe5.getObjectVolatile(this, j5) != nh4Var2) {
                        break;
                    }
                    md0Var4 = md0Var2;
                }
                if (md0Var2.x()) {
                    md0Var2.v();
                }
                md0Var4 = md0Var2;
            }
            if (j4 <= j) {
                return md0Var2;
            }
            long j6 = j4 * ((long) o70.y);
            do {
                unsafe = qr.g;
                j2 = o;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * ((long) o70.y) < u()) {
                md0Var2.g();
            }
        }
        return null;
    }

    public final long b() {
        return qr.g.getLongVolatile(this, o);
    }

    @Override // defpackage.yc0
    public final wh4 c() {
        ue5.f(3, i70.i);
        ue5.f(3, j70.i);
        return new wh4(this, (g70) null);
    }

    public final boolean d() {
        return f(qr.g.getLongVolatile(this, k), false);
    }

    @Override // defpackage.yc0
    public final Object e(jk0 jk0Var) {
        return F(this, jk0Var);
    }

    public final boolean f(long j, boolean z2) {
        int i2 = (int) (j >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                v(j & 1152921504606846975L);
                if (z2) {
                    while (true) {
                        Unsafe unsafe = qr.g;
                        long j2 = h;
                        md0 md0VarA = (md0) unsafe.getObjectVolatile(this, j2);
                        long jB = b();
                        if (u() <= jB) {
                            break;
                        }
                        long j3 = o70.y;
                        long j4 = jB / j3;
                        if (md0VarA.m != j4 && (md0VarA = a(j4, md0VarA)) == null) {
                            if (((md0) unsafe.getObjectVolatile(this, j2)).m < j4) {
                                break;
                            }
                        } else {
                            md0VarA.g();
                            int i3 = (int) (jB % j3);
                            while (true) {
                                Object objQ = md0VarA.q(i3);
                                if (objQ != null && objQ != o70.v) {
                                    if (objQ != o70.n && (objQ == o70.a || objQ == o70.q || objQ == o70.t || objQ == o70.j || (objQ != o70.l && (objQ == o70.x || jB != b())))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (md0VarA.m(i3, objQ, o70.j)) {
                                    t();
                                    break;
                                }
                            }
                            qr.g.compareAndSwapLong(this, o, jB, jB + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    uo1.x(xi3.j("unexpected close status: ", i2));
                    return false;
                }
                md0 md0VarV = v(j & 1152921504606846975L);
                Object objD = null;
                loop0: do {
                    for (int i4 = o70.y - 1; -1 < i4; i4--) {
                        long j5 = (md0VarV.m * ((long) o70.y)) + ((long) i4);
                        while (true) {
                            Object objQ2 = md0VarV.q(i4);
                            if (objQ2 == o70.t) {
                                break loop0;
                            }
                            if (objQ2 != o70.n) {
                                if (objQ2 != o70.v && objQ2 != null) {
                                    if (!(objQ2 instanceof an5) && !(objQ2 instanceof bn5)) {
                                        ky2 ky2Var = o70.l;
                                        if (objQ2 == ky2Var || objQ2 == o70.x) {
                                            break loop0;
                                        }
                                        if (objQ2 != ky2Var) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < b()) {
                                            break loop0;
                                        }
                                        an5 an5Var = objQ2 instanceof bn5 ? ((bn5) objQ2).g : (an5) objQ2;
                                        if (md0VarV.m(i4, objQ2, o70.q)) {
                                            objD = a11.d(objD, an5Var);
                                            md0VarV.c(i4, null);
                                            md0VarV.t();
                                            break;
                                        }
                                    }
                                } else {
                                    if (md0VarV.m(i4, objQ2, o70.q)) {
                                        md0VarV.t();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < b()) {
                                    break loop0;
                                }
                                if (md0VarV.m(i4, objQ2, o70.q)) {
                                    md0VarV.c(i4, null);
                                    md0VarV.t();
                                    break;
                                }
                            }
                        }
                    }
                    md0VarV = (md0) ((np0) qr.g.getObjectVolatile(md0VarV, np0.a));
                } while (md0VarV != null);
                if (objD != null) {
                    if (objD instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objD;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            H((an5) arrayList.get(size), false);
                        }
                    } else {
                        H((an5) objD, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.wj4
    public final boolean g(Throwable th) {
        return n(th, false);
    }

    public final void h(long j) {
        if ((q.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((qr.g.getLongVolatile(this, z) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Throwable i() {
        Throwable thW = w();
        return thW == null ? new li0() : thW;
    }

    @Override // defpackage.yc0
    public final h70 iterator() {
        return new h70(this);
    }

    public final void j(long j) {
        md0 md0Var = (md0) qr.g.getObjectVolatile(this, h);
        while (true) {
            Unsafe unsafe = qr.g;
            long j2 = o;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(((long) this.j) + longVolatile, this.q())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j2, longVolatile, 1 + longVolatile)) {
                long j3 = o70.y;
                long j4 = longVolatile / j3;
                int i2 = (int) (longVolatile % j3);
                if (md0Var.m != j4) {
                    md0 md0VarA = this.a(j4, md0Var);
                    if (md0VarA != null) {
                        md0Var = md0VarA;
                    }
                }
                md0 md0Var2 = md0Var;
                if (this.K(md0Var2, i2, longVolatile, null) != o70.i || longVolatile < this.u()) {
                    md0Var2.g();
                }
                md0Var = md0Var2;
            }
        }
    }

    public final boolean k() {
        return f(qr.g.getLongVolatile(this, k), true);
    }

    @Override // defpackage.yc0
    public final Object l(mu0 mu0Var) throws Throwable {
        md0 md0Var;
        Throwable th;
        md0 md0Var2;
        Unsafe unsafe = qr.g;
        long j = h;
        md0 md0Var3 = (md0) unsafe.getObjectVolatile(this, j);
        while (!this.k()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = a;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = o70.y;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (md0Var3.m != j3) {
                md0 md0VarA = this.a(j3, md0Var3);
                if (md0VarA == null) {
                    continue;
                } else {
                    md0Var = md0VarA;
                }
            } else {
                md0Var = md0Var3;
            }
            m70 m70Var = this;
            Object objK = m70Var.K(md0Var, i2, andIncrement, null);
            ky2 ky2Var = o70.w;
            if (objK == ky2Var) {
                l0.z("unexpected");
                return null;
            }
            ky2 ky2Var2 = o70.i;
            if (objK == ky2Var2) {
                if (andIncrement < m70Var.u()) {
                    md0Var.g();
                }
                this = m70Var;
                md0Var3 = md0Var;
            } else {
                if (objK != o70.c) {
                    md0Var.g();
                    return objK;
                }
                ib0 ib0VarI = gp4.I(pw5.o(mu0Var));
                try {
                    Object objK2 = m70Var.K(md0Var, i2, andIncrement, ib0VarI);
                    if (objK2 != ky2Var) {
                        if (objK2 == ky2Var2) {
                            if (andIncrement < m70Var.u()) {
                                md0Var.g();
                            }
                            md0 md0Var4 = (md0) qr.g.getObjectVolatile(m70Var, j);
                            while (true) {
                                if (m70Var.k()) {
                                    ib0VarI.j(new g84(m70Var.i()));
                                    break;
                                }
                                ib0 ib0Var = ib0VarI;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(m70Var);
                                    long j4 = o70.y;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (md0Var4.m != j5) {
                                        try {
                                            md0 md0VarA2 = m70Var.a(j5, md0Var4);
                                            if (md0VarA2 == null) {
                                                ib0VarI = ib0Var;
                                            } else {
                                                md0Var2 = md0VarA2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            ib0VarI = ib0Var;
                                            ib0VarI.C();
                                            throw th;
                                        }
                                    } else {
                                        md0Var2 = md0Var4;
                                    }
                                    m70 m70Var2 = m70Var;
                                    objK2 = m70Var2.K(md0Var2, i3, andIncrement2, ib0Var);
                                    m70Var = m70Var2;
                                    md0 md0Var5 = md0Var2;
                                    ib0VarI = ib0Var;
                                    if (objK2 == o70.w) {
                                        ib0VarI.g(md0Var5, i3);
                                        break;
                                    }
                                    if (objK2 == o70.i) {
                                        if (andIncrement2 < m70Var.u()) {
                                            md0Var5.g();
                                        }
                                        md0Var4 = md0Var5;
                                    } else {
                                        if (objK2 == o70.c) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        md0Var5.g();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    ib0VarI = ib0Var;
                                    th = th;
                                    ib0VarI.C();
                                    throw th;
                                }
                            }
                        } else {
                            md0Var.g();
                        }
                        ib0VarI.m(objK2, null);
                        break;
                    }
                    ib0VarI.g(md0Var, i2);
                    return ib0VarI.z();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thI = this.i();
        int i4 = bv4.g;
        throw thI;
    }

    public final md0 m(long j, md0 md0Var) {
        Object objP;
        md0 md0Var2;
        long j2;
        Unsafe unsafe;
        m70 m70Var = this;
        md0 md0Var3 = o70.g;
        n70 n70Var = n70.i;
        loop0: while (true) {
            objP = v70.p(md0Var, j, n70Var);
            if (!zq2.h(objP)) {
                nh4 nh4VarU = zq2.u(objP);
                while (true) {
                    Unsafe unsafe2 = qr.g;
                    long j3 = f;
                    nh4 nh4Var = (nh4) unsafe2.getObjectVolatile(m70Var, j3);
                    if (nh4Var.m >= nh4VarU.m) {
                        break loop0;
                    }
                    if (!nh4VarU.a()) {
                        break;
                    }
                    do {
                        unsafe = qr.g;
                        if (unsafe.compareAndSwapObject(m70Var, f, nh4Var, nh4VarU)) {
                            if (!nh4Var.x()) {
                                break loop0;
                            }
                            nh4Var.v();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(m70Var, j3) == nh4Var);
                    if (nh4VarU.x()) {
                        nh4VarU.v();
                    }
                }
            } else {
                break;
            }
        }
        md0 md0Var4 = null;
        if (zq2.h(objP)) {
            m70Var.d();
            if (md0Var.m * ((long) o70.y) >= m70Var.b()) {
                return null;
            }
            md0Var.g();
            return null;
        }
        md0 md0Var5 = (md0) zq2.u(objP);
        long j4 = md0Var5.m;
        if (j4 <= j) {
            return md0Var5;
        }
        long j5 = j4 * ((long) o70.y);
        while (true) {
            Unsafe unsafe3 = qr.g;
            long j6 = k;
            long longVolatile = unsafe3.getLongVolatile(m70Var, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                md0Var2 = md0Var4;
                j2 = j4;
                break;
            }
            md0Var2 = md0Var4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(m70Var, j6, longVolatile, j7 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            m70Var = this;
            md0Var4 = md0Var2;
            j4 = j2;
        }
        if (j2 * ((long) o70.y) >= b()) {
            return md0Var2;
        }
        md0Var5.g();
        return md0Var2;
    }

    public final boolean n(Throwable th, boolean z2) {
        boolean z3;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        Unsafe unsafe4;
        long j4;
        long longVolatile3;
        if (z2) {
            do {
                unsafe4 = qr.g;
                j4 = k;
                longVolatile3 = unsafe4.getLongVolatile(this, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                md0 md0Var = o70.g;
            } while (!unsafe4.compareAndSwapLong(this, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        ky2 ky2Var = o70.u;
        while (true) {
            Unsafe unsafe5 = qr.g;
            long j5 = b;
            if (unsafe5.compareAndSwapObject(this, j5, ky2Var, th)) {
                z3 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != ky2Var) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                unsafe3 = qr.g;
                j3 = k;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = qr.g;
                j = k;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i2 = (int) (longVolatile >> 60);
                if (i2 == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        d();
        if (z3) {
            loop3: while (true) {
                Unsafe unsafe6 = qr.g;
                long j6 = u;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                ky2 ky2Var2 = objectVolatile == null ? o70.s : o70.p;
                do {
                    unsafe2 = qr.g;
                    if (unsafe2.compareAndSwapObject(this, u, objectVolatile, ky2Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                ue5.f(1, objectVolatile);
                ((xy1) objectVolatile).a(w());
                return z3;
            }
        }
        return z3;
    }

    @Override // defpackage.yc0
    public final Object p() {
        md0 md0Var;
        Unsafe unsafe = qr.g;
        long longVolatile = unsafe.getLongVolatile(this, o);
        long longVolatile2 = unsafe.getLongVolatile(this, k);
        if (f(longVolatile2, true)) {
            return new jd0(w());
        }
        long j = longVolatile2 & 1152921504606846975L;
        kd0 kd0Var = ld0.y;
        if (longVolatile >= j) {
            return kd0Var;
        }
        Object obj = o70.m;
        md0 md0Var2 = (md0) unsafe.getObjectVolatile(this, h);
        while (!this.k()) {
            long andIncrement = a.getAndIncrement(this);
            long j2 = o70.y;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (md0Var2.m != j3) {
                md0 md0VarA = this.a(j3, md0Var2);
                if (md0VarA == null) {
                    continue;
                } else {
                    md0Var = md0VarA;
                }
            } else {
                md0Var = md0Var2;
            }
            m70 m70Var = this;
            Object objK = m70Var.K(md0Var, i2, andIncrement, obj);
            md0Var2 = md0Var;
            if (objK == o70.w) {
                an5 an5Var = obj instanceof an5 ? (an5) obj : null;
                if (an5Var != null) {
                    an5Var.g(md0Var2, i2);
                }
                m70Var.N(andIncrement);
                md0Var2.t();
                return kd0Var;
            }
            if (objK != o70.i) {
                if (objK != o70.c) {
                    md0Var2.g();
                    return objK;
                }
                l0.z("unexpected");
                return null;
            }
            if (andIncrement < m70Var.u()) {
                md0Var2.g();
            }
            this = m70Var;
        }
        return new jd0(this.w());
    }

    public final long q() {
        return qr.g.getLongVolatile(this, s);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0162  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[RETURN] */
    @Override // defpackage.wj4
    public Object r(mu0 mu0Var, Object obj) {
        og5 og5Var;
        Object objZ;
        px0 px0Var;
        int i2;
        m70 m70Var = this;
        Unsafe unsafe = qr.g;
        long j = f;
        md0 md0Var = (md0) unsafe.getObjectVolatile(m70Var, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = t;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(m70Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zF = m70Var.f(andIncrement, false);
            int i3 = o70.y;
            long j3 = i3;
            long j4 = j2 / j3;
            int i4 = (int) (j2 % j3);
            long j5 = md0Var.m;
            px0 px0Var2 = px0.j;
            og5Var = og5.g;
            if (j5 != j4) {
                md0 md0VarM = m70Var.m(j4, md0Var);
                if (md0VarM != null) {
                    md0Var = md0VarM;
                } else if (zF) {
                    Object objD = D(mu0Var, obj);
                    if (objD == px0Var2) {
                        return objD;
                    }
                }
            }
            int iL = m70Var.L(md0Var, i4, obj, j2, null, zF);
            if (iL == 0) {
                md0Var.g();
                return og5Var;
            }
            if (iL != 1) {
                if (iL == 2) {
                    if (!zF) {
                        break;
                    }
                    md0Var.t();
                    Object objD2 = D(mu0Var, obj);
                    if (objD2 == px0Var2) {
                        return objD2;
                    }
                } else if (iL == 3) {
                    ib0 ib0VarI = gp4.I(pw5.o(mu0Var));
                    try {
                        int iL2 = L(md0Var, i4, obj, j2, ib0VarI, false);
                        if (iL2 != 0) {
                            if (iL2 == 1) {
                                px0Var2 = px0Var2;
                                ib0VarI.j(og5Var);
                            } else if (iL2 != 2) {
                                if (iL2 != 4) {
                                    String str = "unexpected";
                                    if (iL2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    md0Var.g();
                                    md0 md0Var2 = (md0) qr.g.getObjectVolatile(this, j);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean zF2 = f(andIncrement2, false);
                                        int i5 = o70.y;
                                        atomicLongFieldUpdater = atomicLongFieldUpdater;
                                        long j7 = i5;
                                        px0Var2 = px0Var2;
                                        long j8 = j6 / j7;
                                        int i6 = (int) (j6 % j7);
                                        if (md0Var2.m != j8) {
                                            md0 md0VarM2 = m(j8, md0Var2);
                                            if (md0VarM2 != null) {
                                                i2 = i6;
                                                md0Var2 = md0VarM2;
                                            } else if (zF2) {
                                            }
                                        } else {
                                            i2 = i6;
                                        }
                                        int iL3 = L(md0Var2, i2, obj, j6, ib0VarI, zF2);
                                        if (iL3 == 0) {
                                            md0Var2.g();
                                        } else if (iL3 != 1) {
                                            if (iL3 == 2) {
                                                if (!zF2) {
                                                    ib0VarI.g(md0Var2, i2 + i5);
                                                    break;
                                                }
                                                md0Var2.t();
                                            } else {
                                                if (iL3 == 3) {
                                                    throw new IllegalStateException(str);
                                                }
                                                if (iL3 != 4) {
                                                    if (iL3 == 5) {
                                                        md0Var2.g();
                                                    }
                                                    str = str;
                                                } else if (j6 < b()) {
                                                    md0Var2.g();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    px0Var2 = px0Var2;
                                    if (j2 < b()) {
                                        md0Var.g();
                                    }
                                }
                                E(obj, ib0VarI);
                                break;
                            } else {
                                px0Var2 = px0Var2;
                                ib0VarI.g(md0Var, i4 + i3);
                            }
                            objZ = ib0VarI.z();
                            px0Var = px0Var2;
                            if (objZ != px0Var) {
                                objZ = og5Var;
                            }
                            if (objZ == px0Var) {
                                return objZ;
                            }
                        } else {
                            px0Var2 = px0Var2;
                            md0Var.g();
                        }
                        ib0VarI.j(og5Var);
                        objZ = ib0VarI.z();
                        px0Var = px0Var2;
                        if (objZ != px0Var) {
                            objZ = og5Var;
                        }
                        if (objZ == px0Var) {
                            return objZ;
                        }
                    } catch (Throwable th) {
                        ib0VarI.C();
                        throw th;
                    }
                } else if (iL != 4) {
                    if (iL == 5) {
                        md0Var.g();
                    }
                    m70Var = this;
                } else {
                    if (j2 < b()) {
                        md0Var.g();
                    }
                    Object objD3 = D(mu0Var, obj);
                    if (objD3 == px0Var2) {
                        return objD3;
                    }
                }
            } else {
                break;
            }
        }
        return og5Var;
    }

    public final Throwable s() {
        Throwable thW = w();
        return thW == null ? new mi0("Channel was closed") : thW;
    }

    public final void t() {
        long j;
        Object objP;
        if (B()) {
            return;
        }
        Unsafe unsafe = qr.g;
        long j2 = p;
        md0 md0Var = (md0) unsafe.getObjectVolatile(this, j2);
        while (true) {
            long andIncrement = m.getAndIncrement(this);
            long j3 = andIncrement / ((long) o70.y);
            if (u() <= andIncrement) {
                if (md0Var.m < j3 && md0Var.r() != null) {
                    C(j3, md0Var);
                }
                h(1L);
                return;
            }
            if (md0Var.m != j3) {
                n70 n70Var = n70.i;
                while (true) {
                    objP = v70.p(md0Var, j3, n70Var);
                    if (zq2.h(objP)) {
                        j = j2;
                        break;
                    }
                    nh4 nh4VarU = zq2.u(objP);
                    while (true) {
                        nh4 nh4Var = (nh4) qr.g.getObjectVolatile(this, j2);
                        j = j2;
                        if (nh4Var.m >= nh4VarU.m) {
                            break;
                        }
                        if (!nh4VarU.a()) {
                            break;
                        }
                        if (fj.b(this, nh4Var, nh4VarU)) {
                            if (!nh4Var.x()) {
                                break;
                            }
                            nh4Var.v();
                            break;
                        } else {
                            if (nh4VarU.x()) {
                                nh4VarU.v();
                            }
                            j2 = j;
                        }
                    }
                    j2 = j;
                }
                md0 md0Var2 = null;
                if (zq2.h(objP)) {
                    d();
                    C(j3, md0Var);
                    h(1L);
                } else {
                    md0 md0Var3 = (md0) zq2.u(objP);
                    long j4 = md0Var3.m;
                    if (j4 > j3) {
                        long j5 = ((long) o70.y) * j4;
                        if (qr.g.compareAndSwapLong(this, s, 1 + andIncrement, j5)) {
                            h(j5 - andIncrement);
                        } else {
                            h(1L);
                        }
                    } else {
                        md0Var2 = md0Var3;
                    }
                }
                if (md0Var2 == null) {
                    continue;
                } else {
                    md0Var = md0Var2;
                }
                j2 = j;
            } else {
                j = j2;
            }
            int i2 = (int) (andIncrement % ((long) o70.y));
            Object objQ = md0Var.q(i2);
            boolean z2 = objQ instanceof an5;
            long j6 = o;
            if (!z2 || andIncrement < qr.g.getLongVolatile(this, j6) || !md0Var.m(i2, objQ, o70.l)) {
                while (true) {
                    Object objQ2 = md0Var.q(i2);
                    if (objQ2 instanceof an5) {
                        if (andIncrement < qr.g.getLongVolatile(this, j6)) {
                            if (md0Var.m(i2, objQ2, new bn5((an5) objQ2))) {
                                h(1L);
                                return;
                            }
                        } else if (md0Var.m(i2, objQ2, o70.l)) {
                            if (!J(objQ2, md0Var, i2)) {
                                md0Var.i(i2, o70.a);
                                md0Var.t();
                                break;
                            } else {
                                md0Var.i(i2, o70.n);
                                h(1L);
                                return;
                            }
                        }
                    } else {
                        if (objQ2 == o70.a) {
                            break;
                        }
                        if (objQ2 == null) {
                            if (md0Var.m(i2, objQ2, o70.v)) {
                                h(1L);
                                return;
                            }
                        } else if (objQ2 == o70.n || objQ2 == o70.j || objQ2 == o70.t || objQ2 == o70.m || objQ2 == o70.q) {
                            h(1L);
                            return;
                        } else if (objQ2 != o70.x) {
                            l0.b(objQ2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                h(1L);
            } else if (J(objQ, md0Var, i2)) {
                md0Var.i(i2, o70.n);
                h(1L);
                return;
            } else {
                md0Var.i(i2, o70.a);
                md0Var.t();
                h(1L);
            }
            j2 = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = qr.g;
        int longVolatile = (int) (unsafe.getLongVolatile(this, k) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.j + ',');
        sb.append("data=[");
        int i2 = 0;
        boolean z2 = true;
        List listD = pw5.d(unsafe.getObjectVolatile(this, h), unsafe.getObjectVolatile(this, f), unsafe.getObjectVolatile(this, p));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((md0) obj) != o70.g) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            uo1.b();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((md0) next).m;
            do {
                Object next2 = it.next();
                long j2 = ((md0) next2).m;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        md0 md0Var = (md0) next;
        long jB = b();
        long jU = u();
        loop2: while (true) {
            int i3 = o70.y;
            int i4 = i2;
            while (i4 < i3) {
                str = null;
                long j3 = (md0Var.m * ((long) o70.y)) + ((long) i4);
                if (j3 >= jU && j3 >= jB) {
                    break loop2;
                }
                Object objQ = md0Var.q(i4);
                boolean z3 = z2;
                Object obj2 = md0Var.i.get(i4 * 2);
                if (objQ instanceof hb0) {
                    string = (jU > j3 || j3 >= jB) ? (jB > j3 || j3 >= jU) ? "cont" : "send" : "receive";
                } else if (objQ instanceof zh4) {
                    string = (jU > j3 || j3 >= jB) ? (jB > j3 || j3 >= jU) ? "select" : "onSend" : "onReceive";
                } else if (objQ instanceof s34) {
                    string = "receiveCatching";
                } else if (objQ instanceof bn5) {
                    string = "EB(" + objQ + ')';
                } else if (yf2.p(objQ, o70.x) || yf2.p(objQ, o70.l)) {
                    string = "resuming_sender";
                } else {
                    if (objQ != null && !objQ.equals(o70.v) && !objQ.equals(o70.t) && !objQ.equals(o70.j) && !objQ.equals(o70.m) && !objQ.equals(o70.a) && !objQ.equals(o70.q)) {
                        string = objQ.toString();
                    }
                    i4++;
                    z2 = z3;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i4++;
                z2 = z3;
            }
            boolean z4 = z2;
            str = null;
            md0Var = (md0) md0Var.r();
            if (md0Var == null) {
                break;
            }
            z2 = z4;
            i2 = 0;
        }
        if (sb.length() == 0) {
            l0.s("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final long u() {
        return qr.g.getLongVolatile(this, k) & 1152921504606846975L;
    }

    public final md0 v(long j) {
        np0 np0Var;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = qr.g;
        Object objectVolatile = unsafe2.getObjectVolatile(this, p);
        md0 md0Var = (md0) unsafe2.getObjectVolatile(this, f);
        if (md0Var.m > ((md0) objectVolatile).m) {
            objectVolatile = md0Var;
        }
        md0 md0Var2 = (md0) unsafe2.getObjectVolatile(this, h);
        if (md0Var2.m > ((md0) objectVolatile).m) {
            objectVolatile = md0Var2;
        }
        np0 np0Var2 = (np0) objectVolatile;
        loop0: while (true) {
            np0Var = np0Var2;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = np0.j;
                np0Var.getClass();
                Object objectVolatile2 = qr.g.getObjectVolatile(np0Var, np0.t);
                ky2 ky2Var = v70.t;
                if (objectVolatile2 == ky2Var) {
                    break loop0;
                }
                np0Var2 = (np0) objectVolatile2;
                if (np0Var2 == null) {
                    do {
                        unsafe = qr.g;
                        j3 = np0.t;
                        if (unsafe.compareAndSwapObject(np0Var, j3, (Object) null, ky2Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(np0Var, j3) == null);
                }
            }
        }
        md0 md0Var3 = (md0) np0Var;
        if (A()) {
            md0 md0Var4 = md0Var3;
            loop3: while (true) {
                int i2 = o70.y - 1;
                while (true) {
                    if (-1 < i2) {
                        j2 = (md0Var4.m * ((long) o70.y)) + ((long) i2);
                        if (j2 >= b()) {
                            while (true) {
                                Object objQ = md0Var4.q(i2);
                                if (objQ != null && objQ != o70.v) {
                                    if (objQ != o70.n) {
                                        break;
                                    }
                                    break loop3;
                                }
                                if (md0Var4.m(i2, objQ, o70.q)) {
                                    md0Var4.t();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        md0Var4 = (md0) ((np0) qr.g.getObjectVolatile(md0Var4, np0.a));
                        if (md0Var4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                j(j2);
            }
        }
        Object objD = null;
        loop6: for (md0 md0Var5 = md0Var3; md0Var5 != null; md0Var5 = (md0) ((np0) qr.g.getObjectVolatile(md0Var5, np0.a))) {
            for (int i3 = o70.y - 1; -1 < i3; i3--) {
                if ((md0Var5.m * ((long) o70.y)) + ((long) i3) < j) {
                    break loop6;
                }
                while (true) {
                    Object objQ2 = md0Var5.q(i3);
                    if (objQ2 != null && objQ2 != o70.v) {
                        if (!(objQ2 instanceof bn5)) {
                            if (!(objQ2 instanceof an5)) {
                                break;
                            }
                            if (md0Var5.m(i3, objQ2, o70.q)) {
                                objD = a11.d(objD, objQ2);
                                md0Var5.w(i3, true);
                                break;
                            }
                        } else {
                            if (md0Var5.m(i3, objQ2, o70.q)) {
                                objD = a11.d(objD, ((bn5) objQ2).g);
                                md0Var5.w(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (md0Var5.m(i3, objQ2, o70.q)) {
                            md0Var5.t();
                            break;
                        }
                    }
                }
            }
        }
        if (objD != null) {
            if (!(objD instanceof ArrayList)) {
                H((an5) objD, true);
                return md0Var3;
            }
            ArrayList arrayList = (ArrayList) objD;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                H((an5) arrayList.get(size), true);
            }
        }
        return md0Var3;
    }

    public final Throwable w() {
        return (Throwable) qr.g.getObjectVolatile(this, b);
    }

    @Override // defpackage.yc0
    public final void x(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        n(cancellationException, true);
    }

    public final boolean y(long j) {
        return j < q() || j < b() + ((long) this.j);
    }

    @Override // defpackage.wj4
    public Object z(Object obj) {
        m70 m70Var = this;
        Unsafe unsafe = qr.g;
        long longVolatile = unsafe.getLongVolatile(m70Var, k);
        long j = 1152921504606846975L;
        boolean z2 = m70Var.f(longVolatile, false) ? false : !m70Var.y(longVolatile & 1152921504606846975L);
        kd0 kd0Var = ld0.y;
        if (z2) {
            return kd0Var;
        }
        Object obj2 = o70.a;
        md0 md0Var = (md0) unsafe.getObjectVolatile(m70Var, f);
        while (true) {
            long andIncrement = t.getAndIncrement(m70Var);
            long j2 = andIncrement & j;
            boolean zF = m70Var.f(andIncrement, false);
            int i2 = o70.y;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (md0Var.m != j4) {
                md0 md0VarM = m70Var.m(j4, md0Var);
                if (md0VarM != null) {
                    md0Var = md0VarM;
                } else {
                    if (zF) {
                        return new jd0(m70Var.s());
                    }
                    j = 1152921504606846975L;
                }
            }
            int iL = m70Var.L(md0Var, i3, obj, j2, obj2, zF);
            og5 og5Var = og5.g;
            if (iL == 0) {
                md0Var.g();
                return og5Var;
            }
            if (iL == 1) {
                return og5Var;
            }
            if (iL == 2) {
                if (zF) {
                    md0Var.t();
                    return new jd0(s());
                }
                an5 an5Var = obj2 instanceof an5 ? (an5) obj2 : null;
                if (an5Var != null) {
                    an5Var.g(md0Var, i3 + i2);
                }
                md0Var.t();
                return kd0Var;
            }
            if (iL == 3) {
                l0.z("unexpected");
                return null;
            }
            if (iL == 4) {
                if (j2 < b()) {
                    md0Var.g();
                }
                return new jd0(s());
            }
            if (iL == 5) {
                md0Var.g();
            }
            j = 1152921504606846975L;
            m70Var = this;
        }
    }
}
