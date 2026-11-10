package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gb {
    public static final float g = (25.0f * 2.0f) / 2.4142137f;

    public static final void g(cj3 cj3Var, j73 j73Var, long j, h02 h02Var, int i) {
        int i2;
        h02Var.Z(1776202187);
        int i3 = (h02Var.x(cj3Var) ? 4 : 2) | i | (h02Var.x(j73Var) ? 32 : 16) | 128;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                h02Var.Q();
                i2 = i3 & (-897);
            }
            h02Var.s();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objK = h02Var.K();
            if (z || objK == oo0.g) {
                objK = new h(cj3Var, (byte) 7);
                h02Var.i0(objK);
            }
            gh6.g(cj3Var, hi0.a, ue5.m0(-1653527038, new bb(j, dj4.g(j73Var, false, (xy1) objK)), h02Var), h02Var, i4 | 432);
        } else {
            h02Var.Q();
        }
        long j2 = j;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new cb(cj3Var, j73Var, j2, i, (byte) 0);
        }
    }

    public static final void y(j73 j73Var, h02 h02Var, int i, int i2) {
        int i3;
        h02Var.Z(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (h02Var.x(j73Var) ? 4 : 2) | i;
        }
        byte b = 0;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                j73Var = g73.g;
            }
            mq2.y(h02Var, a11.c(mq4.t(j73Var, g, 25.0f), new eb(((x75) h02Var.a(y75.g)).g, (byte) 0)));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new db(j73Var, i, i2, b);
        }
    }
}
