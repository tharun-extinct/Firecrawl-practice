package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oo2 extends b12 {
    public static final int APP_WIDGET_IDS_FIELD_NUMBER = 2;
    private static final oo2 DEFAULT_INSTANCE;
    private static volatile yp3 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetIdsMemoizedSerializedSize = -1;
    private String receiver_ = "";
    private cf2 appWidgetIds_ = ce2.m;

    static {
        oo2 oo2Var = new oo2();
        DEFAULT_INSTANCE = oo2Var;
        b12.a(oo2.class, oo2Var);
    }

    public static oo2 i() {
        return DEFAULT_INSTANCE;
    }

    public static no2 s() {
        return (no2) DEFAULT_INSTANCE.y();
    }

    public final String b() {
        return this.receiver_;
    }

    public final cf2 c() {
        return this.appWidgetIds_;
    }

    public final void p(String str) {
        str.getClass();
        this.receiver_ = str;
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
                return new z24(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002'", new Object[]{"receiver_", "appWidgetIds_"});
            case 3:
                return new oo2();
            case 4:
                return new no2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                yp3 yp3Var = PARSER;
                if (yp3Var != null) {
                    return yp3Var;
                }
                synchronized (oo2.class) {
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

    public final void w(List list) {
        df2 df2Var = this.appWidgetIds_;
        boolean z = ((a1) df2Var).j;
        df2 df2Var2 = df2Var;
        if (!z) {
            ce2 ce2Var = (ce2) df2Var;
            int size = ce2Var.size();
            ce2 ce2VarT = ce2Var.t(size == 0 ? 10 : size * 2);
            this.appWidgetIds_ = ce2VarT;
            df2Var2 = ce2VarT;
        }
        x02.g(list, df2Var2);
    }
}
