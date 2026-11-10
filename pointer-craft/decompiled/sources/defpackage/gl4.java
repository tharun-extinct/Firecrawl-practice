package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class gl4 extends zz4 implements bz1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ yo0 c;
    public final /* synthetic */ eq i;
    public final /* synthetic */ s95 p;
    public Throwable q;
    public final /* synthetic */ a44 s;
    public byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl4(yo0 yo0Var, eq eqVar, Context context, a44 a44Var, s95 s95Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.c = yo0Var;
        this.i = eqVar;
        this.b = context;
        this.s = a44Var;
        this.p = s95Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new gl4(this.c, this.i, this.b, this.s, this.p, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((gl4) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r9 == r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r1 == r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        return r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.ix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.w
            og5 r1 = defpackage.og5.g
            android.content.Context r2 = r9.b
            eq r3 = r9.i
            r4 = 2
            r5 = 1
            px0 r6 = defpackage.px0.j
            if (r0 == 0) goto L26
            if (r0 == r5) goto L1f
            if (r0 != r4) goto L18
            java.lang.Throwable r0 = r9.q
            defpackage.js2.o(r10)
            goto L58
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r9)
            r9 = 0
            return r9
        L1f:
            defpackage.js2.o(r10)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            goto L63
        L23:
            r10 = move-exception
            r0 = r10
            goto L49
        L26:
            defpackage.js2.o(r10)
            yo0 r10 = r9.c     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            r3.getClass()     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            vp r0 = new vp     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            nm0 r7 = new nm0     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            r8 = -650544734(0xffffffffd93979a2, float:-3.26291296E15)
            r7.<init>(r8, r5, r0)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            r10.A(r7)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            a44 r10 = r9.s     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            r9.w = r5     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            java.lang.Object r9 = r10.M(r9)     // Catch: java.lang.Throwable -> L23 java.util.concurrent.CancellationException -> L63
            if (r9 != r6) goto L63
            goto L57
        L49:
            r9.q = r0
            r9.w = r4
            java.util.concurrent.atomic.AtomicBoolean r10 = r3.r
            r10.set(r5)
            r3.g(r2, r0)
            if (r1 != r6) goto L58
        L57:
            return r6
        L58:
            java.lang.String r10 = "Error in recomposition coroutine"
            java.util.concurrent.CancellationException r10 = defpackage.k33.v(r10, r0)
            s95 r9 = r9.p
            defpackage.k33.d(r9, r10)
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl4.u(java.lang.Object):java.lang.Object");
    }
}
