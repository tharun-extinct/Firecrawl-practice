package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nk5 {
    public static WindowInsets g(View view, WindowInsets windowInsets) {
        int i = gl5.g;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
