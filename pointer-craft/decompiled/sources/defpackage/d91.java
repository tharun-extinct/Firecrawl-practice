package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class d91 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ f91 j;

    public d91(f91 f91Var) {
        this.j = f91Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        f91 f91Var = this.j;
        Dialog dialog = f91Var.s0;
        if (dialog != null) {
            f91Var.onDismiss(dialog);
        }
    }
}
