package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class ro5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ yo5 g;
    public final /* synthetic */ int n;
    public final /* synthetic */ tp5 r;
    public final /* synthetic */ View v;
    public final /* synthetic */ tp5 y;

    public ro5(yo5 yo5Var, tp5 tp5Var, tp5 tp5Var2, int i, View view) {
        this.g = yo5Var;
        this.y = tp5Var;
        this.r = tp5Var2;
        this.n = i;
        this.v = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gp5 ap5Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        yo5 yo5Var = this.g;
        xo5 xo5Var = yo5Var.g;
        xo5Var.v(animatedFraction);
        float fR = xo5Var.r();
        PathInterpolator pathInterpolator = to5.v;
        int i = Build.VERSION.SDK_INT;
        tp5 tp5Var = this.y;
        if (i >= 36) {
            ap5Var = new fp5(tp5Var);
        } else if (i >= 35) {
            ap5Var = new ep5(tp5Var);
        } else if (i >= 34) {
            ap5Var = new dp5(tp5Var);
        } else if (i >= 31) {
            ap5Var = new cp5(tp5Var);
        } else if (i >= 30) {
            ap5Var = new bp5(tp5Var);
        } else {
            ap5Var = i >= 29 ? new ap5(tp5Var) : new zo5(tp5Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.n & i2;
            pp5 pp5Var = tp5Var.g;
            if (i3 == 0) {
                ap5Var.n(i2, pp5Var.t(i2));
            } else {
                nd2 nd2VarT = pp5Var.t(i2);
                nd2 nd2VarT2 = this.r.g.t(i2);
                float f = 1.0f - fR;
                ap5Var.n(i2, tp5.v(nd2VarT, (int) (((double) ((nd2VarT.g - nd2VarT2.g) * f)) + 0.5d), (int) (((double) ((nd2VarT.y - nd2VarT2.y) * f)) + 0.5d), (int) (((double) ((nd2VarT.r - nd2VarT2.r) * f)) + 0.5d), (int) (((double) ((nd2VarT.n - nd2VarT2.n) * f)) + 0.5d)));
            }
        }
        to5.j(this.v, ap5Var.y(), Collections.singletonList(yo5Var));
    }
}
