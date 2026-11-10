package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class oa {
    public static final oa g = new oa();

    public final void g(View view) {
        view.clearViewTranslationCallback();
    }

    public final void y(View view) {
        la laVar = la.g;
        la laVar2 = la.g;
        view.setViewTranslationCallback(laVar);
    }
}
