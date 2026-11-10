package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class q16 extends qc6 {
    public static final long j;
    public static final long l;
    public static final long n;
    public static final Unsafe r;
    public static final long v;
    public static final long x;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new x16());
            }
            try {
                v = unsafe.objectFieldOffset(t16.class.getDeclaredField("a"));
                n = unsafe.objectFieldOffset(t16.class.getDeclaredField("t"));
                x = unsafe.objectFieldOffset(t16.class.getDeclaredField("j"));
                l = unsafe.objectFieldOffset(r16.class.getDeclaredField("g"));
                j = unsafe.objectFieldOffset(r16.class.getDeclaredField("y"));
                r = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            uo1.w("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // defpackage.qc6
    public final boolean j(t16 t16Var, Object obj, Object obj2) {
        return uc6.x(r, t16Var, x, obj, obj2);
    }

    @Override // defpackage.qc6
    public final boolean l(h36 h36Var, m16 m16Var, m16 m16Var2) {
        return uc6.x(r, h36Var, n, m16Var, m16Var2);
    }

    @Override // defpackage.qc6
    public final r16 n(h36 h36Var) {
        r16 r16Var;
        r16 r16Var2 = r16.r;
        do {
            r16Var = h36Var.a;
            if (r16Var2 == r16Var) {
                break;
            }
        } while (!t(h36Var, r16Var, r16Var2));
        return r16Var;
    }

    @Override // defpackage.qc6
    public final m16 r(h36 h36Var) {
        m16 m16Var;
        m16 m16Var2 = m16.n;
        do {
            m16Var = h36Var.t;
            if (m16Var2 == m16Var) {
                break;
            }
        } while (!l(h36Var, m16Var, m16Var2));
        return m16Var;
    }

    @Override // defpackage.qc6
    public final boolean t(t16 t16Var, r16 r16Var, r16 r16Var2) {
        return uc6.x(r, t16Var, v, r16Var, r16Var2);
    }

    @Override // defpackage.qc6
    public final void v(r16 r16Var, r16 r16Var2) {
        r.putObject(r16Var, j, r16Var2);
    }

    @Override // defpackage.qc6
    public final void x(r16 r16Var, Thread thread) {
        r.putObject(r16Var, l, thread);
    }
}
