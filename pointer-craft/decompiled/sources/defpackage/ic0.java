package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class ic0 implements dd5 {
    public final q64 g;
    public final URL n;
    public final Context r;
    public final di0 v;
    public final di0 x;
    public final ConnectivityManager y;

    public ic0(Context context, di0 di0Var, di0 di0Var2) {
        sh2 sh2Var = new sh2();
        ds dsVar = ds.g;
        sh2Var.g(b00.class, dsVar);
        sh2Var.g(fu.class, dsVar);
        gs gsVar = gs.g;
        sh2Var.g(fy2.class, gsVar);
        sh2Var.g(ru.class, gsVar);
        es esVar = es.g;
        sh2Var.g(yh0.class, esVar);
        sh2Var.g(gu.class, esVar);
        cs csVar = cs.g;
        sh2Var.g(f9.class, csVar);
        sh2Var.g(cu.class, csVar);
        fs fsVar = fs.g;
        sh2Var.g(cy2.class, fsVar);
        sh2Var.g(qu.class, fsVar);
        hs hsVar = hs.g;
        sh2Var.g(mg3.class, hsVar);
        sh2Var.g(tu.class, hsVar);
        sh2Var.n = true;
        this.g = new q64((Object) sh2Var, (byte) 22);
        this.r = context;
        this.y = (ConnectivityManager) context.getSystemService("connectivity");
        this.n = y(ga0.r);
        this.v = di0Var2;
        this.x = di0Var;
    }

    public static URL y(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(xi3.t("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x010e  */
    public final ju g(ju juVar) {
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.y.getActiveNetworkInfo();
        vl vlVarR = juVar.r();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) vlVarR.x;
        if (map2 == null) {
            l0.z("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        vlVarR.t("model", Build.MODEL);
        vlVarR.t("hardware", Build.HARDWARE);
        vlVarR.t("device", Build.DEVICE);
        vlVarR.t("product", Build.PRODUCT);
        vlVarR.t("os-uild", Build.ID);
        vlVarR.t("manufacturer", Build.MANUFACTURER);
        vlVarR.t("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) vlVarR.x;
        if (map3 == null) {
            l0.z("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int iY = activeNetworkInfo == null ? lg3.t.y() : activeNetworkInfo.getType();
        HashMap map4 = (HashMap) vlVarR.x;
        if (map4 == null) {
            l0.z("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(iY));
        int i2 = -1;
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray = kg3.j;
                subtype = 100;
            } else if (((kg3) kg3.j.get(subtype)) == null) {
            }
            map = (HashMap) vlVarR.x;
            if (map != null) {
                l0.z("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            vlVarR.t("country", Locale.getDefault().getCountry());
            vlVarR.t("locale", Locale.getDefault().getLanguage());
            Context context = this.r;
            vlVarR.t("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                sp2.w("CctTransportBackend", "Unable to find version code for package", e);
            }
            vlVarR.t("application_build", Integer.toString(i2));
            return vlVarR.m();
        }
        SparseArray sparseArray2 = kg3.j;
        subtype = 0;
        map = (HashMap) vlVarR.x;
        if (map != null) {
            l0.z("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        vlVarR.t("country", Locale.getDefault().getCountry());
        vlVarR.t("locale", Locale.getDefault().getLanguage());
        Context context2 = this.r;
        vlVarR.t("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        vlVarR.t("application_build", Integer.toString(i2));
        return vlVarR.m();
    }
}
