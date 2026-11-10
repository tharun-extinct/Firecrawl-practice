package io.appground.blek.ui.controls;

import android.content.Context;
import android.os.Build;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import defpackage.a75;
import defpackage.en;
import defpackage.rp2;
import defpackage.z65;

/* JADX INFO: loaded from: classes.dex */
public final class TextInputView extends en {
    public z65 b;
    public final a75 p;
    public boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        a75 a75Var = new a75(this);
        this.p = a75Var;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImeOptions(1);
        setInputType(1);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(2);
        }
        setCursorVisible(false);
        setBackground(null);
        setEnabled(false);
        addTextChangedListener(a75Var);
    }

    public final boolean getDebug() {
        return false;
    }

    public final boolean getTextHidden() {
        return this.s;
    }

    public final z65 getTextInputListener() {
        return this.b;
    }

    public final TextWatcher getTextWatcher() {
        return this.p;
    }

    public final void j() {
        CharSequence text = getText();
        text.getClass();
        if (text.length() == 0) {
            return;
        }
        a75 a75Var = this.p;
        removeTextChangedListener(a75Var);
        setText("");
        addTextChangedListener(a75Var);
    }

    public final void setTextHidden(boolean z) {
        this.s = z;
    }

    public final void setTextInputListener(z65 z65Var) {
        this.b = z65Var;
    }

    public final void setVisibility(boolean z) {
        this.s = z;
        j();
        int i = rp2.g;
        setTransformationMethod(z ? PasswordTransformationMethod.getInstance() : null);
        setInputType(z ? 129 : 1);
    }
}
