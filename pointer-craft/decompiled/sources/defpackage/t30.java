package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes.dex */
public final class t30 extends BroadcastReceiver {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ t30(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:169:0x03db  */
    /* JADX WARN: Code duplicated, block: B:174:0x03eb  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        Object address;
        BluetoothDevice bluetoothDevice;
        Object address2;
        String stringExtra;
        String stringExtra2;
        boolean z2 = false;
        switch (this.g) {
            case 0:
                intent.getClass();
                String action = intent.getAction();
                if (action != null && action.hashCode() == -1530327060 && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    ((ez3) this.y).z(yf2.Z(Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE))));
                    break;
                }
                break;
            case 1:
                if (intent != null) {
                    ((y60) this.y).l(intent);
                }
                break;
            case 2:
                context.getClass();
                intent.getClass();
                String action2 = intent.getAction();
                if (action2 != null) {
                    mu0 mu0Var = null;
                    switch (action2.hashCode()) {
                        case -1530327060:
                            if (action2.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                                try {
                                    if (intExtra == 10) {
                                        ((ClassicHidService) this.y).z.y("off", "bt");
                                        ((ClassicHidService) this.y).C(dx4.y);
                                        if (!((ClassicHidService) this.y).F) {
                                            ((ClassicHidService) this.y).K();
                                        }
                                    } else if (intExtra == 12) {
                                        ((ClassicHidService) this.y).z.y("on", "bt");
                                        ClassicHidService classicHidService = (ClassicHidService) this.y;
                                        iv4 iv4Var = classicHidService.S;
                                        if (iv4Var != null) {
                                            z = true;
                                            if (!iv4Var.y()) {
                                            }
                                            if (!((ClassicHidService) this.y).F) {
                                                ((ClassicHidService) this.y).z.y("on: deferred, app in the background", "bt");
                                            }
                                        } else {
                                            z = true;
                                        }
                                        ng0 ng0Var = classicHidService.H;
                                        if (ng0Var != null) {
                                            iv4 iv4Var2 = ng0Var.f;
                                            if ((iv4Var2 != null ? iv4Var2.y() : false) != z) {
                                                if (((ClassicHidService) this.y).F) {
                                                    ((ClassicHidService) this.y).O();
                                                }
                                            }
                                        } else if (((ClassicHidService) this.y).F) {
                                            ((ClassicHidService) this.y).O();
                                        }
                                        if (!((ClassicHidService) this.y).F) {
                                            ((ClassicHidService) this.y).z.y("on: deferred, app in the background", "bt");
                                        }
                                        break;
                                    }
                                } catch (SecurityException unused) {
                                    return;
                                }
                                break;
                            }
                            break;
                        case -301431627:
                            mu0 mu0Var2 = null;
                            if (action2.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                                Parcelable parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                parcelableExtra.getClass();
                                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) parcelableExtra;
                                m50.T(mq2.a((ClassicHidService) this.y), null, new xg0((ClassicHidService) this.y, bluetoothDevice2, mu0Var2, (byte) 1), 3);
                                String address3 = bluetoothDevice2.getAddress();
                                BluetoothDevice bluetoothDevice3 = ((ClassicHidService) this.y).b;
                                if (bluetoothDevice3 != null) {
                                    address = mu0Var2;
                                    address = bluetoothDevice3.getAddress();
                                }
                                address = mu0Var2;
                                if (yf2.p(address3, address)) {
                                    ((ClassicHidService) this.y).z.g(bluetoothDevice2, "acl connected");
                                }
                                break;
                            }
                            break;
                        case -223687943:
                            if (action2.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                                Parcelable parcelableExtra2 = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                parcelableExtra2.getClass();
                                BluetoothDevice bluetoothDevice4 = (BluetoothDevice) parcelableExtra2;
                                ClassicHidService classicHidService2 = (ClassicHidService) this.y;
                                cm1 cm1Var = ClassicHidService.T;
                                classicHidService2.z.g(bluetoothDevice4, "pairing requested");
                                m50.T(mq2.a(classicHidService2), null, new xg0(classicHidService2, bluetoothDevice4, mu0Var, (byte) 5), 3);
                                break;
                            }
                            break;
                        case -206700896:
                            if (action2.equals("android.bluetooth.adapter.action.SCAN_MODE_CHANGED")) {
                                int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.SCAN_MODE", Integer.MIN_VALUE);
                                ClassicHidService classicHidService3 = (ClassicHidService) this.y;
                                de4 de4Var = de4.j;
                                if (intExtra2 != 20) {
                                    if (intExtra2 == 21) {
                                        de4Var = de4.t;
                                    } else if (intExtra2 == 23) {
                                        de4Var = de4.a;
                                    }
                                }
                                classicHidService3.u = de4Var;
                                rv rvVar = classicHidService3.a;
                                if (rvVar != null) {
                                    ((ew4) rvVar.a).m(null, de4Var);
                                }
                                break;
                            }
                            break;
                        case 1123270207:
                            if (action2.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                                Parcelable parcelableExtra3 = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                parcelableExtra3.getClass();
                                BluetoothDevice bluetoothDevice5 = (BluetoothDevice) parcelableExtra3;
                                int intExtra3 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
                                ((ClassicHidService) this.y).z.g(bluetoothDevice5, du4.w(intExtra3, "connectionState(", ")"));
                                m50.T(mq2.a((ClassicHidService) this.y), null, new ah0((ClassicHidService) this.y, bluetoothDevice5, intExtra3, mu0Var, (byte) 1), 3);
                                break;
                            }
                            break;
                        case 1695159015:
                            if (action2.equals("android.bluetooth.device.action.KEY_MISSING") && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null) {
                                ClassicHidService classicHidService4 = (ClassicHidService) this.y;
                                cm1 cm1Var2 = ClassicHidService.T;
                                classicHidService4.z.g(bluetoothDevice, "key missing");
                                iv4 iv4Var3 = classicHidService4.M;
                                if (iv4Var3 != null) {
                                    iv4Var3.x(null);
                                }
                                m50.T(mq2.a(classicHidService4), null, new xg0(classicHidService4, bluetoothDevice, mu0Var, (byte) 4), 3);
                                classicHidService4.E();
                            }
                            break;
                        case 1821585647:
                            mu0 mu0Var3 = null;
                            if (action2.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                                Parcelable parcelableExtra4 = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                parcelableExtra4.getClass();
                                BluetoothDevice bluetoothDevice6 = (BluetoothDevice) parcelableExtra4;
                                m50.T(mq2.a((ClassicHidService) this.y), null, new xg0((ClassicHidService) this.y, bluetoothDevice6, mu0Var3, (byte) 2), 3);
                                String address4 = bluetoothDevice6.getAddress();
                                BluetoothDevice bluetoothDevice7 = ((ClassicHidService) this.y).b;
                                if (bluetoothDevice7 != null) {
                                    address2 = mu0Var3;
                                    address2 = bluetoothDevice7.getAddress();
                                }
                                address2 = mu0Var3;
                                if (yf2.p(address4, address2)) {
                                    ((ClassicHidService) this.y).z.g(bluetoothDevice6, "acl disconnected");
                                }
                                break;
                            }
                            break;
                        case 2116862345:
                            if (action2.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                                int intExtra4 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
                                Parcelable parcelableExtra5 = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                parcelableExtra5.getClass();
                                BluetoothDevice bluetoothDevice8 = (BluetoothDevice) parcelableExtra5;
                                ((ClassicHidService) this.y).z.g(bluetoothDevice8, du4.w(intExtra4, "bond(", ")"));
                                m50.T(mq2.a((ClassicHidService) this.y), null, new ah0((ClassicHidService) this.y, bluetoothDevice8, intExtra4, mu0Var, (byte) 0), 3);
                                if (intExtra4 == 12) {
                                    ((ClassicHidService) this.y).p().edit().remove(bluetoothDevice8.getAddress()).apply();
                                    m50.T(mq2.a((ClassicHidService) this.y), c21.a, new bh0((ClassicHidService) this.y, bluetoothDevice8, mu0Var, z2 ? 1 : 0), 2);
                                    break;
                                }
                            }
                            break;
                    }
                }
                break;
            case 3:
                cq0 cq0Var = cq0.j;
                q81 q81Var = (q81) this.y;
                intent.getClass();
                BluetoothDevice bluetoothDevice9 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice9 != null) {
                    g61 g61VarU = gp4.U(bluetoothDevice9);
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        switch (action3.hashCode()) {
                            case -301431627:
                                action3.equals("android.bluetooth.device.action.ACL_CONNECTED");
                                break;
                            case -223687943:
                                if (action3.equals("android.bluetooth.device.action.PAIRING_REQUEST") && intent.getIntExtra("android.bluetooth.device.extra.PAIRING_CONTEXT", -1) != 2) {
                                    q81Var.getClass();
                                    q81Var.x(new p81(new s71(g61VarU)));
                                }
                                break;
                            case 1821585647:
                                action3.equals("android.bluetooth.device.action.ACL_DISCONNECTED");
                                break;
                            case 2116862345:
                                if (action3.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                                    int intExtra5 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", Integer.MIN_VALUE);
                                    switch (intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE)) {
                                        case 10:
                                            if (intExtra5 == 11) {
                                                v71 v71Var = ((p81) q81Var.r.getValue()).g;
                                                if (!(v71Var instanceof n71) && (v71Var instanceof s71)) {
                                                    cq0Var = cq0.t;
                                                }
                                                q81Var.x(new p81(new t71(g61VarU, cq0Var)));
                                            }
                                            break;
                                        case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                            q81Var.x(new p81(new n71(g61VarU)));
                                            break;
                                        case 12:
                                            q81Var.x(new p81(new q71(g61VarU)));
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                }
                break;
            default:
                intent.getClass();
                e62 e62Var = (e62) this.y;
                String action4 = intent.getAction();
                String address5 = null;
                if (action4 != null) {
                    int iZ = tx4.Z(action4, '.', 0, 6);
                    if (iZ != -1) {
                        action4 = action4.substring(iZ + 1, action4.length());
                    }
                } else {
                    action4 = null;
                }
                e62Var.z.y(String.valueOf(action4), "debug");
                String action5 = intent.getAction();
                if (action5 != null) {
                    switch (action5.hashCode()) {
                        case -938977726:
                            if (action5.equals("io.appground.action.BT_ON")) {
                                e62Var.q();
                                break;
                            }
                            break;
                        case -157605203:
                            if (action5.equals("io.appground.action.DISCOVERABLE")) {
                                e62Var.w();
                                break;
                            }
                            break;
                        case 65901533:
                            if (action5.equals("io.appground.action.ACTIVATE") && (stringExtra = intent.getStringExtra("disconnect_address")) != null) {
                                e62Var.g(stringExtra);
                            }
                            break;
                        case 314159264:
                            if (action5.equals("io.appground.action.CONNECT") && (stringExtra2 = intent.getStringExtra("disconnect_address")) != null) {
                                e62Var.j(stringExtra2);
                            }
                            break;
                        case 956461388:
                            if (action5.equals("io.appground.action.BT_OFF")) {
                                e62Var.t();
                                break;
                            }
                            break;
                        case 1691025670:
                            if (action5.equals("io.appground.action.DISCONNECT")) {
                                String stringExtra3 = intent.getStringExtra("disconnect_address");
                                if (stringExtra3 == null) {
                                    BluetoothDevice bluetoothDevice10 = e62Var.b;
                                    if (bluetoothDevice10 != null) {
                                        address5 = bluetoothDevice10.getAddress();
                                    }
                                } else {
                                    address5 = stringExtra3;
                                }
                                if (address5 != null) {
                                    e62Var.m(address5);
                                }
                                break;
                            }
                            break;
                    }
                }
                break;
        }
    }
}
