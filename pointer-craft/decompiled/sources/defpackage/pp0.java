package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class pp0 {
    public final ExecutorService g = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new op0(false));
    public final ExecutorService y = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new op0(true));
    public final xr5 r = new xr5();
    public final f73 n = new f73(12);
    public final q64 v = new q64((byte) 16);
    public final byte x = 4;
    public final int l = Integer.MAX_VALUE;
    public final byte j = 20;

    public pp0(tg1 tg1Var) {
    }
}
