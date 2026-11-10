package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u55 extends zz4 implements xy1 {
    public byte q;
    public final /* synthetic */ b65 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u55(b65 b65Var, mu0 mu0Var) {
        super(1, mu0Var);
        this.w = b65Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        return new u55(this.w, (mu0) obj).u(og5.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r13 == r6) goto L28;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.q
            r1 = 0
            og5 r2 = defpackage.og5.g
            r3 = 2
            r4 = 1
            b65 r5 = r13.w
            px0 r6 = defpackage.px0.j
            if (r0 == 0) goto L1f
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L15
            defpackage.js2.o(r14)
            goto L6c
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r13)
            return r1
        L1b:
            defpackage.js2.o(r14)
            goto L2b
        L1f:
            defpackage.js2.o(r14)
            r13.q = r4
            java.lang.Object r14 = r5.z(r13)
            if (r14 != r6) goto L2b
            goto L6b
        L2b:
            fp3 r14 = r5.x()
            if (r14 == 0) goto L6c
            java.lang.Object r0 = r14.j
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r14.t
            u75 r14 = (defpackage.u75) r14
            long r8 = r14.g
            mt3 r14 = r5.t
            if (r14 == 0) goto L6c
            r13.q = r3
            r11 = r14
            rt3 r11 = (defpackage.rt3) r11
            int r14 = r12.length()
            if (r14 != 0) goto L4c
            goto L52
        L4c:
            boolean r14 = defpackage.u75.r(r8)
            if (r14 == 0) goto L54
        L52:
            r13 = r2
            goto L65
        L54:
            ot3 r7 = new ot3
            r10 = 0
            r7.<init>(r8, r10, r11, r12)
            fx0 r14 = r11.g
            n10 r0 = new n10
            r0.<init>(r11, r7, r1)
            java.lang.Object r13 = defpackage.m50.f0(r14, r0, r13)
        L65:
            if (r13 != r6) goto L68
            goto L69
        L68:
            r13 = r2
        L69:
            if (r13 != r6) goto L6c
        L6b:
            return r6
        L6c:
            r5.A = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u55.u(java.lang.Object):java.lang.Object");
    }
}
