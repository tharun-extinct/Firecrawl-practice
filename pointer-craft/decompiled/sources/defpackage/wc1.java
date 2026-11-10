package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wc1 {
    public static final float g = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0067->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EDGE_INSN: B:54:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0067->B:27:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(defpackage.f05 r12, long r13, defpackage.ou0 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.pc1
            if (r0 == 0) goto L13
            r0 = r15
            pc1 r0 = (defpackage.pc1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pc1 r0 = new pc1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.w
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            t54 r12 = r0.q
            f05 r13 = r0.m
            defpackage.js2.o(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5d
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r12)
            return r3
        L33:
            defpackage.js2.o(r15)
            g05 r15 = r12.q
            ju3 r15 = r15.e
            boolean r15 = v(r15, r13)
            if (r15 == 0) goto L42
            goto Lbc
        L42:
            t54 r15 = new t54
            r15.<init>()
            r15.j = r13
        L49:
            r0.m = r12
            r0.q = r15
            r0.c = r2
            ku3 r13 = defpackage.ku3.t
            java.lang.Object r13 = r12.g(r13, r0)
            px0 r14 = defpackage.px0.j
            if (r13 != r14) goto L5a
            return r14
        L5a:
            r11 = r15
            r15 = r13
            r13 = r11
        L5d:
            ju3 r15 = (defpackage.ju3) r15
            java.util.List r14 = r15.g
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L67:
            if (r5 >= r1) goto L7e
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            qu3 r7 = (defpackage.qu3) r7
            long r7 = r7.g
            long r9 = r13.j
            boolean r7 = defpackage.zq2.a(r7, r9)
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L67
        L7e:
            r6 = r3
        L7f:
            qu3 r6 = (defpackage.qu3) r6
            if (r6 != 0) goto L85
            r6 = r3
            goto Lb3
        L85:
            boolean r14 = defpackage.fd6.n(r6)
            if (r14 == 0) goto Lad
            java.util.List r14 = r15.g
            int r15 = r14.size()
        L91:
            if (r4 >= r15) goto La2
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            qu3 r5 = (defpackage.qu3) r5
            boolean r5 = r5.n
            if (r5 == 0) goto L9f
            goto La3
        L9f:
            int r4 = r4 + 1
            goto L91
        La2:
            r1 = r3
        La3:
            qu3 r1 = (defpackage.qu3) r1
            if (r1 != 0) goto La8
            goto Lb3
        La8:
            long r14 = r1.g
            r13.j = r14
            goto Lbd
        Lad:
            boolean r14 = defpackage.fd6.a(r6)
            if (r14 == 0) goto Lbd
        Lb3:
            if (r6 == 0) goto Lbc
            boolean r12 = r6.q()
            if (r12 != 0) goto Lbc
            return r6
        Lbc:
            return r3
        Lbd:
            r15 = r13
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc1.g(f05, long, ou0):java.lang.Object");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0455 -> B:92:0x0403). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0493 -> B:165:0x0607). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x05ee -> B:162:0x05f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x0622 -> B:86:0x03dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0690 -> B:179:0x0699). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x024b -> B:32:0x024f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02f1 -> B:32:0x024f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0349 -> B:78:0x03b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x03a3 -> B:75:0x03a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final java.lang.Object l(defpackage.f05 r28, defpackage.qu3 r29, defpackage.cp0 r30, defpackage.tn r31, defpackage.ed r32, defpackage.sy2 r33, defpackage.h r34, defpackage.ix r35) {
        /*
            Method dump skipped, instruction units count: 1904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc1.l(f05, qu3, cp0, tn, ed, sy2, h, ix):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object n(defpackage.f05 r4, long r5, defpackage.xy1 r7, defpackage.ou0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.uc1
            if (r0 == 0) goto L13
            r0 = r8
            uc1 r0 = (defpackage.uc1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uc1 r0 = new uc1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.w
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            xy1 r4 = r0.q
            f05 r5 = r0.m
            defpackage.js2.o(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r4)
            r4 = 0
            return r4
        L32:
            defpackage.js2.o(r8)
        L35:
            r0.m = r4
            r0.q = r7
            r0.c = r2
            java.lang.Object r8 = g(r4, r5, r0)
            px0 r5 = defpackage.px0.j
            if (r8 != r5) goto L44
            return r5
        L44:
            qu3 r8 = (defpackage.qu3) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.fd6.n(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.a(r8)
            long r5 = r8.g
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc1.n(f05, long, xy1, ou0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb A[LOOP:0: B:26:0x00b6->B:30:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4 A[EDGE_INSN: B:68:0x00d4->B:32:0x00d4 BREAK  A[LOOP:0: B:26:0x00b6->B:30:0x00cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015f -> B:62:0x0165). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object r(defpackage.f05 r18, long r19, defpackage.ed r21, defpackage.ix r22) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc1.r(f05, long, ed, ix):java.lang.Object");
    }

    public static final boolean v(ju3 ju3Var, long j) {
        Object obj;
        List list = ju3Var.g;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (zq2.a(((qu3) obj).g, j)) {
                break;
            }
            i++;
        }
        qu3 qu3Var = (qu3) obj;
        if (qu3Var != null && qu3Var.n) {
            z = true;
        }
        return true ^ z;
    }

    public static final float x(bl5 bl5Var, int i) {
        return i == 2 ? bl5Var.n() * g : bl5Var.n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [u54] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final Object y(f05 f05Var, long j, ou0 ou0Var) {
        qc1 qc1Var;
        Object obj;
        qu3 qu3Var;
        q54 q54Var;
        if (ou0Var instanceof qc1) {
            qc1Var = (qc1) ou0Var;
            int i = qc1Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                qc1Var.i = i - Integer.MIN_VALUE;
            } else {
                qc1Var = new qc1(ou0Var);
            }
        } else {
            qc1Var = new qc1(ou0Var);
        }
        Object obj2 = qc1Var.c;
        int i2 = qc1Var.i;
        try {
            if (i2 == 0) {
                js2.o(obj2);
                if (!v(f05Var.q.e, j)) {
                    List list = f05Var.q.e.g;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (zq2.a(((qu3) obj).g, j)) {
                            break;
                        }
                        i3++;
                    }
                    qu3Var = (qu3) obj;
                    if (qu3Var != null) {
                        u54 u54Var = new u54();
                        u54 u54Var2 = new u54();
                        u54Var2.j = qu3Var;
                        long jR = f05Var.x().r();
                        q54 q54Var2 = new q54();
                        bz1 rc1Var = new rc1(q54Var2, u54Var2, u54Var, null);
                        qc1Var.m = qu3Var;
                        qc1Var.q = u54Var;
                        qc1Var.w = q54Var2;
                        qc1Var.i = 1;
                        Object objT = f05Var.t(jR, rc1Var, qc1Var);
                        Object obj3 = px0.j;
                        if (objT == obj3) {
                            return obj3;
                        }
                        q54Var = q54Var2;
                        j = u54Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q54Var = qc1Var.w;
            u54 u54Var3 = qc1Var.q;
            qu3Var = qc1Var.m;
            js2.o(obj2);
            j = u54Var3;
            if (q54Var.j) {
                qu3 qu3Var2 = (qu3) j.j;
                return qu3Var2 == null ? qu3Var : qu3Var2;
            }
            return null;
        } catch (lu3 unused) {
            qu3 qu3Var3 = (qu3) j.j;
            return qu3Var3 == null ? qu3Var : qu3Var3;
        }
    }
}
