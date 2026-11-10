package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u20 extends zz4 implements cz1 {
    public /* synthetic */ boolean c;
    public byte q;
    public /* synthetic */ gr1 w;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r0.c(r9, r8) == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r0.c(r9, r8) == r7) goto L22;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r9) {
        /*
            r8 = this;
            gr1 r0 = r8.w
            boolean r1 = r8.c
            byte r2 = r8.q
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            px0 r7 = defpackage.px0.j
            if (r2 == 0) goto L23
            if (r2 == r6) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            goto L1f
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r8)
            return r3
        L1b:
            defpackage.js2.o(r9)
            goto L46
        L1f:
            defpackage.js2.o(r9)
            goto L55
        L23:
            defpackage.js2.o(r9)
            if (r1 == 0) goto L37
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.w = r3
            r8.c = r1
            r8.q = r6
            java.lang.Object r8 = r0.c(r9, r8)
            if (r8 != r7) goto L55
            goto L54
        L37:
            r8.w = r0
            r8.c = r1
            r8.q = r5
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r9 = defpackage.yf2.e(r5, r8)
            if (r9 != r7) goto L46
            goto L54
        L46:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.w = r3
            r8.c = r1
            r8.q = r4
            java.lang.Object r8 = r0.c(r9, r8)
            if (r8 != r7) goto L55
        L54:
            return r7
        L55:
            og5 r8 = defpackage.og5.g
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u20.u(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        u20 u20Var = new u20(3, (mu0) obj3);
        u20Var.w = (gr1) obj;
        u20Var.c = zBooleanValue;
        return u20Var.u(og5.g);
    }
}
