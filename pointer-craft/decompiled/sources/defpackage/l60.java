package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l60 {
    public final rb3 g = new rb3(new m60[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(defpackage.k44 r8, defpackage.ou0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.k60
            if (r0 == 0) goto L13
            r0 = r9
            k60 r0 = (defpackage.k60) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            k60 r0 = new k60
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.i
            int r1 = r0.s
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r7 = r0.c
            int r8 = r0.w
            java.lang.Object[] r1 = r0.q
            k44 r3 = r0.m
            defpackage.js2.o(r9)
            r9 = r3
            goto L63
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r7)
            r7 = 0
            return r7
        L35:
            defpackage.js2.o(r9)
            rb3 r7 = r7.g
            java.lang.Object[] r9 = r7.j
            int r7 = r7.a
            r1 = 0
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
        L43:
            if (r8 >= r7) goto L65
            r3 = r1[r8]
            m60 r3 = (defpackage.m60) r3
            qd r4 = new qd
            r5 = 9
            r4.<init>(r9, r5)
            r0.m = r9
            r0.q = r1
            r0.w = r8
            r0.c = r7
            r0.s = r2
            java.lang.Object r3 = defpackage.jz5.g(r3, r4, r0)
            px0 r4 = defpackage.px0.j
            if (r3 != r4) goto L63
            return r4
        L63:
            int r8 = r8 + r2
            goto L43
        L65:
            og5 r7 = defpackage.og5.g
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l60.g(k44, ou0):java.lang.Object");
    }
}
