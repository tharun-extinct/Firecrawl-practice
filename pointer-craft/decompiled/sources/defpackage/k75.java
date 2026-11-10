package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k75 {
    public final j75 g;
    public bl2 r;
    public bl2 y = null;

    public k75(j75 j75Var, bl2 bl2Var) {
        this.g = j75Var;
        this.r = bl2Var;
    }

    public final long g(long j) {
        k44 k44VarH;
        bl2 bl2Var = this.y;
        k44 k44Var = k44.v;
        if (bl2Var != null) {
            if (bl2Var.W()) {
                bl2 bl2Var2 = this.r;
                k44VarH = bl2Var2 != null ? bl2Var2.H(bl2Var, true) : null;
            } else {
                k44VarH = k44Var;
            }
            if (k44VarH != null) {
                k44Var = k44VarH;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = k44Var.g;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = k44Var.r;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = k44Var.y;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = k44Var.n;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final long n(long j) {
        bl2 bl2Var;
        bl2 bl2Var2 = this.y;
        if (bl2Var2 != null) {
            if (!bl2Var2.W()) {
                bl2Var2 = null;
            }
            if (bl2Var2 != null && (bl2Var = this.r) != null) {
                bl2 bl2Var3 = bl2Var.W() ? bl2Var : null;
                if (bl2Var3 != null) {
                    return bl2Var2.p(bl2Var3, j);
                }
            }
        }
        return j;
    }

    public final boolean r(long j) {
        long jN = n(g(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jN));
        j75 j75Var = this.g;
        int iV = j75Var.y.v(fIntBitsToFloat);
        int i = (int) (jN >> 32);
        return Float.intBitsToFloat(i) >= j75Var.v(iV) && Float.intBitsToFloat(i) <= j75Var.x(iV);
    }

    public final long v(long j) {
        bl2 bl2Var;
        bl2 bl2Var2 = this.y;
        if (bl2Var2 != null) {
            if (!bl2Var2.W()) {
                bl2Var2 = null;
            }
            if (bl2Var2 != null && (bl2Var = this.r) != null) {
                bl2 bl2Var3 = bl2Var.W() ? bl2Var : null;
                if (bl2Var3 != null) {
                    return bl2Var3.p(bl2Var2, j);
                }
            }
        }
        return j;
    }

    public final int y(long j, boolean z) {
        if (z) {
            j = g(j);
        }
        return this.g.y.l(n(j));
    }
}
