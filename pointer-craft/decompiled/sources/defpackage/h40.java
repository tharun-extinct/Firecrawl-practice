package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h40 extends zz4 implements bz1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ byte i;
    public byte q;
    public final /* synthetic */ k40 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h40(k40 k40Var, boolean z, byte b, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = k40Var;
        this.c = z;
        this.i = b;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new h40(this.w, this.c, this.i, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((h40) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[PHI: r7
  0x0060: PHI (r7v2 h40) = (r7v1 h40), (r7v4 h40) binds: [B:23:0x005d, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r1.n(0, 0, 0, 0, r6, r7) == r10) goto L27;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.q
            k40 r1 = r11.w
            r8 = 4
            r9 = 3
            r2 = 2
            r3 = 1
            px0 r10 = defpackage.px0.j
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L29
            if (r0 == r2) goto L24
            if (r0 == r9) goto L1f
            if (r0 != r8) goto L18
            defpackage.js2.o(r12)
            goto L6f
        L18:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r11)
            r11 = 0
            return r11
        L1f:
            defpackage.js2.o(r12)
            r7 = r11
            goto L60
        L24:
            defpackage.js2.o(r12)
            r7 = r11
            goto L55
        L29:
            defpackage.js2.o(r12)
            goto L45
        L2d:
            defpackage.js2.o(r12)
            long r4 = java.lang.System.currentTimeMillis()
            r1.n = r4
            boolean r12 = r11.c
            if (r12 == 0) goto L45
            r11.q = r3
            r3 = 50
            java.lang.Object r12 = defpackage.yf2.e(r3, r11)
            if (r12 != r10) goto L45
            goto L6e
        L45:
            r11.q = r2
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            byte r6 = r11.i
            r7 = r11
            java.lang.Object r11 = r1.n(r2, r3, r4, r5, r6, r7)
            if (r11 != r10) goto L55
            goto L6e
        L55:
            r7.q = r9
            r11 = 180(0xb4, double:8.9E-322)
            java.lang.Object r11 = defpackage.yf2.e(r11, r7)
            if (r11 != r10) goto L60
            goto L6e
        L60:
            byte r6 = r1.r
            r7.q = r8
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.Object r11 = r1.n(r2, r3, r4, r5, r6, r7)
            if (r11 != r10) goto L6f
        L6e:
            return r10
        L6f:
            og5 r11 = defpackage.og5.g
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h40.u(java.lang.Object):java.lang.Object");
    }
}
