package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public class zk extends AutoCompleteTextView {
    public static final int[] m = {R.attr.popupBackground};
    public final ji a;
    public final al j;
    public final an t;

    public zk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, io.appground.blek.R.attr.autoCompleteTextViewStyle);
        t85.g(this, getContext());
        ro roVarP = ro.P(io.appground.blek.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, m);
        if (((TypedArray) roVarP.t).hasValue(0)) {
            setDropDownBackgroundDrawable(roVarP.h(0));
        }
        roVarP.S();
        al alVar = new al(this);
        this.j = alVar;
        alVar.n(attributeSet, io.appground.blek.R.attr.autoCompleteTextViewStyle);
        an anVar = new an(this);
        this.t = anVar;
        anVar.j(attributeSet, io.appground.blek.R.attr.autoCompleteTextViewStyle);
        anVar.y();
        ji jiVar = new ji((EditText) this, (byte) 1);
        this.a = jiVar;
        jiVar.M(attributeSet, io.appground.blek.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerD = jiVar.D(keyListener);
        if (keyListenerD == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerD);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
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
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mq2.D(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ix5.n(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.a.O(inputConnectionOnCreateInputConnection, editorInfo);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mq2.E(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(k33.J(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.a.V(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.a.D(keyListener));
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        an anVar = this.t;
        if (anVar != null) {
            anVar.t(context, i);
        }
    }

    public zk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
