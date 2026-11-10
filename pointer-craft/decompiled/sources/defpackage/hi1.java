package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class hi1 implements TextWatcher {
    public boolean a = true;
    public final EditText j;
    public gi1 t;

    public hi1(EditText editText) {
        this.j = editText;
    }

    public static void g(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            ph1 ph1VarG = ph1.g();
            if (editableText == null) {
                length = 0;
            } else {
                ph1VarG.getClass();
                length = editableText.length();
            }
            ph1VarG.l(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.j;
        if (!editText.isInEditMode() && this.a && ph1.n() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iR = ph1.g().r();
            if (iR != 0) {
                if (iR == 1) {
                    ph1.g().l(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iR != 3) {
                    return;
                }
            }
            ph1 ph1VarG = ph1.g();
            gi1 gi1Var = this.t;
            if (gi1Var == null) {
                gi1Var = new gi1(editText);
                this.t = gi1Var;
            }
            ph1VarG.j(gi1Var);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
