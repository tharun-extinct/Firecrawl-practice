package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z51 extends xw4 implements bw4 {
    public final ot4 a;
    public y51 m = new y51(it4.j().l());
    public final my1 t;

    public z51(my1 my1Var, ot4 ot4Var) {
        this.t = my1Var;
        this.a = ot4Var;
    }

    @Override // defpackage.ww4
    public final void b(yw4 yw4Var) {
        this.m = (y51) yw4Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    public final y51 d(y51 y51Var, at4 at4Var, boolean z, my1 my1Var) {
        ot4 ot4Var;
        int i;
        y51 y51Var2 = y51Var;
        if (y51Var2.r(this, at4Var)) {
            if (z) {
                rb3 rb3VarG = pt4.g();
                Object[] objArr = rb3VarG.j;
                int i2 = rb3VarG.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((g02) objArr[i3]).y();
                }
                try {
                    ta3 ta3Var = y51Var2.v;
                    ro roVar = pt4.g;
                    oe2 oe2Var = (oe2) roVar.i();
                    if (oe2Var == null) {
                        oe2Var = new oe2();
                        roVar.W(oe2Var);
                    }
                    int i4 = oe2Var.g;
                    Object[] objArr2 = ta3Var.y;
                    int[] iArr = ta3Var.r;
                    long[] jArr = ta3Var.g;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        ww4 ww4Var = (ww4) objArr2[i9];
                                        i = i6;
                                        oe2Var.g = i4 + iArr[i9];
                                        xy1 xy1VarV = at4Var.v();
                                        if (xy1VarV != null) {
                                            xy1VarV.a(ww4Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    oe2Var.g = i4;
                } finally {
                    Object[] objArr3 = rb3VarG.j;
                    int i10 = rb3VarG.a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((g02) objArr3[i11]).g();
                    }
                }
            }
            return y51Var2;
        }
        ta3 ta3Var2 = new ta3();
        ro roVar2 = pt4.g;
        oe2 oe2Var2 = (oe2) roVar2.i();
        if (oe2Var2 == null) {
            oe2Var2 = new oe2();
            roVar2.W(oe2Var2);
        }
        int i12 = oe2Var2.g;
        rb3 rb3VarG2 = pt4.g();
        Object[] objArr4 = rb3VarG2.j;
        int i13 = rb3VarG2.a;
        for (int i14 = 0; i14 < i13; i14++) {
            ((g02) objArr4[i14]).y();
        }
        try {
            oe2Var2.g = i12 + 1;
            Object objP = js2.p(new x51(this, oe2Var2, ta3Var2, i12), my1Var);
            oe2Var2.g = i12;
            Object[] objArr5 = rb3VarG2.j;
            int i15 = rb3VarG2.a;
            for (int i16 = 0; i16 < i15; i16++) {
                ((g02) objArr5[i16]).g();
            }
            Object obj = it4.r;
            synchronized (obj) {
                try {
                    at4 at4VarJ = it4.j();
                    Object obj2 = y51Var2.x;
                    if (obj2 == y51.j || (ot4Var = this.a) == null || !ot4Var.r(objP, obj2)) {
                        y51 y51Var3 = this.m;
                        synchronized (obj) {
                            yw4 yw4VarM = it4.m(y51Var3, this);
                            yw4VarM.g(y51Var3);
                            yw4VarM.g = at4VarJ.l();
                            y51Var2 = (y51) yw4VarM;
                            y51Var2.v = ta3Var2;
                            y51Var2.l = y51Var2.n(this, at4VarJ);
                            y51Var2.x = objP;
                        }
                        return y51Var2;
                    }
                    y51Var2.v = ta3Var2;
                    y51Var2.l = y51Var2.n(this, at4VarJ);
                } catch (Throwable th) {
                    throw th;
                }
            }
            oe2 oe2Var3 = (oe2) pt4.g.i();
            if (oe2Var3 == null || oe2Var3.g != 0) {
                return y51Var2;
            }
            it4.j().w();
            synchronized (obj) {
                at4 at4VarJ2 = it4.j();
                y51Var2.r = at4VarJ2.l();
                y51Var2.n = at4VarJ2.j();
                return y51Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = rb3VarG2.j;
            int i17 = rb3VarG2.a;
            for (int i18 = 0; i18 < i17; i18++) {
                ((g02) objArr6[i18]).g();
            }
            throw th2;
        }
    }

    public final y51 e() {
        at4 at4VarJ = it4.j();
        return d((y51) it4.l(this.m, at4VarJ), at4VarJ, false, this.t);
    }

    @Override // defpackage.bw4
    public final Object getValue() {
        xy1 xy1VarV = it4.j().v();
        if (xy1VarV != null) {
            xy1VarV.a(this);
        }
        at4 at4VarJ = it4.j();
        return d((y51) it4.l(this.m, at4VarJ), at4VarJ, true, this.t).x;
    }

    @Override // defpackage.ww4
    public final yw4 n() {
        return this.m;
    }

    public final String toString() {
        y51 y51Var = (y51) it4.x(this.m);
        return "DerivedState(value=" + (y51Var.r(this, it4.j()) ? String.valueOf(y51Var.x) : "<Not calculated>") + ")@" + hashCode();
    }
}
