package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class t85 {
    public static final ThreadLocal g = new ThreadLocal();
    public static final int[] y = {-16842910};
    public static final int[] r = {R.attr.state_focused};
    public static final int[] n = {R.attr.state_pressed};
    public static final int[] v = {R.attr.state_checked};
    public static final int[] x = new int[0];
    public static final int[] l = new int[1];

    public static void g(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(r24.a);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList n(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = l;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = ue5.R(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int r(Context context, int i) {
        int[] iArr = l;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int y(Context context, int i) {
        ColorStateList colorStateListN = n(context, i);
        if (colorStateListN != null && colorStateListN.isStateful()) {
            return colorStateListN.getColorForState(y, colorStateListN.getDefaultColor());
        }
        ThreadLocal threadLocal = g;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iR = r(context, i);
        return zj0.n(iR, Math.round(Color.alpha(iR) * f));
    }
}
