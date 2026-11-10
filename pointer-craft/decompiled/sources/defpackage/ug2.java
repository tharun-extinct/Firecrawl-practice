package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class ug2 implements Interpolator {
    public final /* synthetic */ byte g;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.g) {
            case 0:
                return f * f * f * f * f;
            case 1:
            case 2:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
