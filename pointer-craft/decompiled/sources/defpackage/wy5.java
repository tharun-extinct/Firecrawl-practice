package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wy5 {
    public static final nm0 g = new nm0(1846547136, false, new sm0(8));
    public static final nm0 y = new nm0(1170189661, false, new sm0(9));
    public static final nm0 r = new nm0(1762274345, false, new sm0(10));
    public static final nm0 n = new nm0(322802566, false, new sm0(11));
    public static final nm0 v = new nm0(725263944, false, new sm0(12));
    public static final nm0 x = new nm0(-714207835, false, new sm0(13));
    public static final nm0 l = new nm0(-311746457, false, new sm0(14));
    public static final nm0 j = new nm0(-1751218236, false, new sm0(15));

    public static final void g(boolean z, final my1 my1Var, h02 h02Var, final int i, final int i2) {
        final boolean z2;
        int i3;
        h02Var.Z(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (h02Var.l(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= h02Var.j(my1Var) ? 32 : 16;
        }
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i4 != 0 ? true : z2;
            Object objG = (gf3) h02Var.a(jx2.g);
            if (objG == null) {
                h02Var.X(535274673);
                objG = ox2.g(h02Var);
            } else {
                h02Var.X(535271790);
            }
            h02Var.b(false);
            if (objG == null) {
                l0.z("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zX = h02Var.x(objG);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (zX || objK == obj) {
                gf3 gf3Var = objG instanceof gf3 ? (gf3) objG : null;
                kb5 kb5VarG = gf3Var != null ? gf3Var.g() : null;
                vj3 vj3Var = objG instanceof vj3 ? (vj3) objG : null;
                objK = new wv(kb5VarG, vj3Var != null ? vj3Var.y() : null);
                h02Var.i0(objK);
            }
            Object obj2 = (wv) objK;
            long j2 = h02Var.T;
            boolean zX2 = h02Var.x(obj2) | h02Var.v(j2);
            Object objK2 = h02Var.K();
            Object obj3 = objK2;
            if (zX2 || objK2 == obj) {
                pn0 pn0Var = new pn0(new xv(j2, objG));
                pn0Var.r = new ym0((byte) 20);
                h02Var.i0(pn0Var);
                obj3 = pn0Var;
            }
            pn0 pn0Var2 = (pn0) obj3;
            h02Var.X(-585307852);
            boolean zJ = h02Var.j(pn0Var2) | ((i3 & 112) == 32);
            Object objK3 = h02Var.K();
            byte b = 9;
            if (zJ || objK3 == obj) {
                objK3 = new p2(pn0Var2, my1Var, b);
                h02Var.i0(objK3);
            }
            k33.z((my1) objK3, h02Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i5 = i3 & 14;
            boolean zJ2 = h02Var.j(pn0Var2) | (i5 == 4);
            Object objK4 = h02Var.K();
            if (zJ2 || objK4 == obj) {
                objK4 = new yv(pn0Var2, z3);
                h02Var.i0(objK4);
            }
            aq2.n(boolValueOf, pn0Var2, null, (xy1) objK4, h02Var, i5);
            boolean zJ3 = h02Var.j(obj2) | h02Var.j(pn0Var2);
            Object objK5 = h02Var.K();
            if (zJ3 || objK5 == obj) {
                objK5 = new m(obj2, pn0Var2, b);
                h02Var.i0(objK5);
            }
            k33.t(obj2, pn0Var2, (xy1) objK5, h02Var);
            h02Var.b(false);
            z2 = z3;
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: zv
                @Override // defpackage.bz1
                public final Object l(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iJ = aq2.J(i | 1);
                    wy5.g(z2, my1Var, (h02) obj4, iJ, i2 ? 1 : 0);
                    return og5.g;
                }
            };
        }
    }

    public static final int r(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final void y(final he heVar, final String str, qj0 qj0Var, qj0 qj0Var2, o22 o22Var, cz1 cz1Var, h02 h02Var, final int i, final int i2) {
        o22 o22Var2;
        int i3;
        qj0 qj0Var3;
        cz1 cz1Var2;
        qj0 qj0Var4;
        final cz1 cz1Var3;
        final qj0 qj0Var5;
        final qj0 qj0Var6;
        final o22 o22Var3;
        h02Var.Z(899455099);
        int i4 = i | (h02Var.j(heVar) ? 4 : 2) | (h02Var.x(str) ? 32 : 16);
        int i5 = i4 | 1152;
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i4 | 25728;
            o22Var2 = o22Var;
        } else {
            o22Var2 = o22Var;
            i3 = i5 | (h02Var.x(o22Var2) ? 16384 : 8192);
        }
        if (((i3 | 1769472) & 599187) == 599186 && h02Var.e()) {
            h02Var.Q();
            qj0Var5 = qj0Var;
            qj0Var6 = qj0Var2;
            cz1Var3 = cz1Var;
            o22Var3 = o22Var2;
        } else {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                vf1 vf1Var = ep0.v;
                qj0 qj0Var7 = ((wf1) h02Var.a(vf1Var)).z;
                qj0 qj0Var8 = ((wf1) h02Var.a(vf1Var)).z;
                if (i6 != 0) {
                    o22Var2 = m22.g;
                }
                qj0Var3 = qj0Var8;
                cz1Var2 = xz5.g;
                qj0Var4 = qj0Var7;
            } else {
                h02Var.Q();
                qj0Var4 = qj0Var;
                qj0Var3 = qj0Var2;
                cz1Var2 = cz1Var;
            }
            o22 o22Var4 = o22Var2;
            h02Var.s();
            cz1Var3 = cz1Var2;
            xq2.y(o22Var4.n(new go5(u91.g)).n(new xn3(lr2.I(0.0f), lr2.I(4.0f), lr2.I(0.0f), lr2.I(4.0f))), 1, ue5.m0(-1373567849, new v80((Object) cz1Var2, (Object) qj0Var4, (Object) heVar, (Object) qj0Var3, (Object) str, (byte) 5), h02Var), h02Var, 3072, 2);
            qj0Var5 = qj0Var4;
            qj0Var6 = qj0Var3;
            o22Var3 = o22Var4;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(str, qj0Var5, qj0Var6, o22Var3, cz1Var3, i, i2) { // from class: w95
                public final /* synthetic */ qj0 a;
                public final /* synthetic */ byte c;
                public final /* synthetic */ qj0 m;
                public final /* synthetic */ o22 q;
                public final /* synthetic */ String t;
                public final /* synthetic */ cz1 w;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.c = i2;
                }

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(1);
                    wy5.y(this.j, this.t, this.a, this.m, this.q, this.w, (h02) obj, iJ, this.c);
                    return og5.g;
                }
            };
        }
    }
}
