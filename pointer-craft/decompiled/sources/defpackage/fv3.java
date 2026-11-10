package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class fv3 {
    public final int g;
    public final dr j;
    public final tj4 l;
    public int n;
    public final ReentrantLock r = new ReentrantLock();
    public boolean v;
    public final tq0[] x;
    public final my1 y;

    public fv3(int i, my1 my1Var) {
        this.g = i;
        this.y = my1Var;
        this.x = new tq0[i];
        int i2 = uj4.g;
        this.l = new tj4(i);
        this.j = new dr(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object g(ou0 ou0Var) {
        dv3 dv3Var;
        int andDecrement;
        tj4 tj4Var = this.l;
        int i = tj4Var.j;
        dr drVar = this.j;
        if (ou0Var instanceof dv3) {
            dv3Var = (dv3) ou0Var;
            int i2 = dv3Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dv3Var.w = i2 - Integer.MIN_VALUE;
            } else {
                dv3Var = new dv3(this, ou0Var);
            }
        } else {
            dv3Var = new dv3(this, ou0Var);
        }
        Object obj = dv3Var.m;
        int i3 = dv3Var.w;
        if (i3 == 0) {
            js2.o(obj);
            dv3Var.w = 1;
            do {
                andDecrement = sj4.c.getAndDecrement(tj4Var);
            } while (andDecrement > i);
            Object obj2 = og5.g;
            px0 px0Var = px0.j;
            if (andDecrement <= 0) {
                ib0 ib0VarI = gp4.I(pw5.o(dv3Var));
                try {
                    if (!tj4Var.g(ib0VarI)) {
                        while (true) {
                            int andDecrement2 = sj4.c.getAndDecrement(tj4Var);
                            if (andDecrement2 <= i) {
                                if (andDecrement2 > 0) {
                                    ib0VarI.m(obj2, tj4Var.t);
                                    break;
                                }
                                if (tj4Var.g(ib0VarI)) {
                                    break;
                                }
                            }
                        }
                    }
                    Object objZ = ib0VarI.z();
                    if (objZ != px0Var) {
                        objZ = obj2;
                    }
                    if (objZ == px0Var) {
                        obj2 = objZ;
                    }
                } catch (Throwable th) {
                    ib0VarI.C();
                    throw th;
                }
            }
            if (obj2 == px0Var) {
                return px0Var;
            }
        } else {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(obj);
        }
        try {
            ReentrantLock reentrantLock = this.r;
            reentrantLock.lock();
            try {
                if (this.v) {
                    zq2.B("Connection pool is closed", 21);
                    throw null;
                }
                if (drVar.isEmpty() && this.n < this.g) {
                    tq0 tq0Var = new tq0((tb4) this.y.g());
                    tq0[] tq0VarArr = this.x;
                    int i4 = this.n;
                    this.n = i4 + 1;
                    tq0VarArr[i4] = tq0Var;
                    drVar.addLast(tq0Var);
                }
                tq0 tq0Var2 = (tq0) drVar.removeLast();
                reentrantLock.unlock();
                return tq0Var2;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            tj4Var.r();
            throw th3;
        }
    }

    public final void n(StringBuilder sb) {
        dr drVar = this.j;
        ReentrantLock reentrantLock = this.r;
        reentrantLock.lock();
        try {
            uv2 uv2VarC = pw5.c();
            int i = drVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                uv2VarC.add(drVar.get(i2));
            }
            uv2 uv2VarA = pw5.a(uv2VarC);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.g + ", ");
            sb.append("permits=" + Math.max(qr.g.getIntVolatile(this.l, sj4.i), 0) + ", ");
            sb.append("queue=(size=" + uv2VarA.g() + ")[" + cj0.q0(uv2VarA, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            tq0[] tq0VarArr = this.x;
            int length = tq0VarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                tq0 tq0Var = tq0VarArr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(tq0Var != null ? tq0Var.j.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (tq0Var != null) {
                    tq0Var.t(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void r() {
        ReentrantLock reentrantLock = this.r;
        reentrantLock.lock();
        try {
            this.v = true;
            for (tq0 tq0Var : this.x) {
                if (tq0Var != null) {
                    tq0Var.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void v(tq0 tq0Var) {
        ReentrantLock reentrantLock = this.r;
        reentrantLock.lock();
        try {
            this.j.addLast(tq0Var);
            reentrantLock.unlock();
            this.l.r();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:30:0x0069, B:32:0x006d, B:36:0x0075, B:40:0x007c), top: B:45:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:30:0x0069, B:32:0x006d, B:36:0x0075, B:40:0x007c), top: B:45:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:30:0x0069, B:32:0x006d, B:36:0x0075, B:40:0x007c), top: B:45:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0056 -> B:25:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0056
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object y(long r8, defpackage.hq0 r10, defpackage.ou0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.ev3
            if (r0 == 0) goto L13
            r0 = r11
            ev3 r0 = (defpackage.ev3) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ev3 r0 = new ev3
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            long r8 = r0.m
            u54 r10 = r0.w
            my1 r1 = r0.q
            defpackage.js2.o(r11)     // Catch: java.lang.Throwable -> L2c
            goto L58
        L2c:
            r11 = move-exception
            goto L64
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r7)
            return r3
        L34:
            defpackage.js2.o(r11)
        L37:
            u54 r11 = new u54
            r11.<init>()
            u03 r1 = new u03     // Catch: java.lang.Throwable -> L62
            r1.<init>(r11, r7, r3, r2)     // Catch: java.lang.Throwable -> L62
            r0.q = r10     // Catch: java.lang.Throwable -> L62
            r0.w = r11     // Catch: java.lang.Throwable -> L62
            r0.m = r8     // Catch: java.lang.Throwable -> L62
            r0.b = r2     // Catch: java.lang.Throwable -> L62
            long r4 = defpackage.yf2.a0(r8)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = defpackage.br2.D(r4, r1, r0)     // Catch: java.lang.Throwable -> L62
            px0 r4 = defpackage.px0.j
            if (r1 != r4) goto L56
            return r4
        L56:
            r1 = r10
            r10 = r11
        L58:
            r11 = r10
            r10 = r1
            r1 = r0
            r0 = r3
            goto L69
        L5d:
            r6 = r1
            r1 = r10
            r10 = r11
            r11 = r6
            goto L64
        L62:
            r1 = move-exception
            goto L5d
        L64:
            r6 = r11
            r11 = r10
            r10 = r1
            r1 = r0
            r0 = r6
        L69:
            boolean r4 = r0 instanceof defpackage.n95     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L73
            r10.g()     // Catch: java.lang.Throwable -> L71
            goto L7a
        L71:
            r8 = move-exception
            goto L7d
        L73:
            if (r0 != 0) goto L7c
            java.lang.Object r11 = r11.j     // Catch: java.lang.Throwable -> L71
            if (r11 == 0) goto L7a
            return r11
        L7a:
            r0 = r1
            goto L37
        L7c:
            throw r0     // Catch: java.lang.Throwable -> L71
        L7d:
            java.lang.Object r9 = r11.j
            tq0 r9 = (defpackage.tq0) r9
            if (r9 == 0) goto L86
            r7.v(r9)
        L86:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv3.y(long, hq0, ou0):java.lang.Object");
    }
}
