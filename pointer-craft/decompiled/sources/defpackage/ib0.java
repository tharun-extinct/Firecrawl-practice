package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class ib0 extends ka1 implements hb0, qx0, an5 {
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long w;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final mu0 m;
    public final fx0 q;

    static {
        Unsafe unsafe = qr.g;
        w = unsafe.objectFieldOffset(ib0.class.getDeclaredField("_decisionAndIndex$volatile"));
        i = unsafe.objectFieldOffset(ib0.class.getDeclaredField("_state$volatile"));
        c = unsafe.objectFieldOffset(ib0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ib0(int i2, mu0 mu0Var) {
        super(i2);
        this.m = mu0Var;
        this.q = mu0Var.v();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = i4.j;
    }

    public static void A(th3 th3Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + th3Var + ", already has " + obj).toString());
    }

    public static Object F(th3 th3Var, Object obj, int i2, cz1 cz1Var) {
        if (obj instanceof hl0) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (cz1Var != null || (th3Var instanceof cb0)) {
            return new fl0(obj, th3Var instanceof cb0 ? (cb0) th3Var : null, cz1Var, (Throwable) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        ib0 ib0Var;
        mu0 mu0Var = this.m;
        Throwable th = null;
        ia1 ia1Var = mu0Var instanceof ia1 ? (ia1) mu0Var : null;
        if (ia1Var != null) {
            long j = ia1.i;
            loop0: while (true) {
                Object objectVolatile = qr.g.getObjectVolatile(ia1Var, j);
                ky2 ky2Var = pw5.x;
                if (objectVolatile == ky2Var) {
                    while (true) {
                        Unsafe unsafe = qr.g;
                        ib0 ib0Var2 = this;
                        ib0Var = ib0Var2;
                        if (unsafe.compareAndSwapObject(ia1Var, ia1.i, ky2Var, ib0Var2)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(ia1Var, j) != ky2Var) {
                            break;
                        } else {
                            this = ib0Var;
                        }
                    }
                    this = ib0Var;
                } else {
                    ib0Var = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        l0.b(objectVolatile, "Inconsistent state ");
                        return;
                    }
                    while (true) {
                        Unsafe unsafe2 = qr.g;
                        if (unsafe2.compareAndSwapObject(ia1Var, ia1.i, objectVolatile, (Object) null)) {
                            th = (Throwable) objectVolatile;
                            break;
                        } else if (unsafe2.getObjectVolatile(ia1Var, j) != objectVolatile) {
                            l0.u("Failed requirement.");
                            return;
                        }
                    }
                }
            }
            if (th == null) {
                return;
            }
            ib0Var.b();
            ib0Var.s(th);
        }
    }

    public final void D(Object obj, int i2, cz1 cz1Var) throws ha1 {
        ib0 ib0Var;
        while (true) {
            Unsafe unsafe = qr.g;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof th3)) {
                ib0 ib0Var2 = this;
                if (objectVolatile instanceof lb0) {
                    lb0 lb0Var = (lb0) objectVolatile;
                    if (unsafe.compareAndSwapInt(lb0Var, lb0.r, 0, 1)) {
                        if (cz1Var != null) {
                            ib0Var2.c(cz1Var, lb0Var.g, obj);
                            return;
                        }
                        return;
                    }
                }
                l0.b(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objF = F((th3) objectVolatile, obj, i2, cz1Var);
            while (true) {
                Unsafe unsafe2 = qr.g;
                ib0Var = this;
                if (unsafe2.compareAndSwapObject(ib0Var, i, objectVolatile, objF)) {
                    if (!ib0Var.e()) {
                        ib0Var.b();
                    }
                    ib0Var.p(i2);
                    return;
                } else if (unsafe2.getObjectVolatile(ib0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = ib0Var;
                }
            }
            this = ib0Var;
        }
    }

    public final void E(hx0 hx0Var) throws ha1 {
        mu0 mu0Var = this.m;
        ia1 ia1Var = mu0Var instanceof ia1 ? (ia1) mu0Var : null;
        D(og5.g, (ia1Var != null ? ia1Var.m : null) == hx0Var ? 4 : this.a, null);
    }

    public final ky2 G(Object obj, cz1 cz1Var) {
        ib0 ib0Var;
        ky2 ky2Var = gp4.r;
        while (true) {
            Unsafe unsafe = qr.g;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof th3)) {
                return null;
            }
            Object objF = F((th3) objectVolatile, obj, this.a, cz1Var);
            while (true) {
                Unsafe unsafe2 = qr.g;
                ib0Var = this;
                if (unsafe2.compareAndSwapObject(ib0Var, i, objectVolatile, objF)) {
                    if (!ib0Var.e()) {
                        ib0Var.b();
                    }
                    return ky2Var;
                }
                if (unsafe2.getObjectVolatile(ib0Var, j) != objectVolatile) {
                    break;
                }
                this = ib0Var;
            }
            this = ib0Var;
        }
    }

    @Override // defpackage.hb0
    public final void H(Object obj) throws ha1 {
        p(this.a);
    }

    @Override // defpackage.ka1
    public final Object a() {
        return h();
    }

    public final void b() {
        Unsafe unsafe = qr.g;
        long j = c;
        ya1 ya1Var = (ya1) unsafe.getObjectVolatile(this, j);
        if (ya1Var == null) {
            return;
        }
        ya1Var.g();
        unsafe.putObjectVolatile(this, j, nh3.j);
    }

    public final void c(cz1 cz1Var, Throwable th, Object obj) {
        fx0 fx0Var = this.q;
        try {
            cz1Var.x(th, obj, fx0Var);
        } catch (Throwable th2) {
            ae6.y(fx0Var, new il0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void d(th3 th3Var) {
        th3 th3Var2;
        ib0 ib0Var;
        ib0 ib0Var2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = qr.g;
            long j = i;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof i4) {
                while (true) {
                    Unsafe unsafe3 = qr.g;
                    ib0 ib0Var3 = this;
                    th3 th3Var3 = th3Var;
                    ib0Var = ib0Var3;
                    th3Var2 = th3Var3;
                    if (unsafe3.compareAndSwapObject(ib0Var3, i, objectVolatile, th3Var3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ib0Var, j) != objectVolatile) {
                        break;
                    }
                    this = ib0Var;
                    th3Var = th3Var2;
                }
            } else {
                th3Var2 = th3Var;
                ib0Var = this;
                if ((objectVolatile instanceof cb0) || (objectVolatile instanceof nh4)) {
                    A(th3Var2, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof hl0) {
                    hl0 hl0Var = (hl0) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(hl0Var, hl0.y, 0, 1)) {
                        A(th3Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof lb0) {
                        Throwable th = hl0Var.g;
                        if (th3Var2 instanceof cb0) {
                            ib0Var.w((cb0) th3Var2, th);
                            return;
                        } else {
                            ib0Var.i((nh4) th3Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof fl0) {
                    fl0 fl0Var = (fl0) objectVolatile;
                    if (fl0Var.y != null) {
                        A(th3Var2, objectVolatile);
                        throw null;
                    }
                    if (th3Var2 instanceof nh4) {
                        return;
                    }
                    cb0 cb0Var = (cb0) th3Var2;
                    Throwable th2 = fl0Var.v;
                    if (th2 != null) {
                        ib0Var.w(cb0Var, th2);
                        return;
                    }
                    fl0 fl0VarG = fl0.g(fl0Var, cb0Var, null, 29);
                    do {
                        unsafe = qr.g;
                        if (unsafe.compareAndSwapObject(ib0Var, i, objectVolatile, fl0VarG)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(ib0Var, j) == objectVolatile);
                } else {
                    if (th3Var2 instanceof nh4) {
                        return;
                    }
                    fl0 fl0Var2 = new fl0(objectVolatile, (cb0) th3Var2, (cz1) null, (Throwable) null, 28);
                    while (true) {
                        fl0 fl0Var3 = fl0Var2;
                        Unsafe unsafe4 = qr.g;
                        ib0Var2 = ib0Var;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(ib0Var2, i, objectVolatile, fl0Var3);
                        fl0Var2 = fl0Var3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(ib0Var2, j) != objectVolatile) {
                            break;
                        } else {
                            ib0Var = ib0Var2;
                        }
                    }
                }
                this = ib0Var2;
                th3Var = th3Var2;
            }
            ib0Var2 = ib0Var;
            this = ib0Var2;
            th3Var = th3Var2;
        }
    }

    public final boolean e() {
        if (this.a == 2) {
            return qr.g.getObjectVolatile((ia1) this.m, ia1.i) != null;
        }
        return false;
    }

    public final ya1 f() {
        dh2 dh2Var = (dh2) this.q.h(d52.m);
        if (dh2Var == null) {
            return null;
        }
        ya1 ya1VarA = v70.A(dh2Var, new ae0(this));
        while (true) {
            Unsafe unsafe = qr.g;
            long j = c;
            ib0 ib0Var = this;
            if (unsafe.compareAndSwapObject(ib0Var, j, (Object) null, ya1VarA) || unsafe.getObjectVolatile(ib0Var, j) != null) {
                break;
            }
            this = ib0Var;
        }
        return ya1VarA;
    }

    @Override // defpackage.an5
    public final void g(nh4 nh4Var, int i2) {
        while (true) {
            Unsafe unsafe = qr.g;
            long j = w;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                l0.z("invokeOnCancellation should be called at most once");
                return;
            }
            ib0 ib0Var = this;
            if (unsafe.compareAndSwapInt(ib0Var, j, intVolatile, ((intVolatile >> 29) << 29) + i2)) {
                ib0Var.d(nh4Var);
                return;
            }
            this = ib0Var;
        }
    }

    public final Object h() {
        return qr.g.getObjectVolatile(this, i);
    }

    public final void i(nh4 nh4Var, Throwable th) {
        fx0 fx0Var = this.q;
        int intVolatile = qr.g.getIntVolatile(this, w) & 536870911;
        if (intVolatile == 536870911) {
            l0.z("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            nh4Var.j(intVolatile, fx0Var);
        } catch (Throwable th2) {
            ae6.y(fx0Var, new il0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.mu0
    public final void j(Object obj) {
        Throwable thG = h84.g(obj);
        if (thG != null) {
            obj = new hl0(thG, false);
        }
        D(obj, this.a, null);
    }

    public final void k(xy1 xy1Var) {
        d(new bb0(xy1Var, (byte) 0));
    }

    @Override // defpackage.ka1
    public final Object l(Object obj) {
        return obj instanceof fl0 ? ((fl0) obj).g : obj;
    }

    @Override // defpackage.hb0
    public final void m(Object obj, cz1 cz1Var) throws ha1 {
        D(obj, this.a, cz1Var);
    }

    @Override // defpackage.qx0
    public final qx0 n() {
        mu0 mu0Var = this.m;
        if (mu0Var instanceof qx0) {
            return (qx0) mu0Var;
        }
        return null;
    }

    public final void o() {
        ya1 ya1VarF = f();
        if (ya1VarF == null || (h() instanceof th3)) {
            return;
        }
        ya1VarF.g();
        qr.g.putObjectVolatile(this, c, nh3.j);
    }

    public final void p(int i2) throws ha1 {
        while (true) {
            Unsafe unsafe = qr.g;
            long j = w;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i3 = intVolatile >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    l0.z("Already resumed");
                    return;
                }
                boolean z = i2 == 4;
                mu0 mu0Var = this.m;
                if (!z && (mu0Var instanceof ia1)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i4 = this.a;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        ia1 ia1Var = (ia1) mu0Var;
                        hx0 hx0Var = ia1Var.m;
                        fx0 fx0VarV = ia1Var.q.v();
                        if (pw5.M(hx0Var, fx0VarV)) {
                            pw5.L(hx0Var, fx0VarV, this);
                            return;
                        }
                        el1 el1VarG = w85.g();
                        if (el1VarG.a >= 4294967296L) {
                            el1VarG.T(this);
                            return;
                        }
                        el1VarG.U(true);
                        try {
                            yf2.W(this, mu0Var, true);
                            do {
                            } while (el1VarG.W());
                        } catch (Throwable th) {
                            try {
                                this.t(th);
                            } finally {
                                el1VarG.S(true);
                            }
                        }
                        return;
                    }
                }
                yf2.W(this, mu0Var, z);
                return;
            }
            ib0 ib0Var = this;
            if (unsafe.compareAndSwapInt(ib0Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = ib0Var;
            }
        }
    }

    @Override // defpackage.hb0
    public final ky2 q(Object obj, cz1 cz1Var) {
        return G(obj, cz1Var);
    }

    @Override // defpackage.ka1
    public final mu0 r() {
        return this.m;
    }

    @Override // defpackage.hb0
    public final boolean s(Throwable th) {
        Throwable cancellationException;
        ib0 ib0Var;
        while (true) {
            Unsafe unsafe = qr.g;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof th3)) {
                return false;
            }
            boolean z = (objectVolatile instanceof cb0) || (objectVolatile instanceof nh4);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            lb0 lb0Var = new lb0(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = qr.g;
                ib0Var = this;
                if (unsafe2.compareAndSwapObject(ib0Var, i, objectVolatile, lb0Var)) {
                    th3 th3Var = (th3) objectVolatile;
                    if (th3Var instanceof cb0) {
                        ib0Var.w((cb0) objectVolatile, th);
                    } else if (th3Var instanceof nh4) {
                        ib0Var.i((nh4) objectVolatile, th);
                    }
                    if (!ib0Var.e()) {
                        ib0Var.b();
                    }
                    ib0Var.p(ib0Var.a);
                    return true;
                }
                if (unsafe2.getObjectVolatile(ib0Var, j) != objectVolatile) {
                    break;
                }
                this = ib0Var;
            }
            this = ib0Var;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(B());
        sb.append('(');
        sb.append(a11.E(this.m));
        sb.append("){");
        Object objH = h();
        if (objH instanceof th3) {
            str = "Active";
        } else {
            str = objH instanceof lb0 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(a11.z(this));
        return sb.toString();
    }

    public Throwable u(nh2 nh2Var) {
        return nh2Var.k();
    }

    @Override // defpackage.mu0
    public final fx0 v() {
        return this.q;
    }

    public final void w(cb0 cb0Var, Throwable th) {
        try {
            cb0Var.y(th);
        } catch (Throwable th2) {
            ae6.y(this.q, new il0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.ka1
    public final Throwable x(Object obj) {
        Throwable thX = super.x(obj);
        if (thX != null) {
            return thX;
        }
        return null;
    }

    @Override // defpackage.ka1
    public final void y(CancellationException cancellationException) {
        CancellationException cancellationException2;
        ib0 ib0Var;
        while (true) {
            Unsafe unsafe = qr.g;
            long j = i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof th3) {
                l0.z("Not completed");
                return;
            }
            if (objectVolatile instanceof hl0) {
                return;
            }
            if (objectVolatile instanceof fl0) {
                fl0 fl0Var = (fl0) objectVolatile;
                if (fl0Var.v != null) {
                    l0.z("Must be called at most once");
                    return;
                }
                fl0 fl0VarG = fl0.g(fl0Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = qr.g;
                    ib0 ib0Var2 = this;
                    if (unsafe2.compareAndSwapObject(ib0Var2, i, objectVolatile, fl0VarG)) {
                        cb0 cb0Var = fl0Var.y;
                        if (cb0Var != null) {
                            ib0Var2.w(cb0Var, cancellationException);
                        }
                        cz1 cz1Var = fl0Var.r;
                        if (cz1Var != null) {
                            ib0Var2.c(cz1Var, cancellationException, fl0Var.g);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(ib0Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        ib0Var = ib0Var2;
                        break;
                    }
                    this = ib0Var2;
                }
            } else {
                ib0 ib0Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                fl0 fl0Var2 = new fl0(objectVolatile, (cb0) null, (cz1) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    fl0 fl0Var3 = fl0Var2;
                    Unsafe unsafe3 = qr.g;
                    ib0Var = ib0Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(ib0Var, i, objectVolatile, fl0Var3);
                    fl0Var2 = fl0Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ib0Var, j) != objectVolatile) {
                        break;
                    } else {
                        ib0Var3 = ib0Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = ib0Var;
        }
    }

    public final Object z() {
        dh2 dh2Var;
        boolean zE = e();
        while (true) {
            Unsafe unsafe = qr.g;
            long j = w;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    l0.z("Already suspended");
                    return null;
                }
                if (zE) {
                    this.C();
                }
                Object objH = this.h();
                if (objH instanceof hl0) {
                    throw ((hl0) objH).g;
                }
                int i3 = this.a;
                if ((i3 != 1 && i3 != 2) || (dh2Var = (dh2) this.q.h(d52.m)) == null || dh2Var.y()) {
                    return this.l(objH);
                }
                CancellationException cancellationExceptionK = dh2Var.k();
                this.y(cancellationExceptionK);
                throw cancellationExceptionK;
            }
            ib0 ib0Var = this;
            if (unsafe.compareAndSwapInt(ib0Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((ya1) unsafe.getObjectVolatile(ib0Var, c)) == null) {
                    ib0Var.f();
                }
                if (zE) {
                    ib0Var.C();
                }
                return px0.j;
            }
            this = ib0Var;
        }
    }
}
