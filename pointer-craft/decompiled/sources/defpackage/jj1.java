package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.appground.blek.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class jj1 extends LinearLayout {
    public final AccessibilityManager A;
    public AccessibilityManager.TouchExplorationStateChangeListener B;
    public final gj1 C;
    public final CheckableImageButton a;
    public int b;
    public final CheckableImageButton c;
    public boolean d;
    public EditText e;
    public CharSequence f;
    public ImageView.ScaleType h;
    public final ij1 i;
    public final TextInputLayout j;
    public final en k;
    public ColorStateList m;
    public View.OnLongClickListener o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public final LinkedHashSet s;
    public final FrameLayout t;
    public PorterDuff.Mode u;
    public View.OnLongClickListener w;
    public int z;

    public jj1(TextInputLayout textInputLayout, ro roVar) {
        super(textInputLayout.getContext());
        final byte b = 0;
        this.b = 0;
        this.s = new LinkedHashSet();
        this.C = new gj1(this);
        hj1 hj1Var = new hj1(this);
        this.A = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.j = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.t = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonG = g(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.a = checkableImageButtonG;
        CheckableImageButton checkableImageButtonG2 = g(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.c = checkableImageButtonG2;
        this.i = new ij1(this, roVar);
        en enVar = new en(getContext(), null);
        this.k = enVar;
        TypedArray typedArray = (TypedArray) roVar.t;
        if (typedArray.hasValue(38)) {
            this.m = zq2.i(getContext(), roVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.q = mq2.s(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            a(roVar.h(37));
        }
        checkableImageButtonG.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonG.setImportantForAccessibility(2);
        checkableImageButtonG.setClickable(false);
        checkableImageButtonG.setPressable(false);
        checkableImageButtonG.setCheckable(false);
        checkableImageButtonG.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.p = zq2.i(getContext(), roVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.u = mq2.s(typedArray.getInt(33, -1), null);
            }
        }
        final byte b2 = 1;
        if (typedArray.hasValue(30)) {
            j(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                l(typedArray.getText(27));
            }
            checkableImageButtonG2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.p = zq2.i(getContext(), roVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.u = mq2.s(typedArray.getInt(56, -1), null);
            }
            j(typedArray.getBoolean(54, false) ? 1 : 0);
            l(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            l0.u("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.z) {
            this.z = dimensionPixelSize;
            checkableImageButtonG2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonG2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonG.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonG.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeK = ue5.K(typedArray.getInt(31, -1));
            this.h = scaleTypeK;
            checkableImageButtonG2.setScaleType(scaleTypeK);
            checkableImageButtonG.setScaleType(scaleTypeK);
        }
        enVar.setVisibility(8);
        enVar.setId(R.id.textinput_suffix_text);
        enVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        enVar.setAccessibilityLiveRegion(1);
        enVar.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            enVar.setTextColor(roVar.s(74));
        }
        CharSequence text = typedArray.getText(72);
        this.f = TextUtils.isEmpty(text) ? null : text;
        enVar.setText(text);
        i();
        frameLayout.addView(checkableImageButtonG2);
        addView(enVar);
        addView(frameLayout);
        addView(checkableImageButtonG);
        checkableImageButtonG.setOnFocusableChangedListener(new rd0(this) { // from class: fj1
            public final /* synthetic */ jj1 t;

            {
                this.t = this;
            }

            @Override // defpackage.rd0
            public final void g() {
                byte b3 = b;
                jj1 jj1Var = this.t;
                switch (b3) {
                    case 0:
                        CheckableImageButton checkableImageButton = jj1Var.a;
                        ue5.u0(checkableImageButton, jj1Var.w, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = jj1Var.c;
                        ue5.u0(checkableImageButton2, jj1Var.o, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        checkableImageButtonG2.setOnFocusableChangedListener(new rd0(this) { // from class: fj1
            public final /* synthetic */ jj1 t;

            {
                this.t = this;
            }

            @Override // defpackage.rd0
            public final void g() {
                byte b3 = b2;
                jj1 jj1Var = this.t;
                switch (b3) {
                    case 0:
                        CheckableImageButton checkableImageButton = jj1Var.a;
                        ue5.u0(checkableImageButton, jj1Var.w, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = jj1Var.c;
                        ue5.u0(checkableImageButton2, jj1Var.o, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.m0.add(hj1Var);
        if (textInputLayout.q != null) {
            hj1Var.g(textInputLayout);
        }
        addOnAttachStateChangeListener(new hc(this, b2));
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.a;
        checkableImageButton.setImageDrawable(drawable);
        w();
        ue5.h(this.j, checkableImageButton, this.m, this.q);
    }

    public final void c() {
        TextInputLayout textInputLayout = this.j;
        if (textInputLayout.q == null) {
            return;
        }
        this.k.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.q.getPaddingTop(), (n() || v()) ? 0 : textInputLayout.q.getPaddingEnd(), textInputLayout.q.getPaddingBottom());
    }

    public final CheckableImageButton g(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (zq2.o(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final void i() {
        en enVar = this.k;
        int visibility = enVar.getVisibility();
        int i = (this.f == null || this.d) ? 8 : 0;
        if (visibility != i) {
            y().b(i == 0);
        }
        q();
        enVar.setVisibility(i);
        this.j.u();
    }

    public final void j(int i) {
        if (this.b == i) {
            return;
        }
        kj1 kj1VarY = y();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.B;
        AccessibilityManager accessibilityManager = this.A;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.B = null;
        kj1VarY.u();
        this.b = i;
        Iterator it = this.s.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            uo1.B();
            return;
        }
        t(i != 0);
        kj1 kj1VarY2 = y();
        int iN = this.i.r;
        if (iN == 0) {
            iN = kj1VarY2.n();
        }
        Drawable drawableJ = iN != 0 ? k33.J(getContext(), iN) : null;
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawableJ);
        TextInputLayout textInputLayout = this.j;
        if (drawableJ != null) {
            ue5.h(textInputLayout, checkableImageButton, this.p, this.u);
            ue5.k0(textInputLayout, checkableImageButton, this.p);
        }
        checkableImageButton.setCheckable(kj1VarY2.m());
        if (!kj1VarY2.t(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        kj1VarY2.p();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerJ = kj1VarY2.j();
        this.B = touchExplorationStateChangeListenerJ;
        if (touchExplorationStateChangeListenerJ != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.B);
        }
        View.OnClickListener onClickListenerX = kj1VarY2.x();
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(onClickListenerX);
        ue5.o0(checkableImageButton, onLongClickListener);
        int iR = kj1VarY2.r();
        l(iR != 0 ? getResources().getText(iR) : null);
        EditText editText = this.e;
        if (editText != null) {
            kj1VarY2.w(editText);
            m(kj1VarY2);
        }
        ue5.h(textInputLayout, checkableImageButton, this.p, this.u);
        x(true);
    }

    public final void l(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            ue5.u0(checkableImageButton, this.o, charSequence);
        }
    }

    public final void m(kj1 kj1Var) {
        if (this.e == null) {
            return;
        }
        if (kj1Var.v() != null) {
            this.e.setOnFocusChangeListener(kj1Var.v());
        }
        if (kj1Var.l() != null) {
            this.c.setOnFocusChangeListener(kj1Var.l());
        }
    }

    public final boolean n() {
        return this.t.getVisibility() == 0 && this.c.getVisibility() == 0;
    }

    public final void q() {
        this.t.setVisibility((this.c.getVisibility() != 0 || v()) ? 8 : 0);
        setVisibility((n() || v() || ((this.f == null || this.d) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final int r() {
        int marginStart;
        if (n() || v()) {
            CheckableImageButton checkableImageButton = this.c;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.k.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final void t(boolean z) {
        EditText editText;
        if (n() != z) {
            CheckableImageButton checkableImageButton = this.c;
            if (!z && checkableImageButton.hasFocus() && (editText = this.e) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            q();
            c();
            this.j.u();
        }
    }

    public final boolean v() {
        return this.a.getVisibility() == 0;
    }

    public final void w() {
        CheckableImageButton checkableImageButton = this.a;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.j;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.p.s && textInputLayout.i()) ? 0 : 8);
        q();
        c();
        if (this.b != 0) {
            return;
        }
        textInputLayout.u();
    }

    public final void x(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        kj1 kj1VarY = y();
        boolean zM = kj1VarY.m();
        CheckableImageButton checkableImageButton = this.c;
        boolean z4 = true;
        if (!zM || (z3 = checkableImageButton.m) == kj1VarY.q()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(kj1VarY instanceof jf1) || (zIsActivated = checkableImageButton.isActivated()) == kj1VarY.a()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            ue5.k0(this.j, checkableImageButton, this.p);
        }
    }

    public final kj1 y() {
        kj1 ny0Var;
        int i = this.b;
        ij1 ij1Var = this.i;
        SparseArray sparseArray = ij1Var.g;
        kj1 kj1Var = (kj1) sparseArray.get(i);
        if (kj1Var != null) {
            return kj1Var;
        }
        jj1 jj1Var = ij1Var.y;
        if (i != -1) {
            byte b = 1;
            if (i == 0) {
                ny0Var = new ny0(jj1Var, b);
            } else if (i == 1) {
                ny0Var = new jq3(jj1Var, ij1Var.n);
            } else if (i == 2) {
                ny0Var = new rh0(jj1Var);
            } else {
                if (i != 3) {
                    l0.u(xi3.j("Invalid end icon mode: ", i));
                    return null;
                }
                ny0Var = new jf1(jj1Var);
            }
        } else {
            ny0Var = new ny0(jj1Var, (byte) 0);
        }
        sparseArray.append(i, ny0Var);
        return ny0Var;
    }
}
