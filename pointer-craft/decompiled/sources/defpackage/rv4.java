package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rv4 extends zz4 implements cz1 {
    public /* synthetic */ int c;
    public final /* synthetic */ sv4 i;
    public byte q;
    public /* synthetic */ gr1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv4(sv4 sv4Var, mu0 mu0Var) {
        super(3, mu0Var);
        this.i = sv4Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r4.c(defpackage.qo4.j, r16) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r4.c(defpackage.qo4.a, r16) == r13) goto L34;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            sv4 r1 = r0.i
            long r2 = r1.t
            gr1 r4 = r0.w
            int r5 = r0.c
            byte r6 = r0.q
            r7 = 0
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            px0 r13 = defpackage.px0.j
            if (r6 == 0) goto L37
            if (r6 == r12) goto L33
            if (r6 == r11) goto L2f
            if (r6 == r10) goto L2b
            if (r6 == r9) goto L27
            if (r6 != r8) goto L21
            goto L33
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r0)
            return r7
        L27:
            defpackage.js2.o(r17)
            goto L7c
        L2b:
            defpackage.js2.o(r17)
            goto L6f
        L2f:
            defpackage.js2.o(r17)
            goto L5a
        L33:
            defpackage.js2.o(r17)
            goto L8b
        L37:
            defpackage.js2.o(r17)
            if (r5 <= 0) goto L4b
            r0.w = r7
            r0.c = r5
            r0.q = r12
            qo4 r1 = defpackage.qo4.j
            java.lang.Object r0 = r4.c(r1, r0)
            if (r0 != r13) goto L8b
            goto L8a
        L4b:
            long r14 = r1.j
            r0.w = r4
            r0.c = r5
            r0.q = r11
            java.lang.Object r1 = defpackage.yf2.e(r14, r0)
            if (r1 != r13) goto L5a
            goto L8a
        L5a:
            r11 = 0
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 <= 0) goto L7c
            r0.w = r4
            r0.c = r5
            r0.q = r10
            qo4 r1 = defpackage.qo4.t
            java.lang.Object r1 = r4.c(r1, r0)
            if (r1 != r13) goto L6f
            goto L8a
        L6f:
            r0.w = r4
            r0.c = r5
            r0.q = r9
            java.lang.Object r1 = defpackage.yf2.e(r2, r0)
            if (r1 != r13) goto L7c
            goto L8a
        L7c:
            r0.w = r7
            r0.c = r5
            r0.q = r8
            qo4 r1 = defpackage.qo4.a
            java.lang.Object r0 = r4.c(r1, r0)
            if (r0 != r13) goto L8b
        L8a:
            return r13
        L8b:
            og5 r0 = defpackage.og5.g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.u(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        rv4 rv4Var = new rv4(this.i, (mu0) obj3);
        rv4Var.w = (gr1) obj;
        rv4Var.c = iIntValue;
        return rv4Var.u(og5.g);
    }
}
