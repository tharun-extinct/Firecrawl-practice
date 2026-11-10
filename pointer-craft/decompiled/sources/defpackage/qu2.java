package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class qu2 {
    public static final HashMap g = new HashMap();
    public static final HashMap y = new HashMap();

    public static void g(Constructor constructor, fu2 fu2Var) {
        try {
            Object objNewInstance = constructor.newInstance(fu2Var);
            objNewInstance.getClass();
            fj.z(objNewInstance);
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    public static int y(Class cls) {
        Constructor<?> declaredConstructor;
        Class<?>[] interfaces;
        int i;
        HashMap map = g;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String strConcat = ay4.M(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + "." + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap map2 = y;
            if (declaredConstructor != null) {
                map2.put(cls, pw5.k(declaredConstructor));
            } else if (!wf0.r.y(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass == null || !fu2.class.isAssignableFrom(superclass)) {
                    interfaces = cls.getInterfaces();
                    interfaces.getClass();
                    for (Class<?> cls2 : interfaces) {
                        if (cls2 == null && fu2.class.isAssignableFrom(cls2)) {
                            cls2.getClass();
                            if (y(cls2) != 1) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj = map2.get(cls2);
                                obj.getClass();
                                arrayList.addAll((Collection) obj);
                            }
                        }
                    }
                    if (arrayList != null) {
                        map2.put(cls, arrayList);
                    }
                } else {
                    superclass.getClass();
                    if (y(superclass) != 1) {
                        Object obj2 = map2.get(superclass);
                        obj2.getClass();
                        arrayList = new ArrayList((Collection) obj2);
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        while (i < r7) {
                            if (cls2 == null) {
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        map.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
