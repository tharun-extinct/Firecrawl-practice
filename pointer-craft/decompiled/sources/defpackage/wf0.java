package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class wf0 {
    public static final wf0 r = new wf0();
    public final HashMap g = new HashMap();
    public final HashMap y = new HashMap();

    public static void r(HashMap map, vf0 vf0Var, vt2 vt2Var, Class cls) {
        vt2 vt2Var2 = (vt2) map.get(vf0Var);
        if (vt2Var2 == null || vt2Var == vt2Var2) {
            if (vt2Var2 == null) {
                map.put(vf0Var, vt2Var);
                return;
            }
            return;
        }
        String name = vf0Var.y.getName();
        String name2 = cls.getName();
        String strValueOf = String.valueOf(vt2Var2);
        String strValueOf2 = String.valueOf(vt2Var);
        StringBuilder sbZ = du4.z("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value ");
        sbZ.append(strValueOf);
        sbZ.append(", new value ");
        sbZ.append(strValueOf2);
        throw new IllegalArgumentException(sbZ.toString());
    }

    public final uf0 g(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.g;
        if (superclass != null) {
            uf0 uf0VarG = (uf0) map2.get(superclass);
            if (uf0VarG == null) {
                uf0VarG = g(superclass, null);
            }
            map.putAll(uf0VarG.y);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            uf0 uf0VarG2 = (uf0) map2.get(cls2);
            if (uf0VarG2 == null) {
                uf0VarG2 = g(cls2, null);
            }
            for (Map.Entry entry : uf0VarG2.y.entrySet()) {
                r(map, (vf0) entry.getKey(), (vt2) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            dk3 dk3Var = (dk3) method.getAnnotation(dk3.class);
            if (dk3Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!gu2.class.isAssignableFrom(parameterTypes[0])) {
                        l0.u("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                vt2 vt2VarValue = dk3Var.value();
                if (parameterTypes.length > 1) {
                    if (!vt2.class.isAssignableFrom(parameterTypes[1])) {
                        l0.u("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (vt2VarValue != vt2.ON_ANY) {
                        l0.u("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    l0.u("cannot have more than 2 params");
                    return null;
                }
                r(map, new vf0(i, method), vt2VarValue, cls);
                z = true;
            }
        }
        uf0 uf0Var = new uf0(map);
        map2.put(cls, uf0Var);
        this.y.put(cls, Boolean.valueOf(z));
        return uf0Var;
    }

    public final boolean y(Class cls) {
        HashMap map = this.y;
        Boolean bool = (Boolean) map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((dk3) method.getAnnotation(dk3.class)) != null) {
                    g(cls, declaredMethods);
                    return true;
                }
            }
            map.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
