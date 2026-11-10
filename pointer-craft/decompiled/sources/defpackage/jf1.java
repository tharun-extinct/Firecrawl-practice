package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jf1 extends kj1 {
    public final oh0 a;
    public AccessibilityManager b;
    public boolean c;
    public long i;
    public AutoCompleteTextView j;
    public final TimeInterpolator l;
    public final if1 m;
    public ValueAnimator p;
    public boolean q;
    public ValueAnimator s;
    public final nh0 t;
    public final int v;
    public boolean w;
    public final int x;

    /* JADX WARN: Type inference failed for: r0v2, types: [if1] */
    public jf1(jj1 jj1Var) {
        super(jj1Var);
        this.t = new nh0(this, (byte) 1);
        this.a = new oh0(this, (byte) 1);
        this.m = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: if1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                jf1 jf1Var = this.j;
                AutoCompleteTextView autoCompleteTextView = jf1Var.j;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                jf1Var.n.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.i = Long.MAX_VALUE;
        this.x = mq2.h(jj1Var.getContext(), R.attr.motionDurationShort3, 67);
        this.v = mq2.h(jj1Var.getContext(), R.attr.motionDurationShort3, 50);
        this.l = lr2.E(jj1Var.getContext(), R.attr.motionEasingLinearInterpolator, qi.g);
    }

    @Override // defpackage.kj1
    public final boolean a() {
        return this.q;
    }

    @Override // defpackage.kj1
    public final void c(m2 m2Var) {
        if (!ef6.g(this.j)) {
            m2Var.d(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? m2Var.g.isShowingHintText() : m2Var.j(4)) {
            m2Var.L(null);
        }
    }

    @Override // defpackage.kj1
    public final void g() {
        if (this.b.isTouchExplorationEnabled() && ef6.g(this.j) && !this.n.hasFocus()) {
            this.j.dismissDropDown();
        }
        this.j.post(new j4(this, (byte) 6));
    }

    public final void h() {
        if (this.j == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.i;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.w = false;
        }
        if (this.w) {
            this.w = false;
            return;
        }
        z(!this.c);
        boolean z = this.c;
        AutoCompleteTextView autoCompleteTextView = this.j;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.j.showDropDown();
        }
    }

    @Override // defpackage.kj1
    public final void i(AccessibilityEvent accessibilityEvent) {
        if (!this.b.isEnabled() || ef6.g(this.j)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.c && !this.j.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            h();
            this.w = true;
            this.i = SystemClock.uptimeMillis();
        }
    }

    @Override // defpackage.kj1
    public final AccessibilityManager.TouchExplorationStateChangeListener j() {
        return this.m;
    }

    @Override // defpackage.kj1
    public final int n() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.kj1
    public final void p() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.l;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.x);
        byte b = 1;
        valueAnimatorOfFloat.addUpdateListener(new c61(this, b));
        this.p = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.v);
        valueAnimatorOfFloat2.addUpdateListener(new c61(this, b));
        this.s = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new m3(this, (byte) 2));
        this.b = (AccessibilityManager) this.r.getSystemService("accessibility");
    }

    @Override // defpackage.kj1
    public final boolean q() {
        return this.c;
    }

    @Override // defpackage.kj1
    public final int r() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.kj1
    public final boolean t(int i) {
        return i != 0;
    }

    @Override // defpackage.kj1
    public final void u() {
        AutoCompleteTextView autoCompleteTextView = this.j;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.j.setOnDismissListener(null);
        }
    }

    @Override // defpackage.kj1
    public final View.OnFocusChangeListener v() {
        return this.a;
    }

    @Override // defpackage.kj1
    public final void w(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            t94.v("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.j = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new hv0(this, (byte) 2));
        this.j.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: hf1
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                jf1 jf1Var = this.g;
                jf1Var.w = true;
                jf1Var.i = SystemClock.uptimeMillis();
                jf1Var.z(false);
            }
        });
        this.j.setThreshold(0);
        TextInputLayout textInputLayout = this.g;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.b.isTouchExplorationEnabled()) {
            this.n.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.kj1
    public final View.OnClickListener x() {
        return this.t;
    }

    public final void z(boolean z) {
        if (this.c != z) {
            this.c = z;
            this.p.cancel();
            this.s.start();
        }
    }
}
