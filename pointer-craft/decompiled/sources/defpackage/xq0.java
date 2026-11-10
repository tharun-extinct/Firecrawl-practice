package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class xq0 implements gr1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ qr0 t;

    public /* synthetic */ xq0(qr0 qr0Var, byte b) {
        this.j = b;
        this.t = qr0Var;
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        int i;
        byte b = this.j;
        og5 og5Var = og5.g;
        qr0 qr0Var = this.t;
        switch (b) {
            case 0:
                return g((g61) obj, mu0Var);
            case 1:
                ex4 ex4Var = (ex4) obj;
                SharedPreferences sharedPreferences = qr0Var.x;
                if (yf2.p(ex4Var, dx4.y)) {
                    return og5Var;
                }
                if (yf2.p(ex4Var, dx4.g)) {
                    if (qr0Var.t.j.getValue() == dq0.j) {
                        sharedPreferences.edit().putBoolean("classicModeAvailable", true).apply();
                        qr0Var.a = false;
                    }
                    qr0Var.p.setValue(qq0.g(qr0Var.a(), null, null, 1));
                    return og5Var;
                }
                if (!(ex4Var instanceof cx4)) {
                    uo1.g();
                    return null;
                }
                if (zq0.g[((cx4) ex4Var).g.ordinal()] != 1 || sharedPreferences.getBoolean("classicModeAvailable", false)) {
                    return og5Var;
                }
                if (!qr0Var.a || ((i = Build.VERSION.SDK_INT) >= 31 && qr0Var.y.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") != 0)) {
                    qr0Var.a = true;
                    return og5Var;
                }
                qr0Var.a = false;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.getClass();
                editorEdit.putBoolean("forceBleMode_" + i, true);
                editorEdit.apply();
                qr0Var.u();
                return og5Var;
            default:
                String str = (String) obj;
                yi2 yi2Var = qr0Var.n;
                yi2Var.getClass();
                str.getClass();
                if (ay4.P(str, "custom:", false)) {
                    to2 to2VarG = yi2Var.g.g(str);
                    if (to2VarG != null) {
                        yi2Var.v(yi2.y(yi2Var, to2VarG));
                    }
                } else {
                    yi2Var.v(vp2.n(str));
                }
                return og5Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(g61 g61Var, mu0 mu0Var) {
        wq0 wq0Var;
        if (mu0Var instanceof wq0) {
            wq0Var = (wq0) mu0Var;
            int i = wq0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                wq0Var.w = i - Integer.MIN_VALUE;
            } else {
                wq0Var = new wq0(this, mu0Var);
            }
        } else {
            wq0Var = new wq0(this, mu0Var);
        }
        Object obj = wq0Var.m;
        int i2 = wq0Var.w;
        og5 og5Var = og5.g;
        mu0 mu0Var2 = null;
        qr0 qr0Var = this.t;
        byte b = 1;
        if (i2 == 0) {
            js2.o(obj);
            if (g61Var.c == 2) {
                Context context = qr0Var.y;
                String str = g61Var.t;
                wq0Var.w = 1;
                x21 x21Var = na1.g;
                Object objF0 = m50.f0(c21.a, new c(qr0Var, context, str, mu0Var2, (byte) 18), wq0Var);
                px0 px0Var = px0.j;
                if (objF0 != px0Var) {
                    objF0 = og5Var;
                }
                if (objF0 == px0Var) {
                    return px0Var;
                }
            }
            return og5Var;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj);
        m50.T(v70.d(qr0Var), null, new fr0(qr0Var, mu0Var2, b), 3);
        if (!qr0Var.o) {
            qr0Var.o = true;
            SharedPreferences sharedPreferencesD = y94.d(qr0Var.v.g);
            if (sharedPreferencesD != null) {
                int i3 = sharedPreferencesD.getInt("review_sessions_count", 0);
                SharedPreferences.Editor editorEdit = sharedPreferencesD.edit();
                editorEdit.getClass();
                editorEdit.putInt("review_sessions_count", i3 + 1);
                editorEdit.apply();
            }
        }
        return og5Var;
    }
}
