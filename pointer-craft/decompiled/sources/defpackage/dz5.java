package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dz5 {
    public static ha2 x;
    public static final nm0 g = new nm0(1095005556, false, new sm0(16));
    public static final nm0 y = new nm0(-2066894472, false, new sm0(17));
    public static final nm0 r = new nm0(1693382571, false, new sm0(18));
    public static final nm0 n = new nm0(-157213223, false, new sm0(19));
    public static final nm0 v = new nm0(1727586972, false, new sm0(20));

    public static final void g(pl5 pl5Var, ji jiVar, ju2 ju2Var) {
        jiVar.getClass();
        ju2Var.getClass();
        zc4 zc4Var = (zc4) pl5Var.r("androidx.lifecycle.savedstate.vm.tag");
        if (zc4Var == null || zc4Var.a) {
            return;
        }
        zc4Var.w(jiVar, ju2Var);
        x(jiVar, ju2Var);
    }

    public static void n(Context context, jy3 jy3Var) {
        if (r(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
            jy3Var.q(14, null);
        } else {
            jy3Var.q(15, null);
        }
    }

    public static boolean r(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = r(file2) && z;
        }
        return z;
    }

    public static final ha2 v() {
        ha2 ha2Var = x;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.Toys", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(18.75f, 10.08f);
        kq3Var.x(17.4f, 6.05f);
        kq3Var.y(17.0f, 4.82f, 15.85f, 4.0f, 14.56f, 4.0f);
        kq3Var.n(9.44f);
        kq3Var.y(8.15f, 4.0f, 7.0f, 4.82f, 6.6f, 6.05f);
        kq3Var.x(5.81f, 8.4f);
        kq3Var.x(4.41f, 7.0f);
        kq3Var.l(0.29f, -0.29f);
        kq3Var.r(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        kq3Var.r(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        kq3Var.l(-2.0f, 2.0f);
        kq3Var.r(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        kq3Var.r(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        kq3Var.x(3.0f, 8.41f);
        kq3Var.l(1.79f, 1.79f);
        kq3Var.y(3.18f, 10.72f, 2.0f, 12.22f, 2.0f, 14.0f);
        kq3Var.r(0.0f, 1.49f, 0.83f, 2.78f, 2.05f, 3.47f);
        kq3Var.y(4.27f, 18.9f, 5.51f, 20.0f, 7.0f, 20.0f);
        kq3Var.r(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f);
        kq3Var.v(4.37f);
        kq3Var.r(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f);
        kq3Var.r(1.49f, 0.0f, 2.73f, -1.1f, 2.95f, -2.53f);
        kq3Var.y(21.17f, 16.78f, 22.0f, 15.49f, 22.0f, 14.0f);
        kq3Var.y(22.0f, 12.05f, 20.6f, 10.43f, 18.75f, 10.08f);
        kq3Var.g();
        kq3Var.j(13.0f, 6.0f);
        kq3Var.v(1.56f);
        kq3Var.r(0.43f, 0.0f, 0.81f, 0.27f, 0.95f, 0.68f);
        kq3Var.x(16.61f, 10.0f);
        kq3Var.n(13.0f);
        kq3Var.q(6.0f);
        kq3Var.g();
        kq3Var.j(8.49f, 6.68f);
        kq3Var.y(8.63f, 6.27f, 9.01f, 6.0f, 9.44f, 6.0f);
        kq3Var.n(11.0f);
        kq3Var.w(4.0f);
        kq3Var.n(7.41f);
        kq3Var.x(7.39f, 9.98f);
        kq3Var.x(8.49f, 6.68f);
        kq3Var.g();
        kq3Var.j(7.0f, 18.0f);
        kq3Var.r(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        kq3Var.m(0.45f, -1.0f, 1.0f, -1.0f);
        kq3Var.m(1.0f, 0.45f, 1.0f, 1.0f);
        kq3Var.a(7.55f, 18.0f, 7.0f, 18.0f);
        kq3Var.g();
        kq3Var.j(17.0f, 18.0f);
        kq3Var.r(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        kq3Var.m(0.45f, -1.0f, 1.0f, -1.0f);
        kq3Var.m(1.0f, 0.45f, 1.0f, 1.0f);
        kq3Var.a(17.55f, 18.0f, 17.0f, 18.0f);
        kq3Var.g();
        kq3Var.j(19.49f, 15.32f);
        kq3Var.y(18.95f, 14.53f, 18.03f, 14.0f, 17.0f, 14.0f);
        kq3Var.r(-1.3f, 0.0f, -2.4f, 0.84f, -2.82f, 2.0f);
        kq3Var.n(9.82f);
        kq3Var.y(9.4f, 14.84f, 8.3f, 14.0f, 7.0f, 14.0f);
        kq3Var.r(-1.03f, 0.0f, -1.95f, 0.53f, -2.49f, 1.32f);
        kq3Var.y(4.2f, 14.97f, 4.0f, 14.51f, 4.0f, 14.0f);
        kq3Var.r(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        kq3Var.v(12.0f);
        kq3Var.r(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        kq3Var.y(20.0f, 14.51f, 19.8f, 14.97f, 19.49f, 15.32f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        x = ha2VarY;
        return ha2VarY;
    }

    public static void x(ji jiVar, ju2 ju2Var) {
        wt2 wt2Var = ju2Var.t;
        if (wt2Var == wt2.t || wt2Var.compareTo(wt2.m) >= 0) {
            jiVar.U();
        } else {
            ju2Var.g(new ec(ju2Var, jiVar, (byte) 1));
        }
    }

    public static final zc4 y(ji jiVar, ju2 ju2Var, String str, Bundle bundle) {
        yc4 yc4Var;
        jiVar.getClass();
        ju2Var.getClass();
        Bundle bundleA = jiVar.a(str);
        if (bundleA != null) {
            bundle = bundleA;
        }
        if (bundle == null) {
            yc4Var = new yc4();
        } else {
            ClassLoader classLoader = yc4.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            f13 f13Var = new f13(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                f13Var.put(str2, bundle.get(str2));
            }
            yc4Var = new yc4(f13Var.y());
        }
        zc4 zc4Var = new zc4(str, yc4Var);
        zc4Var.w(jiVar, ju2Var);
        x(jiVar, ju2Var);
        return zc4Var;
    }
}
