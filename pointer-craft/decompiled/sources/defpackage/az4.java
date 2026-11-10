package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public class az4 extends f91 {
    public Dialog x0;
    public DialogInterface.OnCancelListener y0;
    public AlertDialog z0;

    @Override // defpackage.f91
    public final Dialog R() {
        Dialog dialog = this.x0;
        if (dialog != null) {
            return dialog;
        }
        this.o0 = false;
        AlertDialog alertDialog = this.z0;
        if (alertDialog != null) {
            return alertDialog;
        }
        Context contextM = m();
        jr2.m(contextM);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(contextM).create();
        this.z0 = alertDialogCreate;
        return alertDialogCreate;
    }

    @Override // defpackage.f91, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.y0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
