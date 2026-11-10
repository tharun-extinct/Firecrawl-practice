package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class aa1 implements Executor {
    public final /* synthetic */ byte j;
    public static final aa1 t = new aa1(0);
    public static final aa1 a = new aa1(1);
    public static final aa1 m = new aa1(2);

    public /* synthetic */ aa1(byte b) {
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
            default:
                runnable.run();
                break;
        }
    }
}
