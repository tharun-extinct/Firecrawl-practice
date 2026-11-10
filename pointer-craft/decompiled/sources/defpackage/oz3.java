package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oz3 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Context t;

    public /* synthetic */ oz3(Context context, byte b) {
        this.j = b;
        this.t = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        byte b2 = 1;
        Context context = this.t;
        switch (b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new oz3(context, b2));
                break;
            default:
                og0.L(context, new sq((byte) 1), og0.h, false);
                break;
        }
    }
}
