package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class dl5 implements Interpolator {
    public final /* synthetic */ el5 g;

    public dl5(el5 el5Var) {
        this.g = el5Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.g.h.getInterpolation(f);
    }
}
