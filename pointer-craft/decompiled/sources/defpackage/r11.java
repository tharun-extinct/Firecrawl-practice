package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class r11 implements nf2 {
    public final nj6 a;
    public nj6 c;
    public final ro1 g;
    public final Executor j;
    public final Executor l;
    public final d52 m;
    public final ArrayList n;
    public eu3 q;
    public final ArrayList r;
    public final Executor t;
    public final lx4 v;
    public e11 w;
    public final ea5 x;
    public final n14 y;

    public r11(ro1 ro1Var, n14 n14Var, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        jr2.m(ro1Var);
        jr2.m(n14Var);
        this.g = ro1Var;
        this.y = n14Var;
        this.r = new ArrayList();
        this.n = new ArrayList();
        ro1Var.g();
        Context context = ro1Var.g;
        String strN = ro1Var.n();
        lx4 lx4Var = new lx4();
        jr2.m(context);
        jr2.t(strN);
        lx4Var.g = new xp2(new w11(context, "com.google.firebase.appcheck.store.".concat(strN), (byte) 1));
        this.v = lx4Var;
        ro1Var.g();
        this.x = new ea5(context, this, executor2, scheduledExecutorService);
        this.l = executor;
        this.j = executor2;
        this.t = executor3;
        x25 x25Var = new x25();
        executor3.execute(new nl0(this, x25Var, (byte) 4));
        this.a = x25Var.g;
        this.m = new d52((byte) 9);
    }
}
