package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nz5 extends ResultReceiver {
    public final /* synthetic */ q00 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz5(o00 o00Var, Handler handler, q00 q00Var) {
        super(handler);
        this.j = q00Var;
        Objects.requireNonNull(o00Var);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        String str;
        int i2 = i06.g;
        mu0 mu0Var = null;
        ra2 ra2Var = bundle == null ? new ra2(null, 0) : new ra2(bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"), bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0));
        w10 w10Var = this.j.g;
        int i3 = ra2Var.g;
        if (i3 == 0 || i3 != 1 || (str = (String) ra2Var.y) == null) {
            return;
        }
        m50.T(w10Var.t, null, new q(w10Var, str, mu0Var, (byte) 7), 3);
    }
}
