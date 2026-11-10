package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import io.appground.blehid.ClassicHidService;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zh extends zz4 implements bz1 {
    public final /* synthetic */ Object b;
    public Object c;
    public Object i;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh(Object obj, Object obj2, Object obj3, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.c = obj;
        this.i = obj2;
        this.b = obj3;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        byte b = this.q;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                zh zhVar = new zh((nc5) this.i, (ob3) obj2, mu0Var, (byte) 0);
                zhVar.c = obj;
                return zhVar;
            case 1:
                zh zhVar2 = new zh((ga1) this.i, (my1) obj2, mu0Var, (byte) 1);
                zhVar2.c = obj;
                return zhVar2;
            case 2:
                zh zhVar3 = new zh((BluetoothAdapter) this.i, (Context) obj2, mu0Var, (byte) 2);
                zhVar3.c = obj;
                return zhVar3;
            case 3:
                zh zhVar4 = new zh((gr1) this.i, (ad0) obj2, mu0Var, (byte) 3);
                zhVar4.c = obj;
                return zhVar4;
            case 4:
                return new zh((ng0) this.c, (m70) this.i, (el0) obj2, mu0Var, (byte) 4);
            case 5:
                zh zhVar5 = new zh((ng0) this.i, (m70) obj2, mu0Var, (byte) 5);
                zhVar5.c = obj;
                return zhVar5;
            case 6:
                return new zh((Set) this.i, (ClassicHidService) obj2, mu0Var, (byte) 6);
            case 7:
                return new zh((av0) this.c, (bv0) this.i, (r04) obj2, mu0Var, (byte) 7);
            case 8:
                zh zhVar6 = new zh((p01) this.i, (bz1) obj2, mu0Var, (byte) 8);
                zhVar6.c = obj;
                return zhVar6;
            case 9:
                zh zhVar7 = new zh((q81) obj2, mu0Var, (byte) 9);
                zhVar7.c = obj;
                return zhVar7;
            case 10:
                zh zhVar8 = new zh((ve2) this.i, (qq1) obj2, mu0Var, (byte) 10);
                zhVar8.c = obj;
                return zhVar8;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                zh zhVar9 = new zh((qr1) this.i, (gr1) obj2, mu0Var, (byte) 11);
                zhVar9.c = obj;
                return zhVar9;
            case 12:
                return new zh((m70) obj2, mu0Var, (byte) 12);
            case 13:
                zh zhVar10 = new zh((z34) this.i, (s73) obj2, mu0Var, (byte) 13);
                zhVar10.c = obj;
                return zhVar10;
            case 14:
                zh zhVar11 = new zh((el0) this.i, (bz1) obj2, mu0Var, (byte) 14);
                zhVar11.c = obj;
                return zhVar11;
            default:
                return new zh((g90) obj2, mu0Var, (byte) 15);
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.q;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((zh) b((mu0) obj2, (dz3) obj)).u(og5Var);
            case 1:
                return ((zh) b((mu0) obj2, (er1) obj)).u(og5Var);
            case 2:
                return ((zh) b((mu0) obj2, (ez3) obj)).u(og5Var);
            case 3:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 4:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 5:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 6:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 7:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 8:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 9:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 10:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 12:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 13:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            case 14:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
            default:
                return ((zh) b((mu0) obj2, (ox0) obj)).u(og5Var);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0117 */
    /* JADX WARN: Code duplicated, block: B:289:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x013a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0144 A[Catch: all -> 0x0117, TryCatch #3 {, blocks: (B:63:0x0113, B:73:0x013c, B:75:0x0144, B:76:0x0151, B:83:0x0161, B:70:0x012e, B:85:0x0164, B:88:0x016a, B:89:0x016b, B:69:0x0128, B:77:0x0152, B:79:0x0158), top: B:287:0x0107, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0158 A[Catch: all -> 0x0168, TRY_LEAVE, TryCatch #4 {all -> 0x0168, blocks: (B:77:0x0152, B:79:0x0158), top: B:289:0x0152, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0164 A[Catch: all -> 0x0117, TryCatch #3 {, blocks: (B:63:0x0113, B:73:0x013c, B:75:0x0144, B:76:0x0151, B:83:0x0161, B:70:0x012e, B:85:0x0164, B:88:0x016a, B:89:0x016b, B:69:0x0128, B:77:0x0152, B:79:0x0158), top: B:287:0x0107, inners: #4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:79:0x0158, B:82:0x0160], limit reached: 331 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v17, types: [yc0] */
    /* JADX WARN: Type inference failed for: r2v19, types: [m70] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [yc0] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0138 -> B:73:0x013c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh(Object obj, Object obj2, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.i = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh(Object obj, mu0 mu0Var, byte b) {
        super(2, mu0Var);
        this.q = b;
        this.b = obj;
    }
}
