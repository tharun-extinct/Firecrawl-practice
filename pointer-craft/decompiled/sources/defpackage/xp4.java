package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class xp4 {
    public final ec3 g = new ec3();
    public final q64 y = new q64((byte) 7);
    public final w00 r = new w00(new zn0(2, null, 1), 4);

    public xp4(String str) {
    }

    public final Integer g() {
        return new Integer(((AtomicInteger) this.y.t).get());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(bz1 bz1Var, ou0 ou0Var) throws Throwable {
        wp4 wp4Var;
        ec3 ec3Var;
        boolean z;
        Throwable th;
        if (ou0Var instanceof wp4) {
            wp4Var = (wp4) ou0Var;
            int i = wp4Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                wp4Var.i = i - Integer.MIN_VALUE;
            } else {
                wp4Var = new wp4(this, ou0Var);
            }
        } else {
            wp4Var = new wp4(this, ou0Var);
        }
        Object obj = wp4Var.w;
        int i2 = wp4Var.i;
        if (i2 != 0) {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = wp4Var.q;
            ec3Var = wp4Var.m;
            try {
                js2.o(obj);
                if (z) {
                    ec3Var.x(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    ec3Var.x(null);
                }
                throw th;
            }
        }
        js2.o(obj);
        ec3 ec3Var2 = this.g;
        boolean zV = ec3Var2.v();
        try {
            Object objValueOf = Boolean.valueOf(zV);
            wp4Var.m = ec3Var2;
            wp4Var.q = zV;
            wp4Var.i = 1;
            Object objL = bz1Var.l(objValueOf, wp4Var);
            Object obj2 = px0.j;
            if (objL == obj2) {
                return obj2;
            }
            ec3Var = ec3Var2;
            z = zV;
            obj = objL;
            if (z) {
                ec3Var.x(null);
            }
            return obj;
        } catch (Throwable th3) {
            ec3Var = ec3Var2;
            z = zV;
            th = th3;
            if (z) {
                ec3Var.x(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [xp4] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cc3] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [cc3] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(defpackage.xy1 r7, defpackage.ou0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.vp4
            if (r0 == 0) goto L13
            r0 = r8
            vp4 r0 = (defpackage.vp4) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            vp4 r0 = new vp4
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.w
            int r1 = r0.i
            r2 = 2
            r3 = 1
            r4 = 0
            px0 r5 = defpackage.px0.j
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.m
            cc3 r6 = (defpackage.cc3) r6
            defpackage.js2.o(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r6)
            return r4
        L37:
            ec3 r6 = r0.q
            java.lang.Object r7 = r0.m
            xy1 r7 = (defpackage.xy1) r7
            defpackage.js2.o(r8)
            goto L53
        L41:
            defpackage.js2.o(r8)
            r0.m = r7
            ec3 r6 = r6.g
            r0.q = r6
            r0.i = r3
            java.lang.Object r8 = r6.y(r0)
            if (r8 != r5) goto L53
            goto L5f
        L53:
            r0.m = r6     // Catch: java.lang.Throwable -> L2f
            r0.q = r4     // Catch: java.lang.Throwable -> L2f
            r0.i = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.a(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L60
        L5f:
            return r5
        L60:
            r6.x(r4)
            return r8
        L64:
            r6.x(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp4.y(xy1, ou0):java.lang.Object");
    }
}
