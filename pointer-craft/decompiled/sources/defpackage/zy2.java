package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class zy2 extends us3 implements d83, qn3, v33 {
    public xy1 b;
    public xy1 c;
    public hb3 d;
    public final az2 f = new az2(this, 0);
    public boolean h;
    public bz1 i;
    public al k;
    public boolean o;
    public hb3 p;
    public ws3 s;
    public boolean u;
    public xy2 w;
    public hb3 z;
    public static final q21 e = new q21(26);
    public static final q21 A = new q21(27);

    public static void J0(gh3 gh3Var) {
        vm2 vm2Var;
        gh3 gh3Var2 = gh3Var.C;
        um2 um2Var = gh3Var.B;
        if (!yf2.p(gh3Var2 != null ? gh3Var2.B : null, um2Var)) {
            um2Var.N.b.F.l();
            return;
        }
        b7 b7VarB = um2Var.N.b.b();
        if (b7VarB == null || (vm2Var = ((s33) b7VarB).F) == null) {
            return;
        }
        vm2Var.l();
    }

    public boolean A() {
        return E0().J();
    }

    public abstract boolean A0();

    public abstract um2 E0();

    public abstract u33 F0();

    public abstract zy2 G0();

    public abstract long H0();

    public final xy2 I0() {
        xy2 xy2Var = this.w;
        if (xy2Var != null) {
            return xy2Var;
        }
        xy2 xy2Var2 = new xy2(this);
        this.w = xy2Var2;
        return xy2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0(ib3 ib3Var) {
        um2 um2Var;
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
                    if ((255 & j) < 128 && (um2Var = (um2) ((dn5) objArr[(i << 3) + i3]).get()) != null) {
                        if (u()) {
                            um2Var.U(false);
                        } else {
                            um2Var.W(false);
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

    public abstract void L0();

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:14:0x0033->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:1: B:14:0x0033->B:24:0x006a], SYNTHETIC] */
    public final void M0() {
        al alVar = this.k;
        if (alVar != null) {
            int i = alVar.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((i72[]) alVar.y)[i2] = null;
                ((float[]) alVar.r)[i2] = Float.NaN;
                ((byte[]) alVar.n)[i2] = 0;
            }
            alVar.g = 0;
        }
        hb3 hb3Var = this.d;
        if (hb3Var == null) {
            return;
        }
        Object[] objArr = hb3Var.r;
        long[] jArr = hb3Var.g;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            K0((ib3) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        hb3Var.g();
    }

    @Override // defpackage.v33
    public final u33 U(int i, int i2, Map map, xy1 xy1Var, xy1 xy1Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            mc2.y("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new yy2(i, i2, map, xy1Var, xy1Var2, this);
    }

    @Override // defpackage.us3
    public final int c0(v6 v6Var) {
        int iU0;
        if (!A0() || (iU0 = u0(v6Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = v6Var instanceof ek5;
        long j = this.q;
        return iU0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // defpackage.d83
    public final void q(boolean z) {
        zy2 zy2VarG0 = G0();
        um2 um2VarE0 = zy2VarG0 != null ? zy2VarG0.E0() : null;
        if (yf2.p(um2VarE0, E0())) {
            this.u = z;
            return;
        }
        if ((um2VarE0 != null ? um2VarE0.N.n : null) != qm2.a) {
            if ((um2VarE0 != null ? um2VarE0.N.n : null) != qm2.m) {
                return;
            }
        }
        this.u = z;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(um2 um2Var, i72 i72Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        hb3 hb3Var = this.d;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (hb3Var != null) {
            Object[] objArr = hb3Var.r;
            long[] jArr3 = hb3Var.g;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                ib3 ib3Var = (ib3) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = ib3Var.y;
                                long[] jArr4 = ib3Var.g;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    um2 um2Var2 = (um2) ((dn5) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (um2Var2 != null) {
                                                        boolean zJ = um2Var2.J();
                                                        i4 = i8;
                                                        if (zJ) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    ib3Var.w(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        hb3 hb3Var2 = this.d;
        if (hb3Var2 != null) {
            long[] jArr5 = hb3Var2.g;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((ib3) hb3Var2.r[i18]).l()) {
                                    hb3Var2.w(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        hb3 hb3Var3 = this.d;
        if (hb3Var3 == null) {
            hb3Var3 = new hb3();
            this.d = hb3Var3;
        }
        Object objL = hb3Var3.l(i72Var);
        if (objL == null) {
            objL = new ib3();
            hb3Var3.c(i72Var, objL);
        }
        ((ib3) objL).m(new dn5(um2Var));
    }

    public boolean u() {
        return false;
    }

    public abstract int u0(v6 v6Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(final ws3 ws3Var, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        um2 um2Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        sn3 snapshotObserver;
        hb3 hb3Var = this.d;
        al alVar = this.k;
        if (alVar == null) {
            alVar = new al();
            this.k = alVar;
        }
        al alVar2 = alVar;
        pn3 pn3Var = E0().h;
        if (pn3Var != null && (snapshotObserver = ((ba) pn3Var).getSnapshotObserver()) != null) {
            snapshotObserver.g.n(ws3Var, e, new my1() { // from class: wy2
                @Override // defpackage.my1
                public final Object g() {
                    zy2 zy2Var = this.j;
                    zy2Var.I0().j = false;
                    zy2Var.I0().t = j;
                    zy2Var.I0().a = j2;
                    xy1 xy1VarX = ws3Var.j.x();
                    if (xy1VarX != null) {
                        xy1VarX.a(zy2Var.I0());
                    }
                    return og5.g;
                }
            });
        }
        boolean zU = u();
        ib3 ib3Var = (ib3) alVar2.v;
        ib3 ib3Var2 = (ib3) alVar2.x;
        int i2 = alVar2.g;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) alVar2.n)[i3];
            if (b == 3) {
                i72 i72Var = ((i72[]) alVar2.y)[i3];
                i72Var.getClass();
                ib3Var2.m(i72Var);
            } else if (b != 0 && hb3Var != null) {
                i72 i72Var2 = ((i72[]) alVar2.y)[i3];
                i72Var2.getClass();
                ib3 ib3Var3 = (ib3) hb3Var.q(i72Var2);
                if (ib3Var3 != null) {
                    ib3Var.a(ib3Var3);
                }
            }
        }
        int i4 = alVar2.g;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) alVar2.n;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                i72[] i72VarArr = (i72[]) alVar2.y;
                i72VarArr[i6 - i5] = i72VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = alVar2.g;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((i72[]) alVar2.y)[i8] = null;
        }
        alVar2.g -= i5;
        zy2 zy2VarG0 = G0();
        Object[] objArr = ib3Var2.y;
        long[] jArr = ib3Var2.g;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            i72 i72Var3 = (i72) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            zy2 zy2Var = zy2VarG0 == null ? this : zy2VarG0;
                            i = i9;
                            zy2 zy2Var2 = zy2Var;
                            while (true) {
                                al alVar3 = zy2Var2.k;
                                if (alVar3 != null) {
                                    z2 = zU;
                                    if (pr.J((i72[]) alVar3.y, i72Var3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zU;
                                zy2 zy2VarG1 = zy2Var2.G0();
                                if (zy2VarG1 == null) {
                                    break;
                                }
                                zy2Var2 = zy2VarG1;
                                zU = z2;
                            }
                            hb3 hb3Var2 = zy2Var2.d;
                            ib3 ib3Var4 = hb3Var2 != null ? (ib3) hb3Var2.q(i72Var3) : null;
                            if (ib3Var4 != null) {
                                zy2Var.K0(ib3Var4);
                            }
                        } else {
                            z2 = zU;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zU = z2;
                    }
                    z = zU;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zU;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zU = z;
                i9 = 8;
            }
        } else {
            z = zU;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        ib3Var2.y();
        Object[] objArr2 = ib3Var.y;
        long[] jArr2 = ib3Var.g;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (um2Var = (um2) ((dn5) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                um2Var.U(false);
                            } else {
                                um2Var.W(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        ib3Var.y();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    public final void w0(u33 u33Var) {
        long j;
        char c;
        long j2;
        long j3;
        xy2 xy2Var;
        hb3 hb3Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z;
        al alVar;
        hb3 hb3Var2;
        ib3 ib3Var;
        xy2 xy2Var2;
        long j4;
        if (this.o) {
            return;
        }
        xy1 xy1VarX = u33Var.x();
        bz1 bz1VarV = u33Var.v();
        xy1 xy1VarL = u33Var.l();
        long jL = 0;
        if (bz1VarV == null) {
            long jY = 9223372034707292159L;
            if (xy1VarX == null) {
                M0();
                this.c = null;
                this.i = null;
                this.b = null;
                xy2 xy2Var3 = this.w;
                if (xy2Var3 != null) {
                    xy2Var3.j = false;
                }
                if (xy2Var3 != null) {
                    xy2Var3.t = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.i = null;
            this.b = null;
            boolean z2 = this.c != xy1VarX;
            if (!z2 && I0().j) {
                bl2 bl2VarZ0 = z0();
                jY = k33.Y(bl2VarZ0.g(0L));
                jL = bl2VarZ0.L();
                z2 = (je2.y(jY, I0().t) && qe2.g(jL, I0().a)) ? false : true;
            }
            if (z2) {
                ws3 ws3Var = this.s;
                if (ws3Var != null) {
                    ws3Var.j = u33Var;
                } else {
                    ws3Var = new ws3(u33Var, this, null);
                    this.s = ws3Var;
                }
                v0(ws3Var, jY, jL);
                this.c = u33Var.x();
                return;
            }
            return;
        }
        if (bz1VarV != this.i || xy1VarL != this.b) {
            this.i = bz1VarV;
            this.b = xy1VarL;
            M0();
            return;
        }
        hb3 hb3Var3 = this.z;
        long j5 = -9187201950435737472L;
        int i3 = 8;
        if (hb3Var3 != null) {
            Object[] objArr3 = hb3Var3.r;
            long[] jArr3 = hb3Var3.g;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                xy2Var2 = null;
                while (true) {
                    long j6 = jArr3[i4];
                    j3 = 255;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j6 & 255) < 128) {
                                j4 = j5;
                                xy2 xy2Var4 = (xy2) objArr3[(i4 << 3) + i6];
                                if (xy2Var4.j) {
                                    xy2Var2 = xy2Var4;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i6++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j5 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                xy2Var2 = null;
            }
            xy2Var = xy2Var2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            xy2Var = null;
        }
        if (xy2Var == null) {
            return;
        }
        bl2 bl2VarZ1 = z0();
        long jY2 = k33.Y(bl2VarZ1.g(0L));
        long jL2 = bl2VarZ1.L();
        if ((je2.y(jY2, xy2Var.t) && qe2.g(jL2, xy2Var.a)) || (hb3Var = this.z) == null) {
            return;
        }
        Object[] objArr4 = hb3Var.y;
        Object[] objArr5 = hb3Var.r;
        long[] jArr4 = hb3Var.g;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr4[i7];
            int i8 = length2;
            if ((((~j7) << c) & j7 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        xy2 xy2Var5 = (xy2) objArr5[i11];
                        i2 = i3;
                        i72 i72Var = (i72) obj;
                        jArr2 = jArr4;
                        if (xy2Var5.j) {
                            objArr2 = objArr4;
                            z = (qe2.g(xy2Var5.a, jL2) && je2.y(xy2Var5.t, jY2)) ? false : true;
                            xy2Var5.a = jL2;
                            xy2Var5.t = jY2;
                            xy2Var5.j = false;
                            if (!z) {
                                alVar = this.k;
                                if (alVar != null) {
                                    alVar.j(i72Var);
                                }
                                hb3Var2 = this.d;
                                if (hb3Var2 != null) {
                                    ib3Var = (ib3) hb3Var2.l(i72Var);
                                } else {
                                    ib3Var = null;
                                }
                                if (ib3Var != null) {
                                    K0(ib3Var);
                                    ib3Var.y();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        xy2Var5.a = jL2;
                        xy2Var5.t = jY2;
                        xy2Var5.j = false;
                        if (!z) {
                            alVar = this.k;
                            if (alVar != null) {
                                alVar.j(i72Var);
                            }
                            hb3Var2 = this.d;
                            if (hb3Var2 != null) {
                                ib3Var = (ib3) hb3Var2.l(i72Var);
                            } else {
                                ib3Var = null;
                            }
                            if (ib3Var != null) {
                                K0(ib3Var);
                                ib3Var.y();
                            }
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j7 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
    }

    public abstract zy2 x0();

    public abstract bl2 z0();
}
