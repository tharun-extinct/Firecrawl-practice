package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class cl extends Button {
    public zl a;
    public final al j;
    public zm m;
    public final an t;

    public cl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t85.g(this, getContext());
        al alVar = new al(this);
        this.j = alVar;
        alVar.n(attributeSet, i);
        an anVar = new an(this);
        this.t = anVar;
        anVar.j(attributeSet, i);
        anVar.y();
        getEmojiTextViewHelper().g(attributeSet, i);
    }

    private zl getEmojiTextViewHelper() {
        zl zlVar = this.a;
        if (zlVar != null) {
            return zlVar;
        }
        zl zlVar2 = new zl(this);
        this.a = zlVar2;
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
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().v;
    }

    public zm getFontVariationSettingsManager() {
        zm zmVar = this.m;
        if (zmVar != null) {
            return zmVar;
        }
        zm zmVar2 = new zm(this, new bl(this, (byte) 0));
        this.m = zmVar2;
        return zmVar2;
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
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().r : super.getTypeface();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        an anVar = this.t;
        if (anVar == null || km5.r) {
            return;
        }
        anVar.t.g();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().g(str);
    }

    public void setSupportAllCaps(boolean z) {
        an anVar = this.t;
        if (anVar != null) {
            anVar.g.setAllCaps(z);
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
    public void setTextSize(int i, float f) {
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
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 26) {
            super.setTypeface(typeface);
            return;
        }
        zm fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.r = typeface;
        fontVariationSettingsManager.n = typeface;
        fontVariationSettingsManager.y.accept(typeface);
    }
}
