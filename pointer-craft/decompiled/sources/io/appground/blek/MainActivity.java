package io.appground.blek;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.a11;
import defpackage.ao2;
import defpackage.b30;
import defpackage.c41;
import defpackage.d52;
import defpackage.f03;
import defpackage.gp;
import defpackage.h03;
import defpackage.jg1;
import defpackage.ji;
import defpackage.kg1;
import defpackage.kl;
import defpackage.kz0;
import defpackage.l4;
import defpackage.lg1;
import defpackage.lr;
import defpackage.mg1;
import defpackage.nd4;
import defpackage.ng1;
import defpackage.nm0;
import defpackage.og0;
import defpackage.og1;
import defpackage.or;
import defpackage.pg1;
import defpackage.pr;
import defpackage.pw5;
import defpackage.q64;
import defpackage.qg1;
import defpackage.qr0;
import defpackage.rg1;
import defpackage.rv;
import defpackage.s02;
import defpackage.sg1;
import defpackage.sv1;
import defpackage.tl;
import defpackage.tl5;
import defpackage.u62;
import defpackage.ue5;
import defpackage.uf1;
import defpackage.v05;
import defpackage.v54;
import defpackage.wk;
import defpackage.wm4;
import defpackage.xk;
import defpackage.yf2;
import defpackage.yk;
import defpackage.yp2;
import defpackage.zl0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends yk implements s02 {
    public static final /* synthetic */ int Q = 0;
    public volatile l4 I;
    public final Object J;
    public boolean K;
    public final rv L;
    public final rv M;
    public final rv N;
    public final rv O;
    public final rv P;

    public MainActivity() {
        ((ji) this.m.a).T("androidx:appcompat", new wk(this));
        byte b = 0;
        m(new xk(this, b));
        this.J = new Object();
        this.K = false;
        byte b2 = 1;
        m(new xk(this, b2));
        this.L = new rv(v54.g(qr0.class), new h03(this, (byte) 7), new h03(this, (byte) 6), new h03(this, (byte) 8));
        this.M = new rv(v54.g(ao2.class), new h03(this, (byte) 10), new h03(this, (byte) 9), new h03(this, (byte) 11));
        this.N = new rv(v54.g(wm4.class), new h03(this, (byte) 13), new h03(this, (byte) 12), new h03(this, (byte) 14));
        this.O = new rv(v54.g(gp.class), new h03(this, b2), new h03(this, b), new h03(this, (byte) 2));
        this.P = new rv(v54.g(b30.class), new h03(this, (byte) 4), new h03(this, (byte) 3), new h03(this, (byte) 5));
    }

    public final l4 f() {
        if (this.I == null) {
            synchronized (this.J) {
                try {
                    if (this.I == null) {
                        this.I = new l4(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.I;
    }

    public final void k(Bundle bundle) {
        super.onCreate(bundle);
        f().y();
    }

    @Override // defpackage.r02
    public final Object n() {
        return f().n();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    @Override // defpackage.yk, defpackage.yl0, defpackage.xl0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        setTheme(R.style.AppTheme);
        SharedPreferences sharedPreferences = d52.b;
        String string = sharedPreferences != null ? sharedPreferences.getString("theme_option", "light") : null;
        if (string == null) {
            i = 1;
        } else {
            int iHashCode = string.hashCode();
            if (iHashCode != 3075958) {
                if (iHashCode != 93818879) {
                    if (iHashCode == 102970646 && string.equals("light")) {
                        i = 1;
                    }
                } else if (string.equals("black")) {
                    i = 2;
                }
                i = -1;
            } else if (string.equals("dark")) {
                i = 2;
            } else {
                i = -1;
            }
        }
        if (i != -1 && i != 0 && i != 1 && i != 2) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (kl.t != i) {
            kl.t = i;
            synchronized (kl.i) {
                try {
                    or orVar = kl.c;
                    orVar.getClass();
                    lr lrVar = new lr(orVar);
                    while (lrVar.hasNext()) {
                        kl klVar = (kl) ((WeakReference) lrVar.next()).get();
                        if (klVar != null) {
                            ((tl) klVar).q(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        k(bundle);
        SharedPreferences sharedPreferences2 = d52.b;
        sharedPreferences2.getClass();
        byte b = 0;
        if (sharedPreferences2.getBoolean("activate_outline_theme", false)) {
            setTheme(R.style.ThemeOverlay_Outlined);
        }
        SharedPreferences sharedPreferences3 = d52.b;
        sharedPreferences3.getClass();
        String string2 = sharedPreferences3.getString("theme_color", "default");
        if (!yf2.p(string2, "default")) {
            if (yf2.p(string2, "dynamic")) {
                uf1.g(this);
            } else {
                String[] stringArray = getResources().getStringArray(R.array.theme_color_values);
                stringArray.getClass();
                int iB0 = pr.b0(stringArray, string2);
                if (iB0 > 0) {
                    TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.theme_color_styles);
                    typedArrayObtainTypedArray.getClass();
                    int resourceId = typedArrayObtainTypedArray.getResourceId(iB0, 0);
                    typedArrayObtainTypedArray.recycle();
                    setTheme(resourceId);
                }
            }
        }
        SharedPreferences sharedPreferences4 = d52.b;
        sharedPreferences4.getClass();
        if (yf2.p(sharedPreferences4.getString("theme_option", "system"), "black")) {
            setTheme(R.style.ThemeOverlay_Blackground);
        }
        byte b2 = 25;
        v05 v05Var = new v05(0, 0, new nd4(b2));
        v05 v05Var2 = new v05(lg1.g, lg1.y, new nd4(b2));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        sg1 ng1Var = lg1.r;
        if (ng1Var == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 35) {
                ng1Var = new rg1();
            } else if (i2 >= 30) {
                ng1Var = new qg1();
            } else if (i2 >= 29) {
                ng1Var = new pg1();
            } else if (i2 >= 28) {
                ng1Var = new og1();
            } else {
                ng1Var = i2 >= 26 ? new ng1() : new mg1();
            }
            lg1.r = ng1Var;
        }
        sg1 sg1Var = ng1Var;
        jg1 jg1Var = new jg1(sg1Var, v05Var, v05Var2, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i3 = 0;
        while (true) {
            if (i3 >= viewGroup.getChildCount()) {
                kg1 kg1Var = new kg1(jg1Var, viewGroup.getContext());
                kg1Var.setTag(sg1Var);
                kg1Var.setVisibility(8);
                kg1Var.setWillNotDraw(true);
                viewGroup.addView(kg1Var);
                break;
            }
            int i4 = i3 + 1;
            View childAt = viewGroup.getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof sg1) {
                break;
            } else {
                i3 = i4;
            }
        }
        jg1Var.run();
        Window window = getWindow();
        window.getClass();
        sg1Var.g(window);
        if (Build.VERSION.SDK_INT <= 29) {
            View decorView2 = getWindow().getDecorView();
            decorView2.getClass();
            decorView2.setSystemUiVisibility((decorView2.getSystemUiVisibility() & (-257)) | 3584);
        }
        if (bundle == null) {
            Intent intent = getIntent();
            intent.getClass();
            if ((intent.getFlags() & 1048576) == 0) {
                ((gp) this.O.getValue()).n.setValue(getIntent());
            }
        }
        zl0.g(this, new nm0(1767909850, true, new f03(this, b)));
    }

    @Override // defpackage.yk, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        sv1 sv1Var = f().q;
        if (sv1Var != null) {
            sv1Var.y = null;
        }
    }

    @Override // defpackage.yl0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        try {
            super.onNewIntent(intent);
        } catch (NullPointerException unused) {
        }
        ((gp) this.O.getValue()).n.setValue(intent);
    }

    @Override // defpackage.yk, defpackage.yl0, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (int i2 : iArr) {
            if (i2 != 0) {
                return;
            }
        }
        ((qr0) this.L.getValue()).u();
    }

    @Override // defpackage.yk, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            og0.i(this);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 31) {
            List listD = pw5.d("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE");
            if (!listD.isEmpty()) {
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    if (ue5.D(this, (String) it.next()) != 0) {
                        return;
                    }
                }
            }
        }
        ((qr0) this.L.getValue()).u();
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
