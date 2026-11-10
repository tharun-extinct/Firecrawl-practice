package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oe3 {
    public static final float g = sc6.j;
    public static final float y = 8.0f;
    public static final float r = 4.0f;
    public static final float n = 16.0f;
    public static final float v = 4.0f;
    public static final float x = 12.0f;
    public static final float l = 44.0f;
    public static final vf1 j = new vf1(new yj2((byte) 3), (byte) 0);

    public static final void g(j73 j73Var, long j2, long j3, final qo5 qo5Var, final nm0 nm0Var, h02 h02Var, final int i) {
        final j73 j73Var2;
        final long j4;
        final long j5;
        long j6;
        j73 j73Var3;
        long j7;
        h02Var.Z(1054099326);
        int i2 = i | 3222 | (h02Var.x(qo5Var) ? 16384 : 8192);
        if (h02Var.N(i2 & 1, (74899 & i2) != 74898)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                long jV = tj0.v(sc6.g, h02Var);
                long jG = tj0.g((rj0) h02Var.a(tj0.g), jV);
                j6 = jV;
                j73Var3 = g73.g;
                j7 = jG;
            } else {
                h02Var.Q();
                j73Var3 = j73Var;
                j6 = j2;
                j7 = j3;
            }
            h02Var.s();
            ((r21) h02Var.a(j)).g(new pe3(j73Var3, j6, j7, qo5Var, nm0Var), h02Var, 0);
            j73Var2 = j73Var3;
            j4 = j6;
            j5 = j7;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            j4 = j2;
            j5 = j3;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(j4, j5, qo5Var, nm0Var, i) { // from class: fe3
                public final /* synthetic */ long a;
                public final /* synthetic */ qo5 m;
                public final /* synthetic */ nm0 q;
                public final /* synthetic */ long t;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(196609);
                    oe3.g(this.j, this.t, this.a, this.m, this.q, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final void r(nm0 nm0Var, nm0 nm0Var2, nm0 nm0Var3, bz1 bz1Var, boolean z, my1 my1Var, my1 my1Var2, h02 h02Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        bz1 bz1Var2 = bz1Var;
        h02Var.Z(-1019541078);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(nm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(nm0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(nm0Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(bz1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.l(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.j(my1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= h02Var.j(my1Var2) ? 1048576 : 524288;
        }
        byte b = 1;
        if (h02Var.N(i2 & 1, (599187 & i2) != 599186)) {
            at atVar = new at(b);
            g73 g73Var = g73.g;
            j73 j73VarG = ra.G(g73Var, atVar);
            int i3 = 57344 & i2;
            boolean z4 = ((i2 & 7168) == 2048) | ((i2 & 3670016) == 1048576) | (i3 == 16384);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (z4 || objK == l76Var) {
                objK = new ne3(my1Var2, bz1Var2, z);
                h02Var.i0(objK);
            }
            t33 t33Var = (t33) objK;
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarG);
            jo0.n.getClass();
            h02Var.b0();
            boolean z5 = h02Var.S;
            sx1 sx1Var = um2.Z;
            if (z5) {
                h02Var.m(sx1Var);
            } else {
                h02Var.l0();
            }
            int i4 = i2;
            on0 on0Var = tg1.w;
            xs2.E(on0Var, h02Var, t33Var);
            on0 on0Var2 = tg1.q;
            xs2.E(on0Var2, h02Var, tr3VarQ);
            on0 on0Var3 = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var3);
            }
            on0 on0Var4 = tg1.m;
            xs2.E(on0Var4, h02Var, j73VarW);
            nm0Var.l(h02Var, Integer.valueOf(i4 & 14));
            nm0Var2.l(h02Var, Integer.valueOf((i4 >> 3) & 14));
            j73 j73VarX = ue5.X(g73Var, "icon");
            k00 k00Var = hi0.t;
            t33 t33VarR = z50.r(k00Var, false);
            int iS2 = pw5.s(h02Var);
            tr3 tr3VarQ2 = h02Var.q();
            j73 j73VarW2 = m50.W(h02Var, j73VarX);
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
            du4.h((i4 >> 6) & 14, nm0Var3, h02Var, true);
            if (bz1Var != null) {
                h02Var.X(-660471321);
                j73 j73VarX2 = ue5.X(g73Var, "label");
                boolean z6 = (i3 == 16384) | ((i4 & 458752) == 131072);
                Object objK2 = h02Var.K();
                if (z6 || objK2 == l76Var) {
                    z2 = z;
                    objK2 = new yv((byte) 1, my1Var, z2);
                    h02Var.i0(objK2);
                } else {
                    z2 = z;
                }
                j73 j73VarL = yf2.L(j73VarX2, (xy1) objK2);
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
                bz1Var2 = bz1Var;
                bz1Var2.l(h02Var, Integer.valueOf((i4 >> 9) & 14));
                z3 = true;
                h02Var.b(true);
                h02Var.b(false);
            } else {
                bz1Var2 = bz1Var;
                z2 = z;
                z3 = true;
                h02Var.X(-660200319);
                h02Var.b(false);
            }
            h02Var.b(z3);
        } else {
            z2 = z;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mz(nm0Var, nm0Var2, nm0Var3, bz1Var2, z2, my1Var, my1Var2, i);
        }
    }

    public static final void y(final lb4 lb4Var, final boolean z, final my1 my1Var, final nm0 nm0Var, j73 j73Var, boolean z2, final bz1 bz1Var, boolean z3, ee3 ee3Var, h02 h02Var, final int i) {
        int i2;
        h02 h02Var2;
        j73 j73Var2;
        final boolean z4;
        final boolean z5;
        final ee3 ee3Var2;
        ee3 ee3Var3;
        int i3;
        j73 j73Var3;
        ee3 ee3Var4;
        boolean z6;
        boolean z7;
        nm0 nm0VarM0;
        h02Var.Z(974293026);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(lb4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(my1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(nm0Var) ? 2048 : 1024;
        }
        int i4 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i4 |= h02Var.j(bz1Var) ? 1048576 : 524288;
        }
        int i5 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i5 = 46137344 | i4;
        }
        int i6 = 805306368 | i5;
        if (h02Var.N(i6 & 1, (306783379 & i6) != 306783378)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                rj0 rj0Var = (rj0) h02Var.a(tj0.g);
                ee3 ee3Var5 = rj0Var.l0;
                if (ee3Var5 == null) {
                    long jN = tj0.n(rj0Var, sc6.y);
                    long jN2 = tj0.n(rj0Var, sc6.v);
                    long jN3 = tj0.n(rj0Var, sc6.r);
                    sj0 sj0Var = sc6.x;
                    long jN4 = tj0.n(rj0Var, sj0Var);
                    sj0 sj0Var2 = sc6.l;
                    ee3Var3 = new ee3(jN, jN2, jN3, jN4, tj0.n(rj0Var, sj0Var2), jj0.y(0.38f, tj0.n(rj0Var, sj0Var)), jj0.y(0.38f, tj0.n(rj0Var, sj0Var2)));
                    rj0Var.l0 = ee3Var3;
                } else {
                    ee3Var3 = ee3Var5;
                }
                i3 = i6 & (-234881025);
                j73Var3 = g73.g;
                ee3Var4 = ee3Var3;
                z6 = true;
                z7 = true;
            } else {
                h02Var.Q();
                i3 = i6 & (-234881025);
                j73Var3 = j73Var;
                z6 = z2;
                z7 = z3;
                ee3Var4 = ee3Var;
            }
            int i7 = i3;
            h02Var.s();
            h02Var.X(-224963495);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = du4.n(h02Var);
            }
            ja3 ja3Var = (ja3) objK;
            h02Var.b(false);
            f83 f83Var = f83.a;
            boolean z8 = z7;
            zu4 zu4VarF = jr2.F(f83Var, h02Var);
            nm0 nm0VarM1 = ue5.m0(-876637252, new le3(ee3Var4, z, z6, zu4VarF, bz1Var, z8, nm0Var), h02Var);
            if (bz1Var == null) {
                h02Var.X(-224036658);
                h02Var.b(false);
                nm0VarM0 = null;
            } else {
                h02Var.X(-224036657);
                nm0VarM0 = ue5.m0(802208206, new me3(ee3Var4, z, z6, zu4VarF, bz1Var), h02Var);
                h02Var.b(false);
            }
            nm0 nm0Var2 = nm0VarM0;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = new qp3(0);
                h02Var.i0(objK2);
            }
            qp3 qp3Var = (qp3) objK2;
            boolean z9 = z6;
            ee3 ee3Var6 = ee3Var4;
            j73 j73Var4 = j73Var3;
            j73 j73VarP = ra.P(j73Var4, z, ja3Var, null, z9, new o94(4), my1Var);
            j73Var2 = j73Var4;
            j73 j73VarG = lb4Var.g(mq4.y(j73VarP, 0.0f, g, 1), 1.0f, true);
            Object objK3 = h02Var.K();
            if (objK3 == l76Var) {
                objK3 = new ge3(qp3Var, (byte) 0);
                h02Var.i0(objK3);
            }
            j73 j73VarV = uc6.v(j73VarG, (xy1) objK3);
            t33 t33VarR = z50.r(hi0.w, true);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarV);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            bw4 bw4VarY = ug.y(z ? 1.0f : 0.0f, jr2.F(f83Var, h02Var), null, h02Var, 0, 28);
            bw4 bw4VarY2 = ug.y(z ? 1.0f : 0.0f, jr2.F(f83.t, h02Var), null, h02Var, 0, 28);
            j51 j51Var = (j51) h02Var.a(hp0.j);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(j51Var.e(x))) & 4294967295L) | (((long) Float.floatToRawIntBits((qp3Var.d() - j51Var.V(56.0f)) / 2.0f)) << 32);
            boolean zX = h02Var.x(ja3Var) | h02Var.v(jFloatToRawIntBits);
            Object objK4 = h02Var.K();
            if (zX || objK4 == l76Var) {
                objK4 = new u13(ja3Var, jFloatToRawIntBits);
                h02Var.i0(objK4);
            }
            nm0 nm0VarM2 = ue5.m0(-2082182507, new g11((u13) objK4, (byte) 3), h02Var);
            nm0 nm0VarM3 = ue5.m0(-799524251, new k6(bw4VarY, ee3Var6, (byte) 6), h02Var);
            boolean zX2 = h02Var.x(bw4VarY);
            Object objK5 = h02Var.K();
            if (zX2 || objK5 == l76Var) {
                objK5 = new zs(bw4VarY, (byte) 1);
                h02Var.i0(objK5);
            }
            my1 my1Var2 = (my1) objK5;
            boolean zX3 = h02Var.x(bw4VarY2);
            Object objK6 = h02Var.K();
            if (zX3 || objK6 == l76Var) {
                objK6 = new zs(bw4VarY2, (byte) 2);
                h02Var.i0(objK6);
            }
            r(nm0VarM2, nm0VarM3, nm0VarM1, nm0Var2, z8, my1Var2, (my1) objK6, h02Var, ((i7 >> 9) & 57344) | 438);
            z5 = z8;
            h02Var2 = h02Var;
            h02Var2.b(true);
            ee3Var2 = ee3Var6;
            z4 = z9;
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
            j73Var2 = j73Var;
            z4 = z2;
            z5 = z3;
            ee3Var2 = ee3Var;
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            final j73 j73Var5 = j73Var2;
            u34VarP.n = new bz1() { // from class: he3
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oe3.y(lb4Var, z, my1Var, nm0Var, j73Var5, z4, bz1Var, z5, ee3Var2, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }
}
