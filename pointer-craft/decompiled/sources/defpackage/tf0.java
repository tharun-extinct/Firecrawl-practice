package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tf0 implements sf0 {
    public static final Map y;
    public final Class g;

    static {
        List listD = pw5.d(my1.class, xy1.class, bz1.class, cz1.class, dz1.class, ez1.class, fz1.class, gz1.class, hz1.class, iz1.class, ny1.class, oy1.class, py1.class, qy1.class, ry1.class, sy1.class, ty1.class, uy1.class, vy1.class, wy1.class, yy1.class, zy1.class, az1.class);
        ArrayList arrayList = new ArrayList(dj0.Y(listD, 10));
        int i = 0;
        for (Object obj : listD) {
            int i2 = i + 1;
            if (i < 0) {
                pw5.R();
                throw null;
            }
            arrayList.add(new fp3((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        y = v13.I(arrayList);
    }

    public tf0(Class cls) {
        cls.getClass();
        this.g = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tf0) && og0.e(this).equals(og0.e((tf0) obj));
    }

    public final Class g() {
        return this.g;
    }

    public final int hashCode() {
        return og0.e(this).hashCode();
    }

    public final boolean n(Object obj) {
        Class clsE = this.g;
        clsE.getClass();
        Map map = y;
        map.getClass();
        Integer num = (Integer) map.get(clsE);
        if (num != null) {
            return ue5.W(num.intValue(), obj);
        }
        if (clsE.isPrimitive()) {
            clsE = og0.e(v54.g(clsE));
        }
        return clsE.isInstance(obj);
    }

    public final String r() {
        String strF;
        Class cls = this.g;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strF2 = c93.F(cls.getName());
                return strF2 == null ? cls.getSimpleName() : strF2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strF = c93.F(componentType.getName())) != null) {
                strConcat = strF.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return tx4.k0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iV = tx4.V(simpleName, '$', 0, 6);
            return iV == -1 ? simpleName : simpleName.substring(iV + 1, simpleName.length());
        }
        return tx4.k0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final String toString() {
        return this.g.toString() + " (Kotlin reflection is not available)";
    }

    public final String y() {
        String strZ;
        Class cls = this.g;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strZ2 = c93.z(cls.getName());
            return strZ2 == null ? cls.getCanonicalName() : strZ2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strZ = c93.z(componentType.getName())) != null) {
            strConcat = strZ.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }
}
