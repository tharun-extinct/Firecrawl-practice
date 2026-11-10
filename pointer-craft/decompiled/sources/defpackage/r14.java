package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r14 {
    public static boolean n = false;
    public static Method r;
    public static final m32 g = m32.y;
    public static final Object y = new Object();

    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0 A[Catch: all -> 0x0062, TryCatch #1 {, blocks: (B:12:0x0052, B:15:0x0059, B:22:0x007a, B:23:0x007f, B:20:0x0066, B:25:0x0081, B:27:0x0086, B:33:0x0092, B:35:0x0096, B:38:0x00d0, B:41:0x00e0, B:42:0x00e5, B:44:0x00e7, B:45:0x00f5), top: B:50:0x0052, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7 A[Catch: all -> 0x0062, TryCatch #1 {, blocks: (B:12:0x0052, B:15:0x0059, B:22:0x007a, B:23:0x007f, B:20:0x0066, B:25:0x0081, B:27:0x0086, B:33:0x0092, B:35:0x0096, B:38:0x00d0, B:41:0x00e0, B:42:0x00e5, B:44:0x00e7, B:45:0x00f5), top: B:50:0x0052, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void g(Context context) throws r32, q32 {
        boolean z;
        Context contextCreatePackageContext;
        Context context2;
        jr2.q(context, "Context must not be null");
        g.getClass();
        int i = s32.r;
        m32 m32Var = m32.y;
        int iY = m32Var.y(context, 11925000);
        if (iY != 0) {
            Intent intentG = m32Var.g(iY, context, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(iY).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(iY);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (intentG != null) {
                throw new r32(iY);
            }
            throw new q32(iY);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (y) {
            Context context3 = null;
            if (n) {
                z = n;
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                if (contextCreatePackageContext != null) {
                    n = true;
                    if (!z) {
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = contextCreatePackageContext.getClassLoader();
                        ia6 ia6Var = new ia6(Context.class, context);
                        Class cls = Long.TYPE;
                        hd6.n(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", ia6Var, new u86(cls, Long.valueOf(jUptimeMillis)), new u86(cls, Long.valueOf(jUptimeMillis2)));
                    }
                    context3 = contextCreatePackageContext;
                }
                if (context3 != null) {
                    y(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new q32(8);
                }
            }
            try {
                context2 = bg1.g(context, bg1.y).g;
            } catch (yf1 e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                y(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z = n;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                n = true;
                if (!z) {
                    try {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        ClassLoader classLoader2 = contextCreatePackageContext.getClassLoader();
                        ia6 ia6Var2 = new ia6(Context.class, context);
                        Class cls2 = Long.TYPE;
                        hd6.n(classLoader2.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", ia6Var2, new u86(cls2, Long.valueOf(jUptimeMillis)), new u86(cls2, Long.valueOf(jUptimeMillis3)));
                    } catch (Exception e2) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                    }
                }
                context3 = contextCreatePackageContext;
            }
            if (context3 != null) {
                y(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new q32(8);
            }
            throw th;
        }
    }

    public static void y(Context context, String str) throws q32 {
        try {
            Method method = r;
            if (method == null) {
                method = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
                r = method;
            }
            method.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new q32(8);
        }
    }
}
