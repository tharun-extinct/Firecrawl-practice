package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ed6 {
    public static final StackTraceElement[] g = new StackTraceElement[0];

    public static boolean g(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }

    public static boolean y(byte b) {
        return b > -65;
    }
}
