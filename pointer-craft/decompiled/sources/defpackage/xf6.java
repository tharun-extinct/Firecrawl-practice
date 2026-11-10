package defpackage;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xf6 {
    public static final ob3 g(ve2 ve2Var, h02 h02Var, int i) {
        Object objK = h02Var.K();
        l76 l76Var = oo0.g;
        if (objK == l76Var) {
            objK = kq2.M(Boolean.FALSE);
            h02Var.i0(objK);
        }
        ob3 ob3Var = (ob3) objK;
        boolean z = (((i & 14) ^ 6) > 4 && h02Var.x(ve2Var)) || (i & 6) == 4;
        Object objK2 = h02Var.K();
        if (z || objK2 == l76Var) {
            objK2 = new q(ve2Var, ob3Var, null, (byte) 29);
            h02Var.i0(objK2);
        }
        k33.b((bz1) objK2, h02Var, ve2Var);
        return ob3Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [so0] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [eq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [a44] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v5, types: [dh2] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v6, types: [af2] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static final Object r(s95 s95Var, Context context, eq eqVar, r95 r95Var, yj2 yj2Var, ou0 ou0Var) throws Throwable {
        fl4 fl4Var;
        ?? r4;
        iv4 iv4Var;
        af2 af2Var;
        Context context2;
        a44 a44Var;
        r95 r95Var2;
        eq eqVar2;
        s95 s95Var2;
        a44 a44Var2;
        dh2 dh2Var;
        af2 af2Var2;
        so0 so0Var;
        yo0 yo0Var;
        yo0 yo0Var2;
        int i;
        ?? r3 = context;
        ?? r2 = eqVar;
        if (ou0Var instanceof fl4) {
            fl4Var = (fl4) ou0Var;
            i = fl4Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i2 = i - Integer.MIN_VALUE;
                fl4Var.z = i2;
                r4 = i2;
            } else {
                fl4Var = new fl4(ou0Var);
                r4 = i;
            }
        } else {
            fl4Var = new fl4(ou0Var);
            r4 = i;
        }
        fl4 fl4Var2 = fl4Var;
        Object obj = fl4Var2.u;
        ?? r1 = fl4Var2.z;
        int i3 = 2;
        byte b = 1;
        mu0 mu0Var = null;
        px0 px0Var = px0.j;
        try {
            if (r1 != 0) {
                try {
                    if (r1 == 1) {
                        yo0 yo0Var3 = fl4Var2.p;
                        a44 a44Var3 = fl4Var2.s;
                        iv4 iv4Var2 = fl4Var2.b;
                        af2 af2Var3 = fl4Var2.i;
                        r95 r95Var3 = (r95) fl4Var2.c;
                        eq eqVar3 = (eq) fl4Var2.w;
                        Context context3 = (Context) fl4Var2.q;
                        s95 s95Var3 = (s95) fl4Var2.m;
                        js2.o(obj);
                        iv4Var = iv4Var2;
                        af2Var = af2Var3;
                        context2 = context3;
                        a44Var = a44Var3;
                        r95Var2 = r95Var3;
                        eqVar2 = eqVar3;
                        s95Var2 = s95Var3;
                        yo0Var = yo0Var3;
                    } else {
                        if (r1 != 2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        so0 so0Var2 = (so0) fl4Var2.c;
                        a44Var2 = (a44) fl4Var2.w;
                        dh2Var = (dh2) fl4Var2.q;
                        af2Var2 = (af2) fl4Var2.m;
                        js2.o(obj);
                        so0Var = so0Var2;
                    }
                    so0Var.g();
                    af2Var2.g();
                    dh2Var.x(null);
                    a44Var2.k();
                    return og5.g;
                } catch (Throwable th) {
                    th = th;
                    r1.g();
                    r4.g();
                    r3.x(null);
                    r2.k();
                    throw th;
                }
            }
            js2.o(obj);
            af2Var = new af2(s95Var);
            iv4 iv4VarT = m50.T(s95Var, null, new il4(i3, mu0Var, b), 3);
            ox0 ox0Var = s95Var.j;
            r2.getClass();
            u64 u64Var = new u64();
            ew4 ew4VarW = y94.w(Boolean.FALSE);
            el4 el4Var = new el4(s95Var, r2, r3);
            yj2Var.getClass();
            fh2 fh2VarV = v70.v();
            dh2 dh2Var2 = (dh2) ox0Var.w().h(d52.m);
            if (dh2Var2 != null) {
                dh2Var2.A(new ll2(fh2VarV, (byte) 17));
            }
            a44 a44Var4 = new a44(ox0Var.w().b(fh2VarV).b(el4Var));
            yo0 yo0Var4 = new yo0(a44Var4, new lq(u64Var));
            try {
                try {
                    gl4 gl4Var = new gl4(yo0Var4, r2, r3, a44Var4, s95Var, null);
                    yo0Var2 = yo0Var4;
                    a44Var4 = a44Var4;
                    try {
                        m50.T(s95Var, af2Var, gl4Var, 2);
                        eqVar2 = eqVar;
                        iv4Var = iv4VarT;
                        try {
                            context2 = context;
                            s95Var2 = s95Var;
                            m50.T(s95Var2, null, new ey3(a44Var4, eqVar2, ew4VarW, context, u64Var, s95Var, r95Var, null), 3);
                            il4 il4Var = new il4(i3, null, (byte) 0);
                            fl4Var2.m = s95Var2;
                            fl4Var2.q = context2;
                            fl4Var2.w = eqVar2;
                            r95Var2 = r95Var;
                            fl4Var2.c = r95Var2;
                            fl4Var2.i = af2Var;
                            fl4Var2.b = iv4Var;
                            fl4Var2.s = a44Var4;
                            fl4Var2.p = yo0Var2;
                            fl4Var2.z = 1;
                            if (ue5.N(ew4VarW, il4Var, fl4Var2) != px0Var) {
                                a44Var = a44Var4;
                                yo0Var = yo0Var2;
                            }
                            return px0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = a44Var4;
                            r1 = yo0Var2;
                            r3 = iv4Var;
                            r4 = af2Var;
                            r1.g();
                            r4.g();
                            r3.x(null);
                            r2.k();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        iv4Var = iv4VarT;
                        r2 = a44Var4;
                        r1 = yo0Var2;
                        r3 = iv4Var;
                        r4 = af2Var;
                        r1.g();
                        r4.g();
                        r3.x(null);
                        r2.k();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    yo0Var2 = yo0Var4;
                    a44Var4 = a44Var4;
                }
            } catch (Throwable th5) {
                th = th5;
                yo0Var2 = yo0Var4;
            }
            q2 q2Var = new q2(s95Var2, r95Var2, eqVar2, af2Var);
            fl4Var2.m = af2Var;
            fl4Var2.q = iv4Var;
            fl4Var2.w = a44Var;
            fl4Var2.c = yo0Var;
            fl4Var2.i = null;
            fl4Var2.b = null;
            fl4Var2.s = null;
            fl4Var2.p = null;
            fl4Var2.z = 2;
            if (eqVar2.n(context2, q2Var, fl4Var2) != px0Var) {
                a44Var2 = a44Var;
                dh2Var = iv4Var;
                af2Var2 = af2Var;
                so0Var = yo0Var;
                so0Var.g();
                af2Var2.g();
                dh2Var.x(null);
                a44Var2.k();
                return og5.g;
            }
            return px0Var;
        } catch (Throwable th6) {
            th = th6;
            r2 = a44Var;
            r1 = yo0Var;
            r3 = iv4Var;
            r4 = af2Var;
            r1.g();
            r4.g();
            r3.x(null);
            r2.k();
            throw th;
        }
    }

    public static w1 y() {
        w1 w1Var = w1.v;
        if (w1Var != null) {
            return w1Var;
        }
        w1 w1Var2 = new w1();
        new Rect();
        w1.v = w1Var2;
        return w1Var2;
    }
}
