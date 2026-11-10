package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class hh5 {
    public final /* synthetic */ byte g;
    public final Unsafe y;

    public /* synthetic */ hh5(Unsafe unsafe, byte b) {
        this.g = b;
        this.y = unsafe;
    }

    public boolean a() {
        return false;
    }

    public void b(Object obj, long j, float f) {
        this.y.putInt(obj, j, Float.floatToIntBits(f));
    }

    public void c(Object obj, long j, byte b) {
        if (va6.l) {
            va6.r(obj, j, b);
        } else {
            va6.n(obj, j, b);
        }
    }

    public boolean g(long j, Object obj) {
        if (ih5.l) {
            return ih5.x(j, obj) != 0;
        }
        return ih5.l(j, obj) != 0;
    }

    public void i(Object obj, long j, double d) {
        this.y.putLong(obj, j, Double.doubleToLongBits(d));
    }

    public void j(Object obj, long j, float f) {
        this.y.putInt(obj, j, Float.floatToIntBits(f));
    }

    public void l(Object obj, long j, double d) {
        this.y.putLong(obj, j, Double.doubleToLongBits(d));
    }

    public double m(long j, Object obj) {
        return Double.longBitsToDouble(this.y.getLong(obj, j));
    }

    public float n(long j, Object obj) {
        return Float.intBitsToFloat(this.y.getInt(obj, j));
    }

    public float q(long j, Object obj) {
        return Float.intBitsToFloat(this.y.getInt(obj, j));
    }

    public double r(long j, Object obj) {
        return Double.longBitsToDouble(this.y.getLong(obj, j));
    }

    public boolean s(long j, Object obj) {
        return va6.l ? va6.m(j, obj) : va6.q(j, obj);
    }

    public boolean t() {
        byte b = this.g;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        Unsafe unsafe = this.y;
        switch (b) {
            case 0:
                if (unsafe != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        cls3.getMethod("getInt", Object.class, cls2);
                        cls3.getMethod("putInt", Object.class, cls2, cls);
                        cls3.getMethod("getLong", Object.class, cls2);
                        cls3.getMethod("putLong", Object.class, cls2, cls2);
                        cls3.getMethod("getObject", Object.class, cls2);
                        cls3.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th) {
                        ih5.m(th);
                    }
                }
                return false;
            default:
                if (unsafe != null) {
                    try {
                        Class<?> cls4 = unsafe.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls2);
                        cls4.getMethod("putInt", Object.class, cls2, cls);
                        cls4.getMethod("getLong", Object.class, cls2);
                        cls4.getMethod("putLong", Object.class, cls2, cls2);
                        cls4.getMethod("getObject", Object.class, cls2);
                        cls4.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th2) {
                        jh5.t(th2);
                    }
                }
                return false;
        }
    }

    public void v(Object obj, long j, boolean z) {
        if (ih5.l) {
            ih5.w(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            ih5.c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    public void w(Object obj, long j, boolean z) {
        if (va6.l) {
            va6.r(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            va6.n(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    public void x(Object obj, long j, byte b) {
        if (ih5.l) {
            ih5.w(obj, j, b);
        } else {
            ih5.c(obj, j, b);
        }
    }

    public byte y(long j, Object obj) {
        return ih5.l ? ih5.x(j, obj) : ih5.l(j, obj);
    }
}
