package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fl extends CheckedTextView {
    public final an a;
    public final gl j;
    public zl m;
    public final al t;

    public fl(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        t85.g(this, getContext());
        an anVar = new an(this);
        this.a = anVar;
        anVar.j(attributeSet, R.attr.checkedTextViewStyle);
        anVar.y();
        al alVar = new al(this);
        this.t = alVar;
        alVar.n(attributeSet, R.attr.checkedTextViewStyle);
        this.j = new gl(this);
        Context context2 = getContext();
        int[] iArr = r24.q;
        ro roVarP = ro.P(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) roVarP.t;
        xk5.m(this, getContext(), iArr, attributeSet, (TypedArray) roVarP.t, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(k33.J(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(k33.J(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(k33.J(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(roVarP.s(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(fe1.y(typedArray.getInt(3, -1), null));
            }
            roVarP.S();
            getEmojiTextViewHelper().g(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            roVarP.S();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        an anVar = this.a;
        if (anVar != null) {
            anVar.y();
        }
        al alVar = this.t;
        if (alVar != null) {
            alVar.g();
        }
        gl glVar = this.j;
        if (glVar != null) {
            glVar.g();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mq2.D(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        al alVar = this.t;
        if (alVar != null) {
            return alVar.y();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        al alVar = this.t;
        if (alVar != null) {
            return alVar.r();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        gl glVar = this.j;
        if (glVar != null) {
            return glVar.y;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        gl glVar = this.j;
        if (glVar != null) {
            return glVar.r;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.a.x();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.a.l();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ix5.n(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().y(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        al alVar = this.t;
        if (alVar != null) {
            alVar.x();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        al alVar = this.t;
        if (alVar != null) {
            alVar.l(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        gl glVar = this.j;
        if (glVar != null) {
            if (glVar.x) {
                glVar.x = false;
            } else {
                glVar.x = true;
                glVar.g();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        an anVar = this.a;
        if (anVar != null) {
            anVar.y();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        an anVar = this.a;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        al alVar = this.t;
        if (alVar != null) {
            alVar.a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        al alVar = this.t;
        if (alVar != null) {
            alVar.m(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        gl glVar = this.j;
        if (glVar != null) {
            glVar.y = colorStateList;
            glVar.n = true;
            glVar.g();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        gl glVar = this.j;
        if (glVar != null) {
            glVar.r = mode;
            glVar.v = true;
            glVar.g();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        an anVar = this.a;
        anVar.w(colorStateList);
        anVar.y();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        an anVar = this.a;
        anVar.c(mode);
        anVar.y();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        an anVar = this.a;
        if (anVar != null) {
            anVar.t(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(k33.J(getContext(), i));
    }
}
