package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class mv4 extends LinearLayout {
    public CharSequence a;
    public View.OnLongClickListener b;
    public int c;
    public ImageView.ScaleType i;
    public final TextInputLayout j;
    public final CheckableImageButton m;
    public ColorStateList q;
    public boolean s;
    public final en t;
    public PorterDuff.Mode w;

    public mv4(TextInputLayout textInputLayout, ro roVar) {
        super(textInputLayout.getContext());
        this.j = textInputLayout;
        byte b = 8;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.m = checkableImageButton;
        en enVar = new en(getContext(), null);
        this.t = enVar;
        if (zq2.o(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.b;
        checkableImageButton.setOnClickListener(null);
        ue5.o0(checkableImageButton, onLongClickListener);
        this.b = null;
        checkableImageButton.setOnLongClickListener(null);
        ue5.o0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) roVar.t;
        if (typedArray.hasValue(70)) {
            this.q = zq2.i(getContext(), roVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.w = mq2.s(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            r(roVar.h(67));
            if (typedArray.hasValue(66)) {
                y(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            l0.u("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.c) {
            this.c = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeK = ue5.K(typedArray.getInt(69, -1));
            this.i = scaleTypeK;
            checkableImageButton.setScaleType(scaleTypeK);
        }
        enVar.setVisibility(8);
        enVar.setId(R.id.textinput_prefix_text);
        enVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        enVar.setAccessibilityLiveRegion(1);
        enVar.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            enVar.setTextColor(roVar.s(62));
        }
        CharSequence text = typedArray.getText(60);
        this.a = TextUtils.isEmpty(text) ? null : text;
        enVar.setText(text);
        x();
        addView(checkableImageButton);
        addView(enVar);
        checkableImageButton.setOnFocusableChangedListener(new d5(this, b));
    }

    public final int g() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.m;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.t.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void n(boolean z) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.m;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z && checkableImageButton.hasFocus() && (editText = this.j.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            v();
            x();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        v();
    }

    public final void r(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.m;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.q;
            PorterDuff.Mode mode = this.w;
            TextInputLayout textInputLayout = this.j;
            ue5.h(textInputLayout, checkableImageButton, colorStateList, mode);
            n(true);
            ue5.k0(textInputLayout, checkableImageButton, this.q);
            return;
        }
        n(false);
        View.OnLongClickListener onLongClickListener = this.b;
        checkableImageButton.setOnClickListener(null);
        ue5.o0(checkableImageButton, onLongClickListener);
        this.b = null;
        checkableImageButton.setOnLongClickListener(null);
        ue5.o0(checkableImageButton, null);
        y(null);
    }

    public final void v() {
        EditText editText = this.j.q;
        if (editText == null) {
            return;
        }
        this.t.setPaddingRelative(this.m.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void x() {
        int i = (this.a == null || this.s) ? 8 : 0;
        setVisibility((this.m.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.t.setVisibility(i);
        this.j.u();
    }

    public final void y(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.m;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            ue5.u0(checkableImageButton, this.b, charSequence);
        }
    }
}
