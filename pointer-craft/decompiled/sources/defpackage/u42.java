package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u42 {
    private static volatile Choreographer choreographer;
    public static final /* synthetic */ int g = 0;

    static {
        Object g84Var;
        try {
            g84Var = new t42(g(Looper.getMainLooper()));
        } catch (Throwable th) {
            g84Var = new g84(th);
        }
        if (g84Var instanceof g84) {
            g84Var = null;
        }
    }

    public static final Handler g(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }
}
