package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vs5 implements ThreadFactory {
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean y;

    public /* synthetic */ vs5(String str, boolean z) {
        this.g = str;
        this.y = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.g);
        thread.setDaemon(this.y);
        return thread;
    }
}
