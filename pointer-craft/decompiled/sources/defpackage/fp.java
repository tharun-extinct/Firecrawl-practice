package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fp extends zz4 implements bz1 {
    public Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte q;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp(Object obj, Object obj2, mu0 mu0Var, byte b) {
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
                return new fp((Context) this.c, (List) obj2, mu0Var, (byte) 0);
            case 1:
                return new fp((e40) obj2, mu0Var, (byte) 1);
            case 2:
                return new fp((ng0) this.c, (dh2) obj2, mu0Var, (byte) 2);
            case 3:
                return new fp((kb5) obj2, mu0Var, (byte) 3);
            default:
                fp fpVar = new fp((ae5) obj2, mu0Var, (byte) 4);
                fpVar.c = obj;
                return fpVar;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((fp) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 1:
                return ((fp) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 2:
                return ((fp) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 3:
                return ((fp) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((fp) b((mu0) obj2, (tb5) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0142 A[PHI: r1
  0x0142: PHI (r1v4 h70) = (r1v2 h70), (r1v3 h70), (r1v8 h70) binds: [B:68:0x0138, B:81:0x0192, B:65:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x014d A[PHI: r1 r12
  0x014d: PHI (r1v3 h70) = (r1v4 h70), (r1v6 h70) binds: [B:70:0x014a, B:67:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r12v5 java.lang.Object) = (r12v15 java.lang.Object), (r12v0 java.lang.Object) binds: [B:70:0x014a, B:67:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x0180  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b6 -> B:41:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0192 -> B:69:0x0142). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
    }
}
