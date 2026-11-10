package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHidDevice;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ng0 {
    public final my1 a;
    public BluetoothHidDevice b;
    public final bz1 c;
    public iv4 f;
    public final Context g;
    public final ji h;
    public final o05 i;
    public final rg0 j;
    public final t52 k;
    public final qg0 l;
    public final xt2 m;
    public final jy2 n;
    public iv4 o;
    public final f34 p;
    public final hx0 q;
    public final x30 r;
    public final ew4 s;
    public final my1 t;
    public BluetoothDevice u;
    public final qg0 v;
    public final hx0 w;
    public final rg0 x;
    public final BluetoothAdapter y;
    public boolean z;

    public ng0(Context context, BluetoothAdapter bluetoothAdapter, x30 x30Var, jy2 jy2Var, qg0 qg0Var, rg0 rg0Var, qg0 qg0Var2, rg0 rg0Var2, qg0 qg0Var3, qg0 qg0Var4, xt2 xt2Var, hx0 hx0Var) {
        x21 x21Var = na1.g;
        c21 c21Var = c21.a;
        xf0 xf0Var = xf0.i;
        jy2Var.getClass();
        hx0Var.getClass();
        c21Var.getClass();
        this.g = context;
        this.y = bluetoothAdapter;
        this.r = x30Var;
        this.n = jy2Var;
        this.v = qg0Var;
        this.x = rg0Var;
        this.l = qg0Var2;
        this.j = rg0Var2;
        this.t = qg0Var3;
        this.a = qg0Var4;
        this.m = xt2Var;
        this.q = hx0Var;
        this.w = c21Var;
        this.c = xf0Var;
        this.i = new o05(new y4((byte) 17));
        ew4 ew4VarW = y94.w(new yf0(null, 0, false));
        this.s = ew4VarW;
        this.p = pw5.j(ew4VarW);
        byte b = 11;
        this.h = new ji(new q64(this, b), new ed(this, (byte) 2), b);
        this.k = new t52(new d5(this, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final Object g(BluetoothDevice bluetoothDevice, boolean z, ou0 ou0Var) throws Throwable {
        ag0 ag0Var;
        ew4 ew4Var;
        Object value;
        yf0 yf0Var;
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        boolean z2 = z;
        p40 p40Var = p40.a;
        p40 p40Var2 = p40.t;
        p40 p40Var3 = p40.j;
        if (ou0Var instanceof ag0) {
            ag0Var = (ag0) ou0Var;
            int i = ag0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ag0Var.i = i - Integer.MIN_VALUE;
            } else {
                ag0Var = new ag0(this, ou0Var);
            }
        } else {
            ag0Var = new ag0(this, ou0Var);
        }
        Object obj = ag0Var.w;
        int i2 = ag0Var.i;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        og5 og5Var = og5.g;
        if (i2 == 0) {
            js2.o(obj);
            iv4 iv4Var = this.f;
            if (!(iv4Var != null ? iv4Var.y() : false)) {
                this.u = bluetoothDevice2;
                n();
                return og5Var;
            }
            f34 f34Var = this.p;
            if (((yf0) f34Var.j.getValue()).g) {
                BluetoothDevice bluetoothDevice3 = ((yf0) f34Var.j.getValue()).y;
                if (bluetoothDevice3 != null) {
                    BluetoothHidDevice bluetoothHidDevice = this.b;
                    int connectionState = bluetoothHidDevice != null ? bluetoothHidDevice.getConnectionState(bluetoothDevice3) : 0;
                    if (((yf0) f34Var.j.getValue()).r != connectionState) {
                        do {
                            ew4Var = this.s;
                            value = ew4Var.getValue();
                            yf0Var = (yf0) value;
                            yf0Var.getClass();
                        } while (!ew4Var.t(value, new yf0(yf0Var.y, connectionState, yf0Var.g)));
                    }
                    if (!bluetoothDevice3.equals(bluetoothDevice2) && connectionState != 0) {
                        y(bluetoothDevice3);
                        eg0 eg0Var = new eg0(this, null, z3 ? (byte) 1 : (byte) 0);
                        ag0Var.m = bluetoothDevice2;
                        ag0Var.q = z2;
                        ag0Var.i = 1;
                        Object objE = br2.E(2000L, eg0Var, ag0Var);
                        px0 px0Var = px0.j;
                        if (objE == px0Var) {
                            return px0Var;
                        }
                    }
                }
            } else {
                this.u = bluetoothDevice2;
                if (z2) {
                    n();
                    return og5Var;
                }
            }
            return og5Var;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z5 = ag0Var.q;
        BluetoothDevice bluetoothDevice4 = ag0Var.m;
        js2.o(obj);
        z2 = z5;
        bluetoothDevice2 = bluetoothDevice4;
        ji jiVar = this.h;
        ed edVar = (ed) jiVar.a;
        q64 q64Var = (q64) jiVar.t;
        bluetoothDevice2.getClass();
        int bondState = bluetoothDevice2.getBondState();
        m72 m72Var = m72.j;
        if (bondState != 10) {
            if (bondState == 12) {
                ng0 ng0Var = (ng0) q64Var.t;
                BluetoothHidDevice bluetoothHidDevice2 = ng0Var.b;
                if ((bluetoothHidDevice2 != null ? bluetoothHidDevice2.getConnectionState(bluetoothDevice2) : 0) == 2) {
                    m72Var = m72.a;
                } else {
                    BluetoothHidDevice bluetoothHidDevice3 = ng0Var.b;
                    if (bluetoothHidDevice3 != null && bluetoothHidDevice3.connect(bluetoothDevice2)) {
                        z4 = true;
                    }
                    edVar.l(bluetoothDevice2, "connect(" + z4 + ")");
                    m72Var = z4 ? m72.m : m72.q;
                }
            }
        } else if (z2) {
            try {
                if (bluetoothDevice2.createBond()) {
                    p40Var2 = p40Var3;
                }
            } catch (NullPointerException unused) {
            } catch (SecurityException unused2) {
                p40Var2 = p40Var;
            }
            if (p40Var2 == p40Var) {
                edVar.l(bluetoothDevice2, "createBond(denied)");
                m72Var = m72.w;
            } else {
                edVar.l(bluetoothDevice2, "createBond(" + (p40Var2 == p40Var3) + ")");
            }
        } else {
            m72Var = m72.t;
        }
        int iOrdinal = m72Var.ordinal();
        if (iOrdinal == 4) {
            n();
        } else if (iOrdinal == 5) {
            this.x.a(zf0.a);
        }
        return og5Var;
    }

    public final void n() {
        Context context = this.g;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 31 && ue5.D(context, "android.permission.BLUETOOTH_CONNECT") != 0) {
            this.x.a(zf0.a);
        } else if (!((Boolean) this.a.g()).booleanValue()) {
            this.n.y("start deferred: cannot register yet", "hid");
        } else {
            this.f = m50.T(this.m, this.q, new fp(this, this.f, null, (byte) 2), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(boolean z, ou0 ou0Var) {
        ig0 ig0Var;
        ew4 ew4Var;
        Object value;
        if (ou0Var instanceof ig0) {
            ig0Var = (ig0) ou0Var;
            int i = ig0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ig0Var.c = i - Integer.MIN_VALUE;
            } else {
                ig0Var = new ig0(this, ou0Var);
            }
        } else {
            ig0Var = new ig0(this, ou0Var);
        }
        Object obj = ig0Var.q;
        int i2 = ig0Var.c;
        mu0 mu0Var = null;
        byte b = 1;
        if (i2 == 0) {
            js2.o(obj);
            eg0 eg0Var = new eg0(this, mu0Var, b);
            ig0Var.m = z;
            ig0Var.c = 1;
            Object objE = br2.E(2000L, eg0Var, ig0Var);
            px0 px0Var = px0.j;
            if (objE == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = ig0Var.m;
            js2.o(obj);
        }
        t52 t52Var = this.k;
        t52Var.getClass();
        s52 s52Var = (s52) ((AtomicReference) t52Var.r).get();
        if (s52Var != null) {
            s52Var.n("shutdown", false);
        }
        this.n.y("shutdown ".concat(t52Var.g()), "hid");
        if (z) {
            o05 o05Var = this.i;
            if (o05Var.g()) {
                Object value2 = o05Var.getValue();
                value2.getClass();
                ((ExecutorService) value2).shutdown();
            }
        }
        do {
            ew4Var = this.s;
            value = ew4Var.getValue();
            ((yf0) value).getClass();
        } while (!ew4Var.t(value, new yf0(null, 0, false)));
        return og5.g;
    }

    public final void y(BluetoothDevice bluetoothDevice) {
        bluetoothDevice.getClass();
        BluetoothHidDevice bluetoothHidDevice = this.b;
        this.n.g(bluetoothDevice, "disconnect(" + (bluetoothHidDevice != null ? Boolean.valueOf(bluetoothHidDevice.disconnect(bluetoothDevice)) : null) + ")");
        BluetoothHidDevice bluetoothHidDevice2 = this.b;
        if (bluetoothHidDevice2 != null) {
            bluetoothHidDevice2.disconnect(bluetoothDevice);
        }
    }
}
