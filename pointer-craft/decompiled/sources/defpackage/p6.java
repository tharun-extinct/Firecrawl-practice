package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p6 {
    public static final bo3 g = new bo3(24.0f, 24.0f, 24.0f, 24.0f);
    public static final bo3 y = ue5.s(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final bo3 r = ue5.s(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final bo3 n = ue5.s(0.0f, 0.0f, 0.0f, 24.0f, 7);
    public static final vf1 v = new vf1(new h6((byte) 0), (byte) 0);

    public static final void g(final nm0 nm0Var, j73 j73Var, final bz1 bz1Var, final bz1 bz1Var2, final bz1 bz1Var3, final cn4 cn4Var, final long j, final long j2, final long j3, final long j4, final long j5, h02 h02Var, final int i) {
        final j73 j73Var2;
        h02Var.Z(1378716401);
        int i2 = i | 48 | (h02Var.j(bz1Var) ? 256 : 128) | (h02Var.j(bz1Var2) ? 2048 : 1024) | (h02Var.j(bz1Var3) ? 16384 : 8192) | (h02Var.x(cn4Var) ? 131072 : 65536) | (h02Var.v(j) ? 1048576 : 524288) | (h02Var.r(0.0f) ? 8388608 : 4194304) | (h02Var.v(j2) ? 67108864 : 33554432) | (h02Var.v(j3) ? 536870912 : 268435456);
        if (h02Var.N(i2 & 1, ((i2 & 306783379) == 306783378 && (((h02Var.v(j4) ? (char) 4 : (char) 2) | (h02Var.v(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            nm0 nm0VarM0 = ue5.m0(-652798794, new l6(bz1Var, bz1Var2, bz1Var3, j3, j4, j5, j2, nm0Var), h02Var);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            g73 g73Var = g73.g;
            uz4.g(g73Var, cn4Var, j, 0L, 0.0f, 0.0f, null, nm0VarM0, h02Var, i4, 104);
            j73Var2 = g73Var;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(j73Var2, bz1Var, bz1Var2, bz1Var3, cn4Var, j, j2, j3, j4, j5, i) { // from class: e6
                public final /* synthetic */ bz1 a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long i;
                public final /* synthetic */ bz1 m;
                public final /* synthetic */ long p;
                public final /* synthetic */ bz1 q;
                public final /* synthetic */ long s;
                public final /* synthetic */ j73 t;
                public final /* synthetic */ cn4 w;

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(7);
                    p6.g(this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i, this.b, this.s, this.p, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final void n(my1 my1Var, j73 j73Var, o91 o91Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(24925658);
        if ((i & 6) == 0) {
            i2 = (h02Var.j(my1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(j73Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.x(o91Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(nm0Var) ? 2048 : 1024;
        }
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ((h11) h02Var.a(v)).g(new ty(my1Var, j73Var, o91Var, nm0Var, (byte) 0), h02Var, 0);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new g6((Object) my1Var, j73Var, (Object) o91Var, (jz1) nm0Var, i, (byte) 0);
        }
    }

    public static final void r(my1 my1Var, nm0 nm0Var, j73 j73Var, bz1 bz1Var, bz1 bz1Var2, bz1 bz1Var3, bz1 bz1Var4, cn4 cn4Var, long j, long j2, long j3, long j4, o91 o91Var, h02 h02Var, int i, int i2) {
        int i3;
        nm0 nm0Var2;
        bz1 bz1Var5;
        int i4;
        h02Var.Z(-867616355);
        if ((i & 6) == 0) {
            i3 = (h02Var.j(my1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            nm0Var2 = nm0Var;
            i3 |= h02Var.j(nm0Var2) ? 32 : 16;
        } else {
            nm0Var2 = nm0Var;
        }
        if ((i & 384) == 0) {
            i3 |= h02Var.x(j73Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            bz1Var5 = bz1Var;
            i3 |= h02Var.j(bz1Var5) ? 2048 : 1024;
        } else {
            bz1Var5 = bz1Var;
        }
        if ((i & 24576) == 0) {
            i3 |= h02Var.j(bz1Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= h02Var.j(bz1Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= h02Var.j(bz1Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= h02Var.x(cn4Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= h02Var.v(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= h02Var.v(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (h02Var.v(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= h02Var.v(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= h02Var.r(0.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= h02Var.x(o91Var) ? 2048 : 1024;
        }
        int i5 = i4;
        if (h02Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            n(my1Var, j73Var, o91Var, ue5.m0(527420759, new o6(bz1Var2, bz1Var3, bz1Var4, cn4Var, j, j2, j3, j4, bz1Var5, nm0Var2), h02Var), h02Var, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new i6(my1Var, nm0Var, j73Var, bz1Var, bz1Var2, bz1Var3, bz1Var4, cn4Var, j, j2, j3, j4, o91Var, i, i2, (byte) 0);
        }
    }

    public static final void y(nm0 nm0Var, h02 h02Var, int i) {
        h02Var.Z(-917637668);
        byte b = 0;
        if (h02Var.N(i & 1, (i & 147) != 146)) {
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new mb((byte) 4);
                h02Var.i0(objK);
            }
            t33 t33Var = (t33) objK;
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, g73.g);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33Var);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            du4.h(6, nm0Var, h02Var, true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new f6(nm0Var, i, b);
        }
    }
}
