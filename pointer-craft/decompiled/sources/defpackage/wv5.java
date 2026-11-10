package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.g;

/* JADX INFO: loaded from: classes2.dex */
public final class wv5 extends g {
    public final f35 e;

    public wv5(Context context, Looper looper, rr rrVar, f35 f35Var, su5 su5Var, su5 su5Var2) {
        super(context, looper, 270, rrVar, su5Var, su5Var2);
        this.e = f35Var;
    }

    @Override // com.google.android.gms.common.internal.g
    public final String a() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.g
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof rv5 ? (rv5) iInterfaceQueryLocalInterface : new rv5(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 0);
    }

    @Override // com.google.android.gms.common.internal.g
    public final boolean m() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.g
    public final tn1[] n() {
        return mf6.r;
    }

    @Override // com.google.android.gms.common.internal.g
    public final String t() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.g
    public final Bundle v() {
        f35 f35Var = this.e;
        f35Var.getClass();
        Bundle bundle = new Bundle();
        String str = f35Var.y;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.g
    public final int x() {
        return 203400000;
    }
}
