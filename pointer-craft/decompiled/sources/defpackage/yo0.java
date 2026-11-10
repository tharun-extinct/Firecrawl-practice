package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class yo0 implements so0 {
    public final y22 A;
    public final i64 B;
    public final h02 C;
    public byte D;
    public final ib3 b;
    public final hb3 c;
    public yo0 d;
    public int e;
    public lp4 f;
    public hb3 h;
    public final ib3 i;
    public final to0 j;
    public ir3 k;
    public boolean o;
    public final vc0 p;
    public final lb3 q;
    public final hb3 s;
    public final t t;
    public final vc0 u;
    public final mr4 w;
    public final hb3 z;
    public final AtomicReference a = new AtomicReference(null);
    public final Object m = new Object();

    public yo0(to0 to0Var, t tVar) {
        this.j = to0Var;
        this.t = tVar;
        ib3 ib3Var = new ib3();
        lb3 lb3Var = ib3Var.v;
        if (lb3Var == null) {
            lb3Var = new lb3(ib3Var);
            ib3Var.v = lb3Var;
        }
        lb3 lb3Var2 = lb3Var;
        this.q = lb3Var2;
        mr4 mr4Var = new mr4();
        if (to0Var.n()) {
            mr4Var.p = new ha3();
        }
        if (to0Var.x()) {
            mr4Var.y();
        }
        this.w = mr4Var;
        this.c = xq2.a();
        this.i = new ib3();
        this.b = new ib3();
        this.s = xq2.a();
        vc0 vc0Var = new vc0();
        this.p = vc0Var;
        vc0 vc0Var2 = new vc0();
        this.u = vc0Var2;
        this.z = xq2.a();
        this.h = xq2.a();
        y22 y22Var = new y22((Object) to0Var, (byte) 13);
        this.A = y22Var;
        this.B = new i64((byte) 0);
        h02 h02Var = new h02(tVar, to0Var, or4.g(mr4Var), lb3Var2, vc0Var, vc0Var2, y22Var, this);
        to0Var.b(h02Var);
        this.C = h02Var;
    }

    public final void A(bz1 bz1Var) {
        boolean zA = a();
        s();
        to0 to0Var = this.j;
        if (!zA) {
            to0Var.g(this, bz1Var);
            return;
        }
        h02 h02Var = this.C;
        h02Var.e = 0;
        h02Var.d = true;
        to0Var.g(this, bz1Var);
        if (h02Var.F || h02Var.e != 0) {
            aw3.g("Cannot disable reuse from root if it was caused by other groups");
        }
        h02Var.e = -1;
        h02Var.d = false;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.m) {
            z = true;
            if (this.D != 1) {
                z = false;
            }
            if (z) {
                this.D = (byte) 0;
            }
        }
        return z;
    }

    public final void b() {
        vi1 vi1Var = vi1.j;
        AtomicReference atomicReference = this.a;
        Object andSet = atomicReference.getAndSet(vi1Var);
        if (yf2.p(andSet, m50.l) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            n((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            qo0.y("corrupt pendingModifications drain: " + atomicReference);
            l0.x();
            return;
        }
        for (Set set : (Set[]) andSet) {
            n(set, false);
        }
    }

    public final void c() {
        Object obj = m50.l;
        AtomicReference atomicReference = this.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                qo0.y("pending composition has not been applied");
                l0.x();
                return;
            }
            if (andSet instanceof Set) {
                n((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                qo0.y("corrupt pendingModifications drain: " + atomicReference);
                l0.x();
                return;
            }
            for (Set set : (Set[]) andSet) {
                n(set, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void d(Object obj) {
        u34 u34VarF;
        int i;
        boolean z;
        h02 h02Var = this.C;
        if (h02Var.A <= 0 && (u34VarF = h02Var.f()) != null) {
            int i2 = u34VarF.y | 1;
            u34VarF.y = i2;
            if ((i2 & 32) == 0) {
                ta3 ta3Var = u34VarF.x;
                if (ta3Var == null) {
                    ta3Var = new ta3();
                    u34VarF.x = ta3Var;
                }
                int i3 = u34VarF.v;
                int iR = ta3Var.r(obj);
                if (iR < 0) {
                    iR = ~iR;
                    i = -1;
                } else {
                    i = ta3Var.r[iR];
                }
                ta3Var.y[iR] = obj;
                ta3Var.r[iR] = i3;
                if (i == u34VarF.v) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.A.c();
            if (z) {
                return;
            }
            if (obj instanceof xw4) {
                ((xw4) obj).k(1);
            }
            xq2.v(this.c, obj, u34VarF);
            if (obj instanceof z51) {
                z51 z51Var = (z51) obj;
                y51 y51VarE = z51Var.e();
                hb3 hb3Var = this.s;
                xq2.A(hb3Var, obj);
                ta3 ta3Var2 = y51VarE.v;
                Object[] objArr = ta3Var2.y;
                long[] jArr = ta3Var2.g;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    ww4 ww4Var = (ww4) objArr[(i4 << 3) + i7];
                                    if (ww4Var instanceof xw4) {
                                        ((xw4) ww4Var).k(1);
                                    }
                                    xq2.v(hb3Var, ww4Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = y51VarE.x;
                hb3 hb3Var2 = u34VarF.l;
                if (hb3Var2 == null) {
                    hb3Var2 = new hb3();
                    u34VarF.l = hb3Var2;
                }
                hb3Var2.c(z51Var, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void e(Object obj) {
        synchronized (this.m) {
            try {
                h(obj);
                Object objL = this.s.l(obj);
                if (objL != null) {
                    if (objL instanceof ib3) {
                        ib3 ib3Var = (ib3) objL;
                        Object[] objArr = ib3Var.y;
                        long[] jArr = ib3Var.g;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            h((z51) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        h((z51) objL);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        synchronized (this.m) {
            ir3 ir3Var = this.k;
            boolean z = false;
            if (ir3Var != null && !ir3Var.l()) {
                ir3Var.t();
                ir3Var.n().d();
                return false;
            }
            c();
            try {
                hb3 hb3Var = this.h;
                this.h = xq2.a();
                try {
                    h02 h02Var = this.C;
                    lp4 lp4Var = this.f;
                    em3 em3Var = h02Var.v.C;
                    if (!em3Var.M()) {
                        qo0.g("Expected applyChanges() to have been called");
                    }
                    if (hb3Var.v > 0 || !h02Var.u.isEmpty()) {
                        h02Var.P = lp4Var;
                        try {
                            h02Var.c(hb3Var, null);
                            h02Var.P = null;
                            z = !em3Var.M();
                        } catch (Throwable th) {
                            h02Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        i();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.h = hb3Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.q.j.l()) {
                        i64 i64Var = this.B;
                        try {
                            i64Var.a(this.q, this.C.d());
                            i64Var.r();
                        } finally {
                            i64Var.y();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    y();
                    throw th4;
                }
            }
        }
    }

    @Override // defpackage.so0
    public final void g() {
        synchronized (this.m) {
            try {
                if (this.C.F) {
                    aw3.y("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.D != 3) {
                    this.D = (byte) 3;
                    vc0 vc0Var = this.C.L;
                    if (vc0Var != null) {
                        x(vc0Var);
                    }
                    boolean z = this.w.t == 0;
                    if (!z || !this.q.j.l()) {
                        i64 i64Var = this.B;
                        try {
                            i64Var.a(this.q, this.C.d());
                            if (!z) {
                                mr4 mr4Var = this.w;
                                i64 i64Var2 = this.B;
                                pr4 pr4VarV = mr4Var.v();
                                try {
                                    pr4VarV.w(pr4VarV.z, new f(i64Var2, (byte) 12));
                                    pr4VarV.G();
                                    pr4VarV.v(true);
                                    this.t.v();
                                    this.t.l();
                                    i64Var.n();
                                } catch (Throwable th) {
                                    pr4VarV.v(false);
                                    throw th;
                                }
                            }
                            i64Var.r();
                            i64Var.y();
                        } catch (Throwable th2) {
                            i64Var.y();
                            throw th2;
                        }
                    }
                    this.z.g();
                    h02 h02Var = this.C;
                    h02Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        h02Var.y.h(h02Var);
                        h02Var.E.clear();
                        h02Var.u.clear();
                        h02Var.v.C.K();
                        h02Var.o = null;
                        h02Var.g.v();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.j.o(this);
    }

    public final void h(Object obj) {
        Object objL = this.c.l(obj);
        if (objL == null) {
            return;
        }
        boolean z = objL instanceof ib3;
        ng2 ng2Var = ng2.m;
        hb3 hb3Var = this.z;
        if (!z) {
            u34 u34Var = (u34) objL;
            if (u34Var.y(obj) != ng2Var || (obj instanceof z51)) {
                return;
            }
            xq2.v(hb3Var, obj, u34Var);
            return;
        }
        ib3 ib3Var = (ib3) objL;
        Object[] objArr = ib3Var.y;
        long[] jArr = ib3Var.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        u34 u34Var2 = (u34) objArr[(i << 3) + i3];
                        if (u34Var2.y(obj) == ng2Var && !(obj instanceof z51)) {
                            xq2.v(hb3Var, obj, u34Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void i() {
        AtomicReference atomicReference = this.a;
        Object andSet = atomicReference.getAndSet(null);
        if (yf2.p(andSet, m50.l)) {
            return;
        }
        if (andSet instanceof Set) {
            n((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                n(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.k == null) {
                qo0.g("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            qo0.y("corrupt pendingModifications drain: " + atomicReference);
            l0.x();
        }
    }

    public final void j() {
        synchronized (this.m) {
            try {
                this.C.o = null;
                if (!this.q.j.l()) {
                    i64 i64Var = this.B;
                    try {
                        i64Var.a(this.q, this.C.d());
                        i64Var.r();
                        i64Var.y();
                    } catch (Throwable th) {
                        i64Var.y();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.q.j.l()) {
                        i64 i64Var2 = this.B;
                        try {
                            i64Var2.a(this.q, this.C.d());
                            i64Var2.r();
                        } finally {
                            i64Var2.y();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    y();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(ge4 ge4Var) {
        Object obj;
        while (true) {
            Object obj2 = this.a.get();
            if (obj2 == null || obj2.equals(m50.l)) {
                obj = ge4Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, ge4Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    uo1.d(this.a, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = ge4Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.a;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.m) {
                            i();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    public final void l() {
        synchronized (this.m) {
            try {
                vc0 vc0Var = this.u;
                vc0Var.getClass();
                if (!vc0Var.C.M()) {
                    x(this.u);
                }
            } catch (Throwable th) {
                try {
                    if (!this.q.j.l()) {
                        i64 i64Var = this.B;
                        try {
                            i64Var.a(this.q, this.C.d());
                            i64Var.r();
                        } finally {
                            i64Var.y();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    y();
                    throw th2;
                }
            }
        }
    }

    public final void m(bz1 bz1Var) {
        try {
            synchronized (this.m) {
                c();
                hb3 hb3Var = this.h;
                this.h = xq2.a();
                try {
                    h02 h02Var = this.C;
                    lp4 lp4Var = this.f;
                    if (!h02Var.v.C.M()) {
                        qo0.g("Expected applyChanges() to have been called");
                    }
                    h02Var.P = lp4Var;
                    try {
                        h02Var.c(hb3Var, bz1Var);
                        h02Var.P = null;
                    } catch (Throwable th) {
                        h02Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.h = hb3Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.q.j.l()) {
                    i64 i64Var = this.B;
                    try {
                        i64Var.a(this.q, this.C.d());
                        i64Var.r();
                    } finally {
                        i64Var.y();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                y();
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void n(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zR;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zL;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof ge4;
        hb3 hb3Var = this.s;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            ib3 ib3Var = ((ge4) set).j;
            Object[] objArr = ib3Var.y;
            long[] jArr9 = ib3Var.g;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof u34) {
                                    ((u34) obj2).y(obj);
                                } else {
                                    r(obj2, z);
                                    Object objL = hb3Var.l(obj2);
                                    if (objL != null) {
                                        if (objL instanceof ib3) {
                                            ib3 ib3Var2 = (ib3) objL;
                                            Object[] objArr2 = ib3Var2.y;
                                            long[] jArr10 = ib3Var2.g;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                r((z51) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            r((z51) objL, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof u34) {
                    ((u34) obj3).y(null);
                } else {
                    r(obj3, z);
                    Object objL2 = hb3Var.l(obj3);
                    if (objL2 != null) {
                        if (objL2 instanceof ib3) {
                            ib3 ib3Var3 = (ib3) objL2;
                            Object[] objArr3 = ib3Var3.y;
                            long[] jArr12 = ib3Var3.g;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                r((z51) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            r((z51) objL2, z);
                        }
                    }
                }
            }
        }
        hb3 hb3Var2 = this.c;
        ib3 ib3Var4 = this.i;
        if (z) {
            ib3 ib3Var5 = this.b;
            if (ib3Var5.j()) {
                long[] jArr13 = hb3Var2.g;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = hb3Var2.y[i18];
                                    Object obj5 = hb3Var2.r[i18];
                                    if (obj5 instanceof ib3) {
                                        ib3 ib3Var6 = (ib3) obj5;
                                        Object[] objArr4 = ib3Var6.y;
                                        long[] jArr14 = ib3Var6.g;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            u34 u34Var = (u34) objArr5[i22];
                                                            if (ib3Var5.r(u34Var) || ib3Var4.r(u34Var)) {
                                                                ib3Var6.w(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zL = ib3Var6.l();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        u34 u34Var2 = (u34) obj5;
                                        zL = ib3Var5.r(u34Var2) || ib3Var4.r(u34Var2);
                                    }
                                    if (zL) {
                                        hb3Var2.w(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                ib3Var5.y();
                t();
                return;
            }
        }
        if (ib3Var4.j()) {
            long[] jArr16 = hb3Var2.g;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = hb3Var2.y[i26];
                                Object obj7 = hb3Var2.r[i26];
                                if (obj7 instanceof ib3) {
                                    ib3 ib3Var7 = (ib3) obj7;
                                    Object[] objArr6 = ib3Var7.y;
                                    long[] jArr17 = ib3Var7.g;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (ib3Var4.r((u34) objArr7[i30])) {
                                                            ib3Var7.w(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zR = ib3Var7.l();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zR = ib3Var4.r((u34) obj7);
                                }
                                if (zR) {
                                    hb3Var2.w(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            t();
            ib3Var4.y();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean o(Set set) {
        boolean z = set instanceof ge4;
        hb3 hb3Var = this.s;
        hb3 hb3Var2 = this.c;
        if (z) {
            ib3 ib3Var = ((ge4) set).j;
            Object[] objArr = ib3Var.y;
            long[] jArr = ib3Var.g;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (hb3Var2.r(obj) || hb3Var.r(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (hb3Var2.r(obj2) || hb3Var.r(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        lb3 lb3Var = this.q;
        h02 h02Var = this.C;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((w83) ((fp3) arrayList.get(i)).j).y().equals(this)) {
                qo0.g("Check failed");
                break;
            }
        }
        try {
            h02Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    h02Var.A(arrayList);
                    h02Var.t();
                    Trace.endSection();
                } catch (Throwable th) {
                    h02Var.g();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!lb3Var.j.l()) {
                    i64 i64Var = this.B;
                    try {
                        i64Var.a(lb3Var, h02Var.d());
                        i64Var.r();
                    } finally {
                        i64Var.y();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                y();
                throw th4;
            }
        }
    }

    public final ir3 q(boolean z, bz1 bz1Var) {
        if (this.k != null) {
            aw3.y("A pausable composition is in progress");
        }
        ir3 ir3Var = new ir3(this, this.j, this.C, this.q, bz1Var, z, this.t, this.m);
        this.k = ir3Var;
        return ir3Var;
    }

    public final void r(Object obj, boolean z) {
        Object objL = this.c.l(obj);
        if (objL == null) {
            return;
        }
        boolean z2 = objL instanceof ib3;
        ng2 ng2Var = ng2.j;
        ib3 ib3Var = this.i;
        ib3 ib3Var2 = this.b;
        hb3 hb3Var = this.z;
        if (!z2) {
            u34 u34Var = (u34) objL;
            if (xq2.e(hb3Var, obj, u34Var) || u34Var.y(obj) == ng2Var) {
                return;
            }
            if (u34Var.l == null || z) {
                ib3Var.g(u34Var);
                return;
            } else {
                ib3Var2.g(u34Var);
                return;
            }
        }
        ib3 ib3Var3 = (ib3) objL;
        Object[] objArr = ib3Var3.y;
        long[] jArr = ib3Var3.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        u34 u34Var2 = (u34) objArr[(i << 3) + i3];
                        if (!xq2.e(hb3Var, obj, u34Var2) && u34Var2.y(obj) != ng2Var) {
                            if (u34Var2.l == null || z) {
                                ib3Var.g(u34Var2);
                            } else {
                                ib3Var2.g(u34Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void s() {
        String str;
        byte b = this.D;
        if (b != 0) {
            if (b == 1) {
                str = "The composition should be activated before setting content.";
            } else if (b != 2) {
                str = b != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            aw3.y(str);
        }
        if (this.k == null) {
            return;
        }
        aw3.y("A pausable composition is in progress");
    }

    public final void t() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zL;
        int i4;
        int i5;
        hb3 hb3Var = this.s;
        long[] jArr3 = hb3Var.g;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = hb3Var.y[i10];
                            Object obj2 = hb3Var.r[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof ib3;
                            j5 = j8;
                            hb3 hb3Var2 = this.c;
                            if (z) {
                                ib3 ib3Var = (ib3) obj2;
                                Object[] objArr = ib3Var.y;
                                long[] jArr4 = ib3Var.g;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!hb3Var2.r((z51) objArr[i15])) {
                                                        ib3Var.w(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zL = ib3Var.l();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zL = !hb3Var2.r((z51) obj2);
                            }
                            if (zL) {
                                hb3Var.w(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        ib3 ib3Var2 = this.b;
        if (!ib3Var2.j()) {
            return;
        }
        Object[] objArr2 = ib3Var2.y;
        long[] jArr5 = ib3Var2.g;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((u34) objArr2[i20]).l == null) {
                            ib3Var2.w(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final ng2 u(u34 u34Var, Object obj) {
        yo0 yo0Var;
        int i = u34Var.y;
        if ((i & 2) != 0) {
            u34Var.y = i | 4;
        }
        c02 c02Var = u34Var.r;
        if (c02Var == null || !c02Var.g()) {
            return ng2.j;
        }
        mr4 mr4Var = this.w;
        mr4Var.getClass();
        c02 c02Var2 = u34Var.r;
        if (c02Var2 != null && mr4Var.x(v70.t(c02Var2))) {
            if (u34Var.n == null) {
                return ng2.j;
            }
            ng2 ng2VarZ = z(u34Var, c02Var, obj);
            if (ng2VarZ != ng2.j) {
                this.A.c();
            }
            return ng2VarZ;
        }
        synchronized (this.m) {
            yo0Var = this.d;
        }
        if (yo0Var != null) {
            h02 h02Var = yo0Var.C;
            if (h02Var.F && h02Var.d0(u34Var, obj)) {
                return ng2.m;
            }
        }
        return ng2.j;
    }

    public final void v() {
        synchronized (this.m) {
            try {
                x(this.p);
                i();
            } catch (Throwable th) {
                try {
                    if (!this.q.j.l()) {
                        i64 i64Var = this.B;
                        try {
                            i64Var.a(this.q, this.C.d());
                            i64Var.r();
                        } finally {
                            i64Var.y();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    y();
                    throw th2;
                }
            }
        }
    }

    public final void w() {
        synchronized (this.m) {
            try {
                if (this.k != null) {
                    aw3.y("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.w.t == 0;
                if (!z || !this.q.j.l()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        i64 i64Var = this.B;
                        try {
                            i64Var.a(this.q, this.C.d());
                            if (!z) {
                                mr4 mr4Var = this.w;
                                i64 i64Var2 = this.B;
                                pr4 pr4VarV = mr4Var.v();
                                try {
                                    pr4VarV.w(pr4VarV.z, new ta(i64Var2, pr4VarV, (byte) 16));
                                    pr4VarV.v(true);
                                    this.t.l();
                                    i64Var.n();
                                } catch (Throwable th) {
                                    pr4VarV.v(false);
                                    throw th;
                                }
                            }
                            i64Var.r();
                            i64Var.y();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            i64Var.y();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.c.g();
                this.s.g();
                this.h.g();
                this.p.C.K();
                this.u.C.K();
                h02 h02Var = this.C;
                h02Var.E.clear();
                h02Var.u.clear();
                h02Var.v.C.K();
                h02Var.o = null;
                this.D = (byte) 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x013e A[EDGE_INSN: B:161:0x013e->B:79:0x013e BREAK  A[LOOP:2: B:141:0x00f1->B:77:0x0134], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0134 A[Catch: all -> 0x0124, LOOP:2: B:141:0x00f1->B:77:0x0134, LOOP_END, TryCatch #3 {all -> 0x0124, blocks: (B:61:0x00f1, B:63:0x0100, B:65:0x010a, B:67:0x0110, B:69:0x0120, B:73:0x0129, B:79:0x013e, B:87:0x0160, B:90:0x0173, B:77:0x0134, B:82:0x0148, B:96:0x0191, B:98:0x019d), top: B:141:0x00f1 }] */
    public final void x(vc0 vc0Var) throws Throwable {
        i64 i64Var;
        long[] jArr;
        int i;
        long[] jArr2;
        i64 i64Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zL;
        long j3;
        vc0 vc0Var2 = this.u;
        h02 h02Var = this.C;
        wo0 wo0VarD = h02Var.d();
        i64 i64Var3 = this.B;
        i64Var3.a(this.q, wo0VarD);
        try {
            if (vc0Var.C.M()) {
                try {
                    if (vc0Var2.C.M() && this.k == null) {
                        i64Var3.r();
                    }
                    return;
                } finally {
                    i64Var3.y();
                }
            }
            ir3 ir3Var = this.k;
            mq mqVarN = ir3Var != null ? ir3Var.n() : this.t;
            ir3 ir3Var2 = this.k;
            try {
                Trace.beginSection(mqVarN.equals(ir3Var2 != null ? ir3Var2.n() : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    ir3 ir3Var3 = this.k;
                    i64 i64VarV = ir3Var3 != null ? ir3Var3.v() : i64Var3;
                    mr4 mr4Var = this.w;
                    wo0 wo0VarD2 = h02Var.d();
                    pr4 pr4VarV = or4.g(mr4Var).v();
                    int i3 = 0;
                    try {
                        vc0Var.P(mqVarN, pr4VarV, i64VarV, wo0VarD2);
                        pr4VarV.v(true);
                        mqVarN.l();
                        Trace.endSection();
                        i64Var3.n();
                        i64Var3.v();
                        if (this.o) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.o = false;
                                hb3 hb3Var = this.c;
                                long[] jArr3 = hb3Var.g;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = hb3Var.y[i8];
                                                    Object obj2 = hb3Var.r[i8];
                                                    if (obj2 instanceof ib3) {
                                                        ib3 ib3Var = (ib3) obj2;
                                                        Object[] objArr = ib3Var.y;
                                                        long[] jArr4 = ib3Var.g;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        i64Var2 = i64Var3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((u34) objArr[i13]).g()) {
                                                                                    ib3Var.w(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zL = ib3Var.l();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        i64Var2 = i64Var3;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zL = !((u34) obj2).g();
                                                    }
                                                    if (zL) {
                                                        hb3Var.w(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    i64Var2 = i64Var3;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                i64Var3 = i64Var2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            i64Var = i64Var3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            i64Var = i64Var3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        i64Var3 = i64Var;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    i64Var = i64Var3;
                                }
                                t();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            i64Var = i64Var3;
                        }
                        try {
                            if (vc0Var2.C.M() && this.k == null) {
                                i64Var.r();
                            }
                            return;
                        } finally {
                            i64Var.y();
                        }
                    } catch (Throwable th3) {
                        try {
                            pr4VarV.v(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (vc0Var2.C.M() && this.k == null) {
                i64Var3.r();
            }
            throw th;
        } finally {
            i64Var3.y();
        }
    }

    public final void y() {
        this.a.set(null);
        this.p.C.K();
        this.u.C.K();
        lb3 lb3Var = this.q;
        if (lb3Var.j.l()) {
            return;
        }
        i64 i64Var = this.B;
        try {
            i64Var.a(lb3Var, this.C.d());
            i64Var.r();
        } finally {
            i64Var.y();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[Catch: all -> 0x0044, LOOP:0: B:48:0x008a->B:60:0x00c1, LOOP_END, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:64:0x00c9->B:65:0x00ce BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[SYNTHETIC] */
    public final ng2 z(u34 u34Var, c02 c02Var, Object obj) {
        synchronized (this.m) {
            try {
                yo0 yo0Var = this.d;
                yo0 yo0Var2 = null;
                if (yo0Var != null) {
                    mr4 mr4Var = this.w;
                    int i = this.e;
                    if (mr4Var.c) {
                        qo0.g("Writer is active");
                    }
                    if (i < 0 || i >= mr4Var.t) {
                        qo0.g("Invalid group index");
                    }
                    c02 c02VarT = v70.t(c02Var);
                    if (mr4Var.x(c02VarT)) {
                        int i2 = mr4Var.j[(i * 5) + 3] + i;
                        int i3 = c02VarT.g;
                        if (i > i3 || i3 >= i2) {
                            yo0Var = null;
                        }
                    } else {
                        yo0Var = null;
                    }
                    yo0Var2 = yo0Var;
                }
                if (yo0Var2 == null) {
                    h02 h02Var = this.C;
                    if (h02Var.F && h02Var.d0(u34Var, obj)) {
                        return ng2.m;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof z51;
                        hb3 hb3Var = this.h;
                        if (z) {
                            Object objL = hb3Var.l(u34Var);
                            if (objL == null) {
                                xq2.v(this.h, u34Var, obj);
                                break;
                            }
                            if (objL instanceof ib3) {
                                ib3 ib3Var = (ib3) objL;
                                Object[] objArr = ib3Var.y;
                                long[] jArr = ib3Var.g;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    xq2.v(this.h, u34Var, obj);
                                    break;
                                }
                                int i4 = 0;
                                loop0: while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == cm1.i) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i5 == 8) {
                                            if (i4 == length) {
                                                i4++;
                                            }
                                        }
                                        xq2.v(this.h, u34Var, obj);
                                        break;
                                    }
                                    if (i4 == length) {
                                        xq2.v(this.h, u34Var, obj);
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                if (objL != cm1.i) {
                                    xq2.v(this.h, u34Var, obj);
                                    break;
                                }
                            }
                        } else {
                            hb3Var.c(u34Var, cm1.i);
                        }
                    } else {
                        this.h.c(u34Var, cm1.i);
                    }
                }
                if (yo0Var2 != null) {
                    return yo0Var2.z(u34Var, c02Var, obj);
                }
                this.j.q(this);
                return this.C.F ? ng2.a : ng2.t;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
