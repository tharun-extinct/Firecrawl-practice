package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r25 {
    public static final md1 g = new md1(3, null, 2);

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(defpackage.f05 r5, boolean r6, defpackage.ku3 r7, defpackage.ix r8) {
        /*
            boolean r0 = r8 instanceof defpackage.i25
            if (r0 == 0) goto L13
            r0 = r8
            i25 r0 = (defpackage.i25) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            i25 r0 = new i25
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.w
            ku3 r6 = r0.q
            f05 r7 = r0.m
            defpackage.js2.o(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r5)
            r5 = 0
            return r5
        L36:
            defpackage.js2.o(r8)
        L39:
            r0.m = r5
            r0.q = r7
            r0.w = r6
            r0.i = r2
            java.lang.Object r8 = r5.g(r7, r0)
            px0 r1 = defpackage.px0.j
            if (r8 != r1) goto L4a
            return r1
        L4a:
            ju3 r8 = (defpackage.ju3) r8
            boolean r1 = v(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.g
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r25.g(f05, boolean, ku3, ix):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(f05 f05Var, ku3 ku3Var, ou0 ou0Var) throws Throwable {
        p25 p25Var;
        u54 u54Var;
        if (ou0Var instanceof p25) {
            p25Var = (p25) ou0Var;
            int i = p25Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                p25Var.w = i - Integer.MIN_VALUE;
            } else {
                p25Var = new p25(ou0Var);
            }
        } else {
            p25Var = new p25(ou0Var);
        }
        Object obj = p25Var.q;
        int i2 = p25Var.w;
        mu0 mu0Var = null;
        try {
            if (i2 == 0) {
                js2.o(obj);
                u54 u54Var2 = new u54();
                u54Var2.j = ny2.g;
                long jR = f05Var.x().r();
                bz1 vv1Var = new vv1(ku3Var, u54Var2, mu0Var, (byte) 2);
                p25Var.m = u54Var2;
                p25Var.w = 1;
                Object objT = f05Var.t(jR, vv1Var, p25Var);
                Object obj2 = px0.j;
                if (objT == obj2) {
                    return obj2;
                }
                u54Var = u54Var2;
            } else {
                if (i2 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u54Var = p25Var.m;
                js2.o(obj);
            }
            return u54Var.j;
        } catch (lu3 unused) {
            return py2.g;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:102:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:104:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:109:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:26:0x0187  */
    /* JADX WARN: Code duplicated, block: B:27:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:37:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:40:0x0206  */
    /* JADX WARN: Code duplicated, block: B:43:0x022e  */
    /* JADX WARN: Code duplicated, block: B:46:0x023a  */
    /* JADX WARN: Code duplicated, block: B:48:0x023e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0243  */
    /* JADX WARN: Code duplicated, block: B:51:0x0247  */
    /* JADX WARN: Code duplicated, block: B:54:0x024e  */
    /* JADX WARN: Code duplicated, block: B:55:0x025e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0276  */
    /* JADX WARN: Code duplicated, block: B:61:0x0281  */
    /* JADX WARN: Code duplicated, block: B:64:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x02bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0318  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0323  */
    /* JADX WARN: Code duplicated, block: B:83:0x033f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0354  */
    /* JADX WARN: Code duplicated, block: B:89:0x037b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0387  */
    /* JADX WARN: Code duplicated, block: B:94:0x038b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0397  */
    /* JADX WARN: Code duplicated, block: B:98:0x039b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17, types: [qu3] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r13v10, types: [mu0] */
    /* JADX WARN: Type inference failed for: r13v13, types: [mu0] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r26v1, types: [mu0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [fx0, mu0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    public static final Object l(f05 f05Var, ox0 ox0Var, kx3 kx3Var, cz1 cz1Var, xy1 xy1Var, ix ixVar) throws Throwable {
        n25 n25Var;
        ox0 ox0Var2;
        kx3 kx3Var2;
        ?? r5;
        cz1 cz1Var2;
        xy1 xy1Var2;
        byte b;
        Object objY;
        xy1 xy1Var3;
        xy1 xy1Var4;
        qu3 qu3Var;
        iv4 iv4VarT;
        kx3 kx3Var3;
        Object objJ;
        f05 f05Var2;
        dh2 dh2Var;
        ox0 ox0Var3;
        xy1 xy1Var5;
        kx3 kx3Var4;
        Object objT;
        cz1 cz1Var3;
        xy1 xy1Var6;
        ox0 ox0Var4;
        xy1 xy1Var7;
        xy1 xy1Var8;
        qu3 qu3Var2;
        kx3 kx3Var5;
        iv4 iv4VarX;
        iv4 iv4Var;
        Object objA;
        xy1 xy1Var9;
        cz1 cz1Var4;
        f05 f05Var3;
        xy1 xy1Var10;
        xy1 xy1Var11;
        qu3 qu3Var3;
        dh2 dh2Var2;
        qy2 qy2Var;
        mu0 mu0Var;
        kx3 kx3Var6;
        ox0 ox0Var5;
        qu3 qu3Var4;
        mu0 mu0Var2;
        iv4 iv4VarT2;
        xy1 xy1Var12;
        kx3 kx3Var7;
        Object objJ2;
        dh2 dh2Var3;
        qu3 qu3Var5;
        f05 f05Var4;
        qu3 qu3Var6;
        ox0 ox0Var6;
        xy1 xy1Var13;
        xy1 xy1Var14;
        xy1 xy1Var15;
        dh2 dh2Var4;
        ox0 ox0Var7;
        xy1 xy1Var16;
        ?? r13;
        ?? r12;
        xy1 xy1Var17;
        qy2 qy2Var2;
        Object obj;
        dh2 dh2Var5;
        ox0 ox0Var8;
        ?? r14;
        f05 f05Var5 = f05Var;
        if (ixVar instanceof n25) {
            n25Var = (n25) ixVar;
            int i = n25Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                n25Var.h = i - Integer.MIN_VALUE;
            } else {
                n25Var = new n25(ixVar);
            }
        } else {
            n25Var = new n25(ixVar);
        }
        Object objT2 = n25Var.z;
        int i2 = n25Var.h;
        ku3 ku3Var = ku3.t;
        py2 py2Var = py2.g;
        md1 md1Var = g;
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        switch (i2) {
            case 0:
                js2.o(objT2);
                n25Var.m = f05Var5;
                ox0Var2 = ox0Var;
                n25Var.q = ox0Var2;
                kx3Var2 = kx3Var;
                n25Var.w = kx3Var2;
                r5 = 0;
                n25Var.c = null;
                n25Var.i = null;
                cz1Var2 = cz1Var;
                n25Var.b = cz1Var2;
                xy1Var2 = xy1Var;
                n25Var.s = xy1Var2;
                b = 1;
                n25Var.h = 1;
                objY = y(f05Var5, n25Var, 3);
                if (objY != px0Var) {
                    xy1Var3 = null;
                    xy1Var4 = null;
                    qu3 qu3Var7 = (qu3) objY;
                    qu3Var7.g();
                    qu3Var = qu3Var7;
                    iv4VarT = m50.T(ox0Var2, r5, new l25(kx3Var2, r5, b), b);
                    if (cz1Var2 != md1Var) {
                        kx3 kx3Var8 = kx3Var2;
                        kx3Var3 = kx3Var8;
                        x(ox0Var2, iv4VarT, new o25(cz1Var2, kx3Var8, qu3Var, r5, (byte) 0));
                    } else {
                        kx3Var3 = kx3Var2;
                    }
                    if (xy1Var3 == null) {
                        n25Var.m = f05Var5;
                        n25Var.q = ox0Var2;
                        n25Var.w = kx3Var3;
                        n25Var.c = xy1Var4;
                        n25Var.i = xy1Var3;
                        n25Var.b = cz1Var2;
                        n25Var.s = xy1Var2;
                        n25Var.p = iv4VarT;
                        n25Var.h = 2;
                        objT = t(f05Var5, ku3Var, n25Var);
                        if (objT != px0Var) {
                            f05Var2 = f05Var5;
                            dh2Var = iv4VarT;
                            cz1Var3 = cz1Var2;
                            xy1Var6 = xy1Var3;
                            ox0Var4 = ox0Var2;
                            objT2 = objT;
                            xy1Var7 = xy1Var2;
                            xy1Var8 = xy1Var4;
                            qu3Var2 = (qu3) objT2;
                            ox0 ox0Var9 = ox0Var4;
                            xy1Var3 = xy1Var6;
                            kx3Var5 = kx3Var3;
                            ox0Var3 = ox0Var9;
                            if (qu3Var2 == null) {
                                iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 3));
                            } else {
                                qu3Var2.g();
                                iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 4));
                            }
                            if (qu3Var2 != null) {
                                if (xy1Var8 == null) {
                                    n25Var.m = f05Var2;
                                    n25Var.q = ox0Var3;
                                    n25Var.w = kx3Var5;
                                    n25Var.c = xy1Var8;
                                    n25Var.i = xy1Var3;
                                    n25Var.b = cz1Var3;
                                    n25Var.s = xy1Var7;
                                    n25Var.p = qu3Var2;
                                    n25Var.u = iv4VarX;
                                    n25Var.h = 5;
                                    iv4Var = iv4VarX;
                                    objA = f05Var2.a(f05Var2.x().y(), new oi4(qu3Var2, null), n25Var);
                                    if (objA != px0Var) {
                                        xy1Var9 = xy1Var8;
                                        cz1Var4 = cz1Var3;
                                        f05Var3 = f05Var2;
                                        xy1Var10 = xy1Var3;
                                        xy1Var11 = xy1Var7;
                                        qu3Var3 = qu3Var2;
                                        objT2 = objA;
                                        dh2Var2 = iv4Var;
                                        qu3Var4 = (qu3) objT2;
                                        if (qu3Var4 != null) {
                                            mu0Var2 = null;
                                            iv4VarT2 = m50.T(ox0Var3, null, new b8(dh2Var2, kx3Var5, mu0Var2, (byte) 9), 1);
                                            if (cz1Var4 != md1Var) {
                                                kx3 kx3Var9 = kx3Var5;
                                                cz1 cz1Var5 = cz1Var4;
                                                kx3Var7 = kx3Var9;
                                                xy1Var12 = null;
                                                x(ox0Var3, iv4VarT2, new o25(cz1Var5, kx3Var9, qu3Var4, mu0Var2, (byte) 1));
                                            } else {
                                                xy1Var12 = null;
                                                kx3Var7 = kx3Var5;
                                            }
                                            if (xy1Var10 == null) {
                                                n25Var.m = ox0Var3;
                                                n25Var.q = kx3Var7;
                                                n25Var.w = xy1Var9;
                                                n25Var.c = xy1Var11;
                                                n25Var.i = iv4VarT2;
                                                n25Var.b = qu3Var3;
                                                n25Var.s = xy1Var12;
                                                n25Var.p = xy1Var12;
                                                n25Var.u = xy1Var12;
                                                n25Var.h = 6;
                                                objT2 = t(f05Var3, ku3Var, n25Var);
                                                if (objT2 != px0Var) {
                                                    qu3 qu3Var8 = qu3Var3;
                                                    dh2Var4 = iv4VarT2;
                                                    qu3Var6 = qu3Var8;
                                                    ox0Var7 = ox0Var3;
                                                    xy1Var13 = xy1Var11;
                                                    xy1Var15 = xy1Var9;
                                                    xy1Var16 = xy1Var12;
                                                    r12 = (qu3) objT2;
                                                    r13 = xy1Var16;
                                                    if (r12 != 0) {
                                                        r12.g();
                                                        x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                        xy1Var15.a(new wi3(r12.r));
                                                        return og5Var;
                                                    }
                                                    x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                                    if (xy1Var13 != null) {
                                                        xy1Var13.a(new wi3(qu3Var6.r));
                                                        return og5Var;
                                                    }
                                                }
                                            } else {
                                                n25Var.m = f05Var3;
                                                n25Var.q = ox0Var3;
                                                n25Var.w = kx3Var7;
                                                n25Var.c = xy1Var9;
                                                n25Var.i = xy1Var10;
                                                n25Var.b = xy1Var11;
                                                n25Var.s = iv4VarT2;
                                                n25Var.p = qu3Var3;
                                                n25Var.u = r25;
                                                n25Var.h = 7;
                                                objJ2 = j(f05Var3, ku3Var, n25Var);
                                                if (objJ2 != px0Var) {
                                                    kx3 kx3Var10 = kx3Var7;
                                                    dh2Var3 = iv4VarT2;
                                                    qu3Var5 = qu3Var4;
                                                    objT2 = objJ2;
                                                    f05Var4 = f05Var3;
                                                    qu3Var6 = qu3Var3;
                                                    kx3Var7 = kx3Var10;
                                                    ox0Var6 = ox0Var3;
                                                    xy1Var13 = xy1Var11;
                                                    xy1Var14 = xy1Var10;
                                                    xy1Var15 = xy1Var9;
                                                    xy1Var17 = xy1Var12;
                                                    qy2Var2 = (qy2) objT2;
                                                    if (yf2.p(qy2Var2, py2Var)) {
                                                        xy1Var14.a(new wi3(qu3Var5.r));
                                                        n25Var.m = ox0Var6;
                                                        n25Var.q = kx3Var7;
                                                        n25Var.w = dh2Var3;
                                                        n25Var.c = xy1Var17;
                                                        n25Var.i = xy1Var17;
                                                        n25Var.b = xy1Var17;
                                                        n25Var.s = xy1Var17;
                                                        n25Var.p = xy1Var17;
                                                        n25Var.u = xy1Var17;
                                                        n25Var.h = 8;
                                                        if (r(f05Var4, n25Var) != px0Var) {
                                                            dh2Var5 = dh2Var3;
                                                            ox0Var8 = ox0Var6;
                                                            r14 = xy1Var17;
                                                            x(ox0Var8, dh2Var5, new k25(kx3Var7, r14, (byte) 7));
                                                            return og5Var;
                                                        }
                                                    } else {
                                                        if (qy2Var2 instanceof oy2) {
                                                            dh2Var4 = dh2Var3;
                                                            obj = ((oy2) qy2Var2).g;
                                                        } else {
                                                            if (qy2Var2 instanceof ny2) {
                                                                up.y();
                                                                return null;
                                                            }
                                                            dh2Var4 = dh2Var3;
                                                            obj = xy1Var17;
                                                        }
                                                        ox0Var7 = ox0Var6;
                                                        r12 = obj;
                                                        r13 = xy1Var17;
                                                        if (r12 != 0) {
                                                            r12.g();
                                                            x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                            xy1Var15.a(new wi3(r12.r));
                                                            return og5Var;
                                                        }
                                                        x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                                        if (xy1Var13 != null) {
                                                            xy1Var13.a(new wi3(qu3Var6.r));
                                                            return og5Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (xy1Var11 != null) {
                                            xy1Var11.a(new wi3(qu3Var3.r));
                                            return og5Var;
                                        }
                                    }
                                } else if (xy1Var7 != null) {
                                    xy1Var7.a(new wi3(qu3Var2.r));
                                    return og5Var;
                                }
                            }
                            return og5Var;
                        }
                    } else {
                        n25Var.m = f05Var5;
                        n25Var.q = ox0Var2;
                        n25Var.w = kx3Var3;
                        n25Var.c = xy1Var4;
                        n25Var.i = xy1Var3;
                        n25Var.b = cz1Var2;
                        n25Var.s = xy1Var2;
                        n25Var.p = qu3Var;
                        n25Var.u = iv4VarT;
                        n25Var.h = 3;
                        objJ = j(f05Var5, ku3Var, n25Var);
                        if (objJ != px0Var) {
                            f05Var2 = f05Var5;
                            dh2Var = iv4VarT;
                            kx3 kx3Var11 = kx3Var3;
                            ox0Var3 = ox0Var2;
                            objT2 = objJ;
                            xy1Var5 = xy1Var2;
                            kx3Var4 = kx3Var11;
                            qy2Var = (qy2) objT2;
                            if (!yf2.p(qy2Var, py2Var)) {
                                if (qy2Var instanceof oy2) {
                                    qu3Var2 = ((oy2) qy2Var).g;
                                } else {
                                    if (!(qy2Var instanceof ny2)) {
                                        up.y();
                                        return null;
                                    }
                                    qu3Var2 = null;
                                }
                                xy1Var7 = xy1Var5;
                                cz1Var3 = cz1Var2;
                                kx3Var5 = kx3Var4;
                                xy1Var8 = xy1Var4;
                                if (qu3Var2 == null) {
                                    iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 3));
                                } else {
                                    qu3Var2.g();
                                    iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 4));
                                }
                                if (qu3Var2 != null) {
                                    if (xy1Var8 == null) {
                                        n25Var.m = f05Var2;
                                        n25Var.q = ox0Var3;
                                        n25Var.w = kx3Var5;
                                        n25Var.c = xy1Var8;
                                        n25Var.i = xy1Var3;
                                        n25Var.b = cz1Var3;
                                        n25Var.s = xy1Var7;
                                        n25Var.p = qu3Var2;
                                        n25Var.u = iv4VarX;
                                        n25Var.h = 5;
                                        iv4Var = iv4VarX;
                                        objA = f05Var2.a(f05Var2.x().y(), new oi4(qu3Var2, null), n25Var);
                                        if (objA != px0Var) {
                                            xy1Var9 = xy1Var8;
                                            cz1Var4 = cz1Var3;
                                            f05Var3 = f05Var2;
                                            xy1Var10 = xy1Var3;
                                            xy1Var11 = xy1Var7;
                                            qu3Var3 = qu3Var2;
                                            objT2 = objA;
                                            dh2Var2 = iv4Var;
                                            qu3Var4 = (qu3) objT2;
                                            if (qu3Var4 != null) {
                                                mu0Var2 = null;
                                                iv4VarT2 = m50.T(ox0Var3, null, new b8(dh2Var2, kx3Var5, mu0Var2, (byte) 9), 1);
                                                if (cz1Var4 != md1Var) {
                                                    kx3 kx3Var12 = kx3Var5;
                                                    cz1 cz1Var6 = cz1Var4;
                                                    kx3Var7 = kx3Var12;
                                                    xy1Var12 = null;
                                                    x(ox0Var3, iv4VarT2, new o25(cz1Var6, kx3Var12, qu3Var4, mu0Var2, (byte) 1));
                                                } else {
                                                    xy1Var12 = null;
                                                    kx3Var7 = kx3Var5;
                                                }
                                                if (xy1Var10 == null) {
                                                    n25Var.m = ox0Var3;
                                                    n25Var.q = kx3Var7;
                                                    n25Var.w = xy1Var9;
                                                    n25Var.c = xy1Var11;
                                                    n25Var.i = iv4VarT2;
                                                    n25Var.b = qu3Var3;
                                                    n25Var.s = xy1Var12;
                                                    n25Var.p = xy1Var12;
                                                    n25Var.u = xy1Var12;
                                                    n25Var.h = 6;
                                                    objT2 = t(f05Var3, ku3Var, n25Var);
                                                    if (objT2 != px0Var) {
                                                        qu3 qu3Var9 = qu3Var3;
                                                        dh2Var4 = iv4VarT2;
                                                        qu3Var6 = qu3Var9;
                                                        ox0Var7 = ox0Var3;
                                                        xy1Var13 = xy1Var11;
                                                        xy1Var15 = xy1Var9;
                                                        xy1Var16 = xy1Var12;
                                                        r12 = (qu3) objT2;
                                                        r13 = xy1Var16;
                                                        if (r12 != 0) {
                                                            r12.g();
                                                            x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                            xy1Var15.a(new wi3(r12.r));
                                                            return og5Var;
                                                        }
                                                        x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                                        if (xy1Var13 != null) {
                                                            xy1Var13.a(new wi3(qu3Var6.r));
                                                            return og5Var;
                                                        }
                                                    }
                                                } else {
                                                    n25Var.m = f05Var3;
                                                    n25Var.q = ox0Var3;
                                                    n25Var.w = kx3Var7;
                                                    n25Var.c = xy1Var9;
                                                    n25Var.i = xy1Var10;
                                                    n25Var.b = xy1Var11;
                                                    n25Var.s = iv4VarT2;
                                                    n25Var.p = qu3Var3;
                                                    n25Var.u = r25;
                                                    n25Var.h = 7;
                                                    objJ2 = j(f05Var3, ku3Var, n25Var);
                                                    if (objJ2 != px0Var) {
                                                        kx3 kx3Var13 = kx3Var7;
                                                        dh2Var3 = iv4VarT2;
                                                        qu3Var5 = qu3Var4;
                                                        objT2 = objJ2;
                                                        f05Var4 = f05Var3;
                                                        qu3Var6 = qu3Var3;
                                                        kx3Var7 = kx3Var13;
                                                        ox0Var6 = ox0Var3;
                                                        xy1Var13 = xy1Var11;
                                                        xy1Var14 = xy1Var10;
                                                        xy1Var15 = xy1Var9;
                                                        xy1Var17 = xy1Var12;
                                                        qy2Var2 = (qy2) objT2;
                                                        if (yf2.p(qy2Var2, py2Var)) {
                                                            xy1Var14.a(new wi3(qu3Var5.r));
                                                            n25Var.m = ox0Var6;
                                                            n25Var.q = kx3Var7;
                                                            n25Var.w = dh2Var3;
                                                            n25Var.c = xy1Var17;
                                                            n25Var.i = xy1Var17;
                                                            n25Var.b = xy1Var17;
                                                            n25Var.s = xy1Var17;
                                                            n25Var.p = xy1Var17;
                                                            n25Var.u = xy1Var17;
                                                            n25Var.h = 8;
                                                            if (r(f05Var4, n25Var) != px0Var) {
                                                                dh2Var5 = dh2Var3;
                                                                ox0Var8 = ox0Var6;
                                                                r14 = xy1Var17;
                                                                x(ox0Var8, dh2Var5, new k25(kx3Var7, r14, (byte) 7));
                                                                return og5Var;
                                                            }
                                                        } else {
                                                            if (qy2Var2 instanceof oy2) {
                                                                dh2Var4 = dh2Var3;
                                                                obj = ((oy2) qy2Var2).g;
                                                            } else {
                                                                if (qy2Var2 instanceof ny2) {
                                                                    up.y();
                                                                    return null;
                                                                }
                                                                dh2Var4 = dh2Var3;
                                                                obj = xy1Var17;
                                                            }
                                                            ox0Var7 = ox0Var6;
                                                            r12 = obj;
                                                            r13 = xy1Var17;
                                                            if (r12 != 0) {
                                                                r12.g();
                                                                x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                                xy1Var15.a(new wi3(r12.r));
                                                                return og5Var;
                                                            }
                                                            x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                                            if (xy1Var13 != null) {
                                                                xy1Var13.a(new wi3(qu3Var6.r));
                                                                return og5Var;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (xy1Var11 != null) {
                                                xy1Var11.a(new wi3(qu3Var3.r));
                                                return og5Var;
                                            }
                                        }
                                    } else if (xy1Var7 != null) {
                                        xy1Var7.a(new wi3(qu3Var2.r));
                                        return og5Var;
                                    }
                                }
                                return og5Var;
                            }
                            xy1Var3.a(new wi3(qu3Var.r));
                            n25Var.m = ox0Var3;
                            n25Var.q = kx3Var4;
                            n25Var.w = dh2Var;
                            mu0Var = null;
                            n25Var.c = null;
                            n25Var.i = null;
                            n25Var.b = null;
                            n25Var.s = null;
                            n25Var.p = null;
                            n25Var.u = null;
                            n25Var.h = 4;
                            if (r(f05Var2, n25Var) != px0Var) {
                                kx3Var6 = kx3Var4;
                                ox0Var5 = ox0Var3;
                                x(ox0Var5, dh2Var, new k25(kx3Var6, mu0Var, (byte) 2));
                                return og5Var;
                            }
                        }
                    }
                }
                return px0Var;
            case 1:
                xy1 xy1Var18 = (xy1) n25Var.s;
                cz1 cz1Var7 = (cz1) n25Var.b;
                xy1 xy1Var19 = (xy1) n25Var.i;
                xy1 xy1Var20 = n25Var.c;
                kx3 kx3Var14 = (kx3) n25Var.w;
                ox0 ox0Var10 = (ox0) n25Var.q;
                f05 f05Var6 = (f05) n25Var.m;
                js2.o(objT2);
                objY = objT2;
                xy1Var4 = xy1Var20;
                ox0Var2 = ox0Var10;
                b = 1;
                cz1Var2 = cz1Var7;
                kx3Var2 = kx3Var14;
                xy1Var2 = xy1Var18;
                f05Var5 = f05Var6;
                xy1Var3 = xy1Var19;
                r5 = 0;
                qu3 qu3Var10 = (qu3) objY;
                qu3Var10.g();
                qu3Var = qu3Var10;
                iv4VarT = m50.T(ox0Var2, r5, new l25(kx3Var2, r5, b), b);
                if (cz1Var2 != md1Var) {
                    kx3 kx3Var15 = kx3Var2;
                    kx3Var3 = kx3Var15;
                    x(ox0Var2, iv4VarT, new o25(cz1Var2, kx3Var15, qu3Var, r5, (byte) 0));
                } else {
                    kx3Var3 = kx3Var2;
                }
                if (xy1Var3 == null) {
                    n25Var.m = f05Var5;
                    n25Var.q = ox0Var2;
                    n25Var.w = kx3Var3;
                    n25Var.c = xy1Var4;
                    n25Var.i = xy1Var3;
                    n25Var.b = cz1Var2;
                    n25Var.s = xy1Var2;
                    n25Var.p = iv4VarT;
                    n25Var.h = 2;
                    objT = t(f05Var5, ku3Var, n25Var);
                    if (objT != px0Var) {
                        f05Var2 = f05Var5;
                        dh2Var = iv4VarT;
                        cz1Var3 = cz1Var2;
                        xy1Var6 = xy1Var3;
                        ox0Var4 = ox0Var2;
                        objT2 = objT;
                        xy1Var7 = xy1Var2;
                        xy1Var8 = xy1Var4;
                        qu3Var2 = (qu3) objT2;
                        ox0 ox0Var11 = ox0Var4;
                        xy1Var3 = xy1Var6;
                        kx3Var5 = kx3Var3;
                        ox0Var3 = ox0Var11;
                        if (qu3Var2 == null) {
                            iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 3));
                        } else {
                            qu3Var2.g();
                            iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 4));
                        }
                        if (qu3Var2 != null) {
                            if (xy1Var8 == null) {
                                n25Var.m = f05Var2;
                                n25Var.q = ox0Var3;
                                n25Var.w = kx3Var5;
                                n25Var.c = xy1Var8;
                                n25Var.i = xy1Var3;
                                n25Var.b = cz1Var3;
                                n25Var.s = xy1Var7;
                                n25Var.p = qu3Var2;
                                n25Var.u = iv4VarX;
                                n25Var.h = 5;
                                iv4Var = iv4VarX;
                                objA = f05Var2.a(f05Var2.x().y(), new oi4(qu3Var2, null), n25Var);
                                if (objA != px0Var) {
                                    xy1Var9 = xy1Var8;
                                    cz1Var4 = cz1Var3;
                                    f05Var3 = f05Var2;
                                    xy1Var10 = xy1Var3;
                                    xy1Var11 = xy1Var7;
                                    qu3Var3 = qu3Var2;
                                    objT2 = objA;
                                    dh2Var2 = iv4Var;
                                    qu3Var4 = (qu3) objT2;
                                    if (qu3Var4 != null) {
                                        mu0Var2 = null;
                                        iv4VarT2 = m50.T(ox0Var3, null, new b8(dh2Var2, kx3Var5, mu0Var2, (byte) 9), 1);
                                        if (cz1Var4 != md1Var) {
                                            kx3 kx3Var16 = kx3Var5;
                                            cz1 cz1Var8 = cz1Var4;
                                            kx3Var7 = kx3Var16;
                                            xy1Var12 = null;
                                            x(ox0Var3, iv4VarT2, new o25(cz1Var8, kx3Var16, qu3Var4, mu0Var2, (byte) 1));
                                        } else {
                                            xy1Var12 = null;
                                            kx3Var7 = kx3Var5;
                                        }
                                        if (xy1Var10 == null) {
                                            n25Var.m = ox0Var3;
                                            n25Var.q = kx3Var7;
                                            n25Var.w = xy1Var9;
                                            n25Var.c = xy1Var11;
                                            n25Var.i = iv4VarT2;
                                            n25Var.b = qu3Var3;
                                            n25Var.s = xy1Var12;
                                            n25Var.p = xy1Var12;
                                            n25Var.u = xy1Var12;
                                            n25Var.h = 6;
                                            objT2 = t(f05Var3, ku3Var, n25Var);
                                            if (objT2 != px0Var) {
                                                qu3 qu3Var11 = qu3Var3;
                                                dh2Var4 = iv4VarT2;
                                                qu3Var6 = qu3Var11;
                                                ox0Var7 = ox0Var3;
                                                xy1Var13 = xy1Var11;
                                                xy1Var15 = xy1Var9;
                                                xy1Var16 = xy1Var12;
                                                r12 = (qu3) objT2;
                                                r13 = xy1Var16;
                                                if (r12 != 0) {
                                                    r12.g();
                                                    x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                    xy1Var15.a(new wi3(r12.r));
                                                    return og5Var;
                                                }
                                                x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                                if (xy1Var13 != null) {
                                                    xy1Var13.a(new wi3(qu3Var6.r));
                                                    return og5Var;
                                                }
                                            }
                                        } else {
                                            n25Var.m = f05Var3;
                                            n25Var.q = ox0Var3;
                                            n25Var.w = kx3Var7;
                                            n25Var.c = xy1Var9;
                                            n25Var.i = xy1Var10;
                                            n25Var.b = xy1Var11;
                                            n25Var.s = iv4VarT2;
                                            n25Var.p = qu3Var3;
                                            n25Var.u = r25;
                                            n25Var.h = 7;
                                            objJ2 = j(f05Var3, ku3Var, n25Var);
                                            if (objJ2 != px0Var) {
                                                kx3 kx3Var17 = kx3Var7;
                                                dh2Var3 = iv4VarT2;
                                                qu3Var5 = qu3Var4;
                                                objT2 = objJ2;
                                                f05Var4 = f05Var3;
                                                qu3Var6 = qu3Var3;
                                                kx3Var7 = kx3Var17;
                                                ox0Var6 = ox0Var3;
                                                xy1Var13 = xy1Var11;
                                                xy1Var14 = xy1Var10;
                                                xy1Var15 = xy1Var9;
                                                xy1Var17 = xy1Var12;
                                                qy2Var2 = (qy2) objT2;
                                                if (yf2.p(qy2Var2, py2Var)) {
                                                    xy1Var14.a(new wi3(qu3Var5.r));
                                                    n25Var.m = ox0Var6;
                                                    n25Var.q = kx3Var7;
                                                    n25Var.w = dh2Var3;
                                                    n25Var.c = xy1Var17;
                                                    n25Var.i = xy1Var17;
                                                    n25Var.b = xy1Var17;
                                                    n25Var.s = xy1Var17;
                                                    n25Var.p = xy1Var17;
                                                    n25Var.u = xy1Var17;
                                                    n25Var.h = 8;
                                                    if (r(f05Var4, n25Var) != px0Var) {
                                                        dh2Var5 = dh2Var3;
                                                        ox0Var8 = ox0Var6;
                                                        r14 = xy1Var17;
                                                        x(ox0Var8, dh2Var5, new k25(kx3Var7, r14, (byte) 7));
                                                        return og5Var;
                                                    }
                                                } else {
                                                    if (qy2Var2 instanceof oy2) {
                                                        dh2Var4 = dh2Var3;
                                                        obj = ((oy2) qy2Var2).g;
                                                    } else {
                                                        if (qy2Var2 instanceof ny2) {
                                                            up.y();
                                                            return null;
                                                        }
                                                        dh2Var4 = dh2Var3;
                                                        obj = xy1Var17;
                                                    }
                                                    ox0Var7 = ox0Var6;
                                                    r12 = obj;
                                                    r13 = xy1Var17;
                                                    if (r12 != 0) {
                                                        r12.g();
                                                        x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                        xy1Var15.a(new wi3(r12.r));
                                                        return og5Var;
                                                    }
                                                    x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                                    if (xy1Var13 != null) {
                                                        xy1Var13.a(new wi3(qu3Var6.r));
                                                        return og5Var;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (xy1Var11 != null) {
                                        xy1Var11.a(new wi3(qu3Var3.r));
                                        return og5Var;
                                    }
                                }
                            } else if (xy1Var7 != null) {
                                xy1Var7.a(new wi3(qu3Var2.r));
                                return og5Var;
                            }
                        }
                        return og5Var;
                    }
                } else {
                    n25Var.m = f05Var5;
                    n25Var.q = ox0Var2;
                    n25Var.w = kx3Var3;
                    n25Var.c = xy1Var4;
                    n25Var.i = xy1Var3;
                    n25Var.b = cz1Var2;
                    n25Var.s = xy1Var2;
                    n25Var.p = qu3Var;
                    n25Var.u = iv4VarT;
                    n25Var.h = 3;
                    objJ = j(f05Var5, ku3Var, n25Var);
                    if (objJ != px0Var) {
                        f05Var2 = f05Var5;
                        dh2Var = iv4VarT;
                        kx3 kx3Var18 = kx3Var3;
                        ox0Var3 = ox0Var2;
                        objT2 = objJ;
                        xy1Var5 = xy1Var2;
                        kx3Var4 = kx3Var18;
                        qy2Var = (qy2) objT2;
                        if (!yf2.p(qy2Var, py2Var)) {
                            if (qy2Var instanceof oy2) {
                                qu3Var2 = ((oy2) qy2Var).g;
                            } else {
                                if (!(qy2Var instanceof ny2)) {
                                    up.y();
                                    return null;
                                }
                                qu3Var2 = null;
                            }
                            xy1Var7 = xy1Var5;
                            cz1Var3 = cz1Var2;
                            kx3Var5 = kx3Var4;
                            xy1Var8 = xy1Var4;
                            if (qu3Var2 == null) {
                                iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 3));
                            } else {
                                qu3Var2.g();
                                iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 4));
                            }
                            if (qu3Var2 != null) {
                                if (xy1Var8 == null) {
                                    n25Var.m = f05Var2;
                                    n25Var.q = ox0Var3;
                                    n25Var.w = kx3Var5;
                                    n25Var.c = xy1Var8;
                                    n25Var.i = xy1Var3;
                                    n25Var.b = cz1Var3;
                                    n25Var.s = xy1Var7;
                                    n25Var.p = qu3Var2;
                                    n25Var.u = iv4VarX;
                                    n25Var.h = 5;
                                    iv4Var = iv4VarX;
                                    objA = f05Var2.a(f05Var2.x().y(), new oi4(qu3Var2, null), n25Var);
                                    if (objA != px0Var) {
                                        xy1Var9 = xy1Var8;
                                        cz1Var4 = cz1Var3;
                                        f05Var3 = f05Var2;
                                        xy1Var10 = xy1Var3;
                                        xy1Var11 = xy1Var7;
                                        qu3Var3 = qu3Var2;
                                        objT2 = objA;
                                        dh2Var2 = iv4Var;
                                        qu3Var4 = (qu3) objT2;
                                        if (qu3Var4 != null) {
                                            mu0Var2 = null;
                                            iv4VarT2 = m50.T(ox0Var3, null, new b8(dh2Var2, kx3Var5, mu0Var2, (byte) 9), 1);
                                            if (cz1Var4 != md1Var) {
                                                kx3 kx3Var19 = kx3Var5;
                                                cz1 cz1Var9 = cz1Var4;
                                                kx3Var7 = kx3Var19;
                                                xy1Var12 = null;
                                                x(ox0Var3, iv4VarT2, new o25(cz1Var9, kx3Var19, qu3Var4, mu0Var2, (byte) 1));
                                            } else {
                                                xy1Var12 = null;
                                                kx3Var7 = kx3Var5;
                                            }
                                            if (xy1Var10 == null) {
                                                n25Var.m = ox0Var3;
                                                n25Var.q = kx3Var7;
                                                n25Var.w = xy1Var9;
                                                n25Var.c = xy1Var11;
                                                n25Var.i = iv4VarT2;
                                                n25Var.b = qu3Var3;
                                                n25Var.s = xy1Var12;
                                                n25Var.p = xy1Var12;
                                                n25Var.u = xy1Var12;
                                                n25Var.h = 6;
                                                objT2 = t(f05Var3, ku3Var, n25Var);
                                                if (objT2 != px0Var) {
                                                    qu3 qu3Var12 = qu3Var3;
                                                    dh2Var4 = iv4VarT2;
                                                    qu3Var6 = qu3Var12;
                                                    ox0Var7 = ox0Var3;
                                                    xy1Var13 = xy1Var11;
                                                    xy1Var15 = xy1Var9;
                                                    xy1Var16 = xy1Var12;
                                                    r12 = (qu3) objT2;
                                                    r13 = xy1Var16;
                                                    if (r12 != 0) {
                                                        r12.g();
                                                        x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                        xy1Var15.a(new wi3(r12.r));
                                                        return og5Var;
                                                    }
                                                    x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                                    if (xy1Var13 != null) {
                                                        xy1Var13.a(new wi3(qu3Var6.r));
                                                        return og5Var;
                                                    }
                                                }
                                            } else {
                                                n25Var.m = f05Var3;
                                                n25Var.q = ox0Var3;
                                                n25Var.w = kx3Var7;
                                                n25Var.c = xy1Var9;
                                                n25Var.i = xy1Var10;
                                                n25Var.b = xy1Var11;
                                                n25Var.s = iv4VarT2;
                                                n25Var.p = qu3Var3;
                                                n25Var.u = r25;
                                                n25Var.h = 7;
                                                objJ2 = j(f05Var3, ku3Var, n25Var);
                                                if (objJ2 != px0Var) {
                                                    kx3 kx3Var110 = kx3Var7;
                                                    dh2Var3 = iv4VarT2;
                                                    qu3Var5 = qu3Var4;
                                                    objT2 = objJ2;
                                                    f05Var4 = f05Var3;
                                                    qu3Var6 = qu3Var3;
                                                    kx3Var7 = kx3Var110;
                                                    ox0Var6 = ox0Var3;
                                                    xy1Var13 = xy1Var11;
                                                    xy1Var14 = xy1Var10;
                                                    xy1Var15 = xy1Var9;
                                                    xy1Var17 = xy1Var12;
                                                    qy2Var2 = (qy2) objT2;
                                                    if (yf2.p(qy2Var2, py2Var)) {
                                                        xy1Var14.a(new wi3(qu3Var5.r));
                                                        n25Var.m = ox0Var6;
                                                        n25Var.q = kx3Var7;
                                                        n25Var.w = dh2Var3;
                                                        n25Var.c = xy1Var17;
                                                        n25Var.i = xy1Var17;
                                                        n25Var.b = xy1Var17;
                                                        n25Var.s = xy1Var17;
                                                        n25Var.p = xy1Var17;
                                                        n25Var.u = xy1Var17;
                                                        n25Var.h = 8;
                                                        if (r(f05Var4, n25Var) != px0Var) {
                                                            dh2Var5 = dh2Var3;
                                                            ox0Var8 = ox0Var6;
                                                            r14 = xy1Var17;
                                                            x(ox0Var8, dh2Var5, new k25(kx3Var7, r14, (byte) 7));
                                                            return og5Var;
                                                        }
                                                    } else {
                                                        if (qy2Var2 instanceof oy2) {
                                                            dh2Var4 = dh2Var3;
                                                            obj = ((oy2) qy2Var2).g;
                                                        } else {
                                                            if (qy2Var2 instanceof ny2) {
                                                                up.y();
                                                                return null;
                                                            }
                                                            dh2Var4 = dh2Var3;
                                                            obj = xy1Var17;
                                                        }
                                                        ox0Var7 = ox0Var6;
                                                        r12 = obj;
                                                        r13 = xy1Var17;
                                                        if (r12 != 0) {
                                                            r12.g();
                                                            x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                            xy1Var15.a(new wi3(r12.r));
                                                            return og5Var;
                                                        }
                                                        x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                                        if (xy1Var13 != null) {
                                                            xy1Var13.a(new wi3(qu3Var6.r));
                                                            return og5Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (xy1Var11 != null) {
                                            xy1Var11.a(new wi3(qu3Var3.r));
                                            return og5Var;
                                        }
                                    }
                                } else if (xy1Var7 != null) {
                                    xy1Var7.a(new wi3(qu3Var2.r));
                                    return og5Var;
                                }
                            }
                            return og5Var;
                        }
                        xy1Var3.a(new wi3(qu3Var.r));
                        n25Var.m = ox0Var3;
                        n25Var.q = kx3Var4;
                        n25Var.w = dh2Var;
                        mu0Var = null;
                        n25Var.c = null;
                        n25Var.i = null;
                        n25Var.b = null;
                        n25Var.s = null;
                        n25Var.p = null;
                        n25Var.u = null;
                        n25Var.h = 4;
                        if (r(f05Var2, n25Var) != px0Var) {
                            kx3Var6 = kx3Var4;
                            ox0Var5 = ox0Var3;
                            x(ox0Var5, dh2Var, new k25(kx3Var6, mu0Var, (byte) 2));
                            return og5Var;
                        }
                    }
                }
                return px0Var;
            case 2:
                dh2Var = (dh2) n25Var.p;
                xy1Var7 = (xy1) n25Var.s;
                cz1Var3 = (cz1) n25Var.b;
                xy1Var6 = (xy1) n25Var.i;
                xy1Var8 = n25Var.c;
                kx3Var3 = (kx3) n25Var.w;
                ox0Var4 = (ox0) n25Var.q;
                f05Var2 = (f05) n25Var.m;
                js2.o(objT2);
                qu3Var2 = (qu3) objT2;
                ox0 ox0Var12 = ox0Var4;
                xy1Var3 = xy1Var6;
                kx3Var5 = kx3Var3;
                ox0Var3 = ox0Var12;
                if (qu3Var2 == null) {
                    iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 3));
                } else {
                    qu3Var2.g();
                    iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 4));
                }
                if (qu3Var2 != null) {
                    if (xy1Var8 == null) {
                        n25Var.m = f05Var2;
                        n25Var.q = ox0Var3;
                        n25Var.w = kx3Var5;
                        n25Var.c = xy1Var8;
                        n25Var.i = xy1Var3;
                        n25Var.b = cz1Var3;
                        n25Var.s = xy1Var7;
                        n25Var.p = qu3Var2;
                        n25Var.u = iv4VarX;
                        n25Var.h = 5;
                        iv4Var = iv4VarX;
                        objA = f05Var2.a(f05Var2.x().y(), new oi4(qu3Var2, null), n25Var);
                        if (objA != px0Var) {
                            xy1Var9 = xy1Var8;
                            cz1Var4 = cz1Var3;
                            f05Var3 = f05Var2;
                            xy1Var10 = xy1Var3;
                            xy1Var11 = xy1Var7;
                            qu3Var3 = qu3Var2;
                            objT2 = objA;
                            dh2Var2 = iv4Var;
                            qu3Var4 = (qu3) objT2;
                            if (qu3Var4 != null) {
                                mu0Var2 = null;
                                iv4VarT2 = m50.T(ox0Var3, null, new b8(dh2Var2, kx3Var5, mu0Var2, (byte) 9), 1);
                                if (cz1Var4 != md1Var) {
                                    kx3 kx3Var111 = kx3Var5;
                                    cz1 cz1Var10 = cz1Var4;
                                    kx3Var7 = kx3Var111;
                                    xy1Var12 = null;
                                    x(ox0Var3, iv4VarT2, new o25(cz1Var10, kx3Var111, qu3Var4, mu0Var2, (byte) 1));
                                } else {
                                    xy1Var12 = null;
                                    kx3Var7 = kx3Var5;
                                }
                                if (xy1Var10 == null) {
                                    n25Var.m = ox0Var3;
                                    n25Var.q = kx3Var7;
                                    n25Var.w = xy1Var9;
                                    n25Var.c = xy1Var11;
                                    n25Var.i = iv4VarT2;
                                    n25Var.b = qu3Var3;
                                    n25Var.s = xy1Var12;
                                    n25Var.p = xy1Var12;
                                    n25Var.u = xy1Var12;
                                    n25Var.h = 6;
                                    objT2 = t(f05Var3, ku3Var, n25Var);
                                    if (objT2 != px0Var) {
                                        qu3 qu3Var13 = qu3Var3;
                                        dh2Var4 = iv4VarT2;
                                        qu3Var6 = qu3Var13;
                                        ox0Var7 = ox0Var3;
                                        xy1Var13 = xy1Var11;
                                        xy1Var15 = xy1Var9;
                                        xy1Var16 = xy1Var12;
                                        r12 = (qu3) objT2;
                                        r13 = xy1Var16;
                                        if (r12 != 0) {
                                            r12.g();
                                            x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                            xy1Var15.a(new wi3(r12.r));
                                            return og5Var;
                                        }
                                        x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                        if (xy1Var13 != null) {
                                            xy1Var13.a(new wi3(qu3Var6.r));
                                            return og5Var;
                                        }
                                    }
                                } else {
                                    n25Var.m = f05Var3;
                                    n25Var.q = ox0Var3;
                                    n25Var.w = kx3Var7;
                                    n25Var.c = xy1Var9;
                                    n25Var.i = xy1Var10;
                                    n25Var.b = xy1Var11;
                                    n25Var.s = iv4VarT2;
                                    n25Var.p = qu3Var3;
                                    n25Var.u = r25;
                                    n25Var.h = 7;
                                    objJ2 = j(f05Var3, ku3Var, n25Var);
                                    if (objJ2 != px0Var) {
                                        kx3 kx3Var112 = kx3Var7;
                                        dh2Var3 = iv4VarT2;
                                        qu3Var5 = qu3Var4;
                                        objT2 = objJ2;
                                        f05Var4 = f05Var3;
                                        qu3Var6 = qu3Var3;
                                        kx3Var7 = kx3Var112;
                                        ox0Var6 = ox0Var3;
                                        xy1Var13 = xy1Var11;
                                        xy1Var14 = xy1Var10;
                                        xy1Var15 = xy1Var9;
                                        xy1Var17 = xy1Var12;
                                        qy2Var2 = (qy2) objT2;
                                        if (yf2.p(qy2Var2, py2Var)) {
                                            xy1Var14.a(new wi3(qu3Var5.r));
                                            n25Var.m = ox0Var6;
                                            n25Var.q = kx3Var7;
                                            n25Var.w = dh2Var3;
                                            n25Var.c = xy1Var17;
                                            n25Var.i = xy1Var17;
                                            n25Var.b = xy1Var17;
                                            n25Var.s = xy1Var17;
                                            n25Var.p = xy1Var17;
                                            n25Var.u = xy1Var17;
                                            n25Var.h = 8;
                                            if (r(f05Var4, n25Var) != px0Var) {
                                                dh2Var5 = dh2Var3;
                                                ox0Var8 = ox0Var6;
                                                r14 = xy1Var17;
                                                x(ox0Var8, dh2Var5, new k25(kx3Var7, r14, (byte) 7));
                                                return og5Var;
                                            }
                                        } else {
                                            if (qy2Var2 instanceof oy2) {
                                                dh2Var4 = dh2Var3;
                                                obj = ((oy2) qy2Var2).g;
                                            } else {
                                                if (qy2Var2 instanceof ny2) {
                                                    up.y();
                                                    return null;
                                                }
                                                dh2Var4 = dh2Var3;
                                                obj = xy1Var17;
                                            }
                                            ox0Var7 = ox0Var6;
                                            r12 = obj;
                                            r13 = xy1Var17;
                                            if (r12 != 0) {
                                                r12.g();
                                                x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                xy1Var15.a(new wi3(r12.r));
                                                return og5Var;
                                            }
                                            x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                            if (xy1Var13 != null) {
                                                xy1Var13.a(new wi3(qu3Var6.r));
                                                return og5Var;
                                            }
                                        }
                                    }
                                }
                            } else if (xy1Var11 != null) {
                                xy1Var11.a(new wi3(qu3Var3.r));
                                return og5Var;
                            }
                        }
                        return px0Var;
                    }
                    if (xy1Var7 != null) {
                        xy1Var7.a(new wi3(qu3Var2.r));
                        return og5Var;
                    }
                }
                return og5Var;
            case 3:
                dh2Var = (dh2) n25Var.u;
                qu3Var = (qu3) n25Var.p;
                xy1Var5 = (xy1) n25Var.s;
                cz1Var2 = (cz1) n25Var.b;
                xy1Var3 = (xy1) n25Var.i;
                xy1Var4 = n25Var.c;
                kx3Var4 = (kx3) n25Var.w;
                ox0Var3 = (ox0) n25Var.q;
                f05Var2 = (f05) n25Var.m;
                js2.o(objT2);
                qy2Var = (qy2) objT2;
                if (!yf2.p(qy2Var, py2Var)) {
                    if (qy2Var instanceof oy2) {
                        qu3Var2 = ((oy2) qy2Var).g;
                    } else {
                        if (!(qy2Var instanceof ny2)) {
                            up.y();
                            return null;
                        }
                        qu3Var2 = null;
                    }
                    xy1Var7 = xy1Var5;
                    cz1Var3 = cz1Var2;
                    kx3Var5 = kx3Var4;
                    xy1Var8 = xy1Var4;
                    if (qu3Var2 == null) {
                        iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 3));
                    } else {
                        qu3Var2.g();
                        iv4VarX = x(ox0Var3, dh2Var, new k25(kx3Var5, null, (byte) 4));
                    }
                    if (qu3Var2 != null) {
                        if (xy1Var8 == null) {
                            n25Var.m = f05Var2;
                            n25Var.q = ox0Var3;
                            n25Var.w = kx3Var5;
                            n25Var.c = xy1Var8;
                            n25Var.i = xy1Var3;
                            n25Var.b = cz1Var3;
                            n25Var.s = xy1Var7;
                            n25Var.p = qu3Var2;
                            n25Var.u = iv4VarX;
                            n25Var.h = 5;
                            iv4Var = iv4VarX;
                            objA = f05Var2.a(f05Var2.x().y(), new oi4(qu3Var2, null), n25Var);
                            if (objA != px0Var) {
                                xy1Var9 = xy1Var8;
                                cz1Var4 = cz1Var3;
                                f05Var3 = f05Var2;
                                xy1Var10 = xy1Var3;
                                xy1Var11 = xy1Var7;
                                qu3Var3 = qu3Var2;
                                objT2 = objA;
                                dh2Var2 = iv4Var;
                                qu3Var4 = (qu3) objT2;
                                if (qu3Var4 != null) {
                                    mu0Var2 = null;
                                    iv4VarT2 = m50.T(ox0Var3, null, new b8(dh2Var2, kx3Var5, mu0Var2, (byte) 9), 1);
                                    if (cz1Var4 != md1Var) {
                                        kx3 kx3Var113 = kx3Var5;
                                        cz1 cz1Var11 = cz1Var4;
                                        kx3Var7 = kx3Var113;
                                        xy1Var12 = null;
                                        x(ox0Var3, iv4VarT2, new o25(cz1Var11, kx3Var113, qu3Var4, mu0Var2, (byte) 1));
                                    } else {
                                        xy1Var12 = null;
                                        kx3Var7 = kx3Var5;
                                    }
                                    if (xy1Var10 == null) {
                                        n25Var.m = ox0Var3;
                                        n25Var.q = kx3Var7;
                                        n25Var.w = xy1Var9;
                                        n25Var.c = xy1Var11;
                                        n25Var.i = iv4VarT2;
                                        n25Var.b = qu3Var3;
                                        n25Var.s = xy1Var12;
                                        n25Var.p = xy1Var12;
                                        n25Var.u = xy1Var12;
                                        n25Var.h = 6;
                                        objT2 = t(f05Var3, ku3Var, n25Var);
                                        if (objT2 != px0Var) {
                                            qu3 qu3Var14 = qu3Var3;
                                            dh2Var4 = iv4VarT2;
                                            qu3Var6 = qu3Var14;
                                            ox0Var7 = ox0Var3;
                                            xy1Var13 = xy1Var11;
                                            xy1Var15 = xy1Var9;
                                            xy1Var16 = xy1Var12;
                                            r12 = (qu3) objT2;
                                            r13 = xy1Var16;
                                            if (r12 != 0) {
                                                r12.g();
                                                x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                xy1Var15.a(new wi3(r12.r));
                                                return og5Var;
                                            }
                                            x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                            if (xy1Var13 != null) {
                                                xy1Var13.a(new wi3(qu3Var6.r));
                                                return og5Var;
                                            }
                                        }
                                    } else {
                                        n25Var.m = f05Var3;
                                        n25Var.q = ox0Var3;
                                        n25Var.w = kx3Var7;
                                        n25Var.c = xy1Var9;
                                        n25Var.i = xy1Var10;
                                        n25Var.b = xy1Var11;
                                        n25Var.s = iv4VarT2;
                                        n25Var.p = qu3Var3;
                                        n25Var.u = r25;
                                        n25Var.h = 7;
                                        objJ2 = j(f05Var3, ku3Var, n25Var);
                                        if (objJ2 != px0Var) {
                                            kx3 kx3Var114 = kx3Var7;
                                            dh2Var3 = iv4VarT2;
                                            qu3Var5 = qu3Var4;
                                            objT2 = objJ2;
                                            f05Var4 = f05Var3;
                                            qu3Var6 = qu3Var3;
                                            kx3Var7 = kx3Var114;
                                            ox0Var6 = ox0Var3;
                                            xy1Var13 = xy1Var11;
                                            xy1Var14 = xy1Var10;
                                            xy1Var15 = xy1Var9;
                                            xy1Var17 = xy1Var12;
                                            qy2Var2 = (qy2) objT2;
                                            if (yf2.p(qy2Var2, py2Var)) {
                                                xy1Var14.a(new wi3(qu3Var5.r));
                                                n25Var.m = ox0Var6;
                                                n25Var.q = kx3Var7;
                                                n25Var.w = dh2Var3;
                                                n25Var.c = xy1Var17;
                                                n25Var.i = xy1Var17;
                                                n25Var.b = xy1Var17;
                                                n25Var.s = xy1Var17;
                                                n25Var.p = xy1Var17;
                                                n25Var.u = xy1Var17;
                                                n25Var.h = 8;
                                                if (r(f05Var4, n25Var) != px0Var) {
                                                    dh2Var5 = dh2Var3;
                                                    ox0Var8 = ox0Var6;
                                                    r14 = xy1Var17;
                                                    x(ox0Var8, dh2Var5, new k25(kx3Var7, r14, (byte) 7));
                                                    return og5Var;
                                                }
                                            } else {
                                                if (qy2Var2 instanceof oy2) {
                                                    dh2Var4 = dh2Var3;
                                                    obj = ((oy2) qy2Var2).g;
                                                } else {
                                                    if (qy2Var2 instanceof ny2) {
                                                        up.y();
                                                        return null;
                                                    }
                                                    dh2Var4 = dh2Var3;
                                                    obj = xy1Var17;
                                                }
                                                ox0Var7 = ox0Var6;
                                                r12 = obj;
                                                r13 = xy1Var17;
                                                if (r12 != 0) {
                                                    r12.g();
                                                    x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                                    xy1Var15.a(new wi3(r12.r));
                                                    return og5Var;
                                                }
                                                x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                                if (xy1Var13 != null) {
                                                    xy1Var13.a(new wi3(qu3Var6.r));
                                                    return og5Var;
                                                }
                                            }
                                        }
                                    }
                                } else if (xy1Var11 != null) {
                                    xy1Var11.a(new wi3(qu3Var3.r));
                                    return og5Var;
                                }
                            }
                        } else if (xy1Var7 != null) {
                            xy1Var7.a(new wi3(qu3Var2.r));
                            return og5Var;
                        }
                    }
                    return og5Var;
                }
                xy1Var3.a(new wi3(qu3Var.r));
                n25Var.m = ox0Var3;
                n25Var.q = kx3Var4;
                n25Var.w = dh2Var;
                mu0Var = null;
                n25Var.c = null;
                n25Var.i = null;
                n25Var.b = null;
                n25Var.s = null;
                n25Var.p = null;
                n25Var.u = null;
                n25Var.h = 4;
                if (r(f05Var2, n25Var) != px0Var) {
                    kx3Var6 = kx3Var4;
                    ox0Var5 = ox0Var3;
                    x(ox0Var5, dh2Var, new k25(kx3Var6, mu0Var, (byte) 2));
                    return og5Var;
                }
                return px0Var;
            case 4:
                dh2Var = (dh2) n25Var.w;
                kx3Var6 = (kx3) n25Var.q;
                ox0Var5 = (ox0) n25Var.m;
                js2.o(objT2);
                mu0Var = null;
                x(ox0Var5, dh2Var, new k25(kx3Var6, mu0Var, (byte) 2));
                return og5Var;
            case 5:
                dh2Var2 = (dh2) n25Var.u;
                qu3Var3 = (qu3) n25Var.p;
                xy1 xy1Var21 = (xy1) n25Var.s;
                cz1Var4 = (cz1) n25Var.b;
                xy1 xy1Var22 = (xy1) n25Var.i;
                xy1 xy1Var23 = n25Var.c;
                kx3Var5 = (kx3) n25Var.w;
                ox0 ox0Var13 = (ox0) n25Var.q;
                f05 f05Var7 = (f05) n25Var.m;
                js2.o(objT2);
                xy1Var11 = xy1Var21;
                f05Var3 = f05Var7;
                xy1Var9 = xy1Var23;
                xy1Var10 = xy1Var22;
                ox0Var3 = ox0Var13;
                py2Var = py2Var;
                og5Var = og5Var;
                qu3Var4 = (qu3) objT2;
                if (qu3Var4 != null) {
                    mu0Var2 = null;
                    iv4VarT2 = m50.T(ox0Var3, null, new b8(dh2Var2, kx3Var5, mu0Var2, (byte) 9), 1);
                    if (cz1Var4 != md1Var) {
                        kx3 kx3Var115 = kx3Var5;
                        cz1 cz1Var12 = cz1Var4;
                        kx3Var7 = kx3Var115;
                        xy1Var12 = null;
                        x(ox0Var3, iv4VarT2, new o25(cz1Var12, kx3Var115, qu3Var4, mu0Var2, (byte) 1));
                    } else {
                        xy1Var12 = null;
                        kx3Var7 = kx3Var5;
                    }
                    if (xy1Var10 == null) {
                        n25Var.m = ox0Var3;
                        n25Var.q = kx3Var7;
                        n25Var.w = xy1Var9;
                        n25Var.c = xy1Var11;
                        n25Var.i = iv4VarT2;
                        n25Var.b = qu3Var3;
                        n25Var.s = xy1Var12;
                        n25Var.p = xy1Var12;
                        n25Var.u = xy1Var12;
                        n25Var.h = 6;
                        objT2 = t(f05Var3, ku3Var, n25Var);
                        if (objT2 != px0Var) {
                            qu3 qu3Var15 = qu3Var3;
                            dh2Var4 = iv4VarT2;
                            qu3Var6 = qu3Var15;
                            ox0Var7 = ox0Var3;
                            xy1Var13 = xy1Var11;
                            xy1Var15 = xy1Var9;
                            xy1Var16 = xy1Var12;
                            r12 = (qu3) objT2;
                            r13 = xy1Var16;
                            if (r12 != 0) {
                                r12.g();
                                x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                xy1Var15.a(new wi3(r12.r));
                                return og5Var;
                            }
                            x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                            if (xy1Var13 != null) {
                                xy1Var13.a(new wi3(qu3Var6.r));
                                return og5Var;
                            }
                        }
                    } else {
                        n25Var.m = f05Var3;
                        n25Var.q = ox0Var3;
                        n25Var.w = kx3Var7;
                        n25Var.c = xy1Var9;
                        n25Var.i = xy1Var10;
                        n25Var.b = xy1Var11;
                        n25Var.s = iv4VarT2;
                        n25Var.p = qu3Var3;
                        n25Var.u = r25;
                        n25Var.h = 7;
                        objJ2 = j(f05Var3, ku3Var, n25Var);
                        if (objJ2 != px0Var) {
                            kx3 kx3Var116 = kx3Var7;
                            dh2Var3 = iv4VarT2;
                            qu3Var5 = qu3Var4;
                            objT2 = objJ2;
                            f05Var4 = f05Var3;
                            qu3Var6 = qu3Var3;
                            kx3Var7 = kx3Var116;
                            ox0Var6 = ox0Var3;
                            xy1Var13 = xy1Var11;
                            xy1Var14 = xy1Var10;
                            xy1Var15 = xy1Var9;
                            xy1Var17 = xy1Var12;
                            qy2Var2 = (qy2) objT2;
                            if (yf2.p(qy2Var2, py2Var)) {
                                xy1Var14.a(new wi3(qu3Var5.r));
                                n25Var.m = ox0Var6;
                                n25Var.q = kx3Var7;
                                n25Var.w = dh2Var3;
                                n25Var.c = xy1Var17;
                                n25Var.i = xy1Var17;
                                n25Var.b = xy1Var17;
                                n25Var.s = xy1Var17;
                                n25Var.p = xy1Var17;
                                n25Var.u = xy1Var17;
                                n25Var.h = 8;
                                if (r(f05Var4, n25Var) != px0Var) {
                                    dh2Var5 = dh2Var3;
                                    ox0Var8 = ox0Var6;
                                    r14 = xy1Var17;
                                    x(ox0Var8, dh2Var5, new k25(kx3Var7, r14, (byte) 7));
                                    return og5Var;
                                }
                            } else {
                                if (qy2Var2 instanceof oy2) {
                                    dh2Var4 = dh2Var3;
                                    obj = ((oy2) qy2Var2).g;
                                } else {
                                    if (qy2Var2 instanceof ny2) {
                                        up.y();
                                        return null;
                                    }
                                    dh2Var4 = dh2Var3;
                                    obj = xy1Var17;
                                }
                                ox0Var7 = ox0Var6;
                                r12 = obj;
                                r13 = xy1Var17;
                                if (r12 != 0) {
                                    r12.g();
                                    x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                                    xy1Var15.a(new wi3(r12.r));
                                    return og5Var;
                                }
                                x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                                if (xy1Var13 != null) {
                                    xy1Var13.a(new wi3(qu3Var6.r));
                                    return og5Var;
                                }
                            }
                        }
                    }
                    return px0Var;
                }
                if (xy1Var11 != null) {
                    xy1Var11.a(new wi3(qu3Var3.r));
                    return og5Var;
                }
                return og5Var;
            case 6:
                qu3Var6 = (qu3) n25Var.b;
                dh2Var4 = (dh2) n25Var.i;
                xy1Var13 = n25Var.c;
                xy1Var15 = (xy1) n25Var.w;
                kx3Var7 = (kx3) n25Var.q;
                ox0Var7 = (ox0) n25Var.m;
                js2.o(objT2);
                og5Var = og5Var;
                xy1Var16 = null;
                r12 = (qu3) objT2;
                r13 = xy1Var16;
                if (r12 != 0) {
                    r12.g();
                    x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                    xy1Var15.a(new wi3(r12.r));
                    return og5Var;
                }
                x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                if (xy1Var13 != null) {
                    xy1Var13.a(new wi3(qu3Var6.r));
                    return og5Var;
                }
                return og5Var;
            case 7:
                qu3Var5 = (qu3) n25Var.u;
                qu3 qu3Var16 = (qu3) n25Var.p;
                dh2Var3 = (dh2) n25Var.s;
                xy1Var13 = (xy1) n25Var.b;
                xy1Var14 = (xy1) n25Var.i;
                xy1Var15 = n25Var.c;
                kx3 kx3Var20 = (kx3) n25Var.w;
                ox0Var6 = (ox0) n25Var.q;
                f05 f05Var8 = (f05) n25Var.m;
                js2.o(objT2);
                f05Var4 = f05Var8;
                py2Var = py2Var;
                og5Var = og5Var;
                xy1Var17 = null;
                qu3Var6 = qu3Var16;
                kx3Var7 = kx3Var20;
                qy2Var2 = (qy2) objT2;
                if (yf2.p(qy2Var2, py2Var)) {
                    xy1Var14.a(new wi3(qu3Var5.r));
                    n25Var.m = ox0Var6;
                    n25Var.q = kx3Var7;
                    n25Var.w = dh2Var3;
                    n25Var.c = xy1Var17;
                    n25Var.i = xy1Var17;
                    n25Var.b = xy1Var17;
                    n25Var.s = xy1Var17;
                    n25Var.p = xy1Var17;
                    n25Var.u = xy1Var17;
                    n25Var.h = 8;
                    if (r(f05Var4, n25Var) != px0Var) {
                        dh2Var5 = dh2Var3;
                        ox0Var8 = ox0Var6;
                        r14 = xy1Var17;
                        x(ox0Var8, dh2Var5, new k25(kx3Var7, r14, (byte) 7));
                        return og5Var;
                    }
                    return px0Var;
                }
                if (qy2Var2 instanceof oy2) {
                    dh2Var4 = dh2Var3;
                    obj = ((oy2) qy2Var2).g;
                } else {
                    if (qy2Var2 instanceof ny2) {
                        up.y();
                        return null;
                    }
                    dh2Var4 = dh2Var3;
                    obj = xy1Var17;
                }
                ox0Var7 = ox0Var6;
                r12 = obj;
                r13 = xy1Var17;
                if (r12 != 0) {
                    r12.g();
                    x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 5));
                    xy1Var15.a(new wi3(r12.r));
                    return og5Var;
                }
                x(ox0Var7, dh2Var4, new k25(kx3Var7, r13, (byte) 6));
                if (xy1Var13 != null) {
                    xy1Var13.a(new wi3(qu3Var6.r));
                    return og5Var;
                }
                return og5Var;
            case 8:
                dh2Var5 = (dh2) n25Var.w;
                kx3Var7 = (kx3) n25Var.q;
                ox0Var8 = (ox0) n25Var.m;
                js2.o(objT2);
                og5Var = og5Var;
                r14 = 0;
                x(ox0Var8, dh2Var5, new k25(kx3Var7, r14, (byte) 7));
                return og5Var;
            default:
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public static Object n(vu3 vu3Var, cz1 cz1Var, xy1 xy1Var, mu0 mu0Var, int i) {
        if ((i & 4) != 0) {
            cz1Var = g;
        }
        Object objB = k33.B(new s3((Object) vu3Var, (Object) cz1Var, (Object) ((i & 8) != 0 ? null : xy1Var), (mu0) null, (byte) 19), mu0Var);
        return objB == px0.j ? objB : og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[LOOP:1: B:22:0x005e->B:26:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object r(defpackage.f05 r7, defpackage.ou0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.j25
            if (r0 == 0) goto L13
            r0 = r8
            j25 r0 = (defpackage.j25) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            j25 r0 = new j25
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.q
            int r1 = r0.w
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            f05 r7 = r0.m
            defpackage.js2.o(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.js2.o(r8)
        L31:
            r0.m = r7
            r0.w = r2
            ku3 r8 = defpackage.ku3.t
            java.lang.Object r8 = r7.g(r8, r0)
            px0 r1 = defpackage.px0.j
            if (r8 != r1) goto L40
            return r1
        L40:
            ju3 r8 = (defpackage.ju3) r8
            java.util.List r1 = r8.g
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            qu3 r6 = (defpackage.qu3) r6
            r6.g()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List r8 = r8.g
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            qu3 r3 = (defpackage.qu3) r3
            boolean r3 = r3.n
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            og5 r7 = defpackage.og5.g
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r25.r(f05, ou0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[LOOP:1: B:23:0x006e->B:44:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object t(defpackage.f05 r17, defpackage.ku3 r18, defpackage.ix r19) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r25.t(f05, ku3, ix):java.lang.Object");
    }

    public static boolean v(ju3 ju3Var, boolean z) {
        List list = ju3Var.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qu3 qu3Var = (qu3) list.get(i);
            if (!(z ? fd6.g(qu3Var) : fd6.y(qu3Var))) {
                return false;
            }
        }
        return true;
    }

    public static iv4 x(ox0 ox0Var, dh2 dh2Var, bz1 bz1Var) {
        return m50.T(ox0Var, null, new rz(dh2Var, bz1Var, null, (byte) 4), 1);
    }

    public static /* synthetic */ Object y(f05 f05Var, ix ixVar, int i) {
        return g(f05Var, (i & 1) != 0, (i & 2) != 0 ? ku3.t : ku3.j, ixVar);
    }
}
