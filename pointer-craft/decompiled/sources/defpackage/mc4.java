package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class mc4 implements Executor {
    public final /* synthetic */ byte j;
    public final Object t;

    public mc4() {
        this.j = (byte) 2;
        gw5 gw5Var = new gw5(Looper.getMainLooper());
        Looper.getMainLooper();
        this.t = gw5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 0:
                ((Executor) obj).execute(new y9(runnable, (byte) 5));
                break;
            case 1:
                ((Handler) ((zl5) obj).y).post(runnable);
                break;
            default:
                ((gw5) obj).post(runnable);
                break;
        }
    }

    public /* synthetic */ mc4(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }
}
