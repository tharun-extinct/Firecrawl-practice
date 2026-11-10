package defpackage;

import android.graphics.Insets;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class t70 {
    public static void g(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static void n(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void r(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static Insets y(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }
}
