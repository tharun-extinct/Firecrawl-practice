package defpackage;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class sh1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = ib5.y;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (ph1.n()) {
                ph1.g().v();
            }
        } finally {
            Method method2 = ib5.y;
            Trace.endSection();
        }
    }
}
