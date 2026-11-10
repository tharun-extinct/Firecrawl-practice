package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appground.blehid.BleHidService;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class k30 extends BroadcastReceiver {
    public final /* synthetic */ byte g;
    public final /* synthetic */ BleHidService y;

    public /* synthetic */ k30(BleHidService bleHidService, byte b) {
        this.g = b;
        this.y = bleHidService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws InterruptedException {
        d30 d30Var;
        switch (this.g) {
            case 0:
                BleHidService bleHidService = this.y;
                jy2 jy2Var = bleHidService.z;
                intent.getClass();
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                String action = intent.getAction();
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode == -301431627) {
                        if (action.equals("android.bluetooth.device.action.ACL_CONNECTED") && bluetoothDevice != null) {
                            jy2Var.g(bluetoothDevice, "acl(1)");
                        }
                        break;
                    } else {
                        mu0 mu0Var = null;
                        if (iHashCode == 1821585647) {
                            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED") && bluetoothDevice != null) {
                                jy2Var.g(bluetoothDevice, "acl(0)");
                                if (bleHidService.K(bluetoothDevice).r) {
                                    bleHidService.K(bluetoothDevice);
                                    bleHidService.K(bluetoothDevice).r = false;
                                    xt2 xt2VarA = mq2.a(bleHidService);
                                    x21 x21Var = na1.g;
                                    m50.T(xt2VarA, c21.a, new e30(bleHidService, mu0Var, (byte) 1), 2);
                                }
                            }
                            break;
                        } else if (iHashCode == 2116862345 && action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED") && bluetoothDevice != null) {
                            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
                            intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", Integer.MIN_VALUE);
                            jy2Var.g(bluetoothDevice, "bond(" + intExtra + ")");
                            m50.T(mq2.a(bleHidService), null, new j30(bleHidService, bluetoothDevice, intExtra, mu0Var, (byte) 0), 3);
                            if (intExtra == 12) {
                                bleHidService.K(bluetoothDevice);
                                if (bleHidService.H != null) {
                                    bleHidService.Q(bluetoothDevice);
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                BleHidService bleHidService2 = this.y;
                jy2 jy2Var2 = bleHidService2.z;
                intent.getClass();
                String action2 = intent.getAction();
                if (action2 != null && action2.hashCode() == -1530327060 && action2.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    if (intExtra2 == 10) {
                        jy2Var2.y("off", "bt");
                        bleHidService2.I = null;
                        Iterator it = bleHidService2.K.entrySet().iterator();
                        while (it.hasNext()) {
                            ((vp0) ((Map.Entry) it.next()).getValue()).y = false;
                        }
                        break;
                    } else if (intExtra2 == 12) {
                        jy2Var2.y("on", "bt");
                        bleHidService2.L();
                        break;
                    } else if (intExtra2 == 13) {
                        UUID uuid = BleHidService.W;
                        BluetoothLeAdvertiser bluetoothLeAdvertiser = bleHidService2.I;
                        if (bluetoothLeAdvertiser != null && (d30Var = bleHidService2.J) != null) {
                            try {
                                bluetoothLeAdvertiser.stopAdvertising(d30Var);
                                de4 de4Var = de4.j;
                                bleHidService2.u = de4Var;
                                rv rvVar = bleHidService2.a;
                                if (rvVar != null) {
                                    ((ew4) rvVar.a).m(null, de4Var);
                                }
                                break;
                            } catch (Exception unused) {
                            }
                            bleHidService2.J = null;
                        }
                        BluetoothGattServer bluetoothGattServer = bleHidService2.H;
                        if (bluetoothGattServer != null) {
                            bluetoothGattServer.close();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
