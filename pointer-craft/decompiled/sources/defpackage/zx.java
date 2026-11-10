package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class zx implements TextWatcher {
    public final /* synthetic */ gy j;

    public zx(gy gyVar) {
        this.j = gyVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        int length = editable.length();
        gy gyVar = this.j;
        tw1 tw1Var = gyVar.j0;
        if (length > 0) {
            tw1Var.getClass();
            tw1Var.v.setEndIconDrawable(gyVar.N().getDrawable(R.drawable.ic_baseline_send_24));
        } else {
            tw1Var.getClass();
            tw1Var.v.setEndIconDrawable(gyVar.N().getDrawable(R.drawable.ic_content_paste_24px));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
