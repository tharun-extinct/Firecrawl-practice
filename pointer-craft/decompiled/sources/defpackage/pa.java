package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class pa {
    public static final pa g = new pa();

    public static PointerIcon y(Context context, ou3 ou3Var) {
        return ou3Var instanceof ud ? PointerIcon.getSystemIcon(context, ((ud) ou3Var).y) : PointerIcon.getSystemIcon(context, 1000);
    }

    public final void g(View view, ou3 ou3Var) {
        PointerIcon pointerIconY = y(view.getContext(), ou3Var);
        if (yf2.p(view.getPointerIcon(), pointerIconY)) {
            return;
        }
        view.setPointerIcon(pointerIconY);
    }
}
