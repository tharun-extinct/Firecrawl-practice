package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class el extends CheckBox implements v95 {
    public final an a;
    public final hl j;
    public zl m;
    public final al t;

    public el(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t85.g(this, getContext());
        hl hlVar = new hl(this);
        this.j = hlVar;
        hlVar.y(attributeSet, i);
        al alVar = new al(this);
        this.t = alVar;
        alVar.n(attributeSet, i);
        an anVar = new an(this);
        this.a = anVar;
        anVar.j(attributeSet, i);
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        al alVar = this.t;
        if (alVar != null) {
            alVar.g();
        }
        an anVar = this.a;
        if (anVar != null) {
            anVar.y();
        }
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

    @Override // defpackage.v95
    public ColorStateList getSupportButtonTintList() {
        hl hlVar = this.j;
        if (hlVar != null) {
            return hlVar.y;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        hl hlVar = this.j;
        if (hlVar != null) {
            return hlVar.r;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.a.x();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.a.l();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        hl hlVar = this.j;
        if (hlVar != null) {
            if (hlVar.x) {
                hlVar.x = false;
            } else {
                hlVar.x = true;
                hlVar.g();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        an anVar = this.a;
        if (anVar != null) {
            anVar.y();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        an anVar = this.a;
        if (anVar != null) {
            anVar.y();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().r(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((ra) getEmojiTextViewHelper().y.t).A(inputFilterArr));
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

    @Override // defpackage.v95
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        hl hlVar = this.j;
        if (hlVar != null) {
            hlVar.y = colorStateList;
            hlVar.n = true;
            hlVar.g();
        }
    }

    @Override // defpackage.v95
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        hl hlVar = this.j;
        if (hlVar != null) {
            hlVar.r = mode;
            hlVar.v = true;
            hlVar.g();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(k33.J(getContext(), i));
    }
}
