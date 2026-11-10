package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public enum er0 {
    Bluetooth(R.string.info_turn_device_off_lag, R.string.info_turn_device_off),
    WifiHotspot(R.string.info_turn_hotspot_off_lag, R.string.info_turn_hotspot_off),
    Wifi24ghz(R.string.info_turn_wifi_off_lag, R.string.info_turn_wifi_off);

    public final int j;
    public final int t;

    er0(int i, int i2) {
        this.j = i;
        this.t = i2;
    }

    public final int g() {
        return this.t;
    }
}
