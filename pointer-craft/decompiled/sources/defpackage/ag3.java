package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ag3 {
    public eg3 g;
    public ox0 n;
    public my1 r = new gf((Object) this, (byte) 21);
    public eg3 y;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r8, long r10, defpackage.ou0 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.yf3
            if (r0 == 0) goto L14
            r0 = r12
            yf3 r0 = (defpackage.yf3) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.w = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            yf3 r0 = new yf3
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.m
            int r1 = r12.w
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.js2.o(r0)
            goto L70
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r7)
            return r2
        L31:
            defpackage.js2.o(r0)
            goto L55
        L35:
            defpackage.js2.o(r0)
            eg3 r0 = r7.g
            if (r0 == 0) goto L41
            eg3 r0 = r0.R0()
            goto L42
        L41:
            r0 = r2
        L42:
            r5 = 0
            px0 r1 = defpackage.px0.j
            if (r0 != 0) goto L5c
            eg3 r7 = r7.y
            if (r7 == 0) goto L76
            r12.w = r4
            java.lang.Object r0 = r7.P(r8, r10, r12)
            if (r0 != r1) goto L55
            goto L6f
        L55:
            vj5 r0 = (defpackage.vj5) r0
            long r5 = r0.a()
            goto L76
        L5c:
            eg3 r7 = r7.g
            if (r7 == 0) goto L64
            eg3 r2 = r7.R0()
        L64:
            r7 = r2
            if (r7 == 0) goto L76
            r12.w = r3
            java.lang.Object r0 = r7.P(r8, r10, r12)
            if (r0 != r1) goto L70
        L6f:
            return r1
        L70:
            vj5 r0 = (defpackage.vj5) r0
            long r5 = r0.a()
        L76:
            vj5 r7 = defpackage.vj5.g(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag3.g(long, long, ou0):java.lang.Object");
    }

    public final ox0 r() {
        ox0 ox0Var = (ox0) this.r.g();
        if (ox0Var != null) {
            return ox0Var;
        }
        l0.z("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(long j, ou0 ou0Var) {
        zf3 zf3Var;
        long jA;
        if (ou0Var instanceof zf3) {
            zf3Var = (zf3) ou0Var;
            int i = zf3Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                zf3Var.w = i - Integer.MIN_VALUE;
            } else {
                zf3Var = new zf3(this, ou0Var);
            }
        } else {
            zf3Var = new zf3(this, ou0Var);
        }
        Object objD0 = zf3Var.m;
        int i2 = zf3Var.w;
        if (i2 == 0) {
            js2.o(objD0);
            eg3 eg3Var = this.g;
            eg3 eg3VarR0 = eg3Var != null ? eg3Var.R0() : null;
            if (eg3VarR0 != null) {
                zf3Var.w = 1;
                objD0 = eg3VarR0.d0(j, zf3Var);
                px0 px0Var = px0.j;
                if (objD0 == px0Var) {
                    return px0Var;
                }
            } else {
                jA = 0;
            }
            return vj5.g(jA);
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        js2.o(objD0);
        jA = ((vj5) objD0).a();
        return vj5.g(jA);
    }
}
