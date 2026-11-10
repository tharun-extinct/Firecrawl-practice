package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nl1 extends zz4 implements bz1 {
    public ol1 b;
    public long c;
    public t54 i;
    public rz2 p;
    public long q;
    public Iterator s;
    public boolean u;
    public long w;
    public final /* synthetic */ ol1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl1(ol1 ol1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.z = ol1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new nl1(this.z, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((nl1) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006f A[LOOP:1: B:19:0x007f->B:18:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:22:0x0090->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00de A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0085 -> B:22:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x00c7
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl1.u(java.lang.Object):java.lang.Object");
    }
}
