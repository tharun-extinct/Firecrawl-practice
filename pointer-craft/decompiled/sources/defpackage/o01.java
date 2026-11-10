package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o01 extends zz4 implements bz1 {
    public final /* synthetic */ p01 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ s54 i;
    public final /* synthetic */ boolean p;
    public s54 q;
    public final /* synthetic */ Object s;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o01(s54 s54Var, p01 p01Var, Object obj, boolean z, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = s54Var;
        this.b = p01Var;
        this.s = obj;
        this.p = z;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        o01 o01Var = new o01(this.i, this.b, this.s, this.p, mu0Var);
        o01Var.c = obj;
        return o01Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((o01) b((mu0) obj2, (fo1) obj)).u(og5.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r6.y(r2, r8) == r7) goto L16;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.w
            r1 = 0
            java.lang.Object r2 = r8.s
            p01 r3 = r8.b
            s54 r4 = r8.i
            r5 = 2
            r6 = 1
            px0 r7 = defpackage.px0.j
            if (r0 == 0) goto L27
            if (r0 == r6) goto L1d
            if (r0 != r5) goto L17
            defpackage.js2.o(r9)
            goto L63
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r8)
            return r1
        L1d:
            s54 r0 = r8.q
            java.lang.Object r6 = r8.c
            fo1 r6 = (defpackage.fo1) r6
            defpackage.js2.o(r9)
            goto L4e
        L27:
            defpackage.js2.o(r9)
            java.lang.Object r9 = r8.c
            fo1 r9 = (defpackage.fo1) r9
            xp4 r0 = r3.n()
            r8.c = r9
            r8.q = r4
            r8.w = r6
            q64 r0 = r0.y
            java.lang.Object r0 = r0.t
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            if (r6 != r7) goto L4a
            goto L62
        L4a:
            r0 = r6
            r6 = r9
            r9 = r0
            r0 = r4
        L4e:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.j = r9
            r8.c = r1
            r8.q = r1
            r8.w = r5
            java.lang.Object r9 = r6.y(r2, r8)
            if (r9 != r7) goto L63
        L62:
            return r7
        L63:
            boolean r8 = r8.p
            if (r8 == 0) goto L7b
            q64 r8 = r3.j
            rz0 r9 = new rz0
            if (r2 == 0) goto L72
            int r0 = r2.hashCode()
            goto L73
        L72:
            r0 = 0
        L73:
            int r1 = r4.j
            r9.<init>(r0, r1, r2)
            r8.w(r9)
        L7b:
            og5 r8 = defpackage.og5.g
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o01.u(java.lang.Object):java.lang.Object");
    }
}
