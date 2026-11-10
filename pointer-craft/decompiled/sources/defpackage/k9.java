package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k9 implements Executor {
    public final /* synthetic */ ba j;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.j.postOnAnimation(runnable);
    }
}
