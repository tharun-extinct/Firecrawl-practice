package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class oa1 {
    public static Handler g(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int r(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int v(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int x(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static List y(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }
}
