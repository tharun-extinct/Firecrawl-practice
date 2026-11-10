package defpackage;

import android.bluetooth.BluetoothAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class gh0 extends zz4 implements bz1 {
    public final /* synthetic */ byte q;
    public final /* synthetic */ BluetoothAdapter w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh0(BluetoothAdapter bluetoothAdapter, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.w = bluetoothAdapter;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        BluetoothAdapter bluetoothAdapter = this.w;
        switch (b) {
            case 0:
                return new gh0(bluetoothAdapter, mu0Var, (byte) 0);
            default:
                return new gh0(bluetoothAdapter, mu0Var, (byte) 1);
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
                break;
        }
        return ((gh0) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        BluetoothAdapter bluetoothAdapter = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                return Boolean.valueOf(bluetoothAdapter.cancelDiscovery());
            default:
                js2.o(obj);
                return ch6.n(23, 300, bluetoothAdapter);
        }
    }
}
