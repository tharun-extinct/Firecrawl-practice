package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class lp0 {
    public static Handler g(Looper looper) {
        return Handler.createAsync(looper);
    }
}
