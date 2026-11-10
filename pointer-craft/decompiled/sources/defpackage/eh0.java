package defpackage;

import android.bluetooth.BluetoothDevice;
import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eh0 implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ClassicHidService t;

    public /* synthetic */ eh0(ClassicHidService classicHidService, byte b) {
        this.j = b;
        this.t = classicHidService;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        ClassicHidService classicHidService = this.t;
        switch (b) {
            case 0:
                classicHidService.E();
                return og5.g;
            case 1:
                return Boolean.valueOf(classicHidService.F);
            default:
                cm1 cm1Var = ClassicHidService.T;
                BluetoothDevice bluetoothDevice = classicHidService.b;
                if (bluetoothDevice != null) {
                    m50.T(mq2.a(classicHidService), null, new xg0(classicHidService, bluetoothDevice, null, (byte) 3), 3);
                }
                classicHidService.E();
                return og5.g;
        }
    }
}
