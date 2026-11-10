package defpackage;

import android.bluetooth.BluetoothDevice;
import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes2.dex */
public final class xg0 extends zz4 implements bz1 {
    public final /* synthetic */ ClassicHidService c;
    public final /* synthetic */ BluetoothDevice i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg0(ClassicHidService classicHidService, BluetoothDevice bluetoothDevice, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = classicHidService;
        this.i = bluetoothDevice;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        BluetoothDevice bluetoothDevice = this.i;
        ClassicHidService classicHidService = this.c;
        switch (b) {
            case 0:
                return new xg0(classicHidService, bluetoothDevice, mu0Var, (byte) 0);
            case 1:
                return new xg0(classicHidService, bluetoothDevice, mu0Var, (byte) 1);
            case 2:
                return new xg0(classicHidService, bluetoothDevice, mu0Var, (byte) 2);
            case 3:
                return new xg0(classicHidService, bluetoothDevice, mu0Var, (byte) 3);
            case 4:
                return new xg0(classicHidService, bluetoothDevice, mu0Var, (byte) 4);
            default:
                return new xg0(classicHidService, bluetoothDevice, mu0Var, (byte) 5);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((xg0) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        BluetoothDevice bluetoothDevice = this.i;
        ClassicHidService classicHidService = this.c;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (!z) {
                    js2.o(obj);
                    m9 m9Var = new m9((byte) 22);
                    this.w = true;
                    classicHidService.F(bluetoothDevice, m9Var);
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
                ng0 ng0Var = classicHidService.H;
                if (ng0Var != null) {
                    ng0Var.y(bluetoothDevice);
                }
                return og5Var;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    m9 m9Var2 = new m9((byte) 23);
                    this.w = true;
                    classicHidService.F(bluetoothDevice, m9Var2);
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
            case 2:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    m9 m9Var3 = new m9((byte) 24);
                    this.w = true;
                    classicHidService.F(bluetoothDevice, m9Var3);
                    if (og5Var == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z3) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 3:
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    m9 m9Var4 = new m9((byte) 25);
                    this.w = true;
                    classicHidService.F(bluetoothDevice, m9Var4);
                    if (og5Var == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z4) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            case 4:
                boolean z5 = this.w;
                if (!z5) {
                    js2.o(obj);
                    m9 m9Var5 = new m9((byte) 26);
                    this.w = true;
                    classicHidService.F(bluetoothDevice, m9Var5);
                    if (og5Var == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z5) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
            default:
                boolean z6 = this.w;
                if (!z6) {
                    js2.o(obj);
                    m9 m9Var6 = new m9((byte) 27);
                    this.w = true;
                    classicHidService.F(bluetoothDevice, m9Var6);
                    if (og5Var == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z6) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                return og5Var;
        }
    }
}
