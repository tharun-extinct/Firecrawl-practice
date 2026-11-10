package defpackage;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import android.util.Log;
import io.appground.blehid.BleHidService;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class d30 extends AdvertiseCallback {
    public final /* synthetic */ BleHidService g;

    public d30(BleHidService bleHidService) {
        this.g = bleHidService;
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int i) {
        super.onStartFailure(i);
        UUID uuid = BleHidService.W;
        Log.i("BleHidService", "Advertising failed");
        String strW = du4.w(i, "error(", ")");
        BleHidService bleHidService = this.g;
        bleHidService.z.y(strW, "adv");
        bleHidService.A(ok4.t);
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        advertiseSettings.getClass();
        super.onStartSuccess(advertiseSettings);
        dx4 dx4Var = dx4.g;
        BleHidService bleHidService = this.g;
        bleHidService.C(dx4Var);
        bleHidService.z.y("success", "adv");
        UUID uuid = BleHidService.W;
        Log.i("BleHidService", "Advertising successfully started");
    }
}
