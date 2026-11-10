package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class ex1 {
    public static final sp4 y = new sp4(0);
    public final /* synthetic */ kx1 g;

    public ex1(kx1 kx1Var) {
        this.g = kx1Var;
    }

    public static Class r(ClassLoader classLoader, String str) {
        try {
            return y(classLoader, str);
        } catch (ClassCastException e) {
            throw new il0(du4.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new il0(du4.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public static Class y(ClassLoader classLoader, String str) throws ClassNotFoundException {
        sp4 sp4Var = y;
        sp4 sp4Var2 = (sp4) sp4Var.get(classLoader);
        if (sp4Var2 == null) {
            sp4Var2 = new sp4(0);
            sp4Var.put(classLoader, sp4Var2);
        }
        Class cls = (Class) sp4Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        sp4Var2.put(str, cls2);
        return cls2;
    }

    public final pw1 g(String str) {
        try {
            return (pw1) r(this.g.f.k.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new il0(du4.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new il0(du4.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new il0(du4.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new il0(du4.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
