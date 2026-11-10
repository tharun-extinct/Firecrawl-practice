package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.g;

/* JADX INFO: loaded from: classes2.dex */
public final class qu5 extends g {
    @Override // com.google.android.gms.common.internal.g
    public final String a() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // com.google.android.gms.common.internal.g
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof ov5 ? (ov5) iInterfaceQueryLocalInterface : new ov5(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", (byte) 0);
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
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.g
    public final int x() {
        return 253600000;
    }
}
