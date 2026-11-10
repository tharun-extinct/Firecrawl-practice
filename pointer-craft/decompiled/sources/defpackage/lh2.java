package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class lh2 implements wa2 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long t;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final ih3 j;

    static {
        Unsafe unsafe = qr.g;
        a = unsafe.objectFieldOffset(lh2.class.getDeclaredField("_isCompleting$volatile"));
        m = unsafe.objectFieldOffset(lh2.class.getDeclaredField("_rootCause$volatile"));
        t = unsafe.objectFieldOffset(lh2.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public lh2(ih3 ih3Var, Throwable th) {
        this.j = ih3Var;
        this._rootCause$volatile = th;
    }

    public final void g(Throwable th) {
        Throwable thR = r();
        if (thR == null) {
            qr.g.putObjectVolatile(this, m, th);
            return;
        }
        if (th == thR) {
            return;
        }
        Unsafe unsafe = qr.g;
        long j = t;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                l0.b(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    public final ArrayList l(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = qr.g;
        long j = t;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                l0.b(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thR = r();
        if (thR != null) {
            arrayList.add(0, thR);
        }
        if (th != null && !th.equals(thR)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, gp4.o);
        return arrayList;
    }

    @Override // defpackage.wa2
    public final ih3 n() {
        return this.j;
    }

    public final Throwable r() {
        return (Throwable) qr.g.getObjectVolatile(this, m);
    }

    public final String toString() {
        return "Finishing[cancelling=" + v() + ", completing=" + x() + ", rootCause=" + r() + ", exceptions=" + qr.g.getObjectVolatile(this, t) + ", list=" + this.j + ']';
    }

    public final boolean v() {
        return r() != null;
    }

    public final boolean x() {
        return qr.g.getIntVolatile(this, a) == 1;
    }

    @Override // defpackage.wa2
    public final boolean y() {
        return r() == null;
    }
}
