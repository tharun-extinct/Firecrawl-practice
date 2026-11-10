package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class yo5 {
    public xo5 g;

    public yo5(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.g = new wo5(c2.a(i, interpolator, j));
        } else {
            this.g = new to5(i, interpolator, j);
        }
    }

    public static void g(View view, ri0 ri0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(ri0Var != null ? new vo5(ri0Var) : null);
        } else {
            to5.q(view, ri0Var);
        }
    }
}
