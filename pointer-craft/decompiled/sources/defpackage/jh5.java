package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class jh5 {
    public static final Unsafe g;
    public static final boolean l;
    public static final boolean n;
    public static final hh5 r;
    public static final boolean v;
    public static final long x;
    public static final Class y;

    static {
        Unsafe unsafe;
        hh5 eh5Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new ch5((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        g = unsafe;
        y = w8.g;
        boolean zN = n(Long.TYPE);
        boolean zN2 = n(Integer.TYPE);
        if (unsafe != null) {
            if (!w8.g()) {
                eh5Var = new eh5(unsafe, (byte) 1);
            } else if (zN) {
                eh5Var = new gh5(unsafe, (byte) 1);
            } else if (zN2) {
                eh5Var = new eh5(unsafe, (byte) 0);
            }
        }
        r = eh5Var;
        n = eh5Var == null ? false : eh5Var.a();
        v = eh5Var == null ? false : eh5Var.t();
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
        if (fieldR != null && eh5Var != null) {
            eh5Var.y.objectFieldOffset(fieldR);
        }
        l = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(byte[] bArr, long j, byte b) {
        r.x(bArr, x + j, b);
    }

    public static void c(Object obj, long j, long j2) {
        r.y.putLong(obj, j, j2);
    }

    public static int g(Class cls) {
        if (v) {
            return r.y.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void i(long j, Object obj, Object obj2) {
        r.y.putObject(obj, j, obj2);
    }

    public static Object j(long j, Object obj) {
        return r.y.getObject(obj, j);
    }

    public static long l(long j, Object obj) {
        return r.y.getLong(obj, j);
    }

    public static void m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iX = x(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        w(obj, j2, ((255 & b) << i) | (iX & (~(255 << i))));
    }

    public static boolean n(Class cls) {
        if (!w8.g()) {
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

    public static void q(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        w(obj, j2, ((255 & b) << i) | (x(j2, obj) & (~(255 << i))));
    }

    public static Field r() {
        Field declaredField;
        Field declaredField2;
        if (w8.g()) {
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

    public static void t(Throwable th) {
        Logger.getLogger(jh5.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean v(long j, Object obj) {
        return ((byte) ((x((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static void w(Object obj, long j, int i) {
        r.y.putInt(obj, j, i);
    }

    public static int x(long j, Object obj) {
        return r.y.getInt(obj, j);
    }

    public static void y(Class cls) {
        if (v) {
            r.y.arrayIndexScale(cls);
        }
    }
}
