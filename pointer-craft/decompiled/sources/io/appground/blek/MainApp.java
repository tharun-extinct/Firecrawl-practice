package io.appground.blek;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import defpackage.a11;
import defpackage.c21;
import defpackage.iq;
import defpackage.iv4;
import defpackage.k03;
import defpackage.k33;
import defpackage.ku0;
import defpackage.l03;
import defpackage.l62;
import defpackage.m03;
import defpackage.m50;
import defpackage.mu0;
import defpackage.na1;
import defpackage.np;
import defpackage.nz0;
import defpackage.o03;
import defpackage.p03;
import defpackage.q64;
import defpackage.s02;
import defpackage.t42;
import defpackage.v13;
import defpackage.v20;
import defpackage.wn5;
import defpackage.x21;
import defpackage.y94;
import defpackage.yf2;
import defpackage.yy4;

/* JADX INFO: loaded from: classes.dex */
public class MainApp extends Application implements s02 {
    public l62 a;
    public int b;
    public iv4 c;
    public int i;
    public v20 m;
    public wn5 q;
    public iv4 s;
    public final ku0 w;
    public boolean j = false;
    public final iq t = new iq(new q64((Object) this, (byte) 21));

    public MainApp() {
        x21 x21Var = na1.g;
        t42 t42Var = p03.g;
        yy4 yy4VarV = v13.v();
        t42Var.getClass();
        this.w = k33.x(a11.k(t42Var, yy4VarV));
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        context.getClass();
        super.attachBaseContext(context);
        y94.d(context);
    }

    public final l62 g() {
        l62 l62Var = this.a;
        if (l62Var != null) {
            return l62Var;
        }
        yf2.Y("hidServiceRepository");
        throw null;
    }

    @Override // defpackage.r02
    public final Object n() {
        return this.t.n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // android.app.Application
    public final void onCreate() {
        boolean z;
        y();
        SharedPreferences sharedPreferencesD = y94.d(this);
        byte b = 1;
        byte b2 = 0;
        if (sharedPreferencesD != null) {
            if (sharedPreferencesD.getBoolean("forceBleMode_" + Build.VERSION.SDK_INT, false)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        x21 x21Var = na1.g;
        c21 c21Var = c21.a;
        mu0 mu0Var = null;
        l03 l03Var = new l03(this, z, null);
        ku0 ku0Var = this.w;
        m50.T(ku0Var, c21Var, l03Var, 2);
        if (Build.VERSION.SDK_INT >= 35) {
            m50.T(ku0Var, na1.g, new m03(this, mu0Var, b2), 2);
        }
        m50.T(ku0Var, null, new m03(this, mu0Var, b), 3);
        registerActivityLifecycleCallbacks(new k03(this));
        wn5 wn5Var = this.q;
        if (wn5Var != null) {
            m50.T(ku0Var, null, new np(wn5Var, mu0Var, (byte) 12), 3);
        } else {
            yf2.Y("widgetConnectionObserver");
            throw null;
        }
    }

    public final void y() {
        if (!this.j) {
            this.j = true;
            nz0 nz0Var = (nz0) ((o03) this.t.n());
            this.a = (l62) nz0Var.r.get();
            this.m = (v20) nz0Var.x.get();
            this.q = (wn5) nz0Var.l.get();
        }
        super.onCreate();
    }
}
