package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qh5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uh5 j;
    public final /* synthetic */ Runnable m;
    public final /* synthetic */ cv t;

    public /* synthetic */ qh5(uh5 uh5Var, cv cvVar, int i, Runnable runnable) {
        this.j = uh5Var;
        this.t = cvVar;
        this.a = i;
        this.m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final cv cvVar = this.t;
        final int i = this.a;
        Runnable runnable = this.m;
        final uh5 uh5Var = this.j;
        bc4 bc4Var = (bc4) uh5Var.n;
        byte b = 1;
        try {
            bc4 bc4Var2 = (bc4) uh5Var.r;
            Objects.requireNonNull(bc4Var2);
            bc4Var.i(new rh5(bc4Var2, b));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) uh5Var.g).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                bc4Var.i(new n05() { // from class: sh5
                    @Override // defpackage.n05
                    public final Object y() {
                        ((ro) uh5Var.x).V(cvVar, i + 1, false);
                        return null;
                    }
                });
            } else {
                uh5Var.q(cvVar, i);
            }
        } catch (m05 unused) {
            ((ro) uh5Var.x).V(cvVar, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
