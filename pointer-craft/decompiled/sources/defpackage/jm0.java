package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm0 implements n14 {
    public final /* synthetic */ byte g;

    public /* synthetic */ jm0(byte b) {
        this.g = b;
    }

    @Override // defpackage.n14
    public final Object get() {
        switch (this.g) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                xp2 xp2Var = ExecutorsRegistrar.g;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new w41(Executors.newFixedThreadPool(4, new py0("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.n.get());
            case 2:
                xp2 xp2Var2 = ExecutorsRegistrar.g;
                return new w41(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new py0("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.n.get());
            case 3:
                xp2 xp2Var3 = ExecutorsRegistrar.g;
                return new w41(Executors.newCachedThreadPool(new py0("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.n.get());
            case 4:
                xp2 xp2Var4 = ExecutorsRegistrar.g;
                return Executors.newSingleThreadScheduledExecutor(new py0("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
