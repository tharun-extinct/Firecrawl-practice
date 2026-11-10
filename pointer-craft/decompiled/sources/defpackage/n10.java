package defpackage;

import com.android.billingclient.api.Purchase;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class n10 extends zz4 implements bz1 {
    public /* synthetic */ Object b;
    public Object c;
    public Object i;
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object s;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n10(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.b = obj2;
        this.s = obj3;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                return new n10((Purchase) this.i, (w10) this.b, (q54) obj2, mu0Var, (byte) 0);
            case 1:
                return new n10((b90) this.i, (g90) this.b, (ob3) obj2, mu0Var, (byte) 1);
            case 2:
                n10 n10Var = new n10(obj2, mu0Var, (byte) 2);
                n10Var.b = obj;
                return n10Var;
            case 3:
                return new n10((rt3) this.b, (bz1) obj2, mu0Var);
            case 4:
                n10 n10Var2 = new n10((xy1) this.i, (AtomicReference) this.b, (bz1) obj2, mu0Var, (byte) 4);
                n10Var2.c = obj;
                return n10Var2;
            default:
                n10 n10Var3 = new n10(obj2, mu0Var, (byte) 5);
                n10Var3.b = obj;
                return n10Var3;
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((n10) b(mu0Var, ox0Var)).u(og5Var);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01db A[PHI: r1 r3
  0x01db: PHI (r1v27 u54) = (r1v19 u54), (r1v35 u54) binds: [B:108:0x01d8, B:132:0x025b] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r3v15 ox0) = (r3v12 ox0), (r3v18 ox0) binds: [B:108:0x01d8, B:132:0x025b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x020a A[PHI: r6
  0x020a: PHI (r6v17 ox0) = (r6v11 ox0), (r6v11 ox0), (r6v11 ox0), (r6v15 ox0), (r6v20 ox0) binds: [B:141:0x0278, B:143:0x0285, B:137:0x0271, B:148:0x0296, B:114:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0210  */
    /* JADX WARN: Code duplicated, block: B:119:0x0219  */
    /* JADX WARN: Code duplicated, block: B:122:0x0229  */
    /* JADX WARN: Code duplicated, block: B:127:0x0239  */
    /* JADX WARN: Code duplicated, block: B:130:0x024a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0276 A[Catch: CancellationException -> 0x0274, TryCatch #6 {CancellationException -> 0x0274, blocks: (B:134:0x025e, B:136:0x0264, B:140:0x0276, B:142:0x027a), top: B:238:0x025e }] */
    /* JADX WARN: Code duplicated, block: B:142:0x027a A[Catch: CancellationException -> 0x0274, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0274, blocks: (B:134:0x025e, B:136:0x0264, B:140:0x0276, B:142:0x027a), top: B:238:0x025e }] */
    /* JADX WARN: Code duplicated, block: B:199:0x037e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0391  */
    /* JADX WARN: Code duplicated, block: B:205:0x0397  */
    /* JADX WARN: Code duplicated, block: B:207:0x03a4 A[Catch: all -> 0x0347, TRY_ENTER, TryCatch #1 {all -> 0x0347, blocks: (B:183:0x0340, B:210:0x03c7, B:212:0x03cd, B:217:0x03f7, B:213:0x03d5, B:215:0x03df, B:216:0x03f0, B:207:0x03a4), top: B:228:0x0321 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:210:0x03c7 A[Catch: all -> 0x0347, PHI: r2 r4
  0x03c7: PHI (r2v9 ??) = (r2v56 ??), (r2v57 ??) binds: [B:208:0x03c4, B:184:0x0343] A[DONT_GENERATE, DONT_INLINE]
  0x03c7: PHI (r4v7 java.lang.Object) = (r4v3 java.lang.Object), (r4v10 java.lang.Object) binds: [B:208:0x03c4, B:184:0x0343] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0347, blocks: (B:183:0x0340, B:210:0x03c7, B:212:0x03cd, B:217:0x03f7, B:213:0x03d5, B:215:0x03df, B:216:0x03f0, B:207:0x03a4), top: B:228:0x0321 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x03cd A[Catch: all -> 0x0347, TryCatch #1 {all -> 0x0347, blocks: (B:183:0x0340, B:210:0x03c7, B:212:0x03cd, B:217:0x03f7, B:213:0x03d5, B:215:0x03df, B:216:0x03f0, B:207:0x03a4), top: B:228:0x0321 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x03d5 A[Catch: all -> 0x0347, TryCatch #1 {all -> 0x0347, blocks: (B:183:0x0340, B:210:0x03c7, B:212:0x03cd, B:217:0x03f7, B:213:0x03d5, B:215:0x03df, B:216:0x03f0, B:207:0x03a4), top: B:228:0x0321 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x03df A[Catch: all -> 0x0347, LOOP:2: B:214:0x03dd->B:215:0x03df, LOOP_END, TryCatch #1 {all -> 0x0347, blocks: (B:183:0x0340, B:210:0x03c7, B:212:0x03cd, B:217:0x03f7, B:213:0x03d5, B:215:0x03df, B:216:0x03f0, B:207:0x03a4), top: B:228:0x0321 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x0406  */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v27, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x0271 -> B:115:0x020a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0278 -> B:115:0x020a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0285 -> B:115:0x020a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0292 -> B:114:0x0209). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0296 -> B:115:0x020a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:18:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n10.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n10(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.s = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(rt3 rt3Var, bz1 bz1Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.q = (byte) 3;
        this.b = rt3Var;
        this.s = bz1Var;
    }
}
