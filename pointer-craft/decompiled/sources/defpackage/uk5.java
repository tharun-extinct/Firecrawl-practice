package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class uk5 {
    public static WindowInsets g(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static void r(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static CharSequence y(View view) {
        return view.getStateDescription();
    }
}
