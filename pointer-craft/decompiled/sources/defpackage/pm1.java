package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pm1 {
    public final /* synthetic */ qp3 a;
    public final /* synthetic */ rt1 g;
    public final /* synthetic */ ob3 j;
    public final /* synthetic */ yt4 l;
    public final /* synthetic */ qp3 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ ob3 r;
    public final /* synthetic */ xy1 t;
    public final /* synthetic */ String v;
    public final /* synthetic */ String x;
    public final /* synthetic */ boolean y;

    public pm1(rt1 rt1Var, boolean z, ob3 ob3Var, String str, String str2, String str3, yt4 yt4Var, ob3 ob3Var2, xy1 xy1Var, qp3 qp3Var, qp3 qp3Var2) {
        this.g = rt1Var;
        this.y = z;
        this.r = ob3Var;
        this.n = str;
        this.v = str2;
        this.x = str3;
        this.l = yt4Var;
        this.j = ob3Var2;
        this.t = xy1Var;
        this.a = qp3Var;
        this.m = qp3Var2;
    }

    public final void g(final boolean z, final my1 my1Var, j73 j73Var, rf4 rf4Var, boolean z2, cn4 cn4Var, long j, float f, final nm0 nm0Var, h02 h02Var, final int i, final int i2) {
        int i3;
        final j73 j73Var2;
        final rf4 rf4Var2;
        final boolean z3;
        final cn4 cn4Var2;
        final long j2;
        final float f2;
        rf4 rf4VarO;
        long jV;
        j73 j73Var3;
        float f3;
        cn4 cn4Var3;
        boolean z4;
        int i4;
        rf4 rf4Var3;
        boolean z5;
        j73 j73Var4;
        h02Var.Z(-126848451);
        int i5 = i | (h02Var.l(z) ? 4 : 2) | 919168384;
        if ((i2 & 6) == 0) {
            i3 = i2 | (h02Var.j(nm0Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.x(this) ? 32 : 16;
        }
        if (h02Var.N(i5 & 1, ((306783379 & i5) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            h02Var.S();
            if ((i & 1) == 0 || h02Var.k()) {
                rf4VarO = gp4.O(h02Var);
                float f4 = j43.g;
                cn4 cn4VarY = vn4.y(ue5.c, h02Var);
                jV = tj0.v(ue5.q, h02Var);
                float f5 = j43.g;
                j73Var3 = g73.g;
                f3 = f5;
                cn4Var3 = cn4VarY;
                z4 = true;
            } else {
                h02Var.Q();
                j73Var3 = j73Var;
                rf4VarO = rf4Var;
                z4 = z2;
                cn4Var3 = cn4Var;
                jV = j;
                f3 = f;
            }
            h02Var.s();
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                Object tp3Var = new tp3(og5.g, hi0.B);
                h02Var.i0(tp3Var);
                objK = tp3Var;
            }
            ob3 ob3Var = (ob3) objK;
            j51 j51Var = (j51) h02Var.a(hp0.j);
            WeakHashMap weakHashMap = yp5.k;
            int i6 = v13.t(h02Var).x.v().y;
            if (z) {
                h02Var.X(629991660);
                Object objK2 = h02Var.K();
                if (objK2 == obj) {
                    objK2 = new ef(ob3Var, (byte) 16);
                    h02Var.i0(objK2);
                }
                mf6.y((my1) objK2, h02Var, 6);
                h02Var.b(false);
            } else {
                rf4VarO = rf4VarO;
                h02Var.X(630077189);
                h02Var.b(false);
            }
            Object objK3 = h02Var.K();
            if (objK3 == obj) {
                objK3 = new pb3(Boolean.FALSE);
                h02Var.i0(objK3);
            }
            pb3 pb3Var = (pb3) objK3;
            boolean z6 = z4;
            pb3Var.r.setValue(Boolean.valueOf(z));
            if (((Boolean) pb3Var.y.getValue()).booleanValue() || ((Boolean) pb3Var.r.getValue()).booleanValue()) {
                h02Var.X(630396489);
                Object objK4 = h02Var.K();
                if (objK4 == obj) {
                    objK4 = kq2.M(new vb5(vb5.y));
                    h02Var.i0(objK4);
                }
                ob3 ob3Var2 = (ob3) objK4;
                boolean zX = h02Var.x(j51Var) | h02Var.n(i6);
                Object objK5 = h02Var.K();
                if (zX || objK5 == obj) {
                    objK5 = new rm1(j51Var, i6, ob3Var, new hb(ob3Var2, (byte) 1));
                    h02Var.i0(objK5);
                }
                rm1 rm1Var = (rm1) objK5;
                ((hm1) this.j.getValue()).getClass();
                ((Boolean) this.r.getValue()).getClass();
                boolean z7 = (7 & 4) != 0;
                Object systemService = ((Context) h02Var.a(sa.y)).getSystemService("accessibility");
                systemService.getClass();
                Object obj2 = (AccessibilityManager) systemService;
                boolean z8 = ((((0 & 896) ^ 384) > 256 && h02Var.l(z7)) || (0 & 384) == 256) | ((((0 & 112) ^ 48) > 32 && h02Var.l(true)) || (0 & 48) == 32) | ((((0 & 14) ^ 6) > 4 && h02Var.l(true)) || (0 & 6) == 4);
                Object objK6 = h02Var.K();
                if (z8 || objK6 == obj) {
                    objK6 = new cx2(true, true, z7);
                    h02Var.i0(objK6);
                }
                cx2 cx2Var = (cx2) objK6;
                gu2 gu2Var = (gu2) h02Var.a(ix2.g);
                boolean zX2 = h02Var.x(cx2Var) | h02Var.j(obj2);
                Object objK7 = h02Var.K();
                if (zX2 || objK7 == obj) {
                    objK7 = new m(cx2Var, obj2, (byte) 1);
                    h02Var.i0(objK7);
                }
                xy1 xy1Var = (xy1) objK7;
                boolean zX3 = h02Var.x(cx2Var) | h02Var.j(obj2);
                Object objK8 = h02Var.K();
                if (zX3 || objK8 == obj) {
                    i4 = 0;
                    objK8 = new p2(cx2Var, obj2, (byte) 0);
                    h02Var.i0(objK8);
                } else {
                    i4 = 0;
                }
                bg6.g(gu2Var, xy1Var, (my1) objK8, h02Var, i4);
                rf4Var3 = rf4VarO;
                z5 = z6;
                j73Var4 = j73Var3;
                j2 = jV;
                f2 = f3;
                cn4Var2 = cn4Var3;
                de.g(rm1Var, my1Var, new wv3(!((Boolean) cx2Var.getValue()).booleanValue() ? 393248 : 393216, true), ue5.m0(2063119149, new jm1(this, j73Var4, z5, pb3Var, ob3Var2, rf4Var3, cn4Var2, j2, f2, nm0Var), h02Var), h02Var, 3120, 0);
                h02Var.b(false);
            } else {
                h02Var.X(631807237);
                h02Var.b(false);
                rf4Var3 = rf4VarO;
                z5 = z6;
                j73Var4 = j73Var3;
                j2 = jV;
                f2 = f3;
                cn4Var2 = cn4Var3;
            }
            j73Var2 = j73Var4;
            rf4Var2 = rf4Var3;
            z3 = z5;
        } else {
            h02Var.Q();
            j73Var2 = j73Var;
            rf4Var2 = rf4Var;
            z3 = z2;
            cn4Var2 = cn4Var;
            j2 = j;
            f2 = f;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(z, my1Var, j73Var2, rf4Var2, z3, cn4Var2, j2, f2, nm0Var, i, i2) { // from class: im1
                public final /* synthetic */ my1 a;
                public final /* synthetic */ float b;
                public final /* synthetic */ cn4 c;
                public final /* synthetic */ long i;
                public final /* synthetic */ j73 m;
                public final /* synthetic */ int p;
                public final /* synthetic */ rf4 q;
                public final /* synthetic */ nm0 s;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ boolean w;

                {
                    this.p = i2;
                }

                @Override // defpackage.bz1
                public final Object l(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iJ = aq2.J(49);
                    int iJ2 = aq2.J(this.p);
                    this.j.g(this.t, this.a, this.m, this.q, this.w, this.c, this.i, this.b, this.s, (h02) obj3, iJ, iJ2);
                    return og5.g;
                }
            };
        }
    }
}
