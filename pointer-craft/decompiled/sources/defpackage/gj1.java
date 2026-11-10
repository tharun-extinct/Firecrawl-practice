package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class gj1 extends r85 {
    public final /* synthetic */ jj1 j;

    public gj1(jj1 jj1Var) {
        this.j = jj1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.j.y().g();
    }

    @Override // defpackage.r85, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.j.y().y();
    }
}
