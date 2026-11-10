package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class re0 extends zz4 implements bz1 {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qg c;
    public final /* synthetic */ float i;
    public final /* synthetic */ ob3 p;
    public final /* synthetic */ byte q;
    public final /* synthetic */ ue2 s;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re0(qg qgVar, float f, boolean z, ue2 ue2Var, ob3 ob3Var, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = qgVar;
        this.i = f;
        this.b = z;
        this.s = ue2Var;
        this.p = ob3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.q) {
            case 0:
                return new re0(this.c, this.i, this.b, this.s, this.p, mu0Var, (byte) 0);
            default:
                return new re0(this.c, this.i, this.b, this.s, this.p, mu0Var, (byte) 1);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((re0) b(mu0Var, ox0Var)).u(og5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r6.v(r12, r13) == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (defpackage.yg1.g(r6, r7, r13, r11, r12) == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r6.v(r12, r13) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (defpackage.yg1.g(r6, r7, r13, r11, r12) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return r5;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r13) {
        /*
            r12 = this;
            byte r0 = r12.q
            og5 r1 = defpackage.og5.g
            boolean r2 = r12.b
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            px0 r5 = defpackage.px0.j
            qg r6 = r12.c
            float r7 = r12.i
            r8 = 1
            r9 = 2
            ob3 r10 = r12.p
            ue2 r11 = r12.s
            switch(r0) {
                case 0: goto L61;
                default: goto L18;
            }
        L18:
            byte r0 = r12.w
            if (r0 == 0) goto L2a
            if (r0 == r8) goto L26
            if (r0 != r9) goto L21
            goto L26
        L21:
            defpackage.l0.z(r4)
            r1 = r3
            goto L60
        L26:
            defpackage.js2.o(r13)
            goto L5d
        L2a:
            defpackage.js2.o(r13)
            tp3 r13 = r6.v
            java.lang.Object r13 = r13.getValue()
            vb1 r13 = (defpackage.vb1) r13
            float r13 = r13.j
            boolean r13 = defpackage.vb1.y(r13, r7)
            if (r13 != 0) goto L60
            if (r2 != 0) goto L4d
            vb1 r13 = new vb1
            r13.<init>(r7)
            r12.w = r8
            java.lang.Object r12 = r6.v(r12, r13)
            if (r12 != r5) goto L5d
            goto L5b
        L4d:
            java.lang.Object r13 = r10.getValue()
            ue2 r13 = (defpackage.ue2) r13
            r12.w = r9
            java.lang.Object r12 = defpackage.yg1.g(r6, r7, r13, r11, r12)
            if (r12 != r5) goto L5d
        L5b:
            r1 = r5
            goto L60
        L5d:
            r10.setValue(r11)
        L60:
            return r1
        L61:
            byte r0 = r12.w
            if (r0 == 0) goto L73
            if (r0 == r8) goto L6f
            if (r0 != r9) goto L6a
            goto L6f
        L6a:
            defpackage.l0.z(r4)
            r1 = r3
            goto La9
        L6f:
            defpackage.js2.o(r13)
            goto La6
        L73:
            defpackage.js2.o(r13)
            tp3 r13 = r6.v
            java.lang.Object r13 = r13.getValue()
            vb1 r13 = (defpackage.vb1) r13
            float r13 = r13.j
            boolean r13 = defpackage.vb1.y(r13, r7)
            if (r13 != 0) goto La9
            if (r2 != 0) goto L96
            vb1 r13 = new vb1
            r13.<init>(r7)
            r12.w = r8
            java.lang.Object r12 = r6.v(r12, r13)
            if (r12 != r5) goto La6
            goto La4
        L96:
            java.lang.Object r13 = r10.getValue()
            ue2 r13 = (defpackage.ue2) r13
            r12.w = r9
            java.lang.Object r12 = defpackage.yg1.g(r6, r7, r13, r11, r12)
            if (r12 != r5) goto La6
        La4:
            r1 = r5
            goto La9
        La6:
            r10.setValue(r11)
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re0.u(java.lang.Object):java.lang.Object");
    }
}
