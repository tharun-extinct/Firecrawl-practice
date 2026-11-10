package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class u96 {
    public static final d52 g;

    static {
        int i = z46.g;
        g = new d52((byte) 19);
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a76)) {
            int i2 = 0;
            while (i < size) {
                i2 += u56.i(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        a76 a76Var = (a76) list;
        int i3 = 0;
        while (i < size) {
            i3 += u56.i(a76Var.v(i));
            i++;
        }
        return i3;
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
    public static void b(Object obj, Object obj2) {
        y66 y66Var = (y66) obj;
        na6 na6Var = y66Var.zzc;
        na6 na6Var2 = ((y66) obj2).zzc;
        na6 na6Var3 = na6.x;
        if (!na6Var3.equals(na6Var2)) {
            if (na6Var3.equals(na6Var)) {
                int i = na6Var.g + na6Var2.g;
                int[] iArrCopyOf = Arrays.copyOf(na6Var.y, i);
                System.arraycopy(na6Var2.y, 0, iArrCopyOf, na6Var.g, na6Var2.g);
                Object[] objArrCopyOf = Arrays.copyOf(na6Var.r, i);
                System.arraycopy(na6Var2.r, 0, objArrCopyOf, na6Var.g, na6Var2.g);
                na6Var = new na6(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                na6Var.getClass();
                if (!na6Var2.equals(na6Var3)) {
                    if (!na6Var.v) {
                        uo1.f();
                        return;
                    }
                    int i2 = na6Var.g + na6Var2.g;
                    na6Var.v(i2);
                    System.arraycopy(na6Var2.y, 0, na6Var.y, na6Var.g, na6Var2.g);
                    System.arraycopy(na6Var2.r, 0, na6Var.r, na6Var.g, na6Var2.g);
                    na6Var.g = i2;
                }
            }
        }
        y66Var.zzc = na6Var;
    }

    public static int c(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a76)) {
            int iC = 0;
            while (i < size) {
                iC += u56.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return iC;
        }
        a76 a76Var = (a76) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += u56.c(a76Var.v(i));
            i++;
        }
        return iC2;
    }

    public static void d(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!(list instanceof a76)) {
            if (!z) {
                while (i2 < list.size()) {
                    u56Var.r(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            u56Var.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            u56Var.m(i3);
            while (i2 < list.size()) {
                u56Var.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        a76 a76Var = (a76) list;
        if (!z) {
            while (i2 < a76Var.size()) {
                u56Var.r(i, a76Var.v(i2));
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a76Var.size(); i6++) {
            a76Var.v(i6);
            i5 += 4;
        }
        u56Var.m(i5);
        while (i2 < a76Var.size()) {
            u56Var.n(a76Var.v(i2));
            i2++;
        }
    }

    public static void f(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!(list instanceof a76)) {
            if (!z) {
                while (i2 < list.size()) {
                    u56Var.l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            u56Var.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += u56.i(((Integer) list.get(i4)).intValue());
            }
            u56Var.m(i3);
            while (i2 < list.size()) {
                u56Var.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        a76 a76Var = (a76) list;
        if (!z) {
            while (i2 < a76Var.size()) {
                u56Var.l(i, a76Var.v(i2));
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a76Var.size(); i6++) {
            i5 += u56.i(a76Var.v(i6));
        }
        u56Var.m(i5);
        while (i2 < a76Var.size()) {
            u56Var.j(a76Var.v(i2));
            i2++;
        }
    }

    public static void g(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                u56Var.v(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        u56Var.m(i3);
        while (i2 < list.size()) {
            u56Var.x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void h(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                u56Var.v(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        u56Var.m(i3);
        while (i2 < list.size()) {
            u56Var.x(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += u56.i(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u56.c(i << 3) + 4) * size;
    }

    public static void k(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                u56Var.q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += u56.i(((Long) list.get(i4)).longValue());
        }
        u56Var.m(i3);
        while (i2 < list.size()) {
            u56Var.w(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a76)) {
            int i2 = 0;
            while (i < size) {
                i2 += u56.i(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        a76 a76Var = (a76) list;
        int i3 = 0;
        while (i < size) {
            i3 += u56.i(a76Var.v(i));
            i++;
        }
        return i3;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += u56.i(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void n(int i, List list, et4 et4Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!(list instanceof a76)) {
            if (!z) {
                while (i2 < list.size()) {
                    u56Var.a(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            u56Var.t(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += u56.c(((Integer) list.get(i3)).intValue());
            }
            u56Var.m(iC);
            while (i2 < list.size()) {
                u56Var.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        a76 a76Var = (a76) list;
        if (!z) {
            while (i2 < a76Var.size()) {
                u56Var.a(i, a76Var.v(i2));
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < a76Var.size(); i4++) {
            iC2 += u56.c(a76Var.v(i4));
        }
        u56Var.m(iC2);
        while (i2 < a76Var.size()) {
            u56Var.m(a76Var.v(i2));
            i2++;
        }
    }

    public static void o(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                u56Var.r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        u56Var.m(i3);
        while (i2 < list.size()) {
            u56Var.n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void p(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                u56Var.v(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        u56Var.m(i3);
        while (i2 < list.size()) {
            u56Var.x(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a76)) {
            int iC = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iC += u56.c((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iC;
        }
        a76 a76Var = (a76) list;
        int iC2 = 0;
        while (i < size) {
            int iV = a76Var.v(i);
            iC2 += u56.c((iV >> 31) ^ (iV + iV));
            i++;
        }
        return iC2;
    }

    public static void r(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                u56Var.q(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue2 = ((Long) list.get(i4)).longValue();
            i3 += u56.i((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        u56Var.m(i3);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            u56Var.w((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void s(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                u56Var.m(i << 3);
                u56Var.g(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        u56Var.m(i3);
        while (i2 < list.size()) {
            u56Var.g(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (u56.c(i << 3) + 8) * size;
    }

    public static void u(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!(list instanceof a76)) {
            if (!z) {
                while (i2 < list.size()) {
                    u56Var.l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            u56Var.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += u56.i(((Integer) list.get(i4)).intValue());
            }
            u56Var.m(i3);
            while (i2 < list.size()) {
                u56Var.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        a76 a76Var = (a76) list;
        if (!z) {
            while (i2 < a76Var.size()) {
                u56Var.l(i, a76Var.v(i2));
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a76Var.size(); i6++) {
            i5 += u56.i(a76Var.v(i6));
        }
        u56Var.m(i5);
        while (i2 < a76Var.size()) {
            u56Var.j(a76Var.v(i2));
            i2++;
        }
    }

    public static void v(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                u56Var.q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += u56.i(((Long) list.get(i4)).longValue());
        }
        u56Var.m(i3);
        while (i2 < list.size()) {
            u56Var.w(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long jLongValue = ((Long) list.get(i2)).longValue();
            i += u56.i((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return i;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i, List list, et4 et4Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!(list instanceof a76)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    u56Var.a(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            u56Var.t(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iC += u56.c((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            u56Var.m(iC);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                u56Var.m((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        a76 a76Var = (a76) list;
        if (!z) {
            while (i2 < a76Var.size()) {
                int iV = a76Var.v(i2);
                u56Var.a(i, (iV >> 31) ^ (iV + iV));
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < a76Var.size(); i4++) {
            int iV2 = a76Var.v(i4);
            iC2 += u56.c((iV2 >> 31) ^ (iV2 + iV2));
        }
        u56Var.m(iC2);
        while (i2 < a76Var.size()) {
            int iV3 = a76Var.v(i2);
            u56Var.m((iV3 >> 31) ^ (iV3 + iV3));
            i2++;
        }
    }

    public static void z(int i, List list, et4 et4Var, boolean z) throws ui0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        u56 u56Var = (u56) et4Var.t;
        int i2 = 0;
        if (!(list instanceof a76)) {
            if (!z) {
                while (i2 < list.size()) {
                    u56Var.r(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            u56Var.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            u56Var.m(i3);
            while (i2 < list.size()) {
                u56Var.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        a76 a76Var = (a76) list;
        if (!z) {
            while (i2 < a76Var.size()) {
                u56Var.r(i, a76Var.v(i2));
                i2++;
            }
            return;
        }
        u56Var.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a76Var.size(); i6++) {
            a76Var.v(i6);
            i5 += 4;
        }
        u56Var.m(i5);
        while (i2 < a76Var.size()) {
            u56Var.n(a76Var.v(i2));
            i2++;
        }
    }
}
