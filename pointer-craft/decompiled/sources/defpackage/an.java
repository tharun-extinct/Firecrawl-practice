package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class an {
    public boolean c;
    public final TextView g;
    public ic3 j;
    public ic3 l;
    public ic3 n;
    public Typeface q;
    public ic3 r;
    public final hn t;
    public ic3 v;
    public ic3 x;
    public ic3 y;
    public int a = 0;
    public int m = -1;
    public String w = null;

    public an(TextView textView) {
        this.g = textView;
        this.t = new hn(textView);
    }

    public static void n(TextView textView, Typeface typeface, int i) {
        int i2 = Build.VERSION.SDK_INT;
        String str = null;
        if (i2 >= 26) {
            String strR = xm.r(textView);
            if (!TextUtils.isEmpty(strR)) {
                xm.x(textView, null);
            }
            str = strR;
        }
        textView.setTypeface(typeface, i);
        if (i2 < 26 || TextUtils.isEmpty(str)) {
            return;
        }
        xm.x(textView, str);
    }

    public static ic3 v(Context context, wl wlVar, int i) {
        ColorStateList colorStateListX;
        synchronized (wlVar) {
            colorStateListX = wlVar.g.x(context, i);
        }
        if (colorStateListX == null) {
            return null;
        }
        ic3 ic3Var = new ic3();
        ic3Var.y = true;
        ic3Var.r = colorStateListX;
        return ic3Var;
    }

    public final void a(int i, int i2, int i3, int i4) {
        hn hnVar = this.t;
        if (hnVar.a()) {
            DisplayMetrics displayMetrics = hnVar.a.getResources().getDisplayMetrics();
            hnVar.m(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (hnVar.j()) {
                hnVar.g();
            }
        }
    }

    public final void c(PorterDuff.Mode mode) {
        ic3 ic3Var = this.j;
        if (ic3Var == null) {
            ic3Var = new ic3();
            this.j = ic3Var;
        }
        ic3 ic3Var2 = ic3Var;
        ic3Var.n = mode;
        ic3Var.g = mode != null;
        this.y = ic3Var2;
        this.r = ic3Var2;
        this.n = ic3Var2;
        this.v = ic3Var2;
        this.x = ic3Var2;
        this.l = ic3Var2;
    }

    public final void g(Drawable drawable, ic3 ic3Var) {
        if (drawable == null || ic3Var == null) {
            return;
        }
        int[] drawableState = this.g.getDrawableState();
        PorterDuff.Mode mode = wl.y;
        s74.j(drawable, ic3Var, drawableState);
    }

    public final boolean i(Context context, ro roVar) {
        String string;
        int i;
        Typeface typeface;
        int i2 = this.a;
        TypedArray typedArray = (TypedArray) roVar.t;
        this.a = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.m = i4;
            if (i4 != -1) {
                this.a &= 2;
            }
        }
        if (i3 >= 26 && typedArray.hasValue(13)) {
            this.w = typedArray.getString(13);
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.q = null;
            int i5 = typedArray.hasValue(12) ? 12 : 10;
            int i6 = this.m;
            int i7 = this.a;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceD = roVar.d(i5, this.a, new um(this, i6, i7, new WeakReference(this.g)));
                    if (typefaceD != null) {
                        if (i3 < 28 || this.m == -1) {
                            this.q = typefaceD;
                        } else {
                            this.q = ym.g(Typeface.create(typefaceD, 0), this.m, (this.a & 2) != 0);
                        }
                    }
                    this.c = this.q == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.q == null && (string = typedArray.getString(i5)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.m == -1) {
                    this.q = Typeface.create(string, this.a);
                } else {
                    this.q = ym.g(Typeface.create(string, 0), this.m, (this.a & 2) != 0);
                }
            }
        } else {
            if (!typedArray.hasValue(1)) {
                if (i3 < 28 || (i = this.m) == -1 || (typeface = this.q) == null) {
                    return false;
                }
                this.q = ym.g(typeface, i, (this.a & 2) != 0);
                return true;
            }
            this.c = false;
            int i8 = typedArray.getInt(1, 1);
            if (i8 == 1) {
                this.q = Typeface.SANS_SERIF;
                return true;
            }
            if (i8 == 2) {
                this.q = Typeface.SERIF;
                return true;
            }
            if (i8 == 3) {
                this.q = Typeface.MONOSPACE;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:211:0x0366  */
    /* JADX WARN: Code duplicated, block: B:213:0x036b  */
    /* JADX WARN: Code duplicated, block: B:216:0x0372 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x0374  */
    /* JADX WARN: Code duplicated, block: B:219:0x0379  */
    /* JADX WARN: Code duplicated, block: B:221:0x037f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0383  */
    /* JADX WARN: Code duplicated, block: B:226:? A[RETURN, SYNTHETIC] */
    public final void j(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        float dimensionPixelSize;
        int iR;
        ColorStateList colorStateList;
        int resourceId;
        int i2;
        int resourceId2;
        TextView textView = this.g;
        Context context = textView.getContext();
        wl wlVarG = wl.g();
        int[] iArr = r24.j;
        ro roVarP = ro.P(i, 0, context, attributeSet, iArr);
        xk5.m(textView, textView.getContext(), iArr, attributeSet, (TypedArray) roVarP.t, i);
        TypedArray typedArray = (TypedArray) roVarP.t;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.y = v(context, wlVarG, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.r = v(context, wlVarG, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.n = v(context, wlVarG, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.v = v(context, wlVarG, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.x = v(context, wlVarG, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.l = v(context, wlVarG, typedArray.getResourceId(6, 0));
        }
        roVarP.S();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = r24.o;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            ro roVar = new ro(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            i(context, roVar);
            string = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            roVar.S();
        } else {
            z = false;
            z2 = false;
            string = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ro roVar2 = new ro(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (Build.VERSION.SDK_INT >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        i(context, roVar2);
        roVar2.S();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        r(false);
        if (string != null) {
            mx5.l(textView, mx5.y(string));
        }
        hn hnVar = this.t;
        Context context2 = hnVar.a;
        int[] iArr3 = r24.t;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = hnVar.t;
        xk5.m(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            hnVar.g = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    iArr4[i3] = typedArrayObtainTypedArray.getDimensionPixelSize(i3, -1);
                }
                hnVar.x = hn.y(iArr4);
                hnVar.t();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!hnVar.a()) {
            hnVar.g = 0;
        } else if (hnVar.g == 1) {
            if (!hnVar.l) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i2 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i2 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                hnVar.m(dimension2, dimension3, dimension);
            }
            hnVar.j();
        }
        if (km5.r && hnVar.g != 0) {
            int[] iArr5 = hnVar.x;
            if (iArr5.length > 0) {
                if (xm.y(textView) != -1.0f) {
                    xm.n(textView, Math.round(hnVar.n), Math.round(hnVar.v), Math.round(hnVar.r));
                } else {
                    xm.v(textView, iArr5);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableY = resourceId4 != -1 ? wlVarG.y(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableY2 = resourceId5 != -1 ? wlVarG.y(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableY3 = resourceId6 != -1 ? wlVarG.y(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableY4 = resourceId7 != -1 ? wlVarG.y(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableY5 = resourceId8 != -1 ? wlVarG.y(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableY6 = resourceId9 != -1 ? wlVarG.y(context, resourceId9) : null;
        if (drawableY5 != null || drawableY6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableY5 == null) {
                drawableY5 = compoundDrawablesRelative[0];
            }
            if (drawableY2 == null) {
                drawableY2 = compoundDrawablesRelative[1];
            }
            if (drawableY6 == null) {
                drawableY6 = compoundDrawablesRelative[2];
            }
            if (drawableY4 == null) {
                drawableY4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableY5, drawableY2, drawableY6, drawableY4);
        } else if (drawableY != null || drawableY2 != null || drawableY3 != null || drawableY4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableY == null) {
                    drawableY = compoundDrawables[0];
                }
                if (drawableY2 == null) {
                    drawableY2 = compoundDrawables[1];
                }
                if (drawableY3 == null) {
                    drawableY3 = compoundDrawables[2];
                }
                if (drawableY4 == null) {
                    drawableY4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableY, drawableY2, drawableY3, drawableY4);
            } else {
                if (drawableY2 == null) {
                    drawableY2 = compoundDrawablesRelative2[1];
                }
                if (drawableY4 == null) {
                    drawableY4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableY2, compoundDrawablesRelative2[2], drawableY4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = ue5.R(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(fe1.y(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                iR = lz5.r(typedValuePeekValue.data);
                dimensionPixelSize = TypedValue.complexToFloat(typedValuePeekValue.data);
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != -1) {
                mq2.k(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != -1) {
                mq2.d(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (iR == -1) {
                    mq2.e(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    t1.q(textView, iR, dimensionPixelSize);
                } else {
                    mq2.e(textView, Math.round(TypedValue.applyDimension(iR, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        dimensionPixelSize = -1.0f;
        iR = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            mq2.k(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            mq2.d(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (iR == -1) {
                mq2.e(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                t1.q(textView, iR, dimensionPixelSize);
            } else {
                mq2.e(textView, Math.round(TypedValue.applyDimension(iR, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final PorterDuff.Mode l() {
        ic3 ic3Var = this.j;
        if (ic3Var != null) {
            return (PorterDuff.Mode) ic3Var.n;
        }
        return null;
    }

    public final void m(int[] iArr, int i) {
        hn hnVar = this.t;
        if (hnVar.a()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = hnVar.a.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                hnVar.x = hn.y(iArrCopyOf);
                if (!hnVar.t()) {
                    t94.j(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                hnVar.l = false;
            }
            if (hnVar.j()) {
                hnVar.g();
            }
        }
    }

    public final void q(int i) {
        hn hnVar = this.t;
        if (hnVar.a()) {
            if (i == 0) {
                hnVar.g = 0;
                hnVar.n = -1.0f;
                hnVar.v = -1.0f;
                hnVar.r = -1.0f;
                hnVar.x = new int[0];
                hnVar.y = false;
                return;
            }
            if (i != 1) {
                l0.u(xi3.j("Unknown auto-size text type: ", i));
                return;
            }
            DisplayMetrics displayMetrics = hnVar.a.getResources().getDisplayMetrics();
            hnVar.m(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (hnVar.j()) {
                hnVar.g();
            }
        }
    }

    public final void r(boolean z) {
        Typeface typeface = this.q;
        TextView textView = this.g;
        if (typeface != null) {
            if (this.m == -1) {
                textView.setTypeface(typeface, this.a);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            textView.setTypeface(null);
        }
        String str = this.w;
        if (str == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        xm.x(textView, str);
    }

    public final void t(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, r24.o);
        ro roVar = new ro(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.g;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        boolean zI = i(context, roVar);
        roVar.S();
        r(zI);
    }

    public final void w(ColorStateList colorStateList) {
        ic3 ic3Var = this.j;
        if (ic3Var == null) {
            ic3Var = new ic3();
            this.j = ic3Var;
        }
        ic3 ic3Var2 = ic3Var;
        ic3Var.r = colorStateList;
        ic3Var.y = colorStateList != null;
        this.y = ic3Var2;
        this.r = ic3Var2;
        this.n = ic3Var2;
        this.v = ic3Var2;
        this.x = ic3Var2;
        this.l = ic3Var2;
    }

    public final ColorStateList x() {
        ic3 ic3Var = this.j;
        if (ic3Var != null) {
            return (ColorStateList) ic3Var.r;
        }
        return null;
    }

    public final void y() {
        ic3 ic3Var = this.y;
        TextView textView = this.g;
        if (ic3Var != null || this.r != null || this.n != null || this.v != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            g(compoundDrawables[0], this.y);
            g(compoundDrawables[1], this.r);
            g(compoundDrawables[2], this.n);
            g(compoundDrawables[3], this.v);
        }
        if (this.x == null && this.l == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        g(compoundDrawablesRelative[0], this.x);
        g(compoundDrawablesRelative[2], this.l);
    }
}
