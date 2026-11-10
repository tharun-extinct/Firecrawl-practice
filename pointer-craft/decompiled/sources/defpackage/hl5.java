package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hl5 {
    public static int g(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void y(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
