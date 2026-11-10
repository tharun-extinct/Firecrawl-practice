package defpackage;

import android.app.PictureInPictureUiState;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vc6 {
    public static final sj0 g = sj0.k;
    public static final in4 y = in4.i;
    public static final float r = 6.0f;
    public static final sj0 n = sj0.p;
    public static final float v = 1.0f;

    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method g(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        ?? r11;
        Object obj;
        boolean z;
        int length = methodArr.length;
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            method = methodArr[i];
            if (str.equals(method.getName()) || ay4.P(method.getName(), str.concat("-"), z2)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z3 = z2;
                    ?? r12 = z3;
                    while (r11 < length2) {
                        Class<?> cls = parameterTypes[r11];
                        int i2 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        cls.getClass();
                        tf0 tf0VarG = v54.g(cls);
                        cls2.getClass();
                        if (tf0VarG.equals(v54.g(cls2)) || cls.isAssignableFrom(cls2)) {
                            r11 = z3;
                            r11 = z3;
                            z = true;
                        } else {
                            r11 = z3;
                            z = false;
                        }
                        arrayList.add(Boolean.valueOf(z));
                        r12 = i2;
                        r11++;
                    }
                    r11 = z3;
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i3 = 0;
                        do {
                            if (i3 < size) {
                                obj = arrayList.get(i3);
                                i3++;
                            }
                        } while (((Boolean) obj).booleanValue());
                    }
                    if (method != null) {
                        return method;
                    }
                    throw new NoSuchMethodException(str.concat(" not found"));
                }
                continue;
            }
            i++;
            z2 = false;
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static void n(String str, String str2, h02 h02Var, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodY = y(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodY != null) {
                methodY.setAccessible(true);
                if (Modifier.isStatic(methodY.getModifiers())) {
                    v(methodY, null, h02Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    v(methodY, cls.getConstructor(null).newInstance(null), h02Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + "." + str2 + " not found");
        } catch (Exception e) {
            Log.w("PreviewLogger", xi3.a("Failed to invoke Composable Method '", str, ".", str2, "'"), null);
            throw e;
        }
    }

    public static bi6 r(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        byte b = 24;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new bi6(b);
        }
        if (i < 31) {
            return new bi6(b);
        }
        pictureInPictureUiState.isStashed();
        return new bi6(b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    public static void v(Method method, Object obj, h02 h02Var, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (yf2.p(parameterTypes[length], h02.class)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        int i3 = i + 1;
        int iCeil = (i != 0 ? (int) Math.ceil(((double) ((obj != null ? 1 : 0) + i)) / 10.0d) : 1) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iCeil ? (int) Math.ceil(((double) i) / 31.0d) : 0) + iCeil != length2) {
            l0.z("params don't add up to total params");
            return;
        }
        Object[] objArr2 = new Object[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            if (i4 < 0 || i4 >= i) {
                if (i4 == i) {
                    objValueOf = h02Var;
                } else if (i3 <= i4 && i4 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (iCeil > i4 || i4 >= length2) {
                        l0.z("Unexpected index");
                        return;
                    }
                    objValueOf = 2097151;
                }
            } else if (i4 < 0 || i4 >= objArr.length) {
                switch (method.getParameterTypes()[i4].getName()) {
                    case "double":
                        objValueOf = Double.valueOf(0.0d);
                        break;
                    case "int":
                        objValueOf = 0;
                        break;
                    case "byte":
                        objValueOf = (byte) 0;
                        break;
                    case "char":
                        objValueOf = (char) 0;
                        break;
                    case "long":
                        objValueOf = 0L;
                        break;
                    case "boolean":
                        objValueOf = Boolean.FALSE;
                        break;
                    case "float":
                        objValueOf = Float.valueOf(0.0f);
                        break;
                    case "short":
                        objValueOf = (short) 0;
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                objValueOf = objArr[i4];
            }
            objArr2[i4] = objValueOf;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public static boolean x() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static Method y(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                me2 me2VarK = xs2.K(0, iCeil);
                ArrayList arrayList2 = new ArrayList(dj0.Y(me2VarK, 10));
                Iterator it = me2VarK.iterator();
                while (((le2) it).a) {
                    ((fe2) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                v92 v92Var = new v92(3);
                ArrayList arrayList3 = (ArrayList) v92Var.t;
                v92Var.e(clsArr);
                arrayList3.add(h02.class);
                v92Var.e(clsArr2);
                return g(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!yf2.p(method.getName(), str)) {
                    if (!ay4.P(method.getName(), str + "-", false)) {
                    }
                }
                return method;
            }
            return null;
        }
    }
}
