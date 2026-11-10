package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ah4 {
    public static final float g;
    public static final float n;
    public static final float r;
    public static final ek1 v;
    public static final dm1 x;
    public static final float y;

    static {
        int i = jj0.t;
        ug4 ug4Var = ug4.g;
        g = 240.0f;
        y = 360.0f;
        r = 720.0f;
        n = 4.0f;
        hy0 hy0Var = i83.y;
        hy0 hy0Var2 = new hy0(0.0f, 1.0f, 0.0f, 1.0f);
        qe5 qe5Var = new qe5(600, 100, hy0Var);
        qe5 qe5Var2 = new qe5(350, 100, hy0Var2);
        m50.e0(350, 0, hy0Var2, 2);
        qe5 qe5Var3 = new qe5(600, 100, hy0Var);
        qe5 qe5Var4 = new qe5(350, 100, hy0Var2);
        v = yj1.v(qe5Var, 2).g(yj1.n(qe5Var3, 14));
        x = yj1.x(qe5Var2, 2).g(yj1.t(qe5Var4, 14));
    }

    public static final void g(nm0 nm0Var, boolean z, xy1 xy1Var, j73 j73Var, cn4 cn4Var, pg4 pg4Var, nm0 nm0Var2, h02 h02Var, int i) {
        int i2;
        h02 h02Var2;
        h02Var.Z(-2008777812);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(nm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(xy1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.x(j73Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.x(cn4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= h02Var.x(pg4Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= h02Var.r(0.0f) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= h02Var.r(0.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= h02Var.j(nm0Var2) ? 67108864 : 33554432;
        }
        if (h02Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            h02Var.S();
            if ((i & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
            }
            h02Var.s();
            long j = pg4Var.g;
            int i3 = i2 >> 6;
            int i4 = i2;
            uz4.g(mq4.q(j73Var.n(new ns5()), y), cn4Var, j, tj0.y(j, h02Var), 0.0f, 0.0f, null, ue5.m0(401953073, new xg4(nm0Var, z, pg4Var, nm0Var2), h02Var), h02Var, ((i2 >> 9) & 112) | 12582912 | (i3 & 57344) | (i3 & 458752), 64);
            h02Var2 = h02Var;
            boolean z2 = (i4 & 896) == 256;
            Object objK = h02Var2.K();
            if (z2 || objK == oo0.g) {
                objK = new mm1(xy1Var, (byte) 2);
                h02Var2.i0(objK);
            }
            y94.n(z, (my1) objK, h02Var2, (i4 >> 3) & 14);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new mz(nm0Var, z, xy1Var, j73Var, cn4Var, pg4Var, nm0Var2, i);
        }
    }

    public static final void y(final String str, final xy1 xy1Var, final xy1 xy1Var2, final boolean z, final xy1 xy1Var3, final j73 j73Var, boolean z2, final bz1 bz1Var, final bz1 bz1Var2, final bz1 bz1Var3, cn4 cn4Var, pg4 pg4Var, final nm0 nm0Var, h02 h02Var, final int i) {
        final boolean z3;
        final cn4 cn4Var2;
        final pg4 pg4Var2;
        cn4 cn4VarY;
        h02 h02Var2;
        pg4 pg4Var3;
        boolean z4;
        h02Var.Z(1929583712);
        int i2 = i | (h02Var.x(str) ? 4 : 2) | (h02Var.j(xy1Var) ? 32 : 16) | (h02Var.j(xy1Var2) ? 256 : 128) | (h02Var.l(z) ? 2048 : 1024) | (h02Var.j(xy1Var3) ? 16384 : 8192) | (h02Var.x(j73Var) ? 131072 : 65536) | 1572864 | (h02Var.j(bz1Var3) ? 536870912 : 268435456);
        if (h02Var.N(i2 & 1, (i2 & 306783379) != 306783378)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                ug4 ug4Var = ug4.g;
                cn4VarY = vn4.y(de6.y, h02Var);
                sj0 sj0Var = be6.g;
                long jV = tj0.v(sj0Var, h02Var);
                long jV2 = tj0.v(de6.g, h02Var);
                sj0 sj0Var2 = be6.n;
                long jV3 = tj0.v(sj0Var2, h02Var);
                long jV4 = tj0.v(sj0Var2, h02Var);
                sj0 sj0Var3 = ib6.l;
                long jV5 = tj0.v(sj0Var3, h02Var);
                float f = ib6.j;
                long jY = jj0.y(f, jV5);
                long jV6 = tj0.v(ib6.y, h02Var);
                x75 x75Var = (x75) h02Var.a(y75.g);
                sj0 sj0Var4 = be6.v;
                long jV7 = tj0.v(sj0Var4, h02Var);
                long jV8 = tj0.v(sj0Var4, h02Var);
                long jY2 = jj0.y(ib6.q, tj0.v(ib6.m, h02Var));
                sj0 sj0Var5 = be6.l;
                long jV9 = tj0.v(sj0Var5, h02Var);
                long jV10 = tj0.v(sj0Var5, h02Var);
                long jY3 = jj0.y(ib6.b, tj0.v(ib6.i, h02Var));
                sj0 sj0Var6 = be6.x;
                long jV11 = tj0.v(sj0Var6, h02Var);
                long jV12 = tj0.v(sj0Var6, h02Var);
                long jY4 = jj0.y(f, tj0.v(sj0Var3, h02Var));
                sj0 sj0Var7 = ib6.F;
                long jV13 = tj0.v(sj0Var7, h02Var);
                long jV14 = tj0.v(sj0Var7, h02Var);
                long jY5 = jj0.y(f, tj0.v(sj0Var7, h02Var));
                sj0 sj0Var8 = ib6.G;
                long jV15 = tj0.v(sj0Var8, h02Var);
                long jV16 = tj0.v(sj0Var8, h02Var);
                long jY6 = jj0.y(f, tj0.v(sj0Var8, h02Var));
                h02Var2 = h02Var;
                pg4Var3 = new pg4(jV, jV2, bi6.i(jV3, jV4, jY, 0L, (1048576 & 1048575) != 0 ? tj0.v(sj0Var, h02Var) : jV, (2097152 & 1048575) != 0 ? tj0.v(sj0Var, h02Var) : jV, (4194304 & 1048575) != 0 ? tj0.v(sj0Var, h02Var) : jV, 0L, jV6, 0L, x75Var, 0L, 0L, 0L, 0L, jV7, jV8, jY2, 0L, jV9, jV10, jY3, 0L, 0L, 0L, 0L, 0L, jV11, jV12, jY4, 0L, jV13, jV14, jY5, 0L, jV15, jV16, jY6, 0L, h02Var, 1204058760, 2191));
                z4 = true;
            } else {
                h02Var.Q();
                z4 = z2;
                cn4VarY = cn4Var;
                pg4Var3 = pg4Var;
                h02Var2 = h02Var;
            }
            h02Var2.s();
            int i3 = i2 >> 6;
            pg4 pg4Var4 = pg4Var3;
            cn4 cn4Var3 = cn4VarY;
            g(ue5.m0(-1275782414, new yg4(pg4Var3, str, xy1Var, xy1Var2, z, xy1Var3, z4, bz1Var, bz1Var2, bz1Var3), h02Var2), z, xy1Var3, j73Var, cn4Var3, pg4Var4, nm0Var, h02Var2, (i3 & 7168) | (i3 & 112) | 6 | (i3 & 896) | 114819072);
            pg4Var2 = pg4Var4;
            cn4Var2 = cn4Var3;
            z3 = z4;
        } else {
            h02Var.Q();
            z3 = z2;
            cn4Var2 = cn4Var;
            pg4Var2 = pg4Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(str, xy1Var, xy1Var2, z, xy1Var3, j73Var, z3, bz1Var, bz1Var2, bz1Var3, cn4Var2, pg4Var2, nm0Var, i) { // from class: vg4
                public final /* synthetic */ xy1 a;
                public final /* synthetic */ bz1 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ bz1 i;
                public final /* synthetic */ String j;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ cn4 p;
                public final /* synthetic */ xy1 q;
                public final /* synthetic */ bz1 s;
                public final /* synthetic */ xy1 t;
                public final /* synthetic */ pg4 u;
                public final /* synthetic */ j73 w;
                public final /* synthetic */ nm0 z;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(113246209);
                    ah4.y(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, this.b, this.s, this.p, this.u, this.z, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }
}
