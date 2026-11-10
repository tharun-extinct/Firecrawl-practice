package defpackage;

import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class c26 {
    public final /* synthetic */ et0 g;
    public final /* synthetic */ byte n;
    public final /* synthetic */ j26 r;
    public final /* synthetic */ Runnable y;

    /* JADX WARN: Multi-variable type inference failed */
    public c26(j26 j26Var, int i, et0 et0Var, Runnable runnable) {
        this.n = i;
        this.g = et0Var;
        this.y = runnable;
        this.r = j26Var;
    }

    public final void g(Throwable th) {
        boolean z = th instanceof TimeoutException;
        j26 j26Var = this.r;
        if (z) {
            j26Var.O(102, 28, b36.E);
            i06.t("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            j26Var.O(95, 28, b36.E);
            i06.t("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.y.run();
    }
}
