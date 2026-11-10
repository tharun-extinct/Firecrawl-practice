package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hn {
    public static final RectF q = new RectF();
    public static final ConcurrentHashMap w = new ConcurrentHashMap();
    public final Context a;
    public TextPaint j;
    public final gn m;
    public final TextView t;
    public int g = 0;
    public boolean y = false;
    public float r = -1.0f;
    public float n = -1.0f;
    public float v = -1.0f;
    public int[] x = new int[0];
    public boolean l = false;

    public hn(TextView textView) {
        this.t = textView;
        this.a = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.m = new fn();
        } else {
            this.m = new gn();
        }
    }

    public static Method n(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = w;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static Object v(Object obj, Object obj2, String str) {
        try {
            return n(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public static int[] y(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean a() {
        return !(this.t instanceof yl);
    }

    public final void g() {
        if (x()) {
            if (this.y) {
                if (this.t.getMeasuredHeight() <= 0 || this.t.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.m.y(this.t) ? 1048576 : (this.t.getMeasuredWidth() - this.t.getTotalPaddingLeft()) - this.t.getTotalPaddingRight();
                int height = (this.t.getHeight() - this.t.getCompoundPaddingBottom()) - this.t.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = q;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fR = r(rectF);
                        if (fR != this.t.getTextSize()) {
                            l(0, fR);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.y = true;
        }
    }

    public final boolean j() {
        if (!a() || this.g != 1) {
            this.y = false;
            return false;
        }
        if (!this.l || this.x.length == 0) {
            int iFloor = ((int) Math.floor((this.v - this.n) / this.r)) + 1;
            int[] iArr = new int[iFloor];
            for (int i = 0; i < iFloor; i++) {
                iArr[i] = Math.round((i * this.r) + this.n);
            }
            this.x = y(iArr);
        }
        this.y = true;
        return true;
    }

    public final void l(int i, float f) {
        Context context = this.a;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.t;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.y = false;
                try {
                    Method methodN = n("nullLayouts");
                    if (methodN != null) {
                        methodN.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final void m(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.g = 1;
        this.n = f;
        this.v = f2;
        this.r = f3;
        this.l = false;
    }

    public final int r(RectF rectF) {
        CharSequence transformation;
        int length = this.x.length;
        if (length == 0) {
            l0.z("No available text sizes to choose from.");
            return 0;
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int[] iArr = this.x;
            if (i3 > i) {
                return iArr[i2];
            }
            int i4 = (i3 + i) / 2;
            int i5 = iArr[i4];
            TextView textView = this.t;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.j;
            if (textPaint == null) {
                this.j = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.j.set(textView.getPaint());
            this.j.setTextSize(i5);
            StaticLayout staticLayoutY = px5.y(charSequence, (Layout.Alignment) v(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.t, this.j, this.m);
            if ((maxLines == -1 || (staticLayoutY.getLineCount() <= maxLines && staticLayoutY.getLineEnd(staticLayoutY.getLineCount() - 1) == charSequence.length())) && staticLayoutY.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
    }

    public final boolean t() {
        int[] iArr = this.x;
        int length = iArr.length;
        boolean z = length > 0;
        this.l = z;
        if (z) {
            this.g = 1;
            this.n = iArr[0];
            this.v = iArr[length - 1];
            this.r = -1.0f;
        }
        return z;
    }

    public final boolean x() {
        return a() && this.g != 0;
    }
}
