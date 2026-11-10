package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class tn3 {
    public static final String g = iy2.v("PackageManagerHelper");

    public static void g(Context context, Class cls, boolean z) {
        String str = g;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            iy2.r().g(str, cls.getName() + " " + (z ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e) {
            iy2.r().g(str, du4.i(cls.getName(), " could not be ", z ? "enabled" : "disabled"), e);
        }
    }
}
