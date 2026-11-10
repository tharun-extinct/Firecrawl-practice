package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class qx2 {
    public static final j14 g;

    static {
        Object g84Var;
        try {
            ClassLoader classLoader = id4.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof j14) {
                        g84Var = (j14) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof v51)) {
                    i++;
                }
                g84Var = null;
                break;
            }
        } catch (Throwable th) {
            g84Var = new g84(th);
        }
        j14 vf1Var = (j14) (g84Var instanceof g84 ? null : g84Var);
        if (vf1Var == null) {
            vf1Var = new vf1(new sx1((byte) 21), (byte) 1);
        }
        g = vf1Var;
    }
}
