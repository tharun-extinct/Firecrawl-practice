package defpackage;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jb5 {
    public static final AtomicBoolean g = new AtomicBoolean(false);

    public static void g() {
        if (Build.VERSION.SDK_INT < 29 || !g.get()) {
            return;
        }
        sj.g();
    }

    public static void y() {
        if (Build.VERSION.SDK_INT < 29 || !g.get()) {
            return;
        }
        sj.r();
    }
}
