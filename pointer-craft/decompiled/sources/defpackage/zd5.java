package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zd5 extends zz4 implements bz1 {
    public int b;
    public tb5 c;
    public final /* synthetic */ tb5 h;
    public int i;
    public byte p;
    public qi3[] q;
    public int s;
    public final /* synthetic */ qi3[] u;
    public ae5 w;
    public final /* synthetic */ ae5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd5(qi3[] qi3VarArr, ae5 ae5Var, tb5 tb5Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.u = qi3VarArr;
        this.z = ae5Var;
        this.h = tb5Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        return new zd5(this.u, this.z, this.h, mu0Var);
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((zd5) b((mu0) obj2, (rb5) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ix
    public final java.lang.Object u(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.p
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.s
            int r4 = r11.b
            int r5 = r11.i
            tb5 r6 = r11.c
            ae5 r7 = r11.w
            qi3[] r8 = r11.q
            defpackage.js2.o(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r11)
            return r1
        L21:
            defpackage.js2.o(r12)
            qi3[] r12 = r11.u
            int r0 = r12.length
            r4 = 0
            ae5 r5 = r11.z
            tb5 r6 = r11.h
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            px0 r10 = defpackage.px0.j
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.q = r8
            r11.w = r7
            r11.c = r6
            r11.i = r9
            r11.b = r4
            r11.s = r0
            r11.p = r2
            java.lang.Object r12 = r7.v(r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            defpackage.uo1.g()
            return r1
        L5d:
            r11.q = r8
            r11.w = r7
            r11.c = r6
            r11.i = r9
            r11.b = r4
            r11.s = r0
            r11.p = r3
            java.lang.Object r12 = r7.n(r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            og5 r11 = defpackage.og5.g
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd5.u(java.lang.Object):java.lang.Object");
    }
}
