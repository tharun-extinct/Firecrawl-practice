package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class pe4 {
    public static final Class g;
    public static final rg5 r;
    public static final rg5 y;

    static {
        Class<?> cls;
        Class<?> cls2;
        z04 z04Var = z04.r;
        rg5 rg5Var = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        g = cls;
        try {
            z04 z04Var2 = z04.r;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                rg5Var = (rg5) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        y = rg5Var;
        r = new rg5();
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ce2)) {
            int iX = 0;
            while (i < size) {
                iX += yi0.x(((Integer) list.get(i)).intValue());
                i++;
            }
            return iX;
        }
        ce2 ce2Var = (ce2) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += yi0.x(ce2Var.v(i));
            i++;
        }
        return iX2;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ce2)) {
            int iA = 0;
            while (i < size) {
                iA += yi0.A(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        ce2 ce2Var = (ce2) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += yi0.A(ce2Var.v(i));
            i++;
        }
        return iA2;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ly2)) {
            int iO = 0;
            while (i < size) {
                iO += yi0.o(((Long) list.get(i)).longValue());
                i++;
            }
            return iO;
        }
        ly2 ly2Var = (ly2) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += yi0.o(ly2Var.n(i));
            i++;
        }
        return iO2;
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
    public static void m(rg5 rg5Var, Object obj, Object obj2) {
        rg5Var.getClass();
        b12 b12Var = (b12) obj;
        pg5 pg5Var = b12Var.unknownFields;
        pg5 pg5Var2 = ((b12) obj2).unknownFields;
        pg5 pg5Var3 = pg5.x;
        if (!pg5Var3.equals(pg5Var2)) {
            if (pg5Var3.equals(pg5Var)) {
                int i = pg5Var.g + pg5Var2.g;
                int[] iArrCopyOf = Arrays.copyOf(pg5Var.y, i);
                System.arraycopy(pg5Var2.y, 0, iArrCopyOf, pg5Var.g, pg5Var2.g);
                Object[] objArrCopyOf = Arrays.copyOf(pg5Var.r, i);
                System.arraycopy(pg5Var2.r, 0, objArrCopyOf, pg5Var.g, pg5Var2.g);
                pg5Var = new pg5(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                pg5Var.getClass();
                if (!pg5Var2.equals(pg5Var3)) {
                    if (!pg5Var.v) {
                        uo1.f();
                        return;
                    }
                    int i2 = pg5Var.g + pg5Var2.g;
                    pg5Var.g(i2);
                    System.arraycopy(pg5Var2.y, 0, pg5Var.y, pg5Var.g, pg5Var2.g);
                    System.arraycopy(pg5Var2.r, 0, pg5Var.r, pg5Var.g, pg5Var2.g);
                    pg5Var.g = i2;
                }
            }
        }
        b12Var.unknownFields = pg5Var;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ce2)) {
            int iQ = 0;
            while (i < size) {
                iQ += yi0.q(((Integer) list.get(i)).intValue());
                i++;
            }
            return iQ;
        }
        ce2 ce2Var = (ce2) list;
        int iQ2 = 0;
        while (i < size) {
            iQ2 += yi0.q(ce2Var.v(i));
            i++;
        }
        return iQ2;
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
        return yi0.j(i) * size;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ly2)) {
            int iC = 0;
            while (i < size) {
                iC += yi0.C(((Long) list.get(i)).longValue());
                i++;
            }
            return iC;
        }
        ly2 ly2Var = (ly2) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += yi0.C(ly2Var.n(i));
            i++;
        }
        return iC2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ly2)) {
            int iC = 0;
            while (i < size) {
                iC += yi0.c(((Long) list.get(i)).longValue());
                i++;
            }
            return iC;
        }
        ly2 ly2Var = (ly2) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += yi0.c(ly2Var.n(i));
            i++;
        }
        return iC2;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ce2)) {
            int iZ = 0;
            while (i < size) {
                iZ += yi0.z(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZ;
        }
        ce2 ce2Var = (ce2) list;
        int iZ2 = 0;
        while (i < size) {
            iZ2 += yi0.z(ce2Var.v(i));
            i++;
        }
        return iZ2;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return yi0.l(i) * size;
    }

    public static Object a(Object obj, int i, df2 df2Var, Object obj2, rg5 rg5Var) {
        return obj2;
    }
}
