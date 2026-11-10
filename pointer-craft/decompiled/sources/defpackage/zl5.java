package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zl5 {
    public final Object g;
    public final Object r;
    public final Object y;

    public zl5(vl5 vl5Var) {
        a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
        xx0.y.getClass();
        this.g = vl5Var;
        this.y = "androidx.navigation.NavControllerViewModel";
        this.r = new o05(new gd4(this, (byte) 13));
    }

    public void g(Runnable runnable) {
        ((lk4) this.g).execute(runnable);
    }

    public zl5(ExecutorService executorService) {
        this.y = new Handler(Looper.getMainLooper());
        this.r = new mc4(this, (byte) 1);
        this.g = new lk4(executorService);
    }

    public zl5(WorkDatabase_Impl workDatabase_Impl) {
        this.g = workDatabase_Impl;
        byte b = 2;
        new mw3(workDatabase_Impl, b);
        this.y = new a15(workDatabase_Impl, (byte) 1);
        this.r = new a15(workDatabase_Impl, b);
    }
}
