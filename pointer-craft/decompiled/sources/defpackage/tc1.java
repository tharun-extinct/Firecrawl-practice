package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tc1 extends f84 implements bz1 {
    public byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ jz1 c;
    public final /* synthetic */ jz1 i;
    public /* synthetic */ Object m;
    public Object q;
    public final /* synthetic */ byte t = 0;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc1(cp0 cp0Var, tn tnVar, ed edVar, sy2 sy2Var, h hVar, mu0 mu0Var) {
        super(mu0Var);
        this.q = cp0Var;
        this.w = tnVar;
        this.c = edVar;
        this.i = sy2Var;
        this.b = hVar;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.t;
        Object obj2 = this.b;
        jz1 jz1Var = this.i;
        jz1 jz1Var2 = this.c;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                tc1 tc1Var = new tc1((cp0) this.q, (tn) obj3, (ed) jz1Var2, (sy2) jz1Var, (h) obj2, mu0Var);
                tc1Var.m = obj;
                return tc1Var;
            default:
                tc1 tc1Var2 = new tc1((ox0) obj3, (o55) jz1Var2, (ff) jz1Var, (kx3) obj2, mu0Var);
                tc1Var2.m = obj;
                return tc1Var2;
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
        return ((tc1) b(mu0Var, f05Var)).u(og5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (r3 == r9) goto L20;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc1.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc1(ox0 ox0Var, o55 o55Var, ff ffVar, kx3 kx3Var, mu0 mu0Var) {
        super(mu0Var);
        this.w = ox0Var;
        this.c = o55Var;
        this.i = ffVar;
        this.b = kx3Var;
    }
}
