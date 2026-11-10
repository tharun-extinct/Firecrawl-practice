package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import java.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i62 implements my1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ short m;
    public final /* synthetic */ BluetoothAdapter t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i62(int i, int i2, BluetoothAdapter bluetoothAdapter) {
        this.j = (byte) 0;
        this.a = i;
        this.t = bluetoothAdapter;
        this.m = i2;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        Class cls = Integer.TYPE;
        short s = this.m;
        byte b2 = this.a;
        BluetoothAdapter bluetoothAdapter = this.t;
        switch (b) {
            case 0:
                if (b2 == 23 && (Build.VERSION.SDK_INT < 33 || ch6.r(bluetoothAdapter, "setDiscoverableTimeout", pw5.k(new fp3(al0.o(), Duration.ofSeconds(s)))) == null)) {
                    cls.getClass();
                    ch6.r(bluetoothAdapter, "setDiscoverableTimeout", pw5.k(new fp3(cls, Integer.valueOf(s))));
                }
                cls.getClass();
                return ch6.r(bluetoothAdapter, "setScanMode", pw5.k(new fp3(cls, Integer.valueOf(b2))));
            case 1:
                cls.getClass();
                return ch6.r(bluetoothAdapter, "setScanMode", pw5.d(new fp3(cls, Integer.valueOf(b2)), new fp3(cls, Integer.valueOf(s))));
            default:
                cls.getClass();
                fp3 fp3Var = new fp3(cls, Integer.valueOf(b2));
                Class cls2 = Long.TYPE;
                cls2.getClass();
                return ch6.r(bluetoothAdapter, "setScanMode", pw5.d(fp3Var, new fp3(cls2, Long.valueOf(((long) s) * 1000))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i62(BluetoothAdapter bluetoothAdapter, int i, int i2, byte b) {
        this.j = b;
        this.t = bluetoothAdapter;
        this.a = i;
        this.m = i2;
    }
}
