package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mh2 extends f84 implements bz1 {
    public Object a;
    public final /* synthetic */ Object b;
    public Object c;
    public Object i;
    public int m;
    public int q;
    public final /* synthetic */ byte t;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh2(Object obj, mu0 mu0Var, byte b) {
        super(mu0Var);
        this.t = b;
        this.b = obj;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        switch (this.t) {
            case 0:
                mh2 mh2Var = new mh2((nh2) this.b, mu0Var, (byte) 0);
                mh2Var.a = obj;
                return mh2Var;
            default:
                mh2 mh2Var2 = new mh2((Iterator) this.b, mu0Var, (byte) 1);
                mh2Var2.i = obj;
                return mh2Var2;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.t;
        og5 og5Var = og5.g;
        ck4 ck4Var = (ck4) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((mh2) b(mu0Var, ck4Var)).u(og5Var);
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01d4 -> B:84:0x01ea). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh2.u(java.lang.Object):java.lang.Object");
    }
}
