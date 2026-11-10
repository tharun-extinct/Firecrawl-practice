package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class hj1 {
    public final /* synthetic */ jj1 g;

    public hj1(jj1 jj1Var) {
        this.g = jj1Var;
    }

    public final void g(TextInputLayout textInputLayout) {
        jj1 jj1Var = this.g;
        gj1 gj1Var = jj1Var.C;
        if (jj1Var.e == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = jj1Var.e;
        if (editText != null) {
            editText.removeTextChangedListener(gj1Var);
            if (jj1Var.e.getOnFocusChangeListener() == jj1Var.y().v()) {
                jj1Var.e.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        jj1Var.e = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(gj1Var);
        }
        jj1Var.y().w(jj1Var.e);
        jj1Var.m(jj1Var.y());
    }
}
