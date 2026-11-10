package defpackage;

import io.appground.blehid.ClassicHidService;

/* JADX INFO: loaded from: classes.dex */
public final class hh0 extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public Object c;
    public /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh0(fx0 fx0Var, Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = fx0Var;
        this.i = obj;
        this.b = obj2;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new hh0((dh2) this.c, (ng0) this.i, (ClassicHidService) obj2, mu0Var, (byte) 0);
            case 1:
                hh0 hh0Var = new hh0(obj2, mu0Var, (byte) 1);
                hh0Var.i = obj;
                return hh0Var;
            case 2:
                return new hh0((fx0) this.c, (er1) this.i, (dz3) obj2, mu0Var, (byte) 2);
            case 3:
                hh0 hh0Var2 = new hh0((fx0) this.i, (er1) obj2, mu0Var);
                hh0Var2.c = obj;
                return hh0Var2;
            default:
                hh0 hh0Var3 = new hh0(obj2, mu0Var, (byte) 4);
                hh0Var3.i = obj;
                return hh0Var3;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((hh0) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 1:
                return ((hh0) b((mu0) obj2, (gr1) obj)).u(og5Var);
            case 2:
                return ((hh0) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 3:
                return ((hh0) b((mu0) obj2, (dz3) obj)).u(og5Var);
            default:
                return ((hh0) b((mu0) obj2, (tb5) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0250  */
    /* JADX WARN: Code duplicated, block: B:143:0x0257  */
    /* JADX WARN: Code duplicated, block: B:146:0x025c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0172, code lost:
    
        if (r2.r(r3, r32) == r5) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0182, code lost:
    
        if (defpackage.m50.f0(r3, r6, r32) == r5) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0258, code lost:
    
        if (r0 == r6) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02a6, code lost:
    
        if (r4.r(true, r32) == r1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0122, code lost:
    
        if (r1.r(r2, r32) == r3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0132, code lost:
    
        if (defpackage.m50.f0(r2, r5, r32) == r3) goto L87;
     */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh0(fx0 fx0Var, er1 er1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 3;
        this.i = fx0Var;
        this.b = er1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh0(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.b = obj;
    }
}
