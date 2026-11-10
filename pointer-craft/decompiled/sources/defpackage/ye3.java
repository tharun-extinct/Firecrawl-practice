package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ye3 extends zz4 implements bz1 {
    public final /* synthetic */ we1 b;
    public final /* synthetic */ te1 c;
    public final /* synthetic */ ox0 i;
    public final /* synthetic */ r54 p;
    public byte q;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ r54 u;
    public /* synthetic */ Object w;
    public final /* synthetic */ r54 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye3(te1 te1Var, ox0 ox0Var, we1 we1Var, boolean z, r54 r54Var, r54 r54Var2, r54 r54Var3, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = te1Var;
        this.i = ox0Var;
        this.b = we1Var;
        this.s = z;
        this.p = r54Var;
        this.u = r54Var2;
        this.z = r54Var3;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        ye3 ye3Var = new ye3(this.c, this.i, this.b, this.s, this.p, this.u, this.z, mu0Var);
        ye3Var.w = obj;
        return ye3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((ye3) b((mu0) obj2, (er1) obj)).u(og5.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r8.y(r18) == r11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r8.y(r18) == r11) goto L40;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r1 = r18
            byte r0 = r1.q
            r2 = 23
            ox0 r3 = r1.i
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            we1 r8 = r1.b
            r9 = 0
            te1 r10 = r1.c
            px0 r11 = defpackage.px0.j
            if (r0 == 0) goto L36
            if (r0 == r7) goto L30
            if (r0 == r6) goto L2c
            if (r0 == r5) goto L2c
            if (r0 == r4) goto L23
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r0)
            return r9
        L23:
            java.lang.Object r0 = r1.w
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.js2.o(r19)
            goto Lb7
        L2c:
            defpackage.js2.o(r19)
            goto L9a
        L30:
            defpackage.js2.o(r19)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            goto L59
        L34:
            r0 = move-exception
            goto L9d
        L36:
            defpackage.js2.o(r19)
            java.lang.Object r0 = r1.w
            er1 r0 = (defpackage.er1) r0
            xe3 r12 = new xe3     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            te1 r13 = r1.c     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            boolean r14 = r1.s     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            r54 r15 = r1.p     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            r54 r4 = r1.u     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            r54 r6 = r1.z     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            r16 = r4
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            r1.q = r7     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            java.lang.Object r0 = r0.r(r12, r1)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            if (r0 != r11) goto L59
            goto Lb6
        L59:
            boolean r0 = r10.g()
            if (r0 == 0) goto L67
            dy r0 = new dy
            r0.<init>(r10, r9, r2)
            defpackage.m50.T(r3, r9, r0, r5)
        L67:
            r0 = 2
            r1.q = r0
            java.lang.Object r0 = r8.y(r1)
            if (r0 != r11) goto L9a
            goto Lb6
        L71:
            tp3 r0 = r10.g     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L34
            r0.setValue(r4)     // Catch: java.lang.Throwable -> L34
            pp3 r0 = r10.y     // Catch: java.lang.Throwable -> L34
            r4 = 0
            r0.e(r4)     // Catch: java.lang.Throwable -> L34
            pp3 r0 = r10.r     // Catch: java.lang.Throwable -> L34
            r0.e(r4)     // Catch: java.lang.Throwable -> L34
            boolean r0 = r10.g()
            if (r0 == 0) goto L91
            dy r0 = new dy
            r0.<init>(r10, r9, r2)
            defpackage.m50.T(r3, r9, r0, r5)
        L91:
            r1.q = r5
            java.lang.Object r0 = r8.y(r1)
            if (r0 != r11) goto L9a
            goto Lb6
        L9a:
            og5 r0 = defpackage.og5.g
            return r0
        L9d:
            boolean r4 = r10.g()
            if (r4 == 0) goto Lab
            dy r4 = new dy
            r4.<init>(r10, r9, r2)
            defpackage.m50.T(r3, r9, r4, r5)
        Lab:
            r1.w = r0
            r2 = 4
            r1.q = r2
            java.lang.Object r1 = r8.y(r1)
            if (r1 != r11) goto Lb7
        Lb6:
            return r11
        Lb7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye3.u(java.lang.Object):java.lang.Object");
    }
}
