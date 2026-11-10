package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rh0 extends kj1 {
    public final nh0 a;
    public final TimeInterpolator j;
    public final TimeInterpolator l;
    public final oh0 m;
    public AnimatorSet q;
    public EditText t;
    public final int v;
    public ValueAnimator w;
    public final int x;

    public rh0(jj1 jj1Var) {
        super(jj1Var);
        this.a = new nh0(this, (byte) 0);
        this.m = new oh0(this, (byte) 0);
        this.v = mq2.h(jj1Var.getContext(), R.attr.motionDurationShort3, 100);
        this.x = mq2.h(jj1Var.getContext(), R.attr.motionDurationShort3, 150);
        this.l = lr2.E(jj1Var.getContext(), R.attr.motionEasingLinearInterpolator, qi.g);
        this.j = lr2.E(jj1Var.getContext(), R.attr.motionEasingEmphasizedInterpolator, qi.n);
    }

    @Override // defpackage.kj1
    public final void b(boolean z) {
        if (this.y.f == null) {
            return;
        }
        z(z);
    }

    @Override // defpackage.kj1
    public final void g() {
        if (this.y.f != null) {
            return;
        }
        z(h());
    }

    public final boolean h() {
        EditText editText = this.t;
        if (editText != null) {
            boolean z = editText.hasFocus() || this.n.hasFocus();
            boolean z2 = this.t.getText().length() > 0;
            boolean z3 = this.y.f != null;
            if (z && (z2 || z3)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kj1
    public final View.OnFocusChangeListener l() {
        return this.m;
    }

    @Override // defpackage.kj1
    public final int n() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.kj1
    public final void p() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.j);
        valueAnimatorOfFloat.setDuration(this.x);
        final byte b = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ph0
            public final /* synthetic */ rh0 y;

            {
                this.y = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = b;
                rh0 rh0Var = this.y;
                switch (b2) {
                    case 0:
                        rh0Var.n.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = rh0Var.n;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.l;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i = this.v;
        valueAnimatorOfFloat2.setDuration(i);
        final byte b2 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ph0
            public final /* synthetic */ rh0 y;

            {
                this.y = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b3 = b2;
                rh0 rh0Var = this.y;
                switch (b3) {
                    case 0:
                        rh0Var.n.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = rh0Var.n;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.q = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.q.addListener(new qh0(this, b2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ph0
            public final /* synthetic */ rh0 y;

            {
                this.y = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b3 = b2;
                rh0 rh0Var = this.y;
                switch (b3) {
                    case 0:
                        rh0Var.n.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = rh0Var.n;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.w = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new qh0(this, b));
    }

    @Override // defpackage.kj1
    public final int r() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.kj1
    public final void u() {
        EditText editText = this.t;
        if (editText != null) {
            editText.post(new j4(this, (byte) 3));
        }
    }

    @Override // defpackage.kj1
    public final View.OnFocusChangeListener v() {
        return this.m;
    }

    @Override // defpackage.kj1
    public final void w(EditText editText) {
        this.t = editText;
        this.g.setEndIconVisible(h());
    }

    @Override // defpackage.kj1
    public final View.OnClickListener x() {
        return this.a;
    }

    public final void z(boolean z) {
        boolean z2 = this.y.n() == z;
        if (z && !this.q.isRunning()) {
            this.w.cancel();
            this.q.start();
            if (z2) {
                this.q.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.q.cancel();
        this.w.start();
        if (z2) {
            this.w.end();
        }
    }
}
