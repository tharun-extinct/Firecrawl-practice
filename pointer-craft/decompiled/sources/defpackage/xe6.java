package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xe6 {
    public static final vy3 g = new vy3(17);
    public static ha2 y;

    public static rk4 g(yl0 yl0Var) {
        Context applicationContext = yl0Var.getApplicationContext();
        if (applicationContext != null) {
            yl0Var = applicationContext;
        }
        return new rk4(new ja6(yl0Var));
    }
}
