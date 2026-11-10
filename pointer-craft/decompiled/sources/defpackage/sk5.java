package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sk5 {
    public static CharSequence g(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static void n(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static boolean r(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void v(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void x(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    public static boolean y(View view) {
        return view.isAccessibilityHeading();
    }
}
