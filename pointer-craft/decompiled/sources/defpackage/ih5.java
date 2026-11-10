package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class ih5 {
    public static final Unsafe g;
    public static final boolean l;
    public static final boolean n;
    public static final hh5 r;
    public static final boolean v;
    public static final long x;
    public static final Class y;

    static {
        Unsafe unsafe;
        hh5 dh5Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new ch5((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        g = unsafe;
        y = v8.g;
        boolean zN = n(Long.TYPE);
        boolean zN2 = n(Integer.TYPE);
        if (unsafe != null) {
            if (!v8.g()) {
                dh5Var = new dh5(unsafe, (byte) 1);
            } else if (zN) {
                dh5Var = new fh5(unsafe, (byte) 0);
            } else if (zN2) {
                dh5Var = new dh5(unsafe, (byte) 0);
            }
        }
        r = dh5Var;
        n = dh5Var == null ? false : dh5Var.a();
        v = dh5Var == null ? false : dh5Var.t();
        x = g(byte[].class);
        g(boolean[].class);
        y(boolean[].class);
        g(int[].class);
        y(int[].class);
        g(long[].class);
        y(long[].class);
        g(float[].class);
        y(float[].class);
        g(double[].class);
        y(double[].class);
        g(Object[].class);
        y(Object[].class);
        Field fieldR = r();
        if (fieldR != null && dh5Var != null) {
            dh5Var.y.objectFieldOffset(fieldR);
        }
        l = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object a(long j, Object obj) {
        return r.y.getObject(obj, j);
    }

    public static void b(Object obj, long j, long j2) {
        r.y.putLong(obj, j, j2);
    }

    public static void c(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        i(obj, j2, ((255 & b) << i) | (j(j2, obj) & (~(255 << i))));
    }

    public static int g(Class cls) {
        if (v) {
            return r.y.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void i(Object obj, long j, int i) {
        r.y.putInt(obj, j, i);
    }

    public static int j(long j, Object obj) {
        return r.y.getInt(obj, j);
    }

    public static byte l(long j, Object obj) {
        return (byte) ((j((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static void m(Throwable th) {
        Logger.getLogger(ih5.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean n(Class cls) {
        if (!v8.g()) {
            return false;
        }
        try {
            Class cls2 = y;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void q(byte[] bArr, long j, byte b) {
        r.x(bArr, x + j, b);
    }

    public static Field r() {
        Field declaredField;
        Field declaredField2;
        if (v8.g()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static void s(long j, Object obj, Object obj2) {
        r.y.putObject(obj, j, obj2);
    }

    public static long t(long j, Object obj) {
        return r.y.getLong(obj, j);
    }

    public static byte v(byte[] bArr, long j) {
        return r.y(x + j, bArr);
    }

    public static void w(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iJ = j(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        i(obj, j2, ((255 & b) << i) | (iJ & (~(255 << i))));
    }

    public static byte x(long j, Object obj) {
        return (byte) ((j((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static void y(Class cls) {
        if (v) {
            r.y.arrayIndexScale(cls);
        }
    }
}
