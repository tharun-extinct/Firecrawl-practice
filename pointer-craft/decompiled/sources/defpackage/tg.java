package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tg extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public Object c;
    public Object i;
    public final /* synthetic */ Object p;
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object u;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg(Object obj, Object obj2, Object obj3, Object obj4, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.b = obj;
        this.s = obj2;
        this.p = obj3;
        this.u = obj4;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.u;
        Object obj3 = this.p;
        Object obj4 = this.s;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                tg tgVar = new tg((yc0) obj5, (qg) obj4, (ob3) obj3, (ob3) obj2, mu0Var, (byte) 0);
                tgVar.i = obj;
                return tgVar;
            default:
                return new tg((ju2) obj5, (wt2) obj4, (ox0) obj3, (bz1) obj2, mu0Var, (byte) 1);
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
        return ((tg) b(mu0Var, ox0Var)).u(og5Var);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x012f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0131  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0116 -> B:65:0x0119). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg.u(java.lang.Object):java.lang.Object");
    }
}
