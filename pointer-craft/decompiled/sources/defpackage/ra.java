package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Binder;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.appground.blek.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ra {
    public static final float A;
    public static final sj0 B;
    public static final sj0 C;
    public static final sj0 D;
    public static final StackTraceElement[] E;
    public static final qc5 F;
    public static final /* synthetic */ int G = 0;
    public static ha2 H;
    public static ha2 I;
    public static final nm0 a;
    public static final sj0 b;
    public static final nm0 c;
    public static final sj0 d;
    public static final in4 e;
    public static final float f;
    public static final l1 g;
    public static final sj0 h;
    public static final Class[] i;
    public static final nm0 j;
    public static final in4 k;
    public static final sj0 l;
    public static final nm0 m;
    public static final sj0 n;
    public static final sj0 o;
    public static final float p;
    public static final nm0 q;
    public static final sj0 r;
    public static final float s;
    public static final nm0 t;
    public static final float u;
    public static final sj0 v;
    public static final nm0 w;
    public static final sj0 x;
    public static final sj0 y = sj0.k;
    public static final float z;

    static {
        byte b2 = 0;
        g = new l1(b2);
        sj0 sj0Var = sj0.i;
        r = sj0Var;
        n = sj0.d;
        sj0 sj0Var2 = sj0.b;
        v = sj0Var2;
        x = sj0Var;
        l = sj0Var2;
        j = new nm0(-1836920808, false, new gg((byte) 16));
        t = new nm0(-324265303, false, new hn0((byte) 6));
        a = new nm0(1205835762, false, new gg((byte) 17));
        m = new nm0(2010538131, false, new gg((byte) 18));
        q = new nm0(420914449, false, new hn0((byte) 7));
        w = new nm0(1240739706, false, new hn0((byte) 8));
        c = new nm0(-1759434350, false, new on0((byte) 1));
        i = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
        b = sj0.z;
        s = 6.0f;
        p = 6.0f;
        u = 8.0f;
        z = 6.0f;
        sj0 sj0Var3 = sj0.c;
        h = sj0Var3;
        o = sj0.f;
        f = 56.0f;
        k = in4.q;
        d = sj0Var3;
        e = in4.c;
        A = 360.0f;
        B = sj0Var2;
        C = sj0Var2;
        D = sj0.B;
        E = new StackTraceElement[0];
        F = new qc5(b2);
    }

    public static final long B(AppWidgetProviderInfo appWidgetProviderInfo, DisplayMetrics displayMetrics) {
        int iMin = Math.min(appWidgetProviderInfo.minWidth, (appWidgetProviderInfo.resizeMode & 1) != 0 ? appWidgetProviderInfo.minResizeWidth : Integer.MAX_VALUE);
        int iMin2 = Math.min(appWidgetProviderInfo.minHeight, (appWidgetProviderInfo.resizeMode & 2) != 0 ? appWidgetProviderInfo.minResizeHeight : Integer.MAX_VALUE);
        float f2 = displayMetrics.density;
        return k33.m(iMin / f2, iMin2 / f2);
    }

    public static final boolean D(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static final boolean E(eh1 eh1Var) {
        String str = null;
        bj4 bj4Var = (bj4) eh1Var.g.g(cn0.s, null);
        zi4 zi4Var = bj4Var != null ? bj4Var.g : null;
        if (zi4Var != null) {
            Object obj = zi4Var.g.get(m50.q);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        return str == null || str.length() == 0;
    }

    public static final boolean F(tp tpVar) {
        int iG = tpVar.g();
        return Integer.MIN_VALUE <= iG && iG < -1;
    }

    public static final j73 G(j73 j73Var, cz1 cz1Var) {
        return j73Var.n(new yl2(cz1Var));
    }

    public static final long H(long j2, long j3, float f2) {
        ij3 ij3Var = wj0.k;
        long jG = jj0.g(j2, ij3Var);
        long jG2 = jj0.g(j3, ij3Var);
        float fR = jj0.r(jG);
        float fL = jj0.l(jG);
        float fX = jj0.x(jG);
        float fN = jj0.n(jG);
        float fR2 = jj0.r(jG2);
        float fL2 = jj0.l(jG2);
        float fX2 = jj0.x(jG2);
        float fN2 = jj0.n(jG2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return jj0.g(m(lr2.e(fL, fL2, f2), lr2.e(fX, fX2, f2), lr2.e(fN, fN2, f2), lr2.e(fR, fR2, f2), ij3Var), jj0.v(j3));
    }

    public static final void I(float[] fArr, float[] fArr2) {
        float fZ = z(fArr2, 0, fArr, 0);
        float fZ2 = z(fArr2, 0, fArr, 1);
        float fZ3 = z(fArr2, 0, fArr, 2);
        float fZ4 = z(fArr2, 0, fArr, 3);
        float fZ5 = z(fArr2, 1, fArr, 0);
        float fZ6 = z(fArr2, 1, fArr, 1);
        float fZ7 = z(fArr2, 1, fArr, 2);
        float fZ8 = z(fArr2, 1, fArr, 3);
        float fZ9 = z(fArr2, 2, fArr, 0);
        float fZ10 = z(fArr2, 2, fArr, 1);
        float fZ11 = z(fArr2, 2, fArr, 2);
        float fZ12 = z(fArr2, 2, fArr, 3);
        float fZ13 = z(fArr2, 3, fArr, 0);
        float fZ14 = z(fArr2, 3, fArr, 1);
        float fZ15 = z(fArr2, 3, fArr, 2);
        float fZ16 = z(fArr2, 3, fArr, 3);
        fArr[0] = fZ;
        fArr[1] = fZ2;
        fArr[2] = fZ3;
        fArr[3] = fZ4;
        fArr[4] = fZ5;
        fArr[5] = fZ6;
        fArr[6] = fZ7;
        fArr[7] = fZ8;
        fArr[8] = fZ9;
        fArr[9] = fZ10;
        fArr[10] = fZ11;
        fArr[11] = fZ12;
        fArr[12] = fZ13;
        fArr[13] = fZ14;
        fArr[14] = fZ15;
        fArr[15] = fZ16;
    }

    public static final void J(float[] fArr, float f2, float f3, float[] fArr2) {
        l33.n(fArr2);
        l33.x(fArr2, f2, f3);
        I(fArr, fArr2);
    }

    public static final bw4 K(h02 h02Var) {
        Context context = (Context) h02Var.a(sa.y);
        WeakHashMap weakHashMap = yp5.k;
        boolean zX = h02Var.x(v13.t(h02Var).l.toString());
        Object objK = h02Var.K();
        if (zX || objK == oo0.g) {
            objK = pt4.y(new sn(context, (byte) 3));
            h02Var.i0(objK);
        }
        return (bw4) objK;
    }

    public static final x03 L(pw5 pw5Var, xy1 xy1Var, h02 h02Var, int i2) {
        final pw5 pw5Var2;
        kq2.Q(pw5Var, h02Var);
        final ob3 ob3VarQ = kq2.Q(xy1Var, h02Var);
        Object[] objArr = new Object[0];
        Object objK = h02Var.K();
        Object obj = oo0.g;
        if (objK == obj) {
            objK = new y4((byte) 1);
            h02Var.i0(objK);
        }
        final String str = (String) xq2.f(objArr, (my1) objK, h02Var);
        f5 f5Var = (f5) h02Var.a(hx2.g);
        if (f5Var == null) {
            h02Var.X(1213380307);
            Object baseContext = (Context) h02Var.a(sa.y);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof f5) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            f5Var = (f5) baseContext;
        } else {
            h02Var.X(1213379439);
        }
        h02Var.b(false);
        if (f5Var == null) {
            l0.z("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        final wl0 wl0VarJ = f5Var.j();
        Object objK2 = h02Var.K();
        if (objK2 == obj) {
            objK2 = new w4();
            h02Var.i0(objK2);
        }
        final w4 w4Var = (w4) objK2;
        Object objK3 = h02Var.K();
        if (objK3 == obj) {
            objK3 = new x03(w4Var);
            h02Var.i0(objK3);
        }
        x03 x03Var = (x03) objK3;
        boolean zJ = h02Var.j(w4Var) | h02Var.j(wl0VarJ) | h02Var.x(str) | h02Var.j(pw5Var) | h02Var.x(ob3VarQ);
        Object objK4 = h02Var.K();
        if (zJ || objK4 == obj) {
            pw5Var2 = pw5Var;
            objK4 = new xy1() { // from class: c5
                @Override // defpackage.xy1
                public final Object a(Object obj2) {
                    b5 b5VarN = wl0VarJ.n(str, pw5Var2, new d5(ob3VarQ, (byte) 0));
                    w4 w4Var2 = w4Var;
                    w4Var2.g = b5VarN;
                    return new e5(w4Var2, (byte) 0);
                }
            };
            h02Var.i0(objK4);
        } else {
            pw5Var2 = pw5Var;
        }
        xy1 xy1Var2 = (xy1) objK4;
        boolean zX = h02Var.x(wl0VarJ) | h02Var.x(str) | h02Var.x(pw5Var2);
        Object objK5 = h02Var.K();
        if (zX || objK5 == obj) {
            objK5 = new ua1(xy1Var2);
            h02Var.i0(objK5);
        }
        return x03Var;
    }

    public static final nc5 M(g90 g90Var, String str, h02 h02Var, int i2) {
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        byte b2 = 0;
        boolean z3 = (i3 > 4 && h02Var.x(g90Var)) || (i2 & 6) == 4;
        Object objK = h02Var.K();
        Object obj = oo0.g;
        mu0 mu0Var = null;
        if (z3 || objK == obj) {
            at4 at4VarM = js2.m();
            xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
            at4 at4VarB = js2.b(at4VarM);
            try {
                Object nc5Var = new nc5(g90Var, null, str);
                js2.z(at4VarM, at4VarB, xy1VarV);
                h02Var.i0(nc5Var);
                objK = nc5Var;
            } catch (Throwable th) {
                js2.z(at4VarM, at4VarB, xy1VarV);
                throw th;
            }
        }
        nc5 nc5Var2 = (nc5) objK;
        if (g90Var instanceof lh4) {
            h02Var.X(-1357398105);
            Object objK2 = h02Var.K();
            if (objK2 == obj) {
                objK2 = k33.E(h02Var);
                h02Var.i0(objK2);
            }
            Object obj2 = (ox0) objK2;
            boolean zJ = h02Var.j(obj2) | ((i3 > 4 && h02Var.x(g90Var)) || (i2 & 6) == 4);
            Object objK3 = h02Var.K();
            if (zJ || objK3 == obj) {
                objK3 = new xf(g90Var, obj2, (byte) 29);
                h02Var.i0(objK3);
            }
            k33.j(obj2, (xy1) objK3, h02Var);
            lh4 lh4Var = (lh4) g90Var;
            Object value = lh4Var.r.getValue();
            Object value2 = lh4Var.y.getValue();
            if ((i3 <= 4 || !h02Var.x(g90Var)) && (i2 & 6) != 4) {
                z2 = false;
            }
            Object objK4 = h02Var.K();
            if (z2 || objK4 == obj) {
                objK4 = new zh(g90Var, mu0Var, (byte) 15);
                h02Var.i0(objK4);
            }
            k33.s(value, value2, (bz1) objK4, h02Var);
            h02Var.b(false);
        } else {
            h02Var.X(-1356407283);
            nc5Var2.g(g90Var.v(), h02Var, 0);
            h02Var.b(false);
        }
        boolean zX = h02Var.x(nc5Var2);
        Object objK5 = h02Var.K();
        if (zX || objK5 == obj) {
            objK5 = new oc5(nc5Var2, b2);
            h02Var.i0(objK5);
        }
        k33.j(nc5Var2, (xy1) objK5, h02Var);
        return nc5Var2;
    }

    public static Object N(bz1 bz1Var) {
        return v70.N(ni1.j, bz1Var);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a1 A[PHI: r0
  0x00a1: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x009f, B:57:0x00a4, B:60:0x00a8, B:63:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object O(cu1 cu1Var, int i2, xy1 xy1Var) {
        int i3;
        int i4;
        Object objA;
        i73 i73VarQ;
        iq2 iq2VarU0;
        ah3 ah3Var;
        if (!cu1Var.j.h) {
            mc2.y("visitAncestors called on an unattached node");
        }
        i73 i73Var = cu1Var.j.q;
        um2 um2VarV = k33.V(cu1Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objA = null;
            if (um2VarV == null) {
                i73VarQ = null;
                break;
            }
            if ((um2VarV.M.x.m & 1024) != 0) {
                while (i73Var != null) {
                    if ((i73Var.a & 1024) != 0) {
                        i73VarQ = i73Var;
                        rb3 rb3Var = null;
                        while (i73VarQ != null) {
                            if (i73VarQ instanceof cu1) {
                                break loop0;
                            }
                            if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                int i5 = 0;
                                for (i73 i73Var2 = ((p41) i73VarQ).f; i73Var2 != null; i73Var2 = i73Var2.w) {
                                    if ((i73Var2.a & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            i73VarQ = i73Var2;
                                        } else {
                                            if (rb3Var == null) {
                                                rb3Var = new rb3(new i73[16]);
                                            }
                                            if (i73VarQ != null) {
                                                rb3Var.y(i73VarQ);
                                                i73VarQ = null;
                                            }
                                            rb3Var.y(i73Var2);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            i73VarQ = k33.Q(rb3Var);
                        }
                    }
                    i73Var = i73Var.q;
                }
            }
            um2VarV = um2VarV.o();
            i73Var = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
        }
        cu1 cu1Var2 = (cu1) i73VarQ;
        if ((cu1Var2 == null || !yf2.p(cu1Var2.U0(), cu1Var.U0())) && (iq2VarU0 = cu1Var.U0()) != null) {
            int i6 = 5;
            if (i2 == 5) {
                i4 = i6;
            } else {
                i6 = 6;
                if (i2 == 6) {
                    i4 = i6;
                } else {
                    i6 = 3;
                    if (i2 == 3) {
                        i4 = i6;
                    } else {
                        i6 = 4;
                        if (i2 == 4) {
                            i4 = i6;
                        } else if (i2 == 1) {
                            i4 = 2;
                        } else if (i2 != 2) {
                            l0.z("Unsupported direction for beyond bounds layout");
                        }
                    }
                }
            }
            if (iq2VarU0.o.g() <= 0 || !iq2VarU0.o.r() || !iq2VarU0.h) {
                return xy1Var.a(iq2.d);
            }
            boolean zR0 = iq2VarU0.R0(i4);
            jq2 jq2Var = iq2VarU0.o;
            int iY = zR0 ? jq2Var.y() : jq2Var.v();
            u54 u54Var = new u54();
            y22 y22Var = iq2VarU0.f;
            y22Var.getClass();
            eq2 eq2Var = new eq2(iY, iY);
            ((rb3) y22Var.t).y(eq2Var);
            u54Var.j = eq2Var;
            int iN = iq2VarU0.o.n() * 2;
            int iG = iq2VarU0.o.g();
            if (iN > iG) {
                iN = iG;
            }
            while (objA == null && iq2VarU0.Q0((eq2) u54Var.j, i4) && i3 < iN) {
                eq2 eq2Var2 = (eq2) u54Var.j;
                int i7 = eq2Var2.g;
                int i8 = eq2Var2.y;
                if (iq2VarU0.R0(i4)) {
                    i8++;
                } else {
                    i7--;
                }
                y22 y22Var2 = iq2VarU0.f;
                y22Var2.getClass();
                eq2 eq2Var3 = new eq2(i7, i8);
                ((rb3) y22Var2.t).y(eq2Var3);
                ((rb3) iq2VarU0.f.t).q((eq2) u54Var.j);
                u54Var.j = eq2Var3;
                i3++;
                k33.V(iq2VarU0).q();
                objA = xy1Var.a(new hq2(iq2VarU0, u54Var, i4));
            }
            ((rb3) iq2VarU0.f.t).q((eq2) u54Var.j);
            k33.V(iq2VarU0).q();
            return objA;
        }
        return null;
    }

    public static final j73 P(j73 j73Var, boolean z2, ja3 ja3Var, hb2 hb2Var, boolean z3, o94 o94Var, my1 my1Var) {
        j73 j73VarN;
        if (hb2Var != null) {
            j73VarN = new ci4(z2, ja3Var, hb2Var, z3, o94Var, my1Var);
        } else if (hb2Var == null) {
            j73VarN = new ci4(z2, ja3Var, null, z3, o94Var, my1Var);
        } else {
            g73 g73Var = g73.g;
            j73VarN = ja3Var != null ? db2.g(g73Var, ja3Var, hb2Var).n(new ci4(z2, ja3Var, null, z3, o94Var, my1Var)) : m50.F(g73Var, new di4(hb2Var, z2, z3, o94Var, my1Var, (byte) 0));
        }
        return j73Var.n(j73VarN);
    }

    public static void S(ji jiVar, float f2) {
        ia4 ia4Var = (ia4) jiVar.t;
        xb0 xb0Var = (xb0) jiVar.a;
        boolean useCompatPadding = xb0Var.getUseCompatPadding();
        boolean preventCornerOverlap = xb0Var.getPreventCornerOverlap();
        if (f2 != ia4Var.v || ia4Var.x != useCompatPadding || ia4Var.l != preventCornerOverlap) {
            ia4Var.v = f2;
            ia4Var.x = useCompatPadding;
            ia4Var.l = preventCornerOverlap;
            ia4Var.y(null);
            ia4Var.invalidateSelf();
        }
        if (!xb0Var.getUseCompatPadding()) {
            jiVar.W(0, 0, 0, 0);
            return;
        }
        ia4 ia4Var2 = (ia4) jiVar.t;
        float f3 = ia4Var2.v;
        float f4 = ia4Var2.g;
        int iCeil = (int) Math.ceil(ja4.g(f3, f4, xb0Var.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(ja4.y(f3, f4, xb0Var.getPreventCornerOverlap()));
        jiVar.W(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static final int U(long j2) {
        float[] fArr = wj0.g;
        return (int) (jj0.g(j2, wj0.v) >>> 32);
    }

    public static final nc5 V(Object obj, String str, h02 h02Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object objK = h02Var.K();
        l76 l76Var = oo0.g;
        if (objK == l76Var) {
            objK = new nc5(new pb3(obj), null, str);
            h02Var.i0(objK);
        }
        nc5 nc5Var = (nc5) objK;
        nc5Var.g(obj, h02Var, (i2 & 8) | 48 | (i2 & 14));
        Object objK2 = h02Var.K();
        if (objK2 == l76Var) {
            objK2 = new oc5(nc5Var, (byte) 1);
            h02Var.i0(objK2);
        }
        k33.j(nc5Var, (xy1) objK2, h02Var);
        return nc5Var;
    }

    public static final void a(int i2, nm0 nm0Var, h02 h02Var, boolean z2) {
        int i3;
        boolean z3;
        Object obj;
        q8 q8Var;
        int i4;
        j73 j73VarS;
        Object obj2;
        boolean z4;
        Object obj3;
        Object obj4;
        h02Var.Z(-1180024165);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (h02Var.l(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b3 = 18;
        byte b4 = 1;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) h02Var.a(sa.y);
            gx3 gx3Var = (gx3) h02Var.a(gp0.y);
            j51 j51Var = (j51) h02Var.a(hp0.j);
            boolean zX = h02Var.x(j51Var);
            Object objK = h02Var.K();
            Object obj5 = oo0.g;
            if (zX || objK == obj5) {
                obj = objK;
                Object z6Var = new z6(j51Var, (byte) 15);
                h02Var.i0(z6Var);
                obj = z6Var;
            }
            gd1 gd1Var = new gd1();
            ((xy1) obj).a(gd1Var);
            float[] fArr = gd1Var.y;
            ArrayList arrayList = gd1Var.g;
            int size = arrayList.size();
            a11.t(size, fArr.length);
            float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
            fArrCopyOfRange.getClass();
            l11 l11Var = new l11(arrayList, fArrCopyOfRange);
            qe5 qe5VarE0 = m50.e0(0, 0, null, 7);
            c11 c11VarG = vu4.g(h02Var);
            Object objK2 = h02Var.K();
            if (objK2 == obj5) {
                q21 q21Var = new q21(b3);
                j7 j7Var = new j7(j51Var, b4);
                l1 l1Var = new l1((byte) 5);
                ac1 ac1Var = ac1.j;
                q8 q8Var2 = new q8(ac1Var, l1Var);
                q8Var2.w.setValue(l11Var);
                q8Var2.x(ac1Var);
                q8Var2.y = q21Var;
                q8Var2.r = j7Var;
                q8Var2.n = qe5VarE0;
                q8Var2.v = c11VarG;
                h02Var.i0(q8Var2);
                objK2 = q8Var2;
            }
            q8 q8Var3 = (q8) objK2;
            bw4 bw4VarK = K(h02Var);
            if (((Boolean) bw4VarK.getValue()).booleanValue()) {
                h02Var.X(207757356);
                boolean zJ = h02Var.j(context);
                Object objK3 = h02Var.K();
                if (zJ || objK3 == obj5) {
                    obj4 = objK3;
                    Object snVar = new sn(context, b2);
                    h02Var.i0(snVar);
                    obj4 = snVar;
                }
                wy5.g(false, (my1) obj4, h02Var, 0, 1);
                h02Var.b(false);
            } else {
                h02Var.X(207844807);
                h02Var.b(false);
            }
            if (((Boolean) bw4VarK.getValue()).booleanValue()) {
                h02Var.X(207879930);
                boolean zJ2 = h02Var.j(context);
                Object objK4 = h02Var.K();
                if (zJ2 || objK4 == obj5) {
                    z4 = false;
                    Object iy1Var = new iy1(context, false ? 1 : 0);
                    h02Var.i0(iy1Var);
                    obj3 = iy1Var;
                } else {
                    z4 = false;
                    obj3 = objK4;
                }
                k33.j(og5.g, (xy1) obj3, h02Var);
                h02Var.b(z4);
            } else {
                h02Var.X(208230695);
                h02Var.b(false);
            }
            Object value = q8Var3.j.getValue();
            byte b5 = 14;
            boolean zX2 = h02Var.x(q8Var3) | ((i3 & 14) == 4) | h02Var.j(gx3Var) | h02Var.j(context);
            Object objK5 = h02Var.K();
            if (zX2 || objK5 == obj5) {
                q8Var = q8Var3;
                Object ky1Var = new ky1(z2, q8Var, gx3Var, context, null);
                z3 = z2;
                h02Var.i0(ky1Var);
                objK5 = ky1Var;
            } else {
                q8Var = q8Var3;
                z3 = z2;
            }
            k33.b((bz1) objK5, h02Var, value);
            if (z3) {
                h02Var.X(208710761);
                j73 j73VarN = og0.n(q8Var);
                boolean zX3 = h02Var.x(q8Var);
                Object objK6 = h02Var.K();
                if (zX3 || objK6 == obj5) {
                    obj2 = objK6;
                    Object z6Var2 = new z6(q8Var, b5);
                    h02Var.i0(z6Var2);
                    obj2 = z6Var2;
                }
                j73VarS = yf2.S(j73VarN, (xy1) obj2);
                i4 = 0;
                h02Var.b(false);
            } else {
                i4 = 0;
                h02Var.X(-131804669);
                h02Var.b(false);
                j73VarS = g73.g;
            }
            gp4.n(!((Boolean) bw4VarK.getValue()).booleanValue(), j73VarS, yj1.n(m50.e0(i4, i4, null, 7), 12), yj1.t(m50.e0(i4, i4, null, 7), 14), null, nm0Var, h02Var, 200064, 16);
        } else {
            z3 = z2;
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new jy1(z3, nm0Var, i2);
        }
    }

    public static final cc5 b(nc5 nc5Var, te5 te5Var, String str, h02 h02Var, int i2, int i3) {
        bc5 bc5Var;
        byte b2 = 2;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zX = h02Var.x(nc5Var);
        Object objK = h02Var.K();
        Object obj = oo0.g;
        if (zX || objK == obj) {
            objK = new cc5(nc5Var, te5Var, str);
            h02Var.i0(objK);
        }
        cc5 cc5Var = (cc5) objK;
        boolean zX2 = h02Var.x(nc5Var) | h02Var.j(cc5Var);
        Object objK2 = h02Var.K();
        if (zX2 || objK2 == obj) {
            objK2 = new pc5(nc5Var, cc5Var, b2);
            h02Var.i0(objK2);
        }
        k33.j(cc5Var, (xy1) objK2, h02Var);
        if (nc5Var.l() && (bc5Var = (bc5) cc5Var.y.getValue()) != null) {
            nc5 nc5Var2 = cc5Var.r;
            bc5Var.j.x(bc5Var.a.a(nc5Var2.x().g()), bc5Var.a.a(nc5Var2.x().r()), (no1) bc5Var.t.a(nc5Var2.x()));
        }
        return cc5Var;
    }

    public static final long c(long j2, long j3) {
        float f2;
        float f3;
        long jG = jj0.g(j2, jj0.v(j3));
        float fR = jj0.r(j3);
        float fR2 = jj0.r(jG);
        float f4 = 1.0f - fR2;
        float f5 = (fR * f4) + fR2;
        float fL = jj0.l(jG);
        float fL2 = jj0.l(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fL2 * fR) * f4) + (fL * fR2)) / f5;
        }
        float fX = jj0.x(jG);
        float fX2 = jj0.x(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fX2 * fR) * f4) + (fX * fR2)) / f5;
        }
        float fN = jj0.n(jG);
        float fN2 = jj0.n(j3);
        if (f5 != 0.0f) {
            f6 = (((fN2 * fR) * f4) + (fN * fR2)) / f5;
        }
        return m(f2, f3, f6, f5, jj0.v(j3));
    }

    public static final ha2 d(g61 g61Var) {
        g61Var.getClass();
        int i2 = g61Var.a;
        if (i2 == 0) {
            return v70.h();
        }
        if (i2 == 256) {
            ha2 ha2Var = I;
            if (ha2Var != null) {
                return ha2Var;
            }
            ga2 ga2Var = new ga2("Outlined.Laptop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i3 = fj5.g;
            cu4 cu4Var = new cu4(jj0.y);
            kq3 kq3VarJ = du4.j(20.0f, 18.0f);
            kq3VarJ.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            kq3VarJ.q(6.0f);
            kq3VarJ.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            kq3VarJ.n(4.0f);
            kq3VarJ.y(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
            kq3VarJ.w(10.0f);
            kq3VarJ.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            kq3VarJ.n(0.0f);
            kq3VarJ.w(2.0f);
            kq3VarJ.v(24.0f);
            kq3VarJ.w(-2.0f);
            kq3VarJ.n(20.0f);
            kq3VarJ.g();
            kq3VarJ.j(4.0f, 6.0f);
            kq3VarJ.v(16.0f);
            kq3VarJ.w(10.0f);
            kq3VarJ.n(4.0f);
            kq3VarJ.q(6.0f);
            kq3VarJ.g();
            ga2.g(ga2Var, kq3VarJ.g, 0, cu4Var);
            ha2 ha2VarY = ga2Var.y();
            I = ha2VarY;
            return ha2VarY;
        }
        if (i2 == 512) {
            return br2.o();
        }
        if (i2 == 768) {
            return af6.y();
        }
        if (i2 == 1024) {
            return sg6.w();
        }
        if (i2 == 1280) {
            return js2.q();
        }
        if (i2 == 1536) {
            return wa6.v();
        }
        if (i2 == 1792) {
            return hb6.a();
        }
        if (i2 == 2048) {
            return dz5.v();
        }
        if (i2 == 2304) {
            return tg6.r();
        }
        ha2 ha2Var2 = m50.f;
        if (ha2Var2 != null) {
            return ha2Var2;
        }
        ga2 ga2Var2 = new ga2("Outlined.DeviceUnknown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i4 = fj5.g;
        cu4 cu4Var2 = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(17.0f, 1.0f);
        kq3Var.x(7.0f, 1.0f);
        kq3Var.r(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        kq3Var.w(18.0f);
        kq3Var.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kq3Var.v(10.0f);
        kq3Var.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kq3Var.x(19.0f, 3.0f);
        kq3Var.r(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kq3Var.g();
        kq3Var.j(17.0f, 19.0f);
        kq3Var.x(7.0f, 19.0f);
        kq3Var.x(7.0f, 5.0f);
        kq3Var.v(10.0f);
        kq3Var.w(14.0f);
        kq3Var.g();
        kq3Var.j(12.0f, 6.72f);
        kq3Var.r(-1.96f, 0.0f, -3.5f, 1.52f, -3.5f, 3.47f);
        kq3Var.v(1.75f);
        kq3Var.r(0.0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f);
        kq3Var.m(1.75f, 0.82f, 1.75f, 1.75f);
        kq3Var.r(0.0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f);
        kq3Var.v(1.76f);
        kq3Var.r(0.0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f);
        kq3Var.r(0.0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f);
        kq3Var.g();
        kq3Var.j(11.0f, 16.0f);
        kq3Var.v(2.0f);
        kq3Var.w(2.0f);
        kq3Var.v(-2.0f);
        kq3Var.w(-2.0f);
        kq3Var.g();
        ga2.g(ga2Var2, kq3Var.g, 0, cu4Var2);
        ha2 ha2VarY2 = ga2Var2.y();
        m50.f = ha2VarY2;
        return ha2VarY2;
    }

    public static final v81 e(g61 g61Var) {
        g61Var.getClass();
        int i2 = g61Var.c;
        t81 t81Var = t81.r;
        if (i2 == 0) {
            return t81Var;
        }
        if (i2 == 1) {
            return s81.r;
        }
        if (i2 != 2) {
            return i2 != 3 ? t81Var : u81.r;
        }
        return r81.r;
    }

    public static final mo0 f(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (mo0) weakReference.get();
        }
        return null;
    }

    public static final void g(gk0 gk0Var, Object obj, nm0 nm0Var, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(1599578497);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.x(gk0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? h02Var.x(obj) : h02Var.j(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var.j(nm0Var) ? 256 : 128;
        }
        byte b2 = 1;
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            gp4.y(gk0Var, obj != null, null, null, null, null, ue5.m0(2125052841, new ev0(obj, nm0Var, b2), h02Var), h02Var, (i3 & 14) | 1572864, 30);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new je(gk0Var, obj, nm0Var, i2, (byte) 2);
        }
    }

    public static final int h(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objS = sp2.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return i4;
    }

    public static final boolean i(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final void j(he heVar, String str, o22 o22Var, int i2, mj0 mj0Var, h02 h02Var, final int i3) {
        h02 h02Var2;
        final he heVar2;
        final String str2;
        final o22 o22Var2;
        final mj0 mj0Var2;
        final int i4;
        h02Var.Z(491792371);
        int i5 = (h02Var.x(heVar) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i5 |= h02Var.x(str) ? 32 : 16;
        }
        int i6 = i5 | (h02Var.x(o22Var) ? 256 : 128) | 3072 | (h02Var.j(mj0Var) ? 16384 : 8192);
        if ((i6 & 9363) == 9362 && h02Var.e()) {
            h02Var.Q();
            h02Var2 = h02Var;
            mj0Var2 = mj0Var;
            i4 = i2;
            o22Var2 = o22Var;
            str2 = str;
            heVar2 = heVar;
        } else {
            h02Var2 = h02Var;
            t(heVar, str, o22Var, mj0Var, h02Var2, (i6 & 14) | 196608 | (i6 & 112) | (i6 & 896) | 3072 | (i6 & 57344));
            heVar2 = heVar;
            str2 = str;
            o22Var2 = o22Var;
            mj0Var2 = mj0Var;
            i4 = 1;
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: da2
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i3 | 1);
                    he heVar3 = heVar2;
                    String str3 = str2;
                    o22 o22Var3 = o22Var2;
                    boolean z2 = i4;
                    mj0 mj0Var3 = mj0Var2;
                    ra.j(heVar3, str3, o22Var3, z2 ? 1 : 0, mj0Var3, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static final ha2 k() {
        ha2 ha2Var = H;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.DashboardCustomize", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = fj5.g;
        long j2 = jj0.y;
        cu4 cu4Var = new cu4(j2);
        kq3 kq3Var = new kq3();
        kq3Var.j(3.0f, 11.0f);
        kq3Var.v(8.0f);
        kq3Var.q(3.0f);
        kq3Var.n(3.0f);
        kq3Var.q(11.0f);
        kq3Var.g();
        kq3Var.j(5.0f, 5.0f);
        kq3Var.v(4.0f);
        kq3Var.w(4.0f);
        kq3Var.n(5.0f);
        kq3Var.q(5.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        cu4 cu4Var2 = new cu4(j2);
        kq3 kq3Var2 = new kq3();
        kq3Var2.j(13.0f, 3.0f);
        kq3Var2.w(8.0f);
        kq3Var2.v(8.0f);
        kq3Var2.q(3.0f);
        kq3Var2.n(13.0f);
        kq3Var2.g();
        kq3Var2.j(19.0f, 9.0f);
        kq3Var2.v(-4.0f);
        kq3Var2.q(5.0f);
        kq3Var2.v(4.0f);
        kq3Var2.q(9.0f);
        kq3Var2.g();
        ga2.g(ga2Var, kq3Var2.g, 0, cu4Var2);
        cu4 cu4Var3 = new cu4(j2);
        kq3 kq3Var3 = new kq3();
        kq3Var3.j(3.0f, 21.0f);
        kq3Var3.v(8.0f);
        kq3Var3.w(-8.0f);
        kq3Var3.n(3.0f);
        kq3Var3.q(21.0f);
        kq3Var3.g();
        kq3Var3.j(5.0f, 15.0f);
        kq3Var3.v(4.0f);
        kq3Var3.w(4.0f);
        kq3Var3.n(5.0f);
        kq3Var3.q(15.0f);
        kq3Var3.g();
        ga2.g(ga2Var, kq3Var3.g, 0, cu4Var3);
        cu4 cu4Var4 = new cu4(j2);
        kq3 kq3Var4 = new kq3();
        kq3Var4.j(18.0f, 13.0f);
        kq3Var4.l(-2.0f, 0.0f);
        kq3Var4.l(0.0f, 3.0f);
        kq3Var4.l(-3.0f, 0.0f);
        kq3Var4.l(0.0f, 2.0f);
        kq3Var4.l(3.0f, 0.0f);
        kq3Var4.l(0.0f, 3.0f);
        kq3Var4.l(2.0f, 0.0f);
        kq3Var4.l(0.0f, -3.0f);
        kq3Var4.l(3.0f, 0.0f);
        kq3Var4.l(0.0f, -2.0f);
        kq3Var4.l(-3.0f, 0.0f);
        kq3Var4.g();
        ga2.g(ga2Var, kq3Var4.g, 0, cu4Var4);
        ha2 ha2VarY = ga2Var.y();
        H = ha2VarY;
        return ha2VarY;
    }

    public static final void l(int i2, my1 my1Var, h02 h02Var, j73 j73Var) {
        h02 h02Var2;
        h02Var.Z(-1874755656);
        int i3 = i2 | 6 | (h02Var.j(my1Var) ? 32 : 16);
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) h02Var.a(sa.y);
            gx3 gx3Var = (gx3) h02Var.a(gp0.y);
            boolean zJ = h02Var.j(gx3Var) | h02Var.j(context) | ((i3 & 112) == 32);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new un(gx3Var, my1Var, context);
                h02Var.i0(objK);
            }
            nm0 nm0Var = k33.y;
            g73 g73Var = g73.g;
            h02Var2 = h02Var;
            k33.w((my1) objK, g73Var, false, null, null, nm0Var, h02Var2, 1572912, 60);
            j73Var = g73Var;
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new hy1(j73Var, my1Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long m(float f2, float f3, float f4, float f5, uj0 uj0Var) {
        int i2;
        int i3;
        int i4;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (uj0Var.r()) {
            long j2 = ((long) ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32;
            int i19 = jj0.t;
            return j2;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f2);
        int i20 = iFloatToRawIntBits3 >>> 31;
        int i21 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i22 = iFloatToRawIntBits3 & 8388607;
        int i23 = 49;
        int i24 = 0;
        if (i21 == 255) {
            i3 = i22 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i21 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else {
                if (i2 > 0) {
                    int i25 = i22 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i25) + 1) | (i20 << 15);
                    } else {
                        i3 = i25;
                    }
                    short s2 = (short) i4;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f3);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i8 = 49;
                            i10 = 0;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s3 = (short) i11;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i16 = i14 - 112;
                                    if (i16 < 31) {
                                        if (i16 <= 0) {
                                            i24 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                            } else {
                                                i23 = i16;
                                            }
                                        } else if (i16 >= -10) {
                                            i18 = (i15 | 8388608) >> (1 - i16);
                                            if ((i18 & 4096) != 0) {
                                                i18 += 8192;
                                            }
                                            i23 = 0;
                                            i24 = i18 >> 13;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) uj0Var.r) & 63);
                                    int i26 = jj0.t;
                                    return jMax;
                                }
                                i24 = i15 == 0 ? 0 : 512;
                                i23 = 31;
                                i17 = (i13 << 15) | (i23 << 10) | i24;
                                long jMax2 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) uj0Var.r) & 63);
                                int i27 = jj0.t;
                                return jMax2;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s4 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i24 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | 8388608) >> (1 - i16);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i23 = 0;
                                i24 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s4) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) uj0Var.r) & 63);
                        int i28 = jj0.t;
                        return jMax3;
                    }
                    i24 = i15 == 0 ? 0 : 512;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i24;
                    long jMax4 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s4) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) uj0Var.r) & 63);
                    int i29 = jj0.t;
                    return jMax4;
                }
                if (i2 >= -10) {
                    int i30 = (i22 | 8388608) >> (1 - i2);
                    if ((i30 & 4096) != 0) {
                        i30 += 8192;
                    }
                    i3 = i30 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i20 << 15) | (i2 << 10);
        short s5 = (short) i4;
        iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i8 = 49;
                i10 = 0;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s6 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i24 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | 8388608) >> (1 - i16);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i23 = 0;
                                i24 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) uj0Var.r) & 63);
                        int i210 = jj0.t;
                        return jMax5;
                    }
                    i24 = i15 == 0 ? 0 : 512;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i24;
                    long jMax6 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) uj0Var.r) & 63);
                    int i211 = jj0.t;
                    return jMax6;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s7 = (short) i11;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i16 = i14 - 112;
            if (i16 < 31) {
                if (i16 <= 0) {
                    i24 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                    } else {
                        i23 = i16;
                    }
                } else if (i16 >= -10) {
                    i18 = (i15 | 8388608) >> (1 - i16);
                    if ((i18 & 4096) != 0) {
                        i18 += 8192;
                    }
                    i23 = 0;
                    i24 = i18 >> 13;
                } else {
                    i23 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s7) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) uj0Var.r) & 63);
            int i212 = jj0.t;
            return jMax7;
        }
        i24 = i15 == 0 ? 0 : 512;
        i23 = 31;
        i17 = (i13 << 15) | (i23 << 10) | i24;
        long jMax8 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s7) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) uj0Var.r) & 63);
        int i213 = jj0.t;
        return jMax8;
    }

    public static final long n(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = jj0.t;
        return j2;
    }

    public static final View o(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(h(view, R.id.view_tree_lifecycle_owner), h(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (f(view) == null) {
                i2++;
                Object objS = sp2.s(view);
                View view4 = view2;
                view2 = view;
                view = objS instanceof View ? (View) objS : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final hc5 p(nc5 nc5Var, Object obj, Object obj2, no1 no1Var, te5 te5Var, h02 h02Var, int i2) {
        boolean zX = h02Var.x(nc5Var);
        Object objK = h02Var.K();
        Object obj3 = oo0.g;
        if (zX || objK == obj3) {
            at4 at4VarM = js2.m();
            xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
            at4 at4VarB = js2.b(at4VarM);
            try {
                vi viVar = (vi) te5Var.g.a(obj2);
                viVar.n();
                objK = new hc5(nc5Var, obj, viVar, te5Var);
                js2.z(at4VarM, at4VarB, xy1VarV);
                h02Var.i0(objK);
            } catch (Throwable th) {
                js2.z(at4VarM, at4VarB, xy1VarV);
                throw th;
            }
        }
        hc5 hc5Var = (hc5) objK;
        q(nc5Var, hc5Var, obj, obj2, no1Var, h02Var, 0);
        boolean zX2 = h02Var.x(nc5Var) | h02Var.x(hc5Var);
        Object objK2 = h02Var.K();
        if (zX2 || objK2 == obj3) {
            objK2 = new xf(nc5Var, hc5Var, (byte) 28);
            h02Var.i0(objK2);
        }
        k33.j(hc5Var, (xy1) objK2, h02Var);
        return hc5Var;
    }

    public static final void q(nc5 nc5Var, hc5 hc5Var, Object obj, Object obj2, no1 no1Var, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(867041821);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.x(nc5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.x(hc5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? h02Var.x(obj) : h02Var.j(obj) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? h02Var.x(obj2) : h02Var.j(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? h02Var.x(no1Var) : h02Var.j(no1Var) ? 16384 : 8192;
        }
        if (!h02Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            h02Var.Q();
        } else if (nc5Var.l()) {
            hc5Var.x(obj, obj2, no1Var);
        } else {
            hc5Var.l(obj2, no1Var, null, null);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new cc(nc5Var, hc5Var, obj, obj2, no1Var, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:109:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x016a  */
    /* JADX WARN: Code duplicated, block: B:114:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0176  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0184  */
    /* JADX WARN: Code duplicated, block: B:122:0x0186  */
    /* JADX WARN: Code duplicated, block: B:124:0x018c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    public static final long r(float f2, float f3, float f4, float f5, uj0 uj0Var) {
        int i2;
        int i3;
        int i4;
        float fY;
        float fG;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float fY2;
        float fG2;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f6;
        if (uj0Var.r()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i23 = i22 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j2 = ((long) (i23 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i24 = jj0.t;
            return j2;
        }
        int i25 = uj0Var.r;
        if (i25 == -1) {
            lc2.g("Unknown color space, please use a color space in ColorSpaces");
        }
        int i26 = 0;
        float fY3 = uj0Var.y(0);
        float fG3 = uj0Var.g(0);
        if (f2 >= fY3) {
            fY3 = f2;
        }
        if (fY3 <= fG3) {
            fG3 = fY3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fG3);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        if (i28 == 255) {
            i3 = i29 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i28 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else {
                if (i2 > 0) {
                    int i30 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i30) + 1) | (i27 << 15);
                    } else {
                        i3 = i30;
                    }
                    short s2 = (short) i4;
                    fY = uj0Var.y(1);
                    fG = uj0Var.g(1);
                    if (f3 >= fY) {
                        fY = f3;
                    }
                    if (fY <= fG) {
                        fG = fY;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fG);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i10 = 0;
                            i8 = 49;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s3 = (short) i11;
                                fY2 = uj0Var.y(2);
                                fG2 = uj0Var.g(2);
                                if (f4 >= fY2) {
                                    fY2 = f4;
                                }
                                if (fY2 <= fG2) {
                                    fG2 = fY2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fG2);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i18 = i15 != 0 ? 512 : 0;
                                    i26 = 31;
                                } else {
                                    i16 = i14 - 112;
                                    if (i16 >= 31) {
                                        i18 = 0;
                                        i26 = 49;
                                    } else {
                                        if (i16 <= 0) {
                                            i17 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                            } else {
                                                i18 = i17;
                                                i26 = i16;
                                            }
                                            short s4 = (short) i19;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j3 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i31 = jj0.t;
                                            return j3;
                                        }
                                        if (i16 >= -10) {
                                            i20 = (i15 | 8388608) >> (1 - i16);
                                            if ((i20 & 4096) != 0) {
                                                i20 += 8192;
                                            }
                                            i18 = i20 >> 13;
                                        } else {
                                            i18 = 0;
                                        }
                                    }
                                }
                                i19 = i18 | (i13 << 15) | (i26 << 10);
                                short s5 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j4 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s5)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = jj0.t;
                                return j4;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s6 = (short) i11;
                    fY2 = uj0Var.y(2);
                    fG2 = uj0Var.g(2);
                    if (f4 >= fY2) {
                        fY2 = f4;
                    }
                    if (fY2 <= fG2) {
                        fG2 = fY2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fG2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s7 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j5 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i33 = jj0.t;
                                return j5;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s8 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j6 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((65535 & ((long) s8)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i34 = jj0.t;
                    return j6;
                }
                if (i2 >= -10) {
                    int i35 = (i29 | 8388608) >> (1 - i2);
                    if ((i35 & 4096) != 0) {
                        i35 += 8192;
                    }
                    i3 = i35 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i27 << 15) | (i2 << 10);
        short s9 = (short) i4;
        fY = uj0Var.y(1);
        fG = uj0Var.g(1);
        if (f3 >= fY) {
            fY = f3;
        }
        if (fY <= fG) {
            fG = fY;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fG);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i10 = 0;
                i8 = 49;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s10 = (short) i11;
                    fY2 = uj0Var.y(2);
                    fG2 = uj0Var.g(2);
                    if (f4 >= fY2) {
                        fY2 = f4;
                    }
                    if (fY2 <= fG2) {
                        fG2 = fY2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fG2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s11 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j7 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i36 = jj0.t;
                                return j7;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s12 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j8 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s12)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = jj0.t;
                    return j8;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s13 = (short) i11;
        fY2 = uj0Var.y(2);
        fG2 = uj0Var.g(2);
        if (f4 >= fY2) {
            fY2 = f4;
        }
        if (fY2 <= fG2) {
            fG2 = fY2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fG2);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i18 = i15 != 0 ? 512 : 0;
            i26 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i26 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                        i26 = i16;
                    }
                    short s14 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j9 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i38 = jj0.t;
                    return j9;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i26 << 10);
        short s15 = (short) i19;
        if (f5 >= 0.0f) {
        }
        long j10 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s15)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i39 = jj0.t;
        return j10;
    }

    public static final qs1 s(x94 x94Var, String[] strArr, xy1 xy1Var) {
        fp3 fp3Var;
        og2 og2VarJ = x94Var.j();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        aq2.I(og2VarJ.g);
        ae5 ae5Var = og2VarJ.y;
        ae5Var.getClass();
        strArr2.getClass();
        jl4 jl4Var = new jl4();
        byte b2 = 0;
        for (String str : strArr2) {
            HashMap map = ae5Var.r;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                jl4Var.addAll(set);
            } else {
                jl4Var.add(str);
            }
        }
        String[] strArr3 = (String[]) js2.r(jl4Var).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr3[i2];
            LinkedHashMap linkedHashMap = ae5Var.x;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap.get(lowerCase2);
            if (num == null) {
                l0.u("There is no table with name ".concat(str2));
                fp3Var = null;
                String[] strArr4 = (String[]) fp3Var.j;
                int[] iArr2 = (int[]) fp3Var.t;
                strArr4.getClass();
                iArr2.getClass();
                mu0 mu0Var = null;
                return new qs1(c93.u(new tr1(new vr1(new qx(og2VarJ, mu0Var, (byte) 5), new w00(new fg0((Object) ae5Var, (Object) iArr2, (Object) strArr4, mu0Var, (byte) 6), (byte) 4)), new cy(og2VarJ, mu0Var, (byte) 3), b2), -1), x94Var, xy1Var, (byte) 1);
            }
            iArr[i2] = num.intValue();
        }
        fp3Var = new fp3(strArr3, iArr);
        String[] strArr5 = (String[]) fp3Var.j;
        int[] iArr3 = (int[]) fp3Var.t;
        strArr5.getClass();
        iArr3.getClass();
        mu0 mu0Var2 = null;
        return new qs1(c93.u(new tr1(new vr1(new qx(og2VarJ, mu0Var2, (byte) 5), new w00(new fg0((Object) ae5Var, (Object) iArr3, (Object) strArr5, mu0Var2, (byte) 6), (byte) 4)), new cy(og2VarJ, mu0Var2, (byte) 3), b2), -1), x94Var, xy1Var, (byte) 1);
    }

    public static final void t(he heVar, String str, o22 o22Var, mj0 mj0Var, h02 h02Var, int i2) {
        int i3;
        o22 o22VarN;
        h02Var.Z(2075067909);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? h02Var.x(heVar) : h02Var.j(heVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= h02Var.x(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var.x(o22Var) ? 256 : 128;
        }
        byte b3 = 1;
        if ((i2 & 3072) == 0) {
            i3 |= h02Var.n(1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? h02Var.x(mj0Var) : h02Var.j(mj0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= h02Var.x(null) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && h02Var.e()) {
            h02Var.Q();
        } else {
            l76 l76Var = oo0.g;
            byte b4 = 0;
            if (str != null) {
                h02Var.Y(884096034);
                h02Var.Y(5004770);
                boolean z2 = (i3 & 112) == 32;
                Object objK = h02Var.K();
                if (z2 || objK == l76Var) {
                    objK = new r92(str, b3);
                    h02Var.i0(objK);
                }
                h02Var.b(false);
                zi4 zi4Var = new zi4();
                ((xy1) objK).a(zi4Var);
                o22VarN = o22Var.n(new bj4(zi4Var));
                h02Var.b(false);
            } else {
                h02Var.Y(884190429);
                h02Var.b(false);
                o22VarN = o22Var;
            }
            h02Var.Y(1849434622);
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = ea2.i;
                h02Var.i0(objK2);
            }
            h02Var.b(false);
            my1 my1Var = (my1) ((nz1) objK2);
            h02Var.Y(-1115894518);
            h02Var.Y(1886828752);
            if (!(h02Var.g instanceof lq)) {
                pw5.f();
                throw null;
            }
            h02Var.V();
            if (h02Var.S) {
                h02Var.m(new p22(my1Var, b4));
            } else {
                h02Var.l0();
            }
            xs2.E(new on0(b2), h02Var, heVar);
            xs2.E(new on0((byte) 17), h02Var, o22VarN);
            xs2.E(new on0((byte) 18), h02Var, new xt0());
            xs2.E(new on0((byte) 19), h02Var, mj0Var);
            xs2.E(new on0((byte) 20), h02Var, null);
            h02Var.b(true);
            h02Var.b(false);
            h02Var.b(false);
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ca2(heVar, str, o22Var, mj0Var, i2, (byte) 0);
        }
    }

    public static final String u(int i2) {
        return xi3.j("appWidget-", i2);
    }

    public static final long v(long j2) {
        long j3 = j2 << 32;
        int i2 = jj0.t;
        return j3;
    }

    public static final boolean w(Object obj) {
        if (obj instanceof mt4) {
            mt4 mt4Var = (mt4) obj;
            if (mt4Var.t() == hi0.B || mt4Var.t() == f73.w || mt4Var.t() == l76.q) {
                Object value = mt4Var.getValue();
                if (value == null) {
                    return true;
                }
                return w(value);
            }
        } else if (!(obj instanceof jz1) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (i[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long x(int i2, int i3, int i4) {
        return n(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final void y(final Object obj, long j2, nm0 nm0Var, h02 h02Var, final int i2, final int i3) {
        long j3;
        nm0 nm0Var2;
        final long j4;
        ob3 ob3Var;
        long j5;
        h02Var.Z(614531233);
        int i4 = i2 | ((i2 & 8) == 0 ? h02Var.x(obj) : h02Var.j(obj) ? 4 : 2);
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
            j3 = j2;
        } else {
            j3 = j2;
            if ((i2 & 48) == 0) {
                i4 |= h02Var.v(j3) ? 32 : 16;
            }
        }
        byte b2 = 1;
        if (h02Var.N(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                j3 = 0;
            }
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = kq2.M(Boolean.FALSE);
                h02Var.i0(objK);
            }
            ob3 ob3Var2 = (ob3) objK;
            boolean z2 = ((i4 & 112) == 32) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && h02Var.j(obj)));
            Object objK2 = h02Var.K();
            if (z2 || objK2 == l76Var) {
                ob3Var = ob3Var2;
                long j6 = j3;
                sh shVar = new sh(obj, j6, ob3Var, null);
                j5 = j6;
                h02Var.i0(shVar);
                objK2 = shVar;
            } else {
                ob3Var = ob3Var2;
                j5 = j3;
            }
            k33.b((bz1) objK2, h02Var, obj);
            nm0Var2 = nm0Var;
            gp4.n(((Boolean) ob3Var.getValue()).booleanValue() && obj != null, null, yj1.v(null, 3).g(yj1.n(null, 13)), yj1.x(null, 3).g(yj1.t(null, 13)), null, ue5.m0(-1166638215, new bb4(obj, nm0Var2, b2), h02Var), h02Var, 200064, 18);
            j4 = j5;
        } else {
            nm0Var2 = nm0Var;
            h02Var.Q();
            j4 = j3;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            final nm0 nm0Var3 = nm0Var2;
            u34VarP.n = new bz1(obj, j4, nm0Var3, i2, i3) { // from class: rh
                public final /* synthetic */ nm0 a;
                public final /* synthetic */ Object j;
                public final /* synthetic */ short m;
                public final /* synthetic */ byte q;
                public final /* synthetic */ short t;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
                {
                    this.t = (int) j4;
                    this.a = nm0Var3;
                    this.m = i2;
                    this.q = i3;
                }

                @Override // defpackage.bz1
                public final Object l(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ra.y(this.j, this.t, this.a, (h02) obj2, aq2.J(this.m | 1), this.q);
                    return og5.g;
                }
            };
        }
    }

    public static final float z(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public abstract InputFilter[] A(InputFilter[] inputFilterArr);

    public abstract float C(Object obj);

    public abstract void Q(boolean z2);

    public abstract void R(boolean z2);

    public abstract void T(Object obj, float f2);
}
