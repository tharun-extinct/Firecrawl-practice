package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class qe4 {
    public static final Class g;
    public static final sg5 r;
    public static final sg5 y;

    static {
        Class<?> cls;
        Class<?> cls2;
        b14 b14Var = b14.r;
        sg5 sg5Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        g = cls;
        try {
            b14 b14Var2 = b14.r;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                sg5Var = (sg5) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        y = sg5Var;
        r = new sg5();
    }

    public static void b(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xi0Var.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        xi0Var.D(i3);
        while (i2 < list.size()) {
            xi0Var.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void c(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                xi0Var.getClass();
                xi0Var.z(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        xi0Var.D(i3);
        while (i2 < list.size()) {
            xi0Var.h(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void d(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xi0Var.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int iT = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iT += xi0.t(((Integer) list.get(i3)).intValue());
        }
        xi0Var.D(iT);
        while (i2 < list.size()) {
            xi0Var.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void e(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xi0Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += xi0.a(((Long) list.get(i3)).longValue());
        }
        xi0Var.D(iA);
        while (i2 < list.size()) {
            xi0Var.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void f(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                xi0Var.C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int iT = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iT += xi0.t((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        xi0Var.D(iT);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            xi0Var.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i = 0; i < size; i++) {
            iA += xi0.a(((Integer) list.get(i)).intValue());
        }
        return iA;
    }

    public static void h(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xi0Var.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        xi0Var.D(i3);
        while (i2 < list.size()) {
            xi0Var.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void i(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xi0Var.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += xi0.a(((Integer) list.get(i3)).intValue());
        }
        xi0Var.D(iA);
        while (i2 < list.size()) {
            xi0Var.f(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i = 0; i < size; i++) {
            iT += xi0.t(((Integer) list.get(i)).intValue());
        }
        return iT;
    }

    public static void k(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                xi0Var.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iA += xi0.a((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        xi0Var.D(iA);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            xi0Var.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iA += xi0.a((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iA;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void m(sg5 sg5Var, Object obj, Object obj2) {
        sg5Var.getClass();
        c12 c12Var = (c12) obj;
        qg5 qg5Var = c12Var.unknownFields;
        qg5 qg5Var2 = ((c12) obj2).unknownFields;
        qg5 qg5Var3 = qg5.x;
        if (!qg5Var3.equals(qg5Var2)) {
            if (qg5Var3.equals(qg5Var)) {
                int i = qg5Var.g + qg5Var2.g;
                int[] iArrCopyOf = Arrays.copyOf(qg5Var.y, i);
                System.arraycopy(qg5Var2.y, 0, iArrCopyOf, qg5Var.g, qg5Var2.g);
                Object[] objArrCopyOf = Arrays.copyOf(qg5Var.r, i);
                System.arraycopy(qg5Var2.r, 0, objArrCopyOf, qg5Var.g, qg5Var2.g);
                qg5Var = new qg5(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                qg5Var.getClass();
                if (!qg5Var2.equals(qg5Var3)) {
                    if (!qg5Var.v) {
                        uo1.f();
                        return;
                    }
                    int i2 = qg5Var.g + qg5Var2.g;
                    qg5Var.g(i2);
                    System.arraycopy(qg5Var2.y, 0, qg5Var.y, qg5Var.g, qg5Var2.g);
                    System.arraycopy(qg5Var2.r, 0, qg5Var.r, qg5Var.g, qg5Var2.g);
                    qg5Var.g = i2;
                }
            }
        }
        c12Var.unknownFields = qg5Var;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i = 0; i < size; i++) {
            iA += xi0.a(((Integer) list.get(i)).intValue());
        }
        return iA;
    }

    public static void o(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xi0Var.z(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        xi0Var.D(i3);
        while (i2 < list.size()) {
            xi0Var.h(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void p(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                xi0Var.getClass();
                xi0Var.p(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        xi0Var.D(i3);
        while (i2 < list.size()) {
            xi0Var.u(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (xi0.j(i) + 8) * size;
    }

    public static void s(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xi0Var.z(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        xi0Var.D(i3);
        while (i2 < list.size()) {
            xi0Var.h(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i = 0; i < size; i++) {
            iA += xi0.a(((Long) list.get(i)).longValue());
        }
        return iA;
    }

    public static void u(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xi0Var.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += xi0.a(((Integer) list.get(i3)).intValue());
        }
        xi0Var.D(iA);
        while (i2 < list.size()) {
            xi0Var.f(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int v(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i = 0; i < size; i++) {
            iA += xi0.a(((Long) list.get(i)).longValue());
        }
        return iA;
    }

    public static void w(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xi0Var.i(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        xi0Var.D(i3);
        while (i2 < list.size()) {
            xi0Var.w(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int x(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iT += xi0.t((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iT;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (xi0.j(i) + 4) * size;
    }

    public static void z(int i, List list, q64 q64Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xi0 xi0Var = (xi0) q64Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xi0Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xi0Var.B(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += xi0.a(((Long) list.get(i3)).longValue());
        }
        xi0Var.D(iA);
        while (i2 < list.size()) {
            xi0Var.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object a(Object obj, int i, ef2 ef2Var, Object obj2, sg5 sg5Var) {
        return obj2;
    }
}
