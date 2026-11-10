package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class eh5 extends hh5 {
    public final /* synthetic */ byte r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh5(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 1);
        this.r = b;
    }

    @Override // defpackage.hh5
    public final boolean a() {
        switch (this.r) {
            case 0:
                return false;
            default:
                Unsafe unsafe = this.y;
                if (unsafe == null) {
                    return false;
                }
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (jh5.r() == null) {
                        return false;
                    }
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        jh5.t(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    jh5.t(th2);
                    return false;
                }
        }
    }

    @Override // defpackage.hh5
    public final boolean g(long j, Object obj) {
        switch (this.r) {
            case 0:
                if (jh5.l) {
                    return jh5.v(j, obj);
                }
                return ((byte) ((jh5.x((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            default:
                return this.y.getBoolean(obj, j);
        }
    }

    @Override // defpackage.hh5
    public final void j(Object obj, long j, float f) {
        switch (this.r) {
            case 0:
                this.y.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.y.putFloat(obj, j, f);
                break;
        }
    }

    @Override // defpackage.hh5
    public final void l(Object obj, long j, double d) {
        switch (this.r) {
            case 0:
                this.y.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.y.putDouble(obj, j, d);
                break;
        }
    }

    @Override // defpackage.hh5
    public final float n(long j, Object obj) {
        switch (this.r) {
            case 0:
                return Float.intBitsToFloat(this.y.getInt(obj, j));
            default:
                return this.y.getFloat(obj, j);
        }
    }

    @Override // defpackage.hh5
    public final double r(long j, Object obj) {
        switch (this.r) {
            case 0:
                return Double.longBitsToDouble(this.y.getLong(obj, j));
            default:
                return this.y.getDouble(obj, j);
        }
    }

    @Override // defpackage.hh5
    public boolean t() {
        switch (this.r) {
            case 1:
                if (!super.t()) {
                    return false;
                }
                try {
                    Class<?> cls = this.y.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    jh5.t(th);
                    return false;
                }
            default:
                return super.t();
        }
    }

    @Override // defpackage.hh5
    public final void v(Object obj, long j, boolean z) {
        switch (this.r) {
            case 0:
                if (!jh5.l) {
                    jh5.q(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    jh5.m(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                this.y.putBoolean(obj, j, z);
                break;
        }
    }

    @Override // defpackage.hh5
    public final void x(Object obj, long j, byte b) {
        switch (this.r) {
            case 0:
                if (!jh5.l) {
                    jh5.q(obj, j, b);
                } else {
                    jh5.m(obj, j, b);
                }
                break;
            default:
                this.y.putByte(obj, j, b);
                break;
        }
    }
}
