package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vz extends f84 implements bz1 {
    public boolean a;
    public /* synthetic */ Object m;
    public final /* synthetic */ ox0 q;
    public ku3 t;
    public final /* synthetic */ ya5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz(ox0 ox0Var, ya5 ya5Var, mu0 mu0Var) {
        super(mu0Var);
        this.q = ox0Var;
        this.w = ya5Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        vz vzVar = new vz(this.q, this.w, mu0Var);
        vzVar.m = obj;
        return vzVar;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        ((vz) b((mu0) obj2, (f05) obj)).u(og5.g);
        return px0.j;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7.a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            ku3 r0 = r7.t
            java.lang.Object r3 = r7.m
            f05 r3 = (defpackage.f05) r3
            defpackage.js2.o(r8)
            goto L31
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r7)
            return r1
        L18:
            defpackage.js2.o(r8)
            java.lang.Object r8 = r7.m
            f05 r8 = (defpackage.f05) r8
            ku3 r0 = defpackage.ku3.t
            r3 = r8
        L22:
            r7.m = r3
            r7.t = r0
            r7.a = r2
            java.lang.Object r8 = r3.g(r0, r7)
            px0 r4 = defpackage.px0.j
            if (r8 != r4) goto L31
            return r4
        L31:
            ju3 r8 = (defpackage.ju3) r8
            java.util.List r4 = r8.g
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            qu3 r4 = (defpackage.qu3) r4
            int r4 = r4.t
            r5 = 2
            if (r4 != r5) goto L22
            int r8 = r8.x
            r4 = 4
            ya5 r6 = r7.w
            if (r8 != r4) goto L54
            pz r8 = new pz
            r8.<init>(r6, r1, r5)
            r4 = 3
            ox0 r5 = r7.q
            defpackage.m50.T(r5, r1, r8, r4)
            goto L22
        L54:
            r4 = 5
            if (r8 != r4) goto L22
            r6.dismiss()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz.u(java.lang.Object):java.lang.Object");
    }
}
