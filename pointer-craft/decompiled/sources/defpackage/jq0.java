package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jq0 implements fq0 {
    public final aj6 a;
    public final fv3 j;
    public final ThreadLocal m;
    public volatile boolean q;
    public final fv3 t;
    public final long w;

    public jq0(final cd2 cd2Var, final String str, int i) {
        str.getClass();
        this.a = new aj6((byte) 16);
        this.m = new ThreadLocal();
        aj6 aj6Var = mf1.j;
        this.w = ye6.x(30);
        if (i <= 0) {
            l0.u("Maximum number of readers must be greater than 0");
            throw null;
        }
        final byte b = 0;
        this.j = new fv3(i, new my1() { // from class: gq0
            @Override // defpackage.my1
            public final Object g() {
                byte b2 = b;
                String str2 = str;
                cd2 cd2Var2 = cd2Var;
                switch (b2) {
                    case 0:
                        tb4 tb4VarR = cd2Var2.r(str2);
                        zq2.m(tb4VarR, "PRAGMA query_only = 1");
                        return tb4VarR;
                    default:
                        return cd2Var2.r(str2);
                }
            }
        });
        final byte b2 = 1;
        this.t = new fv3(1, new my1() { // from class: gq0
            @Override // defpackage.my1
            public final Object g() {
                byte b3 = b2;
                String str2 = str;
                cd2 cd2Var2 = cd2Var;
                switch (b3) {
                    case 0:
                        tb4 tb4VarR = cd2Var2.r(str2);
                        zq2.m(tb4VarR, "PRAGMA query_only = 1");
                        return tb4VarR;
                    default:
                        return cd2Var2.r(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.j.r();
        this.t.r();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0148 A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:64:0x0121, B:69:0x013d, B:71:0x0148, B:86:0x01a4, B:87:0x01ab), top: B:107:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4 A[Catch: all -> 0x01a0, TRY_ENTER, TryCatch #0 {all -> 0x01a0, blocks: (B:64:0x0121, B:69:0x013d, B:71:0x0148, B:86:0x01a4, B:87:0x01ab), top: B:107:0x0121 }] */
    @Override // defpackage.fq0
    public final Object s(boolean z, bz1 bz1Var, ou0 ou0Var) {
        iq0 iq0Var;
        u54 u54Var;
        Throwable th;
        fv3 fv3Var;
        fx0 fx0Var;
        bz1 bz1Var2;
        aj6 aj6Var;
        fv3 fv3Var2;
        u54 u54Var2;
        boolean z2;
        Object obj;
        u54 u54Var3;
        ov3 ov3Var;
        boolean z3 = z;
        if (ou0Var instanceof iq0) {
            iq0Var = (iq0) ou0Var;
            int i = iq0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                iq0Var.z = i - Integer.MIN_VALUE;
            } else {
                iq0Var = new iq0(this, ou0Var);
            }
        } else {
            iq0Var = new iq0(this, ou0Var);
        }
        Object objF0 = iq0Var.p;
        px0 px0Var = px0.j;
        int i2 = iq0Var.z;
        mu0 mu0Var = null;
        if (i2 != 0) {
            if (i2 == 1) {
                js2.o(objF0);
                return objF0;
            }
            if (i2 == 2) {
                js2.o(objF0);
                return objF0;
            }
            if (i2 == 3) {
                z3 = iq0Var.m;
                aj6Var = iq0Var.s;
                u54 u54Var4 = iq0Var.b;
                fx0 fx0Var2 = iq0Var.i;
                u54 u54Var5 = iq0Var.c;
                fv3Var2 = (fv3) iq0Var.w;
                bz1Var2 = (bz1) iq0Var.q;
                try {
                    js2.o(objF0);
                    u54Var2 = u54Var4;
                    u54Var = u54Var5;
                    fx0Var = fx0Var2;
                    try {
                        tq0 tq0Var = (tq0) objF0;
                        tq0Var.getClass();
                        fx0Var.getClass();
                        tq0Var.a = fx0Var;
                        tq0Var.m = new Throwable();
                        if (this.j == this.t && z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        u54Var2.j = new ov3(aj6Var, tq0Var, z2);
                        obj = u54Var.j;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        ov3 ov3Var2 = (ov3) obj;
                        fx0 fx0VarK = a11.k(new bq0(this.a, ov3Var2), new v85(ov3Var2, this.m));
                        q qVar = new q(bz1Var2, u54Var, mu0Var, (byte) 17);
                        iq0Var.q = fv3Var2;
                        iq0Var.w = u54Var;
                        iq0Var.c = null;
                        iq0Var.i = null;
                        iq0Var.b = null;
                        iq0Var.s = null;
                        iq0Var.z = 4;
                        objF0 = m50.f0(fx0VarK, qVar, iq0Var);
                        if (objF0 != px0Var) {
                            u54Var3 = u54Var;
                            fv3Var = fv3Var2;
                        }
                        return px0Var;
                    } catch (Throwable th2) {
                        th = th2;
                        fv3Var = fv3Var2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    u54Var = u54Var5;
                    fv3Var = fv3Var2;
                    throw th;
                }
            }
            if (i2 != 4) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u54Var3 = (u54) iq0Var.w;
            fv3Var = (fv3) iq0Var.q;
            try {
                js2.o(objF0);
            } catch (Throwable th4) {
                u54Var = u54Var3;
                th = th4;
            }
            ov3Var = (ov3) u54Var3.j;
            if (ov3Var != null) {
                if (!ov3Var.v) {
                    ov3Var.v = true;
                    if (ov3Var.y.j.p()) {
                        zq2.m(ov3Var.y, "ROLLBACK TRANSACTION");
                    }
                }
                tq0 tq0Var2 = ov3Var.y;
                tq0Var2.a = null;
                tq0Var2.m = null;
                fv3Var.v(tq0Var2);
            }
            return objF0;
        }
        js2.o(objF0);
        if (this.q) {
            zq2.B("Connection pool is closed", 21);
            throw null;
        }
        ov3 ov3Var3 = (ov3) this.m.get();
        if (ov3Var3 == null) {
            fx0 fx0Var3 = iq0Var.t;
            fx0Var3.getClass();
            bq0 bq0Var = (bq0) fx0Var3.h(this.a);
            ov3Var3 = bq0Var != null ? bq0Var.t : null;
        }
        if (ov3Var3 == null) {
            fv3 fv3Var3 = z3 ? this.j : this.t;
            u54Var = new u54();
            try {
                fx0Var = iq0Var.t;
                fx0Var.getClass();
                aj6 aj6Var2 = this.a;
                long j = this.w;
                hq0 hq0Var = new hq0(this, z3);
                iq0Var.q = bz1Var;
                iq0Var.w = fv3Var3;
                iq0Var.c = u54Var;
                iq0Var.i = fx0Var;
                iq0Var.b = u54Var;
                iq0Var.s = aj6Var2;
                iq0Var.m = z3;
                iq0Var.z = 3;
                Object objY = fv3Var3.y(j, hq0Var, iq0Var);
                if (objY != px0Var) {
                    bz1Var2 = bz1Var;
                    aj6Var = aj6Var2;
                    fv3Var2 = fv3Var3;
                    objF0 = objY;
                    u54Var2 = u54Var;
                    tq0 tq0Var3 = (tq0) objF0;
                    tq0Var3.getClass();
                    fx0Var.getClass();
                    tq0Var3.a = fx0Var;
                    tq0Var3.m = new Throwable();
                    if (this.j == this.t) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    u54Var2.j = new ov3(aj6Var, tq0Var3, z2);
                    obj = u54Var.j;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ov3 ov3Var4 = (ov3) obj;
                    fx0 fx0VarK2 = a11.k(new bq0(this.a, ov3Var4), new v85(ov3Var4, this.m));
                    q qVar2 = new q(bz1Var2, u54Var, mu0Var, (byte) 17);
                    iq0Var.q = fv3Var2;
                    iq0Var.w = u54Var;
                    iq0Var.c = null;
                    iq0Var.i = null;
                    iq0Var.b = null;
                    iq0Var.s = null;
                    iq0Var.z = 4;
                    objF0 = m50.f0(fx0VarK2, qVar2, iq0Var);
                    if (objF0 != px0Var) {
                        u54Var3 = u54Var;
                        fv3Var = fv3Var2;
                        ov3Var = (ov3) u54Var3.j;
                        if (ov3Var != null) {
                            if (!ov3Var.v) {
                                ov3Var.v = true;
                                if (ov3Var.y.j.p()) {
                                    zq2.m(ov3Var.y, "ROLLBACK TRANSACTION");
                                }
                            }
                            tq0 tq0Var4 = ov3Var.y;
                            tq0Var4.a = null;
                            tq0Var4.m = null;
                            fv3Var.v(tq0Var4);
                        }
                        return objF0;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                fv3Var = fv3Var3;
            }
        } else {
            if (!z3 && ov3Var3.r) {
                zq2.B("Cannot upgrade connection from reader to writer", 1);
                throw null;
            }
            fx0 fx0Var4 = iq0Var.t;
            fx0Var4.getClass();
            if (fx0Var4.h(this.a) == null) {
                fx0 fx0VarK3 = a11.k(new bq0(this.a, ov3Var3), new v85(ov3Var3, this.m));
                q qVar3 = new q(bz1Var, ov3Var3, mu0Var, (byte) 16);
                iq0Var.z = 1;
                Object objF1 = m50.f0(fx0VarK3, qVar3, iq0Var);
                if (objF1 != px0Var) {
                    return objF1;
                }
            } else {
                iq0Var.z = 2;
                Object objL = bz1Var.l(ov3Var3, iq0Var);
                if (objL != px0Var) {
                    return objL;
                }
            }
        }
        return px0Var;
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                ov3 ov3Var5 = (ov3) u54Var.j;
                if (ov3Var5 == null) {
                    throw th6;
                }
                if (!ov3Var5.v) {
                    ov3Var5.v = true;
                    if (ov3Var5.y.j.p()) {
                        zq2.m(ov3Var5.y, "ROLLBACK TRANSACTION");
                    }
                }
                tq0 tq0Var5 = ov3Var5.y;
                tq0Var5.a = null;
                tq0Var5.m = null;
                fv3Var.v(tq0Var5);
                throw th6;
            } catch (Throwable th7) {
                kf6.g(th, th7);
                throw th6;
            }
        }
    }

    public jq0(cd2 cd2Var) {
        this.a = new aj6((byte) 16);
        this.m = new ThreadLocal();
        aj6 aj6Var = mf1.j;
        this.w = ye6.x(30);
        fv3 fv3Var = new fv3(1, new qd(cd2Var, (byte) 12));
        this.j = fv3Var;
        this.t = fv3Var;
    }
}
