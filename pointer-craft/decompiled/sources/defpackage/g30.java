package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import io.appground.blehid.BleHidService;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class g30 extends BluetoothGattCallback {
    public final /* synthetic */ BleHidService g;

    public g30(BleHidService bleHidService) {
        this.g = bleHidService;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        bluetoothGatt.getClass();
        bluetoothGattCharacteristic.getClass();
        bArr.getClass();
        if (i == 0 && yf2.p(bluetoothGattCharacteristic.getUuid(), BleHidService.X)) {
            this.g.N(bluetoothGatt, new String(bArr, od0.g));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        BluetoothDevice device;
        BluetoothGattServer bluetoothGattServer;
        if (bluetoothGatt == null || (device = bluetoothGatt.getDevice()) == null) {
            return;
        }
        String strQ = du4.q(i, i2, "gatt(", "|", ")");
        BleHidService bleHidService = this.g;
        bleHidService.z.g(device, strQ);
        byte b = 0;
        Object[] objArr = i == 0 && i2 == 2;
        Object[] objArr2 = device.getBondState() == 12;
        if (objArr == true && objArr2 == true) {
            m50.T(mq2.a(bleHidService), null, new f30(bleHidService, device, 0 == true ? 1 : 0, b), 3);
            if (bleHidService.R && (bluetoothGattServer = bleHidService.H) != null) {
                bleHidService.H(bluetoothGattServer, new BluetoothGattService(UUID.randomUUID(), 0));
            }
            String name = device.getName();
            if (name == null || tx4.Y(name)) {
                bluetoothGatt.discoverServices();
                return;
            }
            String address = device.getAddress();
            BluetoothDevice bluetoothDevice = bleHidService.b;
            if (yf2.p(address, bluetoothDevice != null ? bluetoothDevice.getAddress() : null)) {
                bluetoothGatt.requestConnectionPriority(1);
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        BluetoothDevice device;
        String address = (bluetoothGatt == null || (device = bluetoothGatt.getDevice()) == null) ? null : device.getAddress();
        BluetoothDevice bluetoothDevice = this.g.b;
        if (yf2.p(address, bluetoothDevice != null ? bluetoothDevice.getAddress() : null) && bluetoothGatt != null) {
            bluetoothGatt.requestConnectionPriority(1);
        }
        if (i == 0) {
            BluetoothGattService service = bluetoothGatt != null ? bluetoothGatt.getService(BleHidService.W) : null;
            BluetoothGattCharacteristic characteristic = service != null ? service.getCharacteristic(BleHidService.X) : null;
            if (characteristic != null) {
                bluetoothGatt.readCharacteristic(characteristic);
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (i == 0) {
            if (yf2.p(bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getUuid() : null, BleHidService.X)) {
                this.g.N(bluetoothGatt, bluetoothGattCharacteristic.getStringValue(0));
            }
        }
    }
}
