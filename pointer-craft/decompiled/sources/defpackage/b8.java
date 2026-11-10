package defpackage;

import androidx.glance.appwidget.AsyncRequestWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class b8 extends zz4 implements bz1 {
    public /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                return new b8((c8) this.c, (nc1) obj2, mu0Var, (byte) 0);
            case 1:
                return new b8((uc) this.c, (cd2) obj2, mu0Var, (byte) 1);
            case 2:
                b8 b8Var = new b8((AsyncRequestWorker) obj2, mu0Var, (byte) 2);
                b8Var.c = obj;
                return b8Var;
            case 3:
                return new b8((rt) this.c, (ns) obj2, mu0Var, (byte) 3);
            case 4:
                b8 b8Var2 = new b8((k40) obj2, mu0Var, (byte) 4);
                b8Var2.c = obj;
                return b8Var2;
            case 5:
                return new b8((rz2) this.c, (qr0) obj2, mu0Var, (byte) 5);
            case 6:
                b8 b8Var3 = new b8((qr0) obj2, mu0Var, (byte) 6);
                b8Var3.c = obj;
                return b8Var3;
            case 7:
                return new b8((dh2) this.c, (jy0) obj2, mu0Var, (byte) 7);
            case 8:
                b8 b8Var4 = new b8((u83) obj2, mu0Var, (byte) 8);
                b8Var4.c = obj;
                return b8Var4;
            default:
                return new b8((dh2) this.c, (kx3) obj2, mu0Var, (byte) 9);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Throwable {
        byte b = this.q;
        og5 og5Var = og5.g;
        ox0 ox0Var = (ox0) obj;
        mu0 mu0Var = (mu0) obj2;
        switch (b) {
            case 0:
                return ((b8) b(mu0Var, ox0Var)).u(og5Var);
            case 1:
                return ((b8) b(mu0Var, ox0Var)).u(og5Var);
            case 2:
                return ((b8) b(mu0Var, ox0Var)).u(og5Var);
            case 3:
                return ((b8) b(mu0Var, ox0Var)).u(og5Var);
            case 4:
                return ((b8) b(mu0Var, ox0Var)).u(og5Var);
            case 5:
                return ((b8) b(mu0Var, ox0Var)).u(og5Var);
            case 6:
                return ((b8) b(mu0Var, ox0Var)).u(og5Var);
            case 7:
                ((b8) b(mu0Var, ox0Var)).u(og5Var);
                return px0.j;
            case 8:
                return ((b8) b(mu0Var, ox0Var)).u(og5Var);
            default:
                return ((b8) b(mu0Var, ox0Var)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0253  */
    /* JADX WARN: Code duplicated, block: B:165:0x025e A[PHI: r2
  0x025e: PHI (r2v20 long) = (r2v23 long), (r2v19 long) binds: [B:163:0x025b, B:158:0x0246] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:167:0x026d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [l22] */
    /* JADX WARN: Type inference failed for: r13v0, types: [mu0] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x026b -> B:170:0x0279). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x0275 -> B:170:0x0279). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ad -> B:32:0x0074). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0119 -> B:74:0x011c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
    }
}
