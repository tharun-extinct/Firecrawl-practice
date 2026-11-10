package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class d61 extends ra {
    public final /* synthetic */ byte J;

    public /* synthetic */ d61(byte b) {
        this.J = b;
    }

    @Override // defpackage.ra
    public final float C(Object obj) {
        switch (this.J) {
            case 0:
                return ((e61) obj).f.y * 10000.0f;
            default:
                return ((MaterialButton) obj).getDisplayedWidthIncrease();
        }
    }

    @Override // defpackage.ra
    public final void T(Object obj, float f) {
        switch (this.J) {
            case 0:
                e61 e61Var = (e61) obj;
                e61Var.f.y = f / 10000.0f;
                e61Var.invalidateSelf();
                int i = (int) f;
                qf0 qf0Var = e61Var.t;
                if (qf0Var.g(true)) {
                    Context context = e61Var.j;
                    if (e61Var.A == null) {
                        LinearInterpolator linearInterpolator = qi.g;
                        e61Var.C = lr2.E(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        e61Var.D = lr2.E(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        e61Var.A = valueAnimator;
                        valueAnimator.setDuration(500L);
                        e61Var.A.setFloatValues(0.0f, 1.0f);
                        e61Var.A.setInterpolator(null);
                        e61Var.A.addUpdateListener(new c61((Object) e61Var, (byte) 0));
                    }
                    float f2 = i;
                    float f3 = (f2 < qf0Var.i * 10000.0f || f2 > qf0Var.b * 10000.0f) ? 0.0f : 1.0f;
                    float f4 = e61Var.k;
                    ValueAnimator valueAnimator2 = e61Var.A;
                    if (f3 != f4) {
                        if (valueAnimator2.isRunning()) {
                            e61Var.A.cancel();
                        }
                        e61Var.k = f3;
                        if (f3 != 1.0f) {
                            e61Var.B = e61Var.D;
                            e61Var.A.reverse();
                        } else {
                            e61Var.B = e61Var.C;
                            e61Var.A.start();
                        }
                    } else if (!valueAnimator2.isRunning()) {
                        e61Var.f.n = f3;
                        e61Var.invalidateSelf();
                    }
                    break;
                }
                break;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f);
                break;
        }
    }
}
