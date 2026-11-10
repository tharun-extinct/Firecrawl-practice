package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jk0 extends zz4 implements bz1 {
    public int b;
    public byte[] c;
    public final /* synthetic */ cz1 h;
    public int i;
    public final /* synthetic */ gr1 o;
    public byte p;
    public Object[] q;
    public int s;
    public /* synthetic */ Object u;
    public yc0 w;
    public final /* synthetic */ er1[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk0(mu0 mu0Var, gr1 gr1Var, cz1 cz1Var, er1[] er1VarArr) {
        super(2, mu0Var);
        this.z = er1VarArr;
        this.h = cz1Var;
        this.o = gr1Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        jk0 jk0Var = new jk0(mu0Var, this.o, this.h, this.z);
        jk0Var.u = obj;
        return jk0Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((jk0) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba A[DONT_INVERT, EDGE_INSN: B:32:0x00ba->B:18:0x0077 BREAK  A[LOOP:0: B:25:0x009b->B:38:?]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:25:0x009b->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d4 -> B:18:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk0.u(java.lang.Object):java.lang.Object");
    }
}
