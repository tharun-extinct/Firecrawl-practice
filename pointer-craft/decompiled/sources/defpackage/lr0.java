package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class lr0 extends zz4 implements bz1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr0(Object obj, boolean z, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.c = z;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        boolean z = this.c;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return new lr0(z, obj2, mu0Var, (byte) 0);
            case 1:
                return new lr0(obj2, z, mu0Var, (byte) 1);
            case 2:
                return new lr0(z, obj2, mu0Var, (byte) 2);
            default:
                return new lr0(obj2, z, mu0Var, (byte) 3);
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
        }
        return ((lr0) b(mu0Var, ox0Var)).u(og5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        bi0 bi0Var;
        byte b = this.q;
        boolean z = this.c;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        Object obj2 = this.i;
        cj cjVarA = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (b) {
            case 0:
                qr0 qr0Var = (qr0) obj2;
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    String str = "";
                    if (Build.VERSION.SDK_INT >= 33) {
                        try {
                            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                            if (defaultAdapter != null) {
                                Object[] objArr3 = defaultAdapter.isLeAudioSupported() == 10;
                                int i = defaultAdapter.isLeAudioBroadcastSourceSupported() == 10 ? 1 : 0;
                                int i2 = defaultAdapter.isLeAudioBroadcastAssistantSupported() == 10 ? 2 : 0;
                                if (objArr3 != false) {
                                    str = "&lea=" + (i + i2);
                                }
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    boolean z3 = qr0Var.t.j.getValue() == dq0.t;
                    String str2 = "https://anleitung-backend.appspot.com/api/report?connection=true&restart=" + z + "&ble=" + z3 + qr0.x() + str;
                    this.w = true;
                    x21 x21Var = na1.g;
                    if (m50.f0(c21.a, new o40(str2, objArr == true ? 1 : 0, (byte) 3), this) == px0Var) {
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
            case 1:
                q81 q81Var = (q81) obj2;
                boolean z4 = this.w;
                if (!z4) {
                    js2.o(obj);
                    this.w = true;
                    x21 x21Var2 = na1.g;
                    obj = m50.f0(c21.a, new qx(q81Var, objArr2 == true ? 1 : 0, (byte) 4), this);
                    if (obj == px0Var) {
                        return px0Var;
                    }
                } else {
                    if (!z4) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj);
                }
                q81Var.x(new p81(new o71((String) obj, z)));
                return og5Var;
            case 2:
                boolean z5 = this.w;
                if (!z5) {
                    js2.o(obj);
                    if (z) {
                        this.w = true;
                        if (yf2.e(100L, this) == px0Var) {
                            return px0Var;
                        }
                    }
                    return og5Var;
                }
                if (!z5) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ((nt1) ((lt1) obj2)).y(8, false, true);
                return og5Var;
            default:
                b65 b65Var = (b65) obj2;
                boolean z6 = this.w;
                if (!z6) {
                    js2.o(obj);
                    if (!u75.r(b65Var.q().y)) {
                        cjVarA = mu5.a(b65Var.q());
                        if (z) {
                            int iV = u75.v(b65Var.q().y);
                            b65Var.r.a(b65.y(b65Var.q().g, sp2.y(iV, iV)));
                            b65Var.p(r42.j);
                        }
                    }
                    if (cjVarA != null && (bi0Var = b65Var.l) != null) {
                        ai0 ai0VarR = gc6.r(cjVarA);
                        this.w = true;
                        ((g9) bi0Var).g(ai0VarR);
                        if (og5Var == px0Var) {
                            return px0Var;
                        }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr0(boolean z, Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = z;
        this.i = obj;
    }
}
