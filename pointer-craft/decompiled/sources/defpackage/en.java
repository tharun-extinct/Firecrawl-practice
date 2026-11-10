package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class en extends TextView {
    public final ji a;
    public Future c;
    public zm i;
    public final al j;
    public zl m;
    public boolean q;
    public final an t;
    public q64 w;

    public en(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = false;
        this.w = null;
        t85.g(this, getContext());
        al alVar = new al(this);
        this.j = alVar;
        alVar.n(attributeSet, i);
        an anVar = new an(this);
        this.t = anVar;
        anVar.j(attributeSet, i);
        anVar.y();
        ji jiVar = new ji((byte) 2, false);
        jiVar.t = this;
        this.a = jiVar;
        getEmojiTextViewHelper().g(attributeSet, i);
    }

    private zl getEmojiTextViewHelper() {
        zl zlVar = this.m;
        if (zlVar != null) {
            return zlVar;
        }
        zl zlVar2 = new zl(this);
        this.m = zlVar2;
        return zlVar2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        al alVar = this.j;
        if (alVar != null) {
            alVar.g();
        }
        an anVar = this.t;
        if (anVar != null) {
            anVar.y();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (km5.r) {
            return super.getAutoSizeMaxTextSize();
        }
        an anVar = this.t;
        if (anVar != null) {
            return Math.round(anVar.t.v);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (km5.r) {
            return super.getAutoSizeMinTextSize();
        }
        an anVar = this.t;
        if (anVar != null) {
            return Math.round(anVar.t.n);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (km5.r) {
            return super.getAutoSizeStepGranularity();
        }
        an anVar = this.t;
        if (anVar != null) {
            return Math.round(anVar.t.r);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (km5.r) {
            return super.getAutoSizeTextAvailableSizes();
        }
        an anVar = this.t;
        return anVar != null ? anVar.t.x : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (km5.r) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        an anVar = this.t;
        if (anVar != null) {
            return anVar.t.g;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mq2.D(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().v;
    }

    public zm getFontVariationSettingsManager() {
        zm zmVar = this.i;
        if (zmVar != null) {
            return zmVar;
        }
        zm zmVar2 = new zm(this, new bl(this, (byte) 2));
        this.i = zmVar2;
        return zmVar2;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public bn getSuperCaller() {
        q64 q64Var = this.w;
        if (q64Var != null) {
            return q64Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            dn dnVar = new dn(this);
            this.w = dnVar;
            return dnVar;
        }
        if (i >= 28) {
            cn cnVar = new cn(this);
            this.w = cnVar;
            return cnVar;
        }
        if (i < 26) {
            return q64Var;
        }
        q64 q64Var2 = new q64((Object) this, (byte) 5);
        this.w = q64Var2;
        return q64Var2;
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.t.x();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.t.l();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.c;
        if (future != null) {
            try {
                this.c = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                mq2.w(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        ji jiVar;
        if (Build.VERSION.SDK_INT >= 28 || (jiVar = this.a) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) jiVar.a;
        return textClassifier == null ? tm.x((TextView) jiVar.t) : textClassifier;
    }

    public yv3 getTextMetricsParamsCompat() {
        return mq2.w(this);
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().r : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.t.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            za6.q(editorInfo, getText());
        }
        ix5.n(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        an anVar = this.t;
        if (anVar == null || km5.r) {
            return;
        }
        anVar.t.g();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.c;
        if (future != null) {
            try {
                this.c = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                mq2.w(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        an anVar = this.t;
        if (anVar != null) {
            hn hnVar = anVar.t;
            if (km5.r || !hnVar.x()) {
                return;
            }
            hnVar.g();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().y(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (km5.r) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        an anVar = this.t;
        if (anVar != null) {
            anVar.a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (km5.r) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        an anVar = this.t;
        if (anVar != null) {
            anVar.m(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (km5.r) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        an anVar = this.t;
        if (anVar != null) {
            anVar.q(i);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        an anVar = this.t;
        if (anVar != null) {
            anVar.y();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        an anVar = this.t;
        if (anVar != null) {
            anVar.y();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? k33.J(context, i) : null, i2 != 0 ? k33.J(context, i2) : null, i3 != 0 ? k33.J(context, i3) : null, i4 != 0 ? k33.J(context, i4) : null);
        an anVar = this.t;
        if (anVar != null) {
            anVar.y();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? k33.J(context, i) : null, i2 != 0 ? k33.J(context, i2) : null, i3 != 0 ? k33.J(context, i3) : null, i4 != 0 ? k33.J(context, i4) : null);
        an anVar = this.t;
        if (anVar != null) {
            anVar.y();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mq2.E(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().r(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((ra) getEmojiTextViewHelper().y.t).A(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().y(i);
        } else {
            mq2.k(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().g(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i);
        } else {
            mq2.d(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().r(i, f);
        } else if (i2 >= 34) {
            t1.q(this, i, f);
        } else {
            mq2.e(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(zv3 zv3Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        mq2.w(this);
        throw null;
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        an anVar = this.t;
        anVar.w(colorStateList);
        anVar.y();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        an anVar = this.t;
        anVar.c(mode);
        anVar.y();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        an anVar = this.t;
        if (anVar != null) {
            anVar.t(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        ji jiVar;
        if (Build.VERSION.SDK_INT >= 28 || (jiVar = this.a) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            jiVar.a = textClassifier;
        }
    }

    public void setTextFuture(Future<zv3> future) {
        this.c = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(yv3 yv3Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristicR = yv3Var.r();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristicR != textDirectionHeuristic2 && textDirectionHeuristicR != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristicR == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristicR == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristicR == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristicR == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristicR == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristicR == textDirectionHeuristic2) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(yv3Var.n());
        setBreakStrategy(yv3Var.g());
        setHyphenationFrequency(yv3Var.y());
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = km5.r;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        an anVar = this.t;
        if (anVar != null) {
            hn hnVar = anVar.t;
            if (z || hnVar.x()) {
                return;
            }
            hnVar.l(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.q) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            zq2 zq2Var = xe5.g;
            if (context == null) {
                l0.u("Context cannot be null");
                return;
            }
            typeface = Typeface.create(typeface, i);
        }
        this.q = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.q = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        mq2.e(this, i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 26) {
            zm fontVariationSettingsManager = getFontVariationSettingsManager();
            fontVariationSettingsManager.r = typeface;
            fontVariationSettingsManager.n = typeface;
            fontVariationSettingsManager.y.accept(typeface);
            return;
        }
        super.setTypeface(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        an anVar = this.t;
        if (anVar != null) {
            anVar.y();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        an anVar = this.t;
        if (anVar != null) {
            anVar.y();
        }
    }

    public en(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
