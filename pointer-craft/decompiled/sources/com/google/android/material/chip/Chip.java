package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.a33;
import defpackage.br2;
import defpackage.el;
import defpackage.fn4;
import defpackage.g83;
import defpackage.gp4;
import defpackage.je0;
import defpackage.k33;
import defpackage.ke0;
import defpackage.le0;
import defpackage.m00;
import defpackage.mq2;
import defpackage.n94;
import defpackage.ne0;
import defpackage.oe0;
import defpackage.p24;
import defpackage.q45;
import defpackage.r35;
import defpackage.s45;
import defpackage.sn4;
import defpackage.sv1;
import defpackage.ue5;
import defpackage.uo1;
import defpackage.xk5;
import defpackage.zq2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends el implements ne0, sn4, Checkable {
    public static final Rect D = new Rect();
    public static final int[] E = {R.attr.state_selected};
    public static final int[] F = {R.attr.state_checkable};
    public final Rect A;
    public final RectF B;
    public final je0 C;
    public CompoundButton.OnCheckedChangeListener b;
    public RippleDrawable c;
    public final le0 d;
    public boolean e;
    public int f;
    public boolean h;
    public View.OnClickListener i;
    public CharSequence k;
    public int o;
    public boolean p;
    public oe0 q;
    public boolean s;
    public boolean u;
    public InsetDrawable w;
    public boolean z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(gp4.X(context, attributeSet, io.appground.blek.R.attr.chipStyle, io.appground.blek.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, io.appground.blek.R.attr.chipStyle);
        this.A = new Rect();
        this.B = new RectF();
        this.C = new je0(this, (byte) 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                uo1.u("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                uo1.u("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                uo1.u("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                uo1.u("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                uo1.u("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        oe0 oe0Var = new oe0(context2, attributeSet);
        Context context3 = oe0Var.u0;
        int[] iArr = p24.n;
        TypedArray typedArrayY = ue5.Y(context3, attributeSet, iArr, io.appground.blek.R.attr.chipStyle, io.appground.blek.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        oe0Var.U0 = typedArrayY.hasValue(39);
        Context context4 = oe0Var.u0;
        ColorStateList colorStateListB = zq2.b(context4, typedArrayY, 25);
        if (oe0Var.N != colorStateListB) {
            oe0Var.N = colorStateListB;
            oe0Var.onStateChange(oe0Var.getState());
        }
        ColorStateList colorStateListB2 = zq2.b(context4, typedArrayY, 12);
        if (oe0Var.O != colorStateListB2) {
            oe0Var.O = colorStateListB2;
            oe0Var.onStateChange(oe0Var.getState());
        }
        float dimension = typedArrayY.getDimension(20, 0.0f);
        if (oe0Var.P != dimension) {
            oe0Var.P = dimension;
            oe0Var.invalidateSelf();
            oe0Var.G();
        }
        if (typedArrayY.hasValue(13)) {
            oe0Var.M(typedArrayY.getDimension(13, 0.0f));
        }
        oe0Var.R(zq2.b(context4, typedArrayY, 23));
        oe0Var.S(typedArrayY.getDimension(24, 0.0f));
        oe0Var.c0(zq2.b(context4, typedArrayY, 38));
        String text = typedArrayY.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(oe0Var.U, text)) {
            oe0Var.U = text;
            oe0Var.A0.n = true;
            oe0Var.invalidateSelf();
            oe0Var.G();
        }
        r35 r35Var = (!typedArrayY.hasValue(0) || (resourceId3 = typedArrayY.getResourceId(0, 0)) == 0) ? null : new r35(context4, resourceId3);
        r35Var.q = typedArrayY.getDimension(1, r35Var.q);
        if (Build.VERSION.SDK_INT >= 26) {
            int i = typedArrayY.hasValue(34) ? 34 : 7;
            if (typedArrayY.hasValue(i)) {
                r35Var.r = typedArrayY.getString(i);
            }
        }
        oe0Var.d0(r35Var);
        int i2 = typedArrayY.getInt(3, 0);
        if (i2 == 1) {
            oe0Var.R0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            oe0Var.R0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            oe0Var.R0 = TextUtils.TruncateAt.END;
        }
        oe0Var.Q(typedArrayY.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            oe0Var.Q(typedArrayY.getBoolean(16, false));
        }
        oe0Var.N(zq2.p(context4, typedArrayY, 15));
        if (typedArrayY.hasValue(18)) {
            oe0Var.P(zq2.b(context4, typedArrayY, 18));
        }
        oe0Var.O(typedArrayY.getDimension(17, -1.0f));
        oe0Var.Z(typedArrayY.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            oe0Var.Z(typedArrayY.getBoolean(27, false));
        }
        oe0Var.T(zq2.p(context4, typedArrayY, 26));
        oe0Var.Y(zq2.b(context4, typedArrayY, 31));
        oe0Var.V(typedArrayY.getDimension(29, 0.0f));
        oe0Var.I(typedArrayY.getBoolean(6, false));
        oe0Var.L(typedArrayY.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            oe0Var.L(typedArrayY.getBoolean(9, false));
        }
        oe0Var.J(zq2.p(context4, typedArrayY, 8));
        if (typedArrayY.hasValue(10)) {
            oe0Var.K(zq2.b(context4, typedArrayY, 10));
        }
        oe0Var.k0 = (!typedArrayY.hasValue(41) || (resourceId2 = typedArrayY.getResourceId(41, 0)) == 0) ? null : g83.g(context4, resourceId2);
        oe0Var.l0 = (!typedArrayY.hasValue(35) || (resourceId = typedArrayY.getResourceId(35, 0)) == 0) ? null : g83.g(context4, resourceId);
        float dimension2 = typedArrayY.getDimension(22, 0.0f);
        if (oe0Var.m0 != dimension2) {
            oe0Var.m0 = dimension2;
            oe0Var.invalidateSelf();
            oe0Var.G();
        }
        oe0Var.b0(typedArrayY.getDimension(37, 0.0f));
        oe0Var.a0(typedArrayY.getDimension(36, 0.0f));
        float dimension3 = typedArrayY.getDimension(43, 0.0f);
        if (oe0Var.p0 != dimension3) {
            oe0Var.p0 = dimension3;
            oe0Var.invalidateSelf();
            oe0Var.G();
        }
        float dimension4 = typedArrayY.getDimension(42, 0.0f);
        if (oe0Var.q0 != dimension4) {
            oe0Var.q0 = dimension4;
            oe0Var.invalidateSelf();
            oe0Var.G();
        }
        oe0Var.W(typedArrayY.getDimension(30, 0.0f));
        oe0Var.U(typedArrayY.getDimension(28, 0.0f));
        float dimension5 = typedArrayY.getDimension(14, 0.0f);
        if (oe0Var.t0 != dimension5) {
            oe0Var.t0 = dimension5;
            oe0Var.invalidateSelf();
            oe0Var.G();
        }
        oe0Var.T0 = typedArrayY.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayY.recycle();
        ue5.C(context2, attributeSet, io.appground.blek.R.attr.chipStyle, io.appground.blek.R.style.Widget_MaterialComponents_Chip_Action);
        ue5.E(context2, attributeSet, iArr, io.appground.blek.R.attr.chipStyle, io.appground.blek.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, io.appground.blek.R.attr.chipStyle, io.appground.blek.R.style.Widget_MaterialComponents_Chip_Action);
        this.h = typedArrayObtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue typedValueU = mq2.u(theme, io.appground.blek.R.attr.minTouchTargetSize);
        float dimension6 = (typedValueU == null || typedValueU.type != 5) ? Float.NaN : typedValueU.getDimension(theme.getResources().getDisplayMetrics());
        this.f = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(21, (int) (Float.isNaN(dimension6) ? context2.getResources().getDimension(io.appground.blek.R.dimen.mtrl_min_touch_target_size) : dimension6)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(oe0Var);
        oe0Var.s(getElevation());
        ue5.C(context2, attributeSet, io.appground.blek.R.attr.chipStyle, io.appground.blek.R.style.Widget_MaterialComponents_Chip_Action);
        ue5.E(context2, attributeSet, iArr, io.appground.blek.R.attr.chipStyle, io.appground.blek.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, io.appground.blek.R.attr.chipStyle, io.appground.blek.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(39);
        typedArrayObtainStyledAttributes2.recycle();
        this.d = new le0(this, this);
        n();
        if (!zHasValue) {
            setOutlineProvider(new ke0(this));
        }
        setChecked(this.s);
        setText(oe0Var.U);
        setEllipsize(oe0Var.R0);
        l();
        if (!this.q.S0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        x();
        if (this.h) {
            setMinHeight(this.f);
        }
        this.o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ie0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Rect rect = Chip.D;
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.g.b;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.B;
        rectF.setEmpty();
        if (r() && this.i != null) {
            oe0 oe0Var = this.q;
            Rect bounds = oe0Var.getBounds();
            rectF.setEmpty();
            if (oe0Var.g0()) {
                float f = oe0Var.t0 + oe0Var.s0 + oe0Var.e0 + oe0Var.r0 + oe0Var.q0;
                if (oe0Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.A;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private r35 getTextAppearance() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.A0.x;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.u != z) {
            this.u = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.e) {
            return super.dispatchHoverEvent(motionEvent);
        }
        le0 le0Var = this.d;
        AccessibilityManager accessibilityManager = le0Var.i;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = le0Var.h;
                if (chip.r() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = le0Var.z;
                if (i3 != i2) {
                    le0Var.z = i2;
                    le0Var.p(i2, 128);
                    le0Var.p(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = le0Var.z) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    le0Var.z = Integer.MIN_VALUE;
                    le0Var.p(Integer.MIN_VALUE, 128);
                    le0Var.p(i, 256);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.e) {
            return super.dispatchKeyEvent(keyEvent);
        }
        le0 le0Var = this.d;
        le0Var.getClass();
        boolean zW = false;
        int i2 = 0;
        zW = false;
        zW = false;
        zW = false;
        zW = false;
        zW = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && le0Var.w(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zW = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = le0Var.u;
                                if (i != Integer.MIN_VALUE) {
                                    chip = le0Var.h;
                                    if (i == 0) {
                                        chip.performClick();
                                    } else if (i == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.i;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.e) {
                                            chip.d.p(1, 1);
                                        }
                                    }
                                }
                                zW = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = le0Var.u;
                    if (i != Integer.MIN_VALUE) {
                        chip = le0Var.h;
                        if (i == 0) {
                            chip.performClick();
                        } else if (i == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.i;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.e) {
                                chip.d.p(1, 1);
                            }
                        }
                    }
                    zW = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zW = le0Var.w(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zW = le0Var.w(1, null);
            }
        }
        if (!zW || le0Var.u == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.el, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        oe0 oe0Var = this.q;
        boolean zX = false;
        int i2 = 0;
        zX = false;
        if (oe0Var != null && oe0.F(oe0Var.b0)) {
            oe0 oe0Var2 = this.q;
            ?? IsEnabled = isEnabled();
            if (this.z) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.u) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.p) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.z) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.u) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.p) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            zX = oe0Var2.X(iArr);
        }
        if (zX) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.k)) {
            return this.k;
        }
        oe0 oe0Var = this.q;
        if (oe0Var == null || !oe0Var.g0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.w;
        return insetDrawable == null ? this.q : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.i0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.j0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.O;
        }
        return null;
    }

    public float getChipCornerRadius() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return Math.max(0.0f, oe0Var.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.q;
    }

    public float getChipEndPadding() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.t0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        oe0 oe0Var = this.q;
        if (oe0Var == null || (drawable = oe0Var.W) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.X;
        }
        return null;
    }

    public float getChipMinHeight() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.P;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.m0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.R;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.S;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        oe0 oe0Var = this.q;
        if (oe0Var == null || (drawable = oe0Var.b0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.f0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.s0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.e0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.r0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.d0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.R0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.e) {
            le0 le0Var = this.d;
            if (le0Var.u == 1 || le0Var.p == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        oe0 oe0Var = this.q;
        if (oe0Var == null) {
            return super.getFontVariationSettings();
        }
        r35 r35Var = oe0Var.A0.x;
        if (r35Var == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return r35Var.r;
    }

    public g83 getHideMotionSpec() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.l0;
        }
        return null;
    }

    public float getIconEndPadding() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.o0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.n0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.T;
        }
        return null;
    }

    public fn4 getShapeAppearanceModel() {
        return this.q.t();
    }

    public g83 getShowMotionSpec() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.k0;
        }
        return null;
    }

    public float getTextEndPadding() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.q0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            return oe0Var.p0;
        }
        return 0.0f;
    }

    public final void l() {
        TextPaint paint = getPaint();
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            paint.drawableState = oe0Var.getState();
        }
        r35 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.C);
        }
    }

    public final void n() {
        oe0 oe0Var;
        if (!r() || (oe0Var = this.q) == null || !oe0Var.a0 || this.i == null) {
            xk5.q(this, null);
            this.e = false;
        } else {
            xk5.q(this, this.d);
            this.e = true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        br2.B(this, this.q);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        oe0 oe0Var = this.q;
        if (oe0Var != null && oe0Var.g0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.e) {
            le0 le0Var = this.d;
            int i2 = le0Var.u;
            if (i2 != Integer.MIN_VALUE) {
                le0Var.a(i2);
            }
            if (z) {
                le0Var.w(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        oe0 oe0Var = this.q;
        accessibilityNodeInfo.setCheckable(oe0Var != null && oe0Var.g0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.o != i) {
            this.o = i;
            x();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.p) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.p) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.i;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.e) {
                        this.d.p(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public final boolean r() {
        oe0 oe0Var = this.q;
        if (oe0Var == null) {
            return false;
        }
        Drawable drawable = oe0Var.b0;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.k = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.c) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.el, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.c) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.el, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.I(z);
        }
    }

    public void setCheckableResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.I(oe0Var.u0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        oe0 oe0Var = this.q;
        if (oe0Var == null) {
            this.s = z;
        } else if (oe0Var.g0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.J(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.J(k33.J(oe0Var.u0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.K(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.K(ue5.R(oe0Var.u0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.L(oe0Var.u0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        oe0 oe0Var = this.q;
        if (oe0Var == null || oe0Var.O == colorStateList) {
            return;
        }
        oe0Var.O = colorStateList;
        oe0Var.onStateChange(oe0Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListR;
        oe0 oe0Var = this.q;
        if (oe0Var == null || oe0Var.O == (colorStateListR = ue5.R(oe0Var.u0, i))) {
            return;
        }
        oe0Var.O = colorStateListR;
        oe0Var.onStateChange(oe0Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.M(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.M(oe0Var.u0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(oe0 oe0Var) {
        oe0 oe0Var2 = this.q;
        if (oe0Var2 != oe0Var) {
            if (oe0Var2 != null) {
                oe0Var2.Q0 = new WeakReference(null);
            }
            this.q = oe0Var;
            oe0Var.S0 = false;
            oe0Var.Q0 = new WeakReference(this);
            y(this.f);
        }
    }

    public void setChipEndPadding(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var == null || oe0Var.t0 == f) {
            return;
        }
        oe0Var.t0 = f;
        oe0Var.invalidateSelf();
        oe0Var.G();
    }

    public void setChipEndPaddingResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            float dimension = oe0Var.u0.getResources().getDimension(i);
            if (oe0Var.t0 != dimension) {
                oe0Var.t0 = dimension;
                oe0Var.invalidateSelf();
                oe0Var.G();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.N(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.N(k33.J(oe0Var.u0, i));
        }
    }

    public void setChipIconSize(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.O(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.O(oe0Var.u0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.P(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.P(ue5.R(oe0Var.u0, i));
        }
    }

    public void setChipIconVisible(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.Q(oe0Var.u0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var == null || oe0Var.P == f) {
            return;
        }
        oe0Var.P = f;
        oe0Var.invalidateSelf();
        oe0Var.G();
    }

    public void setChipMinHeightResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            float dimension = oe0Var.u0.getResources().getDimension(i);
            if (oe0Var.P != dimension) {
                oe0Var.P = dimension;
                oe0Var.invalidateSelf();
                oe0Var.G();
            }
        }
    }

    public void setChipStartPadding(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var == null || oe0Var.m0 == f) {
            return;
        }
        oe0Var.m0 = f;
        oe0Var.invalidateSelf();
        oe0Var.G();
    }

    public void setChipStartPaddingResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            float dimension = oe0Var.u0.getResources().getDimension(i);
            if (oe0Var.m0 != dimension) {
                oe0Var.m0 = dimension;
                oe0Var.invalidateSelf();
                oe0Var.G();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.R(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.R(ue5.R(oe0Var.u0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.S(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.S(oe0Var.u0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.T(drawable);
        }
        n();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        oe0 oe0Var = this.q;
        if (oe0Var == null || oe0Var.f0 == charSequence) {
            return;
        }
        m00 m00VarR = m00.r();
        m00VarR.getClass();
        sv1 sv1Var = q45.g;
        oe0Var.f0 = m00VarR.n(charSequence);
        oe0Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.U(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.U(oe0Var.u0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.T(k33.J(oe0Var.u0, i));
        }
        n();
    }

    public void setCloseIconSize(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.V(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.V(oe0Var.u0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.W(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.W(oe0Var.u0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.Y(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.Y(ue5.R(oe0Var.u0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.el, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            uo1.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            uo1.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.el, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            uo1.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            uo1.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            uo1.u("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            uo1.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            uo1.u("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            uo1.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.s(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.q == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            uo1.u("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.R0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.h = z;
        y(this.f);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        oe0 oe0Var = this.q;
        if (oe0Var == null) {
            return false;
        }
        r35 r35Var = oe0Var.A0.x;
        if (r35Var != null && Build.VERSION.SDK_INT >= 26) {
            r35Var.r = str;
        }
        l();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(g83 g83Var) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.l0 = g83Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.l0 = g83.g(oe0Var.u0, i);
        }
    }

    public void setIconEndPadding(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.a0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.a0(oe0Var.u0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.b0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.b0(oe0Var.u0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.q == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            uo1.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            uo1.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.T0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            uo1.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.b = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
        n();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.c0(colorStateList);
        }
        this.q.getClass();
        v();
    }

    public void setRippleColorResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.c0(ue5.R(oe0Var.u0, i));
            this.q.getClass();
            v();
        }
    }

    @Override // defpackage.sn4
    public void setShapeAppearanceModel(fn4 fn4Var) {
        this.q.setShapeAppearanceModel(fn4Var);
    }

    public void setShowMotionSpec(g83 g83Var) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.k0 = g83Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.k0 = g83.g(oe0Var.u0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            uo1.u("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        oe0 oe0Var = this.q;
        if (oe0Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(oe0Var.S0 ? null : charSequence, bufferType);
        oe0 oe0Var2 = this.q;
        if (oe0Var2 == null || TextUtils.equals(oe0Var2.U, charSequence)) {
            return;
        }
        oe0Var2.U = charSequence;
        oe0Var2.A0.n = true;
        oe0Var2.invalidateSelf();
        oe0Var2.G();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.d0(new r35(oe0Var.u0, i));
        }
        l();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var == null || oe0Var.q0 == f) {
            return;
        }
        oe0Var.q0 = f;
        oe0Var.invalidateSelf();
        oe0Var.G();
    }

    public void setTextEndPaddingResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            float dimension = oe0Var.u0.getResources().getDimension(i);
            if (oe0Var.q0 != dimension) {
                oe0Var.q0 = dimension;
                oe0Var.invalidateSelf();
                oe0Var.G();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            s45 s45Var = oe0Var.A0;
            r35 r35Var = s45Var.x;
            if (r35Var != null) {
                r35Var.q = fApplyDimension;
                s45Var.g.setTextSize(fApplyDimension);
                oe0Var.G();
                oe0Var.invalidateSelf();
            }
        }
        l();
    }

    public void setTextStartPadding(float f) {
        oe0 oe0Var = this.q;
        if (oe0Var == null || oe0Var.p0 == f) {
            return;
        }
        oe0Var.p0 = f;
        oe0Var.invalidateSelf();
        oe0Var.G();
    }

    public void setTextStartPaddingResource(int i) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            float dimension = oe0Var.u0.getResources().getDimension(i);
            if (oe0Var.p0 != dimension) {
                oe0Var.p0 = dimension;
                oe0Var.invalidateSelf();
                oe0Var.G();
            }
        }
    }

    public final void v() {
        RippleDrawable rippleDrawable = new RippleDrawable(n94.g(this.q.T), getBackgroundDrawable(), null);
        FocusRingDrawable.v(getContext(), rippleDrawable, this.q);
        this.c = rippleDrawable;
        this.q.getClass();
        setBackground(this.c);
        x();
    }

    public final void x() {
        oe0 oe0Var;
        if (TextUtils.isEmpty(getText()) || (oe0Var = this.q) == null) {
            return;
        }
        int iC = (int) (oe0Var.C() + oe0Var.t0 + oe0Var.q0);
        oe0 oe0Var2 = this.q;
        int iB = (int) (oe0Var2.B() + oe0Var2.m0 + oe0Var2.p0);
        if (this.w != null) {
            Rect rect = new Rect();
            this.w.getPadding(rect);
            iB += rect.left;
            iC += rect.right;
        }
        setPaddingRelative(iB, getPaddingTop(), iC, getPaddingBottom());
    }

    public final void y(int i) {
        this.f = i;
        if (!this.h) {
            InsetDrawable insetDrawable = this.w;
            if (insetDrawable == null) {
                v();
                return;
            } else {
                if (insetDrawable != null) {
                    this.w = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    v();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.q.P));
        int iMax2 = Math.max(0, i - this.q.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.w;
            if (insetDrawable2 == null) {
                v();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.w = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    v();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.w != null) {
            Rect rect = new Rect();
            this.w.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                v();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.w = new InsetDrawable((Drawable) this.q, i2, i3, i2, i3);
        v();
    }

    public void setCloseIconVisible(boolean z) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.Z(z);
        }
        n();
    }

    public void setCheckedIconVisible(boolean z) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.L(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.Q(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            uo1.u("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            uo1.u("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            uo1.u("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            uo1.u("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(r35 r35Var) {
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.d0(r35Var);
        }
        l();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        oe0 oe0Var = this.q;
        if (oe0Var != null) {
            oe0Var.d0(new r35(oe0Var.u0, i));
        }
        l();
    }

    public void setInternalOnCheckedChangeListener(a33 a33Var) {
    }
}
