package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m44 {
    public long a;
    public final he2 g;
    public boolean j;
    public boolean l;
    public final gf m;
    public final e95 n;
    public final gb3 q;
    public final bm r;
    public n9 t;
    public final xa3 v;
    public boolean x;
    public final ba y;

    public m44(ha3 ha3Var, ba baVar) {
        this.g = ha3Var;
        this.y = baVar;
        bm bmVar = new bm();
        bmVar.y = new long[192];
        bmVar.r = new long[192];
        this.r = bmVar;
        this.n = new e95();
        this.v = new xa3();
        this.a = -1L;
        this.m = new gf((Object) this, (byte) 26);
        this.q = new gb3();
    }

    public static boolean r(gh3 gh3Var) {
        on3 on3Var = gh3Var.a0;
        return (on3Var == null || sp2.z(((a42) on3Var).y())) ? false : true;
    }

    public static void t(um2 um2Var) {
        if (!um2Var.a || r(um2Var.M.n)) {
            return;
        }
        um2Var.a = false;
        if (um2Var.q) {
            um2Var.m = x(um2Var);
            um2Var.q = false;
        }
        if (je2.y(um2Var.m, 9223372034707292159L)) {
            return;
        }
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i = rb3VarB.a;
        for (int i2 = 0; i2 < i; i2++) {
            t((um2) objArr[i2]);
        }
    }

    public static long x(um2 um2Var) {
        ah3 ah3Var = um2Var.M;
        gh3 gh3Var = ah3Var.n;
        long jN = 0;
        for (gh3 gh3Var2 = ah3Var.r; gh3Var2 != null && gh3Var2 != gh3Var; gh3Var2 = gh3Var2.D) {
            if (r(gh3Var2)) {
                return 9223372034707292159L;
            }
            jN = je2.n(jN, gh3Var2.M);
        }
        return jN;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a() {
        n9 n9Var = this.t;
        boolean z = n9Var != null;
        long j = this.n.r;
        if (j >= 0 || !z) {
            if (this.a == j && z) {
                return;
            }
            ba baVar = this.y;
            if (n9Var != null) {
                baVar.removeCallbacks(n9Var);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.a = jMax;
            n9 n9Var2 = new n9(this.m, (byte) 1);
            baVar.postDelayed(n9Var2, jMax - jCurrentTimeMillis);
            this.t = n9Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0242  */
    /* JADX WARN: Code duplicated, block: B:103:0x024b A[LOOP:11: B:102:0x0249->B:103:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0256 A[LOOP:9: B:95:0x0225->B:107:0x0256, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x025d A[ADDED_TO_REGION, LOOP:12: B:110:0x025d->B:111:0x025f, LOOP_START, PHI: r1
  0x025d: PHI (r1v8 d95) = (r1v7 d95), (r1v9 d95) binds: [B:109:0x025b, B:111:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x025f A[LOOP:12: B:110:0x025d->B:111:0x025f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x026a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0259 A[EDGE_INSN: B:136:0x0259->B:108:0x0259 BREAK  A[LOOP:9: B:95:0x0225->B:107:0x0256], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0259 A[EDGE_INSN: B:137:0x0259->B:108:0x0259 BREAK  A[LOOP:9: B:95:0x0225->B:107:0x0256], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0189 A[ADDED_TO_REGION, LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_START, PHI: r3
  0x0189: PHI (r3v6 d95) = (r3v5 d95), (r3v7 d95) binds: [B:72:0x0187, B:74:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x018b A[LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0211  */
    /* JADX WARN: Code duplicated, block: B:92:0x0219  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Code duplicated, block: B:97:0x0231  */
    /* JADX WARN: Code duplicated, block: B:99:0x023c  */
    public final void g() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        long j4;
        Object[] objArr;
        long[] jArr;
        int length;
        d95 d95Var;
        int i3;
        long j5;
        int i4;
        long j6;
        int i5;
        d95 d95Var2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j7;
        long j8;
        float[] fArr;
        d95 d95Var3;
        long[] jArr4;
        long j9;
        long j10;
        n9 n9Var = this.t;
        if (n9Var != null) {
            this.y.removeCallbacks(n9Var);
            this.t = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.x;
        boolean z3 = z2 || this.l;
        bm bmVar = this.r;
        boolean z4 = true;
        e95 e95Var = this.n;
        if (z2) {
            this.x = false;
            xa3 xa3Var = this.v;
            Object[] objArr2 = xa3Var.g;
            int i9 = xa3Var.y;
            for (int i10 = 0; i10 < i9; i10++) {
                ((my1) objArr2[i10]).g();
            }
            long[] jArr5 = (long[]) bmVar.y;
            int i11 = bmVar.g;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j11 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j11 >> 60)) & 1) != 0) {
                    long j12 = jArr5[i12];
                    long j13 = jArr5[i12 + 1];
                    d95 d95Var4 = (d95) e95Var.g.y(((int) j11) & 33554431);
                    while (d95Var4 != null) {
                        d95 d95Var5 = d95Var4.n;
                        boolean z6 = z3;
                        long j14 = d95Var4.l;
                        boolean z7 = (jCurrentTimeMillis - j14 >= 0 || j14 == Long.MIN_VALUE) ? z5 : false;
                        d95Var4.v = j12;
                        d95Var4.x = j13;
                        if (z7) {
                            d95Var4.l = jCurrentTimeMillis;
                            j9 = j12;
                            j10 = j13;
                            d95Var4.g(j9, j10, e95Var.n, e95Var.v, e95Var.l);
                        } else {
                            j9 = j12;
                            j10 = j13;
                        }
                        d95Var4 = d95Var5;
                        j12 = j9;
                        j13 = j10;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) bmVar.y;
            int i14 = bmVar.g;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.l) {
            this.l = false;
            long j15 = e95Var.n;
            long j16 = e95Var.v;
            float[] fArr2 = e95Var.l;
            ha3 ha3Var = e95Var.g;
            j2 = 128;
            Object[] objArr3 = ha3Var.r;
            long[] jArr7 = ha3Var.g;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j17 = j15;
                    long j18 = jArr7[i17];
                    int i19 = i18;
                    bmVar = bmVar;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j19 = j18;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j19 & 255) < 128) {
                                d95 d95Var6 = (d95) objArr3[(i17 << 3) + i21];
                                while (d95Var6 != null) {
                                    e95Var.g(d95Var6, j17, j16, fArr2, jCurrentTimeMillis);
                                    d95Var6 = d95Var6.n;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j19 >>= i22;
                            i21++;
                            j17 = j17;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    bmVar = bmVar;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j7 = e95Var.n;
                j8 = e95Var.v;
                fArr = e95Var.l;
                d95Var3 = e95Var.y;
                if (d95Var3 != null) {
                    while (d95Var3 != null) {
                        um2 um2VarV = k33.V(d95Var3.y);
                        long jY = ((ba) xm2.g(um2VarV)).getRectManager().y(um2VarV);
                        d95Var3.v = jY;
                        s33 s33Var = um2VarV.N.b;
                        d95Var3.x = (((long) (s33Var.j + ((int) (jY >> 32)))) << 32) | (((long) (s33Var.t + ((int) (jY & 4294967295L)))) & 4294967295L);
                        e95Var.g(d95Var3, j7, j8, fArr, jCurrentTimeMillis);
                        d95Var3 = d95Var3.n;
                    }
                }
            }
            if (this.j) {
                i2 = 0;
                this.j = false;
                bm bmVar2 = bmVar;
                jArr2 = (long[]) bmVar2.y;
                int i23 = bmVar2.g;
                jArr3 = (long[]) bmVar2.r;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != l44.g) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                bmVar2.g = i7;
                bmVar2.y = jArr3;
                bmVar2.r = jArr2;
            } else {
                i2 = 0;
            }
            j4 = e95Var.r;
            if (j4 <= jCurrentTimeMillis) {
                ha3 ha3Var2 = e95Var.g;
                objArr = ha3Var2.r;
                jArr = ha3Var2.g;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j5 = jArr[i3];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j6 = j5;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j6 & j3) < j2) {
                                    for (d95Var2 = (d95) objArr[(i3 << 3) + i5]; d95Var2 != null; d95Var2 = d95Var2.n) {
                                    }
                                }
                                j6 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                d95Var = e95Var.y;
                if (d95Var != null) {
                    while (d95Var != null) {
                        d95Var = d95Var.n;
                    }
                }
                j4 = -1;
                e95Var.r = -1L;
            }
            if (j4 > j) {
                a();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j7 = e95Var.n;
            j8 = e95Var.v;
            fArr = e95Var.l;
            d95Var3 = e95Var.y;
            if (d95Var3 != null) {
                while (d95Var3 != null) {
                    um2 um2VarV2 = k33.V(d95Var3.y);
                    long jY2 = ((ba) xm2.g(um2VarV2)).getRectManager().y(um2VarV2);
                    d95Var3.v = jY2;
                    s33 s33Var2 = um2VarV2.N.b;
                    d95Var3.x = (((long) (s33Var2.j + ((int) (jY2 >> 32)))) << 32) | (((long) (s33Var2.t + ((int) (jY2 & 4294967295L)))) & 4294967295L);
                    e95Var.g(d95Var3, j7, j8, fArr, jCurrentTimeMillis);
                    d95Var3 = d95Var3.n;
                }
            }
        }
        if (this.j) {
            i2 = 0;
            this.j = false;
            bm bmVar3 = bmVar;
            jArr2 = (long[]) bmVar3.y;
            int i24 = bmVar3.g;
            jArr3 = (long[]) bmVar3.r;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != l44.g) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            bmVar3.g = i7;
            bmVar3.y = jArr3;
            bmVar3.r = jArr2;
        } else {
            i2 = 0;
        }
        j4 = e95Var.r;
        if (j4 <= jCurrentTimeMillis) {
            ha3 ha3Var3 = e95Var.g;
            objArr = ha3Var3.r;
            jArr = ha3Var3.g;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j5 = jArr[i3];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j6 = j5;
                        while (i5 < i4) {
                            if ((j6 & j3) < j2) {
                                while (d95Var2 != null) {
                                }
                            }
                            j6 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            d95Var = e95Var.y;
            if (d95Var != null) {
                while (d95Var != null) {
                    d95Var = d95Var.n;
                }
            }
            j4 = -1;
            e95Var.r = -1L;
        }
        if (j4 > j) {
            a();
        }
    }

    public final void j(um2 um2Var) {
        if (um2Var.c != -4) {
            int iN = n(um2Var);
            long[] jArr = (long[]) this.r.y;
            jArr[iN] = -1;
            jArr[iN + 1] = -1;
            jArr[iN + 2] = l44.g;
            um2Var.c = -4;
            um2Var.w = true;
            this.x = true;
            this.j = true;
        }
    }

    public final void l(um2 um2Var) {
        long j;
        boolean zK = um2Var.K();
        ah3 ah3Var = um2Var.M;
        if (zK && um2Var.w) {
            um2 um2VarO = um2Var.o();
            if (um2VarO == null || um2VarO.a) {
                j = um2VarO == null ? 0L : 9223372034707292159L;
            } else {
                if (um2VarO.q) {
                    um2VarO.q = false;
                    um2VarO.m = x(um2VarO);
                }
                j = um2VarO.m;
            }
            gh3 gh3Var = ah3Var.n;
            if (je2.y(j, 9223372034707292159L) || r(gh3Var)) {
                v(um2Var);
            } else if (um2Var.a) {
                v(um2Var);
                t(um2Var);
            } else {
                long jN = je2.n(j, gh3Var.M);
                s33 s33Var = um2Var.N.b;
                int iG0 = s33Var.g0();
                int iD0 = s33Var.d0();
                int i = um2Var.c;
                bm bmVar = this.r;
                if (i != -4) {
                    int iN = n(um2Var);
                    if (um2VarO != null) {
                        int iN2 = n(um2VarO);
                        int i2 = (int) (jN >> 32);
                        int i3 = (int) (jN & 4294967295L);
                        long[] jArr = (long[]) bmVar.y;
                        long j2 = jArr[iN2];
                        int i4 = ((int) (j2 >> 32)) + i2;
                        int i5 = ((int) j2) + i3;
                        int i6 = iD0 + i5;
                        long j3 = jArr[iN];
                        int i7 = i4 - ((int) (j3 >> 32));
                        int i8 = i5 - ((int) j3);
                        int i9 = iN + 2;
                        long j4 = jArr[i9];
                        jArr[iN] = (((long) i5) & 4294967295L) | (((long) i4) << 32);
                        jArr[iN + 1] = (((long) (iG0 + i4)) << 32) | (((long) i6) & 4294967295L);
                        jArr[i9] = (((j4 >> 63) & 1) << 60) | j4;
                        if (i7 != 0 || i8 != 0) {
                            bmVar.t(j4, iN, i7, i8);
                        }
                    } else {
                        int iN3 = n(um2Var);
                        int i10 = (int) (jN >> 32);
                        int i11 = (int) (jN & 4294967295L);
                        long[] jArr2 = (long[]) bmVar.y;
                        long j5 = jArr2[iN3];
                        jArr2[iN3] = (((long) i10) << 32) | (((long) i11) & 4294967295L);
                        jArr2[iN3 + 1] = (((long) (iD0 + i11)) & 4294967295L) | (((long) (iG0 + i10)) << 32);
                        int i12 = iN3 + 2;
                        long j6 = jArr2[i12];
                        jArr2[i12] = (((j6 >> 63) & 1) << 60) | j6;
                        int i13 = i10 - ((int) (j5 >> 32));
                        int i14 = i11 - ((int) j5);
                        if (i13 != 0 || i14 != 0) {
                            bmVar.t(j6, iN3, i13, i14);
                        }
                    }
                } else {
                    int i15 = um2Var.t;
                    boolean zR = ah3Var.r(1024);
                    boolean zR2 = ah3Var.r(16);
                    boolean zG = this.n.g.g(i15);
                    if (um2VarO != null) {
                        int i16 = um2VarO.t;
                        int iN4 = n(um2VarO);
                        int i17 = (int) (jN >> 32);
                        int i18 = (int) (jN & 4294967295L);
                        int i19 = i15 & 33554431;
                        long[] jArr3 = (long[]) bmVar.y;
                        if ((((int) jArr3[iN4 + 2]) & 33554431) != (33554431 & i16)) {
                            mc2.g("Inserted child " + i19 + " without valid parent index or parent " + i16 + " not found");
                        }
                        long j7 = jArr3[iN4];
                        int i20 = ((int) (j7 >> 32)) + i17;
                        int i21 = ((int) j7) + i18;
                        um2Var.c = bmVar.x(i19, i20, i21, i20 + iG0, i21 + iD0, i16, iN4, zR, zR2, zG);
                    } else {
                        int i22 = (int) (jN >> 32);
                        int i23 = (int) (jN & 4294967295L);
                        um2Var.c = bmVar.x(i15, i22, i23, i22 + iG0, i23 + iD0, -1, -4, zR, zR2, zG);
                    }
                }
            }
            um2Var.w = false;
            this.x = true;
            a();
        }
    }

    public final int n(um2 um2Var) {
        int i = um2Var.c;
        if (i != -4) {
            int i2 = um2Var.t;
            bm bmVar = this.r;
            long[] jArr = (long[]) bmVar.y;
            if (i < 0 || i >= bmVar.g - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = bmVar.g;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4 - 2) {
                        i = -4;
                        break;
                    }
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                    i5 += 3;
                }
            }
        } else {
            i = -4;
            break;
        }
        if (i == -4) {
            mc2.g("LayoutNode " + um2Var.t + " not found in RectList");
        }
        um2Var.c = i;
        return i;
    }

    public final void v(um2 um2Var) {
        um2Var.a = true;
        ah3 ah3Var = um2Var.M;
        s33 s33Var = um2Var.N.b;
        int iG0 = s33Var.g0();
        float fD0 = s33Var.d0();
        gb3 gb3Var = this.q;
        gb3Var.g = 0.0f;
        gb3Var.y = 0.0f;
        gb3Var.r = iG0;
        gb3Var.n = fD0;
        for (gh3 gh3Var = ah3Var.n; gh3Var != null; gh3Var = gh3Var.D) {
            um2 um2Var2 = gh3Var.B;
            if (gh3Var == um2Var2.M.n && !um2Var2.a) {
                long jY = y(um2Var2);
                if (!je2.y(jY, 9223372034707292159L)) {
                    gb3Var.r((((long) Float.floatToRawIntBits((int) (jY >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jY & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            on3 on3Var = gh3Var.a0;
            if (on3Var != null) {
                float[] fArrY = ((a42) on3Var).y();
                if (!sp2.z(fArrY)) {
                    l33.r(fArrY, gb3Var);
                }
            }
            long j = gh3Var.M;
            gb3Var.r((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
        }
        int i = (int) gb3Var.g;
        int i2 = (int) gb3Var.y;
        int i3 = (int) gb3Var.r;
        int i4 = (int) gb3Var.n;
        int i5 = um2Var.t;
        int i6 = um2Var.c;
        bm bmVar = this.r;
        if (i6 != -4) {
            int iN = n(um2Var);
            long[] jArr = (long[]) bmVar.y;
            jArr[iN] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iN + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iN + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            um2 um2VarO = um2Var.o();
            um2Var.c = bmVar.x(i5, i, i2, i3, i4, um2VarO != null ? um2VarO.t : -1, um2VarO != null ? n(um2VarO) : -4, ah3Var.r(1024), ah3Var.r(16), this.n.g.g(i5));
        }
        um2Var.w = false;
        this.x = true;
        rb3 rb3VarB = um2Var.B();
        Object[] objArr = rb3VarB.j;
        int i8 = rb3VarB.a;
        for (int i9 = 0; i9 < i8; i9++) {
            um2 um2Var3 = (um2) objArr[i9];
            if (um2Var3.K()) {
                v(um2Var3);
            }
        }
    }

    public final long y(um2 um2Var) {
        if (um2Var.c == -4) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.r.y)[n(um2Var)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }
}
