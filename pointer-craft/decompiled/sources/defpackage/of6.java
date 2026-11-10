package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class of6 {
    public static final Object g = new Object();
    public static int r;
    public static boolean y;

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object g(defpackage.f05 r6, defpackage.ix r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ki4
            if (r0 == 0) goto L13
            r0 = r7
            ki4 r0 = (defpackage.ki4) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ki4 r0 = new ki4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.q
            int r1 = r0.w
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            f05 r6 = r0.m
            defpackage.js2.o(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.js2.o(r7)
        L31:
            r0.m = r6
            r0.w = r2
            ku3 r7 = defpackage.ku3.t
            java.lang.Object r7 = r6.g(r7, r0)
            px0 r1 = defpackage.px0.j
            if (r7 != r1) goto L40
            return r1
        L40:
            ju3 r7 = (defpackage.ju3) r7
            java.util.List r1 = r7.g
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            qu3 r5 = (defpackage.qu3) r5
            boolean r5 = defpackage.fd6.g(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of6.g(f05, ix):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(defpackage.f05 r12, defpackage.r45 r13, defpackage.ju3 r14, defpackage.ix r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of6.n(f05, r45, ju3, ix):java.lang.Object");
    }

    public static final Object r(xa3 xa3Var) {
        if (xa3Var.t()) {
            l0.s("List is empty.");
            return null;
        }
        int i = xa3Var.y - 1;
        Object objL = xa3Var.l(i);
        xa3Var.q(i);
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(defpackage.f05 r11, defpackage.r45 r12, defpackage.ju3 r13, int r14, defpackage.ix r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of6.v(f05, r45, ju3, int, ix):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        if (r3 == r13) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(defpackage.f05 r17, defpackage.mf2 r18, defpackage.ld1 r19, defpackage.ju3 r20, defpackage.ix r21) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of6.y(f05, mf2, ld1, ju3, ix):java.lang.Object");
    }
}
