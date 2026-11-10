package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m40 implements dz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ bw4 q;
    public final /* synthetic */ qr0 t;

    public /* synthetic */ m40(Object obj, qr0 qr0Var, Object obj2, ob3 ob3Var, byte b) {
        this.j = b;
        this.a = obj;
        this.t = qr0Var;
        this.m = obj2;
        this.q = ob3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dz1
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z2;
        byte b = this.j;
        og5 og5Var = og5.g;
        byte b2 = 2;
        byte b3 = 8;
        l76 l76Var = oo0.g;
        bw4 bw4Var = this.q;
        Object obj5 = this.m;
        qr0 qr0Var = this.t;
        Object obj6 = this.a;
        final byte b4 = 0;
        final byte b5 = 1;
        switch (b) {
            case 0:
                aa3 aa3Var = (aa3) obj6;
                nm0 nm0Var = (nm0) obj5;
                l40 l40Var = (l40) obj2;
                h02 h02Var = (h02) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                l40Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= h02Var.n(l40Var.ordinal()) ? 32 : 16;
                }
                if (!h02Var.N(iIntValue & 1, (iIntValue & 145) != 144)) {
                    h02Var.Q();
                    return og5Var;
                }
                int iOrdinal = l40Var.ordinal();
                if (iOrdinal == 0) {
                    h02Var.X(1751920906);
                    k33.p(aa3Var, h02Var, 0);
                    h02Var.b(false);
                    return og5Var;
                }
                if (iOrdinal == 1) {
                    h02Var.X(1752058484);
                    boolean zJ = h02Var.j(qr0Var);
                    Object objK = h02Var.K();
                    if (zJ || objK == l76Var) {
                        objK = new n40(qr0Var);
                        h02Var.i0(objK);
                    }
                    k33.r((my1) ((nz1) objK), h02Var, 0);
                    h02Var.b(false);
                    return og5Var;
                }
                if (iOrdinal == 2) {
                    h02Var.X(1752258899);
                    ex4 ex4Var = (ex4) bw4Var.getValue();
                    if (yf2.p(ex4Var, dx4.y)) {
                        h02Var.X(-1606041732);
                        z = false;
                        k33.u(0, h02Var);
                        h02Var.b(false);
                    } else {
                        z = false;
                        if (ex4Var instanceof cx4) {
                            h02Var.X(-1606039665);
                            m50.a(qr0Var, h02Var, 8);
                            h02Var.b(false);
                        } else if (yf2.p(ex4Var, dx4.g)) {
                            h02Var.X(-1606037075);
                            nm0Var.l(h02Var, 0);
                            h02Var.b(false);
                        } else {
                            h02Var.X(-1606043505);
                            h02Var.b(false);
                            uo1.g();
                        }
                    }
                    h02Var.b(z);
                    return og5Var;
                }
                h02Var.X(-1606056191);
                h02Var.b(false);
                uo1.g();
                return null;
            default:
                final q81 q81Var = (q81) obj6;
                Context context = (Context) obj5;
                ob3 ob3Var = (ob3) bw4Var;
                v71 v71Var = (v71) obj2;
                h02 h02Var2 = (h02) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((hh) obj).getClass();
                v71Var.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= (iIntValue2 & 64) == 0 ? h02Var2.x(v71Var) : h02Var2.j(v71Var) ? 32 : 16;
                }
                int i = iIntValue2;
                if (!h02Var2.N(i & 1, (i & 145) != 144)) {
                    h02Var2.Q();
                    return og5Var;
                }
                if (v71Var instanceof p71) {
                    h02Var2.X(-50693893);
                    List list = ((p71) v71Var).g;
                    boolean zJ2 = h02Var2.j(q81Var);
                    Object objK2 = h02Var2.K();
                    if (zJ2 || objK2 == l76Var) {
                        objK2 = new xy1() { // from class: d81
                            @Override // defpackage.xy1
                            public final Object a(Object obj7) {
                                BluetoothDevice remoteDevice;
                                byte b6 = b4;
                                og5 og5Var2 = og5.g;
                                q81 q81Var2 = q81Var;
                                switch (b6) {
                                    case 0:
                                        g61 g61Var = (g61) obj7;
                                        g61Var.getClass();
                                        BluetoothManager bluetoothManager = (BluetoothManager) q81Var2.n.getValue();
                                        BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
                                        if (adapter != null && (remoteDevice = adapter.getRemoteDevice(g61Var.t)) != null) {
                                            q81Var2.v(remoteDevice);
                                        }
                                        break;
                                    default:
                                        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj7;
                                        bluetoothDevice.getClass();
                                        q81Var2.v(bluetoothDevice);
                                        break;
                                }
                                return og5Var2;
                            }
                        };
                        h02Var2.i0(objK2);
                    }
                    xy1 xy1Var = (xy1) objK2;
                    boolean zJ3 = h02Var2.j(q81Var);
                    Object objK3 = h02Var2.K();
                    if (zJ3 || objK3 == l76Var) {
                        objK3 = new my1() { // from class: w71
                            @Override // defpackage.my1
                            public final Object g() {
                                byte b6 = b5;
                                og5 og5Var2 = og5.g;
                                q81 q81Var2 = q81Var;
                                switch (b6) {
                                    case 0:
                                        q81Var2.l(false);
                                        break;
                                    default:
                                        q81Var2.l(false);
                                        break;
                                }
                                return og5Var2;
                            }
                        };
                        h02Var2.i0(objK3);
                    }
                    gp4.w(0, (my1) objK3, xy1Var, h02Var2, list);
                    h02Var2.b(false);
                    return og5Var;
                }
                byte b6 = 7;
                if (v71Var instanceof o71) {
                    h02Var2.X(-1571139859);
                    ob3 ob3VarJ = v13.j(qr0Var.w, h02Var2);
                    ob3 ob3VarS = og0.s(qr0Var.t, h02Var2);
                    ob3 ob3VarS2 = og0.s(qr0Var.b, h02Var2);
                    o71 o71Var = (o71) v71Var;
                    boolean z3 = o71Var.g;
                    String str = o71Var.y;
                    boolean z4 = ((dq0) ob3VarS.getValue()) == dq0.t;
                    boolean zL = qr0Var.l();
                    s30 s30Var = (s30) ob3VarS2.getValue();
                    de4 de4Var = (de4) ob3VarJ.getValue();
                    boolean zJ4 = h02Var2.j(q81Var);
                    Object objK4 = h02Var2.K();
                    if (zJ4 || objK4 == l76Var) {
                        objK4 = new xy1() { // from class: d81
                            @Override // defpackage.xy1
                            public final Object a(Object obj7) {
                                BluetoothDevice remoteDevice;
                                byte b7 = b5;
                                og5 og5Var2 = og5.g;
                                q81 q81Var2 = q81Var;
                                switch (b7) {
                                    case 0:
                                        g61 g61Var = (g61) obj7;
                                        g61Var.getClass();
                                        BluetoothManager bluetoothManager = (BluetoothManager) q81Var2.n.getValue();
                                        BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
                                        if (adapter != null && (remoteDevice = adapter.getRemoteDevice(g61Var.t)) != null) {
                                            q81Var2.v(remoteDevice);
                                        }
                                        break;
                                    default:
                                        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj7;
                                        bluetoothDevice.getClass();
                                        q81Var2.v(bluetoothDevice);
                                        break;
                                }
                                return og5Var2;
                            }
                        };
                        h02Var2.i0(objK4);
                    }
                    xy1 xy1Var2 = (xy1) objK4;
                    boolean zJ5 = h02Var2.j(qr0Var);
                    Object objK5 = h02Var2.K();
                    if (zJ5 || objK5 == l76Var) {
                        objK5 = new rn(qr0Var, b6);
                        h02Var2.i0(objK5);
                    }
                    my1 my1Var = (my1) objK5;
                    boolean zJ6 = h02Var2.j(qr0Var);
                    Object objK6 = h02Var2.K();
                    if (zJ6 || objK6 == l76Var) {
                        objK6 = new rn(qr0Var, b3);
                        h02Var2.i0(objK6);
                    }
                    gp4.a(z3, str, z4, zL, s30Var, de4Var, xy1Var2, my1Var, (my1) objK6, h02Var2, 0);
                    h02Var2.b(false);
                    return og5Var;
                }
                if (v71Var instanceof n71) {
                    h02Var2.X(-50636880);
                    String str2 = ((n71) v71Var).g.j;
                    if (str2 == null) {
                        str2 = "???";
                    }
                    gp4.m(str2, h02Var2, 0);
                    h02Var2.b(false);
                    return og5Var;
                }
                if (v71Var instanceof s71) {
                    h02Var2.X(-50633648);
                    String str3 = ((s71) v71Var).g.j;
                    String str4 = str3 != null ? str3 : "Unknown";
                    boolean zJ7 = h02Var2.j(context);
                    Object objK7 = h02Var2.K();
                    if (zJ7 || objK7 == l76Var) {
                        objK7 = new sn(context, b2);
                        h02Var2.i0(objK7);
                    }
                    gp4.c(str4, (my1) objK7, h02Var2, 0);
                    h02Var2.b(false);
                    return og5Var;
                }
                if (v71Var instanceof u71) {
                    h02Var2.X(-50626009);
                    String str5 = ((u71) v71Var).g.j;
                    if (str5 == null) {
                        str5 = "Device";
                    }
                    boolean zJ8 = h02Var2.j(qr0Var);
                    if ((i & 112) != 32 && ((i & 64) == 0 || !h02Var2.j(v71Var))) {
                        b5 = 0;
                    }
                    boolean z5 = ((zJ8 ? 1 : 0) | b5 ? 1 : 0) | (h02Var2.j(q81Var) ? 1 : 0);
                    Object objK8 = h02Var2.K();
                    if (z5 != 0 || objK8 == l76Var) {
                        objK8 = new un(qr0Var, v71Var, q81Var, (byte) 3);
                        h02Var2.i0(objK8);
                    }
                    gp4.q(str5, (my1) objK8, h02Var2, 0);
                    h02Var2.b(false);
                    return og5Var;
                }
                if (v71Var instanceof q71) {
                    h02Var2.X(-1569045809);
                    g61 g61Var = ((q71) v71Var).g;
                    String str6 = g61Var.t;
                    int i2 = i & 112;
                    boolean zJ9 = h02Var2.j(qr0Var) | (i2 == 32 || ((i & 64) != 0 && h02Var2.j(v71Var)));
                    Object objK9 = h02Var2.K();
                    if (zJ9 || objK9 == l76Var) {
                        objK9 = new mt(qr0Var, v71Var, (mu0) null, (byte) 9);
                        h02Var2.i0(objK9);
                    }
                    k33.b((bz1) objK9, h02Var2, str6);
                    g61 g61Var2 = (g61) v13.j(qr0Var.m, h02Var2).getValue();
                    boolean zL2 = g61Var2 != null ? g61Var2.l() : false;
                    Boolean boolValueOf = Boolean.valueOf(zL2);
                    boolean zL3 = h02Var2.l(zL2) | h02Var2.x(ob3Var) | h02Var2.j(q81Var) | (i2 == 32 || ((i & 64) != 0 && h02Var2.j(v71Var)));
                    Object objK10 = h02Var2.K();
                    if (zL3 || objK10 == l76Var) {
                        n81 n81Var = new n81(zL2, q81Var, v71Var, ob3Var, (mu0) null);
                        h02Var2.i0(n81Var);
                        objK10 = n81Var;
                    }
                    k33.b((bz1) objK10, h02Var2, boolValueOf);
                    String str7 = g61Var.j;
                    gp4.m(str7 != null ? str7 : "Unknown", h02Var2, 0);
                    h02Var2.b(false);
                    return og5Var;
                }
                if (!(v71Var instanceof t71)) {
                    if (v71Var.equals(r71.g)) {
                        h02Var2.X(-1567712065);
                        uz4.g(null, null, 0L, 0L, 0.0f, 0.0f, null, a11.x, h02Var2, 12582912, 127);
                        h02Var2.b(false);
                        return og5Var;
                    }
                    h02Var2.X(-50692092);
                    h02Var2.b(false);
                    uo1.g();
                    return null;
                }
                h02Var2.X(-1568192286);
                t71 t71Var = (t71) v71Var;
                g61 g61Var3 = t71Var.g;
                cq0 cq0Var = t71Var.y;
                boolean zJ10 = h02Var2.j(q81Var) | ((i & 112) == 32 || ((i & 64) != 0 && h02Var2.j(v71Var)));
                Object objK11 = h02Var2.K();
                if (zJ10 || objK11 == l76Var) {
                    objK11 = new rg(q81Var, v71Var, b6);
                    h02Var2.i0(objK11);
                }
                my1 my1Var2 = (my1) objK11;
                boolean zJ11 = h02Var2.j(q81Var);
                Object objK12 = h02Var2.K();
                if (zJ11 || objK12 == l76Var) {
                    z2 = false;
                    final Object[] objArr = null == true ? 1 : 0;
                    objK12 = new my1() { // from class: w71
                        @Override // defpackage.my1
                        public final Object g() {
                            byte b7 = objArr;
                            og5 og5Var2 = og5.g;
                            q81 q81Var2 = q81Var;
                            switch (b7) {
                                case 0:
                                    q81Var2.l(false);
                                    break;
                                default:
                                    q81Var2.l(false);
                                    break;
                            }
                            return og5Var2;
                        }
                    };
                    h02Var2.i0(objK12);
                } else {
                    z2 = false;
                }
                gp4.h(g61Var3, cq0Var, my1Var2, (my1) objK12, h02Var2, 0);
                h02Var2.b(z2);
                return og5Var;
        }
    }
}
