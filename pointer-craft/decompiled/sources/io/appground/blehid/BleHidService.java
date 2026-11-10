package io.appground.blehid;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ParcelUuid;
import defpackage.aj6;
import defpackage.c;
import defpackage.ch6;
import defpackage.d30;
import defpackage.de4;
import defpackage.e30;
import defpackage.e62;
import defpackage.ew4;
import defpackage.g30;
import defpackage.h30;
import defpackage.h6;
import defpackage.js2;
import defpackage.jy2;
import defpackage.k30;
import defpackage.l0;
import defpackage.l30;
import defpackage.m50;
import defpackage.mq2;
import defpackage.mu0;
import defpackage.o05;
import defpackage.og5;
import defpackage.ok4;
import defpackage.ou0;
import defpackage.p40;
import defpackage.px0;
import defpackage.q;
import defpackage.rv;
import defpackage.s54;
import defpackage.tx4;
import defpackage.v13;
import defpackage.vp0;
import defpackage.yf2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class BleHidService extends e62 {
    public static final UUID W;
    public static final UUID X;
    public static final o05 Y;
    public static final o05 Z;
    public static final o05 a0;
    public static final o05 b0;
    public static final o05 c0;
    public static final o05 d0;
    public static final o05 e0;
    public static final o05 f0;
    public static final o05 g0;
    public static final o05 h0;
    public static final o05 i0;
    public static final o05 j0;
    public static final o05 k0;
    public static final o05 l0;
    public static final byte[] m0;
    public BluetoothGattServer H;
    public BluetoothLeAdvertiser I;
    public d30 J;
    public BluetoothGattCharacteristic L;
    public BluetoothGattCharacteristic M;
    public boolean O;
    public final boolean Q;
    public final boolean R;
    public final g30 S;
    public final l30 T;
    public final k30 U;
    public final k30 V;
    public final LinkedHashMap K = new LinkedHashMap();
    public final ConcurrentLinkedQueue N = new ConcurrentLinkedQueue();
    public boolean P = true;

    static {
        new aj6((byte) 13);
        W = UUID.fromString("00001800-0000-1000-8000-00805f9b34fb");
        X = UUID.fromString("00002a00-0000-1000-8000-00805f9b34fb");
        Y = new o05(new h6((byte) 6));
        Z = new o05(new h6((byte) 16));
        a0 = new o05(new h6((byte) 17));
        b0 = new o05(new h6((byte) 18));
        c0 = new o05(new h6((byte) 19));
        d0 = new o05(new h6((byte) 7));
        e0 = new o05(new h6((byte) 8));
        f0 = new o05(new h6((byte) 9));
        g0 = new o05(new h6((byte) 10));
        h0 = new o05(new h6((byte) 11));
        i0 = new o05(new h6((byte) 12));
        j0 = new o05(new h6((byte) 13));
        k0 = new o05(new h6((byte) 14));
        l0 = new o05(new h6((byte) 15));
        m0 = new byte[]{17, 1, 0, 1};
    }

    public BleHidService() {
        this.Q = Build.VERSION.SDK_INT <= 32;
        this.R = true;
        this.S = new g30(this);
        this.T = new l30(this);
        this.U = new k30(this, (byte) 1);
        this.V = new k30(this, (byte) 0);
    }

    public static boolean M(BluetoothGattDescriptor bluetoothGattDescriptor, UUID uuid, UUID uuid2) {
        return yf2.p(bluetoothGattDescriptor.getCharacteristic().getUuid(), uuid) && yf2.p(bluetoothGattDescriptor.getUuid(), uuid2);
    }

    public final void H(BluetoothGattServer bluetoothGattServer, BluetoothGattService bluetoothGattService) {
        jy2 jy2Var = this.z;
        for (int i = 0; i < 5; i++) {
            try {
                if (bluetoothGattServer.addService(bluetoothGattService)) {
                    return;
                } else {
                    jy2Var.y("0", "service");
                }
            } catch (Exception unused) {
                jy2Var.y("error", "service");
            }
        }
    }

    public final void I(BluetoothDevice bluetoothDevice) {
        if (K(bluetoothDevice).r() != null) {
            return;
        }
        K(bluetoothDevice).x(bluetoothDevice.connectGatt(getApplicationContext(), false, this.S));
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.L;
        if (bluetoothGattCharacteristic != null) {
            bluetoothGattCharacteristic.setValue(new byte[]{2, 0, 0, 0, 0, 0});
            try {
                BluetoothGattServer bluetoothGattServer = this.H;
                if (bluetoothGattServer != null) {
                    bluetoothGattServer.notifyCharacteristicChanged(bluetoothDevice, bluetoothGattCharacteristic, false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void J(BluetoothDevice bluetoothDevice) {
        Boolean boolValueOf;
        p40 p40Var = p40.a;
        p40 p40Var2 = p40.t;
        try {
            List<BluetoothDevice> connectedDevices = b().getConnectedDevices(8);
            if (connectedDevices != null) {
                for (BluetoothDevice bluetoothDevice2 : connectedDevices) {
                    int i = yf2.p(bluetoothDevice2.getAddress(), bluetoothDevice.getAddress()) ? 1 : 2;
                    BluetoothGatt bluetoothGattR = K(bluetoothDevice2).r();
                    if (bluetoothGattR != null) {
                        bluetoothGattR.requestConnectionPriority(i);
                    }
                }
            }
        } catch (SecurityException unused) {
        }
        s54 s54Var = new s54();
        s54Var.j = b().getConnectionState(bluetoothDevice, 8);
        int bondState = bluetoothDevice.getBondState();
        jy2 jy2Var = this.z;
        mu0 mu0Var = null;
        if (10 == bondState) {
            try {
                if (bluetoothDevice.createBond()) {
                    p40Var2 = p40.j;
                }
            } catch (NullPointerException unused2) {
            } catch (SecurityException unused3) {
                p40Var2 = p40Var;
            }
            jy2Var.y(p40Var2, "bond");
            if (p40Var2 == p40Var) {
                A(ok4.w);
            }
        } else if (s54Var.j == 0) {
            try {
                BluetoothGattServer bluetoothGattServer = this.H;
                boolValueOf = bluetoothGattServer != null ? Boolean.valueOf(bluetoothGattServer.connect(bluetoothDevice, false)) : null;
            } catch (SecurityException unused4) {
            }
            if (yf2.p(boolValueOf, Boolean.TRUE)) {
                s54Var.j = 1;
            }
            jy2Var.y(String.valueOf(boolValueOf), "connect");
        }
        m50.T(mq2.a(this), null, new c(this, bluetoothDevice, s54Var, mu0Var, (byte) 8), 3);
    }

    public final vp0 K(BluetoothDevice bluetoothDevice) {
        LinkedHashMap linkedHashMap = this.K;
        if (linkedHashMap.containsKey(bluetoothDevice)) {
            Object obj = linkedHashMap.get(bluetoothDevice);
            obj.getClass();
            return (vp0) obj;
        }
        vp0 vp0Var = new vp0();
        linkedHashMap.put(bluetoothDevice, vp0Var);
        return vp0Var;
    }

    public final void L() throws InterruptedException {
        if (this.I != null) {
            return;
        }
        BluetoothAdapter bluetoothAdapterI = i();
        BluetoothLeAdvertiser bluetoothLeAdvertiser = bluetoothAdapterI != null ? bluetoothAdapterI.getBluetoothLeAdvertiser() : null;
        this.I = bluetoothLeAdvertiser;
        if (bluetoothLeAdvertiser == null) {
            A(ok4.a);
            return;
        }
        BluetoothAdapter bluetoothAdapterI2 = i();
        boolean z = bluetoothAdapterI2 != null && bluetoothAdapterI2.isMultipleAdvertisementSupported();
        try {
            BluetoothGattServer bluetoothGattServerOpenGattServer = b().openGattServer(this, this.T);
            this.H = bluetoothGattServerOpenGattServer;
            this.z.y("gatt: " + (bluetoothGattServerOpenGattServer != null) + ", mas: " + z, "server");
            BluetoothGattServer bluetoothGattServer = this.H;
            if (bluetoothGattServer == null) {
                A(ok4.t);
                return;
            }
            List<BluetoothGattService> services = bluetoothGattServer.getServices();
            if (services == null || services.size() != 0) {
                P();
                return;
            }
            BluetoothGattServer bluetoothGattServer2 = this.H;
            if (bluetoothGattServer2 != null) {
                bluetoothGattServer2.clearServices();
            }
            BluetoothGattService bluetoothGattService = new BluetoothGattService(aj6.i(), 0);
            while (!bluetoothGattService.addCharacteristic(new BluetoothGattCharacteristic(aj6.a(), 2, 2))) {
            }
            while (!bluetoothGattService.addCharacteristic(new BluetoothGattCharacteristic(aj6.q(), 2, 2))) {
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(aj6.t(), 4, 32);
            bluetoothGattCharacteristic.setWriteType(1);
            while (!bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic)) {
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(aj6.m(), 26, 34);
            BluetoothGattDescriptor bluetoothGattDescriptor = new BluetoothGattDescriptor(aj6.w(), 34);
            bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
            bluetoothGattCharacteristic2.addDescriptor(bluetoothGattDescriptor);
            BluetoothGattDescriptor bluetoothGattDescriptor2 = new BluetoothGattDescriptor(aj6.c(), 2);
            bluetoothGattDescriptor2.setValue(new byte[]{0, 1});
            bluetoothGattCharacteristic2.addDescriptor(bluetoothGattDescriptor2);
            while (!bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic2)) {
            }
            this.L = bluetoothGattCharacteristic2;
            ConcurrentLinkedQueue concurrentLinkedQueue = this.N;
            concurrentLinkedQueue.offer(bluetoothGattService);
            BluetoothGattService bluetoothGattService2 = new BluetoothGattService((UUID) a0.getValue(), 0);
            while (!bluetoothGattService2.addCharacteristic(new BluetoothGattCharacteristic((UUID) b0.getValue(), 2, 2))) {
            }
            while (!bluetoothGattService2.addCharacteristic(new BluetoothGattCharacteristic((UUID) c0.getValue(), 2, 2))) {
            }
            while (!bluetoothGattService2.addCharacteristic(new BluetoothGattCharacteristic((UUID) d0.getValue(), 2, 2))) {
            }
            concurrentLinkedQueue.offer(bluetoothGattService2);
            BluetoothGattService bluetoothGattService3 = new BluetoothGattService((UUID) e0.getValue(), 0);
            BluetoothGattCharacteristic bluetoothGattCharacteristic3 = new BluetoothGattCharacteristic(aj6.l(), 18, 1);
            while (!bluetoothGattCharacteristic3.addDescriptor(new BluetoothGattDescriptor(aj6.w(), 17))) {
            }
            while (!bluetoothGattService3.addCharacteristic(bluetoothGattCharacteristic3)) {
            }
            this.M = bluetoothGattCharacteristic3;
            concurrentLinkedQueue.offer(bluetoothGattService3);
            BluetoothGattServer bluetoothGattServer3 = this.H;
            bluetoothGattServer3.getClass();
            Object objPoll = concurrentLinkedQueue.poll();
            objPoll.getClass();
            H(bluetoothGattServer3, (BluetoothGattService) objPoll);
        } catch (SecurityException unused) {
            A(ok4.w);
        }
    }

    public final void N(BluetoothGatt bluetoothGatt, String str) {
        BluetoothDevice device;
        if (str == null || tx4.Y(str) || bluetoothGatt == null || (device = bluetoothGatt.getDevice()) == null) {
            return;
        }
        String address = device.getAddress();
        if (address != null) {
            Object value = this.o.getValue();
            value.getClass();
            ((SharedPreferences) value).edit().putString(address, str).apply();
        }
        m50.T(mq2.a(this), null, new c(this, device, str, null, (byte) 9), 3);
    }

    public final void O(boolean z) {
        if (z != this.P) {
            BluetoothDevice bluetoothDevice = this.b;
            if (bluetoothDevice != null && b().getConnectionState(bluetoothDevice, 8) == 2) {
                m50.T(mq2.a(this), null, new e30(this, null, (byte) 0), 3);
            }
            this.z.y(Boolean.valueOf(z), "refresh");
        }
        this.P = z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    public final void P() throws InterruptedException {
        String name;
        int length;
        if (this.J != null || this.I == null) {
            return;
        }
        BluetoothAdapter bluetoothAdapterI = i();
        mu0 mu0Var = null;
        if (bluetoothAdapterI != null) {
            try {
                name = bluetoothAdapterI.getName();
            } catch (SecurityException unused) {
                name = null;
            }
            if (name != null) {
                length = name.length();
            } else {
                length = 0;
            }
        } else {
            length = 0;
        }
        boolean z = length > 22;
        AdvertiseSettings advertiseSettingsBuild = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(3).setConnectable(true).setTimeout(0).build();
        AdvertiseData advertiseDataBuild = new AdvertiseData.Builder().addServiceUuid(ParcelUuid.fromString("00001812-0000-1000-8000-00805f9b34fb")).setIncludeDeviceName(!z).build();
        advertiseDataBuild.getClass();
        AdvertiseData advertiseDataBuild2 = z ? new AdvertiseData.Builder().setIncludeDeviceName(true).build() : null;
        d30 d30Var = new d30(this);
        this.J = d30Var;
        try {
            BluetoothLeAdvertiser bluetoothLeAdvertiser = this.I;
            if (bluetoothLeAdvertiser != null) {
                bluetoothLeAdvertiser.startAdvertising(advertiseSettingsBuild, advertiseDataBuild, advertiseDataBuild2, d30Var);
            }
            de4 de4Var = de4.a;
            this.u = de4Var;
            rv rvVar = this.a;
            if (rvVar != null) {
                ((ew4) rvVar.a).m(null, de4Var);
            }
            if (this.H != null) {
                m50.T(mq2.a(this), null, new q(this, mu0Var, (byte) 8), 3);
            }
            BluetoothAdapter bluetoothAdapterI2 = i();
            if (bluetoothAdapterI2 != null) {
                ch6.n(20, 0, bluetoothAdapterI2);
            }
        } catch (Exception unused2) {
            A(ok4.t);
        }
    }

    public final void Q(BluetoothDevice bluetoothDevice) {
        if (!this.P || K(bluetoothDevice).v()) {
            I(bluetoothDevice);
            return;
        }
        K(bluetoothDevice).j(true);
        BluetoothGattServer bluetoothGattServer = this.H;
        bluetoothGattServer.getClass();
        H(bluetoothGattServer, new BluetoothGattService(UUID.randomUUID(), 0));
        BluetoothGattServer bluetoothGattServer2 = this.H;
        if (bluetoothGattServer2 != null) {
            bluetoothGattServer2.cancelConnection(bluetoothDevice);
        }
        this.z.g(bluetoothDevice, "refresh");
    }

    @Override // defpackage.e62
    public final void f(boolean z) {
        BluetoothDevice bluetoothDevice = this.b;
        if (bluetoothDevice != null) {
            J(bluetoothDevice);
        }
    }

    @Override // defpackage.e62
    public final void g(String str) {
        BluetoothDevice remoteDevice;
        B(str);
        BluetoothAdapter bluetoothAdapterI = i();
        if (bluetoothAdapterI != null && (remoteDevice = bluetoothAdapterI.getRemoteDevice(str)) != null) {
            e(remoteDevice);
        }
        j(str);
    }

    @Override // defpackage.e62
    public final void j(String str) {
        BluetoothAdapter bluetoothAdapterI;
        BluetoothDevice remoteDevice;
        if (i() == null || this.H == null || (bluetoothAdapterI = i()) == null || (remoteDevice = bluetoothAdapterI.getRemoteDevice(str)) == null) {
            return;
        }
        J(remoteDevice);
    }

    @Override // defpackage.e62
    public final void m(String str) {
        str.getClass();
        BluetoothAdapter bluetoothAdapterI = i();
        BluetoothDevice remoteDevice = bluetoothAdapterI != null ? bluetoothAdapterI.getRemoteDevice(str) : null;
        BluetoothGattServer bluetoothGattServer = this.H;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.cancelConnection(remoteDevice);
        }
    }

    @Override // defpackage.e62
    public final boolean n(byte b, byte[] bArr) {
        BluetoothDevice bluetoothDevice;
        if (bArr.length != 0) {
            byte[] bArr2 = new byte[bArr.length + 1];
            bArr2[0] = b;
            System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.L;
            if (bluetoothGattCharacteristic != null) {
                bluetoothGattCharacteristic.setValue(bArr2);
                try {
                    BluetoothGattServer bluetoothGattServer = this.H;
                    boolean z = bluetoothGattServer != null && bluetoothGattServer.notifyCharacteristicChanged(this.b, bluetoothGattCharacteristic, false);
                    if (z && (bluetoothDevice = this.b) != null && K(bluetoothDevice).y()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - K(bluetoothDevice).n() > 300000) {
                            K(bluetoothDevice).l(jCurrentTimeMillis);
                            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.M;
                            if (bluetoothGattCharacteristic2 != null) {
                                bluetoothGattCharacteristic2.setValue(new byte[]{x()});
                                try {
                                    BluetoothGattServer bluetoothGattServer2 = this.H;
                                    if (bluetoothGattServer2 != null) {
                                        bluetoothGattServer2.notifyCharacteristicChanged(bluetoothDevice, bluetoothGattCharacteristic2, false);
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    return z;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override // defpackage.e62, defpackage.nu2, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e62.G = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("android.bluetooth.device.action.CLASS_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.device.action.NAME_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.UUID");
        intentFilter.addAction("android.bluetooth.device.action.CONNECTION_ACCESS_REQUEST");
        intentFilter.addAction("android.bluetooth.device.action.CONNECTION_ACCESS_REPLY");
        intentFilter.addAction("android.bluetooth.device.action.CONNECTION_ACCESS_CANCEL");
        intentFilter.addAction("android.bluetooth.device.action.PAIRING_CANCEL");
        registerReceiver(this.V, intentFilter);
        registerReceiver(this.U, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.z.y("ble", "init");
    }

    @Override // defpackage.e62, defpackage.nu2, android.app.Service
    public final void onDestroy() {
        BluetoothAdapter adapter;
        d30 d30Var;
        e62.G = false;
        unregisterReceiver(this.U);
        unregisterReceiver(this.V);
        BluetoothLeAdvertiser bluetoothLeAdvertiser = this.I;
        if (bluetoothLeAdvertiser != null && (d30Var = this.J) != null) {
            try {
                bluetoothLeAdvertiser.stopAdvertising(d30Var);
                de4 de4Var = de4.j;
                this.u = de4Var;
                rv rvVar = this.a;
                if (rvVar != null) {
                    ((ew4) rvVar.a).m(null, de4Var);
                }
            } catch (Exception unused) {
            }
            this.J = null;
        }
        BluetoothGattServer bluetoothGattServer = this.H;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.close();
        }
        LinkedHashMap linkedHashMap = this.K;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v13.h(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ((vp0) entry.getValue()).g();
            linkedHashMap2.put(key, og5.g);
        }
        if (this.O && (adapter = b().getAdapter()) != null) {
            adapter.disable();
        }
        super.onDestroy();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        broadcastReceiver.getClass();
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // defpackage.e62
    public final void w() throws InterruptedException {
        P();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.e62
    public final Object z(ou0 ou0Var) throws InterruptedException {
        h30 h30Var;
        BluetoothAdapter bluetoothAdapterI;
        if (ou0Var instanceof h30) {
            h30Var = (h30) ou0Var;
            int i = h30Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                h30Var.w = i - Integer.MIN_VALUE;
            } else {
                h30Var = new h30(this, ou0Var);
            }
        } else {
            h30Var = new h30(this, ou0Var);
        }
        Object objK = h30Var.m;
        int i2 = h30Var.w;
        if (i2 == 0) {
            js2.o(objK);
            BluetoothAdapter bluetoothAdapterI2 = i();
            if (bluetoothAdapterI2 == null || !bluetoothAdapterI2.isEnabled()) {
                q();
                this.O = true;
            } else if (this.Q) {
                h30Var.w = 1;
                objK = k(h30Var);
                Object obj = px0.j;
                if (objK == obj) {
                    return obj;
                }
            } else {
                L();
            }
            return og5.g;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(objK);
        if (!((Boolean) objK).booleanValue() && (bluetoothAdapterI = i()) != null && bluetoothAdapterI.isEnabled()) {
            L();
        }
        return og5.g;
    }
}
