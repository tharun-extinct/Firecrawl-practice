package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oi4 extends f84 implements bz1 {
    public long a;
    public boolean m;
    public /* synthetic */ Object q;
    public final /* synthetic */ byte t = 0;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi4(long j, t54 t54Var, mu0 mu0Var) {
        super(mu0Var);
        this.a = j;
        this.w = t54Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                oi4 oi4Var = new oi4(this.a, (t54) obj2, mu0Var);
                oi4Var.q = obj;
                return oi4Var;
            default:
                oi4 oi4Var2 = new oi4((qu3) obj2, mu0Var);
                oi4Var2.q = obj;
                return oi4Var2;
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
                break;
        }
        return ((oi4) b(mu0Var, f05Var)).u(og5Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0045
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.t
            java.lang.Object r1 = r9.w
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            px0 r4 = defpackage.px0.j
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r9.m
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.a
            java.lang.Object r2 = r9.q
            f05 r2 = (defpackage.f05) r2
            defpackage.js2.o(r10)
            goto L47
        L1d:
            defpackage.l0.z(r3)
            goto L50
        L21:
            defpackage.js2.o(r10)
            java.lang.Object r10 = r9.q
            f05 r10 = (defpackage.f05) r10
            qu3 r1 = (defpackage.qu3) r1
            long r0 = r1.y
            bl5 r2 = r10.x()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.q = r2
            r9.a = r0
            r9.m = r5
            r10 = 3
            java.lang.Object r10 = defpackage.r25.y(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            qu3 r10 = (defpackage.qu3) r10
            long r6 = r10.y
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            t54 r1 = (defpackage.t54) r1
            boolean r0 = r9.m
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.q
            f05 r9 = (defpackage.f05) r9
            defpackage.js2.o(r10)
            goto L84
        L61:
            defpackage.l0.z(r3)
            goto Lb6
        L65:
            defpackage.js2.o(r10)
            java.lang.Object r10 = r9.q
            f05 r10 = (defpackage.f05) r10
            long r2 = r9.a
            ed r0 = new ed
            r6 = 27
            r0.<init>(r1, r6)
            r9.q = r10
            r9.m = r5
            java.lang.Object r9 = defpackage.wc1.r(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            qu3 r10 = (defpackage.qu3) r10
            if (r10 == 0) goto L9c
            long r0 = r1.j
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            tb1 r2 = defpackage.tb1.t
            goto Lb6
        L9c:
            g05 r9 = r9.q
            ju3 r9 = r9.e
            java.util.List r9 = r9.g
            java.lang.Object r9 = defpackage.cj0.j0(r9)
            qu3 r9 = (defpackage.qu3) r9
            boolean r10 = defpackage.fd6.n(r9)
            if (r10 == 0) goto Lb4
            r9.g()
            tb1 r2 = defpackage.tb1.j
            goto Lb6
        Lb4:
            tb1 r2 = defpackage.tb1.m
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi4.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi4(qu3 qu3Var, mu0 mu0Var) {
        super(mu0Var);
        this.w = qu3Var;
    }
}
