package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ld4 {
    public static final List g = pw5.d(Application.class, yc4.class);
    public static final List y = pw5.k(yc4.class);

    public static final Constructor g(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listJ0 = pr.j0(parameterTypes);
            if (list.equals(listJ0)) {
                return constructor;
            }
            if (list.size() == listJ0.size() && listJ0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final pl5 y(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (pl5) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            t94.l("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            uo1.w("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
