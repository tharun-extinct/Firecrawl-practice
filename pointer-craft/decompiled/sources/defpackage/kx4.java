package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class kx4 {
    public static kx4 n;
    public static final ReentrantLock r = new ReentrantLock();
    public final ReentrantLock g = new ReentrantLock();
    public final SharedPreferences y;

    public kx4(Context context) {
        this.y = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String g(String str) {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            return this.y.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
