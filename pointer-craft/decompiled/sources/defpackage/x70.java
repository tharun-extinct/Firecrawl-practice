package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.os.Bundle;
import android.text.StaticLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class x70 {
    public static PackageInfo g(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static final void n(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static ArrayList r(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Object y(String str, Bundle bundle) {
        return bundle.getParcelable(str, r4.class);
    }
}
