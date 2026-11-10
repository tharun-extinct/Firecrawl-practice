package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class az5 {
    public static final nm0 g = new nm0(-1571120048, false, new um0());
    public static final nm0 y = new nm0(-1455401925, false, new at(10));

    public static final void g(j73 j73Var, j14 j14Var, nm0 nm0Var, h02 h02Var, int i) {
        int i2;
        h02Var.Z(-714464401);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(j73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.x(j14Var) ? 32 : 16;
        }
        int i3 = i & 384;
        nm0 nm0Var2 = cz5.g;
        if (i3 == 0) {
            i2 |= h02Var.j(nm0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.j(nm0Var) ? 2048 : 1024;
        }
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                Object tp3Var = new tp3(null, hi0.B);
                h02Var.i0(tp3Var);
                objK = tp3Var;
            }
            yy yyVarY = y(nm0Var2, h02Var, (i2 >> 6) & 14);
            og0.y(j14Var.g(yyVarY), ue5.m0(274270255, new zy((Object) j73Var, objK, (Object) nm0Var, (Object) yyVarY, (byte) 0), h02Var), h02Var, 56);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new je(j73Var, j14Var, nm0Var, i, (byte) 3);
        }
    }

    public static long n() {
        return eb5.g;
    }

    public static final int r(j51 j51Var, float f) {
        if (Math.abs(f) < j51Var.e(400.0f)) {
            return 0;
        }
        return f > 0.0f ? 1 : 2;
    }

    public static final int v(ls2 ls2Var) {
        return (int) (ls2Var.b == um3.j ? ls2Var.t() & 4294967295L : ls2Var.t() >> 32);
    }

    public static long x(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static final yy y(nm0 nm0Var, h02 h02Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && h02Var.x(nm0Var)) || (i & 6) == 4;
        Object objK = h02Var.K();
        Object obj = oo0.g;
        if (z || objK == obj) {
            objK = new yy(nm0Var);
            h02Var.i0(objK);
        }
        yy yyVar = (yy) objK;
        boolean zX = h02Var.x(yyVar);
        Object objK2 = h02Var.K();
        if (zX || objK2 == obj) {
            objK2 = new h((Object) yyVar, (byte) 9);
            h02Var.i0(objK2);
        }
        k33.j(yyVar, (xy1) objK2, h02Var);
        return yyVar;
    }
}
