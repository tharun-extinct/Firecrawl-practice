package io.appground.blehid;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHidDevice;
import defpackage.b44;
import defpackage.br2;
import defpackage.c;
import defpackage.c21;
import defpackage.ch6;
import defpackage.cm1;
import defpackage.d44;
import defpackage.de4;
import defpackage.du4;
import defpackage.dy;
import defpackage.e62;
import defpackage.ew4;
import defpackage.f34;
import defpackage.hh0;
import defpackage.iv4;
import defpackage.js2;
import defpackage.jy2;
import defpackage.l0;
import defpackage.m50;
import defpackage.mq2;
import defpackage.mt;
import defpackage.mu0;
import defpackage.na1;
import defpackage.ng0;
import defpackage.o40;
import defpackage.og5;
import defpackage.ok4;
import defpackage.ou0;
import defpackage.p03;
import defpackage.p40;
import defpackage.px0;
import defpackage.rv;
import defpackage.t30;
import defpackage.t42;
import defpackage.t84;
import defpackage.u84;
import defpackage.ug0;
import defpackage.uo1;
import defpackage.v54;
import defpackage.v84;
import defpackage.w84;
import defpackage.wg0;
import defpackage.x21;
import defpackage.xg0;
import defpackage.xi3;
import defpackage.xt2;
import defpackage.yf0;
import defpackage.yf2;
import defpackage.yg0;
import defpackage.zo2;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ClassicHidService extends e62 {
    public static final cm1 T = new cm1((byte) 9);
    public ng0 H;
    public iv4 I;
    public long K;
    public iv4 M;
    public long N;
    public volatile String O;
    public volatile boolean Q;
    public iv4 S;
    public boolean J = true;
    public final d44 L = new d44();
    public volatile boolean P = true;
    public final t30 R = new t30(this, 2);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H(ou0 ou0Var) throws Throwable {
        ug0 ug0Var;
        f34 f34Var;
        if (ou0Var instanceof ug0) {
            ug0Var = (ug0) ou0Var;
            int i = ug0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ug0Var.w = i - Integer.MIN_VALUE;
            } else {
                ug0Var = new ug0(this, ou0Var);
            }
        } else {
            ug0Var = new ug0(this, ou0Var);
        }
        Object objE = ug0Var.m;
        int i2 = ug0Var.w;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(objE);
            ng0 ng0Var = this.H;
            if (ng0Var == null || (f34Var = ng0Var.p) == null) {
                return Boolean.FALSE;
            }
            if (((yf0) f34Var.j.getValue()).g) {
                return Boolean.TRUE;
            }
            dy dyVar = new dy((Object) f34Var, mu0Var, (byte) 3);
            ug0Var.w = 1;
            objE = br2.E(8000L, dyVar, ug0Var);
            px0 px0Var = px0.j;
            if (objE == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objE);
        }
        Boolean bool = (Boolean) objE;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    public final void I(BluetoothDevice bluetoothDevice, boolean z) {
        String strW = du4.w(bluetoothDevice.getBondState(), "connectDevice(", ")");
        jy2 jy2Var = this.z;
        jy2Var.g(bluetoothDevice, strW);
        if (z) {
            this.J = true;
        }
        BluetoothAdapter bluetoothAdapterI = i();
        if (bluetoothAdapterI != null && bluetoothAdapterI.getScanMode() == 20) {
            BluetoothAdapter bluetoothAdapterI2 = i();
            if ((bluetoothAdapterI2 != null ? ch6.n(21, 1, bluetoothAdapterI2) : null) == null) {
                jy2Var.y("scan mode did not take", "connectable");
            }
        }
        m50.T(mq2.a(this), null, new wg0(this, bluetoothDevice, z, (mu0) null), 3);
    }

    public final void J() {
        Object v84Var;
        String lowerCase;
        this.N = System.currentTimeMillis();
        BluetoothDevice bluetoothDevice = this.b;
        byte b = 3;
        mu0 mu0Var = null;
        if (bluetoothDevice != null) {
            m50.T(mq2.a(this), null, new xg0(this, bluetoothDevice, mu0Var, b), 3);
        }
        boolean z = this.F;
        boolean z2 = this.J;
        d44 d44Var = this.L;
        Long lM = M();
        List list = d44.n;
        Long lG = d44Var.g(lM, false);
        if (!z2) {
            v84Var = t84.g;
        } else if (z) {
            v84Var = lG == null ? u84.g : new v84(Math.max(lG.longValue(), 2000L));
        } else {
            v84Var = w84.g;
        }
        String strR = v54.g(v84Var.getClass()).r();
        if (strR != null) {
            lowerCase = strR.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        this.z.y(xi3.t("revoked: ", lowerCase), "register");
        if (v84Var instanceof v84) {
            this.K = System.currentTimeMillis();
            this.L.y++;
        }
        m50.T(mq2.a(this), null, new c(v84Var, this, mu0Var, (byte) 15), 3);
    }

    public final void K() {
        if (this.Q) {
            return;
        }
        this.Q = true;
        this.z.y("paused: disconnected while in the background", "reconnect");
        iv4 iv4Var = this.M;
        mu0 mu0Var = null;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        this.L.y = 0;
        E();
        m50.T(mq2.a(this), null, new dy((Object) this, mu0Var, (byte) 4), 3);
    }

    public final void L(boolean z) {
        b44 b44Var = b44.j;
        BluetoothDevice bluetoothDevice = this.b;
        boolean z2 = this.J;
        boolean z3 = false;
        boolean z4 = bluetoothDevice != null;
        BluetoothAdapter bluetoothAdapterI = i();
        boolean z5 = bluetoothAdapterI != null && bluetoothAdapterI.isEnabled();
        boolean z6 = this.F;
        iv4 iv4Var = this.M;
        if (iv4Var != null && iv4Var.y()) {
            z3 = true;
        }
        if (!z2 || !z4 || !z5) {
            b44Var = b44.t;
        } else if (!z) {
            if (!z6) {
                b44Var = b44.a;
            } else if (z3) {
                b44Var = b44.m;
            }
        }
        int iOrdinal = b44Var.ordinal();
        if (iOrdinal == 0) {
            if (bluetoothDevice == null) {
                return;
            }
            iv4 iv4Var2 = this.M;
            if (iv4Var2 != null) {
                iv4Var2.x(null);
            }
            this.M = m50.T(mq2.a(this), null, new wg0(this, z, bluetoothDevice, (mu0) null), 3);
            return;
        }
        if (iOrdinal == 1) {
            E();
            return;
        }
        if (iOrdinal == 2) {
            this.z.y("deferred: app not in the foreground", "reconnect");
            E();
        } else {
            if (iOrdinal == 3) {
                return;
            }
            uo1.g();
        }
    }

    public final Long M() {
        Long lValueOf = Long.valueOf(this.K);
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() - lValueOf.longValue());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r12 == r8) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(defpackage.ou0 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appground.blehid.ClassicHidService.N(ou0):java.lang.Object");
    }

    public final void O() {
        if (i() == null) {
            A(ok4.j);
            return;
        }
        iv4 iv4Var = this.I;
        mu0 mu0Var = null;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        ng0 ng0Var = this.H;
        iv4 iv4Var2 = this.S;
        this.H = null;
        this.S = m50.T(mq2.a(this), null, new hh0(iv4Var2, ng0Var, this, mu0Var, (byte) 0), 3);
    }

    @Override // defpackage.e62
    public final void f(boolean z) {
        Integer numValueOf;
        p40 p40Var = p40.a;
        p40 p40Var2 = p40.t;
        BluetoothDevice bluetoothDevice = this.b;
        if (bluetoothDevice == null) {
            return;
        }
        if (z) {
            String str = null;
            try {
                numValueOf = Integer.valueOf(bluetoothDevice.getBondState());
            } catch (SecurityException unused) {
                numValueOf = null;
            }
            try {
                if (bluetoothDevice.createBond()) {
                    p40Var2 = p40.j;
                }
            } catch (NullPointerException unused2) {
            } catch (SecurityException unused3) {
                p40Var2 = p40Var;
            }
            if (numValueOf != null) {
                switch (numValueOf.intValue()) {
                    case 10:
                        str = "NONE";
                        break;
                    case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        str = "BONDING";
                        break;
                    case 12:
                        str = "BONDED";
                        break;
                    default:
                        str = "unknown";
                        break;
                }
            }
            this.z.g(bluetoothDevice, "repair bond=" + str + " foreground=" + this.F + " result=" + p40Var2);
            if (p40Var2 == p40Var) {
                A(ok4.w);
            }
        }
        try {
            I(bluetoothDevice, z);
        } catch (SecurityException unused4) {
        }
    }

    @Override // defpackage.e62
    public final void g(String str) {
        String address;
        if (str != null) {
            B(str);
        }
        BluetoothAdapter bluetoothAdapterI = i();
        bluetoothAdapterI.getClass();
        BluetoothDevice remoteDevice = bluetoothAdapterI.getRemoteDevice(str);
        if (yf2.p(this.b, remoteDevice)) {
            return;
        }
        BluetoothDevice bluetoothDevice = this.b;
        if (bluetoothDevice != null && (address = bluetoothDevice.getAddress()) != null) {
            m(address);
        }
        xt2 xt2VarA = mq2.a(this);
        x21 x21Var = na1.g;
        m50.T(xt2VarA, c21.a, new mt((Object) this, (Object) remoteDevice, (mu0) null, (byte) 3), 2);
    }

    @Override // defpackage.e62
    public final void h() {
        this.Q = false;
    }

    @Override // defpackage.e62
    public final void j(String str) {
        BluetoothDevice remoteDevice = i().getRemoteDevice(str);
        if (remoteDevice != null) {
            I(remoteDevice, true);
        }
    }

    @Override // defpackage.e62
    public final void m(String str) {
        BluetoothDevice remoteDevice;
        str.getClass();
        BluetoothAdapter bluetoothAdapterI = i();
        if (bluetoothAdapterI == null || (remoteDevice = bluetoothAdapterI.getRemoteDevice(str)) == null) {
            return;
        }
        String address = remoteDevice.getAddress();
        BluetoothDevice bluetoothDevice = this.b;
        mu0 mu0Var = null;
        boolean zP = yf2.p(address, bluetoothDevice != null ? bluetoothDevice.getAddress() : null);
        byte b = 0;
        if (zP) {
            this.J = false;
        }
        this.O = str;
        m50.T(mq2.a(this), null, new xg0(this, remoteDevice, mu0Var, b), 3);
    }

    @Override // defpackage.e62
    public final boolean n(byte b, byte[] bArr) {
        iv4 iv4Var;
        BluetoothHidDevice bluetoothHidDevice;
        ng0 ng0Var = this.H;
        if (ng0Var == null) {
            this.z.y("dropped: no connection", "input");
            return false;
        }
        BluetoothDevice bluetoothDevice = ((yf0) ng0Var.p.j.getValue()).y;
        Boolean boolValueOf = null;
        if (bluetoothDevice != null && (bluetoothHidDevice = ng0Var.b) != null) {
            boolValueOf = Boolean.valueOf(bluetoothHidDevice.sendReport(bluetoothDevice, b, bArr));
        }
        boolean zP = yf2.p(boolValueOf, Boolean.TRUE);
        if (zP != this.P) {
            this.P = zP;
            if (!zP) {
                this.z.y("not sent, plugged=" + (((yf0) ng0Var.p.j.getValue()).y != null), "input");
            }
        }
        if (((yf0) ng0Var.p.j.getValue()).r != 2 && ((iv4Var = this.M) == null || !iv4Var.y())) {
            try {
                L(true);
            } catch (SecurityException unused) {
            }
        }
        return zP;
    }

    @Override // defpackage.e62
    public final void o() {
        f34 f34Var;
        yf0 yf0Var;
        iv4 iv4Var = this.S;
        if (iv4Var == null || !iv4Var.y()) {
            ng0 ng0Var = this.H;
            if (ng0Var != null) {
                iv4 iv4Var2 = ng0Var.f;
                if (iv4Var2 != null ? iv4Var2.y() : false) {
                    return;
                }
            }
            ng0 ng0Var2 = this.H;
            if (ng0Var2 == null || (f34Var = ng0Var2.p) == null || (yf0Var = (yf0) f34Var.j.getValue()) == null || yf0Var.r != 2) {
                jy2 jy2Var = this.z;
                try {
                    if (ng0Var2 != null) {
                        iv4 iv4Var3 = ng0Var2.f;
                        if (iv4Var3 != null ? iv4Var3.y() : false) {
                            jy2Var.y("foreground: reconnecting", "hid");
                            L(true);
                            return;
                        }
                    }
                    jy2Var.y("foreground: restarting the paused connection", "hid");
                    O();
                } catch (SecurityException unused) {
                }
            }
        }
    }

    @Override // defpackage.e62, defpackage.nu2, android.app.Service
    public final void onCreate() {
        this.z.y("classic", "init");
        super.onCreate();
    }

    @Override // defpackage.e62, defpackage.nu2, android.app.Service
    public final void onDestroy() {
        ng0 ng0Var = this.H;
        if (ng0Var != null) {
            try {
                iv4 iv4Var = ng0Var.f;
                if (iv4Var != null) {
                    iv4Var.x(null);
                }
                if (ng0Var.z) {
                    ng0Var.y.disable();
                }
            } catch (SecurityException unused) {
            }
        }
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.e62
    public final Object z(ou0 ou0Var) {
        yg0 yg0Var;
        Integer num;
        int iIntValue;
        if (ou0Var instanceof yg0) {
            yg0Var = (yg0) ou0Var;
            int i = yg0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                yg0Var.w = i - Integer.MIN_VALUE;
            } else {
                yg0Var = new yg0(this, ou0Var);
            }
        } else {
            yg0Var = new yg0(this, ou0Var);
        }
        Object obj = yg0Var.m;
        int i2 = yg0Var.w;
        mu0 mu0Var = null;
        byte b = 1;
        if (i2 == 0) {
            js2.o(obj);
            BluetoothAdapter bluetoothAdapterI = i();
            if (bluetoothAdapterI != null) {
                try {
                    num = new Integer(bluetoothAdapterI.getScanMode());
                } catch (SecurityException unused) {
                    num = null;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 20;
                }
            } else {
                iIntValue = 20;
            }
            de4 de4Var = de4.j;
            if (iIntValue != 20) {
                if (iIntValue == 21) {
                    de4Var = de4.t;
                } else if (iIntValue == 23) {
                    de4Var = de4.a;
                }
            }
            this.u = de4Var;
            rv rvVar = this.a;
            if (rvVar != null) {
                ((ew4) rvVar.a).m(null, de4Var);
            }
            x21 x21Var = na1.g;
            t42 t42Var = p03.g;
            o40 o40Var = new o40(this, mu0Var, b);
            yg0Var.w = 1;
            Object objF0 = m50.f0(t42Var, o40Var, yg0Var);
            px0 px0Var = px0.j;
            if (objF0 == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        O();
        return og5.g;
    }
}
