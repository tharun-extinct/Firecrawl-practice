package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class rb extends f84 implements bz1 {
    public byte a;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rb(Object obj, mu0 mu0Var, byte b) {
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
                rb rbVar = new rb((tb) obj2, mu0Var, (byte) 0);
                rbVar.m = obj;
                return rbVar;
            case 1:
                rb rbVar2 = new rb((nm1) obj2, mu0Var, (byte) 1);
                rbVar2.m = obj;
                return rbVar2;
            case 2:
                rb rbVar3 = new rb((xy1) obj2, mu0Var, (byte) 2);
                rbVar3.m = obj;
                return rbVar3;
            default:
                rb rbVar4 = new rb((View) obj2, mu0Var, (byte) 3);
                rbVar4.m = obj;
                return rbVar4;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.t;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((rb) b((mu0) obj2, (f05) obj)).u(og5Var);
            case 1:
                return ((rb) b((mu0) obj2, (f05) obj)).u(og5Var);
            case 2:
                return ((rb) b((mu0) obj2, (f05) obj)).u(og5Var);
            default:
                return ((rb) b((mu0) obj2, (ck4) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0173  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185 A[LOOP:1: B:78:0x0171->B:82:0x0185, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0144 -> B:71:0x0147). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb.u(java.lang.Object):java.lang.Object");
    }
}
