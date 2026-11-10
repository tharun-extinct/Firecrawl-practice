package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class lk1 extends DialogFragment {
    public AlertDialog a;
    public Dialog j;
    public DialogInterface.OnCancelListener t;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.t;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.j;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            return alertDialog;
        }
        Activity activity = getActivity();
        jr2.m(activity);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).create();
        this.a = alertDialogCreate;
        return alertDialogCreate;
    }
}
