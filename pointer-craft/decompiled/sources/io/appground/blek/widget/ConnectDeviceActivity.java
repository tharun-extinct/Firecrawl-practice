package io.appground.blek.widget;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import defpackage.a11;
import defpackage.c40;
import defpackage.c41;
import defpackage.d52;
import defpackage.ex;
import defpackage.kz0;
import defpackage.l4;
import defpackage.l62;
import defpackage.m50;
import defpackage.mq2;
import defpackage.nm0;
import defpackage.np3;
import defpackage.o04;
import defpackage.q64;
import defpackage.s02;
import defpackage.sv1;
import defpackage.tl5;
import defpackage.tx4;
import defpackage.u62;
import defpackage.w62;
import defpackage.wo;
import defpackage.yf2;
import defpackage.yi2;
import defpackage.yl0;
import defpackage.yp2;
import defpackage.zl0;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectDeviceActivity extends yl0 implements s02 {
    public static final /* synthetic */ int H = 0;
    public volatile l4 C;
    public final Object D = new Object();
    public boolean E = false;
    public l62 F;
    public yi2 G;

    public ConnectDeviceActivity() {
        m(new w62(this, (byte) 0));
    }

    public final l62 b() {
        l62 l62Var = this.F;
        if (l62Var != null) {
            return l62Var;
        }
        yf2.Y("hidServiceRepository");
        throw null;
    }

    public final l4 i() {
        if (this.C == null) {
            synchronized (this.D) {
                try {
                    if (this.C == null) {
                        this.C = new l4(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.C;
    }

    @Override // defpackage.r02
    public final Object n() {
        return i().n();
    }

    @Override // defpackage.yl0, defpackage.xl0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o04 o04Var;
        String string;
        s(bundle);
        String stringExtra = getIntent().getStringExtra("io.appground.MAC_ADDRESS");
        if (stringExtra == null || tx4.Y(stringExtra)) {
            finish();
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("io.appground.blek.DEVICE_NAME");
        if (stringExtra2 == null) {
            stringExtra2 = stringExtra;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("action")) == null) {
            o04Var = null;
        } else {
            try {
                byte[] bArrG = ex.g(ex.v, string);
                o04Var = new o04();
                np3.l(o04Var, bArrG);
            } catch (Exception unused) {
                o04Var = null;
            }
        }
        try {
            l62 l62VarB = b();
            SharedPreferences sharedPreferences = d52.b;
            boolean z = false;
            if (sharedPreferences != null) {
                z = sharedPreferences.getBoolean("forceBleMode_" + Build.VERSION.SDK_INT, false);
            }
            l62VarB.n(z);
        } catch (Throwable unused2) {
        }
        zl0.g(this, new nm0(-1519165988, true, new wo(stringExtra2, (byte) 3)));
        m50.T(mq2.a(this), null, new c40(o04Var, this, stringExtra, null), 3);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        sv1 sv1Var = i().q;
        if (sv1Var != null) {
            sv1Var.y = null;
        }
    }

    public final void s(Bundle bundle) {
        super.onCreate(bundle);
        i().y();
    }

    @Override // defpackage.yl0, defpackage.a52
    public final tl5 x() {
        tl5 tl5VarX = super.x();
        kz0 kz0Var = (kz0) ((c41) a11.u(c41.class, this));
        yp2 yp2VarG = kz0Var.g();
        q64 q64Var = new q64(kz0Var.g, kz0Var.y);
        tl5VarX.getClass();
        return new u62(yp2VarG, tl5VarX, q64Var);
    }
}
