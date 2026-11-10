package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y20 extends zz4 implements bz1 {
    public byte b;
    public int c;
    public int i;
    public x10 q;
    public final /* synthetic */ b30 s;
    public List w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(b30 b30Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.s = b30Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new y20(this.s, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((y20) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020a  */
    /* JADX WARN: Code duplicated, block: B:103:0x020e  */
    /* JADX WARN: Code duplicated, block: B:105:0x021a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x021c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0272 A[LOOP:0: B:96:0x01e5->B:116:0x0272, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:172:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0202  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0269 -> B:115:0x026c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:172:0x023c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y20.u(java.lang.Object):java.lang.Object");
    }
}
