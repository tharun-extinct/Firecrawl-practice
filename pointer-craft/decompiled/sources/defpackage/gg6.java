package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gg6 {
    /* JADX WARN: Code duplicated, block: B:27:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0083 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:28:0x007b, B:30:0x0083, B:31:0x008e, B:38:0x009e, B:25:0x006a, B:40:0x00a1, B:42:0x00a6, B:43:0x00a7, B:32:0x008f, B:34:0x0095), top: B:61:0x002d, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095 A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #3 {, blocks: (B:32:0x008f, B:34:0x0095), top: B:65:0x008f, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:12:0x002d, B:28:0x007b, B:30:0x0083, B:31:0x008e, B:38:0x009e, B:25:0x006a, B:40:0x00a1, B:42:0x00a6, B:43:0x00a7, B:32:0x008f, B:34:0x0095), top: B:61:0x002d, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:34:0x0095, B:37:0x009d], limit reached: 67 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, m70] */
    /* JADX WARN: Type inference failed for: r6v1, types: [yc0] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [yc0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [yc0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [yc0] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0078 -> B:28:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at java.base/java.util.HashMap.hash(HashMap.java:338)
        	at java.base/java.util.HashMap.put(HashMap.java:610)
        	at java.base/java.util.HashSet.add(HashSet.java:221)
        	at jadx.core.dex.visitors.regions.maker.SynchronizedRegionMaker.traverseMonitorExits(SynchronizedRegionMaker.java:97)
        	at jadx.core.dex.visitors.regions.maker.SynchronizedRegionMaker.traverseMonitorExits(SynchronizedRegionMaker.java:109)
        */
    public static final java.lang.Object g(defpackage.ou0 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.f32
            if (r0 == 0) goto L13
            r0 = r10
            f32 r0 = (defpackage.f32) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            f32 r0 = new f32
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.i
            px0 r1 = defpackage.px0.j
            int r2 = r0.b
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L34
            h70 r2 = r0.c
            yc0 r6 = r0.w
            d5 r7 = r0.q
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.m
            defpackage.js2.o(r10)     // Catch: java.lang.Throwable -> L31
            goto L7b
        L31:
            r10 = move-exception
            goto Lb5
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r10)
            return r4
        L3a:
            defpackage.js2.o(r10)
            r10 = 6
            m70 r6 = defpackage.v70.y(r5, r10, r4)
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r3)
            m r7 = new m
            r8 = 24
            r7.<init>(r2, r6, r8)
            java.lang.Object r8 = defpackage.it4.r
            monitor-enter(r8)
            java.util.List r9 = defpackage.it4.t     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r9 = defpackage.cj0.x0(r9, r7)     // Catch: java.lang.Throwable -> Lbf
            defpackage.it4.t = r9     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r8)
            defpackage.it4.r()
            d5 r8 = new d5
            r8.<init>(r7, r10)
            h70 r10 = new h70     // Catch: java.lang.Throwable -> Lb3
            r10.<init>(r6)     // Catch: java.lang.Throwable -> Lb3
            r7 = r8
            r8 = r2
            r2 = r10
        L6a:
            r0.m = r8     // Catch: java.lang.Throwable -> L31
            r0.q = r7     // Catch: java.lang.Throwable -> L31
            r0.w = r6     // Catch: java.lang.Throwable -> L31
            r0.c = r2     // Catch: java.lang.Throwable -> L31
            r0.b = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r2.y(r0)     // Catch: java.lang.Throwable -> L31
            if (r10 != r1) goto L7b
            return r1
        L7b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L31
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto La8
            java.lang.Object r10 = r2.r()     // Catch: java.lang.Throwable -> L31
            og5 r10 = (defpackage.og5) r10     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = defpackage.it4.r     // Catch: java.lang.Throwable -> L31
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L31
            d32 r9 = defpackage.it4.a     // Catch: java.lang.Throwable -> La5
            ib3 r9 = r9.j     // Catch: java.lang.Throwable -> La5
            if (r9 == 0) goto L9d
            boolean r9 = r9.j()     // Catch: java.lang.Throwable -> La5
            if (r9 != r5) goto L9d
            r9 = r5
            goto L9e
        L9d:
            r9 = r3
        L9e:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L6a
            defpackage.it4.r()     // Catch: java.lang.Throwable -> L31
            goto L6a
        La5:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        La8:
            r6.x(r4)     // Catch: java.lang.Throwable -> Lb1
            r7.y()
            og5 r10 = defpackage.og5.g
            return r10
        Lb1:
            r10 = move-exception
            goto Lbb
        Lb3:
            r10 = move-exception
            r7 = r8
        Lb5:
            throw r10     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r0 = move-exception
            defpackage.og0.c(r6, r10)     // Catch: java.lang.Throwable -> Lb1
            throw r0     // Catch: java.lang.Throwable -> Lb1
        Lbb:
            r7.y()
            throw r10
        Lbf:
            r10 = move-exception
            monitor-exit(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg6.g(ou0):java.lang.Object");
    }

    public static final void r() {
        throw new UnsupportedOperationException();
    }

    public static String y(int i) {
        if (i != -1) {
            return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }
}
