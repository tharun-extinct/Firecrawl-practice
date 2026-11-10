package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nh0 implements View.OnClickListener {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ nh0(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                rh0 rh0Var = (rh0) obj;
                EditText editText = rh0Var.t;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    rh0Var.t.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                rh0Var.s();
                return;
            case 1:
                ((jf1) obj).h();
                return;
            case 2:
                ((b33) obj).S();
                throw null;
            default:
                jq3 jq3Var = (jq3) obj;
                EditText editText2 = jq3Var.x;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = jq3Var.x;
                boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText4 = jq3Var.x;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    jq3Var.x.setSelection(selectionEnd);
                }
                jq3Var.s();
                return;
        }
    }
}
