package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k40 implements y52, rb0 {
    public final fx0 g;
    public final byte[] l;
    public long n;
    public byte r;
    public iv4 v;
    public final ku0 x;
    public final v30 y;

    public k40(am1 am1Var, v30 v30Var) {
        am1Var.getClass();
        this.g = am1Var;
        this.y = v30Var;
        this.n = System.currentTimeMillis();
        this.x = k33.x(a11.k(am1Var, v13.v()));
        this.l = new byte[]{5, 1, 9, 2, -95, 1, -123, 2, 9, 1, -95, 0, 5, 9, 25, 1, 41, 5, 21, 0, 37, 1, 117, 1, -107, 5, -127, 2, 117, 3, -107, 1, -127, 1, 5, 1, 9, 48, 9, 49, 9, 56, 21, -127, 37, 127, 117, 8, -107, 3, -127, 6, 5, 12, 10, 56, 2, -107, 1, -127, 6, -64, -64};
    }

    @Override // defpackage.rb0
    public final tf0 g() {
        return v54.g(k40.class);
    }

    public final Object j(int i, int i2, zz4 zz4Var) {
        Object objF0 = m50.f0(this.g, new j40(this, i, i2, null, (byte) 0), zz4Var);
        return objF0 == px0.j ? objF0 : og5.g;
    }

    public final Object l(int i, int i2, mu0 mu0Var) {
        Object objF0 = m50.f0(this.g, new i40(this, i, i2, null), mu0Var);
        return objF0 == px0.j ? objF0 : og5.g;
    }

    public final Object n(int i, int i2, int i3, int i4, byte b, ou0 ou0Var) {
        Object objF0 = m50.f0(this.g, new g40(b, i, i2, i3, i4, this, null), ou0Var);
        return objF0 == px0.j ? objF0 : og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r1.n(-1, -1, 0, 0, r6, r7) == r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.ou0 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.f40
            if (r0 == 0) goto L14
            r0 = r12
            f40 r0 = (defpackage.f40) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.w = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            f40 r0 = new f40
            r0.<init>(r11, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.m
            int r0 = r7.w
            r8 = 3
            r9 = 2
            r1 = 1
            px0 r10 = defpackage.px0.j
            if (r0 == 0) goto L40
            if (r0 == r1) goto L3b
            if (r0 == r9) goto L36
            if (r0 != r8) goto L2f
            defpackage.js2.o(r12)
            goto L6d
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r11)
            r11 = 0
            return r11
        L36:
            defpackage.js2.o(r12)
            r1 = r11
            goto L5e
        L3b:
            defpackage.js2.o(r12)
            r1 = r11
            goto L53
        L40:
            defpackage.js2.o(r12)
            byte r6 = r11.r
            r7.w = r1
            r2 = 1
            r3 = 1
            r4 = 0
            r5 = 0
            r1 = r11
            java.lang.Object r11 = r1.n(r2, r3, r4, r5, r6, r7)
            if (r11 != r10) goto L53
            goto L6c
        L53:
            r7.w = r9
            r11 = 100
            java.lang.Object r11 = defpackage.yf2.e(r11, r7)
            if (r11 != r10) goto L5e
            goto L6c
        L5e:
            byte r6 = r1.r
            r7.w = r8
            r2 = -1
            r3 = -1
            r4 = 0
            r5 = 0
            java.lang.Object r11 = r1.n(r2, r3, r4, r5, r6, r7)
            if (r11 != r10) goto L6d
        L6c:
            return r10
        L6d:
            og5 r11 = defpackage.og5.g
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k40.r(ou0):java.lang.Object");
    }

    public final Object v(byte b, boolean z, zz4 zz4Var) {
        Object objF0 = m50.f0(this.g, new yu0(this, z, b, null), zz4Var);
        return objF0 == px0.j ? objF0 : og5.g;
    }

    public final Object x(byte b, boolean z, zz4 zz4Var) {
        Object objF0 = m50.f0(this.g, new h40(this, z, b, null), zz4Var);
        return objF0 == px0.j ? objF0 : og5.g;
    }

    @Override // defpackage.y52
    public final byte[] y() {
        return this.l;
    }
}
