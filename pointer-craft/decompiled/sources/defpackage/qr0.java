package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class qr0 extends pl5 {
    public final f34 A;
    public dh2 B;
    public iv4 C;
    public String D;
    public final dr0 E;
    public boolean a;
    public final f34 b;
    public final f34 c;
    public final tp3 d;
    public final ew4 e;
    public rk4 f;
    public String h;
    public final f34 i;
    public final h62 j;
    public boolean k;
    public final rv l;
    public final f34 m;
    public final yi2 n;
    public boolean o;
    public final tp3 p;
    public final d34 q;
    public final l62 r;
    public final tp3 s;
    public final f34 t;
    public final ew4 u;
    public final ta2 v;
    public final f34 w;
    public final SharedPreferences x;
    public final Context y;
    public final ew4 z;

    public qr0(Context context, l62 l62Var, yi2 yi2Var, ta2 ta2Var) {
        context.getClass();
        l62Var.getClass();
        yi2Var.getClass();
        ta2Var.getClass();
        this.y = context;
        this.r = l62Var;
        this.n = yi2Var;
        this.v = ta2Var;
        SharedPreferences sharedPreferences = d52.b;
        sharedPreferences.getClass();
        this.x = sharedPreferences;
        rv rvVar = l62Var.x;
        this.l = rvVar;
        h62 h62Var = l62Var.l;
        this.j = h62Var;
        this.t = pw5.j(h62Var.j);
        f34 f34VarJ = pw5.j((ew4) rvVar.j);
        this.m = f34VarJ;
        this.q = new d34((co4) rvVar.t);
        this.w = pw5.j((ew4) rvVar.a);
        f34 f34VarJ2 = pw5.j((ew4) rvVar.m);
        this.c = f34VarJ2;
        this.i = pw5.j((ew4) rvVar.q);
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(BluetoothManager.class);
        mu0 mu0Var = null;
        byte b = 2;
        f34 f34VarN = pw5.N(a11.v(new zh(bluetoothManager != null ? bluetoothManager.getAdapter() : null, context, mu0Var, b)), v70.d(this), new sv4(5000L, Long.MAX_VALUE), s30.j);
        this.b = f34VarN;
        this.s = yi2Var.y;
        this.p = kq2.M(new qq0(null, null));
        ew4 ew4VarW = y94.w(new fx4(0, 0, 0));
        this.u = ew4VarW;
        this.z = ew4VarW;
        this.d = kq2.M(Boolean.FALSE);
        ew4 ew4VarW2 = y94.w(null);
        this.e = ew4VarW2;
        this.A = pw5.j(ew4VarW2);
        this.D = "";
        this.E = new dr0(new er1[]{f34VarN, f34VarJ2, f34VarJ}, new gr0(this, null), (byte) 1);
        m50.T(v70.d(this), null, new fr0(this, mu0Var, (byte) 5), 3);
        m50.T(v70.d(this), null, new yq0(this, mu0Var, (byte) 0), 3);
        m50.T(v70.d(this), null, new yq0(this, mu0Var, (byte) 1), 3);
        m50.T(v70.d(this), c21.a, new yq0(this, mu0Var, b), 2);
        m50.T(v70.d(this), null, new yq0(this, mu0Var, (byte) 3), 3);
    }

    public static void b(qr0 qr0Var, String str) {
        qr0Var.getClass();
        str.getClass();
        mu0 mu0Var = null;
        m50.T(v70.d(qr0Var), null, new c(qr0Var, str, mu0Var, mu0Var, (byte) 17), 3);
    }

    public static String x() {
        String strT = Build.VERSION.SDK_INT >= 31 ? xi3.t("&soc=", Uri.encode(Build.SOC_MODEL)) : "";
        String strEncode = Uri.encode(Build.DEVICE);
        String strEncode2 = Uri.encode(Build.BOARD);
        String strEncode3 = Uri.encode(Build.BRAND);
        String strEncode4 = Uri.encode(Build.MODEL);
        String strEncode5 = Uri.encode(Build.PRODUCT);
        String strEncode6 = Uri.encode(Build.VERSION.RELEASE);
        StringBuilder sbZ = du4.z("&name=", strEncode, "&board=", strEncode2, "&brand=");
        du4.B(sbZ, strEncode3, "&model=", strEncode4, "&product=");
        sbZ.append(strEncode5);
        sbZ.append("&av=");
        sbZ.append(strEncode6);
        sbZ.append(strT);
        return sbZ.toString();
    }

    public final qq0 a() {
        return (qq0) this.p.getValue();
    }

    public final void c(int i, boolean z) {
        m50.T(v70.d(this), null, new or0(this, i, z, null), 3);
    }

    public final Object i(int i, int i2, mu0 mu0Var) {
        Object objL;
        px0 px0Var = px0.j;
        rk4 rk4Var = this.f;
        if (rk4Var != null) {
            rk4Var.V(xk1.g);
        }
        l62 l62Var = this.r;
        og5 og5Var = og5.g;
        x30 x30Var = l62Var.l.y;
        k40 k40Var = null;
        if (x30Var != null) {
            Object obj = x30Var.g.get(v54.g(k40.class));
            k40Var = (k40) (obj instanceof k40 ? obj : null);
        }
        if (k40Var == null || (objL = k40Var.l(i, i2, mu0Var)) != px0Var) {
            objL = og5Var;
        }
        return objL == px0Var ? objL : og5Var;
    }

    public final e40 j() {
        x30 x30Var = this.r.l.y;
        if (x30Var == null) {
            return null;
        }
        Object obj = x30Var.g.get(v54.g(e40.class));
        return (e40) (obj instanceof e40 ? obj : null);
    }

    public final boolean l() {
        return this.x.getBoolean("forceBleMode_" + Build.VERSION.SDK_INT, false);
    }

    public final void m(String str) {
        e62 e62Var;
        str.getClass();
        h62 h62Var = this.j;
        h62Var.getClass();
        if (!h62Var.n || (e62Var = h62Var.r) == null) {
            return;
        }
        BluetoothDevice bluetoothDevice = e62Var.b;
        if (yf2.p(bluetoothDevice != null ? bluetoothDevice.getAddress() : null, str)) {
            e62Var.b = null;
            rv rvVar = e62Var.a;
            if (rvVar != null) {
                ((ew4) rvVar.j).a(null);
            }
            e62Var.B(null);
        }
        e62Var.m(str);
        e62Var.p().edit().remove(str).apply();
        e62Var.s.remove(str);
        e62Var.d();
    }

    public final void p(String str, boolean z) {
        mu0 mu0Var = null;
        this.p.setValue(qq0.g(a(), str, null, 2));
        if (z) {
            m50.T(v70.d(this), null, new fr0(this, mu0Var, (byte) 7), 3);
        }
    }

    public final void q(int i, int i2, boolean z) {
        if (!this.k) {
            this.d.setValue(Boolean.TRUE);
        }
        m50.T(v70.d(this), null, new mr0(this, i, i2, z, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        if (r14.n(0, r13, false, r0) == r9) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r13, java.lang.Integer r14, defpackage.ou0 r15) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr0.s(java.lang.String, java.lang.Integer, ou0):java.lang.Object");
    }

    public final k40 t() {
        x30 x30Var = this.r.l.y;
        if (x30Var == null) {
            return null;
        }
        Object obj = x30Var.g.get(v54.g(k40.class));
        return (k40) (obj instanceof k40 ? obj : null);
    }

    public final void u() {
        this.r.n(l());
        if (l()) {
            return;
        }
        ji0 ji0VarD = v70.d(this);
        x21 x21Var = na1.g;
        m50.T(ji0VarD, c21.a, new b8(this, null, (byte) 6), 2);
    }

    public final void v(String str) {
        str.getClass();
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            g61 g61Var = (g61) this.m.j.getValue();
            if (yf2.p(g61Var != null ? g61Var.t : null, str)) {
                return;
            }
            this.j.g(str);
        }
    }

    public final void w(int i, int i2, boolean z) {
        m50.T(v70.d(this), null, new nr0(this, i2, i, z, null), 3);
    }
}
