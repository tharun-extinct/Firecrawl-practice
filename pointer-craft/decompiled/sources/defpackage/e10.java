package defpackage;

import android.bluetooth.BluetoothHidDevice;
import android.bluetooth.BluetoothProfile;

/* JADX INFO: loaded from: classes2.dex */
public final class e10 implements gr1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ gr1 t;

    public /* synthetic */ e10(gr1 gr1Var, byte b) {
        this.j = b;
        this.t = gr1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        d10 d10Var;
        cg0 cg0Var;
        hg0 hg0Var;
        ji5 ji5Var;
        byte b = this.j;
        og5 og5Var = og5.g;
        gr1 gr1Var = this.t;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                if (mu0Var instanceof d10) {
                    d10Var = (d10) mu0Var;
                    int i = d10Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        d10Var.q = i - Integer.MIN_VALUE;
                    } else {
                        d10Var = new d10(this, mu0Var);
                    }
                } else {
                    d10Var = new d10(this, mu0Var);
                }
                Object obj2 = d10Var.m;
                int i2 = d10Var.q;
                if (i2 != 0) {
                    if (i2 == 1) {
                        js2.o(obj2);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj2);
                jz3 jz3Var = (jz3) obj;
                if (jz3Var == null) {
                    return og5Var;
                }
                d10Var.q = 1;
                return gr1Var.c(jz3Var, d10Var) == px0Var ? px0Var : og5Var;
            case 1:
                if (mu0Var instanceof cg0) {
                    cg0Var = (cg0) mu0Var;
                    int i3 = cg0Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        cg0Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        cg0Var = new cg0(this, mu0Var);
                    }
                } else {
                    cg0Var = new cg0(this, mu0Var);
                }
                Object obj3 = cg0Var.m;
                int i4 = cg0Var.q;
                if (i4 != 0) {
                    if (i4 == 1) {
                        js2.o(obj3);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj3);
                if (((yf0) obj).r != 0) {
                    return og5Var;
                }
                cg0Var.q = 1;
                return gr1Var.c(obj, cg0Var) == px0Var ? px0Var : og5Var;
            case 2:
                if (mu0Var instanceof hg0) {
                    hg0Var = (hg0) mu0Var;
                    int i5 = hg0Var.q;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        hg0Var.q = i5 - Integer.MIN_VALUE;
                    } else {
                        hg0Var = new hg0(this, mu0Var);
                    }
                } else {
                    hg0Var = new hg0(this, mu0Var);
                }
                Object obj4 = hg0Var.m;
                int i6 = hg0Var.q;
                if (i6 == 0) {
                    js2.o(obj4);
                    BluetoothHidDevice bluetoothHidDeviceR = kc.r((BluetoothProfile) obj);
                    hg0Var.q = 1;
                    return gr1Var.c(bluetoothHidDeviceR, hg0Var) == px0Var ? px0Var : og5Var;
                }
                if (i6 == 1) {
                    js2.o(obj4);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (mu0Var instanceof ji5) {
                    ji5Var = (ji5) mu0Var;
                    int i7 = ji5Var.q;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ji5Var.q = i7 - Integer.MIN_VALUE;
                    } else {
                        ji5Var = new ji5(this, mu0Var);
                    }
                } else {
                    ji5Var = new ji5(this, mu0Var);
                }
                Object obj5 = ji5Var.m;
                int i8 = ji5Var.q;
                if (i8 == 0) {
                    js2.o(obj5);
                    Object objR = ((db3) obj).r(yl4.y);
                    ji5Var.q = 1;
                    return gr1Var.c(objR, ji5Var) == px0Var ? px0Var : og5Var;
                }
                if (i8 == 1) {
                    js2.o(obj5);
                    return og5Var;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
