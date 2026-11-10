package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t41 implements x41 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ long m;
    public final /* synthetic */ long q;
    public final /* synthetic */ w41 t;
    public final /* synthetic */ TimeUnit w;

    public /* synthetic */ t41(w41 w41Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.j = b;
        this.t = w41Var;
        this.a = runnable;
        this.m = j;
        this.q = j2;
        this.w = timeUnit;
    }

    @Override // defpackage.x41
    public final ScheduledFuture g(fa4 fa4Var) {
        byte b = this.j;
        Runnable runnable = this.a;
        w41 w41Var = this.t;
        switch (b) {
            case 0:
                return w41Var.t.scheduleAtFixedRate(new u41(w41Var, runnable, fa4Var, (byte) 0), this.m, this.q, this.w);
            default:
                return w41Var.t.scheduleWithFixedDelay(new u41(w41Var, runnable, fa4Var, (byte) 2), this.m, this.q, this.w);
        }
    }
}
