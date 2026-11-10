package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s52 {
    public final /* synthetic */ t52 a;
    public final mc g;
    public volatile boolean j;
    public volatile boolean l;
    public final gf n;
    public final z6 r;
    public final ji t;
    public final ew4 v = y94.w(null);
    public final AtomicBoolean x = new AtomicBoolean(false);
    public final int y;

    public s52(t52 t52Var, mc mcVar, int i, z6 z6Var, gf gfVar) {
        this.a = t52Var;
        this.g = mcVar;
        this.y = i;
        this.r = z6Var;
        this.n = gfVar;
        this.t = new ji((Object) this, (Object) t52Var, (byte) 10);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd A[Catch: all -> 0x0155, PHI: r0 r9
  0x00bd: PHI (r0v7 t52) = (r0v5 t52), (r0v42 t52) binds: [B:51:0x00b9, B:30:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r9v7 cc3) = (r9v4 cc3), (r9v13 cc3) binds: [B:51:0x00b9, B:30:0x0066] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0155, blocks: (B:53:0x00bd, B:56:0x00d6, B:73:0x0158, B:50:0x00af, B:47:0x00a1), top: B:93:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6 A[Catch: all -> 0x0155, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0155, blocks: (B:53:0x00bd, B:56:0x00d6, B:73:0x0158, B:50:0x00af, B:47:0x00a1), top: B:93:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107 A[Catch: all -> 0x0131, TRY_LEAVE, TryCatch #0 {all -> 0x0131, blocks: (B:60:0x00ff, B:62:0x0107, B:69:0x0136), top: B:91:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0136 A[Catch: all -> 0x0131, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0131, blocks: (B:60:0x00ff, B:62:0x0107, B:69:0x0136), top: B:91:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0158 A[Catch: all -> 0x0155, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0155, blocks: (B:53:0x00bd, B:56:0x00d6, B:73:0x0158, B:50:0x00af, B:47:0x00a1), top: B:93:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b1 A[Catch: all -> 0x01be, TRY_LEAVE, TryCatch #7 {all -> 0x01be, blocks: (B:77:0x0186, B:79:0x01b1, B:85:0x01c1), top: B:104:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1 A[Catch: all -> 0x01be, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x01be, blocks: (B:77:0x0186, B:79:0x01b1, B:85:0x01c1), top: B:104:0x0186 }] */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        if (r9.y(r7) == r8) goto L75;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x00d6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0107, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0136, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x0158, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ou0 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s52.g(ou0):java.lang.Object");
    }

    public final void n(String str, boolean z) {
        if (this.x.compareAndSet(false, true)) {
            boolean zP = fj.p((AtomicReference) this.a.r, this);
            boolean z2 = this.l;
            if (!zP) {
                if (z2) {
                    ((AtomicInteger) this.a.j).incrementAndGet();
                    ((ng0) ((d5) this.a.g).t).n.y("stale gen=" + this.y + " reason=" + str, "unregister");
                    return;
                }
                return;
            }
            if (!z2 && !z) {
                ((ng0) ((d5) this.a.g).t).n.y("skip gen=" + this.y + " reason=" + str, "unregister");
                return;
            }
            if (this.l && !this.j) {
                ((AtomicInteger) this.a.l).incrementAndGet();
                ((ng0) ((d5) this.a.g).t).n.y(xi3.j("abandoned gen=", this.y), "register");
                ((AtomicReference) this.a.n).set(this);
            }
            this.g.g.unregisterApp();
            ((ng0) ((d5) this.a.g).t).n.y(str + " gen=" + this.y, "unregister");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(ou0 ou0Var) throws Throwable {
        q52 q52Var;
        if (ou0Var instanceof q52) {
            q52Var = (q52) ou0Var;
            int i = q52Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                q52Var.w = i - Integer.MIN_VALUE;
            } else {
                q52Var = new q52(this, ou0Var);
            }
        } else {
            q52Var = new q52(this, ou0Var);
        }
        Object objE = q52Var.m;
        int i2 = q52Var.w;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(objE);
            this.a.getClass();
            dy dyVar = new dy((Object) this, mu0Var, (byte) 13);
            q52Var.w = 1;
            objE = br2.E(2000L, dyVar, q52Var);
            px0 px0Var = px0.j;
            if (objE == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objE);
        }
        return Boolean.valueOf(objE != null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r13 == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.ou0 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s52.v(ou0):java.lang.Object");
    }

    public final Object x(o52 o52Var) {
        t52 t52Var = this.a;
        if (!((AtomicBoolean) t52Var.v).getAndSet(true)) {
            d5 d5Var = (d5) t52Var.g;
            ((ng0) d5Var.t).n.y(xi3.j("leftover-sweep gen=", this.y), "unregister");
            this.g.g.unregisterApp();
            Object objE = yf2.e(200L, o52Var);
            if (objE == px0.j) {
                return objE;
            }
        }
        return og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(long j, ou0 ou0Var) throws Throwable {
        p52 p52Var;
        if (ou0Var instanceof p52) {
            p52Var = (p52) ou0Var;
            int i = p52Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                p52Var.w = i - Integer.MIN_VALUE;
            } else {
                p52Var = new p52(this, ou0Var);
            }
        } else {
            p52Var = new p52(this, ou0Var);
        }
        Object objE = p52Var.m;
        int i2 = p52Var.w;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(objE);
            np npVar = new np(this, mu0Var, (byte) 8);
            p52Var.w = 1;
            objE = br2.E(j, npVar, p52Var);
            px0 px0Var = px0.j;
            if (objE == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objE);
        }
        return Boolean.valueOf(objE != null);
    }
}
