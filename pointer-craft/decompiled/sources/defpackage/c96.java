package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c96 {
    public static final char[] g;

    static {
        char[] cArr = new char[80];
        g = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String g(y66 y66Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        n(y66Var, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    public static void n(y66 y66Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = y66Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    y(sb, i, strSubstring.substring(0, strSubstring.length() - 4), y66.i(method2, y66Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                y(sb, i, strSubstring.substring(0, strSubstring.length() - 3), y66.i(method, y66Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objI = y66.i(method4, y66Var, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) y66.i(method5, y66Var, new Object[0])).booleanValue();
                    } else if (objI instanceof Boolean) {
                        if (((Boolean) objI).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objI instanceof Integer) {
                        if (((Integer) objI).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objI instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objI).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objI instanceof Double)) {
                        if (objI instanceof String) {
                            zEquals = objI.equals("");
                        } else if (objI instanceof l56) {
                            zEquals = objI.equals(l56.t);
                        } else if (!(objI instanceof v46) ? !((objI instanceof Enum) && ((Enum) objI).ordinal() == 0) : objI != ((y66) ((y66) ((v46) objI)).a(6))) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objI).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        y(sb, i, strSubstring, objI);
                    }
                }
            }
            i2 = i3;
        }
        na6 na6Var = y66Var.zzc;
        if (na6Var != null) {
            for (int i5 = 0; i5 < na6Var.g; i5++) {
                y(sb, i, String.valueOf(na6Var.y[i5] >>> 3), na6Var.r[i5]);
            }
        }
    }

    public static void r(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(g, 0, i2);
            i -= i2;
        }
    }

    public static void y(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                y(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                y(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        r(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            String str2 = (String) obj;
            n56 n56Var = l56.t;
            sb.append(dd6.r(str2.isEmpty() ? l56.t : new n56(str2.getBytes(m76.g))));
            sb.append('\"');
            return;
        }
        if (obj instanceof l56) {
            sb.append(": \"");
            sb.append(dd6.r((l56) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof y66) {
            sb.append(" {");
            n((y66) obj, sb, i + 2);
            sb.append("\n");
            r(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        y(sb, i3, "key", entry.getKey());
        y(sb, i3, "value", entry.getValue());
        sb.append("\n");
        r(i, sb);
        sb.append("}");
    }
}
