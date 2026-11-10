package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class yk extends yl0 implements dl {
    public boolean E;
    public boolean F;
    public tl H;
    public final y22 C = new y22((Object) new rw1(this), (byte) 17);
    public final ju2 D = new ju2(this, true);
    public boolean G = true;

    public yk() {
        final byte b = 1;
        ((ji) this.m.a).T("android:support:lifecycle", new rl0(this, (byte) 2));
        final byte b2 = 0;
        this.s.add(new et0(this) { // from class: qw1
            public final /* synthetic */ yk y;

            {
                this.y = this;
            }

            @Override // defpackage.et0
            public final void accept(Object obj) {
                byte b3 = b2;
                yk ykVar = this.y;
                switch (b3) {
                    case 0:
                        ykVar.C.h();
                        break;
                    default:
                        ykVar.C.h();
                        break;
                }
            }
        });
        this.u.add(new et0(this) { // from class: qw1
            public final /* synthetic */ yk y;

            {
                this.y = this;
            }

            @Override // defpackage.et0
            public final void accept(Object obj) {
                byte b3 = b;
                yk ykVar = this.y;
                switch (b3) {
                    case 0:
                        ykVar.C.h();
                        break;
                    default:
                        ykVar.C.h();
                        break;
                }
            }
        });
        m(new sl0(this, b));
    }

    public static boolean s(kx1 kx1Var) {
        boolean zS = false;
        for (pw1 pw1Var : kx1Var.r.u()) {
            if (pw1Var != null) {
                rw1 rw1Var = pw1Var.B;
                if ((rw1Var == null ? null : rw1Var.A) != null) {
                    zS |= s(pw1Var.j());
                }
                xx1 xx1Var = pw1Var.Z;
                wt2 wt2Var = wt2.m;
                wt2 wt2Var2 = wt2.a;
                if (xx1Var != null) {
                    xx1Var.n();
                    if (xx1Var.q.t.compareTo(wt2Var) >= 0) {
                        pw1Var.Z.q.l(wt2Var2);
                        zS = true;
                    }
                }
                if (pw1Var.X.t.compareTo(wt2Var) >= 0) {
                    pw1Var.X.l(wt2Var2);
                    zS = true;
                }
            }
        }
        return zS;
    }

    @Override // defpackage.yl0, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        tl tlVar = (tl) i();
        tlVar.o();
        ((ViewGroup) tlVar.G.findViewById(R.id.content)).addView(view, layoutParams);
        tlVar.z.g(tlVar.u.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018e  */
    /* JADX WARN: Code duplicated, block: B:105:0x019d  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x012d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0135  */
    /* JADX WARN: Code duplicated, block: B:84:0x013d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:96:0x0176  */
    /* JADX WARN: Code duplicated, block: B:99:0x0181  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        lu0 lu0Var;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        LocaleList locales;
        LocaleList locales2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        tl tlVar = (tl) i();
        tlVar.T = true;
        int i37 = tlVar.X;
        if (i37 == -100) {
            i37 = kl.t;
        }
        int iA = tlVar.A(context, i37);
        byte b = 0;
        if (kl.y(context) && kl.y(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (kl.b) {
                    try {
                        ux2 ux2Var = kl.a;
                        if (ux2Var == null) {
                            ux2 ux2VarG = kl.m;
                            if (ux2VarG == null) {
                                ux2VarG = ux2.g(rs5.n(context));
                                kl.m = ux2VarG;
                            }
                            if (!ux2VarG.g.g.isEmpty()) {
                                kl.a = kl.m;
                            }
                        } else if (!ux2Var.equals(kl.m)) {
                            ux2 ux2Var2 = kl.a;
                            kl.m = ux2Var2;
                            rs5.r(context, ux2Var2.g.g.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!kl.w) {
                kl.j.execute(new il(context, b));
            }
        }
        ux2 ux2VarC = tl.c(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(tl.p(context, iA, ux2VarC, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof lu0) {
                    try {
                        ((lu0) context).g(tl.p(context, iA, ux2VarC, null, false));
                    } catch (IllegalStateException unused2) {
                        if (tl.o0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    locales = configuration.getLocales();
                                    locales2 = configuration2.getLocales();
                                    if (!locales.equals(locales2)) {
                                        configuration3.setLocales(locales2);
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        dt5.y(configuration, configuration2, configuration3);
                                    }
                                    i25 = configuration.uiMode & 15;
                                    i26 = configuration2.uiMode & 15;
                                    if (i25 != i26) {
                                        configuration3.uiMode |= i26;
                                    }
                                    i27 = configuration.uiMode & 48;
                                    i28 = configuration2.uiMode & 48;
                                    if (i27 != i28) {
                                        configuration3.uiMode |= i28;
                                    }
                                    i29 = configuration.screenWidthDp;
                                    i30 = configuration2.screenWidthDp;
                                    if (i29 != i30) {
                                        configuration3.screenWidthDp = i30;
                                    }
                                    i31 = configuration.screenHeightDp;
                                    i32 = configuration2.screenHeightDp;
                                    if (i31 != i32) {
                                        configuration3.screenHeightDp = i32;
                                    }
                                    i33 = configuration.smallestScreenWidthDp;
                                    i34 = configuration2.smallestScreenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.smallestScreenWidthDp = i34;
                                    }
                                    i35 = configuration.densityDpi;
                                    i36 = configuration2.densityDpi;
                                    if (i35 != i36) {
                                        configuration3.densityDpi = i36;
                                    }
                                }
                            }
                            Configuration configurationP = tl.p(context, iA, ux2VarC, configuration3, true);
                            lu0Var = new lu0(context, io.appground.blek.R.style.Theme_AppCompat_Empty);
                            lu0Var.g(configurationP);
                            try {
                                if (context.getTheme() != null) {
                                    re6.v(lu0Var.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = lu0Var;
                        }
                    }
                } else if (tl.o0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            locales = configuration.getLocales();
                            locales2 = configuration2.getLocales();
                            if (!locales.equals(locales2)) {
                                configuration3.setLocales(locales2);
                                configuration3.locale = configuration2.locale;
                            }
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                dt5.y(configuration, configuration2, configuration3);
                            }
                            i25 = configuration.uiMode & 15;
                            i26 = configuration2.uiMode & 15;
                            if (i25 != i26) {
                                configuration3.uiMode |= i26;
                            }
                            i27 = configuration.uiMode & 48;
                            i28 = configuration2.uiMode & 48;
                            if (i27 != i28) {
                                configuration3.uiMode |= i28;
                            }
                            i29 = configuration.screenWidthDp;
                            i30 = configuration2.screenWidthDp;
                            if (i29 != i30) {
                                configuration3.screenWidthDp = i30;
                            }
                            i31 = configuration.screenHeightDp;
                            i32 = configuration2.screenHeightDp;
                            if (i31 != i32) {
                                configuration3.screenHeightDp = i32;
                            }
                            i33 = configuration.smallestScreenWidthDp;
                            i34 = configuration2.smallestScreenWidthDp;
                            if (i33 != i34) {
                                configuration3.smallestScreenWidthDp = i34;
                            }
                            i35 = configuration.densityDpi;
                            i36 = configuration2.densityDpi;
                            if (i35 != i36) {
                                configuration3.densityDpi = i36;
                            }
                        }
                    }
                    Configuration configurationP2 = tl.p(context, iA, ux2VarC, configuration3, true);
                    lu0Var = new lu0(context, io.appground.blek.R.style.Theme_AppCompat_Empty);
                    lu0Var.g(configurationP2);
                    if (context.getTheme() != null) {
                        re6.v(lu0Var.getTheme());
                    }
                    context = lu0Var;
                }
            }
        } else if (context instanceof lu0) {
            ((lu0) context).g(tl.p(context, iA, ux2VarC, null, false));
        } else if (tl.o0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    locales = configuration.getLocales();
                    locales2 = configuration2.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration3.setLocales(locales2);
                        configuration3.locale = configuration2.locale;
                    }
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        dt5.y(configuration, configuration2, configuration3);
                    }
                    i25 = configuration.uiMode & 15;
                    i26 = configuration2.uiMode & 15;
                    if (i25 != i26) {
                        configuration3.uiMode |= i26;
                    }
                    i27 = configuration.uiMode & 48;
                    i28 = configuration2.uiMode & 48;
                    if (i27 != i28) {
                        configuration3.uiMode |= i28;
                    }
                    i29 = configuration.screenWidthDp;
                    i30 = configuration2.screenWidthDp;
                    if (i29 != i30) {
                        configuration3.screenWidthDp = i30;
                    }
                    i31 = configuration.screenHeightDp;
                    i32 = configuration2.screenHeightDp;
                    if (i31 != i32) {
                        configuration3.screenHeightDp = i32;
                    }
                    i33 = configuration.smallestScreenWidthDp;
                    i34 = configuration2.smallestScreenWidthDp;
                    if (i33 != i34) {
                        configuration3.smallestScreenWidthDp = i34;
                    }
                    i35 = configuration.densityDpi;
                    i36 = configuration2.densityDpi;
                    if (i35 != i36) {
                        configuration3.densityDpi = i36;
                    }
                }
            }
            Configuration configurationP3 = tl.p(context, iA, ux2VarC, configuration3, true);
            lu0Var = new lu0(context, io.appground.blek.R.style.Theme_AppCompat_Empty);
            lu0Var.g(configurationP3);
            if (context.getTheme() != null) {
                re6.v(lu0Var.getTheme());
            }
            context = lu0Var;
        }
        super.attachBaseContext(context);
    }

    public final no5 b() {
        tl tlVar = (tl) i();
        tlVar.d();
        return tlVar.h;
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        b();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.xl0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        b();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.E);
        printWriter.print(" mResumed=");
        printWriter.print(this.F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        if (getApplication() != null) {
            vl5 vl5VarT = t();
            vl5VarT.getClass();
            xx0 xx0Var = xx0.y;
            xx0Var.getClass();
            kb5 kb5Var = new kb5(vl5VarT, gx2.r, xx0Var);
            tf0 tf0VarG = v54.g(gx2.class);
            String strY = tf0VarG.y();
            if (strY == null) {
                l0.u("Local and anonymous classes can not be ViewModels");
                return;
            }
            nu4 nu4Var = ((gx2) kb5Var.h(tf0VarG, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strY))).y;
            if (nu4Var.v() > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (nu4Var.v() > 0) {
                    fj.w(nu4Var.x(0));
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(nu4Var.r(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((rw1) this.C.t).e.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        tl tlVar = (tl) i();
        tlVar.o();
        return tlVar.u.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        tl tlVar = (tl) i();
        dz4 dz4Var = tlVar.o;
        if (dz4Var == null) {
            tlVar.d();
            no5 no5Var = tlVar.h;
            dz4Var = new dz4(no5Var != null ? no5Var.v() : tlVar.p);
            tlVar.o = dz4Var;
        }
        return dz4Var;
    }

    public final void h() {
        y22 y22Var = this.C;
        y22Var.h();
        rw1 rw1Var = (rw1) y22Var.t;
        super.onStart();
        this.G = false;
        if (!this.E) {
            this.E = true;
            kx1 kx1Var = rw1Var.e;
            kx1Var.H = false;
            kx1Var.I = false;
            kx1Var.O.l = false;
            kx1Var.o(4);
        }
        rw1Var.e.A(true);
        this.D.n(vt2.ON_START);
        kx1 kx1Var2 = rw1Var.e;
        kx1Var2.H = false;
        kx1Var2.I = false;
        kx1Var2.O.l = false;
        kx1Var2.o(5);
    }

    public final kl i() {
        tl tlVar = this.H;
        if (tlVar != null) {
            return tlVar;
        }
        jl jlVar = kl.j;
        tl tlVar2 = new tl(this, null, this, this);
        this.H = tlVar2;
        return tlVar2;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        tl tlVar = (tl) i();
        if (tlVar.h != null) {
            tlVar.d();
            tlVar.h.getClass();
            tlVar.e(0);
        }
    }

    public final void o() {
        y22 y22Var;
        super.onStop();
        this.G = true;
        do {
            y22Var = this.C;
        } while (s(((rw1) y22Var.t).e));
        kx1 kx1Var = ((rw1) y22Var.t).e;
        kx1Var.I = true;
        kx1Var.O.l = true;
        kx1Var.o(4);
        this.D.n(vt2.ON_STOP);
    }

    @Override // defpackage.yl0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.C.h();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.yl0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tl tlVar = (tl) i();
        if (tlVar.K && tlVar.F) {
            tlVar.d();
            no5 no5Var = tlVar.h;
            if (no5Var != null) {
                no5Var.l();
            }
        }
        wl wlVarG = wl.g();
        Context context = tlVar.p;
        synchronized (wlVarG) {
            s74 s74Var = wlVarG.g;
            synchronized (s74Var) {
                uy2 uy2Var = (uy2) s74Var.y.get(context);
                if (uy2Var != null) {
                    uy2Var.g();
                }
            }
        }
        tlVar.W = new Configuration(tlVar.p.getResources().getConfiguration());
        tlVar.q(false, false);
    }

    @Override // defpackage.yl0, defpackage.xl0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.D.n(vt2.ON_CREATE);
        kx1 kx1Var = ((rw1) this.C.t).e;
        kx1Var.H = false;
        kx1Var.I = false;
        kx1Var.O.l = false;
        kx1Var.o(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((rw1) this.C.t).e.x.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        p();
        i().n();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.yl0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentF;
        if (!u(i, menuItem)) {
            no5 no5VarB = b();
            if (menuItem.getItemId() != 16908332 || no5VarB == null || (no5VarB.n() & 4) == 0 || (intentF = jr2.f(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentF)) {
                navigateUpTo(intentF);
                return true;
            }
            c35 c35VarV = c35.v(this);
            c35VarV.y(this);
            c35VarV.x();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.F = false;
        kx1 kx1Var = ((rw1) this.C.t).e;
        if (kx1Var.j != null) {
            kx1Var.n();
        }
        kx1Var.o(5);
        this.D.n(vt2.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((tl) i()).o();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        z();
        tl tlVar = (tl) i();
        tlVar.d();
        no5 no5Var = tlVar.h;
        if (no5Var != null) {
            no5Var.m(true);
        }
    }

    @Override // defpackage.yl0, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.C.h();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        y22 y22Var = this.C;
        y22Var.h();
        super.onResume();
        this.F = true;
        ((rw1) y22Var.t).e.A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        h();
        ((tl) i()).q(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.C.h();
    }

    @Override // android.app.Activity
    public final void onStop() {
        o();
        tl tlVar = (tl) i();
        tlVar.d();
        no5 no5Var = tlVar.h;
        if (no5Var != null) {
            no5Var.m(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        i().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        b();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() throws Exception {
        super.onDestroy();
        ((rw1) this.C.t).e.w();
        this.D.n(vt2.ON_DESTROY);
    }

    @Override // defpackage.yl0, android.app.Activity
    public final void setContentView(int i) {
        q();
        i().l(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((tl) i()).Y = i;
    }

    public final boolean u(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((rw1) this.C.t).e.m();
        }
        return false;
    }

    public final void z() {
        super.onPostResume();
        this.D.n(vt2.ON_RESUME);
        kx1 kx1Var = ((rw1) this.C.t).e;
        kx1Var.H = false;
        kx1Var.I = false;
        kx1Var.O.l = false;
        kx1Var.o(7);
    }

    @Override // defpackage.yl0, android.app.Activity
    public void setContentView(View view) {
        q();
        i().t(view);
    }

    @Override // defpackage.yl0, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        i().a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((rw1) this.C.t).e.x.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
