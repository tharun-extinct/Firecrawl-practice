package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class m16 {
    public static final m16 n = new m16();
    public final Runnable g;
    public m16 r;
    public final Executor y;

    public m16() {
        this.g = null;
        this.y = null;
    }

    public m16(Runnable runnable, Executor executor) {
        this.g = runnable;
        this.y = executor;
    }
}
