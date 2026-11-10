package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface j51 {
    default float B0(float f) {
        return f / y();
    }

    default int K(long j) {
        return Math.round(j0(j));
    }

    default float M(long j) {
        if (!o85.g(n85.y(j), 4294967296L)) {
            oc2.y("Only Sp can convert to Px");
        }
        float[] fArr = jv1.g;
        if (w() < 1.03f) {
            return w() * n85.r(j);
        }
        iv1 iv1VarG = jv1.g(w());
        if (iv1VarG != null) {
            return iv1VarG.y(n85.r(j));
        }
        return w() * n85.r(j);
    }

    default int V(float f) {
        float fE = e(f);
        if (Float.isInfinite(fE)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fE);
    }

    default long d(long j) {
        if (j != 9205357640488583168L) {
            return k33.m(B0(Float.intBitsToFloat((int) (j >> 32))), B0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float e(float f) {
        return y() * f;
    }

    default long f(float f) {
        float[] fArr = jv1.g;
        if (w() < 1.03f) {
            return kq2.O(f / w(), 4294967296L);
        }
        iv1 iv1VarG = jv1.g(w());
        return kq2.O(iv1VarG != null ? iv1VarG.g(f) : f / w(), 4294967296L);
    }

    default long h0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fE = e(yb1.y(j));
        float fE2 = e(yb1.g(j));
        return (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L);
    }

    default float j0(long j) {
        if (!o85.g(n85.y(j), 4294967296L)) {
            oc2.y("Only Sp can convert to Px");
        }
        return e(M(j));
    }

    default long s0(float f) {
        return f(B0(f));
    }

    float w();

    float y();

    default float y0(int i) {
        return i / y();
    }
}
