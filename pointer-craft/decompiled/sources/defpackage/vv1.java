package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vv1 extends f84 implements bz1 {
    public byte a;
    public /* synthetic */ Object m;
    public Object q;
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vv1(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(mu0Var);
        this.t = b;
        this.q = obj;
        this.w = obj2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                vv1 vv1Var = new vv1((fx0) this.q, (bz1) obj2, mu0Var, (byte) 0);
                vv1Var.m = obj;
                return vv1Var;
            case 1:
                vv1 vv1Var2 = new vv1((r45) obj2, mu0Var);
                vv1Var2.m = obj;
                return vv1Var2;
            default:
                vv1 vv1Var3 = new vv1((ku3) this.q, (u54) obj2, mu0Var, (byte) 2);
                vv1Var3.m = obj;
                return vv1Var3;
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
            case 1:
                break;
        }
        return ((vv1) b(mu0Var, f05Var)).u(og5Var);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01a7 A[PHI: r5
  0x01a7: PHI (r5v3 f05) = (r5v1 f05), (r5v2 f05), (r5v4 f05), (r5v8 f05) binds: [B:98:0x01d4, B:93:0x01c3, B:86:0x01a6, B:78:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad A[Catch: CancellationException -> 0x0194, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0194, blocks: (B:89:0x01ad, B:92:0x01bb, B:78:0x0190, B:83:0x019b), top: B:103:0x0176 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bb A[Catch: CancellationException -> 0x0194, PHI: r5
  0x01bb: PHI (r5v2 f05) = (r5v3 f05), (r5v6 f05) binds: [B:90:0x01b8, B:83:0x019b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0194, blocks: (B:89:0x01ad, B:92:0x01bb, B:78:0x0190, B:83:0x019b), top: B:103:0x0176 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:35:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x013f -> B:60:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01c3 -> B:87:0x01a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01d4 -> B:87:0x01a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv1.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv1(r45 r45Var, mu0 mu0Var) {
        super(mu0Var);
        this.t = (byte) 1;
        this.w = r45Var;
    }
}
