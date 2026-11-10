package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class it4 {
    public static final d32 a;
    public static List j;
    public static final bm l;
    public static final bs m;
    public static gt4 n;
    public static List t;
    public static long v;
    public static final sf x;
    public static final nd4 g = new nd4(22);
    public static final ro y = new ro((byte) 25);
    public static final Object r = new Object();

    static {
        gt4 gt4Var = gt4.q;
        n = gt4Var;
        v = 2L;
        sf sfVar = new sf();
        sfVar.n = new long[16];
        sfVar.y = new int[16];
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        sfVar.v = iArr;
        x = sfVar;
        bm bmVar = new bm();
        bmVar.y = new int[16];
        bmVar.r = new en5[16];
        l = bmVar;
        pi1 pi1Var = pi1.j;
        j = pi1Var;
        t = pi1Var;
        long j2 = v;
        v = 1 + j2;
        d32 d32Var = new d32(j2, gt4Var, null, new q21((byte) 19));
        n = n.x(d32Var.y);
        a = d32Var;
        m = new bs(0);
    }

    public static final xy1 a(xy1 xy1Var, xy1 xy1Var2) {
        if (xy1Var == null || xy1Var2 == null || xy1Var == xy1Var2) {
            return xy1Var == null ? xy1Var2 : xy1Var;
        }
        return new ht4(xy1Var, xy1Var2, (byte) 1);
    }

    public static final void b(ww4 ww4Var) {
        if (i(ww4Var)) {
            bm bmVar = l;
            int i = bmVar.g;
            int iIdentityHashCode = System.identityHashCode(ww4Var);
            int i2 = -1;
            if (i > 0) {
                int i3 = bmVar.g - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) bmVar.y)[i5];
                    if (i6 < iIdentityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > iIdentityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        en5 en5Var = ((en5[]) bmVar.r)[i5];
                        if (ww4Var == (en5Var != null ? en5Var.get() : null)) {
                            i2 = i5;
                            break;
                        }
                        int i7 = i5 - 1;
                        while (true) {
                            if (-1 >= i7 || ((int[]) bmVar.y)[i7] != iIdentityHashCode) {
                                i5++;
                                int i8 = bmVar.g;
                                while (true) {
                                    if (i5 >= i8) {
                                        i2 = -(bmVar.g + 1);
                                        break;
                                    }
                                    if (((int[]) bmVar.y)[i5] != iIdentityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    en5 en5Var2 = ((en5[]) bmVar.r)[i5];
                                    if ((en5Var2 != null ? en5Var2.get() : null) == ww4Var) {
                                        i2 = i5;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                en5 en5Var3 = ((en5[]) bmVar.r)[i7];
                                if ((en5Var3 != null ? en5Var3.get() : null) == ww4Var) {
                                    i2 = i7;
                                    break;
                                }
                                i7--;
                            }
                        }
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            en5[] en5VarArr = (en5[]) bmVar.r;
            int length = en5VarArr.length;
            if (i == length) {
                int i10 = length * 2;
                en5[] en5VarArr2 = new en5[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(en5VarArr, i9, en5VarArr2, i11, i - i9);
                System.arraycopy((en5[]) bmVar.r, 0, en5VarArr2, 0, i9);
                pr.M(i11, i9, i, (int[]) bmVar.y, iArr);
                pr.P(0, i9, 6, (int[]) bmVar.y, iArr);
                bmVar.r = en5VarArr2;
                bmVar.y = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(en5VarArr, i9, en5VarArr, i12, i - i9);
                int[] iArr2 = (int[]) bmVar.y;
                pr.M(i12, i9, i, iArr2, iArr2);
            }
            ((en5[]) bmVar.r)[i9] = new en5(ww4Var);
            ((int[]) bmVar.y)[i9] = iIdentityHashCode;
            bmVar.g++;
        }
    }

    public static final yw4 c(yw4 yw4Var, xw4 xw4Var, at4 at4Var, yw4 yw4Var2) {
        yw4 yw4VarM;
        if (at4Var.x()) {
            at4Var.c(xw4Var);
        }
        long jL = at4Var.l();
        if (yw4Var2.g == jL) {
            return yw4Var2;
        }
        synchronized (r) {
            yw4VarM = m(yw4Var, xw4Var);
        }
        yw4VarM.g = jL;
        at4Var.c(xw4Var);
        return yw4VarM;
    }

    public static final yw4 f(yw4 yw4Var, ww4 ww4Var, at4 at4Var) {
        yw4 yw4VarP;
        yw4 yw4VarP2;
        if (at4Var.x()) {
            at4Var.c(ww4Var);
        }
        long jL = at4Var.l();
        yw4 yw4VarP3 = p(yw4Var, jL, at4Var.n());
        if (yw4VarP3 == null) {
            synchronized (r) {
                at4 at4VarJ = j();
                yw4 yw4VarN = ww4Var.n();
                yw4VarN.getClass();
                yw4VarP2 = p(yw4VarN, at4VarJ.l(), at4VarJ.n());
                if (yw4VarP2 == null) {
                    s();
                    throw null;
                }
            }
            yw4VarP3 = yw4VarP2;
        }
        if (yw4VarP3.g == at4Var.l()) {
            return yw4VarP3;
        }
        synchronized (r) {
            yw4VarP = p(ww4Var.n(), jL, at4Var.n());
            if (yw4VarP == null) {
                s();
                throw null;
            }
            if (yw4VarP.g != jL) {
                yw4 yw4VarM = m(yw4VarP, ww4Var);
                yw4VarM.g(yw4VarP);
                yw4VarM.g = at4Var.l();
                yw4VarP = yw4VarM;
            }
        }
        at4Var.c(ww4Var);
        return yw4VarP;
    }

    public static final gt4 g(gt4 gt4Var, long j2, long j3) {
        while (yf2.k(j2, j3) < 0) {
            gt4Var = gt4Var.x(j2);
            j2++;
        }
        return gt4Var;
    }

    public static final Object h(d32 d32Var, xy1 xy1Var) {
        long j2 = d32Var.y;
        Object objA = xy1Var.a(n.y(j2));
        long j3 = v;
        v = 1 + j3;
        gt4 gt4VarY = n.y(j2);
        n = gt4VarY;
        d32Var.y = j3;
        d32Var.g = gt4VarY;
        d32Var.l = 0;
        d32Var.j = null;
        d32Var.i();
        n = n.x(j3);
        return objA;
    }

    public static final boolean i(ww4 ww4Var) {
        yw4 yw4Var;
        long j2 = v;
        sf sfVar = x;
        if (sfVar.g > 0) {
            j2 = ((long[]) sfVar.n)[0];
        }
        yw4 yw4Var2 = null;
        yw4 yw4VarN = null;
        int i = 0;
        for (yw4 yw4VarN2 = ww4Var.n(); yw4VarN2 != null; yw4VarN2 = yw4VarN2.y) {
            long j3 = yw4VarN2.g;
            if (j3 != 0) {
                if (yf2.k(j3, j2) >= 0) {
                    i++;
                } else if (yw4Var2 == null) {
                    i++;
                    yw4Var2 = yw4VarN2;
                } else {
                    if (yf2.k(yw4VarN2.g, yw4Var2.g) < 0) {
                        yw4Var = yw4Var2;
                        yw4Var2 = yw4VarN2;
                    } else {
                        yw4Var = yw4VarN2;
                    }
                    if (yw4VarN == null) {
                        yw4VarN = ww4Var.n();
                        yw4 yw4Var3 = yw4VarN;
                        while (true) {
                            if (yw4VarN == null) {
                                yw4VarN = yw4Var3;
                                break;
                            }
                            if (yf2.k(yw4VarN.g, j2) >= 0) {
                                break;
                            }
                            if (yf2.k(yw4Var3.g, yw4VarN.g) < 0) {
                                yw4Var3 = yw4VarN;
                            }
                            yw4VarN = yw4VarN.y;
                        }
                    }
                    yw4Var2.g = 0L;
                    yw4Var2.g(yw4VarN);
                    yw4Var2 = yw4Var;
                }
            }
        }
        return i > 1;
    }

    public static final at4 j() {
        at4 at4Var = (at4) y.i();
        return at4Var == null ? a : at4Var;
    }

    public static final yw4 l(yw4 yw4Var, at4 at4Var) {
        yw4 yw4VarP;
        yw4 yw4VarP2 = p(yw4Var, at4Var.l(), at4Var.n());
        if (yw4VarP2 != null) {
            return yw4VarP2;
        }
        synchronized (r) {
            yw4VarP = p(yw4Var, at4Var.l(), at4Var.n());
        }
        if (yw4VarP != null) {
            return yw4VarP;
        }
        s();
        throw null;
    }

    public static final yw4 m(yw4 yw4Var, ww4 ww4Var) {
        long j2 = v;
        sf sfVar = x;
        if (sfVar.g > 0) {
            j2 = ((long[]) sfVar.n)[0];
        }
        long j3 = j2 - 1;
        yw4 yw4Var2 = null;
        yw4 yw4Var3 = null;
        for (yw4 yw4VarN = ww4Var.n(); yw4VarN != null; yw4VarN = yw4VarN.y) {
            long j4 = yw4VarN.g;
            if (j4 != 0) {
                if (j4 != 0 && yf2.k(j4, j3) <= 0 && !gt4.q.n(j4)) {
                    if (yw4Var3 != null) {
                        if (yf2.k(yw4VarN.g, yw4Var3.g) >= 0) {
                            yw4Var2 = yw4Var3;
                            break;
                        }
                        break;
                    }
                    yw4Var3 = yw4VarN;
                }
            }
            yw4Var2 = yw4VarN;
            break;
        }
        if (yw4Var2 != null) {
            yw4Var2.g = Long.MAX_VALUE;
            return yw4Var2;
        }
        yw4 yw4VarY = yw4Var.y(Long.MAX_VALUE);
        yw4VarY.y = ww4Var.n();
        ww4Var.b(yw4VarY);
        return yw4VarY;
    }

    public static final void n() {
        bm bmVar = l;
        int i = bmVar.g;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            en5 en5Var = ((en5[]) bmVar.r)[i2];
            Object obj = en5Var != null ? en5Var.get() : null;
            if (obj != null && i((ww4) obj)) {
                if (i3 != i2) {
                    ((en5[]) bmVar.r)[i3] = en5Var;
                    int[] iArr = (int[]) bmVar.y;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((en5[]) bmVar.r)[i4] = null;
            ((int[]) bmVar.y)[i4] = 0;
        }
        if (i3 != i) {
            bmVar.g = i3;
        }
    }

    public static final void o(at4 at4Var) {
        Long lValueOf;
        if (n.n(at4Var.l())) {
            return;
        }
        long jL = at4Var.l();
        boolean z = at4Var.r;
        nb3 nb3Var = at4Var instanceof nb3 ? (nb3) at4Var : null;
        Object objValueOf = nb3Var != null ? Boolean.valueOf(nb3Var.w) : "read-only";
        synchronized (r) {
            sf sfVar = x;
            lValueOf = Long.valueOf(sfVar.g > 0 ? ((long[]) sfVar.n)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jL + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final yw4 p(yw4 yw4Var, long j2, gt4 gt4Var) {
        yw4 yw4Var2 = null;
        while (yw4Var != null) {
            long j3 = yw4Var.g;
            if (j3 != 0 && yf2.k(j3, j2) <= 0 && !gt4Var.n(j3) && (yw4Var2 == null || yf2.k(yw4Var2.g, yw4Var.g) < 0)) {
                yw4Var2 = yw4Var;
            }
            yw4Var = yw4Var.y;
        }
        if (yw4Var2 != null) {
            return yw4Var2;
        }
        return null;
    }

    public static final void q(at4 at4Var, ww4 ww4Var) {
        at4Var.z(at4Var.j() + 1);
        xy1 xy1VarT = at4Var.t();
        if (xy1VarT != null) {
            xy1VarT.a(ww4Var);
        }
    }

    public static final void r() {
        y(g);
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final xy1 t(xy1 xy1Var, xy1 xy1Var2, boolean z) {
        if (!z) {
            xy1Var2 = null;
        }
        if (xy1Var == null || xy1Var2 == null || xy1Var == xy1Var2) {
            return xy1Var == null ? xy1Var2 : xy1Var;
        }
        return new ht4(xy1Var, xy1Var2, (byte) 0);
    }

    public static final yw4 u(yw4 yw4Var, ww4 ww4Var) {
        yw4 yw4VarP;
        at4 at4VarJ = j();
        xy1 xy1VarV = at4VarJ.v();
        if (xy1VarV != null) {
            xy1VarV.a(ww4Var);
        }
        yw4 yw4VarP2 = p(yw4Var, at4VarJ.l(), at4VarJ.n());
        if (yw4VarP2 != null) {
            return yw4VarP2;
        }
        synchronized (r) {
            at4 at4VarJ2 = j();
            yw4 yw4VarN = ww4Var.n();
            yw4VarN.getClass();
            yw4VarP = p(yw4VarN, at4VarJ2.l(), at4VarJ2.n());
            if (yw4VarP == null) {
                s();
                throw null;
            }
        }
        return yw4VarP;
    }

    public static final at4 v(at4 at4Var, xy1 xy1Var, boolean z) {
        boolean z2 = at4Var instanceof nb3;
        if (z2 || at4Var == null) {
            return new bd5(z2 ? (nb3) at4Var : null, xy1Var, null, false, z);
        }
        return new cd5(at4Var, xy1Var, false, z);
    }

    public static final HashMap w(long j2, nb3 nb3Var, gt4 gt4Var) {
        long[] jArr;
        gt4 gt4Var2;
        long[] jArr2;
        int i;
        int i2;
        yw4 yw4VarP;
        ib3 ib3VarK = nb3Var.k();
        if (ib3VarK != null) {
            long jL = nb3Var.l();
            gt4 gt4VarV = nb3Var.n().x(jL).v(nb3Var.a);
            Object[] objArr = ib3VarK.y;
            long[] jArr3 = ib3VarK.g;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j3 & 255) < 128) {
                                ww4 ww4Var = (ww4) objArr[(i3 << 3) + i6];
                                yw4 yw4VarN = ww4Var.n();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                yw4 yw4VarP2 = p(yw4VarN, j2, gt4Var);
                                if (yw4VarP2 != null && (yw4VarP = p(yw4VarN, jL, gt4VarV)) != null && !yw4VarP2.equals(yw4VarP)) {
                                    yw4 yw4VarP3 = p(yw4VarN, jL, nb3Var.n());
                                    if (yw4VarP3 == null) {
                                        s();
                                        throw null;
                                    }
                                    yw4 yw4VarL = ww4Var.l(yw4VarP, yw4VarP2, yw4VarP3);
                                    if (yw4VarL == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(yw4VarP2, yw4VarL);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                            }
                            j3 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            gt4VarV = gt4VarV;
                        }
                        jArr = jArr3;
                        gt4Var2 = gt4VarV;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        gt4Var2 = gt4VarV;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    gt4VarV = gt4Var2;
                }
            }
        }
        return null;
    }

    public static final yw4 x(yw4 yw4Var) {
        yw4 yw4VarP;
        at4 at4VarJ = j();
        yw4 yw4VarP2 = p(yw4Var, at4VarJ.l(), at4VarJ.n());
        if (yw4VarP2 != null) {
            return yw4VarP2;
        }
        synchronized (r) {
            at4 at4VarJ2 = j();
            yw4VarP = p(yw4Var, at4VarJ2.l(), at4VarJ2.n());
        }
        if (yw4VarP != null) {
            return yw4VarP;
        }
        s();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    public static final Object y(xy1 xy1Var) {
        ib3 ib3Var;
        Object objH;
        d32 d32Var = a;
        synchronized (r) {
            try {
                ib3Var = d32Var.j;
                if (ib3Var != null) {
                    m.addAndGet(1);
                }
                objH = h(d32Var, xy1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ib3Var != null) {
            try {
                List list = j;
                ge4 ge4Var = new ge4(ib3Var);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((bz1) list.get(i)).l(ge4Var, d32Var);
                }
                m.addAndGet(-1);
            } catch (Throwable th2) {
                m.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (r) {
            n();
            if (ib3Var != null) {
                Object[] objArr = ib3Var.y;
                long[] jArr = ib3Var.g;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j2) < 128) {
                                    b((ww4) objArr[(i2 << 3) + i4]);
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return objH;
    }

    public static final void z(int i) {
        sf sfVar = x;
        int i2 = ((int[]) sfVar.v)[i];
        sfVar.r(i2, sfVar.g - 1);
        sfVar.g--;
        long[] jArr = (long[]) sfVar.n;
        long j2 = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (yf2.k(jArr[i4], j2) <= 0) {
                break;
            }
            sfVar.r(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) sfVar.n;
        int i5 = sfVar.g >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < sfVar.g && yf2.k(jArr2[i6], jArr2[i7]) < 0) {
                if (yf2.k(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                sfVar.r(i6, i2);
                i2 = i6;
            } else {
                if (yf2.k(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                sfVar.r(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) sfVar.v)[i] = sfVar.r;
        sfVar.r = i;
    }
}
