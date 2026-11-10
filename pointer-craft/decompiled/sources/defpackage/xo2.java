package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xo2 extends b12 {
    private static final xo2 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile yp3 PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private zo2 layout_;

    static {
        xo2 xo2Var = new xo2();
        DEFAULT_INSTANCE = xo2Var;
        b12.a(xo2.class, xo2Var);
    }

    public static wo2 i() {
        return (wo2) DEFAULT_INSTANCE.y();
    }

    public final void b(zo2 zo2Var) {
        zo2Var.getClass();
        this.layout_ = zo2Var;
        this.bitField0_ |= 1;
    }

    public final int c() {
        return this.layoutIndex_;
    }

    @Override // defpackage.b12
    public final Object r(int i) {
        yp3 z02Var;
        switch (du4.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z24(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new xo2();
            case 4:
                return new wo2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                yp3 yp3Var = PARSER;
                if (yp3Var != null) {
                    return yp3Var;
                }
                synchronized (xo2.class) {
                    try {
                        z02Var = PARSER;
                        if (z02Var == null) {
                            z02Var = new z02();
                            PARSER = z02Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return z02Var;
            default:
                uo1.f();
                return null;
        }
    }

    public final void s(int i) {
        this.layoutIndex_ = i;
    }

    public final zo2 w() {
        zo2 zo2Var = this.layout_;
        return zo2Var == null ? zo2.c() : zo2Var;
    }
}
