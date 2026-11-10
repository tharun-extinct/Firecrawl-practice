package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ui6 {
    public static final uy5 y = uy5.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String g;

    public ui6(Context context, io4 io4Var) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        uk0.g(context);
        synchronized (aj6.class) {
            if (aj6.t == null) {
                aj6.t = new aj6((byte) 0);
            }
        }
        this.g = "common";
        v92.E();
        v92.Q(new cp4(this, (byte) 3));
        v92.E();
        io4Var.getClass();
        v92.Q(new ph6(io4Var, (byte) 1));
        uy5 uy5Var = y;
        if (uy5Var.containsKey("common")) {
            bg1.y(context, (String) uy5Var.get("common"), false);
        }
    }
}
