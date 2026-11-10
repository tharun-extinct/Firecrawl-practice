package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xo3 implements gg4 {
    public final ob3 A;
    public final tp3 B;
    public final tp3 C;
    public final tp3 D;
    public final tp3 E;
    public float a;
    public final ja3 b;
    public j51 c;
    public final mr2 d;
    public final ob3 e;
    public final tp3 f;
    public boolean g;
    public final y22 h;
    public int i;
    public long j;
    public final ps2 k;
    public long l;
    public final b31 m;
    public final oo3 n;
    public final ov o;
    public final qp3 p;
    public final boolean q;
    public final tp3 r;
    public final qp3 s;
    public float t;
    public final pr2 u;
    public int v;
    public final tp3 w;
    public int x;
    public mo3 y;
    public final fo3 z;

    public xo3(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            pc2.g("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.r = kq2.M(new wi3(0L));
        this.n = new oo3(i, f, this);
        this.v = i;
        this.l = Long.MAX_VALUE;
        final byte b = 0;
        this.m = new b31(new xy1(this) { // from class: so3
            public final /* synthetic */ xo3 t;

            {
                this.t = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.xy1
            public final Object a(Object obj) {
                mo3 mo3Var;
                byte b2 = b;
                og5 og5Var = og5.g;
                mo3 mo3Var2 = null;
                xo3 xo3Var = this.t;
                switch (b2) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jX = hc6.x(xo3Var);
                        float f2 = xo3Var.t + fFloatValue;
                        long jA0 = k33.a0(f2);
                        xo3Var.t = f2 - jA0;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jX + jA0;
                            long jC = xs2.c(j, xo3Var.j, xo3Var.l);
                            ?? r0 = j != jC;
                            long j2 = jC - jX;
                            float f3 = j2;
                            xo3Var.a = f3;
                            if (Math.abs(j2) != 0) {
                                xo3Var.D.setValue(Boolean.valueOf(f3 > 0.0f));
                                xo3Var.E.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i2 = (int) j2;
                            int i3 = -i2;
                            mo3 mo3VarJ = ((mo3) xo3Var.w.getValue()).j(i3);
                            if (mo3VarJ == null || (mo3Var = xo3Var.y) == null) {
                                mo3Var2 = mo3VarJ;
                            } else {
                                mo3 mo3VarJ2 = mo3Var.j(i3);
                                if (mo3VarJ2 != null) {
                                    xo3Var.y = mo3VarJ2;
                                    mo3Var2 = mo3VarJ;
                                }
                            }
                            if (mo3Var2 != null) {
                                xo3Var.j(mo3Var2, xo3Var.g, true);
                                xo3Var.e.setValue(og5Var);
                            } else {
                                oo3 oo3Var = xo3Var.n;
                                xo3 xo3Var2 = (xo3) oo3Var.y;
                                pp3 pp3Var = (pp3) oo3Var.n;
                                pp3Var.e(pp3Var.d() + (xo3Var2.i() != 0 ? i2 / xo3Var2.i() : 0.0f));
                                um2 um2Var = (um2) xo3Var.f.getValue();
                                if (um2Var != null) {
                                    um2Var.q();
                                }
                            }
                            if (r0 != false) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        nr2 nr2Var = (nr2) obj;
                        at4 at4VarM = js2.m();
                        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
                        at4 at4VarB = js2.b(at4VarM);
                        try {
                            nr2Var.y(xo3Var.v);
                            return og5Var;
                        } finally {
                            js2.z(at4VarM, at4VarB, xy1VarV);
                        }
                }
            }
        });
        final byte b2 = 1;
        this.q = true;
        this.w = new tp3(zo3.y, hi0.B);
        this.c = zo3.g;
        this.b = new ja3();
        this.s = new qp3(-1);
        this.p = new qp3(i);
        pt4.r(new to3(this, b));
        pt4.r(new to3(this, b2));
        pr2 pr2Var = new pr2(new xy1(this) { // from class: so3
            public final /* synthetic */ xo3 t;

            {
                this.t = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.xy1
            public final Object a(Object obj) {
                mo3 mo3Var;
                byte b3 = b2;
                og5 og5Var = og5.g;
                mo3 mo3Var2 = null;
                xo3 xo3Var = this.t;
                switch (b3) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jX = hc6.x(xo3Var);
                        float f2 = xo3Var.t + fFloatValue;
                        long jA0 = k33.a0(f2);
                        xo3Var.t = f2 - jA0;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jX + jA0;
                            long jC = xs2.c(j, xo3Var.j, xo3Var.l);
                            ?? r0 = j != jC;
                            long j2 = jC - jX;
                            float f3 = j2;
                            xo3Var.a = f3;
                            if (Math.abs(j2) != 0) {
                                xo3Var.D.setValue(Boolean.valueOf(f3 > 0.0f));
                                xo3Var.E.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i2 = (int) j2;
                            int i3 = -i2;
                            mo3 mo3VarJ = ((mo3) xo3Var.w.getValue()).j(i3);
                            if (mo3VarJ == null || (mo3Var = xo3Var.y) == null) {
                                mo3Var2 = mo3VarJ;
                            } else {
                                mo3 mo3VarJ2 = mo3Var.j(i3);
                                if (mo3VarJ2 != null) {
                                    xo3Var.y = mo3VarJ2;
                                    mo3Var2 = mo3VarJ;
                                }
                            }
                            if (mo3Var2 != null) {
                                xo3Var.j(mo3Var2, xo3Var.g, true);
                                xo3Var.e.setValue(og5Var);
                            } else {
                                oo3 oo3Var = xo3Var.n;
                                xo3 xo3Var2 = (xo3) oo3Var.y;
                                pp3 pp3Var = (pp3) oo3Var.n;
                                pp3Var.e(pp3Var.d() + (xo3Var2.i() != 0 ? i2 / xo3Var2.i() : 0.0f));
                                um2 um2Var = (um2) xo3Var.f.getValue();
                                if (um2Var != null) {
                                    um2Var.q();
                                }
                            }
                            if (r0 != false) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        nr2 nr2Var = (nr2) obj;
                        at4 at4VarM = js2.m();
                        xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
                        at4 at4VarB = js2.b(at4VarM);
                        try {
                            nr2Var.y(xo3Var.v);
                            return og5Var;
                        } finally {
                            js2.z(at4VarM, at4VarB, xy1VarV);
                        }
                }
            }
        });
        this.u = pr2Var;
        this.z = new fo3(new q64((Object) this, (byte) 27), pr2Var, new to3(this, (byte) 2));
        this.h = new y22((byte) 21);
        this.o = new ov();
        this.f = kq2.M(null);
        this.k = new ps2(this, (byte) 1);
        zs0.y(0, 0, 0, 0, 15);
        this.d = new mr2();
        this.e = kq2.z();
        this.A = kq2.z();
        Boolean bool = Boolean.FALSE;
        this.B = kq2.M(bool);
        this.C = kq2.M(bool);
        this.D = kq2.M(bool);
        this.E = kq2.M(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9.n(r7, r8, r0) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object p(defpackage.xo3 r6, defpackage.ub3 r7, defpackage.bz1 r8, defpackage.ou0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.wo3
            if (r0 == 0) goto L13
            r0 = r9
            wo3 r0 = (defpackage.wo3) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wo3 r0 = new wo3
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.b
            r2 = 0
            r3 = 2
            r4 = 1
            px0 r5 = defpackage.px0.j
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            xo3 r6 = r0.m
            defpackage.js2.o(r9)
            goto L77
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r6)
            return r2
        L33:
            zz4 r6 = r0.w
            r8 = r6
            bz1 r8 = (defpackage.bz1) r8
            ub3 r7 = r0.q
            xo3 r6 = r0.m
            defpackage.js2.o(r9)
            goto L55
        L40:
            defpackage.js2.o(r9)
            r0.m = r6
            r0.q = r7
            r9 = r8
            zz4 r9 = (defpackage.zz4) r9
            r0.w = r9
            r0.b = r4
            java.lang.Object r9 = r6.t(r0)
            if (r9 != r5) goto L55
            goto L76
        L55:
            b31 r9 = r6.m
            boolean r9 = r9.y()
            if (r9 != 0) goto L66
            int r9 = r6.m()
            qp3 r1 = r6.p
            r1.e(r9)
        L66:
            b31 r9 = r6.m
            r0.m = r6
            r0.q = r2
            r0.w = r2
            r0.b = r3
            java.lang.Object r7 = r9.n(r7, r8, r0)
            if (r7 != r5) goto L77
        L76:
            return r5
        L77:
            r7 = -1
            qp3 r6 = r6.s
            r6.e(r7)
            og5 r6 = defpackage.og5.g
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo3.p(xo3, ub3, bz1, ou0):java.lang.Object");
    }

    public final int a(int i) {
        if (w() > 0) {
            return xs2.w(i, 0, w() - 1);
        }
        return 0;
    }

    public final long b() {
        return ((wi3) this.r.getValue()).g;
    }

    public final int c() {
        return ((mo3) this.w.getValue()).y;
    }

    @Override // defpackage.gg4
    public final boolean g() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    public final int i() {
        return ((mo3) this.w.getValue()).r + c();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:133:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:145:0x0304 A[Catch: all -> 0x0340, TryCatch #0 {all -> 0x0340, blocks: (B:137:0x02e2, B:140:0x02eb, B:143:0x02f8, B:145:0x0304, B:153:0x033a, B:151:0x0334, B:148:0x031c), top: B:169:0x02e2 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x031b  */
    /* JADX WARN: Code duplicated, block: B:148:0x031c A[Catch: all -> 0x0340, TryCatch #0 {all -> 0x0340, blocks: (B:137:0x02e2, B:140:0x02eb, B:143:0x02f8, B:145:0x0304, B:153:0x033a, B:151:0x0334, B:148:0x031c), top: B:169:0x02e2 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0333  */
    /* JADX WARN: Code duplicated, block: B:151:0x0334 A[Catch: all -> 0x0340, TryCatch #0 {all -> 0x0340, blocks: (B:137:0x02e2, B:140:0x02eb, B:143:0x02f8, B:145:0x0304, B:153:0x033a, B:151:0x0334, B:148:0x031c), top: B:169:0x02e2 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0355  */
    /* JADX WARN: Code duplicated, block: B:161:0x035c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0372  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j(mo3 mo3Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        float f;
        int i;
        Object obj;
        boolean z7;
        ?? r2;
        ?? r10;
        ?? r7;
        float f2;
        long jT;
        long jW;
        long j;
        int i2;
        List list = mo3Var.g;
        int i3 = mo3Var.q;
        w33 w33Var = mo3Var.t;
        w33 w33Var2 = mo3Var.a;
        float f3 = mo3Var.m;
        this.u.v = list.size();
        this.i = mo3Var.y + mo3Var.r;
        if (!z && this.g) {
            this.y = mo3Var;
            return;
        }
        boolean z8 = true;
        if (z) {
            this.g = true;
        }
        fo3 fo3Var = this.z;
        boolean z9 = this.q;
        oo3 oo3Var = this.n;
        if (!z2) {
            oo3Var.getClass();
            oo3Var.v = w33Var2 != null ? w33Var2.n : null;
            if (oo3Var.g || !list.isEmpty()) {
                oo3Var.g = true;
                int i4 = w33Var2 != null ? w33Var2.g : 0;
                ((qp3) oo3Var.r).e(i4);
                ((er2) oo3Var.x).g(i4);
                ((pp3) oo3Var.n).e(f3);
            }
            if (z9) {
                z3 = z9;
                ro roVar = fo3Var.i;
                ha3 ha3Var = fo3Var.v;
                roVar.a = mo3Var;
                roVar.m = fo3Var.c;
                q64 q64Var = fo3Var.g;
                int i5 = fo3Var.l;
                float f4 = 0.0f;
                int i6 = -1;
                if (i5 != -1 && i5 != roVar.I()) {
                    fo3Var.q = true;
                    if (roVar.e()) {
                        int i7 = fo3Var.j;
                        if (i7 < 0) {
                            i7 = 0;
                        }
                        fo3Var.j = i7;
                        int I = roVar.D().g.isEmpty() ? -1 : roVar.I() - 1;
                        if (I != -1) {
                            int i8 = fo3Var.t;
                            if (i8 <= I) {
                                I = i8;
                            }
                            fo3Var.t = I;
                        }
                        if (fo3Var.x <= 0.0f) {
                            fo3Var.v(roVar.B(), fo3Var.w - 1);
                        } else {
                            fo3Var.v(0, roVar.f());
                        }
                    }
                }
                fo3Var.w = roVar.I();
                if (roVar.e()) {
                    int size = roVar.D().p.size() + roVar.D().g.size() + roVar.D().s.size();
                    int i9 = 0;
                    while (i9 < size) {
                        int size2 = roVar.D().s.size();
                        int size3 = roVar.D().g.size();
                        if (i9 < size2) {
                            i = ((w33) roVar.D().s.get(i9)).g;
                            f = f4;
                        } else {
                            f = f4;
                            i = (i9 < size2 || i9 >= size2 + size3) ? i9 >= size2 + size3 ? ((w33) roVar.D().p.get((i9 - size2) - size3)).g : i6 : ((w33) roVar.D().g.get(i9 - size2)).g;
                        }
                        int size4 = roVar.D().s.size();
                        int size5 = roVar.D().g.size();
                        if (i9 < size4) {
                            obj = ((w33) roVar.D().s.get(i9)).n;
                        } else if (i9 < size4 || i9 >= size4 + size5) {
                            obj = i9 >= size4 + size5 ? ((w33) roVar.D().p.get((i9 - size4) - size5)).n : ma0.r;
                        } else {
                            obj = ((w33) roVar.D().g.get(i9 - size4)).n;
                        }
                        int i10 = roVar.D().y;
                        if (i != i6) {
                            if (ha3Var.g(i)) {
                                Object objY = ha3Var.y(i);
                                objY.getClass();
                                int i11 = ((ma0) objY).y;
                                Object objY2 = ha3Var.y(i);
                                objY2.getClass();
                                Object obj2 = ((ma0) objY2).g;
                                if (i11 == i10 && yf2.p(obj2, obj)) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                    fo3Var.q = true;
                                }
                            } else {
                                z7 = true;
                            }
                            ma0 ma0Var = (ma0) ha3Var.y(i);
                            if (ma0Var != null) {
                                ma0Var.y = i10;
                                ma0Var.g = obj;
                            } else {
                                ma0Var = new ma0();
                                ma0Var.g = obj;
                                ma0Var.y = i10;
                            }
                            ha3Var.t(i, ma0Var);
                            fo3Var.j = Math.min(fo3Var.j, i);
                            fo3Var.t = Math.max(fo3Var.t, i);
                            List list2 = (List) fo3Var.y.l(i);
                            if (list2 != null) {
                                int size6 = list2.size();
                                for (int i12 = 0; i12 < size6; i12++) {
                                    ((or2) list2.get(i12)).cancel();
                                }
                            }
                        } else {
                            z7 = true;
                        }
                        i9++;
                        f4 = f;
                        z8 = z7;
                        i6 = -1;
                    }
                    z4 = z8;
                    float f5 = f4;
                    if (fo3Var.q) {
                        boolean z10 = fo3Var.x <= f5 ? z4 : false;
                        if (roVar.e()) {
                            gc6.g(roVar.D());
                            z6 = false;
                            fo3Var.r(roVar, roVar.f(), roVar.B(), roVar.D().z != null ? ((xo3) q64Var.t).i : 0, roVar.E(), roVar.F(), 0.0f, z10);
                        } else {
                            z6 = false;
                        }
                        fo3Var.q = z6;
                        z5 = z6;
                    } else {
                        z3 = z3;
                        z4 = z4;
                        z5 = false;
                    }
                } else {
                    z3 = z3;
                    z4 = true;
                    z5 = false;
                    fo3Var.x();
                }
                fo3Var.l = roVar.I();
                r2 = z5;
            }
            this.w.setValue(mo3Var);
            this.B.setValue(Boolean.valueOf(mo3Var.w));
            if (w33Var != null) {
                i2 = w33Var.g;
            } else {
                r10 = r2;
            }
            if (r10 == 0 || i3 != 0) {
                r10 = i2;
                r7 = z4;
            } else {
                r7 = r2;
            }
            this.C.setValue(Boolean.valueOf((boolean) r7));
            if (w33Var != null) {
                this.v = w33Var.g;
            }
            this.x = i3;
            at4 at4VarM = js2.m();
            xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
            at4 at4VarB = js2.b(at4VarM);
            if (z3) {
                try {
                    if (mo3Var.j < w() && Math.abs(this.a) > 0.5f) {
                        f2 = this.a;
                        if (q().v == um3.j) {
                            if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (b() & 4294967295L)))) {
                                if (s()) {
                                }
                            }
                        } else if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (b() >> 32)))) {
                            if (s()) {
                            }
                        }
                        fo3Var.n(this.a, mo3Var);
                    }
                } catch (Throwable th) {
                    js2.z(at4VarM, at4VarB, xy1VarV);
                    throw th;
                }
            }
            js2.z(at4VarM, at4VarB, xy1VarV);
            this.l = zo3.g(mo3Var, w());
            w();
            if (mo3Var.v == um3.t) {
                jT = mo3Var.t() >> 32;
            } else {
                jT = mo3Var.t() & 4294967295L;
            }
            int i13 = (int) jT;
            mo3Var.c.getClass();
            jW = xs2.w(r2, r2, i13);
            j = this.l;
            if (jW > j) {
                jW = j;
            }
            this.j = jW;
        }
        ((pp3) oo3Var.n).e(f3);
        z4 = true;
        z3 = z9;
        r2 = 0;
        this.w.setValue(mo3Var);
        this.B.setValue(Boolean.valueOf(mo3Var.w));
        if (w33Var != null) {
            i2 = w33Var.g;
        } else {
            r10 = r2;
        }
        if (r10 == 0) {
            r10 = i2;
            r7 = z4;
        } else {
            r10 = i2;
            r7 = z4;
        }
        this.C.setValue(Boolean.valueOf((boolean) r7));
        if (w33Var != null) {
            this.v = w33Var.g;
        }
        this.x = i3;
        at4 at4VarM2 = js2.m();
        xy1 xy1VarV2 = at4VarM2 != null ? at4VarM2.v() : null;
        at4 at4VarB2 = js2.b(at4VarM2);
        if (z3) {
            if (mo3Var.j < w()) {
                f2 = this.a;
                if (q().v == um3.j) {
                    if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (b() & 4294967295L)))) {
                        if (s()) {
                        }
                    }
                } else if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (b() >> 32)))) {
                    if (s()) {
                    }
                }
                fo3Var.n(this.a, mo3Var);
            }
        }
        js2.z(at4VarM2, at4VarB2, xy1VarV2);
        this.l = zo3.g(mo3Var, w());
        w();
        if (mo3Var.v == um3.t) {
            jT = mo3Var.t() >> 32;
        } else {
            jT = mo3Var.t() & 4294967295L;
        }
        int i14 = (int) jT;
        mo3Var.c.getClass();
        jW = xs2.w(r2, r2, i14);
        j = this.l;
        if (jW > j) {
            jW = j;
        }
        this.j = jW;
    }

    public final int m() {
        return ((qp3) this.n.r).d();
    }

    @Override // defpackage.gg4
    public final Object n(ub3 ub3Var, bz1 bz1Var, ou0 ou0Var) {
        return p(this, ub3Var, bz1Var, ou0Var);
    }

    public final mo3 q() {
        return (mo3) this.w.getValue();
    }

    @Override // defpackage.gg4
    public final boolean r() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    public final boolean s() {
        return ((int) Float.intBitsToFloat((int) (b() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (b() & 4294967295L))) == 0;
    }

    public final Object t(ou0 ou0Var) {
        Object objT;
        return (this.w.getValue() == zo3.y && (objT = this.o.t(ou0Var)) == px0.j) ? objT : og5.g;
    }

    public final void u(int i, float f, boolean z) {
        oo3 oo3Var = this.n;
        qp3 qp3Var = (qp3) oo3Var.r;
        pp3 pp3Var = (pp3) oo3Var.n;
        if (qp3Var.d() != i || pp3Var.d() != f) {
            this.z.x();
        }
        ((qp3) oo3Var.r).e(i);
        ((er2) oo3Var.x).g(i);
        pp3Var.e(f);
        oo3Var.v = null;
        if (!z) {
            this.A.setValue(og5.g);
            return;
        }
        um2 um2Var = (um2) this.f.getValue();
        if (um2Var != null) {
            um2Var.q();
        }
    }

    @Override // defpackage.gg4
    public final float v(float f) {
        return this.m.v(f);
    }

    public abstract int w();

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object x(int i, zu4 zu4Var, ou0 ou0Var) {
        uo3 uo3Var;
        int i2;
        zu4 zu4Var2;
        if (ou0Var instanceof uo3) {
            uo3Var = (uo3) ou0Var;
            int i3 = uo3Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uo3Var.i = i3 - Integer.MIN_VALUE;
            } else {
                uo3Var = new uo3(this, ou0Var);
            }
        } else {
            uo3Var = new uo3(this, ou0Var);
        }
        uo3 uo3Var2 = uo3Var;
        Object obj = uo3Var2.w;
        int i4 = uo3Var2.i;
        og5 og5Var = og5.g;
        Object obj2 = px0.j;
        if (i4 == 0) {
            js2.o(obj);
            if ((i != m() || ((pp3) this.n.n).d() != 0.0f) && w() != 0) {
                uo3Var2.q = zu4Var;
                uo3Var2.m = i;
                uo3Var2.i = 1;
                if (t(uo3Var2) != obj2) {
                    i2 = i;
                    zu4Var2 = zu4Var;
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                js2.o(obj);
                return og5Var;
            }
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = uo3Var2.m;
        zu4 zu4Var3 = uo3Var2.q;
        js2.o(obj);
        zu4Var2 = zu4Var3;
        bz1 vo3Var = new vo3(this, a(i2), i() * 0.0f, zu4Var2, null);
        uo3Var2.q = null;
        uo3Var2.i = 2;
        return n(ub3.j, vo3Var, uo3Var2) == obj2 ? obj2 : og5Var;
    }

    @Override // defpackage.gg4
    public final boolean y() {
        return this.m.y();
    }
}
