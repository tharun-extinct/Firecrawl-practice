package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class es4 {
    public final ec3 g = new ec3();
    public final tp3 y = kq2.M(null);

    public static Object y(es4 es4Var, String str, String str2, xr4 xr4Var, zz4 zz4Var, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            xr4Var = str2 == null ? xr4.j : xr4.a;
        }
        es4Var.getClass();
        return es4Var.g(new cs4(str, str2, xr4Var), zz4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r9 == r6) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [es4] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cc3] */
    /* JADX WARN: Type inference failed for: r7v4, types: [cc3] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cs4 r8, defpackage.ou0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ds4
            if (r0 == 0) goto L13
            r0 = r9
            ds4 r0 = (defpackage.ds4) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            ds4 r0 = new ds4
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.w
            int r1 = r0.i
            tp3 r2 = r7.y
            r3 = 2
            r4 = 1
            r5 = 0
            px0 r6 = defpackage.px0.j
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            cc3 r7 = r0.q
            defpackage.js2.o(r9)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r8 = move-exception
            goto L7b
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r7)
            return r5
        L37:
            cc3 r7 = r0.q
            cs4 r8 = r0.m
            defpackage.js2.o(r9)
            goto L51
        L3f:
            defpackage.js2.o(r9)
            r0.m = r8
            ec3 r7 = r7.g
            r0.q = r7
            r0.i = r4
            java.lang.Object r9 = r7.y(r0)
            if (r9 != r6) goto L51
            goto L71
        L51:
            r0.m = r8     // Catch: java.lang.Throwable -> L2f
            r0.q = r7     // Catch: java.lang.Throwable -> L2f
            r0.i = r3     // Catch: java.lang.Throwable -> L2f
            ib0 r9 = new ib0     // Catch: java.lang.Throwable -> L2f
            mu0 r0 = defpackage.pw5.o(r0)     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2f
            r9.o()     // Catch: java.lang.Throwable -> L2f
            bs4 r0 = new bs4     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L2f
            r2.setValue(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r9.z()     // Catch: java.lang.Throwable -> L2f
            if (r9 != r6) goto L72
        L71:
            return r6
        L72:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L79
            r7.x(r5)
            return r9
        L79:
            r8 = move-exception
            goto L7f
        L7b:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L7f:
            r7.x(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es4.g(cs4, ou0):java.lang.Object");
    }
}
