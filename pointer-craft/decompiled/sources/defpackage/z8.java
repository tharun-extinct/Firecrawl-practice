package defpackage;

import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes.dex */
public final class z8 implements dv {
    public final ba g;
    public final AutofillId r;
    public final iv y;

    public z8(ba baVar, iv ivVar) {
        this.g = baVar;
        this.y = ivVar;
        baVar.setImportantForAutofill(1);
        q64 q64VarP = jr2.p(baVar);
        AutofillId autofillIdR = q64VarP != null ? y8.r(q64VarP.t) : null;
        if (autofillIdR != null) {
            this.r = autofillIdR;
        } else {
            mc2.r("Required value was null.");
            l0.x();
            throw null;
        }
    }
}
