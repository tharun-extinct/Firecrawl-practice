package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class sm extends Spinner {
    public static final int[] b = {R.attr.spinnerMode};
    public final jm a;
    public int c;
    public final Rect i;
    public final al j;
    public SpinnerAdapter m;
    public final boolean q;
    public final Context t;
    public final rm w;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public sm(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, io.appground.blek.R.attr.spinnerStyle);
        this.i = new Rect();
        t85.g(this, getContext());
        int[] iArr = r24.h;
        ro roVarP = ro.P(io.appground.blek.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) roVarP.t;
        this.j = new al(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.t = new lu0(context, resourceId);
        } else {
            this.t = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, io.appground.blek.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i != 0) {
                        lm lmVar = new lm(this);
                        this.w = lmVar;
                        lmVar.a = typedArray.getString(2);
                    } else if (i == 1) {
                        pm pmVar = new pm(this, this.t, attributeSet);
                        ro roVarP2 = ro.P(io.appground.blek.R.attr.spinnerStyle, 0, this.t, attributeSet, iArr);
                        this.c = ((TypedArray) roVarP2.t).getLayoutDimension(3, -2);
                        pmVar.x(roVarP2.h(1));
                        pmVar.J = typedArray.getString(2);
                        roVarP2.S();
                        this.w = pmVar;
                        this.a = new jm(this, this, pmVar);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(io.appground.blek.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    roVarP.S();
                    this.q = true;
                    spinnerAdapter = this.m;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.m = null;
                    }
                    this.j.n(attributeSet, io.appground.blek.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            lm lmVar2 = new lm(this);
            this.w = lmVar2;
            lmVar2.a = typedArray.getString(2);
        } else if (i == 1) {
            pm pmVar2 = new pm(this, this.t, attributeSet);
            ro roVarP3 = ro.P(io.appground.blek.R.attr.spinnerStyle, 0, this.t, attributeSet, iArr);
            this.c = ((TypedArray) roVarP3.t).getLayoutDimension(3, -2);
            pmVar2.x(roVarP3.h(1));
            pmVar2.J = typedArray.getString(2);
            roVarP3.S();
            this.w = pmVar2;
            this.a = new jm(this, this, pmVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(io.appground.blek.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        roVarP.S();
        this.q = true;
        spinnerAdapter = this.m;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.m = null;
        }
        this.j.n(attributeSet, io.appground.blek.R.attr.spinnerStyle);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        al alVar = this.j;
        if (alVar != null) {
            alVar.g();
        }
    }

    public final int g(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.i;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        rm rmVar = this.w;
        return rmVar != null ? rmVar.y() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        rm rmVar = this.w;
        return rmVar != null ? rmVar.c() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.w != null ? this.c : super.getDropDownWidth();
    }

    public final rm getInternalPopup() {
        return this.w;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        rm rmVar = this.w;
        return rmVar != null ? rmVar.n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.t;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        rm rmVar = this.w;
        return rmVar != null ? rmVar.i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        al alVar = this.j;
        if (alVar != null) {
            return alVar.y();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        al alVar = this.j;
        if (alVar != null) {
            return alVar.r();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rm rmVar = this.w;
        if (rmVar == null || !rmVar.g()) {
            return;
        }
        rmVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.w == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), g(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        qm qmVar = (qm) parcelable;
        super.onRestoreInstanceState(qmVar.getSuperState());
        if (!qmVar.j || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new km(this, (byte) 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        qm qmVar = new qm(super.onSaveInstanceState());
        rm rmVar = this.w;
        qmVar.j = rmVar != null && rmVar.g();
        return qmVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jm jmVar = this.a;
        if (jmVar == null || !jmVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        rm rmVar = this.w;
        if (rmVar == null) {
            return super.performClick();
        }
        if (rmVar.g()) {
            return true;
        }
        rmVar.q(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.q) {
            this.m = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        rm rmVar = this.w;
        if (rmVar != null) {
            Context context = this.t;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            mm mmVar = new mm();
            mmVar.g = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                mmVar.y = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            rmVar.b(mmVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        al alVar = this.j;
        if (alVar != null) {
            alVar.x();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        al alVar = this.j;
        if (alVar != null) {
            alVar.l(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        rm rmVar = this.w;
        if (rmVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            rmVar.a(i);
            rmVar.m(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        rm rmVar = this.w;
        if (rmVar != null) {
            rmVar.l(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.w != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        rm rmVar = this.w;
        if (rmVar != null) {
            rmVar.x(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(k33.J(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        rm rmVar = this.w;
        if (rmVar != null) {
            rmVar.v(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        al alVar = this.j;
        if (alVar != null) {
            alVar.a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        al alVar = this.j;
        if (alVar != null) {
            alVar.m(mode);
        }
    }
}
