package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sq implements Executor {
    public final /* synthetic */ byte j;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.j) {
            case 0:
                tq.K().y.r.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
