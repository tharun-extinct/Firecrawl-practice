package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class qg3 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ rg3 g;

    public qg3(rg3 rg3Var) {
        this.g = rg3Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        iy2.r().g(rg3.t, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
        rg3 rg3Var = this.g;
        rg3Var.r(rg3Var.x());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        iy2.r().g(rg3.t, "Network connection lost", new Throwable[0]);
        rg3 rg3Var = this.g;
        rg3Var.r(rg3Var.x());
    }
}
