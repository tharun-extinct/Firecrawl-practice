package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ut4 {
    public final xy1 g;
    public d5 j;
    public boolean r;
    public tt4 t;
    public final AtomicReference y = new AtomicReference(null);
    public final f n = new f(this, 28);
    public final s94 v = new s94(this, 9);
    public final rb3 x = new rb3(new tt4[16]);
    public final Object l = new Object();
    public long a = -1;

    public ut4(xy1 xy1Var) {
        this.g = xy1Var;
    }

    public final void g() {
        synchronized (this.l) {
            rb3 rb3Var = this.x;
            Object[] objArr = rb3Var.j;
            int i = rb3Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                tt4 tt4Var = (tt4) objArr[i2];
                tt4Var.v.g();
                tt4Var.x.g();
                tt4Var.q.g();
                tt4Var.w.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void n(Object obj, xy1 xy1Var, my1 my1Var) {
        rb3 rb3Var;
        Object obj2;
        tt4 tt4Var;
        boolean z;
        tt4 tt4Var2;
        long j;
        long j2;
        tt4 tt4Var3;
        at4 bd5Var;
        long j3;
        ta3 ta3Var;
        int i;
        long j4;
        ta3 ta3Var2;
        long j5 = zq2.j();
        synchronized (this.l) {
            rb3Var = this.x;
            Object[] objArr = rb3Var.j;
            int i2 = rb3Var.a;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((tt4) obj2).g == xy1Var) {
                    break;
                } else {
                    i3++;
                }
            }
            tt4Var = (tt4) obj2;
            z = true;
            if (tt4Var == null) {
                xy1Var.getClass();
                ue5.f(1, xy1Var);
                tt4Var = new tt4(xy1Var);
                rb3Var.y(tt4Var);
            }
            tt4Var2 = this.t;
            j = this.a;
        }
        Object obj3 = rb3Var;
        if (j != -1 && j != j5) {
            obj3 = rb3Var;
            String name = Thread.currentThread().getName();
            StringBuilder sb = new StringBuilder("Detected multithreaded access to SnapshotStateObserver: previousThreadId=");
            sb.append(j);
            sb.append("), currentThread={id=");
            sb.append(j5);
            sb.append(", name=");
            sb.append(name);
            sb.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            aw3.g(sb.toString());
            obj3 = sb;
        }
        try {
            obj3 = rb3Var;
            synchronized (this.l) {
                try {
                    this.t = tt4Var;
                    this.a = j5;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            s94 s94Var = this.v;
            Object obj4 = tt4Var.y;
            ta3 ta3Var3 = tt4Var.r;
            int i4 = tt4Var.n;
            tt4Var.y = obj;
            tt4Var.r = (ta3) tt4Var.x.l(obj);
            if (tt4Var.n == -1) {
                tt4Var.n = Long.hashCode(it4.j().l());
            }
            g02 g02Var = tt4Var.t;
            rb3 rb3VarG = pt4.g();
            try {
                rb3VarG.y(g02Var);
                if (s94Var == null) {
                    my1Var.g();
                    tt4Var3 = tt4Var;
                } else {
                    at4 at4Var = (at4) it4.y.i();
                    if (at4Var instanceof bd5) {
                        tt4Var3 = tt4Var;
                        if (((bd5) at4Var).z == zq2.j()) {
                            xy1 xy1Var2 = ((bd5) at4Var).p;
                            xy1 xy1Var3 = ((bd5) at4Var).u;
                            try {
                                ((bd5) at4Var).p = it4.t(s94Var, xy1Var2, true);
                                ((bd5) at4Var).u = xy1Var3;
                                my1Var.g();
                                ((bd5) at4Var).p = xy1Var2;
                                ((bd5) at4Var).u = xy1Var3;
                            } catch (Throwable th2) {
                                ((bd5) at4Var).p = xy1Var2;
                                ((bd5) at4Var).u = xy1Var3;
                                throw th2;
                            }
                        }
                    } else {
                        tt4Var3 = tt4Var;
                    }
                    if (at4Var == null || (at4Var instanceof nb3)) {
                        bd5Var = new bd5(at4Var instanceof nb3 ? (nb3) at4Var : null, s94Var, null, true, false);
                    } else {
                        bd5Var = at4Var.h(s94Var);
                    }
                    try {
                        at4 at4VarA = bd5Var.a();
                        try {
                            my1Var.g();
                            at4.s(at4VarA);
                            bd5Var.r();
                        } catch (Throwable th3) {
                            try {
                                at4.s(at4VarA);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    bd5Var.r();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    rb3VarG.w(rb3VarG.a - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                rb3VarG.w(rb3VarG.a - 1);
                tt4 tt4Var4 = tt4Var3;
                Object obj5 = tt4Var4.y;
                obj5.getClass();
                int i5 = tt4Var4.n;
                ta3 ta3Var4 = tt4Var4.r;
                if (ta3Var4 != null) {
                    try {
                        long[] jArr = ta3Var4.g;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j6 = jArr[i6];
                                boolean z2 = z;
                                ta3 ta3Var5 = ta3Var4;
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j6 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j6;
                                            ta3Var2 = ta3Var5;
                                            Object obj6 = ta3Var2.y[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = ta3Var2.r[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    tt4Var4.r(obj5, obj6);
                                                }
                                                if (z3) {
                                                    ta3Var2.x(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.l) {
                                                    this.t = tt4Var2;
                                                    this.a = j2;
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j6;
                                            ta3Var2 = ta3Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j7 = j3;
                                        ta3Var5 = ta3Var2;
                                        j6 = j4 >> 8;
                                        j = j7;
                                    }
                                    ta3Var = ta3Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    ta3Var = ta3Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                ta3Var4 = ta3Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.l) {
                            this.t = tt4Var2;
                            this.a = j2;
                        }
                        throw th;
                    }
                } else {
                    j3 = j;
                }
                tt4Var4.y = obj4;
                tt4Var4.r = ta3Var3;
                tt4Var4.n = i4;
                synchronized (this.l) {
                    this.t = tt4Var2;
                    this.a = j3;
                }
            } catch (Throwable th9) {
                th = th9;
                rb3VarG.w(rb3VarG.a - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final boolean r() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.l) {
            z = this.r;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.y;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        qo0.y("Unexpected notification");
                        l0.x();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.l) {
                rb3 rb3Var = this.x;
                Object[] objArr = rb3Var.j;
                int i = rb3Var.a;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((tt4) objArr[i2]).g(set) || z2;
                }
            }
        }
    }

    public final void v() {
        f fVar = this.n;
        it4.y(it4.g);
        synchronized (it4.r) {
            it4.j = cj0.x0(it4.j, fVar);
        }
        this.j = new d5(fVar, (byte) 7);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[Catch: all -> 0x008e, LOOP:1: B:14:0x002d->B:26:0x0074, LOOP_END, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:27:0x0078, B:29:0x0080, B:34:0x0090, B:31:0x0085, B:11:0x0021, B:14:0x002d, B:16:0x0041, B:18:0x004f, B:20:0x0059, B:22:0x0069, B:26:0x0074, B:35:0x0094), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:27:0x0078 BREAK  A[LOOP:1: B:14:0x002d->B:26:0x0074], SYNTHETIC] */
    public final void y(Object obj) {
        int i;
        synchronized (this.l) {
            try {
                rb3 rb3Var = this.x;
                int i2 = rb3Var.a;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = rb3Var.j;
                    if (i3 < i2) {
                        tt4 tt4Var = (tt4) objArr[i3];
                        ta3 ta3Var = (ta3) tt4Var.x.q(obj);
                        if (ta3Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = ta3Var.y;
                            int[] iArr = ta3Var.r;
                            long[] jArr = ta3Var.g;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j & 255) < 128) {
                                                int i8 = (i5 << 3) + i7;
                                                Object obj2 = objArr2[i8];
                                                int i9 = iArr[i8];
                                                tt4Var.r(obj, obj2);
                                            }
                                            j >>= 8;
                                        }
                                        if (i6 != 8) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    } else if (i5 != length) {
                                        break;
                                        break;
                                    } else {
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!tt4Var.x.a()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = rb3Var.j;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i10 = i2 - i4;
                        Arrays.fill(objArr, i10, i2, (Object) null);
                        rb3Var.a = i10;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
