package defpackage;

import android.bluetooth.BluetoothDevice;
import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes2.dex */
public final class bh0 extends zz4 implements bz1 {
    public final /* synthetic */ BluetoothDevice b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ClassicHidService i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh0(ClassicHidService classicHidService, BluetoothDevice bluetoothDevice, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = classicHidService;
        this.b = bluetoothDevice;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        BluetoothDevice bluetoothDevice = this.b;
        ClassicHidService classicHidService = this.i;
        switch (b) {
            case 0:
                bh0 bh0Var = new bh0(classicHidService, bluetoothDevice, mu0Var, (byte) 0);
                bh0Var.c = obj;
                return bh0Var;
            default:
                bh0 bh0Var2 = new bh0(classicHidService, bluetoothDevice, mu0Var, (byte) 1);
                bh0Var2.c = obj;
                return bh0Var2;
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
        return ((bh0) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        Object obj2 = og5.g;
        BluetoothDevice bluetoothDevice = this.b;
        ClassicHidService classicHidService = this.i;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                ox0 ox0Var = (ox0) this.c;
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    this.c = ox0Var;
                    this.w = true;
                    if (yf2.e(1000L, this) == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                try {
                    cm1 cm1Var = ClassicHidService.T;
                    classicHidService.I(bluetoothDevice, false);
                    return obj2;
                } catch (SecurityException unused) {
                    return obj2;
                }
            default:
                boolean z2 = this.w;
                try {
                    if (!z2) {
                        js2.o(obj);
                        ng0 ng0Var = classicHidService.H;
                        if (ng0Var != null) {
                            this.c = null;
                            this.w = true;
                            if (ng0Var.g(bluetoothDevice, false, this) == px0Var) {
                                obj2 = px0Var;
                            }
                        }
                    } else {
                        if (!z2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj);
                    }
                    return obj2;
                } catch (SecurityException unused2) {
                    return obj2;
                }
        }
    }
}
