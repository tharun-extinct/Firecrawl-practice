package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class l01 extends zz4 implements xy1 {
    public final /* synthetic */ s54 b;
    public final /* synthetic */ u54 c;
    public final /* synthetic */ p01 i;
    public Serializable q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l01(u54 u54Var, p01 p01Var, s54 s54Var, mu0 mu0Var) {
        super(1, mu0Var);
        this.c = u54Var;
        this.i = p01Var;
        this.b = s54Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        p01 p01Var = this.i;
        s54 s54Var = this.b;
        return new l01(this.c, p01Var, s54Var, (mu0) obj).u(og5.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r10 == r8) goto L29;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            byte r0 = r9.w
            r1 = 0
            s54 r2 = r9.b
            u54 r3 = r9.c
            r4 = 3
            r5 = 2
            p01 r6 = r9.i
            r7 = 1
            px0 r8 = defpackage.px0.j
            if (r0 == 0) goto L35
            if (r0 == r7) goto L2d
            if (r0 == r5) goto L25
            if (r0 != r4) goto L1f
            java.io.Serializable r9 = r9.q
            r2 = r9
            s54 r2 = (defpackage.s54) r2
            defpackage.js2.o(r10)
            goto L79
        L1f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r9)
            return r1
        L25:
            java.io.Serializable r0 = r9.q
            s54 r0 = (defpackage.s54) r0
            defpackage.js2.o(r10)     // Catch: defpackage.tx0 -> L6c
            goto L63
        L2d:
            java.io.Serializable r0 = r9.q
            u54 r0 = (defpackage.u54) r0
            defpackage.js2.o(r10)     // Catch: defpackage.tx0 -> L6c
            goto L51
        L35:
            defpackage.js2.o(r10)
            r9.q = r3     // Catch: defpackage.tx0 -> L6c
            r9.w = r7     // Catch: defpackage.tx0 -> L6c
            o05 r10 = r6.a     // Catch: defpackage.tx0 -> L6c
            java.lang.Object r10 = r10.getValue()     // Catch: defpackage.tx0 -> L6c
            do1 r10 = (defpackage.do1) r10     // Catch: defpackage.tx0 -> L6c
            tu0 r0 = new tu0     // Catch: defpackage.tx0 -> L6c
            r0.<init>(r4, r1, r5)     // Catch: defpackage.tx0 -> L6c
            java.lang.Object r10 = r10.g(r0, r9)     // Catch: defpackage.tx0 -> L6c
            if (r10 != r8) goto L50
            goto L78
        L50:
            r0 = r3
        L51:
            r0.j = r10     // Catch: defpackage.tx0 -> L6c
            xp4 r10 = r6.n()     // Catch: defpackage.tx0 -> L6c
            r9.q = r2     // Catch: defpackage.tx0 -> L6c
            r9.w = r5     // Catch: defpackage.tx0 -> L6c
            java.lang.Integer r10 = r10.g()     // Catch: defpackage.tx0 -> L6c
            if (r10 != r8) goto L62
            goto L78
        L62:
            r0 = r2
        L63:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: defpackage.tx0 -> L6c
            int r10 = r10.intValue()     // Catch: defpackage.tx0 -> L6c
            r0.j = r10     // Catch: defpackage.tx0 -> L6c
            goto L81
        L6c:
            java.lang.Object r10 = r3.j
            r9.q = r2
            r9.w = r4
            java.lang.Object r10 = r6.a(r10, r7, r9)
            if (r10 != r8) goto L79
        L78:
            return r8
        L79:
            java.lang.Number r10 = (java.lang.Number) r10
            int r9 = r10.intValue()
            r2.j = r9
        L81:
            og5 r9 = defpackage.og5.g
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l01.u(java.lang.Object):java.lang.Object");
    }
}
