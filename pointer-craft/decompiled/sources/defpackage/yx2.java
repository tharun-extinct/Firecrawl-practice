package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class yx2 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long t;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = qr.g;
        j = unsafe.objectFieldOffset(yx2.class.getDeclaredField("_next$volatile"));
        t = unsafe.objectFieldOffset(yx2.class.getDeclaredField("_prev$volatile"));
        a = unsafe.objectFieldOffset(yx2.class.getDeclaredField("_removedRef$volatile"));
    }

    public final yx2 a() {
        yx2 yx2VarX = x();
        if (yx2VarX != null) {
            return yx2VarX;
        }
        Unsafe unsafe = qr.g;
        long j2 = t;
        Object objectVolatile = unsafe.getObjectVolatile(this, j2);
        while (true) {
            yx2 yx2Var = (yx2) objectVolatile;
            if (!yx2Var.m()) {
                return yx2Var;
            }
            objectVolatile = qr.g.getObjectVolatile(yx2Var, j2);
        }
    }

    public final Object j() {
        return qr.g.getObjectVolatile(this, j);
    }

    public final void l(yx2 yx2Var) {
        yx2 yx2Var2;
        while (true) {
            Unsafe unsafe = qr.g;
            long j2 = t;
            yx2 yx2Var3 = (yx2) unsafe.getObjectVolatile(yx2Var, j2);
            if (this.j() != yx2Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = qr.g;
                yx2Var2 = this;
                yx2 yx2Var4 = yx2Var;
                if (unsafe2.compareAndSwapObject(yx2Var4, t, yx2Var3, yx2Var2)) {
                    if (yx2Var2.m()) {
                        yx2Var4.x();
                        return;
                    }
                    return;
                } else {
                    yx2Var = yx2Var4;
                    if (unsafe2.getObjectVolatile(yx2Var4, j2) != yx2Var3) {
                        break;
                    } else {
                        this = yx2Var2;
                    }
                }
            }
            this = yx2Var2;
        }
    }

    public boolean m() {
        return j() instanceof v64;
    }

    public final yx2 t() {
        Object objJ = j();
        v64 v64Var = objJ instanceof v64 ? (v64) objJ : null;
        if (v64Var != null) {
            return v64Var.g;
        }
        objJ.getClass();
        return (yx2) objJ;
    }

    public String toString() {
        return new xx2(this) + '@' + a11.z(this);
    }

    public final boolean v(yx2 yx2Var, int i) {
        yx2 yx2Var2;
        yx2 yx2Var3;
        while (true) {
            yx2 yx2VarA = this.a();
            if (yx2VarA instanceof vv2) {
                return (((vv2) yx2VarA).m & i) == 0 && yx2VarA.v(yx2Var, i);
            }
            Unsafe unsafe = qr.g;
            unsafe.putObjectVolatile(yx2Var, t, yx2VarA);
            long j2 = j;
            unsafe.putObjectVolatile(yx2Var, j2, this);
            while (true) {
                Unsafe unsafe2 = qr.g;
                yx2Var2 = this;
                yx2Var3 = yx2Var;
                if (unsafe2.compareAndSwapObject(yx2VarA, j, yx2Var2, yx2Var3)) {
                    yx2Var3.l(yx2Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(yx2VarA, j2) != yx2Var2) {
                    break;
                }
                this = yx2Var2;
                yx2Var = yx2Var3;
            }
            this = yx2Var2;
            yx2Var = yx2Var3;
        }
    }

    public final yx2 x() {
        while (true) {
            Unsafe unsafe = qr.g;
            long j2 = t;
            yx2 yx2Var = (yx2) unsafe.getObjectVolatile(this, j2);
            yx2 yx2Var2 = null;
            yx2 yx2Var3 = yx2Var;
            while (true) {
                if (yx2Var3 == null) {
                    uo1.B();
                    return null;
                }
                Unsafe unsafe2 = qr.g;
                long j3 = j;
                Object objectVolatile = unsafe2.getObjectVolatile(yx2Var3, j3);
                if (objectVolatile == this) {
                    if (yx2Var != yx2Var3) {
                        while (true) {
                            Unsafe unsafe3 = qr.g;
                            yx2 yx2Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(yx2Var4, t, yx2Var, yx2Var3);
                            yx2 yx2Var5 = yx2Var;
                            this = yx2Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j2) != yx2Var5) {
                                    break;
                                }
                                this = this;
                                yx2Var = yx2Var5;
                            }
                        }
                    }
                    return yx2Var3;
                }
                yx2Var = yx2Var;
                this = this;
                if (this.m()) {
                    return null;
                }
                if (!(objectVolatile instanceof v64)) {
                    objectVolatile.getClass();
                    yx2Var2 = yx2Var3;
                    yx2Var3 = (yx2) objectVolatile;
                } else if (yx2Var2 != null) {
                    yx2 yx2Var6 = ((v64) objectVolatile).g;
                    while (true) {
                        yx2 yx2Var7 = yx2Var3;
                        Unsafe unsafe4 = qr.g;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(yx2Var2, j, yx2Var7, yx2Var6);
                        yx2Var3 = yx2Var7;
                        if (zCompareAndSwapObject2) {
                            yx2Var3 = yx2Var2;
                            yx2Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(yx2Var2, j3) != yx2Var3) {
                            break;
                        }
                    }
                } else {
                    if (yx2Var3 == null) {
                        uo1.B();
                        return null;
                    }
                    yx2Var3 = (yx2) unsafe2.getObjectVolatile(yx2Var3, j2);
                }
            }
            this = this;
        }
    }
}
