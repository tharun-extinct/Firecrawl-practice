package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class va6 {
    public static final Unsafe g;
    public static final boolean l;
    public static final boolean n;
    public static final hh5 r;
    public static final boolean v;
    public static final long x;
    public static final Class y;

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    static {
        boolean z;
        boolean z2;
        hh5 hh5Var;
        Unsafe unsafeJ = j();
        g = unsafeJ;
        int i = z46.g;
        y = Memory.class;
        Class cls = Long.TYPE;
        boolean zW = w(cls);
        Class cls2 = Integer.TYPE;
        boolean zW2 = w(cls2);
        hh5 ra6Var = null;
        if (unsafeJ != null) {
            if (zW) {
                ra6Var = new ta6(unsafeJ, (byte) 2);
            } else if (zW2) {
                ra6Var = new ra6(unsafeJ);
            }
        }
        r = ra6Var;
        if (ra6Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = ra6Var.y.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (y() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(va6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        n = z;
        hh5 hh5Var2 = r;
        if (hh5Var2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = hh5Var2.y.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                Logger.getLogger(va6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        v = z2;
        x = c(byte[].class);
        c(boolean[].class);
        g(boolean[].class);
        c(int[].class);
        g(int[].class);
        c(long[].class);
        g(long[].class);
        c(float[].class);
        g(float[].class);
        c(double[].class);
        g(double[].class);
        c(Object[].class);
        g(Object[].class);
        Field fieldY = y();
        if (fieldY != null && (hh5Var = r) != null) {
            hh5Var.y.objectFieldOffset(fieldY);
        }
        l = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(long j, Object obj, Object obj2) {
        r.y.putObject(obj, j, obj2);
    }

    public static int c(Class cls) {
        if (v) {
            return r.y.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void g(Class cls) {
        if (v) {
            r.y.arrayIndexScale(cls);
        }
    }

    public static Unsafe j() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new ch5((byte) 2));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(va6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static Object l(long j, Object obj) {
        return r.y.getObject(obj, j);
    }

    public static /* bridge */ /* synthetic */ boolean m(long j, Object obj) {
        return ((byte) ((r.y.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static void n(Object obj, long j, byte b) {
        Unsafe unsafe = r.y;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static /* bridge */ /* synthetic */ boolean q(long j, Object obj) {
        return ((byte) ((r.y.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static void r(Object obj, long j, byte b) {
        Unsafe unsafe = r.y;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void t(Object obj, long j, int i) {
        r.y.putInt(obj, j, i);
    }

    public static int v(long j, Object obj) {
        return r.y.getInt(obj, j);
    }

    public static boolean w(Class cls) {
        int i = z46.g;
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

    public static long x(long j, Object obj) {
        return r.y.getLong(obj, j);
    }

    public static Field y() {
        Field declaredField;
        Field declaredField2;
        int i = z46.g;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }
}
