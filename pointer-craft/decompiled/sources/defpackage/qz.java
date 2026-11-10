package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qz extends f84 implements bz1 {
    public boolean a;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz(Object obj, mu0 mu0Var, byte b) {
        super(mu0Var);
        this.t = b;
        this.q = obj;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.t;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                qz qzVar = new qz((ku3) obj2, mu0Var, (byte) 0);
                qzVar.m = obj;
                return qzVar;
            default:
                qz qzVar2 = new qz((kw0) obj2, mu0Var, (byte) 1);
                qzVar2.m = obj;
                return qzVar2;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.t;
        og5 og5Var = og5.g;
        f05 f05Var = (f05) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                return ((qz) b(mu0Var, f05Var)).u(og5Var);
            default:
                ((qz) b(mu0Var, f05Var)).u(og5Var);
                return px0.j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x000d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.t
            java.lang.Object r1 = r6.q
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            px0 r4 = defpackage.px0.j
            r5 = 1
            switch(r0) {
                case 0: goto L47;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r6.a
            if (r0 == 0) goto L1f
            if (r0 != r5) goto L1b
            java.lang.Object r0 = r6.m
            f05 r0 = (defpackage.f05) r0
            defpackage.js2.o(r7)
            goto L35
        L1b:
            defpackage.l0.z(r3)
            goto L34
        L1f:
            defpackage.js2.o(r7)
            java.lang.Object r7 = r6.m
            f05 r7 = (defpackage.f05) r7
            r0 = r7
        L27:
            r6.m = r0
            r6.a = r5
            ku3 r7 = defpackage.ku3.j
            java.lang.Object r7 = r0.g(r7, r6)
            if (r7 != r4) goto L35
            r2 = r4
        L34:
            return r2
        L35:
            ju3 r7 = (defpackage.ju3) r7
            r2 = r1
            kw0 r2 = (defpackage.kw0) r2
            boolean r7 = defpackage.pi4.g(r7)
            r7 = r7 ^ r5
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r2.a(r7)
            goto L27
        L47:
            boolean r0 = r6.a
            if (r0 == 0) goto L56
            if (r0 != r5) goto L51
            defpackage.js2.o(r7)
            goto L68
        L51:
            defpackage.l0.z(r3)
            r7 = r2
            goto L68
        L56:
            defpackage.js2.o(r7)
            java.lang.Object r7 = r6.m
            f05 r7 = (defpackage.f05) r7
            ku3 r1 = (defpackage.ku3) r1
            r6.a = r5
            java.lang.Object r7 = defpackage.r25.t(r7, r1, r6)
            if (r7 != r4) goto L68
            r7 = r4
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz.u(java.lang.Object):java.lang.Object");
    }
}
