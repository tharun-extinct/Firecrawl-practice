package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class zh4 implements cb0, an5 {
    public Object a;
    public final fx0 j;
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(zh4.class, Object.class, "state$volatile");
    public static final /* synthetic */ long c = qr.g.objectFieldOffset(zh4.class.getDeclaredField("state$volatile"));
    private volatile /* synthetic */ Object state$volatile = pw5.a;
    public ArrayList t = new ArrayList(2);
    public int m = -1;
    public Object q = pw5.w;

    public zh4(fx0 fx0Var) {
        this.j = fx0Var;
    }

    @Override // defpackage.an5
    public final void g(nh4 nh4Var, int i) {
        this.a = nh4Var;
        this.m = i;
    }

    public final int l(Object obj, Object obj2) {
        zh4 zh4Var;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            Unsafe unsafe3 = qr.g;
            long j = c;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof hb0) {
                xh4 xh4VarV = this.v(obj);
                if (xh4VarV != null) {
                    cz1 cz1Var = xh4VarV.x;
                    cz1 cz1Var2 = cz1Var != null ? (cz1) cz1Var.x(this, xh4VarV.n, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = qr.g;
                        zh4Var = this;
                        if (unsafe4.compareAndSwapObject(zh4Var, c, objectVolatile, xh4VarV)) {
                            hb0 hb0Var = (hb0) objectVolatile;
                            zh4Var.q = obj2;
                            ky2 ky2VarQ = hb0Var.q(og5.g, cz1Var2);
                            if (ky2VarQ == null) {
                                zh4Var.q = pw5.w;
                                return 2;
                            }
                            hb0Var.H(ky2VarQ);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(zh4Var, j) != objectVolatile) {
                            break;
                        }
                        this = zh4Var;
                    }
                } else {
                    continue;
                }
            } else {
                zh4Var = this;
                if (yf2.p(objectVolatile, pw5.m) || (objectVolatile instanceof xh4)) {
                    return 3;
                }
                if (yf2.p(objectVolatile, pw5.q)) {
                    return 2;
                }
                if (yf2.p(objectVolatile, pw5.a)) {
                    List listK = pw5.k(obj);
                    do {
                        unsafe2 = qr.g;
                        if (unsafe2.compareAndSwapObject(zh4Var, c, objectVolatile, listK)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(zh4Var, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        l0.b(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListX0 = cj0.x0((Collection) objectVolatile, obj);
                    do {
                        unsafe = qr.g;
                        if (unsafe.compareAndSwapObject(zh4Var, c, objectVolatile, arrayListX0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(zh4Var, j) == objectVolatile);
                }
            }
            this = zh4Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object n(ou0 ou0Var) throws ha1 {
        yh4 yh4Var;
        Object obj;
        ib0 ib0Var;
        Unsafe unsafe;
        if (ou0Var instanceof yh4) {
            yh4Var = (yh4) ou0Var;
            int i = yh4Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                yh4Var.w = i - Integer.MIN_VALUE;
            } else {
                yh4Var = new yh4(this, ou0Var);
            }
        } else {
            yh4Var = new yh4(this, ou0Var);
        }
        yh4 yh4Var2 = yh4Var;
        Object obj2 = yh4Var2.m;
        int i2 = yh4Var2.w;
        Object obj3 = px0.j;
        if (i2 == 0) {
            js2.o(obj2);
            yh4Var2.w = 1;
            ib0 ib0Var2 = new ib0(1, pw5.o(yh4Var2));
            ib0Var2.o();
            loop0: while (true) {
                Unsafe unsafe2 = qr.g;
                long j = c;
                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
                ib0 ib0Var3 = ib0Var2;
                ky2 ky2Var = pw5.a;
                obj = og5.g;
                if (objectVolatile == ky2Var) {
                    ib0 ib0Var4 = ib0Var3;
                    while (true) {
                        Unsafe unsafe3 = qr.g;
                        ib0Var = ib0Var4;
                        if (unsafe3.compareAndSwapObject(this, c, objectVolatile, ib0Var4)) {
                            ib0Var.d(this);
                            break loop0;
                        }
                        if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                            break;
                        }
                        ib0Var4 = ib0Var;
                    }
                    ib0Var2 = ib0Var;
                } else {
                    ib0Var = ib0Var3;
                    if (!(objectVolatile instanceof List)) {
                        if (!(objectVolatile instanceof xh4)) {
                            l0.b(objectVolatile, "unexpected state: ");
                            return null;
                        }
                        xh4 xh4Var = (xh4) objectVolatile;
                        Object obj4 = this.q;
                        cz1 cz1Var = xh4Var.x;
                        ib0Var.m(obj, cz1Var != null ? (cz1) cz1Var.x(this, xh4Var.n, obj4) : null);
                        break;
                    }
                    do {
                        unsafe = qr.g;
                        if (unsafe.compareAndSwapObject(this, c, objectVolatile, ky2Var)) {
                            Iterator it = ((Iterable) objectVolatile).iterator();
                            while (it.hasNext()) {
                                xh4 xh4VarV = v(it.next());
                                xh4VarV.getClass();
                                xh4VarV.l = null;
                                xh4VarV.j = -1;
                                x(xh4VarV, true);
                            }
                            break;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    ib0Var2 = ib0Var;
                }
            }
            Object objZ = ib0Var.z();
            if (objZ == obj3) {
                obj = objZ;
            }
            if (obj != obj3) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                js2.o(obj2);
                return obj2;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(obj2);
        yh4Var2.w = 2;
        Object objR = r(yh4Var2);
        return objR == obj3 ? obj3 : objR;
    }

    public final Object r(ou0 ou0Var) {
        Unsafe unsafe = qr.g;
        long j = c;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        objectVolatile.getClass();
        xh4 xh4Var = (xh4) objectVolatile;
        Object obj = xh4Var.n;
        Object obj2 = this.q;
        ArrayList arrayList = this.t;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                xh4 xh4Var2 = (xh4) obj3;
                if (xh4Var2 != xh4Var) {
                    xh4Var2.g();
                }
            }
            qr.g.putObjectVolatile(this, j, pw5.m);
            this.q = pw5.w;
            this.t = null;
        }
        Object objX = xh4Var.r.x(xh4Var.g, obj, obj2);
        jz1 jz1Var = xh4Var.v;
        return obj == pw5.c ? ((xy1) jz1Var).a(ou0Var) : ((bz1) jz1Var).l(objX, ou0Var);
    }

    public final xh4 v(Object obj) {
        ArrayList arrayList = this.t;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (((xh4) obj3).g == obj) {
                obj2 = obj3;
                break;
            }
        }
        xh4 xh4Var = (xh4) obj2;
        if (xh4Var != null) {
            return xh4Var;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void x(xh4 xh4Var, boolean z) {
        Object obj = xh4Var.g;
        Unsafe unsafe = qr.g;
        long j = c;
        if (unsafe.getObjectVolatile(this, j) instanceof xh4) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.t;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((xh4) obj2).g == obj) {
                        uo1.p(obj, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        xh4Var.y.x(obj, this, xh4Var.n);
        if (this.q != pw5.w) {
            qr.g.putObjectVolatile(this, j, xh4Var);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.t;
            arrayList2.getClass();
            arrayList2.add(xh4Var);
        }
        xh4Var.l = this.a;
        xh4Var.j = this.m;
        this.a = null;
        this.m = -1;
    }

    @Override // defpackage.cb0
    public final void y(Throwable th) {
        Object objectVolatile;
        do {
            objectVolatile = qr.g.getObjectVolatile(this, c);
            if (objectVolatile == pw5.m) {
                return;
            }
        } while (!ei3.a(this, objectVolatile));
        ArrayList arrayList = this.t;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((xh4) obj).g();
        }
        this.q = pw5.w;
        this.t = null;
    }
}
