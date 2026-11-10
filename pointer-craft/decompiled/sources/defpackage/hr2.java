package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hr2 extends f84 implements bz1 {
    public byte a;
    public final /* synthetic */ Object c;
    public /* synthetic */ Object m;
    public Object q;
    public final /* synthetic */ byte t;
    public Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr2(ld1 ld1Var, mf2 mf2Var, r45 r45Var, mu0 mu0Var) {
        super(mu0Var);
        this.t = (byte) 1;
        this.q = ld1Var;
        this.w = mf2Var;
        this.c = r45Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.t;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hr2 hr2Var = new hr2((u21) obj2, mu0Var, (byte) 0);
                hr2Var.m = obj;
                return hr2Var;
            case 1:
                hr2 hr2Var2 = new hr2((ld1) this.q, (mf2) this.w, (r45) obj2, mu0Var);
                hr2Var2.m = obj;
                return hr2Var2;
            default:
                hr2 hr2Var3 = new hr2((fy4) obj2, mu0Var, (byte) 2);
                hr2Var3.m = obj;
                return hr2Var3;
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
        return ((hr2) b(mu0Var, f05Var)).u(og5Var);
    }

    /* JADX WARN: Code duplicated, block: B:224:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:227:0x03e1 A[LOOP:9: B:223:0x03d2->B:227:0x03e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0243 -> B:138:0x0246). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x03c6 -> B:222:0x03c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d6 -> B:40:0x00da). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr2.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr2(Object obj, mu0 mu0Var, byte b) {
        super(mu0Var);
        this.t = b;
        this.c = obj;
    }
}
