package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class er5 implements Runnable {
    public static final String c = iy2.v("WorkForegroundRunnable");
    public final sr5 a;
    public final ol4 j = new ol4();
    public final ListenableWorker m;
    public final gr5 q;
    public final Context t;
    public final zl5 w;

    public er5(Context context, sr5 sr5Var, ListenableWorker listenableWorker, gr5 gr5Var, zl5 zl5Var) {
        this.t = context;
        this.a = sr5Var;
        this.m = listenableWorker;
        this.q = gr5Var;
        this.w = zl5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.s || u70.y()) {
            this.j.a(null);
            return;
        }
        ol4 ol4Var = new ol4();
        zl5 zl5Var = this.w;
        ((mc4) zl5Var.r).execute(new dr5(this, ol4Var, (byte) 0));
        ol4Var.g(new dr5(this, ol4Var, (byte) 1), (mc4) zl5Var.r);
    }
}
