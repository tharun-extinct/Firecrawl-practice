package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ng6 {
    public static nc g;
    public static ha2 n;
    public static pb0 r;
    public static c9 y;

    public static final void g(my1 my1Var, nm0 nm0Var, j73 j73Var, bz1 bz1Var, bz1 bz1Var2, bz1 bz1Var3, bz1 bz1Var4, cn4 cn4Var, long j, long j2, long j3, long j4, o91 o91Var, h02 h02Var, int i, int i2) {
        int i3;
        nm0 nm0Var2;
        j73 j73Var2;
        bz1 bz1Var5;
        int i4;
        h02Var.Z(94478519);
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
            j73Var2 = j73Var;
            i3 |= h02Var.x(j73Var2) ? 256 : 128;
        } else {
            j73Var2 = j73Var;
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
            h02Var.S();
            if ((i & 1) != 0 && !h02Var.k()) {
                h02Var.Q();
            }
            h02Var.s();
            p6.r(my1Var, nm0Var2, j73Var2, bz1Var5, bz1Var2, bz1Var3, bz1Var4, cn4Var, j, j2, j3, j4, o91Var, h02Var, i3 & 2147483646, i5 & 8190);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new i6(my1Var, nm0Var, j73Var, bz1Var, bz1Var2, bz1Var3, bz1Var4, cn4Var, j, j2, j3, j4, o91Var, i, i2, (byte) 1);
        }
    }

    public static final ha2 y() {
        ha2 ha2Var = n;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Stop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(16.0f, 8.0f);
        kq3Var.w(8.0f);
        kq3Var.n(8.0f);
        kq3Var.q(8.0f);
        kq3Var.v(8.0f);
        kq3Var.t(2.0f, -2.0f);
        kq3Var.n(6.0f);
        kq3Var.w(12.0f);
        kq3Var.v(12.0f);
        kq3Var.q(6.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        n = ha2VarY;
        return ha2VarY;
    }
}
