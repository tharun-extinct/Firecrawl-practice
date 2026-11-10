package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a40 extends zz4 implements bz1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ e40 i;
    public int q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(int i, e40 e40Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = i;
        this.i = e40Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new a40(this.c, this.i, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((a40) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r2.n(0, 42, false, r8) == r7) goto L19;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0040 -> B:20:0x0043). Please report as a decompilation issue!!! */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.w
            r1 = 42
            e40 r2 = r8.i
            int r3 = r8.c
            r4 = 2
            r5 = 0
            r6 = 1
            px0 r7 = defpackage.px0.j
            if (r0 == 0) goto L26
            if (r0 == r6) goto L20
            if (r0 != r4) goto L19
            int r0 = r8.q
            defpackage.js2.o(r9)
            goto L43
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r8)
            r8 = 0
            return r8
        L20:
            int r0 = r8.q
            defpackage.js2.o(r9)
            goto L38
        L26:
            defpackage.js2.o(r9)
            if (r6 > r3) goto L48
            r9 = r6
        L2c:
            r8.q = r9
            r8.w = r6
            java.lang.Object r0 = r2.n(r5, r1, r6, r8)
            if (r0 != r7) goto L37
            goto L42
        L37:
            r0 = r9
        L38:
            r8.q = r0
            r8.w = r4
            java.lang.Object r9 = r2.n(r5, r1, r5, r8)
            if (r9 != r7) goto L43
        L42:
            return r7
        L43:
            if (r0 == r3) goto L48
            int r9 = r0 + 1
            goto L2c
        L48:
            og5 r8 = defpackage.og5.g
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a40.u(java.lang.Object):java.lang.Object");
    }
}
