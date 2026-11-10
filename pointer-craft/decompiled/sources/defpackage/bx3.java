package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bx3 extends c12 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final bx3 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile zp3 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        bx3 bx3Var = new bx3();
        DEFAULT_INSTANCE = bx3Var;
        c12.a(bx3.class, bx3Var);
    }

    public static bx3 c() {
        return DEFAULT_INSTANCE;
    }

    public static ax3 o() {
        return (ax3) ((y02) DEFAULT_INSTANCE.r(5));
    }

    public final void A(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void B(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void C(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void D(zw3 zw3Var) {
        this.value_ = zw3Var;
        this.valueCase_ = 6;
    }

    public final float b() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final void d(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void e(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    public final void f(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final int h() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final double i() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final void k(da0 da0Var) {
        this.valueCase_ = 8;
        this.value_ = da0Var;
    }

    public final long p() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final boolean q() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    @Override // defpackage.c12
    public final Object r(int i) {
        zp3 a12Var;
        switch (du4.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a34(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", zw3.class});
            case 3:
                return new bx3();
            case 4:
                return new ax3(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                zp3 zp3Var = PARSER;
                if (zp3Var != null) {
                    return zp3Var;
                }
                synchronized (bx3.class) {
                    try {
                        a12Var = PARSER;
                        if (a12Var == null) {
                            a12Var = new a12();
                            PARSER = a12Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return a12Var;
            default:
                uo1.f();
                return null;
        }
    }

    public final int s() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final String u() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final da0 w() {
        return this.valueCase_ == 8 ? (da0) this.value_ : da0.a;
    }

    public final zw3 z() {
        return this.valueCase_ == 6 ? (zw3) this.value_ : zw3.w();
    }
}
