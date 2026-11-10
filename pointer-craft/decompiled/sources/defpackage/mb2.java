package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mb2 {
    public ColorStateList A;
    public Typeface B;
    public int a;
    public CharSequence b;
    public byte c;
    public en d;
    public int e;
    public CharSequence f;
    public final int g;
    public int h;
    public byte i;
    public final TextInputLayout j;
    public boolean k;
    public final Context l;
    public FrameLayout m;
    public final TimeInterpolator n;
    public ColorStateList o;
    public en p;
    public AnimatorSet q;
    public final int r;
    public boolean s;
    public LinearLayout t;
    public CharSequence u;
    public final TimeInterpolator v;
    public final float w;
    public final TimeInterpolator x;
    public final int y;
    public int z;

    public mb2(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.l = context;
        this.j = textInputLayout;
        this.w = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.g = mq2.h(context, R.attr.motionDurationShort4, 217);
        this.y = mq2.h(context, R.attr.motionDurationMedium4, 167);
        this.r = mq2.h(context, R.attr.motionDurationShort4, 167);
        this.n = lr2.E(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, qi.n);
        LinearInterpolator linearInterpolator = qi.g;
        this.v = lr2.E(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.x = lr2.E(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void g(en enVar, int i) {
        if (this.t == null && this.m == null) {
            Context context = this.l;
            LinearLayout linearLayout = new LinearLayout(context);
            this.t = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.t;
            TextInputLayout textInputLayout = this.j;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.m = new FrameLayout(context);
            this.t.addView(this.m, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                y();
            }
        }
        if (i == 0 || i == 1) {
            this.m.setVisibility(0);
            this.m.addView(enVar);
        } else {
            this.t.addView(enVar, new LinearLayout.LayoutParams(-2, -2));
        }
        this.t.setVisibility(0);
        this.a++;
    }

    public final boolean j(en enVar, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.j;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.i == this.c && enVar != null && TextUtils.equals(enVar.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void l(en enVar, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.t;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.m) != null) {
            frameLayout.removeView(enVar);
        } else {
            linearLayout.removeView(enVar);
        }
        int i2 = this.a - 1;
        this.a = i2;
        LinearLayout linearLayout2 = this.t;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void n(ArrayList arrayList, boolean z, en enVar, int i, int i2, int i3) {
        if (enVar == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(enVar, (Property<en, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.r;
            objectAnimatorOfFloat.setDuration(z2 ? this.y : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.v : this.x);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(enVar, (Property<en, Float>) View.TRANSLATION_Y, -this.w, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.g);
            objectAnimatorOfFloat2.setInterpolator(this.n);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final void r() {
        AnimatorSet animatorSet = this.q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(int i, int i2, boolean z) {
        TextView textViewV;
        TextView textViewV2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.q = animatorSet;
            ArrayList arrayList = new ArrayList();
            n(arrayList, this.k, this.d, 2, i, i2);
            n(arrayList, this.s, this.p, 1, i, i2);
            x52.r(animatorSet, arrayList);
            animatorSet.addListener(new lb2(this, i2, v(i), i, v(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewV2 = v(i2)) != null) {
                textViewV2.setVisibility(0);
                textViewV2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewV = v(i)) != null) {
                textViewV.setVisibility(4);
                if (i == 1) {
                    textViewV.setText((CharSequence) null);
                }
            }
            this.c = i2;
        }
        TextInputLayout textInputLayout = this.j;
        textInputLayout.z();
        textInputLayout.f(z, false);
        textInputLayout.e();
    }

    public final TextView v(int i) {
        if (i == 1) {
            return this.p;
        }
        if (i != 2) {
            return null;
        }
        return this.d;
    }

    public final void x() {
        this.b = null;
        r();
        if (this.c == 1) {
            if (!this.k || TextUtils.isEmpty(this.f)) {
                this.i = (byte) 0;
            } else {
                this.i = (byte) 2;
            }
        }
        t(this.c, this.i, j(this.p, ""));
    }

    public final void y() {
        if (this.t != null) {
            TextInputLayout textInputLayout = this.j;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.l;
                boolean zO = zq2.o(context);
                LinearLayout linearLayout = this.t;
                int paddingStart = editText.getPaddingStart();
                if (zO) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zO) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zO) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }
}
