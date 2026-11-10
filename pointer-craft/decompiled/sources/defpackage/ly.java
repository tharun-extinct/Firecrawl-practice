package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class ly extends ProgressBar {
    public final boolean a;
    public boolean b;
    public boolean c;
    public final ky h;
    public int i;
    public final qf0 j;
    public final int m;
    public final jy p;
    public long q;
    public final iy s;
    public int t;
    public final jy u;
    public xi w;
    public final ky z;

    public ly(Context context, AttributeSet attributeSet) {
        super(gp4.X(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, R.attr.circularProgressIndicatorStyle);
        this.q = -1L;
        this.c = false;
        this.i = 4;
        this.s = new iy(this);
        this.p = new jy(this, (byte) 0);
        this.u = new jy(this, (byte) 1);
        this.z = new ky(this, (byte) 0);
        this.h = new ky(this, (byte) 1);
        Context context2 = getContext();
        qf0 qf0Var = new qf0();
        qf0Var.v = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        ue5.C(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = p24.g;
        ue5.E(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        qf0Var.g = zq2.s(context2, typedArrayObtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null) {
            int i = typedValuePeekValue.type;
            if (i == 5) {
                qf0Var.y = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), qf0Var.g / 2);
                qf0Var.n = false;
            } else if (i == 6) {
                qf0Var.r = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                qf0Var.n = true;
            }
        }
        qf0Var.l = typedArrayObtainStyledAttributes.getInt(6, 0);
        qf0Var.j = typedArrayObtainStyledAttributes.getInt(1, 0);
        qf0Var.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0));
        qf0Var.a = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(16, iAbs));
        qf0Var.m = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(17, iAbs));
        qf0Var.q = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        qf0Var.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        qf0Var.c = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        qf0Var.i = typedArrayObtainStyledAttributes.getFloat(13, 0.1f);
        qf0Var.b = typedArrayObtainStyledAttributes.getFloat(12, 0.9f);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            qf0Var.v = new int[]{xq2.i(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            qf0Var.v = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            qf0Var.v = intArray;
            if (intArray.length == 0) {
                l0.u("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            qf0Var.x = typedArrayObtainStyledAttributes.getColor(8, -1);
        } else {
            qf0Var.x = qf0Var.v[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            qf0Var.x = xq2.t(qf0Var.x, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        ue5.C(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr2 = p24.v;
        ue5.E(context2, attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        qf0Var.s = typedArrayObtainStyledAttributes3.getInt(0, 0);
        qf0Var.p = Math.max(zq2.s(context2, typedArrayObtainStyledAttributes3, 4, dimensionPixelSize2), qf0Var.g * 2);
        qf0Var.u = zq2.s(context2, typedArrayObtainStyledAttributes3, 3, dimensionPixelSize3);
        qf0Var.z = typedArrayObtainStyledAttributes3.getInt(2, 0);
        qf0Var.h = typedArrayObtainStyledAttributes3.getBoolean(1, true);
        typedArrayObtainStyledAttributes3.recycle();
        qf0Var.y();
        this.j = qf0Var;
        ue5.C(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        ue5.E(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(7, -1);
        this.m = Math.min(typedArrayObtainStyledAttributes4.getInt(5, -1), 1000);
        typedArrayObtainStyledAttributes4.recycle();
        this.w = new xi();
        this.a = true;
    }

    private af1 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().h;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().h;
    }

    public final void g(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.t = i;
            this.c = true;
            if (getIndeterminateDrawable().isVisible()) {
                xi xiVar = this.w;
                ContentResolver contentResolver = getContext().getContentResolver();
                xiVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().o.a();
                    return;
                }
            }
            this.z.g(getIndeterminateDrawable());
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.j.j;
    }

    @Override // android.widget.ProgressBar
    public ab2 getIndeterminateDrawable() {
        return (ab2) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.j.v;
    }

    public int getIndicatorTrackGapSize() {
        return this.j.t;
    }

    @Override // android.widget.ProgressBar
    public e61 getProgressDrawable() {
        return (e61) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.j.l;
    }

    public int getTrackColor() {
        return this.j.x;
    }

    public int getTrackCornerRadius() {
        return this.j.y;
    }

    public float getTrackCornerRadiusFraction() {
        return this.j.r;
    }

    public int getTrackThickness() {
        return this.j.g;
    }

    public int getWaveAmplitude() {
        return this.j.q;
    }

    public int getWaveSpeed() {
        return this.j.w;
    }

    public int getWavelengthDeterminate() {
        return this.j.a;
    }

    public int getWavelengthIndeterminate() {
        return this.j.m;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o.t(this.z);
        }
        e61 progressDrawable = getProgressDrawable();
        ky kyVar = this.h;
        if (progressDrawable != null) {
            e61 progressDrawable2 = getProgressDrawable();
            ArrayList arrayList = progressDrawable2.c;
            if (arrayList == null) {
                arrayList = new ArrayList();
                progressDrawable2.c = arrayList;
            }
            if (!arrayList.contains(kyVar)) {
                progressDrawable2.c.add(kyVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            ab2 indeterminateDrawable = getIndeterminateDrawable();
            ArrayList arrayList2 = indeterminateDrawable.c;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                indeterminateDrawable.c = arrayList2;
            }
            if (!arrayList2.contains(kyVar)) {
                indeterminateDrawable.c.add(kyVar);
            }
        }
        if (y()) {
            if (this.m > 0) {
                this.q = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.u);
        removeCallbacks(this.p);
        ((he1) getCurrentDrawable()).n(false, false, false);
        ab2 indeterminateDrawable = getIndeterminateDrawable();
        ky kyVar = this.h;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().x(kyVar);
            getIndeterminateDrawable().o.q();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().x(kyVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            af1 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(((kf0) currentDrawingDelegate).l() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : ((kf0) currentDrawingDelegate).l() + getPaddingLeft() + getPaddingRight(), ((kf0) currentDrawingDelegate).l() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : ((kf0) currentDrawingDelegate).l() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.a) {
            ((he1) getCurrentDrawable()).n(y(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.a) {
            ((he1) getCurrentDrawable()).n(y(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(xi xiVar) {
        this.w = xiVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().a = xiVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().a = xiVar;
        }
    }

    public void setHideAfterMaxProgress(boolean z) {
        if (getProgressDrawable() == null) {
            return;
        }
        iy iyVar = this.s;
        if (z) {
            ArrayList arrayList = getProgressDrawable().o.m;
            if (arrayList.contains(iyVar)) {
                return;
            }
            arrayList.add(iyVar);
            return;
        }
        ArrayList arrayList2 = getProgressDrawable().o.m;
        int iIndexOf = arrayList2.indexOf(iyVar);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.j.j = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            he1 he1Var = (he1) getCurrentDrawable();
            if (he1Var != null) {
                he1Var.n(false, false, false);
            }
            super.setIndeterminate(z);
            he1 he1Var2 = (he1) getCurrentDrawable();
            if (he1Var2 != null) {
                he1Var2.n(y(), false, false);
            }
            if ((he1Var2 instanceof ab2) && y()) {
                ((ab2) he1Var2).o.m();
            }
            this.c = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        qf0 qf0Var = this.j;
        if (qf0Var.c != f) {
            qf0Var.c = f;
            getIndeterminateDrawable().o.r();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof ab2) {
            ((he1) drawable).n(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.b) {
            l0.u("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{xq2.i(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.j.v = iArr;
        getIndeterminateDrawable().o.r();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        qf0 qf0Var = this.j;
        if (qf0Var.t != i) {
            qf0Var.t = i;
            qf0Var.y();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        g(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof e61) {
            e61 e61Var = (e61) drawable;
            e61Var.n(false, false, false);
            super.setProgressDrawable(e61Var);
            e61Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.b) {
            l0.u("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.j.l = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        qf0 qf0Var = this.j;
        if (qf0Var.x != i) {
            qf0Var.x = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        qf0 qf0Var = this.j;
        if (qf0Var.y != i) {
            qf0Var.y = Math.min(i, qf0Var.g / 2);
            qf0Var.n = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        qf0 qf0Var = this.j;
        if (qf0Var.r != f) {
            qf0Var.r = Math.min(f, 0.5f);
            qf0Var.n = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        qf0 qf0Var = this.j;
        if (qf0Var.g != i) {
            qf0Var.g = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.i = i;
        } else {
            l0.u("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        qf0 qf0Var = this.j;
        if (qf0Var.q != i) {
            qf0Var.q = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveAmplitudeRampProgressMax(float f) {
        e61 progressDrawable = getProgressDrawable();
        progressDrawable.t.b = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveAmplitudeRampProgressMin(float f) {
        e61 progressDrawable = getProgressDrawable();
        progressDrawable.t.i = f;
        progressDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveSpeed(int i) {
        qf0 qf0Var = this.j;
        qf0Var.w = i;
        e61 progressDrawable = getProgressDrawable();
        boolean z = qf0Var.w != 0;
        ValueAnimator valueAnimator = progressDrawable.e;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        qf0 qf0Var = this.j;
        if (qf0Var.a != i) {
            qf0Var.a = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        qf0 qf0Var = this.j;
        if (qf0Var.m != i) {
            qf0Var.m = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public final boolean y() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }
}
