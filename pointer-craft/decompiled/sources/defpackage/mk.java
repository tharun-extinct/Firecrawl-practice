package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mk {
    public static final vf1 g = new vf1(new y4((byte) 12), (byte) 0);
    public static final float r;
    public static final float y;

    static {
        new ct2(new y4((byte) 13));
        new hy0(0.8f, 0.0f, 0.8f, 0.15f);
        y = 4.0f;
        r = 12.0f;
    }

    public static final void g(final j73 j73Var, final nm0 nm0Var, final k85 k85Var, final k85 k85Var2, final nm0 nm0Var2, final cz1 cz1Var, final float f, final qo5 qo5Var, final bb5 bb5Var, h02 h02Var, final int i, final int i2) {
        int i3;
        cz1 cz1Var2;
        float f2;
        int i4;
        i00 i00Var = hi0.h;
        h02Var.Z(-2033800111);
        if ((i & 6) == 0) {
            i3 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= h02Var.j(nm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= h02Var.x(k85Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= h02Var.j(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= h02Var.x(k85Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= h02Var.x(i00Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= h02Var.j(nm0Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            cz1Var2 = cz1Var;
            i3 |= h02Var.j(cz1Var2) ? 8388608 : 4194304;
        } else {
            cz1Var2 = cz1Var;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= h02Var.r(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            i3 |= h02Var.x(qo5Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (h02Var.x(bb5Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= h02Var.x(null) ? 32 : 16;
        }
        if (h02Var.N(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((h31) h02Var.a(g)).g(new yp4(j73Var, nm0Var, k85Var, k85Var2, nm0Var2, cz1Var2, f2, qo5Var, bb5Var), h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: kk
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mk.g(j73Var, nm0Var, k85Var, k85Var2, nm0Var2, cz1Var, f, qo5Var, bb5Var, (h02) obj, aq2.J(i | 1), aq2.J(i2));
                    return og5.g;
                }
            };
        }
    }

    public static final void r(final j73 j73Var, final jq1 jq1Var, final long j, final long j2, final long j3, long j4, final nm0 nm0Var, final k85 k85Var, final k85 k85Var2, my1 my1Var, final nm0 nm0Var2, nm0 nm0Var3, final float f, h02 h02Var, final int i) {
        final my1 my1Var2;
        nm0 nm0Var4;
        final long j5 = j4;
        i00 i00Var = hi0.h;
        h02Var.Z(126395868);
        int i2 = i | (h02Var.x(j73Var) ? 4 : 2) | (h02Var.x(jq1Var) ? 32 : 16) | (h02Var.v(j) ? 256 : 128) | (h02Var.v(j2) ? 2048 : 1024) | (h02Var.v(j3) ? 16384 : 8192) | (h02Var.v(j5) ? 131072 : 65536) | (h02Var.j(nm0Var) ? 1048576 : 524288) | (h02Var.x(k85Var) ? 8388608 : 4194304) | (h02Var.j(null) ? 67108864 : 33554432) | (h02Var.x(k85Var2) ? 536870912 : 268435456);
        int i3 = 1600566 | (h02Var.x(i00Var) ? 256 : 128) | (h02Var.j(nm0Var2) ? 131072 : 65536) | (h02Var.r(f) ? 8388608 : 4194304);
        if (h02Var.N(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i3) == 4793490) ? false : true)) {
            boolean z = ((i2 & 112) == 32) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (z || objK == l76Var) {
                objK = new db5(jq1Var, f);
                h02Var.i0(objK);
            }
            db5 db5Var = (db5) objK;
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73Var);
            jo0.n.getClass();
            h02Var.b0();
            boolean z2 = h02Var.S;
            sx1 sx1Var = um2.Z;
            if (z2) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, db5Var);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            on0 on0Var3 = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var3);
            }
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var, j73VarW);
            g73 g73Var = g73.g;
            j73 j73VarX = ue5.X(g73Var, "navigationIcon");
            float f2 = y;
            j73 j73VarI0 = ue5.i0(j73VarX, f2, 0.0f, 0.0f, 0.0f, 14);
            k00 k00Var = hi0.t;
            t33 t33VarR = z50.r(k00Var, false);
            int iS2 = pw5.s(h02Var);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarI0);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR);
            xs2.E(on0Var2, h02Var, tr3VarQ2);
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS2))) {
                du4.f(iS2, h02Var, iS2, on0Var3);
            }
            xs2.E(on0Var4, h02Var, j73VarW2);
            vf1 vf1Var = mt0.g;
            og0.y(du4.t(j, vf1Var), nm0Var2, h02Var, ((i3 >> 12) & 112) | 8);
            h02Var.b(true);
            h02Var.X(-1359701523);
            j73 j73VarG0 = ue5.g0(ue5.X(g73Var, "title"), f2, 0.0f, 2);
            h02Var.X(510340109);
            h02Var.b(false);
            j73 j73VarN = j73VarG0.n(g73Var);
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                my1Var2 = my1Var;
                objK2 = new z6(my1Var2, (byte) 3);
                h02Var.i0(objK2);
            } else {
                my1Var2 = my1Var;
            }
            j73 j73VarL = yf2.L(j73VarN, (xy1) objK2);
            t33 t33VarR2 = z50.r(k00Var, false);
            int iS3 = pw5.s(h02Var);
            tr3 tr3VarQ3 = h02Var.q();
            j73 j73VarW3 = m50.W(h02Var, j73VarL);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR2);
            xs2.E(on0Var2, h02Var, tr3VarQ3);
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS3))) {
                du4.f(iS3, h02Var, iS3, on0Var3);
            }
            xs2.E(on0Var4, h02Var, j73VarW3);
            jr2.r(j2, k85Var, nm0Var, h02Var, ((i2 >> 9) & 14) | ((i2 >> 18) & 112) | ((i2 >> 12) & 896));
            h02Var.b(true);
            h02Var.b(false);
            j73 j73VarI1 = ue5.i0(ue5.X(g73Var, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            t33 t33VarR3 = z50.r(k00Var, false);
            int iS4 = pw5.s(h02Var);
            tr3 tr3VarQ4 = h02Var.q();
            j73 j73VarW4 = m50.W(h02Var, j73VarI1);
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(on0Var, h02Var, t33VarR3);
            xs2.E(on0Var2, h02Var, tr3VarQ4);
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS4))) {
                du4.f(iS4, h02Var, iS4, on0Var3);
            }
            xs2.E(on0Var4, h02Var, j73VarW4);
            j5 = j4;
            nm0Var4 = nm0Var3;
            og0.y(vf1Var.g(new jj0(j5)), nm0Var4, h02Var, 56);
            h02Var.b(true);
            h02Var.b(true);
        } else {
            my1Var2 = my1Var;
            nm0Var4 = nm0Var3;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final nm0 nm0Var5 = nm0Var4;
            u34VarP.n = new bz1(jq1Var, j, j2, j3, j5, nm0Var, k85Var, k85Var2, my1Var2, nm0Var2, nm0Var5, f, i) { // from class: lk
                public final /* synthetic */ long a;
                public final /* synthetic */ k85 b;
                public final /* synthetic */ nm0 c;
                public final /* synthetic */ k85 i;
                public final /* synthetic */ long m;
                public final /* synthetic */ nm0 p;
                public final /* synthetic */ long q;
                public final /* synthetic */ my1 s;
                public final /* synthetic */ jq1 t;
                public final /* synthetic */ nm0 u;
                public final /* synthetic */ long w;
                public final /* synthetic */ float z;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(1);
                    mk.r(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, this.b, this.s, this.p, this.u, this.z, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void y(final nm0 nm0Var, j73 j73Var, final nm0 nm0Var2, cz1 cz1Var, float f, qo5 qo5Var, bb5 bb5Var, h02 h02Var, final int i, final int i2) {
        cz1 cz1Var2;
        int i3;
        bb5 bb5Var2;
        int i4;
        boolean z;
        final float f2;
        final qo5 qo5Var2;
        final cz1 cz1Var3;
        final bb5 bb5Var3;
        final j73 j73Var2;
        u34 u34VarP;
        cz1 cz1Var4;
        int i5;
        int i6;
        bb5 bb5VarO;
        bb5 bb5Var4;
        qo5 qo5Var3;
        int i7;
        j73 j73Var3;
        float f3;
        cz1 cz1Var5;
        float f4;
        float f5;
        float f6;
        h02Var.Z(1784421840);
        int i8 = i | 48;
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 = i | 3120;
            cz1Var2 = cz1Var;
        } else {
            cz1Var2 = cz1Var;
            i3 = i8 | (h02Var.j(cz1Var2) ? 2048 : 1024);
        }
        int i10 = i3 | 90112;
        if ((i2 & 64) == 0) {
            bb5Var2 = bb5Var;
            int i11 = h02Var.x(bb5Var2) ? 1048576 : 524288;
            i4 = i10 | i11 | 12582912;
            if ((4793491 & i4) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i4 & 1, z)) {
                h02Var.S();
                if ((i & 1) != 0 || h02Var.k()) {
                    if (i9 != 0) {
                        cz1Var4 = qm0.g;
                    } else {
                        cz1Var4 = cz1Var2;
                    }
                    su2 su2Var = new su2(mq2.q(h02Var), 15 | 16);
                    i5 = i4 & (-458753);
                    if ((i2 & 64) != 0) {
                        bb5VarO = jr2.o((rj0) h02Var.a(tj0.g));
                        i6 = i4 & (-4128769);
                    } else {
                        i6 = i5;
                        bb5VarO = bb5Var2;
                    }
                    bb5Var4 = bb5VarO;
                    qo5Var3 = su2Var;
                    i7 = i6;
                    j73Var3 = g73.g;
                    f3 = 64.0f;
                    cz1Var5 = cz1Var4;
                    f4 = 64.0f;
                } else {
                    h02Var.Q();
                    i7 = i4 & (-458753);
                    if ((i2 & 64) != 0) {
                        i7 = i4 & (-4128769);
                    }
                    cz1Var5 = cz1Var2;
                    f3 = 64.0f;
                    j73Var3 = j73Var;
                    f4 = f;
                    qo5Var3 = qo5Var;
                    bb5Var4 = bb5Var2;
                }
                h02Var.s();
                k85 k85VarG = of5.g(pw5.g, h02Var);
                f5 = f3;
                k85 k85Var = k85.n;
                if (!vb1.y(f4, Float.NaN) || vb1.y(f4, Float.POSITIVE_INFINITY)) {
                    f6 = f5;
                } else {
                    f6 = f4;
                }
                g(j73Var3, nm0Var, k85VarG, k85Var, nm0Var2, cz1Var5, f6, qo5Var3, bb5Var4, h02Var, 1797174 | ((i7 << 12) & 29360128), (i7 >> 18) & 126);
                j73Var2 = j73Var3;
                cz1Var3 = cz1Var5;
                qo5Var2 = qo5Var3;
                bb5Var3 = bb5Var4;
                f2 = f4;
            } else {
                h02Var.Q();
                f2 = f;
                qo5Var2 = qo5Var;
                cz1Var3 = cz1Var2;
                bb5Var3 = bb5Var2;
                j73Var2 = j73Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1(j73Var2, nm0Var2, cz1Var3, f2, qo5Var2, bb5Var3, i, i2) { // from class: jk
                    public final /* synthetic */ nm0 a;
                    public final /* synthetic */ bb5 c;
                    public final /* synthetic */ short i;
                    public final /* synthetic */ cz1 m;
                    public final /* synthetic */ float q;
                    public final /* synthetic */ j73 t;
                    public final /* synthetic */ qo5 w;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.i = i2;
                    }

                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iJ = aq2.J(391);
                        mk.y(this.j, this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj, iJ, this.i);
                        return og5.g;
                    }
                };
            }
        }
        bb5Var2 = bb5Var;
        i4 = i10 | i11 | 12582912;
        if ((4793491 & i4) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (h02Var.N(i4 & 1, z)) {
            h02Var.S();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    cz1Var4 = qm0.g;
                } else {
                    cz1Var4 = cz1Var2;
                }
                su2 su2Var2 = new su2(mq2.q(h02Var), 15 | 16);
                i5 = i4 & (-458753);
                if ((i2 & 64) != 0) {
                    bb5VarO = jr2.o((rj0) h02Var.a(tj0.g));
                    i6 = i4 & (-4128769);
                } else {
                    i6 = i5;
                    bb5VarO = bb5Var2;
                }
                bb5Var4 = bb5VarO;
                qo5Var3 = su2Var2;
                i7 = i6;
                j73Var3 = g73.g;
                f3 = 64.0f;
                cz1Var5 = cz1Var4;
                f4 = 64.0f;
            } else {
                if (i9 != 0) {
                    cz1Var4 = qm0.g;
                } else {
                    cz1Var4 = cz1Var2;
                }
                su2 su2Var3 = new su2(mq2.q(h02Var), 15 | 16);
                i5 = i4 & (-458753);
                if ((i2 & 64) != 0) {
                    bb5VarO = jr2.o((rj0) h02Var.a(tj0.g));
                    i6 = i4 & (-4128769);
                } else {
                    i6 = i5;
                    bb5VarO = bb5Var2;
                }
                bb5Var4 = bb5VarO;
                qo5Var3 = su2Var3;
                i7 = i6;
                j73Var3 = g73.g;
                f3 = 64.0f;
                cz1Var5 = cz1Var4;
                f4 = 64.0f;
            }
            h02Var.s();
            k85 k85VarG2 = of5.g(pw5.g, h02Var);
            f5 = f3;
            k85 k85Var2 = k85.n;
            if (vb1.y(f4, Float.NaN)) {
                f6 = f5;
            } else {
                f6 = f5;
            }
            g(j73Var3, nm0Var, k85VarG2, k85Var2, nm0Var2, cz1Var5, f6, qo5Var3, bb5Var4, h02Var, 1797174 | ((i7 << 12) & 29360128), (i7 >> 18) & 126);
            j73Var2 = j73Var3;
            cz1Var3 = cz1Var5;
            qo5Var2 = qo5Var3;
            bb5Var3 = bb5Var4;
            f2 = f4;
        } else {
            h02Var.Q();
            f2 = f;
            qo5Var2 = qo5Var;
            cz1Var3 = cz1Var2;
            bb5Var3 = bb5Var2;
            j73Var2 = j73Var;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(j73Var2, nm0Var2, cz1Var3, f2, qo5Var2, bb5Var3, i, i2) { // from class: jk
                public final /* synthetic */ nm0 a;
                public final /* synthetic */ bb5 c;
                public final /* synthetic */ short i;
                public final /* synthetic */ cz1 m;
                public final /* synthetic */ float q;
                public final /* synthetic */ j73 t;
                public final /* synthetic */ qo5 w;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.i = i2;
                }

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(391);
                    mk.y(this.j, this.t, this.a, this.m, this.q, this.w, this.c, (h02) obj, iJ, this.i);
                    return og5.g;
                }
            };
        }
    }
}
