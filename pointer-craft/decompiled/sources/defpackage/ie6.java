package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ie6 {
    public static final t32 g = new t32((byte) 28);

    public static final void g(final boolean z, final my1 my1Var, j73 j73Var, boolean z2, t24 t24Var, h02 h02Var, final int i) {
        final j73 j73Var2;
        final boolean z3;
        final t24 t24Var2;
        t24 t24Var3;
        boolean z4;
        t24 t24Var4;
        j73 j73Var3;
        long j;
        bw4 bw4Var;
        Object objQ;
        j73 j73VarP;
        h02Var.Z(408580840);
        int i2 = i | (h02Var.l(z) ? 4 : 2) | (h02Var.j(my1Var) ? 32 : 16) | 208256;
        if (h02Var.N(i2 & 1, (74899 & i2) != 74898)) {
            h02Var.S();
            int i3 = i & 1;
            j73 j73Var4 = g73.g;
            if (i3 == 0 || h02Var.k()) {
                rj0 rj0Var = (rj0) h02Var.a(tj0.g);
                t24 t24Var5 = rj0Var.m0;
                if (t24Var5 == null) {
                    t24Var3 = new t24(tj0.n(rj0Var, vd6.n), tj0.n(rj0Var, vd6.x), jj0.y(0.38f, tj0.n(rj0Var, vd6.g)), jj0.y(0.38f, tj0.n(rj0Var, vd6.y)));
                    rj0Var.m0 = t24Var3;
                } else {
                    t24Var3 = t24Var5;
                }
                z4 = true;
                t24Var4 = t24Var3;
                j73Var3 = j73Var4;
            } else {
                h02Var.Q();
                j73Var3 = j73Var;
                z4 = z2;
                t24Var4 = t24Var;
            }
            h02Var.s();
            bw4 bw4VarG = ug.g(z ? 6.0f : 0.0f, jr2.F(f83.t, h02Var), h02Var, 12);
            t24Var4.getClass();
            if (z4 && z) {
                j = t24Var4.g;
            } else if (!z4 || z) {
                j = (z4 || !z) ? t24Var4.n : t24Var4.r;
            } else {
                j = t24Var4.y;
            }
            if (z4) {
                h02Var.X(1194696477);
                bw4Var = bw4VarG;
                objQ = aq4.g(j, jr2.F(f83.a, h02Var), null, h02Var, 0, 12);
                h02Var.b(false);
            } else {
                bw4Var = bw4VarG;
                h02Var.X(1194874138);
                objQ = kq2.Q(new jj0(j), h02Var);
                h02Var.b(false);
            }
            Object obj = objQ;
            if (my1Var != null) {
                z3 = z4;
                j73VarP = ra.P(j73Var4, z, null, k94.g(vd6.v / 2.0f, 4, 0L, false), z3, new o94(3), my1Var);
            } else {
                z3 = z4;
                j73VarP = j73Var4;
            }
            if (my1Var != null) {
                f72 f72Var = ye2.g;
                j73Var4 = c63.g;
            }
            j73 j73VarX = mq4.x(ue5.e0(mq4.i(j73Var3.n(j73Var4).n(j73VarP), hi0.w, 2), 2.0f), vd6.r);
            bw4 bw4Var2 = bw4Var;
            boolean zX = h02Var.x(obj) | h02Var.x(bw4Var2);
            Object objK = h02Var.K();
            if (zX || objK == oo0.g) {
                objK = new kn2(obj, bw4Var2, (byte) 10);
                h02Var.i0(objK);
            }
            ue5.v(j73VarX, (xy1) objK, h02Var, 0);
            j73Var2 = j73Var3;
            t24Var2 = t24Var4;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            z3 = z2;
            t24Var2 = t24Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(z, my1Var, j73Var2, z3, t24Var2, i) { // from class: u24
                public final /* synthetic */ j73 a;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ t24 q;
                public final /* synthetic */ my1 t;

                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iJ = aq2.J(1);
                    ie6.g(this.j, this.t, this.a, this.m, this.q, (h02) obj2, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final StackTraceElement y(ix ixVar) {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        z01 z01Var = (z01) ixVar.getClass().getAnnotation(z01.class);
        String str = null;
        if (z01Var == null || z01Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = ixVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(ixVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? z01Var.l()[iIntValue] : -1;
        q70 q70Var = qc6.y;
        q70 q70Var2 = qc6.g;
        if (q70Var == null) {
            try {
                q70 q70Var3 = new q70(Class.class.getDeclaredMethod("getModule", null), ixVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), ixVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), (byte) 5);
                qc6.y = q70Var3;
                q70Var = q70Var3;
            } catch (Exception unused2) {
                qc6.y = q70Var2;
                q70Var = q70Var2;
            }
        }
        if (q70Var != q70Var2 && (method = (Method) q70Var.t) != null && (objInvoke = method.invoke(ixVar.getClass(), null)) != null && (method2 = (Method) q70Var.a) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) q70Var.m;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = z01Var.c();
        } else {
            strC = str + '/' + z01Var.c();
        }
        return new StackTraceElement(strC, z01Var.m(), z01Var.f(), i);
    }
}
