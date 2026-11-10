package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class l51 implements k51, hq5 {
    public static final l51 j = new l51();
    public static final l51 t = new l51();

    @Override // defpackage.hq5
    public dq5 g(ContextWrapper contextWrapper, k51 k51Var) {
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new dq5(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.k51
    public float r(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
