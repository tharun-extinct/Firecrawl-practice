package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import io.appground.blek.ui.controls.TextInputView;

/* JADX INFO: loaded from: classes.dex */
public final class a75 implements TextWatcher {
    public String j = "";
    public final /* synthetic */ TextInputView t;

    public a75(TextInputView textInputView) {
        this.t = textInputView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        TextInputView textInputView = this.t;
        if (textInputView.getDebug()) {
            Log.d("TextInputView", ">>> afterTextChanged: " + ((Object) editable) + " newline: " + tx4.S(editable, "\n"));
        }
        if (BaseInputConnection.getComposingSpanStart(editable) != -1) {
            return;
        }
        if (tx4.S(editable, " ") || tx4.S(editable, "\n")) {
            textInputView.removeTextChangedListener(this);
            textInputView.setText("");
            textInputView.addTextChangedListener(this);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        if (this.t.getDebug()) {
            Log.d("TextInputView", "> beforeTextChanged: " + ((Object) charSequence) + ", start: " + i + ", count: " + i2 + ", after: " + i3);
        }
        this.j = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        TextInputView textInputView = this.t;
        mu0 mu0Var = null;
        if (textInputView.getDebug()) {
            String str = this.j;
            Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
            Log.d("TextInputView", ">> onTextChanged: '" + ((Object) charSequence) + "', beforeText: '" + str + "' start: " + i + ", before: " + i2 + ", count: " + i3 + ", composing: " + (spannable == null ? "n/a" : BaseInputConnection.getComposingSpanStart(spannable) + ".." + BaseInputConnection.getComposingSpanEnd(spannable)));
        }
        boolean zJ0 = tx4.j0(charSequence, this.j);
        String str2 = this.j;
        if (zJ0) {
            str2.getClass();
            String string = (tx4.j0(charSequence, str2) ? charSequence.subSequence(str2.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length())).toString();
            if (string.length() > 0) {
                if (textInputView.getDebug()) {
                    Log.d("TextInputView", "onTextInput: ".concat(string));
                }
                z65 textInputListener = textInputView.getTextInputListener();
                if (textInputListener != null) {
                    boolean textHidden = textInputView.getTextHidden();
                    gy gyVar = (gy) ((y22) textInputListener).t;
                    m50.T(mq2.a(gyVar), null, new yx((Object) gyVar, (Object) string, textHidden, mu0Var, (byte) 0), 3);
                    return;
                }
                return;
            }
            return;
        }
        if (tx4.j0(str2, charSequence)) {
            String strD0 = tx4.d0(charSequence, this.j);
            if (textInputView.getDebug()) {
                Log.d("TextInputView", "onTextRemove: " + strD0.length());
            }
            z65 textInputListener2 = textInputView.getTextInputListener();
            if (textInputListener2 != null) {
                ((y22) textInputListener2).f(strD0.length());
                return;
            }
            return;
        }
        String string2 = charSequence.toString();
        String str3 = this.j;
        str3.getClass();
        string2.getClass();
        int iMin = Math.min(str3.length(), string2.length());
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < iMin && str3.charAt(i4) == string2.charAt(i4); i4++) {
            sb.append(str3.charAt(i4));
        }
        String string3 = sb.toString();
        int length = tx4.d0(string3, this.j).length();
        if (textInputView.getDebug()) {
            Log.d("TextInputView", "onTextRemove 2: " + length);
        }
        z65 textInputListener3 = textInputView.getTextInputListener();
        if (textInputListener3 != null) {
            ((y22) textInputListener3).f(length);
        }
        if (charSequence.length() > 0) {
            String strD1 = tx4.d0(string3, string2);
            if (textInputView.getDebug()) {
                Log.d("TextInputView", "onTextInput 2: ".concat(string3));
            }
            z65 textInputListener4 = textInputView.getTextInputListener();
            if (textInputListener4 != null) {
                boolean textHidden2 = textInputView.getTextHidden();
                gy gyVar2 = (gy) ((y22) textInputListener4).t;
                m50.T(mq2.a(gyVar2), null, new yx((Object) gyVar2, (Object) strD1, textHidden2, mu0Var, (byte) 0), 3);
            }
        }
    }
}
