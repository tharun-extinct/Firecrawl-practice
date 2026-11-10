package defpackage;

import android.bluetooth.BluetoothHidDevice;

/* JADX INFO: loaded from: classes.dex */
public final class fg0 extends zz4 implements bz1 {
    public Object b;
    public Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object s;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg0(so4 so4Var, er1 er1Var, ew4 ew4Var, Object obj, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 2;
        this.b = so4Var;
        this.i = er1Var;
        this.s = ew4Var;
        this.c = obj;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.s;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                fg0 fg0Var = new fg0((ng0) obj3, (BluetoothHidDevice) obj2, mu0Var, (byte) 0);
                fg0Var.c = obj;
                return fg0Var;
            case 1:
                fg0 fg0Var2 = new fg0((ng0) obj3, (my1) obj2, mu0Var, (byte) 1);
                fg0Var2.c = obj;
                return fg0Var2;
            case 2:
                return new fg0((so4) this.b, (er1) obj3, (ew4) obj2, this.c, mu0Var);
            case 3:
                fg0 fg0Var3 = new fg0((ob3) obj3, (ec2) obj2, mu0Var, (byte) 3);
                fg0Var3.c = obj;
                return fg0Var3;
            case 4:
                fg0 fg0Var4 = new fg0(this.b, obj3, obj2, mu0Var, (byte) 4);
                fg0Var4.c = obj;
                return fg0Var4;
            case 5:
                return new fg0((ec3) obj3, (bz1) obj2, mu0Var, (byte) 5);
            default:
                fg0 fg0Var5 = new fg0(this.b, obj3, obj2, mu0Var, (byte) 6);
                fg0Var5.c = obj;
                return fg0Var5;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) throws Throwable {
        byte b = this.q;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((fg0) b((mu0) obj2, (ez3) obj)).u(og5Var);
            case 1:
                return ((fg0) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                return ((fg0) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 3:
                ((fg0) b((mu0) obj2, (ox0) obj)).u(og5Var);
                return px0Var;
            case 4:
                return ((fg0) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 5:
                return ((fg0) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                ((fg0) b((mu0) obj2, (gr1) obj)).u(og5Var);
                return px0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0234 A[PHI: r12 r13
  0x0234: PHI (r12v5 r54) = (r12v3 r54), (r12v4 r54), (r12v4 r54), (r12v7 r54) binds: [B:119:0x0222, B:126:0x026a, B:128:0x0286, B:116:0x0201] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r13v7 ox0) = (r13v5 ox0), (r13v6 ox0), (r13v6 ox0), (r13v9 ox0) binds: [B:119:0x0222, B:126:0x026a, B:128:0x0286, B:116:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x0256  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265 A[PHI: r12 r13
  0x0265: PHI (r12v4 r54) = (r12v5 r54), (r12v6 r54) binds: [B:123:0x0262, B:118:0x0214] A[DONT_GENERATE, DONT_INLINE]
  0x0265: PHI (r13v6 ox0) = (r13v7 ox0), (r13v8 ox0) binds: [B:123:0x0262, B:118:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x026c  */
    /* JADX WARN: Code duplicated, block: B:130:0x028a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0390  */
    /* JADX WARN: Code duplicated, block: B:187:0x039f  */
    /* JADX WARN: Code duplicated, block: B:189:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:220:0x0489 A[Catch: all -> 0x04bf, TryCatch #7 {all -> 0x04bf, blocks: (B:218:0x0481, B:220:0x0489, B:222:0x0495, B:227:0x04c3, B:228:0x04d0, B:215:0x0474), top: B:249:0x0474 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0495 A[Catch: all -> 0x04bf, TRY_LEAVE, TryCatch #7 {all -> 0x04bf, blocks: (B:218:0x0481, B:220:0x0489, B:222:0x0495, B:227:0x04c3, B:228:0x04d0, B:215:0x0474), top: B:249:0x0474 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x04c3 A[Catch: all -> 0x04bf, TRY_ENTER, TryCatch #7 {all -> 0x04bf, blocks: (B:218:0x0481, B:220:0x0489, B:222:0x0495, B:227:0x04c3, B:228:0x04d0, B:215:0x0474), top: B:249:0x0474 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x04e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73, types: [bz1] */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r1v9, types: [s52] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x026a -> B:120:0x0234). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0286 -> B:120:0x0234). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg0(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.s = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg0(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.b = obj;
        this.i = obj2;
        this.s = obj3;
    }
}
