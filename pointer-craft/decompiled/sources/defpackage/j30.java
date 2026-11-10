package defpackage;

import android.bluetooth.BluetoothDevice;
import io.appground.blehid.BleHidService;

/* JADX INFO: loaded from: classes2.dex */
public final class j30 extends zz4 implements bz1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ BleHidService c;
    public final /* synthetic */ BluetoothDevice i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j30(BleHidService bleHidService, BluetoothDevice bluetoothDevice, int i, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = bleHidService;
        this.i = bluetoothDevice;
        this.b = i;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new j30(this.c, this.i, this.b, mu0Var, (byte) 0);
            default:
                return new j30(this.c, this.i, this.b, mu0Var, (byte) 1);
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
        return ((j30) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        int i = this.b;
        BluetoothDevice bluetoothDevice = this.i;
        BleHidService bleHidService = this.c;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    i30 i30Var = new i30(i, (byte) 0);
                    this.w = true;
                    bleHidService.F(bluetoothDevice, i30Var);
                    if (og5Var == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            default:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    i30 i30Var2 = new i30(i, (byte) 1);
                    this.w = true;
                    bleHidService.F(bluetoothDevice, i30Var2);
                    if (og5Var == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z2) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
        }
    }
}
