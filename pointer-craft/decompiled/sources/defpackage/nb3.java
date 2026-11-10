package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class nb3 extends at4 {
    public static final int[] c = new int[0];
    public gt4 a;
    public ib3 j;
    public int l;
    public int[] m;
    public int q;
    public ArrayList t;
    public final xy1 v;
    public boolean w;
    public final xy1 x;

    public nb3(long j, gt4 gt4Var, xy1 xy1Var, xy1 xy1Var2) {
        super(j, gt4Var);
        this.v = xy1Var;
        this.x = xy1Var2;
        this.a = gt4.q;
        this.m = c;
        this.q = 1;
    }

    public final void A(long j) {
        synchronized (it4.r) {
            this.a = this.a.x(j);
        }
    }

    public void B(ib3 ib3Var) {
        this.j = ib3Var;
    }

    public nb3 C(xy1 xy1Var, xy1 xy1Var2) {
        vf3 vf3Var;
        if (this.r) {
            aw3.g("Cannot use a disposed snapshot");
        }
        if (this.w && this.n < 0) {
            aw3.y("Unsupported operation on a disposed or applied snapshot");
        }
        A(l());
        Object obj = it4.r;
        synchronized (obj) {
            long j = it4.v;
            it4.v = j + 1;
            it4.n = it4.n.x(j);
            gt4 gt4VarN = n();
            p(gt4VarN.x(j));
            vf3Var = new vf3(j, it4.g(gt4VarN, l() + 1, j), it4.t(xy1Var, v(), true), it4.a(xy1Var2, t()), this);
        }
        if (this.w || this.r) {
            return vf3Var;
        }
        long jL = l();
        synchronized (obj) {
            long j2 = it4.v;
            it4.v = j2 + 1;
            u(j2);
            it4.n = it4.n.x(l());
        }
        p(it4.g(n(), jL + 1, l()));
        return vf3Var;
    }

    @Override // defpackage.at4
    public final void b() {
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            it4.z(this.m[i]);
        }
        i();
    }

    @Override // defpackage.at4
    public void c(ww4 ww4Var) {
        ib3 ib3VarK = k();
        if (ib3VarK == null) {
            ib3 ib3Var = fe4.g;
            ib3VarK = new ib3();
            B(ib3VarK);
        }
        ib3VarK.g(ww4Var);
    }

    @Override // defpackage.at4
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public xy1 v() {
        return this.v;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final xs2 e(long j, ib3 ib3Var, HashMap map, gt4 gt4Var) {
        ArrayList arrayList;
        ArrayList arrayListW0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        ww4 ww4Var;
        yw4 yw4Var;
        gt4 gt4Var2;
        Object[] objArr;
        long[] jArr;
        gt4 gt4Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        yw4 yw4VarL;
        gt4 gt4VarV = n().x(l()).v(this.a);
        Object[] objArr3 = ib3Var.y;
        long[] jArr3 = ib3Var.g;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListW0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            ww4 ww4Var2 = (ww4) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            yw4 yw4VarN = ww4Var2.n();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            yw4 yw4VarP = it4.p(yw4VarN, j, gt4Var);
                            if (yw4VarP == null) {
                                arrayList4 = arrayListW0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListW0;
                                j2 = j3;
                                yw4 yw4VarP2 = it4.p(yw4VarN, l(), gt4VarV);
                                if (yw4VarP2 != null && yw4VarP2.g != 1 && !yw4VarP.equals(yw4VarP2)) {
                                    gt4Var3 = gt4VarV;
                                    yw4 yw4VarP3 = it4.p(yw4VarN, l(), n());
                                    if (yw4VarP3 == null) {
                                        it4.s();
                                        throw null;
                                    }
                                    if (map == null || (yw4VarL = (yw4) map.get(yw4VarP)) == null) {
                                        yw4VarL = ww4Var2.l(yw4VarP2, yw4VarP, yw4VarP3);
                                    }
                                    if (yw4VarL == null) {
                                        return new ct4(this);
                                    }
                                    if (!yw4VarL.equals(yw4VarP3)) {
                                        if (yw4VarL.equals(yw4VarP)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new fp3(ww4Var2, yw4VarP.y(l())));
                                            arrayListW0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListW0.add(ww4Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!yw4VarL.equals(yw4VarP2) ? new fp3(ww4Var2, yw4VarL) : new fp3(ww4Var2, yw4VarP2.y(l())));
                                        }
                                    }
                                    arrayListW0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListW0 = arrayList4;
                            }
                            gt4Var3 = gt4VarV;
                            arrayList2 = arrayList5;
                            arrayListW0 = arrayList4;
                        } else {
                            gt4Var3 = gt4VarV;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        gt4VarV = gt4Var3;
                    }
                    gt4Var2 = gt4VarV;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    gt4Var2 = gt4VarV;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    gt4VarV = gt4Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                o();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    fp3 fp3Var = (fp3) arrayList2.get(i2);
                    ww4Var = (ww4) fp3Var.j;
                    yw4Var = (yw4) fp3Var.t;
                    yw4Var.g = j;
                    synchronized (it4.r) {
                        yw4Var.y = ww4Var.n();
                        ww4Var.b(yw4Var);
                    }
                }
            }
            if (arrayListW0 != null) {
                size = arrayListW0.size();
                for (i = 0; i < size; i++) {
                    ib3Var.q((ww4) arrayListW0.get(i));
                }
                arrayList3 = this.t;
                if (arrayList3 != null) {
                    arrayListW0 = cj0.w0(arrayList3, arrayListW0);
                }
                this.t = arrayListW0;
            }
            return dt4.r;
        }
        arrayList = null;
        arrayListW0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            o();
            size2 = arrayList2.size();
            while (i2 < size2) {
                fp3 fp3Var2 = (fp3) arrayList2.get(i2);
                ww4Var = (ww4) fp3Var2.j;
                yw4Var = (yw4) fp3Var2.t;
                yw4Var.g = j;
                synchronized (it4.r) {
                    yw4Var.y = ww4Var.n();
                    ww4Var.b(yw4Var);
                }
            }
        }
        if (arrayListW0 != null) {
            size = arrayListW0.size();
            while (i < size) {
                ib3Var.q((ww4) arrayListW0.get(i));
            }
            arrayList3 = this.t;
            if (arrayList3 != null) {
                arrayListW0 = cj0.w0(arrayList3, arrayListW0);
            }
            this.t = arrayListW0;
        }
        return dt4.r;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    public xs2 f() {
        HashMap mapW;
        List list;
        ib3 ib3Var;
        long j;
        long j2;
        ib3 ib3VarK = k();
        if (ib3VarK != null) {
            long j3 = it4.a.y;
            mapW = it4.w(j3, this, it4.n.y(j3));
        } else {
            mapW = null;
        }
        pi1 pi1Var = pi1.j;
        synchronized (it4.r) {
            try {
                it4.o(this);
                if (ib3VarK == null || ib3VarK.n == 0) {
                    y();
                    d32 d32Var = it4.a;
                    ib3 ib3Var2 = d32Var.j;
                    it4.h(d32Var, it4.g);
                    if (ib3Var2 == null || !ib3Var2.j()) {
                        list = pi1Var;
                        ib3Var = null;
                    } else {
                        list = it4.j;
                        ib3Var = ib3Var2;
                    }
                } else {
                    d32 d32Var2 = it4.a;
                    xs2 xs2VarE = e(it4.v, ib3VarK, mapW, it4.n.y(d32Var2.y));
                    if (!xs2VarE.equals(dt4.r)) {
                        return xs2VarE;
                    }
                    y();
                    ib3Var = d32Var2.j;
                    it4.h(d32Var2, it4.g);
                    B(null);
                    d32Var2.j = null;
                    list = it4.j;
                }
                this.w = true;
                if (ib3Var != null) {
                    ge4 ge4Var = new ge4(ib3Var);
                    if (!ib3Var.l()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((bz1) list.get(i)).l(ge4Var, this);
                        }
                    }
                }
                if (ib3VarK != null && ib3VarK.j()) {
                    ge4 ge4Var2 = new ge4(ib3VarK);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((bz1) list.get(i2)).l(ge4Var2, this);
                    }
                }
                synchronized (it4.r) {
                    try {
                        b();
                        it4.n();
                        if (ib3Var != null) {
                            Object[] objArr = ib3Var.y;
                            long[] jArr = ib3Var.g;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                it4.b((ww4) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (ib3VarK != null) {
                            Object[] objArr2 = ib3VarK.y;
                            long[] jArr2 = ib3VarK.g;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                it4.b((ww4) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.t;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                it4.b((ww4) arrayList.get(i9));
                            }
                        }
                        this.t = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return dt4.r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.at4
    public at4 h(xy1 xy1Var) {
        wf3 wf3Var;
        if (this.r) {
            aw3.g("Cannot use a disposed snapshot");
        }
        if (this.w && this.n < 0) {
            aw3.y("Unsupported operation on a disposed or applied snapshot");
        }
        long jL = l();
        A(l());
        Object obj = it4.r;
        synchronized (obj) {
            long j = it4.v;
            it4.v = j + 1;
            it4.n = it4.n.x(j);
            wf3Var = new wf3(j, it4.g(n(), jL + 1, j), it4.t(xy1Var, v(), true), this);
        }
        if (this.w || this.r) {
            return wf3Var;
        }
        long jL2 = l();
        synchronized (obj) {
            long j2 = it4.v;
            it4.v = j2 + 1;
            u(j2);
            it4.n = it4.n.x(l());
        }
        p(it4.g(n(), jL2 + 1, l()));
        return wf3Var;
    }

    @Override // defpackage.at4
    public int j() {
        return this.l;
    }

    public ib3 k() {
        return this.j;
    }

    @Override // defpackage.at4
    public void m() {
        this.q++;
    }

    public final void o() {
        A(l());
        if (this.w || this.r) {
            return;
        }
        long jL = l();
        synchronized (it4.r) {
            long j = it4.v;
            it4.v = j + 1;
            u(j);
            it4.n = it4.n.x(l());
        }
        p(it4.g(n(), jL + 1, l()));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // defpackage.at4
    public void q() {
        if (this.q <= 0) {
            aw3.g("no pending nested snapshots");
        }
        int i = this.q - 1;
        this.q = i;
        if (i != 0 || this.w) {
            return;
        }
        ib3 ib3VarK = k();
        if (ib3VarK != null) {
            if (this.w) {
                aw3.y("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jL = l();
            Object[] objArr = ib3VarK.y;
            long[] jArr = ib3VarK.g;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (yw4 yw4VarN = ((ww4) objArr[(i2 << 3) + i4]).n(); yw4VarN != null; yw4VarN = yw4VarN.y) {
                                    long j2 = yw4VarN.g;
                                    if (j2 == jL || cj0.f0(this.a, Long.valueOf(j2))) {
                                        nd4 nd4Var = it4.g;
                                        yw4VarN.g = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        g();
    }

    @Override // defpackage.at4
    public void r() {
        if (this.r) {
            return;
        }
        this.r = true;
        synchronized (it4.r) {
            i();
        }
        q();
    }

    @Override // defpackage.at4
    public xy1 t() {
        return this.x;
    }

    @Override // defpackage.at4
    public void w() {
        if (this.w || this.r) {
            return;
        }
        o();
    }

    @Override // defpackage.at4
    public final void y() {
        it4.n = it4.n.y(l()).g(this.a);
    }

    @Override // defpackage.at4
    public void z(int i) {
        this.l = i;
    }
}
