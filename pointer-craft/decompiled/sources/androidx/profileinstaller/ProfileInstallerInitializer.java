package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.ic2;
import defpackage.l76;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements ic2 {
    @Override // defpackage.ic2
    public final List g() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ic2
    public final Object y(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: nz3
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new oz3(applicationContext, (byte) 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new l76((byte) 14);
    }
}
