package defpackage;

import android.app.Application;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gf implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ gf(z60 z60Var, long j) {
        this.j = (byte) 0;
        this.t = z60Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b;
        dy1 dy1Var;
        vz0 vz0VarG;
        byte b2 = this.j;
        boolean zIsEnabled = true;
        Object obj = this.t;
        switch (b2) {
            case 0:
                return ((a70) ((z60) obj)).y();
            case 1:
                ((nf3) obj).g.g();
                return og5.g;
            case 2:
                jd2 jd2Var = (jd2) obj;
                if (Build.VERSION.SDK_INT < 28) {
                    return null;
                }
                int iOrdinal = jd2Var.ordinal();
                if (iOrdinal == 0) {
                    b = -64;
                } else {
                    if (iOrdinal != 1) {
                        uo1.g();
                        return null;
                    }
                    b = 2;
                }
                return new pg0(b);
            case 3:
                k33.d((ez3) obj, new ah5());
                return og5.g;
            case 4:
                boolean zG = qe2.g(0L, 0L);
                View view = ((mo0) obj).g;
                return zG ? ai6.g(view) : le6.g(k33.l(view.getContext()));
            case 5:
                return (BluetoothManager) ((Application) obj).getSystemService(BluetoothManager.class);
            case 6:
                ((gx3) obj).n.l("pro_upgrade_button", null);
                return og5.g;
            case 7:
                ((cu1) obj).S0();
                return og5.g;
            case 8:
                ey1 ey1Var = (ey1) obj;
                gz4 gz4Var = ey1Var.a;
                Context context = ey1Var.j;
                String str = ey1Var.t;
                if (str == null || !ey1Var.m) {
                    dy1Var = new dy1(context, str, new q64((byte) 20), gz4Var);
                } else {
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    dy1Var = new dy1(context, new File(noBackupFilesDir, str).getAbsolutePath(), new q64((byte) 20), gz4Var);
                }
                dy1Var.setWriteAheadLoggingEnabled(ey1Var.w);
                return dy1Var;
            case 9:
                return ((h02) obj).w();
            case 10:
                f22 f22Var = (f22) obj;
                synchronized (f22.n) {
                    try {
                        vz0VarG = f22.x;
                        if (vz0VarG == null) {
                            File fileA = v13.A(f22Var.g, "GlanceAppWidgetManager");
                            File file = fileA.exists() ? fileA : null;
                            if (file != null) {
                                file.delete();
                            }
                            Context context2 = f22Var.g;
                            ci2[] ci2VarArr = a22.g;
                            vz0VarG = f22.v.g(context2, a22.g[0]);
                            f22.x = vz0VarG;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return vz0VarG;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                PackageManager packageManager = ((Context) ((gc0) ((u52) obj)).t).getPackageManager();
                packageManager.getClass();
                if (Build.VERSION.SDK_INT < 34) {
                    String[] strArr = {"com.android.bluetooth", "com.google.android.bluetooth.services", "com.google.android.bluetooth"};
                    for (int i = 0; i < 3; i++) {
                        try {
                            zIsEnabled = packageManager.getServiceInfo(new ComponentName(strArr[i], "com.android.bluetooth.hid.HidDeviceService"), 0).isEnabled();
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                    zIsEnabled = false;
                } else if (!fj.g("bluetooth.profile.hid.device.enabled")) {
                    zIsEnabled = true ^ fj.g("bluetooth.profile.hid.host.enabled");
                }
                return Boolean.valueOf(zIsEnabled);
            case 12:
                return Float.valueOf(kq2.C(((ox0) obj).w()));
            case 13:
                Object systemService = ((View) ((ro) obj).t).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 14:
                x94 x94Var = ((og2) obj).g;
                if (x94Var.q() && !x94Var.b()) {
                    zIsEnabled = false;
                }
                return Boolean.valueOf(zIsEnabled);
            case kq2.x /* 15 */:
                ym2 ym2Var = ((um2) obj).N;
                ym2Var.b.H = true;
                fz2 fz2Var = ym2Var.s;
                if (fz2Var != null) {
                    fz2Var.S0();
                }
                return og5.g;
            case 16:
                y03 y03Var = (y03) ((lu2) obj).g.t;
                if (!y03Var.t) {
                    if (y03Var.a) {
                        bw3.g("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    y03Var.g();
                    y03Var.a = true;
                }
                return og5.g;
            case 17:
                ((b30) obj).x();
                return og5.g;
            case 18:
                k73 k73Var = (k73) obj;
                k73Var.x = false;
                HashSet hashSet = new HashSet();
                xa3 xa3Var = k73Var.n;
                if (xa3Var != null) {
                    Object[] objArr = xa3Var.g;
                    int i2 = xa3Var.y;
                    for (int i3 = 0; i3 < i2; i3++) {
                        um2 um2Var = (um2) objArr[i3];
                        xa3 xa3Var2 = k73Var.v;
                        if (xa3Var2 == null) {
                            xa3Var2 = new xa3();
                            k73Var.v = xa3Var2;
                        }
                        k14 k14Var = (k14) xa3Var2.l(i3);
                        i73 i73Var = um2Var.M.x;
                        if (i73Var.h) {
                            k73.y(i73Var, k14Var);
                        }
                    }
                    xa3Var.n();
                    xa3 xa3Var3 = k73Var.v;
                    if (xa3Var3 != null) {
                        xa3Var3.n();
                    }
                }
                xa3 xa3Var4 = k73Var.y;
                if (xa3Var4 != null) {
                    Object[] objArr2 = xa3Var4.g;
                    int i4 = xa3Var4.y;
                    for (int i5 = 0; i5 < i4; i5++) {
                        rw rwVar = (rw) objArr2[i5];
                        xa3 xa3Var5 = k73Var.r;
                        if (xa3Var5 == null) {
                            xa3Var5 = new xa3();
                            k73Var.r = xa3Var5;
                        }
                        k14 k14Var2 = (k14) xa3Var5.l(i5);
                        if (rwVar.h) {
                            k73.y(rwVar, k14Var2);
                        }
                    }
                    xa3Var4.n();
                    xa3 xa3Var6 = k73Var.r;
                    if (xa3Var6 != null) {
                        xa3Var6.n();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((rw) it.next()).S0();
                }
                return og5.g;
            case 19:
                return new yc3((String) obj);
            case 20:
                List list = (List) ((bw4) obj).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (yf2.p(((mc3) obj2).t.j, "composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 21:
                return ((ag3) obj).n;
            case 22:
                return ((eg3) obj).Q0();
            case 23:
                return Integer.valueOf(((List) obj).size());
            case 24:
                return new u21(0, 0.0f, (my1) obj);
            case 25:
                iq3 iq3Var = (iq3) obj;
                return iq3Var.j.r(iq3Var.t);
            case 26:
                m44 m44Var = (m44) obj;
                m44Var.t = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    m44Var.g();
                    return og5.g;
                } finally {
                    Trace.endSection();
                }
            case 27:
                pc4 pc4Var = (pc4) obj;
                md4 md4Var = pc4Var.j;
                Object obj3 = pc4Var.m;
                if (obj3 != null) {
                    return md4Var.j(pc4Var, obj3);
                }
                l0.u("Value should be initialized");
                return null;
            case 28:
                ji jiVar = ((xc4) obj).a;
                if (jiVar == null) {
                    return null;
                }
                Bundle bundleN = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
                jiVar.R(bundleN);
                if (bundleN.isEmpty()) {
                    return null;
                }
                return bundleN;
            default:
                return k33.L((wl5) obj);
        }
    }

    public /* synthetic */ gf(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }
}
