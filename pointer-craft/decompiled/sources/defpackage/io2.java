package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class io2 extends b12 {
    private static final io2 DEFAULT_INSTANCE;
    private static volatile yp3 PARSER;

    static {
        io2 io2Var = new io2();
        DEFAULT_INSTANCE = io2Var;
        b12.a(io2.class, io2Var);
    }

    public static ho2 w() {
        return (ho2) DEFAULT_INSTANCE.y();
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
                return new z24(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new io2();
            case 4:
                return new ho2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                yp3 yp3Var = PARSER;
                if (yp3Var != null) {
                    return yp3Var;
                }
                synchronized (io2.class) {
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
}
