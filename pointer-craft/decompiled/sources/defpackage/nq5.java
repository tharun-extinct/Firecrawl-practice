package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class nq5 extends zz4 implements bz1 {
    public final /* synthetic */ Uri b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ContentResolver i;
    public final /* synthetic */ m70 p;
    public h70 q;
    public final /* synthetic */ oq5 s;
    public final /* synthetic */ Context u;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq5(ContentResolver contentResolver, Uri uri, oq5 oq5Var, m70 m70Var, Context context, mu0 mu0Var) {
        super(2, mu0Var);
        this.i = contentResolver;
        this.b = uri;
        this.s = oq5Var;
        this.p = m70Var;
        this.u = context;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        nq5 nq5Var = new nq5(this.i, this.b, this.s, this.p, this.u, mu0Var);
        nq5Var.c = obj;
        return nq5Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((nq5) b((mu0) obj2, (gr1) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0043, B:22:0x0054, B:24:0x005c, B:14:0x002b, B:17:0x003c), top: B:31:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r6.c(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.w
            r1 = 2
            r2 = 1
            oq5 r3 = r10.s
            android.content.ContentResolver r4 = r10.i
            px0 r5 = defpackage.px0.j
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1e
            h70 r0 = r10.q
            java.lang.Object r6 = r10.c
            gr1 r6 = (defpackage.gr1) r6
            defpackage.js2.o(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r0
            goto L43
        L1c:
            r10 = move-exception
            goto L87
        L1e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r10)
            r10 = 0
            return r10
        L25:
            h70 r0 = r10.q
            java.lang.Object r6 = r10.c
            gr1 r6 = (defpackage.gr1) r6
            defpackage.js2.o(r11)     // Catch: java.lang.Throwable -> L1c
            goto L54
        L2f:
            defpackage.js2.o(r11)
            java.lang.Object r11 = r10.c
            gr1 r11 = (defpackage.gr1) r11
            android.net.Uri r0 = r10.b
            r6 = 0
            r4.registerContentObserver(r0, r6, r3)
            m70 r0 = r10.p     // Catch: java.lang.Throwable -> L1c
            h70 r6 = new h70     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L1c
        L43:
            r10.c = r11     // Catch: java.lang.Throwable -> L1c
            r10.q = r6     // Catch: java.lang.Throwable -> L1c
            r10.w = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r6.y(r10)     // Catch: java.lang.Throwable -> L1c
            if (r0 != r5) goto L50
            goto L80
        L50:
            r9 = r6
            r6 = r11
            r11 = r0
            r0 = r9
        L54:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L81
            r0.r()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.u     // Catch: java.lang.Throwable -> L1c
            hb3 r7 = defpackage.pq5.g     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.c = r6     // Catch: java.lang.Throwable -> L1c
            r10.q = r0     // Catch: java.lang.Throwable -> L1c
            r10.w = r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.c(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r5) goto L19
        L80:
            return r5
        L81:
            r4.unregisterContentObserver(r3)
            og5 r10 = defpackage.og5.g
            return r10
        L87:
            r4.unregisterContentObserver(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq5.u(java.lang.Object):java.lang.Object");
    }
}
