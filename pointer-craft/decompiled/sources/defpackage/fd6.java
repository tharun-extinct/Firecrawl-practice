package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fd6 {
    public static final jk4[] g = new jk4[0];
    public static ha2 y;

    public static final boolean a(qu3 qu3Var) {
        return !wi3.y(t(qu3Var, true), 0L);
    }

    public static final boolean g(qu3 qu3Var) {
        return (qu3Var.q() || qu3Var.j || !qu3Var.n) ? false : true;
    }

    public static final long j(qu3 qu3Var) {
        return t(qu3Var, true);
    }

    public static final long l(qu3 qu3Var) {
        return t(qu3Var, false);
    }

    public static final int m(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(m76.g);
        int length = bytes.length;
        if (length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }

    public static final boolean n(qu3 qu3Var) {
        return qu3Var.j && !qu3Var.n;
    }

    public static final boolean r(qu3 qu3Var) {
        return (qu3Var.q() || !qu3Var.j || qu3Var.n) ? false : true;
    }

    public static final long t(qu3 qu3Var, boolean z) {
        long jN = wi3.n(qu3Var.r, qu3Var.l);
        if (z || !qu3Var.q()) {
            return jN;
        }
        return 0L;
    }

    public static final boolean v(long j, qu3 qu3Var) {
        long j2 = qu3Var.r;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat > ((float) i)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 > ((float) i2));
    }

    public static final boolean x(qu3 qu3Var, long j, long j2) {
        int i = qu3Var.t == 1 ? 1 : 0;
        long j3 = qu3Var.r;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final boolean y(qu3 qu3Var) {
        return !qu3Var.j && qu3Var.n;
    }
}
