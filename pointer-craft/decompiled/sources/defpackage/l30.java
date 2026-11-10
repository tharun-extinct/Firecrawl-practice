package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import io.appground.blehid.BleHidService;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class l30 extends BluetoothGattServerCallback {
    public final /* synthetic */ BleHidService g;

    public l30(BleHidService bleHidService) {
        this.g = bleHidService;
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] bytes;
        bluetoothDevice.getClass();
        bluetoothGattCharacteristic.getClass();
        UUID uuid = BleHidService.W;
        UUID uuid2 = (UUID) BleHidService.j0.getValue();
        uuid2.getClass();
        boolean zP = yf2.p(bluetoothGattCharacteristic.getUuid(), uuid2);
        byte b = 1;
        BleHidService bleHidService = this.g;
        if (zP && i2 == 0) {
            bleHidService.z.g(bluetoothDevice, "read");
            bleHidService.K(bluetoothDevice).r = true;
            bleHidService.v(bluetoothDevice.getAddress(), true);
            m50.T(mq2.a(bleHidService), null, new f30(bleHidService, bluetoothDevice, null, b), 3);
        }
        UUID uuid3 = bluetoothGattCharacteristic.getUuid();
        if (yf2.p(uuid3, aj6.m())) {
            bytes = new byte[8];
        } else if (yf2.p(uuid3, aj6.q())) {
            byte[] bArr = bleHidService.s().v;
            bytes = pr.R(bArr, i2, bArr.length);
        } else if (yf2.p(uuid3, aj6.t())) {
            bytes = new byte[]{0};
        } else if (yf2.p(uuid3, aj6.a())) {
            bytes = BleHidService.m0;
        } else if (yf2.p(uuid3, aj6.l())) {
            bytes = new byte[]{bleHidService.x()};
        } else if (yf2.p(uuid3, (UUID) BleHidService.b0.getValue())) {
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            bytes = "AppGround".getBytes(charset);
            bytes.getClass();
        } else if (yf2.p(uuid3, (UUID) BleHidService.d0.getValue())) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            bytes = "1".getBytes(charset2);
            bytes.getClass();
        } else if (yf2.p(uuid3, (UUID) BleHidService.c0.getValue())) {
            Charset charset3 = StandardCharsets.UTF_8;
            charset3.getClass();
            bytes = "AppGround".getBytes(charset3);
            bytes.getClass();
        } else {
            bytes = yf2.p(uuid3, (UUID) BleHidService.h0.getValue()) ? new byte[]{1} : new byte[0];
        }
        byte[] bArr2 = bytes;
        BluetoothGattServer bluetoothGattServer = bleHidService.H;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, bArr2);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        bluetoothDevice.getClass();
        bluetoothGattCharacteristic.getClass();
        bArr.getClass();
        if (z2) {
            BluetoothGattServer bluetoothGattServer = this.g.H;
            bluetoothGattServer.getClass();
            bluetoothGattServer.sendResponse(bluetoothDevice, i, 0, 0, new byte[0]);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        bluetoothDevice.getClass();
        String strW = du4.w(i2, "state(", ")");
        BleHidService bleHidService = this.g;
        bleHidService.z.g(bluetoothDevice, strW);
        if (i2 == 0) {
            bleHidService.K(bluetoothDevice).g();
            bleHidService.E();
        }
        if (i2 == 2) {
            bleHidService.D();
            if (bluetoothDevice.getBondState() == 12) {
                bleHidService.Q(bluetoothDevice);
            }
        }
        m50.T(mq2.a(bleHidService), null, new j30(bleHidService, bluetoothDevice, i2, null, (byte) 1), 3);
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        byte[] bArr;
        bluetoothDevice.getClass();
        bluetoothGattDescriptor.getClass();
        UUID uuid = BleHidService.W;
        UUID uuidM = aj6.m();
        uuidM.getClass();
        UUID uuidC = aj6.c();
        uuidC.getClass();
        boolean zM = BleHidService.M(bluetoothGattDescriptor, uuidM, uuidC);
        BleHidService bleHidService = this.g;
        if (zM) {
            bArr = new byte[]{0, 1};
        } else {
            UUID uuidM2 = aj6.m();
            uuidM2.getClass();
            UUID uuidW = aj6.w();
            uuidW.getClass();
            if (!BleHidService.M(bluetoothGattDescriptor, uuidM2, uuidW)) {
                UUID uuidL = aj6.l();
                uuidL.getClass();
                UUID uuidW2 = aj6.w();
                uuidW2.getClass();
                if (!BleHidService.M(bluetoothGattDescriptor, uuidL, uuidW2)) {
                    bArr = new byte[0];
                } else if (bleHidService.K(bluetoothDevice).n) {
                    bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
                    bArr.getClass();
                } else {
                    bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
                    bArr.getClass();
                }
            } else if (bleHidService.K(bluetoothDevice).v) {
                bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
                bArr.getClass();
            } else {
                bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
                bArr.getClass();
            }
        }
        byte[] bArr2 = bArr;
        BluetoothGattServer bluetoothGattServer = bleHidService.H;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, bArr2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        boolean z3;
        bluetoothDevice.getClass();
        bluetoothGattDescriptor.getClass();
        if (bArr != null) {
            z3 = Arrays.equals(bArr, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        }
        UUID uuid = BleHidService.W;
        UUID uuid2 = (UUID) BleHidService.f0.getValue();
        uuid2.getClass();
        o05 o05Var = BleHidService.Z;
        UUID uuid3 = (UUID) o05Var.getValue();
        uuid3.getClass();
        boolean zM = BleHidService.M(bluetoothGattDescriptor, uuid2, uuid3);
        BleHidService bleHidService = this.g;
        if (zM) {
            bleHidService.K(bluetoothDevice).n = z3;
        }
        UUID uuid4 = (UUID) BleHidService.i0.getValue();
        uuid4.getClass();
        UUID uuid5 = (UUID) o05Var.getValue();
        uuid5.getClass();
        if (BleHidService.M(bluetoothGattDescriptor, uuid4, uuid5)) {
            bleHidService.K(bluetoothDevice).r = false;
            bleHidService.K(bluetoothDevice).v = z3;
            bleHidService.I(bluetoothDevice);
        }
        if (z2) {
            BluetoothGattServer bluetoothGattServer = bleHidService.H;
            bluetoothGattServer.getClass();
            bluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, bArr);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onExecuteWrite(BluetoothDevice bluetoothDevice, int i, boolean z) {
        bluetoothDevice.getClass();
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
        bluetoothDevice.getClass();
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public final void onServiceAdded(int i, BluetoothGattService bluetoothGattService) throws InterruptedException {
        bluetoothGattService.getClass();
        BleHidService bleHidService = this.g;
        ConcurrentLinkedQueue concurrentLinkedQueue = bleHidService.N;
        bleHidService.z.y(du4.w(i, "status(", ")"), "service");
        if (i != 0) {
            BluetoothGattServer bluetoothGattServer = bleHidService.H;
            if (bluetoothGattServer != null) {
                bluetoothGattServer.addService(bluetoothGattService);
                return;
            }
            return;
        }
        if (concurrentLinkedQueue.isEmpty()) {
            bleHidService.P();
            return;
        }
        BluetoothGattServer bluetoothGattServer2 = bleHidService.H;
        bluetoothGattServer2.getClass();
        Object objPoll = concurrentLinkedQueue.poll();
        objPoll.getClass();
        bleHidService.H(bluetoothGattServer2, (BluetoothGattService) objPoll);
    }
}
