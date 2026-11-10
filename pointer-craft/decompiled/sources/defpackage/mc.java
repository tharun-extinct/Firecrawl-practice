package defpackage;

import android.bluetooth.BluetoothHidDevice;
import android.bluetooth.BluetoothHidDeviceAppQosSettings;
import android.bluetooth.BluetoothHidDeviceAppSdpSettings;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class mc {
    public final BluetoothHidDevice g;
    public final ExecutorService n;
    public final byte[] r;
    public final jy2 v;
    public final pg0 y;

    public mc(BluetoothHidDevice bluetoothHidDevice, pg0 pg0Var, byte[] bArr, ExecutorService executorService, jy2 jy2Var) {
        bArr.getClass();
        jy2Var.getClass();
        this.g = bluetoothHidDevice;
        this.y = pg0Var;
        this.r = bArr;
        this.n = executorService;
        this.v = jy2Var;
    }

    public final boolean g(ji jiVar) {
        pg0 pg0Var = this.y;
        BluetoothHidDeviceAppSdpSettings bluetoothHidDeviceAppSdpSettings = new BluetoothHidDeviceAppSdpSettings(pg0Var.g, pg0Var.y, pg0Var.r, pg0Var.n, this.r);
        BluetoothHidDeviceAppQosSettings bluetoothHidDeviceAppQosSettings = new BluetoothHidDeviceAppQosSettings(1, 800, 32, 2000, -1, -1);
        BluetoothHidDeviceAppQosSettings bluetoothHidDeviceAppQosSettings2 = new BluetoothHidDeviceAppQosSettings(1, 0, 0, 0, -1, -1);
        boolean zRegisterApp = this.g.registerApp(bluetoothHidDeviceAppSdpSettings, bluetoothHidDeviceAppQosSettings2, bluetoothHidDeviceAppQosSettings, this.n, new lc(this, jiVar));
        this.v.y(Boolean.valueOf(zRegisterApp), "register");
        return zRegisterApp;
    }
}
