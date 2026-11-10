package defpackage;

import android.bluetooth.BluetoothProfile;

/* JADX INFO: loaded from: classes2.dex */
public final class vg0 extends zz4 implements bz1 {
    public final /* synthetic */ byte q;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg0(int i, mu0 mu0Var, byte b) {
        super(i, mu0Var);
        this.q = b;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                vg0 vg0Var = new vg0(2, mu0Var, (byte) 0);
                vg0Var.w = obj;
                return vg0Var;
            case 1:
                vg0 vg0Var2 = new vg0(2, mu0Var, (byte) 1);
                vg0Var2.w = obj;
                return vg0Var2;
            case 2:
                vg0 vg0Var3 = new vg0(2, mu0Var, (byte) 2);
                vg0Var3.w = obj;
                return vg0Var3;
            case 3:
                vg0 vg0Var4 = new vg0(2, mu0Var, (byte) 3);
                vg0Var4.w = obj;
                return vg0Var4;
            default:
                vg0 vg0Var5 = new vg0(2, mu0Var, (byte) 4);
                vg0Var5.w = obj;
                return vg0Var5;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((vg0) b((mu0) obj2, (yf0) obj)).u(og5Var);
            case 1:
                return ((vg0) b((mu0) obj2, (ek2) obj)).u(og5Var);
            case 2:
                return ((vg0) b((mu0) obj2, (g61) obj)).u(og5Var);
            case 3:
                return ((vg0) b((mu0) obj2, (c64) obj)).u(og5Var);
            default:
                return ((vg0) b((mu0) obj2, (BluetoothProfile) obj)).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        boolean z = false;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                js2.o(obj);
                return Boolean.valueOf(((yf0) obj2).g);
            case 1:
                ek2 ek2Var = (ek2) obj2;
                js2.o(obj);
                return Boolean.valueOf(ek2Var != null);
            case 2:
                g61 g61Var = (g61) obj2;
                js2.o(obj);
                if (g61Var != null && g61Var.l()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                c64 c64Var = (c64) obj2;
                js2.o(obj);
                if (c64Var != null && !c64Var.g) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                BluetoothProfile bluetoothProfile = (BluetoothProfile) obj2;
                js2.o(obj);
                return Boolean.valueOf(bluetoothProfile != null);
        }
    }
}
