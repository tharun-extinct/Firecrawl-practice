package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b10 extends zz4 implements bz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ w10 i;
    public long q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b10(w10 w10Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = w10Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        b10 b10Var = new b10(this.i, mu0Var);
        b10Var.c = obj;
        return b10Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((b10) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e A[PHI: r9 r14
  0x003e: PHI (r9v1 long) = (r9v2 long), (r9v6 long) binds: [B:15:0x003b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r14v1 java.lang.Object) = (r14v7 java.lang.Object), (r14v0 java.lang.Object) binds: [B:15:0x003b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r14 == r8) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0057 -> B:23:0x005a). Please report as a decompilation issue!!! */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = r13.c
            ox0 r0 = (defpackage.ox0) r0
            byte r1 = r13.w
            r2 = 0
            w10 r3 = r13.i
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 2
            r7 = 1
            px0 r8 = defpackage.px0.j
            if (r1 == 0) goto L27
            if (r1 == r7) goto L21
            if (r1 != r6) goto L1b
            long r9 = r13.q
            defpackage.js2.o(r14)
            goto L5a
        L1b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r13)
            return r2
        L21:
            long r9 = r13.q
            defpackage.js2.o(r14)
            goto L3e
        L27:
            defpackage.js2.o(r14)
        L2a:
            r9 = r4
        L2b:
            boolean r14 = defpackage.k33.M(r0)
            if (r14 == 0) goto L68
            r13.c = r0
            r13.q = r9
            r13.w = r7
            java.lang.Object r14 = r3.A(r13)
            if (r14 != r8) goto L3e
            goto L59
        L3e:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L47
            goto L68
        L47:
            a10 r14 = new a10
            r1 = 0
            r14.<init>(r3, r2, r1)
            r13.c = r0
            r13.q = r9
            r13.w = r6
            java.lang.Object r14 = defpackage.br2.E(r9, r14, r13)
            if (r14 != r8) goto L5a
        L59:
            return r8
        L5a:
            if (r14 == 0) goto L5d
            goto L2a
        L5d:
            r11 = 2
            long r9 = r9 * r11
            r11 = 900000(0xdbba0, double:4.44659E-318)
            long r9 = java.lang.Math.min(r9, r11)
            goto L2b
        L68:
            og5 r13 = defpackage.og5.g
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b10.u(java.lang.Object):java.lang.Object");
    }
}
