package defpackage;

import android.bluetooth.BluetoothHidDevice;

/* JADX INFO: loaded from: classes.dex */
public final class hd0 implements gr1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ u54 t;

    public hd0(ng0 ng0Var, m70 m70Var, u54 u54Var, ox0 ox0Var) {
        this.m = ng0Var;
        this.q = m70Var;
        this.t = u54Var;
        this.a = ox0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        gd0 gd0Var;
        switch (this.j) {
            case 0:
                if (mu0Var instanceof gd0) {
                    gd0Var = (gd0) mu0Var;
                    int i = gd0Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gd0Var.c = i - Integer.MIN_VALUE;
                    } else {
                        gd0Var = new gd0(this, mu0Var);
                    }
                } else {
                    gd0Var = new gd0(this, mu0Var);
                }
                Object obj2 = gd0Var.q;
                int i2 = gd0Var.c;
                u54 u54Var = this.t;
                if (i2 == 0) {
                    js2.o(obj2);
                    dh2 dh2Var = (dh2) u54Var.j;
                    if (dh2Var != null) {
                        dh2Var.x(new zd0("Child of the scoped flow was cancelled"));
                        gd0Var.m = obj;
                        gd0Var.c = 1;
                        Object objM = dh2Var.M(gd0Var);
                        px0 px0Var = px0.j;
                        if (objM == px0Var) {
                            return px0Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = gd0Var.m;
                    js2.o(obj2);
                }
                u54Var.j = m50.T((ox0) this.a, null, new fd0((id0) this.m, (gr1) this.q, obj, null), 1);
                return og5.g;
            case 1:
                return g(kc.r(obj), mu0Var);
            default:
                return y((int[]) obj, mu0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object g(BluetoothHidDevice bluetoothHidDevice, mu0 mu0Var) throws Throwable {
        mg0 mg0Var;
        ng0 ng0Var = (ng0) this.m;
        if (mu0Var instanceof mg0) {
            mg0Var = (mg0) mu0Var;
            int i = mg0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mg0Var.c = i - Integer.MIN_VALUE;
            } else {
                mg0Var = new mg0(this, mu0Var);
            }
        } else {
            mg0Var = new mg0(this, mu0Var);
        }
        Object obj = mg0Var.q;
        int i2 = mg0Var.c;
        mu0 mu0Var2 = null;
        u54 u54Var = this.t;
        if (i2 == 0) {
            js2.o(obj);
            ng0Var.b = bluetoothHidDevice;
            np npVar = new np(u54Var, mu0Var2, (byte) 3);
            mg0Var.m = bluetoothHidDevice;
            mg0Var.c = 1;
            Object objE = br2.E(2000L, npVar, mg0Var);
            px0 px0Var = px0.j;
            if (objE == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bluetoothHidDevice = kc.r(mg0Var.m);
            js2.o(obj);
        }
        if (bluetoothHidDevice != null) {
            ((m70) this.q).z(zf0.j);
            u54Var.j = m50.T((ox0) this.a, ng0Var.w, new op(ng0Var, bluetoothHidDevice, mu0Var2, (byte) 4), 2);
        }
        return og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r1.c(r13, r2) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r1.c(r13, r2) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(int[] r14, defpackage.mu0 r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.a
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.q
            gr1 r1 = (defpackage.gr1) r1
            boolean r2 = r15 instanceof defpackage.ud5
            if (r2 == 0) goto L1b
            r2 = r15
            ud5 r2 = (defpackage.ud5) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.c = r3
            goto L20
        L1b:
            ud5 r2 = new ud5
            r2.<init>(r13, r15)
        L20:
            java.lang.Object r15 = r2.q
            int r3 = r2.c
            r4 = 0
            u54 r5 = r13.t
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L3c
            if (r3 == r7) goto L36
            if (r3 != r6) goto L30
            goto L36
        L30:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r13)
            return r4
        L36:
            int[] r14 = r2.m
            defpackage.js2.o(r15)
            goto L96
        L3c:
            defpackage.js2.o(r15)
            java.lang.Object r15 = r5.j
            px0 r3 = defpackage.px0.j
            if (r15 != 0) goto L54
            java.util.Set r13 = defpackage.pr.l0(r0)
            r2.m = r14
            r2.c = r7
            java.lang.Object r13 = r1.c(r13, r2)
            if (r13 != r3) goto L96
            goto L95
        L54:
            java.lang.Object r13 = r13.m
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L60:
            if (r8 >= r7) goto L81
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r5.j
            if (r12 == 0) goto L7b
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L77
            r15.add(r10)
        L77:
            int r8 = r8 + 1
            r9 = r11
            goto L60
        L7b:
            java.lang.String r13 = "Required value was null."
            defpackage.l0.z(r13)
            return r4
        L81:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L96
            java.util.Set r13 = defpackage.cj0.J0(r15)
            r2.m = r14
            r2.c = r6
            java.lang.Object r13 = r1.c(r13, r2)
            if (r13 != r3) goto L96
        L95:
            return r3
        L96:
            r5.j = r14
            og5 r13 = defpackage.og5.g
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd0.y(int[], mu0):java.lang.Object");
    }

    public hd0(u54 u54Var, ox0 ox0Var, id0 id0Var, gr1 gr1Var) {
        this.t = u54Var;
        this.a = ox0Var;
        this.m = id0Var;
        this.q = gr1Var;
    }

    public hd0(u54 u54Var, gr1 gr1Var, String[] strArr, int[] iArr) {
        this.t = u54Var;
        this.q = gr1Var;
        this.a = strArr;
        this.m = iArr;
    }
}
