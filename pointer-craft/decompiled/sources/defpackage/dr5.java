package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class dr5 implements Runnable {
    public final /* synthetic */ er5 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ ol4 t;

    public /* synthetic */ dr5(er5 er5Var, ol4 ol4Var, byte b) {
        this.j = b;
        this.a = er5Var;
        this.t = ol4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        ol4 ol4Var = this.t;
        er5 er5Var = this.a;
        switch (b) {
            case 0:
                ol4Var.q(er5Var.m.g());
                return;
            default:
                ol4 ol4Var2 = er5Var.j;
                sr5 sr5Var = er5Var.a;
                try {
                    yv1 yv1Var = (yv1) ol4Var.get();
                    if (yv1Var == null) {
                        throw new IllegalStateException("Worker was marked important (" + sr5Var.r + ") but did not provide ForegroundInfo");
                    }
                    iy2.r().g(er5.c, "Updating notification for " + sr5Var.r, new Throwable[0]);
                    ListenableWorker listenableWorker = er5Var.m;
                    listenableWorker.q = true;
                    gr5 gr5Var = er5Var.q;
                    Context context = er5Var.t;
                    UUID uuid = listenableWorker.t.g;
                    ol4 ol4Var3 = new ol4();
                    gr5Var.g.g(new fr5(gr5Var, ol4Var3, uuid, yv1Var, context));
                    ol4Var2.q(ol4Var3);
                    return;
                } catch (Throwable th) {
                    ol4Var2.m(th);
                    return;
                }
        }
    }
}
