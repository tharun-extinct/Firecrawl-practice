package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i40 extends zz4 implements bz1 {
    public final /* synthetic */ k40 b;
    public int c;
    public byte i;
    public final /* synthetic */ int p;
    public int q;
    public final /* synthetic */ int s;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(k40 k40Var, int i, int i2, mu0 mu0Var) {
        super(2, mu0Var);
        this.b = k40Var;
        this.s = i;
        this.p = i2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new i40(this.b, this.s, this.p, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((i40) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[LOOP:0: B:19:0x0059->B:37:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x008f A[EDGE_INSN: B:38:0x008f->B:36:0x008f BREAK  A[LOOP:0: B:19:0x0059->B:37:0x0090], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r1.n(r2, r3, 0, 0, r13, r12) == r11) goto L36;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r13) {
        /*
            r12 = this;
            byte r0 = r12.i
            k40 r1 = r12.b
            r8 = 2
            r2 = 1
            r9 = -127(0xffffffffffffff81, float:NaN)
            r10 = 127(0x7f, float:1.78E-43)
            px0 r11 = defpackage.px0.j
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L27
            if (r0 != r8) goto L20
            int r0 = r12.c
            int r2 = r12.w
            int r3 = r12.q
            defpackage.js2.o(r13)
            r7 = r3
            r3 = r2
            r2 = r7
            r7 = r12
            goto L59
        L20:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r12)
            r12 = 0
            return r12
        L27:
            defpackage.js2.o(r13)
            goto L5e
        L2b:
            defpackage.js2.o(r13)
            long r3 = java.lang.System.currentTimeMillis()
            r1.n = r3
            byte r13 = r1.r
            byte r13 = (byte) r13
            r0 = r2
            int r2 = r12.s
            int r3 = r12.p
            if (r2 > r10) goto L57
            if (r2 < r9) goto L57
            if (r3 > r10) goto L57
            if (r3 < r9) goto L57
            byte r6 = (byte) r13
            r12.q = r2
            r12.w = r3
            r12.c = r13
            r12.i = r0
            r4 = 0
            r5 = 0
            r7 = r12
            java.lang.Object r12 = r1.n(r2, r3, r4, r5, r6, r7)
            if (r12 != r11) goto L5e
            goto L8f
        L57:
            r7 = r12
            r0 = r13
        L59:
            if (r2 != 0) goto L61
            if (r3 == 0) goto L5e
            goto L61
        L5e:
            og5 r12 = defpackage.og5.g
            return r12
        L61:
            r12 = 0
            if (r2 <= r10) goto L69
            int r2 = r2 + (-127)
            r13 = r2
            r2 = r10
            goto L71
        L69:
            if (r2 >= r9) goto L70
            int r2 = r2 + 127
            r13 = r2
            r2 = r9
            goto L71
        L70:
            r13 = r12
        L71:
            if (r3 <= r10) goto L78
            int r3 = r3 + (-127)
            r12 = r3
            r3 = r10
            goto L7e
        L78:
            if (r3 >= r9) goto L7e
            int r3 = r3 + 127
            r12 = r3
            r3 = r9
        L7e:
            byte r6 = (byte) r0
            r7.q = r13
            r7.w = r12
            r7.c = r0
            r7.i = r8
            r4 = 0
            r5 = 0
            java.lang.Object r2 = r1.n(r2, r3, r4, r5, r6, r7)
            if (r2 != r11) goto L90
        L8f:
            return r11
        L90:
            r3 = r12
            r2 = r13
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i40.u(java.lang.Object):java.lang.Object");
    }
}
