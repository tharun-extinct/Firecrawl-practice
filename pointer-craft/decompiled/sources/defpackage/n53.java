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
public abstract class n53 {
    public static final char[] g;

    static {
        char[] cArr = new char[80];
        g = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void g(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(g, 0, i2);
            i -= i2;
        }
    }

    public static String n(c12 c12Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        r(c12Var, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    public static void r(c12 c12Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = c12Var.getClass().getDeclaredMethods();
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
                    y(sb, i, strSubstring.substring(0, strSubstring.length() - 4), c12.v(method2, c12Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                y(sb, i, strSubstring.substring(0, strSubstring.length() - 3), c12.v(method, c12Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objV = c12.v(method4, c12Var, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objV instanceof Boolean) {
                            zEquals = !((Boolean) objV).booleanValue();
                        } else if (objV instanceof Integer) {
                            if (((Integer) objV).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objV instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objV).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objV instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objV).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objV instanceof String) {
                            zEquals = objV.equals("");
                        } else if (objV instanceof da0) {
                            zEquals = objV.equals(da0.a);
                        } else if (!(objV instanceof t0) ? !((objV instanceof Enum) && ((Enum) objV).ordinal() == 0) : objV != ((c12) ((c12) ((t0) objV)).r(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) c12.v(method5, c12Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        y(sb, i, strSubstring, objV);
                    }
                }
            }
            i2 = i3;
        }
        qg5 qg5Var = c12Var.unknownFields;
        if (qg5Var != null) {
            for (int i5 = 0; i5 < qg5Var.g; i5++) {
                y(sb, i, String.valueOf(qg5Var.y[i5] >>> 3), qg5Var.r[i5]);
            }
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
        g(i, sb);
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
            da0 da0Var = da0.a;
            sb.append(dt5.g(new da0(((String) obj).getBytes(gf2.g))));
            sb.append('\"');
            return;
        }
        if (obj instanceof da0) {
            sb.append(": \"");
            sb.append(dt5.g((da0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof c12) {
            sb.append(" {");
            r((c12) obj, sb, i + 2);
            sb.append("\n");
            g(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        y(sb, i3, "key", entry.getKey());
        y(sb, i3, "value", entry.getValue());
        sb.append("\n");
        g(i, sb);
        sb.append("}");
    }
}
