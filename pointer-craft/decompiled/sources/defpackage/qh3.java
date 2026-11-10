package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qh3 extends f84 implements bz1 {
    public boolean a;
    public /* synthetic */ Object m;
    public final /* synthetic */ my1 q;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh3(my1 my1Var, mu0 mu0Var) {
        super(mu0Var);
        this.q = my1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        qh3 qh3Var = new qh3(this.q, mu0Var);
        qh3Var.m = obj;
        return qh3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((qh3) b((mu0) obj2, (ck4) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0034
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4.a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            java.lang.Object r0 = r4.t
            java.lang.Object r3 = r4.m
            ck4 r3 = (defpackage.ck4) r3
            defpackage.js2.o(r5)
            goto L35
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r4)
            return r1
        L18:
            defpackage.js2.o(r5)
            java.lang.Object r5 = r4.m
            ck4 r5 = (defpackage.ck4) r5
            r3 = r5
        L20:
            my1 r5 = r4.q
            java.lang.Object r5 = r5.g()
            if (r5 == 0) goto L34
            r4.m = r3
            r4.t = r5
            r4.a = r2
            r3.r(r4, r5)
            px0 r4 = defpackage.px0.j
            return r4
        L34:
            r0 = r1
        L35:
            if (r0 != 0) goto L20
            og5 r4 = defpackage.og5.g
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh3.u(java.lang.Object):java.lang.Object");
    }
}
