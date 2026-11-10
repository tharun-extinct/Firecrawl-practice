package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class wm1 {
    public static volatile wm1 g;
    public static final wm1 y;

    static {
        wm1 wm1Var = new wm1();
        Map map = Collections.EMPTY_MAP;
        y = wm1Var;
    }

    public static wm1 g() {
        wm1 wm1Var;
        z04 z04Var = z04.r;
        wm1 wm1Var2 = g;
        if (wm1Var2 != null) {
            return wm1Var2;
        }
        synchronized (wm1.class) {
            try {
                wm1Var = g;
                if (wm1Var == null) {
                    Class cls = um1.g;
                    wm1 wm1Var3 = null;
                    if (cls != null) {
                        try {
                            wm1Var3 = (wm1) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    wm1Var = wm1Var3 != null ? wm1Var3 : y;
                    g = wm1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wm1Var;
    }
}
