package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class fi1 extends ra {
    public final ei1 J;

    public fi1(TextView textView) {
        this.J = new ei1(textView);
    }

    @Override // defpackage.ra
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        return !ph1.n() ? inputFilterArr : this.J.A(inputFilterArr);
    }

    @Override // defpackage.ra
    public final void Q(boolean z) {
        if (ph1.n()) {
            this.J.Q(z);
        }
    }

    @Override // defpackage.ra
    public final void R(boolean z) {
        boolean zN = ph1.n();
        ei1 ei1Var = this.J;
        if (zN) {
            ei1Var.R(z);
        } else {
            ei1Var.L = z;
        }
    }
}
