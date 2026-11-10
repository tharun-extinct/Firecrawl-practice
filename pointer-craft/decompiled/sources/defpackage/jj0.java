package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jj0 {
    public static final long j;
    public static final long l;
    public static final long n;
    public static final long r;
    public static final /* synthetic */ int t = 0;
    public static final long v;
    public static final long x;
    public static final long y = ra.v(4278190080L);
    public final long g;

    static {
        ra.v(4282664004L);
        ra.v(4287137928L);
        ra.v(4291611852L);
        r = ra.v(4294967295L);
        n = ra.v(4294901760L);
        v = ra.v(4278255360L);
        x = ra.v(4278190335L);
        ra.v(4294967040L);
        ra.v(4278255615L);
        ra.v(4294902015L);
        l = ra.n(0);
        float[] fArr = wj0.g;
        j = ra.r(0.0f, 0.0f, 0.0f, 0.0f, wj0.h);
    }

    public /* synthetic */ jj0(long j2) {
        this.g = j2;
    }

    public static final long g(long j2, uj0 uj0Var) {
        ur0 ur0VarI;
        uj0 uj0VarV = v(j2);
        int i = uj0VarV.r;
        int i2 = uj0Var.r;
        if ((i | i2) < 0) {
            ur0VarI = v70.i(uj0VarV, uj0Var);
        } else {
            ha3 ha3Var = vr0.g;
            int i3 = i | (i2 << 6);
            Object objY = ha3Var.y(i3);
            if (objY == null) {
                objY = v70.i(uj0VarV, uj0Var);
                ha3Var.t(i3, objY);
            }
            ur0VarI = (ur0) objY;
        }
        return ur0VarI.g(j2);
    }

    public static String j(long j2) {
        float fL = l(j2);
        float fX = x(j2);
        float fN = n(j2);
        float fR = r(j2);
        String str = v(j2).g;
        StringBuilder sbU = du4.u("Color(", fL, ", ", fX, ", ");
        sbU.append(fN);
        sbU.append(", ");
        sbU.append(fR);
        sbU.append(", ");
        return du4.b(sbU, str, ")");
    }

    public static final float l(long j2) {
        int i;
        int i2;
        int i3;
        if ((63 & j2) == 0) {
            return ((float) js2.e((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - fq1.g;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float n(long j2) {
        int i;
        int i2;
        int i3;
        if ((63 & j2) == 0) {
            return ((float) js2.e((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - fq1.g;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float r(long j2) {
        float fE;
        float f;
        if ((63 & j2) == 0) {
            fE = (float) js2.e((j2 >>> 56) & 255);
            f = 255.0f;
        } else {
            fE = (float) js2.e((j2 >>> 6) & 1023);
            f = 1023.0f;
        }
        return fE / f;
    }

    public static final uj0 v(long j2) {
        float[] fArr = wj0.g;
        return wj0.d[(int) (j2 & 63)];
    }

    public static final float x(long j2) {
        int i;
        int i2;
        int i3;
        if ((63 & j2) == 0) {
            return ((float) js2.e((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - fq1.g;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static long y(float f, long j2) {
        return ra.r(l(j2), x(j2), n(j2), f, v(j2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jj0) {
            return this.g == ((jj0) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.g);
    }

    public final String toString() {
        return j(this.g);
    }
}
