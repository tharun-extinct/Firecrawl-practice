package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eg3 extends i73 implements hd5, xf3 {
    public final String d;
    public ag3 f;
    public eg3 k;
    public xf3 o;

    public eg3(xf3 xf3Var, ag3 ag3Var) {
        this.o = xf3Var;
        this.f = ag3Var == null ? new ag3() : ag3Var;
        this.d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.i73
    public final void I0() {
        ag3 ag3Var = this.f;
        ag3Var.g = this;
        ag3Var.y = null;
        this.k = null;
        ag3Var.r = new gf((Object) this, (byte) 22);
        ag3Var.n = E0();
    }

    @Override // defpackage.i73
    public final void J0() {
        u54 u54Var = new u54();
        sp2.d(this, new hd3(u54Var, (byte) 1));
        eg3 eg3Var = (eg3) ((hd5) u54Var.j);
        this.k = eg3Var;
        ag3 ag3Var = this.f;
        ag3Var.y = eg3Var;
        if (ag3Var.g == this) {
            ag3Var.g = null;
            ag3Var.n = null;
            ag3Var.r = og0.z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.xf3
    public final Object P(long j, long j2, mu0 mu0Var) {
        cg3 cg3Var;
        long j3;
        long j4;
        long jA;
        long jA2;
        long j5;
        if (mu0Var instanceof cg3) {
            cg3Var = (cg3) mu0Var;
            int i = cg3Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                cg3Var.i = i - Integer.MIN_VALUE;
            } else {
                cg3Var = new cg3(this, (ou0) mu0Var);
            }
        } else {
            cg3Var = new cg3(this, (ou0) mu0Var);
        }
        cg3 cg3Var2 = cg3Var;
        Object objP = cg3Var2.w;
        int i2 = cg3Var2.i;
        eg3 eg3VarR0 = null;
        px0 px0Var = px0.j;
        if (i2 == 0) {
            js2.o(objP);
            xf3 xf3Var = this.o;
            cg3Var2.m = j;
            cg3Var2.q = j2;
            cg3Var2.i = 1;
            objP = xf3Var.P(j, j2, cg3Var2);
            if (objP != px0Var) {
                j3 = j;
                j4 = j2;
            }
            return px0Var;
        }
        if (i2 == 1) {
            j4 = cg3Var2.q;
            j3 = cg3Var2.m;
            js2.o(objP);
        } else {
            if (i2 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = cg3Var2.m;
            js2.o(objP);
        }
        jA2 = ((vj5) objP).a();
        jA = j5;
        return vj5.g(vj5.l(jA, jA2));
        jA = ((vj5) objP).a();
        boolean z = this.h;
        if (!z) {
            eg3VarR0 = this.k;
        } else if (z) {
            eg3VarR0 = R0();
        }
        if (eg3VarR0 != null) {
            long jL = vj5.l(j3, jA);
            long jX = vj5.x(j4, jA);
            cg3Var2.m = jA;
            cg3Var2.i = 2;
            objP = eg3VarR0.P(jL, jX, cg3Var2);
            if (objP != px0Var) {
                j5 = jA;
                jA2 = ((vj5) objP).a();
                jA = j5;
            }
            return px0Var;
        }
        jA2 = 0;
        return vj5.g(vj5.l(jA, jA2));
    }

    @Override // defpackage.xf3
    public final long Q(int i, long j, long j2) {
        long jQ = this.o.Q(i, j, j2);
        eg3 eg3VarR0 = this.h ? R0() : null;
        return wi3.v(jQ, eg3VarR0 != null ? eg3VarR0.Q(i, wi3.v(j, jQ), wi3.n(j2, jQ)) : 0L);
    }

    public final ox0 Q0() {
        eg3 eg3VarR0 = R0();
        ox0 ox0VarQ0 = eg3VarR0 != null ? eg3VarR0.Q0() : null;
        if (ox0VarQ0 != null && k33.M(ox0VarQ0)) {
            return ox0VarQ0;
        }
        ox0 ox0Var = this.f.n;
        if (ox0Var != null) {
            return ox0Var;
        }
        l0.z("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final eg3 R0() {
        ah3 ah3Var;
        hd5 hd5Var = null;
        if (!this.h) {
            return null;
        }
        if (!this.j.h) {
            mc2.y("visitAncestors called on an unattached node");
        }
        i73 i73Var = this.j.q;
        um2 um2VarV = k33.V(this);
        loop0: while (um2VarV != null) {
            if ((um2VarV.M.x.m & 262144) != 0) {
                while (i73Var != null) {
                    if ((i73Var.a & 262144) != 0) {
                        i73 i73VarQ = i73Var;
                        rb3 rb3Var = null;
                        while (i73VarQ != null) {
                            if (i73VarQ instanceof hd5) {
                                hd5 hd5Var2 = (hd5) i73VarQ;
                                if (yf2.p(this.d, hd5Var2.s()) && eg3.class == hd5Var2.getClass()) {
                                    hd5Var = hd5Var2;
                                    break loop0;
                                }
                            }
                            if ((i73VarQ.a & 262144) != 0 && (i73VarQ instanceof p41)) {
                                int i = 0;
                                for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                    if ((i73Var2.a & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            i73VarQ = i73Var2;
                                        } else {
                                            if (rb3Var == null) {
                                                rb3Var = new rb3(new i73[16]);
                                            }
                                            if (i73VarQ != null) {
                                                rb3Var.y(i73VarQ);
                                                i73VarQ = null;
                                            }
                                            rb3Var.y(i73Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            i73VarQ = k33.Q(rb3Var);
                        }
                    }
                    i73Var = i73Var.q;
                }
            }
            um2VarV = um2VarV.o();
            i73Var = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
        }
        return (eg3) hd5Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    @Override // defpackage.xf3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(long r7, defpackage.mu0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.dg3
            if (r0 == 0) goto L13
            r0 = r9
            dg3 r0 = (defpackage.dg3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            dg3 r0 = new dg3
            ou0 r9 = (defpackage.ou0) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.q
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            px0 r5 = defpackage.px0.j
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.m
            defpackage.js2.o(r9)
            goto L6e
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r6)
            return r2
        L35:
            long r7 = r0.m
            defpackage.js2.o(r9)
            goto L53
        L3b:
            defpackage.js2.o(r9)
            boolean r9 = r6.h
            if (r9 == 0) goto L46
            eg3 r2 = r6.R0()
        L46:
            if (r2 == 0) goto L5a
            r0.m = r7
            r0.c = r4
            java.lang.Object r9 = r2.d0(r7, r0)
            if (r9 != r5) goto L53
            goto L6c
        L53:
            vj5 r9 = (defpackage.vj5) r9
            long r1 = r9.a()
            goto L5c
        L5a:
            r1 = 0
        L5c:
            xf3 r6 = r6.o
            long r7 = defpackage.vj5.x(r7, r1)
            r0.m = r1
            r0.c = r3
            java.lang.Object r9 = r6.d0(r7, r0)
            if (r9 != r5) goto L6d
        L6c:
            return r5
        L6d:
            r6 = r1
        L6e:
            vj5 r9 = (defpackage.vj5) r9
            long r8 = r9.a()
            long r6 = defpackage.vj5.l(r6, r8)
            vj5 r6 = defpackage.vj5.g(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg3.d0(long, mu0):java.lang.Object");
    }

    @Override // defpackage.hd5
    public final Object s() {
        return this.d;
    }

    @Override // defpackage.xf3
    public final long t0(int i, long j) {
        eg3 eg3VarR0 = this.h ? R0() : null;
        long jT0 = eg3VarR0 != null ? eg3VarR0.t0(i, j) : 0L;
        return wi3.v(jT0, this.o.t0(i, wi3.n(j, jT0)));
    }
}
