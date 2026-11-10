package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dp1 implements Executor {
    public final /* synthetic */ byte j;
    public static final dp1 t = new dp1(0);
    public static final dp1 a = new dp1(1);

    public /* synthetic */ dp1(byte b) {
        this.j = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.j) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
