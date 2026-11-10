package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class km5 {
    public static boolean g;
    public static final boolean r;
    public static Method y;

    static {
        r = Build.VERSION.SDK_INT >= 27;
    }
}
