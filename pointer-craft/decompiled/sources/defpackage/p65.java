package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class p65 implements TextWatcher {
    public final /* synthetic */ TextInputLayout a;
    public int j;
    public final /* synthetic */ EditText t;

    public p65(TextInputLayout textInputLayout, EditText editText) {
        this.a = textInputLayout;
        this.t = editText;
        this.j = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.a;
        textInputLayout.f(!textInputLayout.I0, false);
        if (textInputLayout.u) {
            textInputLayout.b(editable);
        }
        if (textInputLayout.A) {
            textInputLayout.k(editable);
        }
        EditText editText = this.t;
        int lineCount = editText.getLineCount();
        int i = this.j;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.B0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.j = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
