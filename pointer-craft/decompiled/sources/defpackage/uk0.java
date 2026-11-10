package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uk0 {
    public static final g3 g = new g3("CommonUtils");

    public static String g(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            g3 g3Var = g;
            if (!Log.isLoggable(g3Var.g, 6)) {
                return "";
            }
            String str = g3Var.y;
            if (str != null) {
                strConcat = str.concat(strConcat);
            }
            Log.e("CommonUtils", strConcat);
            return "";
        }
    }
}
