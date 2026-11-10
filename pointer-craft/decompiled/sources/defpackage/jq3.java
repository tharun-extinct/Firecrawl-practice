package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jq3 extends kj1 {
    public final nh0 l;
    public final int v;
    public EditText x;

    public jq3(jj1 jj1Var, int i) {
        super(jj1Var);
        this.v = R.drawable.design_password_eye;
        this.l = new nh0(this, (byte) 3);
        if (i != 0) {
            this.v = i;
        }
    }

    @Override // defpackage.kj1
    public final boolean m() {
        return true;
    }

    @Override // defpackage.kj1
    public final int n() {
        return this.v;
    }

    @Override // defpackage.kj1
    public final void p() {
        EditText editText = this.x;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.x.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.kj1
    public final boolean q() {
        EditText editText = this.x;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.kj1
    public final int r() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.kj1
    public final void u() {
        EditText editText = this.x;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // defpackage.kj1
    public final void w(EditText editText) {
        this.x = editText;
        s();
    }

    @Override // defpackage.kj1
    public final View.OnClickListener x() {
        return this.l;
    }

    @Override // defpackage.kj1
    public final void y() {
        s();
    }
}
