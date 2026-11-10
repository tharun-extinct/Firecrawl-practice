package defpackage;

import android.bluetooth.BluetoothDevice;
import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes2.dex */
public final class wg0 extends zz4 implements bz1 {
    public final /* synthetic */ boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ClassicHidService i;
    public final /* synthetic */ byte q = 0;
    public final /* synthetic */ BluetoothDevice s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(ClassicHidService classicHidService, BluetoothDevice bluetoothDevice, boolean z, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = classicHidService;
        this.s = bluetoothDevice;
        this.b = z;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        BluetoothDevice bluetoothDevice = this.s;
        boolean z = this.b;
        ClassicHidService classicHidService = this.i;
        switch (b) {
            case 0:
                wg0 wg0Var = new wg0(classicHidService, bluetoothDevice, z, mu0Var);
                wg0Var.c = obj;
                return wg0Var;
            default:
                wg0 wg0Var2 = new wg0(classicHidService, z, bluetoothDevice, mu0Var);
                wg0Var2.c = obj;
                return wg0Var2;
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
        return ((wg0) b(mu0Var, ox0Var)).u(og5Var);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        byte b = this.q;
        Object obj2 = og5.g;
        boolean z = this.b;
        px0 px0Var = px0.j;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z2 = this.w;
                try {
                    if (!z2) {
                        js2.o(obj);
                        ClassicHidService classicHidService = this.i;
                        BluetoothDevice bluetoothDevice = this.s;
                        ng0 ng0Var = classicHidService.H;
                        if (ng0Var != null) {
                            this.c = null;
                            this.w = true;
                            if (ng0Var.g(bluetoothDevice, z, this) == px0Var) {
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
                } catch (SecurityException unused) {
                    return obj2;
                }
            default:
                ox0 ox0Var = (ox0) this.c;
                boolean z3 = this.w;
                if (z3) {
                    if (z3) {
                        js2.o(obj);
                        return obj2;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ClassicHidService classicHidService2 = this.i;
                d44 d44Var = classicHidService2.L;
                n40 n40Var = new n40(0, classicHidService2, ClassicHidService.class, "sinceLastAttemptMs", "sinceLastAttemptMs()Ljava/lang/Long;", 0, (byte) 1);
                BluetoothDevice bluetoothDevice2 = this.s;
                p2 p2Var = new p2(classicHidService2, bluetoothDevice2, (byte) 16);
                eh0 eh0Var = new eh0(classicHidService2, b2);
                k8 k8Var = new k8(classicHidService2, ox0Var, bluetoothDevice2, this.b, (mu0) null);
                eh0 eh0Var2 = new eh0(classicHidService2, (byte) 2);
                h hVar = new h((Object) classicHidService2, (byte) 13);
                d44Var.getClass();
                va5 va5Var = new va5();
                va5Var.g = d44Var;
                va5Var.y = n40Var;
                va5Var.r = p2Var;
                va5Var.n = eh0Var;
                va5Var.v = k8Var;
                va5Var.x = eh0Var2;
                va5Var.l = hVar;
                this.c = null;
                this.w = true;
                return va5Var.v(z, this) == px0Var ? px0Var : obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(ClassicHidService classicHidService, boolean z, BluetoothDevice bluetoothDevice, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = classicHidService;
        this.b = z;
        this.s = bluetoothDevice;
    }
}
