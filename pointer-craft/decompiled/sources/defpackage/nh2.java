package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class nh2 implements dh2 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(nh2.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long t;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = qr.g;
        a = unsafe.objectFieldOffset(nh2.class.getDeclaredField("_state$volatile"));
        t = unsafe.objectFieldOffset(nh2.class.getDeclaredField("_parentHandle$volatile"));
    }

    public nh2(boolean z) {
        this._state$volatile = z ? gp4.k : gp4.f;
    }

    public static ce0 i0(yx2 yx2Var) {
        while (yx2Var.m()) {
            yx2Var = yx2Var.a();
        }
        while (true) {
            yx2Var = yx2Var.t();
            if (!yx2Var.m()) {
                if (yx2Var instanceof ce0) {
                    return (ce0) yx2Var;
                }
                if (yx2Var instanceof ih3) {
                    return null;
                }
            }
        }
    }

    public static String o0(Object obj) {
        if (!(obj instanceof lh2)) {
            if (obj instanceof wa2) {
                return ((wa2) obj).y() ? "Active" : "New";
            }
            return obj instanceof hl0 ? "Cancelled" : "Completed";
        }
        lh2 lh2Var = (lh2) obj;
        if (lh2Var.v()) {
            return "Cancelling";
        }
        return lh2Var.x() ? "Completing" : "Active";
    }

    @Override // defpackage.dh2
    public final ya1 A(xy1 xy1Var) {
        return c0(true, new qg2(xy1Var));
    }

    @Override // defpackage.dh2
    public final ya1 D(boolean z, boolean z2, fd fdVar) {
        return c0(z2, z ? new pg2(fdVar) : new qg2(fdVar));
    }

    @Override // defpackage.fx0
    public final fx0 E(ex0 ex0Var) {
        return a11.f(this, ex0Var);
    }

    public void G(Object obj) {
        B(obj);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:82:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:82:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:82:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7 A[LOOP:2: B:53:0x00ae->B:60:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean J(Object obj) {
        nh2 nh2Var;
        Throwable thR;
        Object objY;
        Throwable thR2;
        ky2 ky2Var;
        Object objP0;
        wa2 wa2Var;
        ih3 ih3VarX;
        lh2 lh2Var;
        Unsafe unsafe;
        long j2;
        Object objP1 = gp4.p;
        if (W()) {
            do {
                Object objY2 = Y();
                if (!(objY2 instanceof wa2) || ((objY2 instanceof lh2) && ((lh2) objY2).x())) {
                    objP1 = gp4.p;
                    break;
                }
                objP1 = p0(objY2, new hl0(R(obj), false));
            } while (objP1 == gp4.z);
            if (objP1 != gp4.u) {
                if (objP1 == gp4.p) {
                    thR = null;
                    loop1: while (true) {
                        objY = this.Y();
                        if (objY instanceof lh2) {
                            if (objY instanceof wa2) {
                                if (thR == null) {
                                    thR = this.R(obj);
                                }
                                wa2Var = (wa2) objY;
                                if (wa2Var.y()) {
                                    ih3VarX = this.X(wa2Var);
                                    if (ih3VarX == null) {
                                        nh2Var = this;
                                    } else {
                                        lh2Var = new lh2(ih3VarX, thR);
                                        while (true) {
                                            unsafe = qr.g;
                                            j2 = a;
                                            nh2Var = this;
                                            if (unsafe.compareAndSwapObject(nh2Var, j2, wa2Var, lh2Var)) {
                                                nh2Var.j0(ih3VarX, thR);
                                                objP0 = gp4.p;
                                            } else if (unsafe.getObjectVolatile(nh2Var, j2) != wa2Var) {
                                                this = nh2Var;
                                            }
                                        }
                                    }
                                    this = nh2Var;
                                } else {
                                    nh2Var = this;
                                    objP0 = nh2Var.p0(objY, new hl0(thR, false));
                                    if (objP0 != gp4.p) {
                                        l0.b(objY, "Cannot happen in ");
                                        return false;
                                    }
                                    if (objP0 != gp4.z) {
                                        this = nh2Var;
                                    }
                                }
                            } else {
                                nh2Var = this;
                                objP0 = gp4.h;
                            }
                            objP1 = objP0;
                            break;
                        }
                        synchronized (objY) {
                            if (qr.g.getObjectVolatile((lh2) objY, lh2.t) == gp4.o) {
                                ky2Var = gp4.h;
                            } else {
                                boolean zV = ((lh2) objY).v();
                                if (thR == null) {
                                    thR = this.R(obj);
                                }
                                ((lh2) objY).g(thR);
                                thR2 = zV ? null : ((lh2) objY).r();
                                if (thR2 != null) {
                                    this.j0(((lh2) objY).j, thR2);
                                }
                                ky2Var = gp4.p;
                            }
                        }
                        nh2Var = this;
                        objP1 = ky2Var;
                        break;
                    }
                }
                nh2Var = this;
                if (objP1 != gp4.p && objP1 != gp4.u) {
                    if (objP1 == gp4.h) {
                        return false;
                    }
                    nh2Var.B(objP1);
                    return true;
                }
            }
        } else {
            if (objP1 == gp4.p) {
                thR = null;
                loop1: while (true) {
                    objY = this.Y();
                    if (objY instanceof lh2) {
                        if (objY instanceof wa2) {
                            if (thR == null) {
                                thR = this.R(obj);
                            }
                            wa2Var = (wa2) objY;
                            if (wa2Var.y()) {
                                ih3VarX = this.X(wa2Var);
                                if (ih3VarX == null) {
                                    nh2Var = this;
                                } else {
                                    lh2Var = new lh2(ih3VarX, thR);
                                    while (true) {
                                        unsafe = qr.g;
                                        j2 = a;
                                        nh2Var = this;
                                        if (unsafe.compareAndSwapObject(nh2Var, j2, wa2Var, lh2Var)) {
                                            nh2Var.j0(ih3VarX, thR);
                                            objP0 = gp4.p;
                                        } else if (unsafe.getObjectVolatile(nh2Var, j2) != wa2Var) {
                                            this = nh2Var;
                                        }
                                    }
                                }
                                this = nh2Var;
                            } else {
                                nh2Var = this;
                                objP0 = nh2Var.p0(objY, new hl0(thR, false));
                                if (objP0 != gp4.p) {
                                    l0.b(objY, "Cannot happen in ");
                                    return false;
                                }
                                if (objP0 != gp4.z) {
                                    this = nh2Var;
                                }
                            }
                        } else {
                            nh2Var = this;
                            objP0 = gp4.h;
                        }
                        objP1 = objP0;
                        break;
                    }
                    synchronized (objY) {
                        if (qr.g.getObjectVolatile((lh2) objY, lh2.t) == gp4.o) {
                            ky2Var = gp4.h;
                        } else {
                            boolean zV2 = ((lh2) objY).v();
                            if (thR == null) {
                                thR = this.R(obj);
                            }
                            ((lh2) objY).g(thR);
                            if (zV2) {
                            }
                            if (thR2 != null) {
                                this.j0(((lh2) objY).j, thR2);
                            }
                            ky2Var = gp4.p;
                        }
                        nh2Var = this;
                        objP1 = ky2Var;
                        break;
                    }
                }
            }
            nh2Var = this;
            if (objP1 != gp4.p) {
                if (objP1 == gp4.h) {
                    return false;
                }
                nh2Var.B(objP1);
                return true;
            }
        }
        return true;
    }

    public void K(CancellationException cancellationException) {
        J(cancellationException);
    }

    @Override // defpackage.dh2
    public final Object M(ou0 ou0Var) {
        Object objY;
        og5 og5Var;
        do {
            objY = Y();
            boolean z = objY instanceof wa2;
            og5Var = og5.g;
            if (!z) {
                v70.s(ou0Var.v());
                return og5Var;
            }
        } while (n0(objY) < 0);
        ib0 ib0Var = new ib0(1, pw5.o(ou0Var));
        ib0Var.o();
        ib0Var.d(new bb0(v70.A(this, new j84(ib0Var)), (byte) 1));
        Object objZ = ib0Var.z();
        px0 px0Var = px0.j;
        if (objZ != px0Var) {
            objZ = og5Var;
        }
        return objZ == px0Var ? objZ : og5Var;
    }

    public final boolean N(Throwable th) {
        if (e0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        be0 be0Var = (be0) qr.g.getObjectVolatile(this, t);
        if (be0Var == null || be0Var == nh3.j) {
            return z;
        }
        return be0Var.r(th) || z;
    }

    public String O() {
        return "Job was cancelled";
    }

    public boolean P(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return J(th) && V();
    }

    public final void Q(wa2 wa2Var, Object obj) {
        Unsafe unsafe = qr.g;
        long j2 = t;
        be0 be0Var = (be0) unsafe.getObjectVolatile(this, j2);
        if (be0Var != null) {
            be0Var.g();
            unsafe.putObjectVolatile(this, j2, nh3.j);
        }
        il0 il0Var = null;
        hl0 hl0Var = obj instanceof hl0 ? (hl0) obj : null;
        Throwable th = hl0Var != null ? hl0Var.g : null;
        if (wa2Var instanceof ih2) {
            try {
                ((ih2) wa2Var).c(th);
                return;
            } catch (Throwable th2) {
                a0(new il0("Exception in completion handler " + wa2Var + " for " + this, th2));
                return;
            }
        }
        ih3 ih3VarN = wa2Var.n();
        if (ih3VarN != null) {
            ih3VarN.v(new vv2(1), 1);
            Object objJ = ih3VarN.j();
            objJ.getClass();
            for (yx2 yx2VarT = (yx2) objJ; !yx2VarT.equals(ih3VarN); yx2VarT = yx2VarT.t()) {
                if (yx2VarT instanceof ih2) {
                    try {
                        ((ih2) yx2VarT).c(th);
                    } catch (Throwable th3) {
                        if (il0Var != null) {
                            kf6.g(il0Var, th3);
                        } else {
                            il0Var = new il0("Exception in completion handler " + yx2VarT + " for " + this, th3);
                        }
                    }
                }
            }
            if (il0Var != null) {
                a0(il0Var);
            }
        }
    }

    public final Throwable R(Object obj) {
        Throwable thR;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        nh2 nh2Var = (nh2) obj;
        Object objY = nh2Var.Y();
        if (objY instanceof lh2) {
            thR = ((lh2) objY).r();
        } else if (objY instanceof hl0) {
            thR = ((hl0) objY).g;
        } else {
            if (objY instanceof wa2) {
                l0.b(objY, "Cannot be cancelling child in this state: ");
                return null;
            }
            thR = null;
        }
        CancellationException cancellationException = thR instanceof CancellationException ? (CancellationException) thR : null;
        return cancellationException == null ? new eh2("Parent job is ".concat(o0(objY)), thR, nh2Var) : cancellationException;
    }

    public final Object S(lh2 lh2Var, Object obj) throws Throwable {
        Throwable th;
        nh2 nh2Var;
        lh2 lh2Var2;
        hl0 hl0Var = obj instanceof hl0 ? (hl0) obj : null;
        Throwable th2 = hl0Var != null ? hl0Var.g : null;
        synchronized (lh2Var) {
            try {
                lh2Var.v();
                ArrayList arrayListL = lh2Var.l(th2);
                Throwable thU = U(lh2Var, arrayListL);
                if (thU != null) {
                    try {
                        if (arrayListL.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListL.size()));
                            int size = arrayListL.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListL.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thU && th3 != thU && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    kf6.g(thU, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thU != null && thU != th2) {
                    obj = new hl0(thU, false);
                }
                if (thU != null && (N(thU) || Z(thU))) {
                    obj.getClass();
                    qr.g.compareAndSwapInt((hl0) obj, hl0.y, 0, 1);
                }
                k0(obj);
                Object xa2Var = obj instanceof wa2 ? new xa2((wa2) obj) : obj;
                while (true) {
                    Unsafe unsafe = qr.g;
                    long j2 = a;
                    nh2Var = this;
                    lh2Var2 = lh2Var;
                    if (unsafe.compareAndSwapObject(nh2Var, j2, lh2Var2, xa2Var) || unsafe.getObjectVolatile(nh2Var, j2) != lh2Var2) {
                        break;
                    }
                    this = nh2Var;
                    lh2Var = lh2Var2;
                }
                nh2Var.Q(lh2Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Object T() throws Throwable {
        Object objY = Y();
        if (objY instanceof wa2) {
            l0.z("This job has not completed yet");
            return null;
        }
        if (objY instanceof hl0) {
            throw ((hl0) objY).g;
        }
        return gp4.V(objY);
    }

    public final Throwable U(lh2 lh2Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (lh2Var.v()) {
                return new eh2(O(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof n95) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof n95)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean V() {
        return true;
    }

    public boolean W() {
        return this instanceof el0;
    }

    public final ih3 X(wa2 wa2Var) {
        ih3 ih3VarN = wa2Var.n();
        if (ih3VarN != null) {
            return ih3VarN;
        }
        if (wa2Var instanceof ji1) {
            return new ih3();
        }
        if (wa2Var instanceof ih2) {
            m0((ih2) wa2Var);
            return null;
        }
        l0.b(wa2Var, "State should have list: ");
        return null;
    }

    public final Object Y() {
        return qr.g.getObjectVolatile(this, a);
    }

    public boolean Z(Throwable th) {
        return false;
    }

    public Object a() {
        return T();
    }

    @Override // defpackage.fx0
    public final fx0 b(fx0 fx0Var) {
        return a11.k(this, fx0Var);
    }

    public final void b0(dh2 dh2Var) {
        long j2 = t;
        nh3 nh3Var = nh3.j;
        if (dh2Var == null) {
            qr.g.putObjectVolatile(this, j2, nh3Var);
            return;
        }
        dh2Var.start();
        be0 be0VarI = dh2Var.i(this);
        Unsafe unsafe = qr.g;
        unsafe.putObjectVolatile(this, j2, be0VarI);
        if (d0()) {
            be0VarI.g();
            unsafe.putObjectVolatile(this, j2, nh3Var);
        }
    }

    public final ya1 c0(boolean z, ih2 ih2Var) {
        ih2 ih2Var2;
        nh2 nh2Var;
        boolean zV;
        wa2 va2Var;
        ih2Var.m = this;
        loop0: while (true) {
            Object objY = this.Y();
            if (!(objY instanceof ji1)) {
                ih2Var2 = ih2Var;
                nh2Var = this;
                boolean z2 = objY instanceof wa2;
                nh3 nh3Var = nh3.j;
                if (z2) {
                    wa2 wa2Var = (wa2) objY;
                    ih3 ih3VarN = wa2Var.n();
                    if (ih3VarN == null) {
                        nh2Var.m0((ih2) objY);
                    } else {
                        if (ih2Var2.w()) {
                            lh2 lh2Var = wa2Var instanceof lh2 ? (lh2) wa2Var : null;
                            Throwable thR = lh2Var != null ? lh2Var.r() : null;
                            if (thR == null) {
                                zV = ih3VarN.v(ih2Var2, 5);
                            } else if (z) {
                                ih2Var2.c(thR);
                                return nh3Var;
                            }
                        } else {
                            zV = ih3VarN.v(ih2Var2, 1);
                        }
                        if (zV) {
                            break;
                        }
                    }
                    this = nh2Var;
                    ih2Var = ih2Var2;
                } else if (z) {
                    Object objY2 = nh2Var.Y();
                    hl0 hl0Var = objY2 instanceof hl0 ? (hl0) objY2 : null;
                    ih2Var2.c(hl0Var != null ? hl0Var.g : null);
                }
                return nh3Var;
            }
            ji1 ji1Var = (ji1) objY;
            boolean z3 = ji1Var.j;
            if (z3) {
                while (true) {
                    Unsafe unsafe = qr.g;
                    long j2 = a;
                    nh2 nh2Var2 = this;
                    ih2Var2 = ih2Var;
                    nh2Var = nh2Var2;
                    if (unsafe.compareAndSwapObject(nh2Var2, j2, objY, ih2Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(nh2Var, j2) != objY) {
                        break;
                    }
                    this = nh2Var;
                    ih2Var = ih2Var2;
                }
            } else {
                ih2Var2 = ih2Var;
                nh2Var = this;
                ih3 ih3Var = new ih3();
                if (!z3) {
                    va2Var = ih3Var;
                    va2Var = new va2(ih3Var);
                }
                va2Var = ih3Var;
                fj.a(nh2Var, ji1Var, va2Var);
            }
            this = nh2Var;
            ih2Var = ih2Var2;
        }
        return ih2Var2;
    }

    @Override // defpackage.fx0
    public final Object d(bz1 bz1Var, Object obj) {
        return bz1Var.l(obj, this);
    }

    public final boolean d0() {
        return !(Y() instanceof wa2);
    }

    public boolean e0() {
        return this instanceof q30;
    }

    public final boolean f0(Object obj) {
        Object objP0;
        do {
            objP0 = p0(Y(), obj);
            if (objP0 == gp4.p) {
                return false;
            }
            if (objP0 == gp4.u) {
                return true;
            }
        } while (objP0 == gp4.z);
        B(objP0);
        return true;
    }

    public final Object g0(Object obj) {
        Object objP0;
        do {
            objP0 = p0(Y(), obj);
            if (objP0 == gp4.p) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                hl0 hl0Var = obj instanceof hl0 ? (hl0) obj : null;
                throw new IllegalStateException(str, hl0Var != null ? hl0Var.g : null);
            }
        } while (objP0 == gp4.z);
        return objP0;
    }

    @Override // defpackage.dx0
    public final ex0 getKey() {
        return d52.m;
    }

    @Override // defpackage.fx0
    public final dx0 h(ex0 ex0Var) {
        return a11.p(this, ex0Var);
    }

    public String h0() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.dh2
    public final be0 i(nh2 nh2Var) {
        nh2 nh2Var2;
        wa2 va2Var;
        ce0 ce0Var = new ce0(nh2Var);
        ce0Var.m = this;
        loop0: while (true) {
            Object objY = this.Y();
            if (objY instanceof ji1) {
                ji1 ji1Var = (ji1) objY;
                boolean z = ji1Var.j;
                if (z) {
                    while (true) {
                        Unsafe unsafe = qr.g;
                        long j2 = a;
                        nh2Var2 = this;
                        if (unsafe.compareAndSwapObject(nh2Var2, j2, objY, ce0Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(nh2Var2, j2) != objY) {
                            break;
                        }
                        this = nh2Var2;
                    }
                } else {
                    nh2Var2 = this;
                    ih3 ih3Var = new ih3();
                    if (!z) {
                        va2Var = ih3Var;
                        va2Var = new va2(ih3Var);
                    }
                    va2Var = ih3Var;
                    fj.a(nh2Var2, ji1Var, va2Var);
                }
                this = nh2Var2;
            } else {
                nh2Var2 = this;
                boolean z2 = objY instanceof wa2;
                nh3 nh3Var = nh3.j;
                Throwable thR = null;
                if (!z2) {
                    Object objY2 = nh2Var2.Y();
                    hl0 hl0Var = objY2 instanceof hl0 ? (hl0) objY2 : null;
                    ce0Var.c(hl0Var != null ? hl0Var.g : null);
                    return nh3Var;
                }
                ih3 ih3VarN = ((wa2) objY).n();
                if (ih3VarN != null) {
                    if (ih3VarN.v(ce0Var, 7)) {
                        break;
                    }
                    boolean zV = ih3VarN.v(ce0Var, 3);
                    Object objY3 = nh2Var2.Y();
                    if (objY3 instanceof lh2) {
                        thR = ((lh2) objY3).r();
                    } else {
                        hl0 hl0Var2 = objY3 instanceof hl0 ? (hl0) objY3 : null;
                        if (hl0Var2 != null) {
                            thR = hl0Var2.g;
                        }
                    }
                    ce0Var.c(thR);
                    if (zV) {
                        break;
                    }
                    return nh3Var;
                }
                nh2Var2.m0((ih2) objY);
                this = nh2Var2;
            }
        }
        return ce0Var;
    }

    @Override // defpackage.dh2
    public final boolean isCancelled() {
        Object objY = Y();
        if (objY instanceof hl0) {
            return true;
        }
        return (objY instanceof lh2) && ((lh2) objY).v();
    }

    public final void j0(ih3 ih3Var, Throwable th) {
        ih3Var.v(new vv2(4), 4);
        Object objJ = ih3Var.j();
        objJ.getClass();
        il0 il0Var = null;
        for (yx2 yx2VarT = (yx2) objJ; !yx2VarT.equals(ih3Var); yx2VarT = yx2VarT.t()) {
            if ((yx2VarT instanceof ih2) && ((ih2) yx2VarT).w()) {
                try {
                    ((ih2) yx2VarT).c(th);
                } catch (Throwable th2) {
                    if (il0Var != null) {
                        kf6.g(il0Var, th2);
                    } else {
                        il0Var = new il0("Exception in completion handler " + yx2VarT + " for " + this, th2);
                    }
                }
            }
        }
        if (il0Var != null) {
            a0(il0Var);
        }
        N(th);
    }

    @Override // defpackage.dh2
    public final CancellationException k() {
        CancellationException cancellationException;
        Object objY = Y();
        if (objY instanceof lh2) {
            Throwable thR = ((lh2) objY).r();
            if (thR == null) {
                l0.b(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thR instanceof CancellationException ? (CancellationException) thR : null;
            return cancellationException == null ? new eh2(strConcat, thR, this) : cancellationException;
        }
        if (objY instanceof wa2) {
            l0.b(this, "Job is still new or active: ");
            return null;
        }
        if (!(objY instanceof hl0)) {
            return new eh2(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((hl0) objY).g;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new eh2(O(), th, this) : cancellationException;
    }

    public final void m0(ih2 ih2Var) {
        ih2 ih2Var2;
        nh2 nh2Var;
        ih3 ih3Var = new ih3();
        Unsafe unsafe = qr.g;
        unsafe.putObjectVolatile(ih3Var, yx2.t, ih2Var);
        long j2 = yx2.j;
        unsafe.putObjectVolatile(ih3Var, j2, ih2Var);
        loop0: while (true) {
            if (ih2Var.j() != ih2Var) {
                ih2Var2 = ih2Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = qr.g;
                ih2Var2 = ih2Var;
                if (unsafe2.compareAndSwapObject(ih2Var2, yx2.j, ih2Var, ih3Var)) {
                    ih3Var.l(ih2Var2);
                    break loop0;
                }
                nh2Var = this;
                ih2Var = ih2Var2;
                if (unsafe2.getObjectVolatile(ih2Var2, j2) != ih2Var2) {
                    break;
                } else {
                    this = nh2Var;
                }
            }
            this = nh2Var;
        }
        yx2 yx2VarT = ih2Var2.t();
        while (true) {
            Unsafe unsafe3 = qr.g;
            long j3 = a;
            nh2 nh2Var2 = this;
            if (unsafe3.compareAndSwapObject(nh2Var2, j3, ih2Var2, yx2VarT) || unsafe3.getObjectVolatile(nh2Var2, j3) != ih2Var2) {
                return;
            } else {
                this = nh2Var2;
            }
        }
    }

    public final int n0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof ji1;
        long j2 = a;
        if (z) {
            if (((ji1) obj).j) {
                return 0;
            }
            ji1 ji1Var = gp4.k;
            do {
                unsafe2 = qr.g;
                if (unsafe2.compareAndSwapObject(this, a, obj, ji1Var)) {
                    l0();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j2) == obj);
            return -1;
        }
        if (!(obj instanceof va2)) {
            return 0;
        }
        ih3 ih3Var = ((va2) obj).j;
        do {
            unsafe = qr.g;
            if (unsafe.compareAndSwapObject(this, a, obj, ih3Var)) {
                l0();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j2) == obj);
        return -1;
    }

    public final Object p0(Object obj, Object obj2) {
        if (!(obj instanceof wa2)) {
            return gp4.p;
        }
        if ((!(obj instanceof ji1) && !(obj instanceof ih2)) || (obj instanceof ce0) || (obj2 instanceof hl0)) {
            nh2 nh2Var = this;
            wa2 wa2Var = (wa2) obj;
            ih3 ih3VarX = nh2Var.X(wa2Var);
            if (ih3VarX == null) {
                return gp4.z;
            }
            lh2 lh2Var = wa2Var instanceof lh2 ? (lh2) wa2Var : null;
            if (lh2Var == null) {
                lh2Var = new lh2(ih3VarX, null);
            }
            lh2 lh2Var2 = lh2Var;
            synchronized (lh2Var2) {
                if (lh2Var2.x()) {
                    return gp4.p;
                }
                qr.g.putIntVolatile(lh2Var2, lh2.a, 1);
                if (lh2Var2 != wa2Var) {
                    while (true) {
                        Unsafe unsafe = qr.g;
                        long j2 = a;
                        nh2 nh2Var2 = nh2Var;
                        nh2Var = nh2Var2;
                        if (unsafe.compareAndSwapObject(nh2Var2, j2, wa2Var, lh2Var2)) {
                            break;
                        }
                        if (unsafe.getObjectVolatile(nh2Var, j2) != wa2Var) {
                            return gp4.z;
                        }
                    }
                }
                boolean zV = lh2Var2.v();
                hl0 hl0Var = obj2 instanceof hl0 ? (hl0) obj2 : null;
                if (hl0Var != null) {
                    lh2Var2.g(hl0Var.g);
                }
                Throwable thR = zV ? null : lh2Var2.r();
                if (thR != null) {
                    nh2Var.j0(ih3VarX, thR);
                }
                ce0 ce0VarI0 = i0(ih3VarX);
                if (ce0VarI0 != null && nh2Var.q0(lh2Var2, ce0VarI0, obj2)) {
                    return gp4.u;
                }
                ih3VarX.v(new vv2(2), 2);
                ce0 ce0VarI1 = i0(ih3VarX);
                return (ce0VarI1 == null || !nh2Var.q0(lh2Var2, ce0VarI1, obj2)) ? nh2Var.S(lh2Var2, obj2) : gp4.u;
            }
        }
        wa2 wa2Var2 = (wa2) obj;
        Object xa2Var = obj2 instanceof wa2 ? new xa2((wa2) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = qr.g;
            long j3 = a;
            nh2 nh2Var3 = this;
            if (unsafe2.compareAndSwapObject(nh2Var3, j3, wa2Var2, xa2Var)) {
                nh2Var3.k0(obj2);
                nh2Var3.Q(wa2Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(nh2Var3, j3) != wa2Var2) {
                return gp4.z;
            }
            this = nh2Var3;
        }
    }

    public final boolean q0(lh2 lh2Var, ce0 ce0Var, Object obj) {
        while (ce0Var.q.c0(false, new kh2(this, lh2Var, ce0Var, obj)) == nh3.j) {
            ce0Var = i0(ce0Var);
            if (ce0Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dh2
    public final boolean start() {
        int iN0;
        do {
            iN0 = n0(Y());
            if (iN0 == 0) {
                return false;
            }
        } while (iN0 != 1);
        return true;
    }

    public final String toString() {
        return (h0() + '{' + o0(Y()) + '}') + '@' + a11.z(this);
    }

    @Override // defpackage.dh2, defpackage.yc0
    public void x(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new eh2(O(), null, this);
        }
        K(cancellationException);
    }

    @Override // defpackage.dh2
    public boolean y() {
        Object objY = Y();
        return (objY instanceof wa2) && ((wa2) objY).y();
    }

    public void l0() {
    }

    public void B(Object obj) {
    }

    public void a0(il0 il0Var) {
        throw il0Var;
    }

    public void k0(Object obj) {
    }
}
