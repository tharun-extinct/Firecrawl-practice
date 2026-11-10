package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mo2 extends b12 {
    public static final int ACTION_PARAMETERS_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int CLASS_NAME_FIELD_NUMBER = 1;
    private static final mo2 DEFAULT_INSTANCE;
    private static volatile yp3 PARSER;
    private int appWidgetId_;
    private String className_ = "";
    private ea0 actionParameters_ = ea0.t;

    static {
        mo2 mo2Var = new mo2();
        DEFAULT_INSTANCE = mo2Var;
        b12.a(mo2.class, mo2Var);
    }

    public static lo2 b() {
        return (lo2) DEFAULT_INSTANCE.y();
    }

    public static mo2 i() {
        return DEFAULT_INSTANCE;
    }

    public final String c() {
        return this.className_;
    }

    public final void p(int i) {
        this.appWidgetId_ = i;
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
                return new z24(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"className_", "appWidgetId_", "actionParameters_"});
            case 3:
                return new mo2();
            case 4:
                return new lo2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                yp3 yp3Var = PARSER;
                if (yp3Var != null) {
                    return yp3Var;
                }
                synchronized (mo2.class) {
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

    public final void s(ca0 ca0Var) {
        this.actionParameters_ = ca0Var;
    }

    public final void u(String str) {
        this.className_ = str;
    }

    public final ea0 w() {
        return this.actionParameters_;
    }
}
