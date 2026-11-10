package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sv5 {
    public static final int g;

    static {
        g = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
