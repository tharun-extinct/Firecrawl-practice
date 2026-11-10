package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import io.appground.blehid.ClassicHidService;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qg0 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ClassicHidService t;

    public /* synthetic */ qg0(ClassicHidService classicHidService, byte b) {
        this.j = b;
        this.t = classicHidService;
    }

    @Override // defpackage.my1
    public final Object g() {
        Object g84Var;
        byte b = this.j;
        ClassicHidService classicHidService = this.t;
        switch (b) {
            case 0:
                cm1 cm1Var = ClassicHidService.T;
                mu0 mu0Var = null;
                try {
                    BluetoothAdapter bluetoothAdapterI = classicHidService.i();
                    g84Var = bluetoothAdapterI != null ? bluetoothAdapterI.getBondedDevices() : null;
                    break;
                } catch (Throwable th) {
                    g84Var = new g84(th);
                }
                if (g84Var instanceof g84) {
                    g84Var = null;
                }
                Set set = (Set) g84Var;
                if (set != null) {
                    m50.T(mq2.a(classicHidService), null, new zh(set, classicHidService, mu0Var, (byte) 6), 3);
                }
                BluetoothDevice remoteDevice = classicHidService.b;
                if (remoteDevice == null) {
                    String string = classicHidService.getSharedPreferences("server_settings", 0).getString("last_used_device", null);
                    remoteDevice = string == null ? null : classicHidService.i().getRemoteDevice(string);
                }
                if (remoteDevice != null) {
                    classicHidService.e(remoteDevice);
                    m50.T(mq2.a(classicHidService), null, new bh0(classicHidService, remoteDevice, mu0Var, (byte) 1), 3);
                }
                classicHidService.C(dx4.g);
                return og5.g;
            case 1:
                cm1 cm1Var2 = ClassicHidService.T;
                classicHidService.q();
                return og5.g;
            case 2:
                cm1 cm1Var3 = ClassicHidService.T;
                try {
                    classicHidService.J();
                    break;
                } catch (SecurityException unused) {
                }
                return og5.g;
            default:
                cm1 cm1Var4 = ClassicHidService.T;
                return Boolean.valueOf(classicHidService.F);
        }
    }
}
