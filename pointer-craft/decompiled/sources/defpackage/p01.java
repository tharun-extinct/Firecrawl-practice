package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p01 implements vz0 {
    public final o05 a;
    public final ao1 g;
    public iv4 l;
    public final o05 m;
    public final w00 n;
    public final kb5 q;
    public final ox0 r;
    public final kb5 t;
    public int x;
    public final ux0 y;
    public final ec3 v = new ec3();
    public final q64 j = new q64((byte) 15);

    public p01(ao1 ao1Var, List list, ux0 ux0Var, ox0 ox0Var) {
        this.g = ao1Var;
        this.y = ux0Var;
        this.r = ox0Var;
        mu0 mu0Var = null;
        byte b = 1;
        this.n = new w00(new hh0(this, mu0Var, b), (byte) 4);
        kb5 kb5Var = new kb5();
        kb5Var.m = this;
        kb5Var.j = new ec3();
        kb5Var.t = y94.v();
        kb5Var.a = cj0.F0(list);
        this.t = kb5Var;
        this.a = new o05(new a01(this, b));
        byte b2 = 0;
        this.m = new o05(new a01(this, b2));
        zg zgVar = new zg(this, (byte) 6);
        op opVar = new op((Object) this, mu0Var, (byte) 7);
        kb5 kb5Var2 = new kb5();
        kb5Var2.j = ox0Var;
        kb5Var2.t = opVar;
        kb5Var2.a = v70.y(Integer.MAX_VALUE, 6, null);
        kb5Var2.m = new q64((byte) 7);
        dh2 dh2Var = (dh2) ox0Var.w().h(d52.m);
        if (dh2Var != null) {
            dh2Var.A(new rp4(zgVar, kb5Var2, b2));
        }
        this.q = kb5Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, boolean z, ou0 ou0Var) throws IOException {
        n01 n01Var;
        s54 s54Var;
        if (ou0Var instanceof n01) {
            n01Var = (n01) ou0Var;
            int i = n01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n01Var.c = i - Integer.MIN_VALUE;
            } else {
                n01Var = new n01(this, ou0Var);
            }
        } else {
            n01Var = new n01(this, ou0Var);
        }
        Object obj2 = n01Var.q;
        int i2 = n01Var.c;
        if (i2 == 0) {
            js2.o(obj2);
            s54 s54Var2 = new s54();
            do1 do1Var = (do1) this.a.getValue();
            o01 o01Var = new o01(s54Var2, this, obj, z, null);
            n01Var.m = s54Var2;
            n01Var.c = 1;
            Object objY = do1Var.y(o01Var, n01Var);
            px0 px0Var = px0.j;
            if (objY == px0Var) {
                return px0Var;
            }
            s54Var = s54Var2;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s54Var = n01Var.m;
            js2.o(obj2);
        }
        return new Integer(s54Var.j);
    }

    @Override // defpackage.vz0
    public final Object g(bz1 bz1Var, ou0 ou0Var) {
        ph5 ph5Var = (ph5) ou0Var.v().h(tg1.z);
        if (ph5Var != null) {
            ph5Var.g(this);
        }
        return m50.f0(new ph5(ph5Var, this), new zh(this, bz1Var, null, (byte) 8), ou0Var);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z, mu0 mu0Var) throws Throwable {
        i01 i01Var;
        p01 p01Var;
        zv4 zv4Var;
        p01 p01Var2;
        fp3 fp3Var;
        zv4 zv4Var2;
        if (mu0Var instanceof i01) {
            i01Var = (i01) mu0Var;
            int i = i01Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                i01Var.b = i - Integer.MIN_VALUE;
            } else {
                i01Var = new i01(this, mu0Var);
            }
        } else {
            i01Var = new i01(this, mu0Var);
        }
        Object objR = i01Var.c;
        int i2 = i01Var.b;
        mu0 mu0Var2 = null;
        px0 px0Var = px0.j;
        if (i2 == 0) {
            js2.o(objR);
            zv4 zv4VarX = this.j.x();
            if (zv4VarX instanceof dg5) {
                l0.z("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            xp4 xp4VarN = n();
            i01Var.m = this;
            i01Var.q = zv4VarX;
            i01Var.w = z;
            i01Var.b = 1;
            Integer numG = xp4VarN.g();
            if (numG != px0Var) {
                p01Var = this;
                zv4Var = zv4VarX;
                objR = numG;
            }
            return px0Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                p01Var2 = i01Var.m;
                js2.o(objR);
                fp3Var = (fp3) objR;
                zv4Var2 = (zv4) fp3Var.j;
                if (((Boolean) fp3Var.t).booleanValue()) {
                    p01Var2.j.w(zv4Var2);
                }
                return zv4Var2;
            }
            if (i2 != 3) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p01Var2 = i01Var.m;
            js2.o(objR);
            fp3Var = (fp3) objR;
            zv4Var2 = (zv4) fp3Var.j;
            if (((Boolean) fp3Var.t).booleanValue()) {
                p01Var2.j.w(zv4Var2);
            }
            return zv4Var2;
        }
        z = i01Var.w;
        zv4Var = i01Var.q;
        p01Var = i01Var.m;
        js2.o(objR);
        int iIntValue = ((Number) objR).intValue();
        boolean z2 = zv4Var instanceof rz0;
        int i3 = z2 ? zv4Var.g : -1;
        if (z2 && iIntValue == i3) {
            return zv4Var;
        }
        if (z) {
            xp4 xp4VarN2 = p01Var.n();
            xz xzVar = new xz(p01Var, null);
            i01Var.m = p01Var;
            i01Var.q = null;
            i01Var.b = 2;
            objR = xp4VarN2.y(xzVar, i01Var);
            if (objR != px0Var) {
                p01Var2 = p01Var;
                fp3Var = (fp3) objR;
                zv4Var2 = (zv4) fp3Var.j;
                if (((Boolean) fp3Var.t).booleanValue()) {
                    p01Var2.j.w(zv4Var2);
                }
                return zv4Var2;
            }
        } else {
            xp4 xp4VarN3 = p01Var.n();
            j01 j01Var = new j01(p01Var, i3, mu0Var2, (byte) 0);
            i01Var.m = p01Var;
            i01Var.q = null;
            i01Var.b = 3;
            objR = xp4VarN3.r(j01Var, i01Var);
            if (objR != px0Var) {
                p01Var2 = p01Var;
                fp3Var = (fp3) objR;
                zv4Var2 = (zv4) fp3Var.j;
                if (((Boolean) fp3Var.t).booleanValue()) {
                    p01Var2.j.w(zv4Var2);
                }
                return zv4Var2;
            }
        }
        return px0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r1.k(r0) == r4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ou0 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.h01
            if (r0 == 0) goto L13
            r0 = r7
            h01 r0 = (defpackage.h01) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            h01 r0 = new h01
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.w
            int r1 = r0.i
            r2 = 2
            r3 = 1
            px0 r4 = defpackage.px0.j
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            int r6 = r0.q
            p01 r0 = r0.m
            defpackage.js2.o(r7)     // Catch: java.lang.Throwable -> L2e
            goto L64
        L2e:
            r7 = move-exception
            goto L6c
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r6)
            r6 = 0
            return r6
        L37:
            p01 r6 = r0.m
            defpackage.js2.o(r7)
            goto L4f
        L3d:
            defpackage.js2.o(r7)
            xp4 r7 = r6.n()
            r0.m = r6
            r0.i = r3
            java.lang.Integer r7 = r7.g()
            if (r7 != r4) goto L4f
            goto L63
        L4f:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            kb5 r1 = r6.t     // Catch: java.lang.Throwable -> L67
            r0.m = r6     // Catch: java.lang.Throwable -> L67
            r0.q = r7     // Catch: java.lang.Throwable -> L67
            r0.i = r2     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r1.k(r0)     // Catch: java.lang.Throwable -> L67
            if (r6 != r4) goto L64
        L63:
            return r4
        L64:
            og5 r6 = defpackage.og5.g
            return r6
        L67:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L6c:
            q64 r0 = r0.j
            b34 r1 = new b34
            r1.<init>(r6, r7)
            r0.w(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p01.l(ou0):java.lang.Object");
    }

    public final xp4 n() {
        return (xp4) this.m.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(ou0 ou0Var) {
        d01 d01Var;
        ec3 ec3Var;
        if (ou0Var instanceof d01) {
            d01Var = (d01) ou0Var;
            int i = d01Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                d01Var.i = i - Integer.MIN_VALUE;
            } else {
                d01Var = new d01(this, ou0Var);
            }
        } else {
            d01Var = new d01(this, ou0Var);
        }
        Object obj = d01Var.w;
        int i2 = d01Var.i;
        if (i2 == 0) {
            js2.o(obj);
            d01Var.m = this;
            ec3Var = this.v;
            d01Var.q = ec3Var;
            d01Var.i = 1;
            Object objY = ec3Var.y(d01Var);
            px0 px0Var = px0.j;
            if (objY == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ec3 ec3Var2 = d01Var.q;
            p01 p01Var = d01Var.m;
            js2.o(obj);
            ec3Var = ec3Var2;
            this = p01Var;
        }
        try {
            int i3 = this.x - 1;
            this.x = i3;
            if (i3 == 0) {
                iv4 iv4Var = this.l;
                if (iv4Var != null) {
                    iv4Var.x(null);
                }
                this.l = null;
            }
            return og5.g;
        } finally {
            ec3Var.x(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: tx0 -> 0x005f, TryCatch #1 {tx0 -> 0x005f, blocks: (B:19:0x005a, B:54:0x0108, B:24:0x0068, B:51:0x00eb, B:32:0x0085, B:40:0x00ac, B:42:0x00b2, B:36:0x008f, B:48:0x00d9), top: B:79:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:61:0x0133, B:63:0x0145, B:64:0x014d), top: B:78:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014d A[Catch: all -> 0x0171, TRY_LEAVE, TryCatch #0 {all -> 0x0171, blocks: (B:61:0x0133, B:63:0x0145, B:64:0x014d), top: B:78:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x015d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(boolean z, ou0 ou0Var) {
        k01 k01Var;
        u54 u54Var;
        tx0 tx0Var;
        p01 p01Var;
        boolean z2;
        u54 u54Var2;
        s54 s54Var;
        tx0 tx0Var2;
        l01 l01Var;
        Object objY;
        s54 s54Var2;
        u54 u54Var3;
        int iHashCode;
        Integer numG;
        p01 p01Var2;
        int i;
        Object obj;
        if (ou0Var instanceof k01) {
            k01Var = (k01) ou0Var;
            int i2 = k01Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k01Var.u = i2 - Integer.MIN_VALUE;
            } else {
                k01Var = new k01(this, ou0Var);
            }
        } else {
            k01Var = new k01(this, ou0Var);
        }
        Object objG = k01Var.s;
        int i3 = k01Var.u;
        byte b = 1;
        byte b2 = 2;
        mu0 mu0Var = null;
        px0 px0Var = px0.j;
        try {
            switch (i3) {
                case 0:
                    js2.o(objG);
                    if (z) {
                        k01Var.m = this;
                        k01Var.i = z;
                        k01Var.u = 1;
                        objG = ((do1) this.a.getValue()).g(new tu0(3, null, (byte) 2), k01Var);
                        if (objG != px0Var) {
                            if (objG != null) {
                                iHashCode = objG.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            xp4 xp4VarN = this.n();
                            k01Var.m = this;
                            k01Var.q = objG;
                            k01Var.i = z;
                            k01Var.b = iHashCode;
                            k01Var.u = 2;
                            numG = xp4VarN.g();
                            if (numG != px0Var) {
                                p01Var2 = this;
                                i = iHashCode;
                                obj = objG;
                                objG = numG;
                                return new rz0(i, ((Number) objG).intValue(), obj);
                            }
                        }
                    } else {
                        xp4 xp4VarN2 = n();
                        k01Var.m = this;
                        k01Var.i = z;
                        k01Var.u = 3;
                        objG = xp4VarN2.g();
                        if (objG != px0Var) {
                            int iIntValue = ((Number) objG).intValue();
                            xp4 xp4VarN3 = this.n();
                            j01 j01Var = new j01(this, iIntValue, mu0Var, b);
                            k01Var.m = this;
                            k01Var.i = z;
                            k01Var.u = 4;
                            objG = xp4VarN3.r(j01Var, k01Var);
                            if (objG == px0Var) {
                            }
                            return (rz0) objG;
                        }
                    }
                    return px0Var;
                case 1:
                    z = k01Var.i;
                    this = (p01) k01Var.m;
                    js2.o(objG);
                    if (objG != null) {
                        iHashCode = objG.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    xp4 xp4VarN4 = this.n();
                    k01Var.m = this;
                    k01Var.q = objG;
                    k01Var.i = z;
                    k01Var.b = iHashCode;
                    k01Var.u = 2;
                    numG = xp4VarN4.g();
                    if (numG != px0Var) {
                        p01Var2 = this;
                        i = iHashCode;
                        obj = objG;
                        objG = numG;
                        return new rz0(i, ((Number) objG).intValue(), obj);
                    }
                    return px0Var;
                case 2:
                    i = k01Var.b;
                    z = k01Var.i;
                    obj = k01Var.q;
                    p01Var2 = (p01) k01Var.m;
                    try {
                        js2.o(objG);
                        return new rz0(i, ((Number) objG).intValue(), obj);
                    } catch (tx0 e) {
                        e = e;
                        this = p01Var2;
                        u54Var = new u54();
                        ux0 ux0Var = this.y;
                        k01Var.m = this;
                        k01Var.q = e;
                        k01Var.w = u54Var;
                        k01Var.c = u54Var;
                        k01Var.i = z;
                        k01Var.u = 5;
                        Object objY2 = ux0Var.y(e);
                        if (objY2 != px0Var) {
                            tx0Var = e;
                            objG = objY2;
                            p01Var = this;
                            z2 = z;
                            u54Var2 = u54Var;
                            u54Var2.j = objG;
                            s54Var = new s54();
                            try {
                                l01Var = new l01(u54Var, p01Var, s54Var, null);
                                k01Var.m = tx0Var;
                                k01Var.q = u54Var;
                                k01Var.w = s54Var;
                                k01Var.c = null;
                                k01Var.u = 6;
                                if (z2) {
                                    p01Var.getClass();
                                    objY = l01Var.a(k01Var);
                                } else {
                                    objY = p01Var.n().y(new yz(l01Var, mu0Var, b2), k01Var);
                                }
                                if (objY != px0Var) {
                                    s54Var2 = s54Var;
                                    u54Var3 = u54Var;
                                    Object obj2 = u54Var3.j;
                                    return new rz0(obj2 != null ? obj2.hashCode() : 0, s54Var2.j, obj2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                tx0Var2 = tx0Var;
                                kf6.g(tx0Var2, th);
                                throw tx0Var2;
                            }
                        }
                        return px0Var;
                    }
                case 3:
                    z = k01Var.i;
                    this = (p01) k01Var.m;
                    js2.o(objG);
                    int iIntValue2 = ((Number) objG).intValue();
                    xp4 xp4VarN5 = this.n();
                    j01 j01Var2 = new j01(this, iIntValue2, mu0Var, b);
                    k01Var.m = this;
                    k01Var.i = z;
                    k01Var.u = 4;
                    objG = xp4VarN5.r(j01Var2, k01Var);
                    if (objG == px0Var) {
                        return px0Var;
                    }
                    return (rz0) objG;
                case 4:
                    boolean z3 = k01Var.i;
                    js2.o(objG);
                    return (rz0) objG;
                case 5:
                    z2 = k01Var.i;
                    u54Var2 = k01Var.c;
                    u54Var = (u54) k01Var.w;
                    tx0Var = (tx0) k01Var.q;
                    p01Var = (p01) k01Var.m;
                    js2.o(objG);
                    u54Var2.j = objG;
                    s54Var = new s54();
                    l01Var = new l01(u54Var, p01Var, s54Var, null);
                    k01Var.m = tx0Var;
                    k01Var.q = u54Var;
                    k01Var.w = s54Var;
                    k01Var.c = null;
                    k01Var.u = 6;
                    if (z2) {
                        p01Var.getClass();
                        objY = l01Var.a(k01Var);
                    } else {
                        objY = p01Var.n().y(new yz(l01Var, mu0Var, b2), k01Var);
                    }
                    if (objY != px0Var) {
                        s54Var2 = s54Var;
                        u54Var3 = u54Var;
                        Object obj3 = u54Var3.j;
                        return new rz0(obj3 != null ? obj3.hashCode() : 0, s54Var2.j, obj3);
                    }
                    return px0Var;
                case 6:
                    s54Var2 = (s54) k01Var.w;
                    u54Var3 = (u54) k01Var.q;
                    tx0Var2 = (tx0) k01Var.m;
                    try {
                        js2.o(objG);
                        Object obj4 = u54Var3.j;
                        return new rz0(obj4 != null ? obj4.hashCode() : 0, s54Var2.j, obj4);
                    } catch (Throwable th2) {
                        th = th2;
                        kf6.g(tx0Var2, th);
                        throw tx0Var2;
                    }
                default:
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (tx0 e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r10 == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        r9 = r12;
        r12 = r10;
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        if (r10 == r7) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [p01] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, nh2] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [p01] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.j53 r11, defpackage.ou0 r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p01.v(j53, ou0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(ou0 ou0Var) {
        f01 f01Var;
        ec3 ec3Var;
        if (ou0Var instanceof f01) {
            f01Var = (f01) ou0Var;
            int i = f01Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                f01Var.i = i - Integer.MIN_VALUE;
            } else {
                f01Var = new f01(this, ou0Var);
            }
        } else {
            f01Var = new f01(this, ou0Var);
        }
        Object obj = f01Var.w;
        int i2 = f01Var.i;
        mu0 mu0Var = null;
        if (i2 == 0) {
            js2.o(obj);
            f01Var.m = this;
            ec3Var = this.v;
            f01Var.q = ec3Var;
            f01Var.i = 1;
            Object objY = ec3Var.y(f01Var);
            px0 px0Var = px0.j;
            if (objY == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ec3 ec3Var2 = f01Var.q;
            p01 p01Var = f01Var.m;
            js2.o(obj);
            ec3Var = ec3Var2;
            this = p01Var;
        }
        try {
            int i3 = this.x + 1;
            this.x = i3;
            if (i3 == 1) {
                this.l = m50.T(this.r, null, new g01(this, mu0Var, (byte) 0), 3);
            }
            return og5.g;
        } finally {
            ec3Var.x(null);
        }
    }

    @Override // defpackage.vz0
    public final er1 y() {
        return this.n;
    }
}
