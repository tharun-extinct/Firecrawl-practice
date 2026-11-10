package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kp0 implements ThreadFactory {
    public final /* synthetic */ String g;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.g);
        thread.setPriority(10);
        return thread;
    }
}
