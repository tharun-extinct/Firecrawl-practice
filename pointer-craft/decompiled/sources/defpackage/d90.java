package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d90 extends zz4 implements bz1 {
    public final /* synthetic */ e90 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean i;
    public byte q;
    public final /* synthetic */ ue2 s;
    public final /* synthetic */ qg w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d90(qg qgVar, float f, boolean z, e90 e90Var, ue2 ue2Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = qgVar;
        this.c = f;
        this.i = z;
        this.b = e90Var;
        this.s = ue2Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new d90(this.w, this.c, this.i, this.b, this.s, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((d90) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r9.v(r8, r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (defpackage.yg1.g(r9, r4, r1, r8.s, r8) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        return r5;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.q
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r8)
            return r1
        L12:
            defpackage.js2.o(r9)
            goto L80
        L16:
            defpackage.js2.o(r9)
            qg r9 = r8.w
            tp3 r0 = r9.v
            java.lang.Object r0 = r0.getValue()
            vb1 r0 = (defpackage.vb1) r0
            float r0 = r0.j
            float r4 = r8.c
            boolean r0 = defpackage.vb1.y(r0, r4)
            if (r0 != 0) goto L80
            boolean r0 = r8.i
            px0 r5 = defpackage.px0.j
            if (r0 != 0) goto L41
            vb1 r0 = new vb1
            r0.<init>(r4)
            r8.q = r3
            java.lang.Object r8 = r9.v(r8, r0)
            if (r8 != r5) goto L80
            goto L7f
        L41:
            tp3 r0 = r9.v
            java.lang.Object r0 = r0.getValue()
            vb1 r0 = (defpackage.vb1) r0
            float r0 = r0.j
            r3 = 0
            boolean r6 = defpackage.vb1.y(r0, r3)
            if (r6 == 0) goto L5a
            mx3 r1 = new mx3
            r6 = 0
            r1.<init>(r6)
            goto L75
        L5a:
            e90 r6 = r8.b
            float r6 = r6.g
            boolean r6 = defpackage.vb1.y(r0, r6)
            if (r6 == 0) goto L6a
            p72 r1 = new p72
            r1.<init>()
            goto L75
        L6a:
            boolean r0 = defpackage.vb1.y(r0, r3)
            if (r0 == 0) goto L75
            gt1 r1 = new gt1
            r1.<init>()
        L75:
            r8.q = r2
            ue2 r0 = r8.s
            java.lang.Object r8 = defpackage.yg1.g(r9, r4, r1, r0, r8)
            if (r8 != r5) goto L80
        L7f:
            return r5
        L80:
            og5 r8 = defpackage.og5.g
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d90.u(java.lang.Object):java.lang.Object");
    }
}
