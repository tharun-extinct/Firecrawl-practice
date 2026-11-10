package defpackage;

import android.graphics.Insets;
import android.util.CloseGuard;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c2 {
    public static /* synthetic */ WindowInsetsAnimation a(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* synthetic */ void b() {
    }

    public static /* bridge */ /* synthetic */ CloseGuard j(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* synthetic */ CloseGuard l() {
        return new CloseGuard();
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds t(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }
}
