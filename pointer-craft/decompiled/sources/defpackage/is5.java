package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class is5 {
    public static final is5 y;
    public fa4 g;

    static {
        is5 is5Var = new is5();
        is5Var.g = null;
        y = is5Var;
    }

    public static fa4 g(Context context) {
        fa4 fa4Var;
        is5 is5Var = y;
        synchronized (is5Var) {
            try {
                fa4Var = is5Var.g;
                if (fa4Var == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    fa4Var = new fa4((Object) context, (byte) 22);
                    is5Var.g = fa4Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fa4Var;
    }
}
