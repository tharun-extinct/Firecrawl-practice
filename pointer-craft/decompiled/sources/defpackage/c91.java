package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class c91 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ f91 j;

    public c91(f91 f91Var) {
        this.j = f91Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        f91 f91Var = this.j;
        Dialog dialog = f91Var.s0;
        if (dialog != null) {
            f91Var.onCancel(dialog);
        }
    }
}
