package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes2.dex */
public final class hr0 extends zz4 implements bz1 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ qr0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr0(qr0 qr0Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = qr0Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        qr0 qr0Var = this.w;
        switch (b) {
            case 0:
                return new hr0(qr0Var, mu0Var, (byte) 0);
            default:
                return new hr0(qr0Var, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                return ((hr0) b(mu0Var, ox0Var)).u(og5Var);
            default:
                ((hr0) b(mu0Var, ox0Var)).u(og5Var);
                return og5Var;
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        boolean zBooleanValue;
        int frequency;
        BluetoothAdapter adapter;
        byte b = this.q;
        qr0 qr0Var = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                Context context = qr0Var.y;
                BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(BluetoothManager.class);
                Integer num = (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null) ? null : new Integer(adapter.getProfileConnectionState(2));
                if (num != null && num.intValue() == 2) {
                    return er0.Bluetooth;
                }
                WifiManager wifiManager = (WifiManager) context.getSystemService(WifiManager.class);
                if (wifiManager == null) {
                    return null;
                }
                try {
                    Object objInvoke = WifiManager.class.getDeclaredMethod("isWifiApEnabled", null).invoke(wifiManager, null);
                    objInvoke.getClass();
                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                    break;
                } catch (Exception unused) {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    return er0.WifiHotspot;
                }
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo == null || 2412 > (frequency = connectionInfo.getFrequency()) || frequency >= 2485) {
                    return null;
                }
                return er0.Wifi24ghz;
            default:
                js2.o(obj);
                qr0Var.r.n(qr0Var.l());
                return og5.g;
        }
    }
}
