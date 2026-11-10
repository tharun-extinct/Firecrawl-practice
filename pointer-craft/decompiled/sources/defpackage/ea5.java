package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ea5 {
    public final a41 g;
    public volatile int n;
    public volatile boolean r;
    public volatile long v;
    public volatile boolean x;
    public final d52 y;

    public ea5(Context context, r11 r11Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        jr2.m(context);
        a41 a41Var = new a41(r11Var, executor, scheduledExecutorService);
        d52 d52Var = new d52((byte) 9);
        this.g = a41Var;
        this.y = d52Var;
        this.v = -1L;
        kw.y((Application) context.getApplicationContext());
        kw.q.g(new da5(this, a41Var, d52Var));
    }

    public final boolean g() {
        return this.x && !this.r && this.n > 0 && this.v != -1;
    }
}
