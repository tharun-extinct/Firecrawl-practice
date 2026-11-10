package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d05 extends zz4 implements bz1 {
    public final /* synthetic */ f05 c;
    public byte q;
    public final /* synthetic */ long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d05(long j, f05 f05Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = j;
        this.c = f05Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new d05(this.w, this.c, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((d05) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (defpackage.yf2.e(8, r10) == r7) goto L15;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.q
            r1 = 8
            long r3 = r10.w
            r5 = 2
            r6 = 1
            px0 r7 = defpackage.px0.j
            if (r0 == 0) goto L1f
            if (r0 == r6) goto L1b
            if (r0 != r5) goto L14
            defpackage.js2.o(r11)
            goto L36
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r10)
            r10 = 0
            return r10
        L1b:
            defpackage.js2.o(r11)
            goto L2d
        L1f:
            defpackage.js2.o(r11)
            long r8 = r3 - r1
            r10.q = r6
            java.lang.Object r11 = defpackage.yf2.e(r8, r10)
            if (r11 != r7) goto L2d
            goto L35
        L2d:
            r10.q = r5
            java.lang.Object r11 = defpackage.yf2.e(r1, r10)
            if (r11 != r7) goto L36
        L35:
            return r7
        L36:
            f05 r10 = r10.c
            ib0 r10 = r10.a
            if (r10 == 0) goto L49
            lu3 r11 = new lu3
            r11.<init>(r3)
            g84 r0 = new g84
            r0.<init>(r11)
            r10.j(r0)
        L49:
            og5 r10 = defpackage.og5.g
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d05.u(java.lang.Object):java.lang.Object");
    }
}
