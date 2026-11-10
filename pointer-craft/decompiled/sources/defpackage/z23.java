package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class z23 extends el {
    public static final int[] F = {R.attr.state_indeterminate};
    public static final int[] G = {R.attr.state_error};
    public static final int[][] H = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int I = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public boolean A;
    public CharSequence B;
    public CompoundButton.OnCheckedChangeListener C;
    public final wh D;
    public final ky E;
    public boolean b;
    public ColorStateList c;
    public int d;
    public int[] e;
    public ColorStateList f;
    public boolean h;
    public boolean i;
    public PorterDuff.Mode k;
    public ColorStateList o;
    public CharSequence p;
    public final LinkedHashSet q;
    public boolean s;
    public Drawable u;
    public final LinkedHashSet w;
    public Drawable z;

    public z23(Context context, AttributeSet attributeSet) {
        super(gp4.X(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.q = new LinkedHashSet();
        this.w = new LinkedHashSet();
        Context context2 = getContext();
        wh whVar = new wh(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = x74.g;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        whVar.j = drawable;
        drawable.setCallback(whVar.w);
        new vh(whVar.j.getConstantState());
        this.D = whVar;
        this.E = new ky(this, (byte) 2);
        Context context3 = getContext();
        this.u = getButtonDrawable();
        this.o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        ue5.C(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = p24.h;
        ue5.E(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        ro roVar = new ro(context3, typedArrayObtainStyledAttributes);
        this.z = roVar.h(2);
        if (this.u != null && mq2.z(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == I && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.u = k33.J(context3, R.drawable.mtrl_checkbox_button);
                this.h = true;
                if (this.z == null) {
                    this.z = k33.J(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f = zq2.i(context3, roVar, 3);
        this.k = mq2.s(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.i = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.s = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.p = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setRippleColor(zq2.i(context3, roVar, 10));
        }
        roVar.S();
        g();
    }

    private String getButtonStateDescription() {
        int i = this.d;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.c;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iB = xq2.B(getContext(), mq2.f(this, R.attr.colorControlActivated));
        int iB2 = xq2.B(getContext(), mq2.f(this, R.attr.colorError));
        int iB3 = xq2.B(getContext(), mq2.f(this, R.attr.colorSurface));
        int iB4 = xq2.B(getContext(), mq2.f(this, R.attr.colorOnSurface));
        ColorStateList colorStateList2 = new ColorStateList(H, new int[]{xq2.h(1.0f, iB3, iB2), xq2.h(1.0f, iB3, iB), xq2.h(0.54f, iB3, iB4), xq2.h(0.38f, iB3, iB4), xq2.h(0.38f, iB3, iB4)});
        this.c = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.o;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public final void g() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        m3 m3Var;
        Drawable drawableMutate = this.u;
        ColorStateList colorStateList3 = this.o;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.u = drawableMutate;
        Drawable drawableMutate2 = this.z;
        ColorStateList colorStateList4 = this.f;
        PorterDuff.Mode mode = this.k;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.z = drawableMutate2;
        if (this.h) {
            wh whVar = this.D;
            if (whVar != null) {
                uh uhVar = whVar.t;
                Drawable drawable = whVar.j;
                ky kyVar = this.E;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    pg pgVar = kyVar.g;
                    if (pgVar == null) {
                        pgVar = new pg(kyVar);
                        kyVar.g = pgVar;
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(pgVar);
                }
                ArrayList arrayList = whVar.q;
                if (arrayList != null && kyVar != null) {
                    arrayList.remove(kyVar);
                    if (whVar.q.size() == 0 && (m3Var = whVar.m) != null) {
                        uhVar.y.removeListener(m3Var);
                        whVar.m = null;
                    }
                }
                Drawable drawable2 = whVar.j;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    pg pgVar2 = kyVar.g;
                    if (pgVar2 == null) {
                        pgVar2 = new pg(kyVar);
                        kyVar.g = pgVar2;
                    }
                    animatedVectorDrawable2.registerAnimationCallback(pgVar2);
                } else if (kyVar != null) {
                    ArrayList arrayList2 = whVar.q;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        whVar.q = arrayList2;
                    }
                    if (!arrayList2.contains(kyVar)) {
                        whVar.q.add(kyVar);
                        m3 m3Var2 = whVar.m;
                        if (m3Var2 == null) {
                            m3Var2 = new m3(whVar, (byte) 1);
                            whVar.m = m3Var2;
                        }
                        uhVar.y.addListener(m3Var2);
                    }
                }
            }
            Drawable drawable3 = this.u;
            if ((drawable3 instanceof AnimatedStateListDrawable) && whVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, whVar, false);
                ((AnimatedStateListDrawable) this.u).addTransition(R.id.indeterminate, R.id.unchecked, whVar, false);
            }
        }
        Drawable drawable4 = this.u;
        if (drawable4 != null && (colorStateList2 = this.o) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.z;
        if (drawable5 != null && (colorStateList = this.f) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.u;
        Drawable drawable7 = this.z;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.u;
    }

    public Drawable getButtonIconDrawable() {
        return this.z;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.k;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.o;
    }

    public int getCheckedState() {
        return this.d;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.d == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i && this.o == null && this.f == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        if (this.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
            }
            this.e = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.e = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.b || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.s) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.p));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y23)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y23 y23Var = (y23) parcelable;
        super.onRestoreInstanceState(y23Var.getSuperState());
        setCheckedState(y23Var.j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        y23 y23Var = new y23(super.onSaveInstanceState());
        y23Var.j = getCheckedState();
        return y23Var;
    }

    @Override // defpackage.el, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(k33.J(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.z = drawable;
        g();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(k33.J(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f == colorStateList) {
            return;
        }
        this.f = colorStateList;
        g();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.k == mode) {
            return;
        }
        this.k = mode;
        g();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        g();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        g();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.b = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.d != i) {
            this.d = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.B == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.A) {
                return;
            }
            this.A = true;
            LinkedHashSet linkedHashSet = this.w;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    uo1.B();
                    return;
                }
            }
            if (this.d != 2 && (onCheckedChangeListener = this.C) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.A = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        refreshDrawableState();
        Iterator it = this.q.iterator();
        if (it.hasNext()) {
            fj.w(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.C = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.B = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.i = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.el, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.u = drawable;
        this.h = false;
        g();
    }
}
