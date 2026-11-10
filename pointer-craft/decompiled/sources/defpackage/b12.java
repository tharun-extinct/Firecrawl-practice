package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b12 extends s0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, b12> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected pg5 unknownFields;

    public b12() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = pg5.x;
    }

    public static void a(Class cls, b12 b12Var) {
        b12Var.j();
        defaultInstanceMap.put(cls, b12Var);
    }

    public static b12 n(Class cls) {
        b12 b12Var = defaultInstanceMap.get(cls);
        if (b12Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b12Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (b12Var != null) {
            return b12Var;
        }
        try {
            b12 b12Var2 = (b12) ((b12) ih5.g.allocateInstance(cls)).r(6);
            if (b12Var2 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, b12Var2);
            return b12Var2;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object v(Method method, b12 b12Var, Object... objArr) {
        try {
            return method.invoke(b12Var, objArr);
        } catch (IllegalAccessException e) {
            uo1.w("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            uo1.w("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean x(b12 b12Var, boolean z) {
        byte bByteValue = ((Byte) b12Var.r(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        z04 z04Var = z04.r;
        z04Var.getClass();
        boolean zR = z04Var.g(b12Var.getClass()).r(b12Var);
        if (z) {
            b12Var.r(2);
        }
        return zR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z04 z04Var = z04.r;
        z04Var.getClass();
        return z04Var.g(getClass()).a(this, (b12) obj);
    }

    @Override // defpackage.s0
    public final int g(le4 le4Var) {
        int iJ;
        int iJ2;
        if (l()) {
            if (le4Var == null) {
                z04 z04Var = z04.r;
                z04Var.getClass();
                iJ2 = z04Var.g(getClass()).j(this);
            } else {
                iJ2 = le4Var.j(this);
            }
            if (iJ2 >= 0) {
                return iJ2;
            }
            l0.z(xi3.j("serialized size must be non-negative, was ", iJ2));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (le4Var == null) {
            z04 z04Var2 = z04.r;
            z04Var2.getClass();
            iJ = z04Var2.g(getClass()).j(this);
        } else {
            iJ = le4Var.j(this);
        }
        m(iJ);
        return iJ;
    }

    public final int hashCode() {
        if (l()) {
            z04 z04Var = z04.r;
            z04Var.getClass();
            return z04Var.g(getClass()).x(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        z04 z04Var2 = z04.r;
        z04Var2.getClass();
        int iX = z04Var2.g(getClass()).x(this);
        this.memoizedHashCode = iX;
        return iX;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final boolean l() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void m(int i) {
        if (i < 0) {
            l0.z(xi3.j("serialized size must be non-negative, was ", i));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final void q(yi0 yi0Var) {
        z04 z04Var = z04.r;
        z04Var.getClass();
        z04Var.g(getClass()).v(this, fa4.A(yi0Var));
    }

    public abstract Object r(int i);

    public final b12 t() {
        return (b12) r(4);
    }

    public final String toString() {
        return m53.n(this, super.toString());
    }

    public final x02 y() {
        return (x02) r(5);
    }
}
