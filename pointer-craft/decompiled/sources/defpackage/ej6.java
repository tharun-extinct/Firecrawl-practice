package defpackage;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class ej6 {
    public final int g;
    public final Bundle r;
    public final x25 y = new x25();

    public ej6(int i, Bundle bundle) {
        this.g = i;
        this.r = bundle;
    }

    public final void g(bt4 bt4Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bt4Var);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 14);
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.y.g(bt4Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=1 id=");
        sb.append(this.g);
        sb.append(" oneWay=false}");
        return sb.toString();
    }
}
