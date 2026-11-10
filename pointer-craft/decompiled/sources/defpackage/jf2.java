package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jf2 extends zz4 implements bz1 {
    public /* synthetic */ Object b;
    public Object c;
    public byte i;
    public final /* synthetic */ xy1 p;
    public final /* synthetic */ byte q;
    public final /* synthetic */ ub3 s;
    public Object u;
    public cc3 w;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf2(ub3 ub3Var, Object obj, xy1 xy1Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.s = ub3Var;
        this.z = obj;
        this.p = xy1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                jf2 jf2Var = new jf2(this.s, (kf2) obj2, this.p, mu0Var, (byte) 0);
                jf2Var.b = obj;
                return jf2Var;
            default:
                jf2 jf2Var2 = new jf2(this.s, (ac3) obj2, this.p, mu0Var, (byte) 1);
                jf2Var2.b = obj;
                return jf2Var2;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((jf2) b(mu0Var, ox0Var)).u(og5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [cc3, java.lang.Object, xy1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xy1] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v8, types: [xy1] */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        if2 if2Var;
        cc3 cc3Var;
        ?? r1;
        Throwable th;
        if2 if2Var2;
        kf2 kf2Var;
        cc3 cc3Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        xb3 xb3Var;
        cc3 cc3Var3;
        ?? r2;
        Throwable th2;
        xb3 xb3Var2;
        ac3 ac3Var;
        cc3 cc3Var4;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        byte b = this.q;
        ?? r3 = this.p;
        ub3 ub3Var = this.s;
        px0 px0Var = px0.j;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                kf2 kf2Var2 = (kf2) obj2;
                byte b2 = this.i;
                try {
                    try {
                        if (b2 == 0) {
                            js2.o(obj);
                            dx0 dx0VarH = ((ox0) this.b).w().h(d52.m);
                            dx0VarH.getClass();
                            if2Var = new if2(ub3Var, (dh2) dx0VarH);
                            AtomicReference atomicReference5 = kf2Var2.g;
                            while (true) {
                                if2 if2Var3 = (if2) atomicReference5.get();
                                if (if2Var3 != null && if2Var.g.compareTo(if2Var3.g) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (true) {
                                    if (atomicReference5.compareAndSet(if2Var3, if2Var)) {
                                        if (if2Var3 != null) {
                                            if2Var3.y.x(null);
                                        }
                                        cc3Var = kf2Var2.y;
                                        this.b = if2Var;
                                        this.w = cc3Var;
                                        this.c = r3;
                                        this.u = kf2Var2;
                                        this.i = (byte) 1;
                                        r1 = r3;
                                        if (cc3Var.y(this) == px0Var) {
                                            return px0Var;
                                        }
                                    } else if (atomicReference5.get() != if2Var3) {
                                    }
                                }
                            }
                        } else {
                            if (b2 != 1) {
                                if (b2 != 2) {
                                    l0.z("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kf2Var = (kf2) this.c;
                                cc3Var2 = this.w;
                                if2Var2 = (if2) this.b;
                                try {
                                    js2.o(obj);
                                    atomicReference2 = kf2Var.g;
                                    while (!atomicReference2.compareAndSet(if2Var2, null) && atomicReference2.get() == if2Var2) {
                                    }
                                    cc3Var2.x(null);
                                    return obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    atomicReference = kf2Var.g;
                                    while (!atomicReference.compareAndSet(if2Var2, null) && atomicReference.get() == if2Var2) {
                                    }
                                    throw th;
                                }
                            }
                            kf2Var2 = (kf2) this.u;
                            xy1 xy1Var = (xy1) this.c;
                            cc3 cc3Var5 = this.w;
                            if2 if2Var4 = (if2) this.b;
                            js2.o(obj);
                            cc3Var = cc3Var5;
                            if2Var = if2Var4;
                            r1 = xy1Var;
                        }
                        this.b = if2Var;
                        this.w = cc3Var;
                        this.c = kf2Var2;
                        this.u = null;
                        this.i = (byte) 2;
                        Object objA = r1.a(this);
                        if (objA == px0Var) {
                            return px0Var;
                        }
                        cc3Var2 = cc3Var;
                        obj = objA;
                        if2Var2 = if2Var;
                        kf2Var = kf2Var2;
                        atomicReference2 = kf2Var.g;
                        while (!atomicReference2.compareAndSet(if2Var2, null)) {
                        }
                        cc3Var2.x(null);
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                        if2Var2 = if2Var;
                        kf2Var = kf2Var2;
                        atomicReference = kf2Var.g;
                        while (!atomicReference.compareAndSet(if2Var2, null)) {
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    r3.x(null);
                    throw th5;
                }
            default:
                ac3 ac3Var2 = (ac3) obj2;
                byte b3 = this.i;
                try {
                    try {
                        if (b3 == 0) {
                            js2.o(obj);
                            dx0 dx0VarH2 = ((ox0) this.b).w().h(d52.m);
                            dx0VarH2.getClass();
                            xb3Var = new xb3(ub3Var, (dh2) dx0VarH2);
                            ac3Var2.g(xb3Var);
                            cc3Var3 = ac3Var2.y;
                            this.b = xb3Var;
                            this.w = cc3Var3;
                            this.c = r3;
                            this.u = ac3Var2;
                            this.i = (byte) 1;
                            if (cc3Var3.y(this) == px0Var) {
                                r2 = r3;
                                return px0Var;
                            }
                        } else {
                            if (b3 != 1) {
                                if (b3 != 2) {
                                    l0.z("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ac3Var = (ac3) this.c;
                                cc3Var4 = this.w;
                                xb3Var2 = (xb3) this.b;
                                try {
                                    js2.o(obj);
                                    atomicReference4 = ac3Var.g;
                                    while (!atomicReference4.compareAndSet(xb3Var2, null) && atomicReference4.get() == xb3Var2) {
                                    }
                                    cc3Var4.x(null);
                                    return obj;
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    atomicReference3 = ac3Var.g;
                                    while (!atomicReference3.compareAndSet(xb3Var2, null)) {
                                    }
                                    throw th2;
                                }
                            }
                            ac3Var2 = (ac3) this.u;
                            xy1 xy1Var2 = (xy1) this.c;
                            cc3 cc3Var6 = this.w;
                            xb3 xb3Var3 = (xb3) this.b;
                            js2.o(obj);
                            cc3Var3 = cc3Var6;
                            xb3Var = xb3Var3;
                            r2 = xy1Var2;
                        }
                        r2 = r3;
                        this.b = xb3Var;
                        this.w = cc3Var3;
                        this.c = ac3Var2;
                        this.u = null;
                        this.i = (byte) 2;
                        Object objA2 = r2.a(this);
                        if (objA2 == px0Var) {
                            return px0Var;
                        }
                        cc3Var4 = cc3Var3;
                        obj = objA2;
                        xb3Var2 = xb3Var;
                        ac3Var = ac3Var2;
                        atomicReference4 = ac3Var.g;
                        while (!atomicReference4.compareAndSet(xb3Var2, null)) {
                        }
                        cc3Var4.x(null);
                        return obj;
                    } catch (Throwable th7) {
                        th2 = th7;
                        xb3Var2 = xb3Var;
                        ac3Var = ac3Var2;
                        atomicReference3 = ac3Var.g;
                        while (!atomicReference3.compareAndSet(xb3Var2, null) && atomicReference3.get() == xb3Var2) {
                        }
                        throw th2;
                    }
                } catch (Throwable th8) {
                    r3.x(null);
                    throw th8;
                }
        }
    }
}
