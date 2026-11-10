package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kb3 extends f84 implements bz1 {
    public lb3 a;
    public long b;
    public int c;
    public int i;
    public long[] m;
    public /* synthetic */ Object p;
    public int q;
    public boolean s;
    public ab3 t;
    public final /* synthetic */ lb3 u;
    public int w;
    public final /* synthetic */ ab3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb3(lb3 lb3Var, ab3 ab3Var, mu0 mu0Var) {
        super(mu0Var);
        this.u = lb3Var;
        this.z = ab3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        kb3 kb3Var = new kb3(this.u, this.z, mu0Var);
        kb3Var.p = obj;
        return kb3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((kb3) b((mu0) obj2, (ck4) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.s
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.i
            int r5 = r0.c
            long r6 = r0.b
            int r8 = r0.w
            int r9 = r0.q
            long[] r10 = r0.m
            lb3 r11 = r0.a
            ab3 r12 = r0.t
            java.lang.Object r13 = r0.p
            ck4 r13 = (defpackage.ck4) r13
            defpackage.js2.o(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.js2.o(r21)
            java.lang.Object r1 = r0.p
            ck4 r1 = (defpackage.ck4) r1
            lb3 r5 = r0.u
            ib3 r6 = r5.t
            long[] r6 = r6.g
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            ab3 r8 = r0.z
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.t = r2
            ib3 r3 = r11.t
            java.lang.Object[] r3 = r3.y
            r2 = r3[r2]
            r0.p = r13
            r0.t = r12
            r0.a = r11
            r0.m = r10
            r0.q = r9
            r0.w = r8
            r0.b = r6
            r0.c = r5
            r0.i = r1
            r0.s = r4
            r13.r(r0, r2)
            px0 r0 = defpackage.px0.j
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            og5 r0 = defpackage.og5.g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb3.u(java.lang.Object):java.lang.Object");
    }
}
