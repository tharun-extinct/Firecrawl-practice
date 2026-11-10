package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public final class rg3 extends ss0 {
    public static final String t = iy2.v("NetworkStateTracker");
    public final qg3 j;
    public final ConnectivityManager l;

    public rg3(Context context, zl5 zl5Var) {
        super(context, zl5Var);
        this.l = (ConnectivityManager) this.y.getSystemService("connectivity");
        this.j = new qg3(this);
    }

    @Override // defpackage.ss0
    public final Object g() {
        return x();
    }

    @Override // defpackage.ss0
    public final void n() {
        String str = t;
        try {
            iy2.r().g(str, "Registering network callback", new Throwable[0]);
            this.l.registerDefaultNetworkCallback(this.j);
        } catch (IllegalArgumentException | SecurityException e) {
            iy2.r().y(str, "Received exception while registering network callback", e);
        }
    }

    @Override // defpackage.ss0
    public final void v() {
        String str = t;
        try {
            iy2.r().g(str, "Unregistering network callback", new Throwable[0]);
            this.l.unregisterNetworkCallback(this.j);
        } catch (IllegalArgumentException | SecurityException e) {
            iy2.r().y(str, "Received exception while unregistering network callback", e);
        }
    }

    public final pg3 x() {
        boolean z;
        ConnectivityManager connectivityManager = this.l;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            z = networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e) {
            iy2.r().y(t, "Unable to validate active network", e);
        }
        boolean zG = ed6.g(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z2 = true;
        }
        return new pg3(z3, z, zG, z2);
    }
}
