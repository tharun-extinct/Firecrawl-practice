package defpackage;

import android.companion.CompanionDeviceManager$Callback;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes2.dex */
public final class bl0 extends CompanionDeviceManager$Callback {
    public final /* synthetic */ cl0 g;

    public bl0(cl0 cl0Var) {
        this.g = cl0Var;
    }

    public final void onDeviceFound(IntentSender intentSender) {
        intentSender.getClass();
        e71 e71Var = e71.g;
        cl0 cl0Var = this.g;
        cl0Var.g.setValue(e71Var);
        try {
            x03 x03Var = cl0Var.r;
            if (x03Var != null) {
                x03Var.g(new te2(intentSender, null, 0, 0));
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            cl0Var.g.setValue(new d71(message));
        }
    }

    public final void onFailure(CharSequence charSequence) {
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        this.g.g.setValue(new d71(string));
    }
}
