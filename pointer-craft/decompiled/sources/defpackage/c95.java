package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class c95 {
    public static final long g;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        g = id;
    }
}
