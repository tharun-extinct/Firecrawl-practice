package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class j06 extends ResultReceiver {
    public final /* synthetic */ x25 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j06(Handler handler, x25 x25Var) {
        super(handler);
        this.j = x25Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.j.g.q(null);
    }
}
