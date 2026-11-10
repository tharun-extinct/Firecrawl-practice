package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k05 {
    public static final float g;
    public static final float n;
    public static final float r;
    public static final float v;
    public static final zs4 x;
    public static final float y;

    static {
        float f = we6.b;
        g = f;
        y = we6.e;
        r = we6.f;
        float f2 = we6.z;
        n = f2;
        v = (f2 - f) / 2.0f;
        x = new zs4(0);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0165  */
    /* JADX WARN: Code duplicated, block: B:56:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x0186  */
    /* JADX WARN: Code duplicated, block: B:60:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x01da  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void g(final boolean z, final xy1 xy1Var, j73 j73Var, bz1 bz1Var, boolean z2, i05 i05Var, h02 h02Var, final int i, final int i2) {
        bz1 bz1Var2;
        int i3;
        i05 i05Var2;
        int i4;
        boolean z3;
        final j73 j73Var2;
        final bz1 bz1Var3;
        final i05 i05Var3;
        final boolean z4;
        u34 u34VarP;
        int i5;
        j73 j73VarY;
        i05 i05Var4;
        bz1 bz1Var4;
        int i6;
        j73 j73Var3;
        boolean z5;
        rj0 rj0Var;
        i05 i05Var5;
        long j;
        Object objK;
        ja3 ja3Var;
        ja3 ja3Var2;
        h02Var.Z(-263339167);
        int i7 = i | (h02Var.l(z) ? 4 : 2) | (h02Var.j(xy1Var) ? 32 : 16);
        int i8 = i7 | 384;
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 = i7 | 3456;
            bz1Var2 = bz1Var;
        } else {
            bz1Var2 = bz1Var;
            i3 = i8 | (h02Var.j(bz1Var2) ? 2048 : 1024);
        }
        int i10 = i3 | 24576;
        if ((i2 & 32) == 0) {
            i05Var2 = i05Var;
            int i11 = h02Var.x(i05Var2) ? 131072 : 65536;
            i4 = i10 | i11 | 1572864;
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (h02Var.N(i4 & 1, z3)) {
                h02Var.S();
                i5 = i & 1;
                j73VarY = g73.g;
                if (i5 != 0 || h02Var.k()) {
                    if (i9 != 0) {
                        bz1Var2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        rj0Var = (rj0) h02Var.a(tj0.g);
                        i05Var5 = rj0Var.p0;
                        j = rj0Var.b;
                        if (i05Var5 == null) {
                            long jN = tj0.n(rj0Var, we6.i);
                            long jN2 = tj0.n(rj0Var, we6.p);
                            long j2 = jj0.l;
                            long jN3 = tj0.n(rj0Var, we6.s);
                            long jN4 = tj0.n(rj0Var, we6.d);
                            long jN5 = tj0.n(rj0Var, we6.B);
                            long jN6 = tj0.n(rj0Var, we6.k);
                            long jN7 = tj0.n(rj0Var, we6.A);
                            long jC = ra.c(jj0.y(we6.y, tj0.n(rj0Var, we6.g)), j);
                            long jN8 = tj0.n(rj0Var, we6.v);
                            float f = we6.x;
                            i05Var4 = new i05(jN, jN2, j2, jN3, jN4, jN5, jN6, jN7, jC, ra.c(jj0.y(f, jN8), j), j2, ra.c(jj0.y(we6.n, tj0.n(rj0Var, we6.r)), j), ra.c(jj0.y(we6.j, tj0.n(rj0Var, we6.l)), j), ra.c(jj0.y(f, tj0.n(rj0Var, we6.m)), j), ra.c(jj0.y(f, tj0.n(rj0Var, we6.q)), j), ra.c(jj0.y(we6.a, tj0.n(rj0Var, we6.t)), j));
                            rj0Var.p0 = i05Var4;
                        } else {
                            i05Var4 = i05Var5;
                        }
                        i4 &= -458753;
                    } else {
                        i05Var4 = i05Var2;
                    }
                    bz1Var4 = bz1Var2;
                    i6 = i4;
                    j73Var3 = j73VarY;
                    z5 = true;
                } else {
                    h02Var.Q();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    j73Var3 = j73Var;
                    z5 = z2;
                    bz1Var4 = bz1Var2;
                    i6 = i4;
                    i05Var4 = i05Var2;
                }
                h02Var.s();
                h02Var.X(1768604058);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = du4.n(h02Var);
                }
                ja3Var = (ja3) objK;
                h02Var.b(false);
                if (xy1Var != null) {
                    f72 f72Var = ye2.g;
                    j73VarY = ff6.y(c63.g, z, ja3Var, null, z5, new o94(2), xy1Var);
                    ja3Var2 = ja3Var;
                } else {
                    ja3Var2 = ja3Var;
                }
                boolean z6 = z5;
                j73 j73VarI = mq4.i(j73Var3.n(j73VarY), hi0.w, 2);
                float f2 = r;
                float f3 = n;
                int i12 = i6 << 3;
                int i13 = (i12 & 112) | 384 | ((i6 >> 6) & 7168) | (i12 & 57344);
                bz1Var3 = bz1Var4;
                i05 i05Var6 = i05Var4;
                y(j73VarI.n(new lq4(f2, f3, f2, f3, false)), z, z6, i05Var6, bz1Var3, ja3Var2, vn4.y(we6.w, h02Var), h02Var, i13);
                z4 = z6;
                i05Var3 = i05Var6;
                j73Var2 = j73Var3;
            } else {
                h02Var.Q();
                j73Var2 = j73Var;
                bz1Var3 = bz1Var2;
                i05Var3 = i05Var2;
                z4 = z2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1(z, xy1Var, j73Var2, bz1Var3, z4, i05Var3, i, i2) { // from class: j05
                    public final /* synthetic */ j73 a;
                    public final /* synthetic */ byte c;
                    public final /* synthetic */ boolean j;
                    public final /* synthetic */ bz1 m;
                    public final /* synthetic */ boolean q;
                    public final /* synthetic */ xy1 t;
                    public final /* synthetic */ i05 w;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.c = i2;
                    }

                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(1);
                        k05.g(this.j, this.t, this.a, this.m, this.q, this.w, (h02) obj, iJ, this.c);
                        return og5.g;
                    }
                };
            }
        }
        i05Var2 = i05Var;
        i4 = i10 | i11 | 1572864;
        if ((599187 & i4) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (h02Var.N(i4 & 1, z3)) {
            h02Var.S();
            i5 = i & 1;
            j73VarY = g73.g;
            if (i5 != 0) {
                if (i9 != 0) {
                    bz1Var2 = null;
                }
                if ((i2 & 32) != 0) {
                    rj0Var = (rj0) h02Var.a(tj0.g);
                    i05Var5 = rj0Var.p0;
                    j = rj0Var.b;
                    if (i05Var5 == null) {
                        long jN9 = tj0.n(rj0Var, we6.i);
                        long jN10 = tj0.n(rj0Var, we6.p);
                        long j3 = jj0.l;
                        long jN11 = tj0.n(rj0Var, we6.s);
                        long jN12 = tj0.n(rj0Var, we6.d);
                        long jN13 = tj0.n(rj0Var, we6.B);
                        long jN14 = tj0.n(rj0Var, we6.k);
                        long jN15 = tj0.n(rj0Var, we6.A);
                        long jC2 = ra.c(jj0.y(we6.y, tj0.n(rj0Var, we6.g)), j);
                        long jN16 = tj0.n(rj0Var, we6.v);
                        float f4 = we6.x;
                        i05Var4 = new i05(jN9, jN10, j3, jN11, jN12, jN13, jN14, jN15, jC2, ra.c(jj0.y(f4, jN16), j), j3, ra.c(jj0.y(we6.n, tj0.n(rj0Var, we6.r)), j), ra.c(jj0.y(we6.j, tj0.n(rj0Var, we6.l)), j), ra.c(jj0.y(f4, tj0.n(rj0Var, we6.m)), j), ra.c(jj0.y(f4, tj0.n(rj0Var, we6.q)), j), ra.c(jj0.y(we6.a, tj0.n(rj0Var, we6.t)), j));
                        rj0Var.p0 = i05Var4;
                    } else {
                        i05Var4 = i05Var5;
                    }
                    i4 &= -458753;
                } else {
                    i05Var4 = i05Var2;
                }
                bz1Var4 = bz1Var2;
                i6 = i4;
                j73Var3 = j73VarY;
                z5 = true;
            } else {
                if (i9 != 0) {
                    bz1Var2 = null;
                }
                if ((i2 & 32) != 0) {
                    rj0Var = (rj0) h02Var.a(tj0.g);
                    i05Var5 = rj0Var.p0;
                    j = rj0Var.b;
                    if (i05Var5 == null) {
                        long jN17 = tj0.n(rj0Var, we6.i);
                        long jN18 = tj0.n(rj0Var, we6.p);
                        long j4 = jj0.l;
                        long jN19 = tj0.n(rj0Var, we6.s);
                        long jN110 = tj0.n(rj0Var, we6.d);
                        long jN111 = tj0.n(rj0Var, we6.B);
                        long jN112 = tj0.n(rj0Var, we6.k);
                        long jN113 = tj0.n(rj0Var, we6.A);
                        long jC3 = ra.c(jj0.y(we6.y, tj0.n(rj0Var, we6.g)), j);
                        long jN114 = tj0.n(rj0Var, we6.v);
                        float f5 = we6.x;
                        i05Var4 = new i05(jN17, jN18, j4, jN19, jN110, jN111, jN112, jN113, jC3, ra.c(jj0.y(f5, jN114), j), j4, ra.c(jj0.y(we6.n, tj0.n(rj0Var, we6.r)), j), ra.c(jj0.y(we6.j, tj0.n(rj0Var, we6.l)), j), ra.c(jj0.y(f5, tj0.n(rj0Var, we6.m)), j), ra.c(jj0.y(f5, tj0.n(rj0Var, we6.q)), j), ra.c(jj0.y(we6.a, tj0.n(rj0Var, we6.t)), j));
                        rj0Var.p0 = i05Var4;
                    } else {
                        i05Var4 = i05Var5;
                    }
                    i4 &= -458753;
                } else {
                    i05Var4 = i05Var2;
                }
                bz1Var4 = bz1Var2;
                i6 = i4;
                j73Var3 = j73VarY;
                z5 = true;
            }
            h02Var.s();
            h02Var.X(1768604058);
            objK = h02Var.K();
            if (objK == oo0.g) {
                objK = du4.n(h02Var);
            }
            ja3Var = (ja3) objK;
            h02Var.b(false);
            if (xy1Var != null) {
                f72 f72Var2 = ye2.g;
                j73VarY = ff6.y(c63.g, z, ja3Var, null, z5, new o94(2), xy1Var);
                ja3Var2 = ja3Var;
            } else {
                ja3Var2 = ja3Var;
            }
            boolean z7 = z5;
            j73 j73VarI2 = mq4.i(j73Var3.n(j73VarY), hi0.w, 2);
            float f6 = r;
            float f7 = n;
            int i14 = i6 << 3;
            int i15 = (i14 & 112) | 384 | ((i6 >> 6) & 7168) | (i14 & 57344);
            bz1Var3 = bz1Var4;
            i05 i05Var7 = i05Var4;
            y(j73VarI2.n(new lq4(f6, f7, f6, f7, false)), z, z7, i05Var7, bz1Var3, ja3Var2, vn4.y(we6.w, h02Var), h02Var, i15);
            z4 = z7;
            i05Var3 = i05Var7;
            j73Var2 = j73Var3;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            bz1Var3 = bz1Var2;
            i05Var3 = i05Var2;
            z4 = z2;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(z, xy1Var, j73Var2, bz1Var3, z4, i05Var3, i, i2) { // from class: j05
                public final /* synthetic */ j73 a;
                public final /* synthetic */ byte c;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ bz1 m;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ xy1 t;
                public final /* synthetic */ i05 w;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.c = i2;
                }

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(1);
                    k05.g(this.j, this.t, this.a, this.m, this.q, this.w, (h02) obj, iJ, this.c);
                    return og5.g;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x0187  */
    public static final void y(j73 j73Var, boolean z, boolean z2, i05 i05Var, bz1 bz1Var, ve2 ve2Var, cn4 cn4Var, h02 h02Var, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        int i3;
        int iS;
        long j5;
        i05 i05Var2 = i05Var;
        bz1 bz1Var2 = bz1Var;
        h02Var.Z(-670917213);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.x(i05Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.j(bz1Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.x(ve2Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= h02Var.x(cn4Var) ? 1048576 : 524288;
        }
        if (h02Var.N(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? i05Var2.y : i05Var2.x;
            } else {
                j = z ? i05Var2.a : i05Var2.c;
            }
            if (z2) {
                j2 = z ? i05Var2.g : i05Var2.v;
            } else {
                j2 = z ? i05Var2.t : i05Var2.w;
            }
            cn4 cn4VarY = vn4.y(we6.o, h02Var);
            if (z2) {
                j3 = j;
                j4 = z ? i05Var2.r : i05Var2.l;
            } else {
                j3 = j;
                j4 = z ? i05Var2.m : i05Var2.i;
            }
            j73 j73VarA = og0.a(y94.s(j73Var, we6.h, j4, cn4VarY), j3, cn4VarY);
            t33 t33VarR = z50.r(hi0.t, false);
            int iS2 = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarA);
            jo0.n.getClass();
            h02Var.b0();
            boolean z3 = h02Var.S;
            sx1 sx1Var = um2.Z;
            if (z3) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, t33VarR);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            on0 on0Var3 = tg1.c;
            if (h02Var.S) {
                i3 = i2;
            } else {
                i3 = i2;
                if (!yf2.p(h02Var.K(), Integer.valueOf(iS2))) {
                }
                on0 on0Var4 = tg1.m;
                xs2.E(on0Var4, h02Var, j73VarW);
                j73 j73VarA2 = og0.a(db2.g(e60.g.g(g73.g, hi0.q).n(new g95(ve2Var, z, jr2.F(f83.t, h02Var))), ve2Var, k94.g(we6.u / 2.0f, 4, 0L, false)), j2, cn4Var);
                t33 t33VarR2 = z50.r(hi0.w, false);
                iS = pw5.s(h02Var);
                tr3 tr3VarQ2 = h02Var.q();
                j73 j73VarW2 = m50.W(h02Var, j73VarA2);
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(sx1Var);
                } else {
                    h02Var.l0();
                }
                xs2.E(on0Var, h02Var, t33VarR2);
                xs2.E(on0Var2, h02Var, tr3VarQ2);
                if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                    du4.f(iS, h02Var, iS, on0Var3);
                }
                xs2.E(on0Var4, h02Var, j73VarW2);
                if (bz1Var != null) {
                    h02Var.X(1235836927);
                    if (z2) {
                        i05Var2 = i05Var;
                        if (z) {
                            j5 = i05Var2.n;
                        } else {
                            j5 = i05Var2.j;
                        }
                    } else {
                        i05Var2 = i05Var;
                        if (z) {
                            j5 = i05Var2.q;
                        } else {
                            j5 = i05Var2.b;
                        }
                    }
                    bz1Var2 = bz1Var;
                    og0.y(du4.t(j5, mt0.g), bz1Var2, h02Var, ((i3 >> 9) & 112) | 8);
                    h02Var.b(false);
                } else {
                    i05Var2 = i05Var;
                    bz1Var2 = bz1Var;
                    h02Var.X(1236071411);
                    h02Var.b(false);
                }
                h02Var.b(true);
                h02Var.b(true);
            }
            du4.f(iS2, h02Var, iS2, on0Var3);
            on0 on0Var5 = tg1.m;
            xs2.E(on0Var5, h02Var, j73VarW);
            j73 j73VarA3 = og0.a(db2.g(e60.g.g(g73.g, hi0.q).n(new g95(ve2Var, z, jr2.F(f83.t, h02Var))), ve2Var, k94.g(we6.u / 2.0f, 4, 0L, false)), j2, cn4Var);
            t33 t33VarR3 = z50.r(hi0.w, false);
            iS = pw5.s(h02Var);
            tr3 tr3VarQ3 = h02Var.q();
            j73 j73VarW3 = m50.W(h02Var, j73VarA3);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR3);
            xs2.E(on0Var2, h02Var, tr3VarQ3);
            if (h02Var.S) {
                du4.f(iS, h02Var, iS, on0Var3);
            } else {
                du4.f(iS, h02Var, iS, on0Var3);
            }
            xs2.E(on0Var5, h02Var, j73VarW3);
            if (bz1Var != null) {
                h02Var.X(1235836927);
                if (z2) {
                    i05Var2 = i05Var;
                    if (z) {
                        j5 = i05Var2.n;
                    } else {
                        j5 = i05Var2.j;
                    }
                } else {
                    i05Var2 = i05Var;
                    if (z) {
                        j5 = i05Var2.q;
                    } else {
                        j5 = i05Var2.b;
                    }
                }
                bz1Var2 = bz1Var;
                og0.y(du4.t(j5, mt0.g), bz1Var2, h02Var, ((i3 >> 9) & 112) | 8);
                h02Var.b(false);
            } else {
                i05Var2 = i05Var;
                bz1Var2 = bz1Var;
                h02Var.X(1236071411);
                h02Var.b(false);
            }
            h02Var.b(true);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new o80(j73Var, z, z2, i05Var2, bz1Var2, ve2Var, cn4Var, i);
        }
    }
}
