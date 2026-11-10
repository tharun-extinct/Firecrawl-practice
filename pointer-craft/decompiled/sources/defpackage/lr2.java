package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import io.appground.blek.MainActivity;
import io.appground.blek.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class lr2 implements al5 {
    public static ha2 g;
    public static Method n;
    public static long r;
    public static ha2 y;

    public static final int A(float f, int i, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    public static o22 D(o22 o22Var, float f, int i) {
        return o22Var.n(new xn3(I(f), I(0.0f), I((i & 4) != 0 ? 0.0f : 4.0f), I((i & 8) != 0 ? 0.0f : 4.0f)));
    }

    public static TimeInterpolator E(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            l0.u("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!k(strValueOf, "cubic-bezier") && !k(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!k(strValueOf, "cubic-bezier")) {
            if (k(strValueOf, "path")) {
                return new PathInterpolator(nc6.m(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            l0.u("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(h(0, strArrSplit), h(1, strArrSplit), h(2, strArrSplit), h(3, strArrSplit));
        }
        uo1.a("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ", strArrSplit.length);
        return null;
    }

    public static xu4 F(Context context) {
        TypedValue typedValueU = mq2.u(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = p24.d;
        TypedArray typedArrayObtainStyledAttributes = typedValueU == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueU.resourceId, iArr);
        xu4 xu4Var = new xu4();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            xu4Var.y(f);
            xu4Var.g(f2);
            typedArrayObtainStyledAttributes.recycle();
            return xu4Var;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final Object G(re4 re4Var, boolean z, Object obj, bz1 bz1Var) throws Throwable {
        Object hl0Var;
        Object objG0;
        try {
            if (bz1Var instanceof ix) {
                ue5.f(2, bz1Var);
                hl0Var = bz1Var.l(obj, re4Var);
            } else {
                hl0Var = pw5.X(bz1Var, obj, re4Var);
            }
        } catch (ha1 e) {
            Throwable th = e.j;
            re4Var.f0(new hl0(th, false));
            throw th;
        } catch (Throwable th2) {
            hl0Var = new hl0(th2, false);
        }
        px0 px0Var = px0.j;
        if (hl0Var == px0Var || (objG0 = re4Var.g0(hl0Var)) == gp4.u) {
            return px0Var;
        }
        re4Var.u0();
        if (!(objG0 instanceof hl0)) {
            return gp4.V(objG0);
        }
        if (!z) {
            Throwable th3 = ((hl0) objG0).g;
            if ((th3 instanceof n95) && ((n95) th3).j == re4Var) {
                if (hl0Var instanceof hl0) {
                    throw ((hl0) hl0Var).g;
                }
                return hl0Var;
            }
        }
        throw ((hl0) objG0).g;
    }

    public static final float H(List list, Resources resources) {
        Iterator it = list.iterator();
        float dimension = 0.0f;
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    public static final vn3 I(float f) {
        return new vn3(2, f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(pf4 pf4Var, float f, pi piVar, c11 c11Var, xy1 xy1Var, ou0 ou0Var) {
        vs4 vs4Var;
        float f2;
        r54 r54Var;
        if (ou0Var instanceof vs4) {
            vs4Var = (vs4) ou0Var;
            int i = vs4Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                vs4Var.i = i - Integer.MIN_VALUE;
            } else {
                vs4Var = new vs4(ou0Var);
            }
        } else {
            vs4Var = new vs4(ou0Var);
        }
        Object obj = vs4Var.c;
        int i2 = vs4Var.i;
        if (i2 == 0) {
            js2.o(obj);
            r54 r54Var2 = new r54();
            boolean z = ((Number) piVar.g()).floatValue() == 0.0f;
            us4 us4Var = new us4(f, r54Var2, pf4Var, xy1Var, (byte) 0);
            vs4Var.q = piVar;
            vs4Var.w = r54Var2;
            vs4Var.m = f;
            vs4Var.i = 1;
            Object objQ = kq2.q(piVar, c11Var, !z, us4Var, vs4Var);
            px0 px0Var = px0.j;
            if (objQ == px0Var) {
                return px0Var;
            }
            f2 = f;
            r54Var = r54Var2;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = vs4Var.m;
            r54Var = vs4Var.w;
            piVar = vs4Var.q;
            js2.o(obj);
        }
        return new li(new Float(f2 - r54Var.j), piVar);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        l0.q(str);
    }

    public static final uv2 c(p04 p04Var) {
        uv2 uv2VarC = pw5.c();
        r04[] r04VarArr = p04Var.a;
        r04VarArr.getClass();
        for (r04 r04Var : r04VarArr) {
            byte b = r04Var.t;
            if (b == 1) {
                p04 p04VarK = r04Var.k();
                p04VarK.getClass();
                uv2VarC.addAll(c(p04VarK));
            } else if (b == 2) {
                o04 o04VarZ = r04Var.z();
                o04VarZ.getClass();
                uv2VarC.add(o04VarZ);
            }
        }
        return pw5.a(uv2VarC);
    }

    public static ck4 d(bz1 bz1Var) {
        ck4 ck4Var = new ck4();
        ck4Var.y(pw5.q(ck4Var, ck4Var, bz1Var));
        return ck4Var;
    }

    public static final float e(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final boolean f() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return hy3.y();
        }
        try {
            Method method = n;
            if (method == null) {
                r = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                n = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(r));
            objInvoke.getClass();
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = ((InvocationTargetException) e).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            throw new RuntimeException(cause);
        }
    }

    public static final void g(p04 p04Var, xy1 xy1Var, o22 o22Var, Integer num, h02 h02Var, int i) {
        p04Var.getClass();
        xy1Var.getClass();
        h02Var.Z(-1116430306);
        int i2 = (i & 6) == 0 ? (h02Var.j(p04Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= h02Var.j(xy1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.x(o22Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h02Var.x(num) ? 2048 : 1024;
        }
        if (h02Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ArrayList arrayList = new ArrayList();
            r04[] r04VarArr = p04Var.a;
            r04VarArr.getClass();
            for (r04 r04Var : r04VarArr) {
                byte b = r04Var.t;
                if (b == 2 || b == 1) {
                    s04 s04Var = r04Var.q;
                    boolean z = s04Var != null && s04Var.t;
                    if (arrayList.isEmpty() || z) {
                        arrayList.add(new ArrayList());
                    }
                    ((List) cj0.r0(arrayList)).add(r04Var);
                }
            }
            og0.g(o22Var, 0, 1, ue5.m0(1739775208, new qn((Object) arrayList, (Object) xy1Var, (Object) num, (byte) 6), h02Var), h02Var, ((i2 >> 6) & 14) | 3072, 2);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ca2(p04Var, xy1Var, o22Var, num, i, (byte) 2);
        }
    }

    public static float h(int i, String[] strArr) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static final int i(rf2 rf2Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float f;
        if (i6 == 1) {
            f = k33.s;
        } else {
            f = i6 == 2 ? k33.e : k33.o;
        }
        int iMax = Math.max(Math.max(ws0.a(j), rf2Var.V(f)), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int iJ = ws0.j(j);
        return iMax > iJ ? iJ : iMax;
    }

    public static final void j(long j, nf5 nf5Var, bz1 bz1Var, h02 h02Var, int i) {
        long j2;
        h02 h02Var2;
        bz1 bz1Var2;
        h02Var.Z(-285397024);
        int i2 = (h02Var.v(j) ? 4 : 2) | i | (h02Var.j(bz1Var) ? 256 : 128);
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            j2 = j;
            h02Var2 = h02Var;
            jr2.r(j2, of5.g(nf5Var, h02Var), bz1Var, h02Var2, i2 & 910);
            bz1Var2 = bz1Var;
        } else {
            j2 = j;
            h02Var2 = h02Var;
            bz1Var2 = bz1Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new lp(j2, nf5Var, bz1Var2, i);
        }
    }

    public static boolean k(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final void l(r04 r04Var, xy1 xy1Var, o22 o22Var, Integer num, h02 h02Var, int i) {
        h02 h02Var2 = h02Var;
        h02Var2.Z(-1540840421);
        int i2 = i | (h02Var2.j(r04Var) ? 4 : 2) | (h02Var2.j(xy1Var) ? 32 : 16) | (h02Var2.x(o22Var) ? 256 : 128) | (h02Var2.x(num) ? 2048 : 1024);
        boolean z = true;
        if (h02Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            byte b = r04Var.t;
            if (b == 1) {
                h02Var2.X(1016092884);
                p04 p04VarK = r04Var.k();
                p04VarK.getClass();
                g(p04VarK, xy1Var, o22Var, num, h02Var2, i2 & 8176);
                h02Var2.b(false);
            } else if (b != 2) {
                h02Var2.X(1434304037);
                h02Var2.b(false);
            } else {
                h02Var2.X(1016080218);
                String strValueOf = String.valueOf(r04Var.m);
                o04 o04VarZ = r04Var.z();
                o04VarZ.getClass();
                boolean zJ = ((i2 & 112) == 32) | h02Var2.j(r04Var);
                Object objK = h02Var2.K();
                if (zJ || objK == oo0.g) {
                    objK = new rg((Object) xy1Var, (Object) r04Var, (byte) 25);
                    h02Var2.i0(objK);
                }
                my1 my1Var = (my1) objK;
                if (num != null && r04Var.m != num.intValue()) {
                    z = false;
                }
                x(strValueOf, o04VarZ, my1Var, z, o22Var, h02Var2, (i2 << 6) & 57344);
                h02Var2 = h02Var2;
                h02Var2.b(false);
            }
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new k71(r04Var, xy1Var, o22Var, num, i);
        }
    }

    public static final void m(ni niVar, pf4 pf4Var, xy1 xy1Var, float f) {
        float fG;
        try {
            fG = pf4Var.g(f);
        } catch (CancellationException unused) {
            niVar.g();
            fG = 0.0f;
        }
        xy1Var.a(Float.valueOf(fG));
        if (Math.abs(f - fG) > 0.5f) {
            niVar.g();
        }
    }

    public static final void n(bz1 bz1Var, bz1 bz1Var2, nm0 nm0Var, bz1 bz1Var3, bz1 bz1Var4, h02 h02Var, int i) {
        h02Var.Z(-61277522);
        int i2 = i | (h02Var.j(bz1Var) ? 4 : 2) | (h02Var.j(bz1Var2) ? 32 : 16) | (h02Var.j(bz1Var3) ? 2048 : 1024) | (h02Var.j(bz1Var4) ? 16384 : 8192);
        if (h02Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new kw2();
                h02Var.i0(objK);
            }
            kw2 kw2Var = (kw2) objK;
            nm0 nm0VarO = yf2.o(pw5.d(nm0Var, bz1Var3 == null ? dn0.g : bz1Var3, bz1Var4 == null ? dn0.y : bz1Var4, bz1Var == null ? dn0.r : bz1Var, bz1Var2 == null ? dn0.n : bz1Var2));
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = new b93(kw2Var);
                h02Var.i0(objK2);
            }
            t33 t33Var = (t33) objK2;
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, g73.g);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33Var);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            du4.h(0, nm0VarO, h02Var, true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new fo(bz1Var, bz1Var2, nm0Var, bz1Var3, bz1Var4, i, (byte) 3);
        }
    }

    public static final ha2 o() {
        ha2 ha2Var = g;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.QrCodeScanner", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(9.5f, 6.5f);
        kq3Var.w(3.0f);
        kq3Var.v(-3.0f);
        kq3Var.w(-3.0f);
        kq3Var.n(9.5f);
        kq3Var.j(11.0f, 5.0f);
        kq3Var.n(5.0f);
        kq3Var.w(6.0f);
        kq3Var.v(6.0f);
        kq3Var.q(5.0f);
        kq3Var.x(11.0f, 5.0f);
        kq3Var.g();
        kq3Var.j(9.5f, 14.5f);
        kq3Var.w(3.0f);
        kq3Var.v(-3.0f);
        kq3Var.w(-3.0f);
        kq3Var.n(9.5f);
        kq3Var.j(11.0f, 13.0f);
        kq3Var.n(5.0f);
        kq3Var.w(6.0f);
        kq3Var.v(6.0f);
        kq3Var.q(13.0f);
        kq3Var.x(11.0f, 13.0f);
        kq3Var.g();
        kq3Var.j(17.5f, 6.5f);
        kq3Var.w(3.0f);
        kq3Var.v(-3.0f);
        kq3Var.w(-3.0f);
        kq3Var.n(17.5f);
        kq3Var.j(19.0f, 5.0f);
        kq3Var.v(-6.0f);
        kq3Var.w(6.0f);
        kq3Var.v(6.0f);
        kq3Var.q(5.0f);
        kq3Var.x(19.0f, 5.0f);
        kq3Var.g();
        kq3Var.j(13.0f, 13.0f);
        kq3Var.v(1.5f);
        kq3Var.w(1.5f);
        kq3Var.n(13.0f);
        kq3Var.q(13.0f);
        kq3Var.g();
        kq3Var.j(14.5f, 14.5f);
        kq3Var.n(16.0f);
        kq3Var.q(16.0f);
        kq3Var.v(-1.5f);
        kq3Var.q(14.5f);
        kq3Var.g();
        kq3Var.j(16.0f, 13.0f);
        kq3Var.v(1.5f);
        kq3Var.w(1.5f);
        kq3Var.n(16.0f);
        kq3Var.q(13.0f);
        kq3Var.g();
        du4.e(kq3Var, 13.0f, 16.0f, 1.5f, 1.5f);
        kq3Var.n(13.0f);
        kq3Var.q(16.0f);
        kq3Var.g();
        kq3Var.j(14.5f, 17.5f);
        kq3Var.n(16.0f);
        kq3Var.q(19.0f);
        kq3Var.v(-1.5f);
        kq3Var.q(17.5f);
        kq3Var.g();
        du4.e(kq3Var, 16.0f, 16.0f, 1.5f, 1.5f);
        kq3Var.n(16.0f);
        kq3Var.q(16.0f);
        kq3Var.g();
        kq3Var.j(17.5f, 14.5f);
        kq3Var.n(19.0f);
        kq3Var.q(16.0f);
        kq3Var.v(-1.5f);
        kq3Var.q(14.5f);
        kq3Var.g();
        kq3Var.j(17.5f, 17.5f);
        kq3Var.n(19.0f);
        kq3Var.q(19.0f);
        kq3Var.v(-1.5f);
        kq3Var.q(17.5f);
        kq3Var.g();
        kq3Var.j(22.0f, 7.0f);
        kq3Var.v(-2.0f);
        kq3Var.q(4.0f);
        kq3Var.v(-3.0f);
        kq3Var.q(2.0f);
        kq3Var.v(5.0f);
        kq3Var.q(7.0f);
        kq3Var.g();
        kq3Var.j(22.0f, 22.0f);
        kq3Var.w(-5.0f);
        kq3Var.v(-2.0f);
        kq3Var.w(3.0f);
        kq3Var.v(-3.0f);
        kq3Var.w(2.0f);
        kq3Var.n(22.0f);
        kq3Var.g();
        kq3Var.j(2.0f, 22.0f);
        kq3Var.v(5.0f);
        kq3Var.w(-2.0f);
        kq3Var.n(4.0f);
        kq3Var.w(-3.0f);
        kq3Var.n(2.0f);
        kq3Var.q(22.0f);
        kq3Var.g();
        kq3Var.j(2.0f, 2.0f);
        kq3Var.w(5.0f);
        kq3Var.v(2.0f);
        kq3Var.q(4.0f);
        kq3Var.v(3.0f);
        kq3Var.q(2.0f);
        kq3Var.n(2.0f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        g = ha2VarY;
        return ha2VarY;
    }

    public static final int p(cc4 cc4Var, String str) {
        cc4Var.getClass();
        int columnCount = cc4Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(cc4Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = cc4Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (str2.equals(cc4Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = cc4Var.getColumnCount();
            String strConcat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = cc4Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (columnName.endsWith(strConcat) || (columnName.charAt(0) == '`' && columnName.endsWith(str3)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object q(pf4 pf4Var, float f, float f2, pi piVar, oi oiVar, xy1 xy1Var, ou0 ou0Var) {
        ws4 ws4Var;
        float fFloatValue;
        pi piVar2;
        r54 r54Var;
        float f3 = f;
        if (ou0Var instanceof ws4) {
            ws4Var = (ws4) ou0Var;
            int i = ws4Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ws4Var.b = i - Integer.MIN_VALUE;
            } else {
                ws4Var = new ws4(ou0Var);
            }
        } else {
            ws4Var = new ws4(ou0Var);
        }
        ws4 ws4Var2 = ws4Var;
        Object obj = ws4Var2.i;
        int i2 = ws4Var2.b;
        if (i2 == 0) {
            js2.o(obj);
            r54 r54Var2 = new r54();
            fFloatValue = ((Number) piVar.g()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) piVar.g()).floatValue() == 0.0f;
            us4 us4Var = new us4(f2, r54Var2, pf4Var, xy1Var, (byte) 1);
            ws4Var2.w = piVar;
            ws4Var2.c = r54Var2;
            ws4Var2.m = f3;
            ws4Var2.q = fFloatValue;
            ws4Var2.b = 1;
            Object objW = kq2.w(piVar, f4, oiVar, !z, us4Var, ws4Var2);
            px0 px0Var = px0.j;
            if (objW == px0Var) {
                return px0Var;
            }
            piVar2 = piVar;
            r54Var = r54Var2;
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = ws4Var2.q;
            float f6 = ws4Var2.m;
            r54Var = ws4Var2.c;
            piVar2 = ws4Var2.w;
            js2.o(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new li(new Float(f3 - r54Var.j), v70.c(piVar2, 0.0f, s(((Number) piVar2.g()).floatValue(), fFloatValue), 29));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x0137  */
    /* JADX WARN: Code duplicated, block: B:111:0x013b  */
    /* JADX WARN: Code duplicated, block: B:113:0x013f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0145  */
    /* JADX WARN: Code duplicated, block: B:117:0x0155  */
    /* JADX WARN: Code duplicated, block: B:119:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x015b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0173  */
    /* JADX WARN: Code duplicated, block: B:125:0x0180  */
    /* JADX WARN: Code duplicated, block: B:127:0x0198  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:133:0x01de  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:138:0x0205  */
    /* JADX WARN: Code duplicated, block: B:140:0x026f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0280  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    public static final void r(final nm0 nm0Var, j73 j73Var, bz1 bz1Var, bz1 bz1Var2, bz1 bz1Var3, bz1 bz1Var4, aw2 aw2Var, float f, h02 h02Var, final int i, final int i2) {
        int i3;
        j73 j73Var2;
        int i4;
        bz1 bz1Var5;
        int i5;
        int i6;
        bz1 bz1Var6;
        int i7;
        int i8;
        bz1 bz1Var7;
        int i9;
        int i10;
        bz1 bz1Var8;
        int i11;
        aw2 aw2VarH;
        int i12;
        int i13;
        int i14;
        int i15;
        byte b;
        boolean z;
        final j73 j73Var3;
        final bz1 bz1Var9;
        final bz1 bz1Var10;
        final bz1 bz1Var11;
        final bz1 bz1Var12;
        final aw2 aw2Var2;
        final float f2;
        u34 u34VarP;
        int i16;
        g73 g73Var;
        nm0 nm0VarM0;
        int i17;
        float f3;
        j73 j73Var4;
        bz1 bz1Var13;
        bz1 bz1Var14;
        bz1 bz1Var15;
        bz1 bz1Var16;
        aw2 aw2Var3;
        boolean z2;
        nm0 nm0VarM1;
        nm0 nm0VarM2;
        nm0 nm0VarM3;
        Object objK;
        h02Var.Z(487133126);
        if ((i & 6) == 0) {
            i3 = (h02Var.j(nm0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 == 0) {
            if ((i & 48) == 0) {
                j73Var2 = j73Var;
                i3 |= h02Var.x(j73Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    bz1Var5 = bz1Var;
                    if (h02Var.j(bz1Var5)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        bz1Var6 = bz1Var2;
                        if (h02Var.j(bz1Var6)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            bz1Var7 = bz1Var3;
                            if (h02Var.j(bz1Var7)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            if ((196608 & i) == 0) {
                                bz1Var8 = bz1Var4;
                                if (h02Var.j(bz1Var8)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                                i3 |= i11;
                            }
                            if ((1572864 & i) == 0) {
                                if ((i2 & 64) == 0) {
                                    aw2VarH = aw2Var;
                                    int i19 = h02Var.x(aw2VarH) ? 1048576 : 524288;
                                    i3 |= i19;
                                } else {
                                    aw2VarH = aw2Var;
                                }
                                i3 |= i19;
                            } else {
                                aw2VarH = aw2Var;
                            }
                            i12 = i2 & 128;
                            if (i12 != 0) {
                                if ((i & 12582912) == 0) {
                                    if (h02Var.r(f)) {
                                        i13 = 8388608;
                                    } else {
                                        i13 = 4194304;
                                    }
                                    i3 |= i13;
                                }
                                i14 = i3 | 100663296;
                                i15 = i14;
                                b = 1;
                                if ((i14 & 38347923) != 38347922) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (h02Var.N(i15 & 1, z)) {
                                    h02Var.S();
                                    i16 = i & 1;
                                    g73Var = g73.g;
                                    nm0VarM0 = null;
                                    if (i16 != 0 || h02Var.k()) {
                                        if (i18 != 0) {
                                            j73Var2 = g73Var;
                                        }
                                        if (i4 != 0) {
                                            bz1Var5 = null;
                                        }
                                        if (i6 != 0) {
                                            bz1Var6 = null;
                                        }
                                        if (i8 != 0) {
                                            bz1Var7 = null;
                                        }
                                        if (i10 != 0) {
                                            bz1Var8 = null;
                                        }
                                        if ((i2 & 64) != 0) {
                                            i17 = i15 & (-3670017);
                                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                        } else {
                                            i17 = i15;
                                        }
                                        if (i12 != 0) {
                                            f3 = 0.0f;
                                        } else {
                                            f3 = f;
                                        }
                                        f = f3;
                                        j73Var4 = j73Var2;
                                        i15 = i17;
                                    } else {
                                        h02Var.Q();
                                        if ((i2 & 64) != 0) {
                                            i15 &= -3670017;
                                        }
                                        j73Var4 = j73Var2;
                                    }
                                    bz1Var13 = bz1Var5;
                                    bz1Var14 = bz1Var6;
                                    bz1Var15 = bz1Var7;
                                    bz1Var16 = bz1Var8;
                                    aw2Var3 = aw2VarH;
                                    h02Var.s();
                                    nm0 nm0VarM4 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                                    if (bz1Var14 == null) {
                                        h02Var.X(-510713870);
                                        z2 = false;
                                        h02Var.b(false);
                                        nm0VarM1 = null;
                                    } else {
                                        z2 = false;
                                        h02Var.X(-510713869);
                                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                        h02Var.b(false);
                                    }
                                    if (bz1Var13 == null) {
                                        h02Var.X(-510395686);
                                        h02Var.b(z2);
                                        nm0VarM2 = null;
                                    } else {
                                        h02Var.X(-510395685);
                                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                        h02Var.b(z2);
                                    }
                                    if (bz1Var15 == null) {
                                        h02Var.X(-510083888);
                                        h02Var.b(z2);
                                        nm0VarM3 = null;
                                    } else {
                                        h02Var.X(-510083887);
                                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                        h02Var.b(z2);
                                    }
                                    if (bz1Var16 == null) {
                                        h02Var.X(-509666659);
                                    } else {
                                        h02Var.X(-509666658);
                                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                        z2 = false;
                                    }
                                    h02Var.b(z2);
                                    objK = h02Var.K();
                                    if (objK == oo0.g) {
                                        objK = new q21((byte) 25);
                                        h02Var.i0(objK);
                                    }
                                    j73 j73VarN = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                                    cn4 cn4VarY = vn4.y(k33.x, h02Var);
                                    long j = aw2Var3.g;
                                    long j2 = aw2Var3.y;
                                    nm0 nm0VarM5 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM4, nm0VarM2, nm0VarM1), h02Var);
                                    int i20 = i15 >> 9;
                                    f2 = f;
                                    uz4.g(j73VarN, cn4VarY, j, j2, f2, 0.0f, null, nm0VarM5, h02Var, (57344 & i20) | 12582912 | (i20 & 458752), 64);
                                    j73Var3 = j73Var4;
                                    bz1Var10 = bz1Var14;
                                    aw2Var2 = aw2Var3;
                                    bz1Var9 = bz1Var13;
                                    bz1Var11 = bz1Var15;
                                    bz1Var12 = bz1Var16;
                                } else {
                                    h02Var.Q();
                                    j73Var3 = j73Var2;
                                    bz1Var9 = bz1Var5;
                                    bz1Var10 = bz1Var6;
                                    bz1Var11 = bz1Var7;
                                    bz1Var12 = bz1Var8;
                                    aw2Var2 = aw2VarH;
                                    f2 = f;
                                }
                                u34VarP = h02Var.p();
                                if (u34VarP != null) {
                                    u34VarP.n = new bz1() { // from class: bw2
                                        @Override // defpackage.bz1
                                        public final Object l(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                            return og5.g;
                                        }
                                    };
                                }
                            }
                            i3 |= 12582912;
                            i14 = i3 | 100663296;
                            i15 = i14;
                            b = 1;
                            if ((i14 & 38347923) != 38347922) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (h02Var.N(i15 & 1, z)) {
                                h02Var.S();
                                i16 = i & 1;
                                g73Var = g73.g;
                                nm0VarM0 = null;
                                if (i16 != 0) {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                } else {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                }
                                bz1Var13 = bz1Var5;
                                bz1Var14 = bz1Var6;
                                bz1Var15 = bz1Var7;
                                bz1Var16 = bz1Var8;
                                aw2Var3 = aw2VarH;
                                h02Var.s();
                                nm0 nm0VarM6 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                                if (bz1Var14 == null) {
                                    h02Var.X(-510713870);
                                    z2 = false;
                                    h02Var.b(false);
                                    nm0VarM1 = null;
                                } else {
                                    z2 = false;
                                    h02Var.X(-510713869);
                                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                    h02Var.b(false);
                                }
                                if (bz1Var13 == null) {
                                    h02Var.X(-510395686);
                                    h02Var.b(z2);
                                    nm0VarM2 = null;
                                } else {
                                    h02Var.X(-510395685);
                                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var15 == null) {
                                    h02Var.X(-510083888);
                                    h02Var.b(z2);
                                    nm0VarM3 = null;
                                } else {
                                    h02Var.X(-510083887);
                                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var16 == null) {
                                    h02Var.X(-509666659);
                                } else {
                                    h02Var.X(-509666658);
                                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                    z2 = false;
                                }
                                h02Var.b(z2);
                                objK = h02Var.K();
                                if (objK == oo0.g) {
                                    objK = new q21((byte) 25);
                                    h02Var.i0(objK);
                                }
                                j73 j73VarN2 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                                cn4 cn4VarY2 = vn4.y(k33.x, h02Var);
                                long j3 = aw2Var3.g;
                                long j4 = aw2Var3.y;
                                nm0 nm0VarM7 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM6, nm0VarM2, nm0VarM1), h02Var);
                                int i21 = i15 >> 9;
                                f2 = f;
                                uz4.g(j73VarN2, cn4VarY2, j3, j4, f2, 0.0f, null, nm0VarM7, h02Var, (57344 & i21) | 12582912 | (i21 & 458752), 64);
                                j73Var3 = j73Var4;
                                bz1Var10 = bz1Var14;
                                aw2Var2 = aw2Var3;
                                bz1Var9 = bz1Var13;
                                bz1Var11 = bz1Var15;
                                bz1Var12 = bz1Var16;
                            } else {
                                h02Var.Q();
                                j73Var3 = j73Var2;
                                bz1Var9 = bz1Var5;
                                bz1Var10 = bz1Var6;
                                bz1Var11 = bz1Var7;
                                bz1Var12 = bz1Var8;
                                aw2Var2 = aw2VarH;
                                f2 = f;
                            }
                            u34VarP = h02Var.p();
                            if (u34VarP != null) {
                                u34VarP.n = new bz1() { // from class: bw2
                                    @Override // defpackage.bz1
                                    public final Object l(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                        return og5.g;
                                    }
                                };
                            }
                        }
                        i3 |= 196608;
                        bz1Var8 = bz1Var4;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                aw2VarH = aw2Var;
                                if (h02Var.x(aw2VarH)) {
                                }
                                i3 |= i19;
                            } else {
                                aw2VarH = aw2Var;
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            if ((i & 12582912) == 0) {
                                if (h02Var.r(f)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i3 |= i13;
                            }
                            i14 = i3 | 100663296;
                            i15 = i14;
                            b = 1;
                            if ((i14 & 38347923) != 38347922) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (h02Var.N(i15 & 1, z)) {
                                h02Var.S();
                                i16 = i & 1;
                                g73Var = g73.g;
                                nm0VarM0 = null;
                                if (i16 != 0) {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                } else {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                }
                                bz1Var13 = bz1Var5;
                                bz1Var14 = bz1Var6;
                                bz1Var15 = bz1Var7;
                                bz1Var16 = bz1Var8;
                                aw2Var3 = aw2VarH;
                                h02Var.s();
                                nm0 nm0VarM8 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                                if (bz1Var14 == null) {
                                    h02Var.X(-510713870);
                                    z2 = false;
                                    h02Var.b(false);
                                    nm0VarM1 = null;
                                } else {
                                    z2 = false;
                                    h02Var.X(-510713869);
                                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                    h02Var.b(false);
                                }
                                if (bz1Var13 == null) {
                                    h02Var.X(-510395686);
                                    h02Var.b(z2);
                                    nm0VarM2 = null;
                                } else {
                                    h02Var.X(-510395685);
                                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var15 == null) {
                                    h02Var.X(-510083888);
                                    h02Var.b(z2);
                                    nm0VarM3 = null;
                                } else {
                                    h02Var.X(-510083887);
                                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var16 == null) {
                                    h02Var.X(-509666659);
                                } else {
                                    h02Var.X(-509666658);
                                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                    z2 = false;
                                }
                                h02Var.b(z2);
                                objK = h02Var.K();
                                if (objK == oo0.g) {
                                    objK = new q21((byte) 25);
                                    h02Var.i0(objK);
                                }
                                j73 j73VarN3 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                                cn4 cn4VarY3 = vn4.y(k33.x, h02Var);
                                long j5 = aw2Var3.g;
                                long j6 = aw2Var3.y;
                                nm0 nm0VarM9 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM8, nm0VarM2, nm0VarM1), h02Var);
                                int i22 = i15 >> 9;
                                f2 = f;
                                uz4.g(j73VarN3, cn4VarY3, j5, j6, f2, 0.0f, null, nm0VarM9, h02Var, (57344 & i22) | 12582912 | (i22 & 458752), 64);
                                j73Var3 = j73Var4;
                                bz1Var10 = bz1Var14;
                                aw2Var2 = aw2Var3;
                                bz1Var9 = bz1Var13;
                                bz1Var11 = bz1Var15;
                                bz1Var12 = bz1Var16;
                            } else {
                                h02Var.Q();
                                j73Var3 = j73Var2;
                                bz1Var9 = bz1Var5;
                                bz1Var10 = bz1Var6;
                                bz1Var11 = bz1Var7;
                                bz1Var12 = bz1Var8;
                                aw2Var2 = aw2VarH;
                                f2 = f;
                            }
                            u34VarP = h02Var.p();
                            if (u34VarP != null) {
                                u34VarP.n = new bz1() { // from class: bw2
                                    @Override // defpackage.bz1
                                    public final Object l(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                        return og5.g;
                                    }
                                };
                            }
                        }
                        i3 |= 12582912;
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM10 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN4 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY4 = vn4.y(k33.x, h02Var);
                            long j7 = aw2Var3.g;
                            long j8 = aw2Var3.y;
                            nm0 nm0VarM11 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM10, nm0VarM2, nm0VarM1), h02Var);
                            int i23 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN4, cn4VarY4, j7, j8, f2, 0.0f, null, nm0VarM11, h02Var, (57344 & i23) | 12582912 | (i23 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 24576;
                    bz1Var7 = bz1Var3;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            bz1Var8 = bz1Var4;
                            if (h02Var.j(bz1Var8)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                aw2VarH = aw2Var;
                                if (h02Var.x(aw2VarH)) {
                                }
                                i3 |= i19;
                            } else {
                                aw2VarH = aw2Var;
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            if ((i & 12582912) == 0) {
                                if (h02Var.r(f)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i3 |= i13;
                            }
                            i14 = i3 | 100663296;
                            i15 = i14;
                            b = 1;
                            if ((i14 & 38347923) != 38347922) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (h02Var.N(i15 & 1, z)) {
                                h02Var.S();
                                i16 = i & 1;
                                g73Var = g73.g;
                                nm0VarM0 = null;
                                if (i16 != 0) {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                } else {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                }
                                bz1Var13 = bz1Var5;
                                bz1Var14 = bz1Var6;
                                bz1Var15 = bz1Var7;
                                bz1Var16 = bz1Var8;
                                aw2Var3 = aw2VarH;
                                h02Var.s();
                                nm0 nm0VarM12 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                                if (bz1Var14 == null) {
                                    h02Var.X(-510713870);
                                    z2 = false;
                                    h02Var.b(false);
                                    nm0VarM1 = null;
                                } else {
                                    z2 = false;
                                    h02Var.X(-510713869);
                                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                    h02Var.b(false);
                                }
                                if (bz1Var13 == null) {
                                    h02Var.X(-510395686);
                                    h02Var.b(z2);
                                    nm0VarM2 = null;
                                } else {
                                    h02Var.X(-510395685);
                                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var15 == null) {
                                    h02Var.X(-510083888);
                                    h02Var.b(z2);
                                    nm0VarM3 = null;
                                } else {
                                    h02Var.X(-510083887);
                                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var16 == null) {
                                    h02Var.X(-509666659);
                                } else {
                                    h02Var.X(-509666658);
                                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                    z2 = false;
                                }
                                h02Var.b(z2);
                                objK = h02Var.K();
                                if (objK == oo0.g) {
                                    objK = new q21((byte) 25);
                                    h02Var.i0(objK);
                                }
                                j73 j73VarN5 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                                cn4 cn4VarY5 = vn4.y(k33.x, h02Var);
                                long j9 = aw2Var3.g;
                                long j10 = aw2Var3.y;
                                nm0 nm0VarM13 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM12, nm0VarM2, nm0VarM1), h02Var);
                                int i24 = i15 >> 9;
                                f2 = f;
                                uz4.g(j73VarN5, cn4VarY5, j9, j10, f2, 0.0f, null, nm0VarM13, h02Var, (57344 & i24) | 12582912 | (i24 & 458752), 64);
                                j73Var3 = j73Var4;
                                bz1Var10 = bz1Var14;
                                aw2Var2 = aw2Var3;
                                bz1Var9 = bz1Var13;
                                bz1Var11 = bz1Var15;
                                bz1Var12 = bz1Var16;
                            } else {
                                h02Var.Q();
                                j73Var3 = j73Var2;
                                bz1Var9 = bz1Var5;
                                bz1Var10 = bz1Var6;
                                bz1Var11 = bz1Var7;
                                bz1Var12 = bz1Var8;
                                aw2Var2 = aw2VarH;
                                f2 = f;
                            }
                            u34VarP = h02Var.p();
                            if (u34VarP != null) {
                                u34VarP.n = new bz1() { // from class: bw2
                                    @Override // defpackage.bz1
                                    public final Object l(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                        return og5.g;
                                    }
                                };
                            }
                        }
                        i3 |= 12582912;
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM14 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN6 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY6 = vn4.y(k33.x, h02Var);
                            long j11 = aw2Var3.g;
                            long j12 = aw2Var3.y;
                            nm0 nm0VarM15 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM14, nm0VarM2, nm0VarM1), h02Var);
                            int i25 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN6, cn4VarY6, j11, j12, f2, 0.0f, null, nm0VarM15, h02Var, (57344 & i25) | 12582912 | (i25 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    bz1Var8 = bz1Var4;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            aw2VarH = aw2Var;
                            if (h02Var.x(aw2VarH)) {
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (h02Var.r(f)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM16 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN7 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY7 = vn4.y(k33.x, h02Var);
                            long j13 = aw2Var3.g;
                            long j14 = aw2Var3.y;
                            nm0 nm0VarM17 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM16, nm0VarM2, nm0VarM1), h02Var);
                            int i26 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN7, cn4VarY7, j13, j14, f2, 0.0f, null, nm0VarM17, h02Var, (57344 & i26) | 12582912 | (i26 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM18 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN8 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY8 = vn4.y(k33.x, h02Var);
                        long j15 = aw2Var3.g;
                        long j16 = aw2Var3.y;
                        nm0 nm0VarM19 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM18, nm0VarM2, nm0VarM1), h02Var);
                        int i27 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN8, cn4VarY8, j15, j16, f2, 0.0f, null, nm0VarM19, h02Var, (57344 & i27) | 12582912 | (i27 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 3072;
                bz1Var6 = bz1Var2;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        bz1Var7 = bz1Var3;
                        if (h02Var.j(bz1Var7)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            bz1Var8 = bz1Var4;
                            if (h02Var.j(bz1Var8)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                aw2VarH = aw2Var;
                                if (h02Var.x(aw2VarH)) {
                                }
                                i3 |= i19;
                            } else {
                                aw2VarH = aw2Var;
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            if ((i & 12582912) == 0) {
                                if (h02Var.r(f)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i3 |= i13;
                            }
                            i14 = i3 | 100663296;
                            i15 = i14;
                            b = 1;
                            if ((i14 & 38347923) != 38347922) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (h02Var.N(i15 & 1, z)) {
                                h02Var.S();
                                i16 = i & 1;
                                g73Var = g73.g;
                                nm0VarM0 = null;
                                if (i16 != 0) {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                } else {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                }
                                bz1Var13 = bz1Var5;
                                bz1Var14 = bz1Var6;
                                bz1Var15 = bz1Var7;
                                bz1Var16 = bz1Var8;
                                aw2Var3 = aw2VarH;
                                h02Var.s();
                                nm0 nm0VarM110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                                if (bz1Var14 == null) {
                                    h02Var.X(-510713870);
                                    z2 = false;
                                    h02Var.b(false);
                                    nm0VarM1 = null;
                                } else {
                                    z2 = false;
                                    h02Var.X(-510713869);
                                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                    h02Var.b(false);
                                }
                                if (bz1Var13 == null) {
                                    h02Var.X(-510395686);
                                    h02Var.b(z2);
                                    nm0VarM2 = null;
                                } else {
                                    h02Var.X(-510395685);
                                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var15 == null) {
                                    h02Var.X(-510083888);
                                    h02Var.b(z2);
                                    nm0VarM3 = null;
                                } else {
                                    h02Var.X(-510083887);
                                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var16 == null) {
                                    h02Var.X(-509666659);
                                } else {
                                    h02Var.X(-509666658);
                                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                    z2 = false;
                                }
                                h02Var.b(z2);
                                objK = h02Var.K();
                                if (objK == oo0.g) {
                                    objK = new q21((byte) 25);
                                    h02Var.i0(objK);
                                }
                                j73 j73VarN9 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                                cn4 cn4VarY9 = vn4.y(k33.x, h02Var);
                                long j17 = aw2Var3.g;
                                long j18 = aw2Var3.y;
                                nm0 nm0VarM111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM110, nm0VarM2, nm0VarM1), h02Var);
                                int i28 = i15 >> 9;
                                f2 = f;
                                uz4.g(j73VarN9, cn4VarY9, j17, j18, f2, 0.0f, null, nm0VarM111, h02Var, (57344 & i28) | 12582912 | (i28 & 458752), 64);
                                j73Var3 = j73Var4;
                                bz1Var10 = bz1Var14;
                                aw2Var2 = aw2Var3;
                                bz1Var9 = bz1Var13;
                                bz1Var11 = bz1Var15;
                                bz1Var12 = bz1Var16;
                            } else {
                                h02Var.Q();
                                j73Var3 = j73Var2;
                                bz1Var9 = bz1Var5;
                                bz1Var10 = bz1Var6;
                                bz1Var11 = bz1Var7;
                                bz1Var12 = bz1Var8;
                                aw2Var2 = aw2VarH;
                                f2 = f;
                            }
                            u34VarP = h02Var.p();
                            if (u34VarP != null) {
                                u34VarP.n = new bz1() { // from class: bw2
                                    @Override // defpackage.bz1
                                    public final Object l(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                        return og5.g;
                                    }
                                };
                            }
                        }
                        i3 |= 12582912;
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN10 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY10 = vn4.y(k33.x, h02Var);
                            long j19 = aw2Var3.g;
                            long j110 = aw2Var3.y;
                            nm0 nm0VarM113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM112, nm0VarM2, nm0VarM1), h02Var);
                            int i29 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN10, cn4VarY10, j19, j110, f2, 0.0f, null, nm0VarM113, h02Var, (57344 & i29) | 12582912 | (i29 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    bz1Var8 = bz1Var4;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            aw2VarH = aw2Var;
                            if (h02Var.x(aw2VarH)) {
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (h02Var.r(f)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN11 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY11 = vn4.y(k33.x, h02Var);
                            long j111 = aw2Var3.g;
                            long j112 = aw2Var3.y;
                            nm0 nm0VarM115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM114, nm0VarM2, nm0VarM1), h02Var);
                            int i210 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN11, cn4VarY11, j111, j112, f2, 0.0f, null, nm0VarM115, h02Var, (57344 & i210) | 12582912 | (i210 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN12 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY12 = vn4.y(k33.x, h02Var);
                        long j113 = aw2Var3.g;
                        long j114 = aw2Var3.y;
                        nm0 nm0VarM117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM116, nm0VarM2, nm0VarM1), h02Var);
                        int i211 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN12, cn4VarY12, j113, j114, f2, 0.0f, null, nm0VarM117, h02Var, (57344 & i211) | 12582912 | (i211 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 24576;
                bz1Var7 = bz1Var3;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        bz1Var8 = bz1Var4;
                        if (h02Var.j(bz1Var8)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            aw2VarH = aw2Var;
                            if (h02Var.x(aw2VarH)) {
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (h02Var.r(f)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN13 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY13 = vn4.y(k33.x, h02Var);
                            long j115 = aw2Var3.g;
                            long j116 = aw2Var3.y;
                            nm0 nm0VarM119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM118, nm0VarM2, nm0VarM1), h02Var);
                            int i212 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN13, cn4VarY13, j115, j116, f2, 0.0f, null, nm0VarM119, h02Var, (57344 & i212) | 12582912 | (i212 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM1110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN14 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY14 = vn4.y(k33.x, h02Var);
                        long j117 = aw2Var3.g;
                        long j118 = aw2Var3.y;
                        nm0 nm0VarM1111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1110, nm0VarM2, nm0VarM1), h02Var);
                        int i213 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN14, cn4VarY14, j117, j118, f2, 0.0f, null, nm0VarM1111, h02Var, (57344 & i213) | 12582912 | (i213 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 196608;
                bz1Var8 = bz1Var4;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        aw2VarH = aw2Var;
                        if (h02Var.x(aw2VarH)) {
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (h02Var.r(f)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM1112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN15 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY15 = vn4.y(k33.x, h02Var);
                        long j119 = aw2Var3.g;
                        long j1110 = aw2Var3.y;
                        nm0 nm0VarM1113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1112, nm0VarM2, nm0VarM1), h02Var);
                        int i214 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN15, cn4VarY15, j119, j1110, f2, 0.0f, null, nm0VarM1113, h02Var, (57344 & i214) | 12582912 | (i214 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM1114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN16 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY16 = vn4.y(k33.x, h02Var);
                    long j1111 = aw2Var3.g;
                    long j1112 = aw2Var3.y;
                    nm0 nm0VarM1115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1114, nm0VarM2, nm0VarM1), h02Var);
                    int i215 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN16, cn4VarY16, j1111, j1112, f2, 0.0f, null, nm0VarM1115, h02Var, (57344 & i215) | 12582912 | (i215 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 384;
            bz1Var5 = bz1Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    bz1Var6 = bz1Var2;
                    if (h02Var.j(bz1Var6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        bz1Var7 = bz1Var3;
                        if (h02Var.j(bz1Var7)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            bz1Var8 = bz1Var4;
                            if (h02Var.j(bz1Var8)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                aw2VarH = aw2Var;
                                if (h02Var.x(aw2VarH)) {
                                }
                                i3 |= i19;
                            } else {
                                aw2VarH = aw2Var;
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            if ((i & 12582912) == 0) {
                                if (h02Var.r(f)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i3 |= i13;
                            }
                            i14 = i3 | 100663296;
                            i15 = i14;
                            b = 1;
                            if ((i14 & 38347923) != 38347922) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (h02Var.N(i15 & 1, z)) {
                                h02Var.S();
                                i16 = i & 1;
                                g73Var = g73.g;
                                nm0VarM0 = null;
                                if (i16 != 0) {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                } else {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                }
                                bz1Var13 = bz1Var5;
                                bz1Var14 = bz1Var6;
                                bz1Var15 = bz1Var7;
                                bz1Var16 = bz1Var8;
                                aw2Var3 = aw2VarH;
                                h02Var.s();
                                nm0 nm0VarM1116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                                if (bz1Var14 == null) {
                                    h02Var.X(-510713870);
                                    z2 = false;
                                    h02Var.b(false);
                                    nm0VarM1 = null;
                                } else {
                                    z2 = false;
                                    h02Var.X(-510713869);
                                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                    h02Var.b(false);
                                }
                                if (bz1Var13 == null) {
                                    h02Var.X(-510395686);
                                    h02Var.b(z2);
                                    nm0VarM2 = null;
                                } else {
                                    h02Var.X(-510395685);
                                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var15 == null) {
                                    h02Var.X(-510083888);
                                    h02Var.b(z2);
                                    nm0VarM3 = null;
                                } else {
                                    h02Var.X(-510083887);
                                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var16 == null) {
                                    h02Var.X(-509666659);
                                } else {
                                    h02Var.X(-509666658);
                                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                    z2 = false;
                                }
                                h02Var.b(z2);
                                objK = h02Var.K();
                                if (objK == oo0.g) {
                                    objK = new q21((byte) 25);
                                    h02Var.i0(objK);
                                }
                                j73 j73VarN17 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                                cn4 cn4VarY17 = vn4.y(k33.x, h02Var);
                                long j1113 = aw2Var3.g;
                                long j1114 = aw2Var3.y;
                                nm0 nm0VarM1117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1116, nm0VarM2, nm0VarM1), h02Var);
                                int i216 = i15 >> 9;
                                f2 = f;
                                uz4.g(j73VarN17, cn4VarY17, j1113, j1114, f2, 0.0f, null, nm0VarM1117, h02Var, (57344 & i216) | 12582912 | (i216 & 458752), 64);
                                j73Var3 = j73Var4;
                                bz1Var10 = bz1Var14;
                                aw2Var2 = aw2Var3;
                                bz1Var9 = bz1Var13;
                                bz1Var11 = bz1Var15;
                                bz1Var12 = bz1Var16;
                            } else {
                                h02Var.Q();
                                j73Var3 = j73Var2;
                                bz1Var9 = bz1Var5;
                                bz1Var10 = bz1Var6;
                                bz1Var11 = bz1Var7;
                                bz1Var12 = bz1Var8;
                                aw2Var2 = aw2VarH;
                                f2 = f;
                            }
                            u34VarP = h02Var.p();
                            if (u34VarP != null) {
                                u34VarP.n = new bz1() { // from class: bw2
                                    @Override // defpackage.bz1
                                    public final Object l(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                        return og5.g;
                                    }
                                };
                            }
                        }
                        i3 |= 12582912;
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM1118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN18 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY18 = vn4.y(k33.x, h02Var);
                            long j1115 = aw2Var3.g;
                            long j1116 = aw2Var3.y;
                            nm0 nm0VarM1119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1118, nm0VarM2, nm0VarM1), h02Var);
                            int i217 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN18, cn4VarY18, j1115, j1116, f2, 0.0f, null, nm0VarM1119, h02Var, (57344 & i217) | 12582912 | (i217 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    bz1Var8 = bz1Var4;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            aw2VarH = aw2Var;
                            if (h02Var.x(aw2VarH)) {
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (h02Var.r(f)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM11110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN19 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY19 = vn4.y(k33.x, h02Var);
                            long j1117 = aw2Var3.g;
                            long j1118 = aw2Var3.y;
                            nm0 nm0VarM11111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11110, nm0VarM2, nm0VarM1), h02Var);
                            int i218 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN19, cn4VarY19, j1117, j1118, f2, 0.0f, null, nm0VarM11111, h02Var, (57344 & i218) | 12582912 | (i218 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM11112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN110 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY110 = vn4.y(k33.x, h02Var);
                        long j1119 = aw2Var3.g;
                        long j11110 = aw2Var3.y;
                        nm0 nm0VarM11113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11112, nm0VarM2, nm0VarM1), h02Var);
                        int i219 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN110, cn4VarY110, j1119, j11110, f2, 0.0f, null, nm0VarM11113, h02Var, (57344 & i219) | 12582912 | (i219 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 24576;
                bz1Var7 = bz1Var3;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        bz1Var8 = bz1Var4;
                        if (h02Var.j(bz1Var8)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            aw2VarH = aw2Var;
                            if (h02Var.x(aw2VarH)) {
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (h02Var.r(f)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM11114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN111 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY111 = vn4.y(k33.x, h02Var);
                            long j11111 = aw2Var3.g;
                            long j11112 = aw2Var3.y;
                            nm0 nm0VarM11115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11114, nm0VarM2, nm0VarM1), h02Var);
                            int i2110 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN111, cn4VarY111, j11111, j11112, f2, 0.0f, null, nm0VarM11115, h02Var, (57344 & i2110) | 12582912 | (i2110 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM11116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN112 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY112 = vn4.y(k33.x, h02Var);
                        long j11113 = aw2Var3.g;
                        long j11114 = aw2Var3.y;
                        nm0 nm0VarM11117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11116, nm0VarM2, nm0VarM1), h02Var);
                        int i2111 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN112, cn4VarY112, j11113, j11114, f2, 0.0f, null, nm0VarM11117, h02Var, (57344 & i2111) | 12582912 | (i2111 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 196608;
                bz1Var8 = bz1Var4;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        aw2VarH = aw2Var;
                        if (h02Var.x(aw2VarH)) {
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (h02Var.r(f)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM11118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN113 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY113 = vn4.y(k33.x, h02Var);
                        long j11115 = aw2Var3.g;
                        long j11116 = aw2Var3.y;
                        nm0 nm0VarM11119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11118, nm0VarM2, nm0VarM1), h02Var);
                        int i2112 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN113, cn4VarY113, j11115, j11116, f2, 0.0f, null, nm0VarM11119, h02Var, (57344 & i2112) | 12582912 | (i2112 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM111110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN114 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY114 = vn4.y(k33.x, h02Var);
                    long j11117 = aw2Var3.g;
                    long j11118 = aw2Var3.y;
                    nm0 nm0VarM111111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111110, nm0VarM2, nm0VarM1), h02Var);
                    int i2113 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN114, cn4VarY114, j11117, j11118, f2, 0.0f, null, nm0VarM111111, h02Var, (57344 & i2113) | 12582912 | (i2113 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 3072;
            bz1Var6 = bz1Var2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    bz1Var7 = bz1Var3;
                    if (h02Var.j(bz1Var7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        bz1Var8 = bz1Var4;
                        if (h02Var.j(bz1Var8)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            aw2VarH = aw2Var;
                            if (h02Var.x(aw2VarH)) {
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (h02Var.r(f)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM111112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN115 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY115 = vn4.y(k33.x, h02Var);
                            long j11119 = aw2Var3.g;
                            long j111110 = aw2Var3.y;
                            nm0 nm0VarM111113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111112, nm0VarM2, nm0VarM1), h02Var);
                            int i2114 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN115, cn4VarY115, j11119, j111110, f2, 0.0f, null, nm0VarM111113, h02Var, (57344 & i2114) | 12582912 | (i2114 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM111114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN116 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY116 = vn4.y(k33.x, h02Var);
                        long j111111 = aw2Var3.g;
                        long j111112 = aw2Var3.y;
                        nm0 nm0VarM111115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111114, nm0VarM2, nm0VarM1), h02Var);
                        int i2115 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN116, cn4VarY116, j111111, j111112, f2, 0.0f, null, nm0VarM111115, h02Var, (57344 & i2115) | 12582912 | (i2115 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 196608;
                bz1Var8 = bz1Var4;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        aw2VarH = aw2Var;
                        if (h02Var.x(aw2VarH)) {
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (h02Var.r(f)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM111116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN117 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY117 = vn4.y(k33.x, h02Var);
                        long j111113 = aw2Var3.g;
                        long j111114 = aw2Var3.y;
                        nm0 nm0VarM111117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111116, nm0VarM2, nm0VarM1), h02Var);
                        int i2116 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN117, cn4VarY117, j111113, j111114, f2, 0.0f, null, nm0VarM111117, h02Var, (57344 & i2116) | 12582912 | (i2116 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM111118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN118 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY118 = vn4.y(k33.x, h02Var);
                    long j111115 = aw2Var3.g;
                    long j111116 = aw2Var3.y;
                    nm0 nm0VarM111119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111118, nm0VarM2, nm0VarM1), h02Var);
                    int i2117 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN118, cn4VarY118, j111115, j111116, f2, 0.0f, null, nm0VarM111119, h02Var, (57344 & i2117) | 12582912 | (i2117 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 24576;
            bz1Var7 = bz1Var3;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    bz1Var8 = bz1Var4;
                    if (h02Var.j(bz1Var8)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        aw2VarH = aw2Var;
                        if (h02Var.x(aw2VarH)) {
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (h02Var.r(f)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM1111110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN119 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY119 = vn4.y(k33.x, h02Var);
                        long j111117 = aw2Var3.g;
                        long j111118 = aw2Var3.y;
                        nm0 nm0VarM1111111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111110, nm0VarM2, nm0VarM1), h02Var);
                        int i2118 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN119, cn4VarY119, j111117, j111118, f2, 0.0f, null, nm0VarM1111111, h02Var, (57344 & i2118) | 12582912 | (i2118 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM1111112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN1110 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY1110 = vn4.y(k33.x, h02Var);
                    long j111119 = aw2Var3.g;
                    long j1111110 = aw2Var3.y;
                    nm0 nm0VarM1111113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111112, nm0VarM2, nm0VarM1), h02Var);
                    int i2119 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN1110, cn4VarY1110, j111119, j1111110, f2, 0.0f, null, nm0VarM1111113, h02Var, (57344 & i2119) | 12582912 | (i2119 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 196608;
            bz1Var8 = bz1Var4;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    aw2VarH = aw2Var;
                    if (h02Var.x(aw2VarH)) {
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i3 |= i19;
            } else {
                aw2VarH = aw2Var;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((i & 12582912) == 0) {
                    if (h02Var.r(f)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM1111114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN1111 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY1111 = vn4.y(k33.x, h02Var);
                    long j1111111 = aw2Var3.g;
                    long j1111112 = aw2Var3.y;
                    nm0 nm0VarM1111115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111114, nm0VarM2, nm0VarM1), h02Var);
                    int i21110 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN1111, cn4VarY1111, j1111111, j1111112, f2, 0.0f, null, nm0VarM1111115, h02Var, (57344 & i21110) | 12582912 | (i21110 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 12582912;
            i14 = i3 | 100663296;
            i15 = i14;
            b = 1;
            if ((i14 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                i16 = i & 1;
                g73Var = g73.g;
                nm0VarM0 = null;
                if (i16 != 0) {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                } else {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                }
                bz1Var13 = bz1Var5;
                bz1Var14 = bz1Var6;
                bz1Var15 = bz1Var7;
                bz1Var16 = bz1Var8;
                aw2Var3 = aw2VarH;
                h02Var.s();
                nm0 nm0VarM1111116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                if (bz1Var14 == null) {
                    h02Var.X(-510713870);
                    z2 = false;
                    h02Var.b(false);
                    nm0VarM1 = null;
                } else {
                    z2 = false;
                    h02Var.X(-510713869);
                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                    h02Var.b(false);
                }
                if (bz1Var13 == null) {
                    h02Var.X(-510395686);
                    h02Var.b(z2);
                    nm0VarM2 = null;
                } else {
                    h02Var.X(-510395685);
                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var15 == null) {
                    h02Var.X(-510083888);
                    h02Var.b(z2);
                    nm0VarM3 = null;
                } else {
                    h02Var.X(-510083887);
                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var16 == null) {
                    h02Var.X(-509666659);
                } else {
                    h02Var.X(-509666658);
                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                    z2 = false;
                }
                h02Var.b(z2);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new q21((byte) 25);
                    h02Var.i0(objK);
                }
                j73 j73VarN1112 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                cn4 cn4VarY1112 = vn4.y(k33.x, h02Var);
                long j1111113 = aw2Var3.g;
                long j1111114 = aw2Var3.y;
                nm0 nm0VarM1111117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111116, nm0VarM2, nm0VarM1), h02Var);
                int i21111 = i15 >> 9;
                f2 = f;
                uz4.g(j73VarN1112, cn4VarY1112, j1111113, j1111114, f2, 0.0f, null, nm0VarM1111117, h02Var, (57344 & i21111) | 12582912 | (i21111 & 458752), 64);
                j73Var3 = j73Var4;
                bz1Var10 = bz1Var14;
                aw2Var2 = aw2Var3;
                bz1Var9 = bz1Var13;
                bz1Var11 = bz1Var15;
                bz1Var12 = bz1Var16;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                bz1Var9 = bz1Var5;
                bz1Var10 = bz1Var6;
                bz1Var11 = bz1Var7;
                bz1Var12 = bz1Var8;
                aw2Var2 = aw2VarH;
                f2 = f;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: bw2
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 48;
        j73Var2 = j73Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                bz1Var5 = bz1Var;
                if (h02Var.j(bz1Var5)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    bz1Var6 = bz1Var2;
                    if (h02Var.j(bz1Var6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        bz1Var7 = bz1Var3;
                        if (h02Var.j(bz1Var7)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            bz1Var8 = bz1Var4;
                            if (h02Var.j(bz1Var8)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                aw2VarH = aw2Var;
                                if (h02Var.x(aw2VarH)) {
                                }
                                i3 |= i19;
                            } else {
                                aw2VarH = aw2Var;
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            if ((i & 12582912) == 0) {
                                if (h02Var.r(f)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i3 |= i13;
                            }
                            i14 = i3 | 100663296;
                            i15 = i14;
                            b = 1;
                            if ((i14 & 38347923) != 38347922) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (h02Var.N(i15 & 1, z)) {
                                h02Var.S();
                                i16 = i & 1;
                                g73Var = g73.g;
                                nm0VarM0 = null;
                                if (i16 != 0) {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                } else {
                                    if (i18 != 0) {
                                        j73Var2 = g73Var;
                                    }
                                    if (i4 != 0) {
                                        bz1Var5 = null;
                                    }
                                    if (i6 != 0) {
                                        bz1Var6 = null;
                                    }
                                    if (i8 != 0) {
                                        bz1Var7 = null;
                                    }
                                    if (i10 != 0) {
                                        bz1Var8 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i17 = i15 & (-3670017);
                                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                    } else {
                                        i17 = i15;
                                    }
                                    if (i12 != 0) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = f;
                                    }
                                    f = f3;
                                    j73Var4 = j73Var2;
                                    i15 = i17;
                                }
                                bz1Var13 = bz1Var5;
                                bz1Var14 = bz1Var6;
                                bz1Var15 = bz1Var7;
                                bz1Var16 = bz1Var8;
                                aw2Var3 = aw2VarH;
                                h02Var.s();
                                nm0 nm0VarM1111118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                                if (bz1Var14 == null) {
                                    h02Var.X(-510713870);
                                    z2 = false;
                                    h02Var.b(false);
                                    nm0VarM1 = null;
                                } else {
                                    z2 = false;
                                    h02Var.X(-510713869);
                                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                    h02Var.b(false);
                                }
                                if (bz1Var13 == null) {
                                    h02Var.X(-510395686);
                                    h02Var.b(z2);
                                    nm0VarM2 = null;
                                } else {
                                    h02Var.X(-510395685);
                                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var15 == null) {
                                    h02Var.X(-510083888);
                                    h02Var.b(z2);
                                    nm0VarM3 = null;
                                } else {
                                    h02Var.X(-510083887);
                                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                    h02Var.b(z2);
                                }
                                if (bz1Var16 == null) {
                                    h02Var.X(-509666659);
                                } else {
                                    h02Var.X(-509666658);
                                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                    z2 = false;
                                }
                                h02Var.b(z2);
                                objK = h02Var.K();
                                if (objK == oo0.g) {
                                    objK = new q21((byte) 25);
                                    h02Var.i0(objK);
                                }
                                j73 j73VarN1113 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                                cn4 cn4VarY1113 = vn4.y(k33.x, h02Var);
                                long j1111115 = aw2Var3.g;
                                long j1111116 = aw2Var3.y;
                                nm0 nm0VarM1111119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111118, nm0VarM2, nm0VarM1), h02Var);
                                int i21112 = i15 >> 9;
                                f2 = f;
                                uz4.g(j73VarN1113, cn4VarY1113, j1111115, j1111116, f2, 0.0f, null, nm0VarM1111119, h02Var, (57344 & i21112) | 12582912 | (i21112 & 458752), 64);
                                j73Var3 = j73Var4;
                                bz1Var10 = bz1Var14;
                                aw2Var2 = aw2Var3;
                                bz1Var9 = bz1Var13;
                                bz1Var11 = bz1Var15;
                                bz1Var12 = bz1Var16;
                            } else {
                                h02Var.Q();
                                j73Var3 = j73Var2;
                                bz1Var9 = bz1Var5;
                                bz1Var10 = bz1Var6;
                                bz1Var11 = bz1Var7;
                                bz1Var12 = bz1Var8;
                                aw2Var2 = aw2VarH;
                                f2 = f;
                            }
                            u34VarP = h02Var.p();
                            if (u34VarP != null) {
                                u34VarP.n = new bz1() { // from class: bw2
                                    @Override // defpackage.bz1
                                    public final Object l(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                        return og5.g;
                                    }
                                };
                            }
                        }
                        i3 |= 12582912;
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM11111110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN1114 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY1114 = vn4.y(k33.x, h02Var);
                            long j1111117 = aw2Var3.g;
                            long j1111118 = aw2Var3.y;
                            nm0 nm0VarM11111111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111110, nm0VarM2, nm0VarM1), h02Var);
                            int i21113 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN1114, cn4VarY1114, j1111117, j1111118, f2, 0.0f, null, nm0VarM11111111, h02Var, (57344 & i21113) | 12582912 | (i21113 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    bz1Var8 = bz1Var4;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            aw2VarH = aw2Var;
                            if (h02Var.x(aw2VarH)) {
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (h02Var.r(f)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM11111112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN1115 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY1115 = vn4.y(k33.x, h02Var);
                            long j1111119 = aw2Var3.g;
                            long j11111110 = aw2Var3.y;
                            nm0 nm0VarM11111113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111112, nm0VarM2, nm0VarM1), h02Var);
                            int i21114 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN1115, cn4VarY1115, j1111119, j11111110, f2, 0.0f, null, nm0VarM11111113, h02Var, (57344 & i21114) | 12582912 | (i21114 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM11111114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN1116 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY1116 = vn4.y(k33.x, h02Var);
                        long j11111111 = aw2Var3.g;
                        long j11111112 = aw2Var3.y;
                        nm0 nm0VarM11111115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111114, nm0VarM2, nm0VarM1), h02Var);
                        int i21115 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN1116, cn4VarY1116, j11111111, j11111112, f2, 0.0f, null, nm0VarM11111115, h02Var, (57344 & i21115) | 12582912 | (i21115 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 24576;
                bz1Var7 = bz1Var3;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        bz1Var8 = bz1Var4;
                        if (h02Var.j(bz1Var8)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            aw2VarH = aw2Var;
                            if (h02Var.x(aw2VarH)) {
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (h02Var.r(f)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM11111116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN1117 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY1117 = vn4.y(k33.x, h02Var);
                            long j11111113 = aw2Var3.g;
                            long j11111114 = aw2Var3.y;
                            nm0 nm0VarM11111117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111116, nm0VarM2, nm0VarM1), h02Var);
                            int i21116 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN1117, cn4VarY1117, j11111113, j11111114, f2, 0.0f, null, nm0VarM11111117, h02Var, (57344 & i21116) | 12582912 | (i21116 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM11111118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN1118 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY1118 = vn4.y(k33.x, h02Var);
                        long j11111115 = aw2Var3.g;
                        long j11111116 = aw2Var3.y;
                        nm0 nm0VarM11111119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111118, nm0VarM2, nm0VarM1), h02Var);
                        int i21117 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN1118, cn4VarY1118, j11111115, j11111116, f2, 0.0f, null, nm0VarM11111119, h02Var, (57344 & i21117) | 12582912 | (i21117 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 196608;
                bz1Var8 = bz1Var4;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        aw2VarH = aw2Var;
                        if (h02Var.x(aw2VarH)) {
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (h02Var.r(f)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM111111110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN1119 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY1119 = vn4.y(k33.x, h02Var);
                        long j11111117 = aw2Var3.g;
                        long j11111118 = aw2Var3.y;
                        nm0 nm0VarM111111111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111111110, nm0VarM2, nm0VarM1), h02Var);
                        int i21118 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN1119, cn4VarY1119, j11111117, j11111118, f2, 0.0f, null, nm0VarM111111111, h02Var, (57344 & i21118) | 12582912 | (i21118 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM111111112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN11110 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY11110 = vn4.y(k33.x, h02Var);
                    long j11111119 = aw2Var3.g;
                    long j111111110 = aw2Var3.y;
                    nm0 nm0VarM111111113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111111112, nm0VarM2, nm0VarM1), h02Var);
                    int i21119 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN11110, cn4VarY11110, j11111119, j111111110, f2, 0.0f, null, nm0VarM111111113, h02Var, (57344 & i21119) | 12582912 | (i21119 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 3072;
            bz1Var6 = bz1Var2;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    bz1Var7 = bz1Var3;
                    if (h02Var.j(bz1Var7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        bz1Var8 = bz1Var4;
                        if (h02Var.j(bz1Var8)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            aw2VarH = aw2Var;
                            if (h02Var.x(aw2VarH)) {
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (h02Var.r(f)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM111111114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN11111 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY11111 = vn4.y(k33.x, h02Var);
                            long j111111111 = aw2Var3.g;
                            long j111111112 = aw2Var3.y;
                            nm0 nm0VarM111111115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111111114, nm0VarM2, nm0VarM1), h02Var);
                            int i211110 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN11111, cn4VarY11111, j111111111, j111111112, f2, 0.0f, null, nm0VarM111111115, h02Var, (57344 & i211110) | 12582912 | (i211110 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM111111116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN11112 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY11112 = vn4.y(k33.x, h02Var);
                        long j111111113 = aw2Var3.g;
                        long j111111114 = aw2Var3.y;
                        nm0 nm0VarM111111117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111111116, nm0VarM2, nm0VarM1), h02Var);
                        int i211111 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN11112, cn4VarY11112, j111111113, j111111114, f2, 0.0f, null, nm0VarM111111117, h02Var, (57344 & i211111) | 12582912 | (i211111 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 196608;
                bz1Var8 = bz1Var4;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        aw2VarH = aw2Var;
                        if (h02Var.x(aw2VarH)) {
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (h02Var.r(f)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM111111118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN11113 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY11113 = vn4.y(k33.x, h02Var);
                        long j111111115 = aw2Var3.g;
                        long j111111116 = aw2Var3.y;
                        nm0 nm0VarM111111119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111111118, nm0VarM2, nm0VarM1), h02Var);
                        int i211112 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN11113, cn4VarY11113, j111111115, j111111116, f2, 0.0f, null, nm0VarM111111119, h02Var, (57344 & i211112) | 12582912 | (i211112 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM1111111110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN11114 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY11114 = vn4.y(k33.x, h02Var);
                    long j111111117 = aw2Var3.g;
                    long j111111118 = aw2Var3.y;
                    nm0 nm0VarM1111111111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111111110, nm0VarM2, nm0VarM1), h02Var);
                    int i211113 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN11114, cn4VarY11114, j111111117, j111111118, f2, 0.0f, null, nm0VarM1111111111, h02Var, (57344 & i211113) | 12582912 | (i211113 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 24576;
            bz1Var7 = bz1Var3;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    bz1Var8 = bz1Var4;
                    if (h02Var.j(bz1Var8)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        aw2VarH = aw2Var;
                        if (h02Var.x(aw2VarH)) {
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (h02Var.r(f)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM1111111112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN11115 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY11115 = vn4.y(k33.x, h02Var);
                        long j111111119 = aw2Var3.g;
                        long j1111111110 = aw2Var3.y;
                        nm0 nm0VarM1111111113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111111112, nm0VarM2, nm0VarM1), h02Var);
                        int i211114 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN11115, cn4VarY11115, j111111119, j1111111110, f2, 0.0f, null, nm0VarM1111111113, h02Var, (57344 & i211114) | 12582912 | (i211114 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM1111111114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN11116 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY11116 = vn4.y(k33.x, h02Var);
                    long j1111111111 = aw2Var3.g;
                    long j1111111112 = aw2Var3.y;
                    nm0 nm0VarM1111111115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111111114, nm0VarM2, nm0VarM1), h02Var);
                    int i211115 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN11116, cn4VarY11116, j1111111111, j1111111112, f2, 0.0f, null, nm0VarM1111111115, h02Var, (57344 & i211115) | 12582912 | (i211115 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 196608;
            bz1Var8 = bz1Var4;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    aw2VarH = aw2Var;
                    if (h02Var.x(aw2VarH)) {
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i3 |= i19;
            } else {
                aw2VarH = aw2Var;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((i & 12582912) == 0) {
                    if (h02Var.r(f)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM1111111116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN11117 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY11117 = vn4.y(k33.x, h02Var);
                    long j1111111113 = aw2Var3.g;
                    long j1111111114 = aw2Var3.y;
                    nm0 nm0VarM1111111117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111111116, nm0VarM2, nm0VarM1), h02Var);
                    int i211116 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN11117, cn4VarY11117, j1111111113, j1111111114, f2, 0.0f, null, nm0VarM1111111117, h02Var, (57344 & i211116) | 12582912 | (i211116 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 12582912;
            i14 = i3 | 100663296;
            i15 = i14;
            b = 1;
            if ((i14 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                i16 = i & 1;
                g73Var = g73.g;
                nm0VarM0 = null;
                if (i16 != 0) {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                } else {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                }
                bz1Var13 = bz1Var5;
                bz1Var14 = bz1Var6;
                bz1Var15 = bz1Var7;
                bz1Var16 = bz1Var8;
                aw2Var3 = aw2VarH;
                h02Var.s();
                nm0 nm0VarM1111111118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                if (bz1Var14 == null) {
                    h02Var.X(-510713870);
                    z2 = false;
                    h02Var.b(false);
                    nm0VarM1 = null;
                } else {
                    z2 = false;
                    h02Var.X(-510713869);
                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                    h02Var.b(false);
                }
                if (bz1Var13 == null) {
                    h02Var.X(-510395686);
                    h02Var.b(z2);
                    nm0VarM2 = null;
                } else {
                    h02Var.X(-510395685);
                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var15 == null) {
                    h02Var.X(-510083888);
                    h02Var.b(z2);
                    nm0VarM3 = null;
                } else {
                    h02Var.X(-510083887);
                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var16 == null) {
                    h02Var.X(-509666659);
                } else {
                    h02Var.X(-509666658);
                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                    z2 = false;
                }
                h02Var.b(z2);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new q21((byte) 25);
                    h02Var.i0(objK);
                }
                j73 j73VarN11118 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                cn4 cn4VarY11118 = vn4.y(k33.x, h02Var);
                long j1111111115 = aw2Var3.g;
                long j1111111116 = aw2Var3.y;
                nm0 nm0VarM1111111119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111111118, nm0VarM2, nm0VarM1), h02Var);
                int i211117 = i15 >> 9;
                f2 = f;
                uz4.g(j73VarN11118, cn4VarY11118, j1111111115, j1111111116, f2, 0.0f, null, nm0VarM1111111119, h02Var, (57344 & i211117) | 12582912 | (i211117 & 458752), 64);
                j73Var3 = j73Var4;
                bz1Var10 = bz1Var14;
                aw2Var2 = aw2Var3;
                bz1Var9 = bz1Var13;
                bz1Var11 = bz1Var15;
                bz1Var12 = bz1Var16;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                bz1Var9 = bz1Var5;
                bz1Var10 = bz1Var6;
                bz1Var11 = bz1Var7;
                bz1Var12 = bz1Var8;
                aw2Var2 = aw2VarH;
                f2 = f;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: bw2
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 384;
        bz1Var5 = bz1Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                bz1Var6 = bz1Var2;
                if (h02Var.j(bz1Var6)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    bz1Var7 = bz1Var3;
                    if (h02Var.j(bz1Var7)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        bz1Var8 = bz1Var4;
                        if (h02Var.j(bz1Var8)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            aw2VarH = aw2Var;
                            if (h02Var.x(aw2VarH)) {
                            }
                            i3 |= i19;
                        } else {
                            aw2VarH = aw2Var;
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((i & 12582912) == 0) {
                            if (h02Var.r(f)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i3 |= i13;
                        }
                        i14 = i3 | 100663296;
                        i15 = i14;
                        b = 1;
                        if ((i14 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (h02Var.N(i15 & 1, z)) {
                            h02Var.S();
                            i16 = i & 1;
                            g73Var = g73.g;
                            nm0VarM0 = null;
                            if (i16 != 0) {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            } else {
                                if (i18 != 0) {
                                    j73Var2 = g73Var;
                                }
                                if (i4 != 0) {
                                    bz1Var5 = null;
                                }
                                if (i6 != 0) {
                                    bz1Var6 = null;
                                }
                                if (i8 != 0) {
                                    bz1Var7 = null;
                                }
                                if (i10 != 0) {
                                    bz1Var8 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    i17 = i15 & (-3670017);
                                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                                } else {
                                    i17 = i15;
                                }
                                if (i12 != 0) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = f;
                                }
                                f = f3;
                                j73Var4 = j73Var2;
                                i15 = i17;
                            }
                            bz1Var13 = bz1Var5;
                            bz1Var14 = bz1Var6;
                            bz1Var15 = bz1Var7;
                            bz1Var16 = bz1Var8;
                            aw2Var3 = aw2VarH;
                            h02Var.s();
                            nm0 nm0VarM11111111110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                            if (bz1Var14 == null) {
                                h02Var.X(-510713870);
                                z2 = false;
                                h02Var.b(false);
                                nm0VarM1 = null;
                            } else {
                                z2 = false;
                                h02Var.X(-510713869);
                                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                                h02Var.b(false);
                            }
                            if (bz1Var13 == null) {
                                h02Var.X(-510395686);
                                h02Var.b(z2);
                                nm0VarM2 = null;
                            } else {
                                h02Var.X(-510395685);
                                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var15 == null) {
                                h02Var.X(-510083888);
                                h02Var.b(z2);
                                nm0VarM3 = null;
                            } else {
                                h02Var.X(-510083887);
                                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                                h02Var.b(z2);
                            }
                            if (bz1Var16 == null) {
                                h02Var.X(-509666659);
                            } else {
                                h02Var.X(-509666658);
                                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                                z2 = false;
                            }
                            h02Var.b(z2);
                            objK = h02Var.K();
                            if (objK == oo0.g) {
                                objK = new q21((byte) 25);
                                h02Var.i0(objK);
                            }
                            j73 j73VarN11119 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                            cn4 cn4VarY11119 = vn4.y(k33.x, h02Var);
                            long j1111111117 = aw2Var3.g;
                            long j1111111118 = aw2Var3.y;
                            nm0 nm0VarM11111111111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111111110, nm0VarM2, nm0VarM1), h02Var);
                            int i211118 = i15 >> 9;
                            f2 = f;
                            uz4.g(j73VarN11119, cn4VarY11119, j1111111117, j1111111118, f2, 0.0f, null, nm0VarM11111111111, h02Var, (57344 & i211118) | 12582912 | (i211118 & 458752), 64);
                            j73Var3 = j73Var4;
                            bz1Var10 = bz1Var14;
                            aw2Var2 = aw2Var3;
                            bz1Var9 = bz1Var13;
                            bz1Var11 = bz1Var15;
                            bz1Var12 = bz1Var16;
                        } else {
                            h02Var.Q();
                            j73Var3 = j73Var2;
                            bz1Var9 = bz1Var5;
                            bz1Var10 = bz1Var6;
                            bz1Var11 = bz1Var7;
                            bz1Var12 = bz1Var8;
                            aw2Var2 = aw2VarH;
                            f2 = f;
                        }
                        u34VarP = h02Var.p();
                        if (u34VarP != null) {
                            u34VarP.n = new bz1() { // from class: bw2
                                @Override // defpackage.bz1
                                public final Object l(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                    return og5.g;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM11111111112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN111110 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY111110 = vn4.y(k33.x, h02Var);
                        long j1111111119 = aw2Var3.g;
                        long j11111111110 = aw2Var3.y;
                        nm0 nm0VarM11111111113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111111112, nm0VarM2, nm0VarM1), h02Var);
                        int i211119 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN111110, cn4VarY111110, j1111111119, j11111111110, f2, 0.0f, null, nm0VarM11111111113, h02Var, (57344 & i211119) | 12582912 | (i211119 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 196608;
                bz1Var8 = bz1Var4;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        aw2VarH = aw2Var;
                        if (h02Var.x(aw2VarH)) {
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (h02Var.r(f)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM11111111114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN111111 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY111111 = vn4.y(k33.x, h02Var);
                        long j11111111111 = aw2Var3.g;
                        long j11111111112 = aw2Var3.y;
                        nm0 nm0VarM11111111115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111111114, nm0VarM2, nm0VarM1), h02Var);
                        int i2111110 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN111111, cn4VarY111111, j11111111111, j11111111112, f2, 0.0f, null, nm0VarM11111111115, h02Var, (57344 & i2111110) | 12582912 | (i2111110 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM11111111116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN111112 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY111112 = vn4.y(k33.x, h02Var);
                    long j11111111113 = aw2Var3.g;
                    long j11111111114 = aw2Var3.y;
                    nm0 nm0VarM11111111117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111111116, nm0VarM2, nm0VarM1), h02Var);
                    int i2111111 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN111112, cn4VarY111112, j11111111113, j11111111114, f2, 0.0f, null, nm0VarM11111111117, h02Var, (57344 & i2111111) | 12582912 | (i2111111 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 24576;
            bz1Var7 = bz1Var3;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    bz1Var8 = bz1Var4;
                    if (h02Var.j(bz1Var8)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        aw2VarH = aw2Var;
                        if (h02Var.x(aw2VarH)) {
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (h02Var.r(f)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM11111111118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN111113 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY111113 = vn4.y(k33.x, h02Var);
                        long j11111111115 = aw2Var3.g;
                        long j11111111116 = aw2Var3.y;
                        nm0 nm0VarM11111111119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111111118, nm0VarM2, nm0VarM1), h02Var);
                        int i2111112 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN111113, cn4VarY111113, j11111111115, j11111111116, f2, 0.0f, null, nm0VarM11111111119, h02Var, (57344 & i2111112) | 12582912 | (i2111112 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM111111111110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN111114 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY111114 = vn4.y(k33.x, h02Var);
                    long j11111111117 = aw2Var3.g;
                    long j11111111118 = aw2Var3.y;
                    nm0 nm0VarM111111111111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111111111110, nm0VarM2, nm0VarM1), h02Var);
                    int i2111113 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN111114, cn4VarY111114, j11111111117, j11111111118, f2, 0.0f, null, nm0VarM111111111111, h02Var, (57344 & i2111113) | 12582912 | (i2111113 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 196608;
            bz1Var8 = bz1Var4;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    aw2VarH = aw2Var;
                    if (h02Var.x(aw2VarH)) {
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i3 |= i19;
            } else {
                aw2VarH = aw2Var;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((i & 12582912) == 0) {
                    if (h02Var.r(f)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM111111111112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN111115 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY111115 = vn4.y(k33.x, h02Var);
                    long j11111111119 = aw2Var3.g;
                    long j111111111110 = aw2Var3.y;
                    nm0 nm0VarM111111111113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111111111112, nm0VarM2, nm0VarM1), h02Var);
                    int i2111114 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN111115, cn4VarY111115, j11111111119, j111111111110, f2, 0.0f, null, nm0VarM111111111113, h02Var, (57344 & i2111114) | 12582912 | (i2111114 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 12582912;
            i14 = i3 | 100663296;
            i15 = i14;
            b = 1;
            if ((i14 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                i16 = i & 1;
                g73Var = g73.g;
                nm0VarM0 = null;
                if (i16 != 0) {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                } else {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                }
                bz1Var13 = bz1Var5;
                bz1Var14 = bz1Var6;
                bz1Var15 = bz1Var7;
                bz1Var16 = bz1Var8;
                aw2Var3 = aw2VarH;
                h02Var.s();
                nm0 nm0VarM111111111114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                if (bz1Var14 == null) {
                    h02Var.X(-510713870);
                    z2 = false;
                    h02Var.b(false);
                    nm0VarM1 = null;
                } else {
                    z2 = false;
                    h02Var.X(-510713869);
                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                    h02Var.b(false);
                }
                if (bz1Var13 == null) {
                    h02Var.X(-510395686);
                    h02Var.b(z2);
                    nm0VarM2 = null;
                } else {
                    h02Var.X(-510395685);
                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var15 == null) {
                    h02Var.X(-510083888);
                    h02Var.b(z2);
                    nm0VarM3 = null;
                } else {
                    h02Var.X(-510083887);
                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var16 == null) {
                    h02Var.X(-509666659);
                } else {
                    h02Var.X(-509666658);
                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                    z2 = false;
                }
                h02Var.b(z2);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new q21((byte) 25);
                    h02Var.i0(objK);
                }
                j73 j73VarN111116 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                cn4 cn4VarY111116 = vn4.y(k33.x, h02Var);
                long j111111111111 = aw2Var3.g;
                long j111111111112 = aw2Var3.y;
                nm0 nm0VarM111111111115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111111111114, nm0VarM2, nm0VarM1), h02Var);
                int i2111115 = i15 >> 9;
                f2 = f;
                uz4.g(j73VarN111116, cn4VarY111116, j111111111111, j111111111112, f2, 0.0f, null, nm0VarM111111111115, h02Var, (57344 & i2111115) | 12582912 | (i2111115 & 458752), 64);
                j73Var3 = j73Var4;
                bz1Var10 = bz1Var14;
                aw2Var2 = aw2Var3;
                bz1Var9 = bz1Var13;
                bz1Var11 = bz1Var15;
                bz1Var12 = bz1Var16;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                bz1Var9 = bz1Var5;
                bz1Var10 = bz1Var6;
                bz1Var11 = bz1Var7;
                bz1Var12 = bz1Var8;
                aw2Var2 = aw2VarH;
                f2 = f;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: bw2
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 3072;
        bz1Var6 = bz1Var2;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                bz1Var7 = bz1Var3;
                if (h02Var.j(bz1Var7)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    bz1Var8 = bz1Var4;
                    if (h02Var.j(bz1Var8)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        aw2VarH = aw2Var;
                        if (h02Var.x(aw2VarH)) {
                        }
                        i3 |= i19;
                    } else {
                        aw2VarH = aw2Var;
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((i & 12582912) == 0) {
                        if (h02Var.r(f)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    i14 = i3 | 100663296;
                    i15 = i14;
                    b = 1;
                    if ((i14 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (h02Var.N(i15 & 1, z)) {
                        h02Var.S();
                        i16 = i & 1;
                        g73Var = g73.g;
                        nm0VarM0 = null;
                        if (i16 != 0) {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        } else {
                            if (i18 != 0) {
                                j73Var2 = g73Var;
                            }
                            if (i4 != 0) {
                                bz1Var5 = null;
                            }
                            if (i6 != 0) {
                                bz1Var6 = null;
                            }
                            if (i8 != 0) {
                                bz1Var7 = null;
                            }
                            if (i10 != 0) {
                                bz1Var8 = null;
                            }
                            if ((i2 & 64) != 0) {
                                i17 = i15 & (-3670017);
                                aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                            } else {
                                i17 = i15;
                            }
                            if (i12 != 0) {
                                f3 = 0.0f;
                            } else {
                                f3 = f;
                            }
                            f = f3;
                            j73Var4 = j73Var2;
                            i15 = i17;
                        }
                        bz1Var13 = bz1Var5;
                        bz1Var14 = bz1Var6;
                        bz1Var15 = bz1Var7;
                        bz1Var16 = bz1Var8;
                        aw2Var3 = aw2VarH;
                        h02Var.s();
                        nm0 nm0VarM111111111116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                        if (bz1Var14 == null) {
                            h02Var.X(-510713870);
                            z2 = false;
                            h02Var.b(false);
                            nm0VarM1 = null;
                        } else {
                            z2 = false;
                            h02Var.X(-510713869);
                            nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                            h02Var.b(false);
                        }
                        if (bz1Var13 == null) {
                            h02Var.X(-510395686);
                            h02Var.b(z2);
                            nm0VarM2 = null;
                        } else {
                            h02Var.X(-510395685);
                            nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var15 == null) {
                            h02Var.X(-510083888);
                            h02Var.b(z2);
                            nm0VarM3 = null;
                        } else {
                            h02Var.X(-510083887);
                            nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                            h02Var.b(z2);
                        }
                        if (bz1Var16 == null) {
                            h02Var.X(-509666659);
                        } else {
                            h02Var.X(-509666658);
                            nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                            z2 = false;
                        }
                        h02Var.b(z2);
                        objK = h02Var.K();
                        if (objK == oo0.g) {
                            objK = new q21((byte) 25);
                            h02Var.i0(objK);
                        }
                        j73 j73VarN111117 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                        cn4 cn4VarY111117 = vn4.y(k33.x, h02Var);
                        long j111111111113 = aw2Var3.g;
                        long j111111111114 = aw2Var3.y;
                        nm0 nm0VarM111111111117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111111111116, nm0VarM2, nm0VarM1), h02Var);
                        int i2111116 = i15 >> 9;
                        f2 = f;
                        uz4.g(j73VarN111117, cn4VarY111117, j111111111113, j111111111114, f2, 0.0f, null, nm0VarM111111111117, h02Var, (57344 & i2111116) | 12582912 | (i2111116 & 458752), 64);
                        j73Var3 = j73Var4;
                        bz1Var10 = bz1Var14;
                        aw2Var2 = aw2Var3;
                        bz1Var9 = bz1Var13;
                        bz1Var11 = bz1Var15;
                        bz1Var12 = bz1Var16;
                    } else {
                        h02Var.Q();
                        j73Var3 = j73Var2;
                        bz1Var9 = bz1Var5;
                        bz1Var10 = bz1Var6;
                        bz1Var11 = bz1Var7;
                        bz1Var12 = bz1Var8;
                        aw2Var2 = aw2VarH;
                        f2 = f;
                    }
                    u34VarP = h02Var.p();
                    if (u34VarP != null) {
                        u34VarP.n = new bz1() { // from class: bw2
                            @Override // defpackage.bz1
                            public final Object l(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                                return og5.g;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM111111111118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN111118 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY111118 = vn4.y(k33.x, h02Var);
                    long j111111111115 = aw2Var3.g;
                    long j111111111116 = aw2Var3.y;
                    nm0 nm0VarM111111111119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM111111111118, nm0VarM2, nm0VarM1), h02Var);
                    int i2111117 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN111118, cn4VarY111118, j111111111115, j111111111116, f2, 0.0f, null, nm0VarM111111111119, h02Var, (57344 & i2111117) | 12582912 | (i2111117 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 196608;
            bz1Var8 = bz1Var4;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    aw2VarH = aw2Var;
                    if (h02Var.x(aw2VarH)) {
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i3 |= i19;
            } else {
                aw2VarH = aw2Var;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((i & 12582912) == 0) {
                    if (h02Var.r(f)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM1111111111110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN111119 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY111119 = vn4.y(k33.x, h02Var);
                    long j111111111117 = aw2Var3.g;
                    long j111111111118 = aw2Var3.y;
                    nm0 nm0VarM1111111111111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111111111110, nm0VarM2, nm0VarM1), h02Var);
                    int i2111118 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN111119, cn4VarY111119, j111111111117, j111111111118, f2, 0.0f, null, nm0VarM1111111111111, h02Var, (57344 & i2111118) | 12582912 | (i2111118 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 12582912;
            i14 = i3 | 100663296;
            i15 = i14;
            b = 1;
            if ((i14 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                i16 = i & 1;
                g73Var = g73.g;
                nm0VarM0 = null;
                if (i16 != 0) {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                } else {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                }
                bz1Var13 = bz1Var5;
                bz1Var14 = bz1Var6;
                bz1Var15 = bz1Var7;
                bz1Var16 = bz1Var8;
                aw2Var3 = aw2VarH;
                h02Var.s();
                nm0 nm0VarM1111111111112 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                if (bz1Var14 == null) {
                    h02Var.X(-510713870);
                    z2 = false;
                    h02Var.b(false);
                    nm0VarM1 = null;
                } else {
                    z2 = false;
                    h02Var.X(-510713869);
                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                    h02Var.b(false);
                }
                if (bz1Var13 == null) {
                    h02Var.X(-510395686);
                    h02Var.b(z2);
                    nm0VarM2 = null;
                } else {
                    h02Var.X(-510395685);
                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var15 == null) {
                    h02Var.X(-510083888);
                    h02Var.b(z2);
                    nm0VarM3 = null;
                } else {
                    h02Var.X(-510083887);
                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var16 == null) {
                    h02Var.X(-509666659);
                } else {
                    h02Var.X(-509666658);
                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                    z2 = false;
                }
                h02Var.b(z2);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new q21((byte) 25);
                    h02Var.i0(objK);
                }
                j73 j73VarN1111110 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                cn4 cn4VarY1111110 = vn4.y(k33.x, h02Var);
                long j111111111119 = aw2Var3.g;
                long j1111111111110 = aw2Var3.y;
                nm0 nm0VarM1111111111113 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111111111112, nm0VarM2, nm0VarM1), h02Var);
                int i2111119 = i15 >> 9;
                f2 = f;
                uz4.g(j73VarN1111110, cn4VarY1111110, j111111111119, j1111111111110, f2, 0.0f, null, nm0VarM1111111111113, h02Var, (57344 & i2111119) | 12582912 | (i2111119 & 458752), 64);
                j73Var3 = j73Var4;
                bz1Var10 = bz1Var14;
                aw2Var2 = aw2Var3;
                bz1Var9 = bz1Var13;
                bz1Var11 = bz1Var15;
                bz1Var12 = bz1Var16;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                bz1Var9 = bz1Var5;
                bz1Var10 = bz1Var6;
                bz1Var11 = bz1Var7;
                bz1Var12 = bz1Var8;
                aw2Var2 = aw2VarH;
                f2 = f;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: bw2
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 24576;
        bz1Var7 = bz1Var3;
        i10 = i2 & 32;
        if (i10 != 0) {
            if ((196608 & i) == 0) {
                bz1Var8 = bz1Var4;
                if (h02Var.j(bz1Var8)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    aw2VarH = aw2Var;
                    if (h02Var.x(aw2VarH)) {
                    }
                    i3 |= i19;
                } else {
                    aw2VarH = aw2Var;
                }
                i3 |= i19;
            } else {
                aw2VarH = aw2Var;
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((i & 12582912) == 0) {
                    if (h02Var.r(f)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                i14 = i3 | 100663296;
                i15 = i14;
                b = 1;
                if ((i14 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (h02Var.N(i15 & 1, z)) {
                    h02Var.S();
                    i16 = i & 1;
                    g73Var = g73.g;
                    nm0VarM0 = null;
                    if (i16 != 0) {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    } else {
                        if (i18 != 0) {
                            j73Var2 = g73Var;
                        }
                        if (i4 != 0) {
                            bz1Var5 = null;
                        }
                        if (i6 != 0) {
                            bz1Var6 = null;
                        }
                        if (i8 != 0) {
                            bz1Var7 = null;
                        }
                        if (i10 != 0) {
                            bz1Var8 = null;
                        }
                        if ((i2 & 64) != 0) {
                            i17 = i15 & (-3670017);
                            aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                        } else {
                            i17 = i15;
                        }
                        if (i12 != 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = f;
                        }
                        f = f3;
                        j73Var4 = j73Var2;
                        i15 = i17;
                    }
                    bz1Var13 = bz1Var5;
                    bz1Var14 = bz1Var6;
                    bz1Var15 = bz1Var7;
                    bz1Var16 = bz1Var8;
                    aw2Var3 = aw2VarH;
                    h02Var.s();
                    nm0 nm0VarM1111111111114 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                    if (bz1Var14 == null) {
                        h02Var.X(-510713870);
                        z2 = false;
                        h02Var.b(false);
                        nm0VarM1 = null;
                    } else {
                        z2 = false;
                        h02Var.X(-510713869);
                        nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                        h02Var.b(false);
                    }
                    if (bz1Var13 == null) {
                        h02Var.X(-510395686);
                        h02Var.b(z2);
                        nm0VarM2 = null;
                    } else {
                        h02Var.X(-510395685);
                        nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var15 == null) {
                        h02Var.X(-510083888);
                        h02Var.b(z2);
                        nm0VarM3 = null;
                    } else {
                        h02Var.X(-510083887);
                        nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                        h02Var.b(z2);
                    }
                    if (bz1Var16 == null) {
                        h02Var.X(-509666659);
                    } else {
                        h02Var.X(-509666658);
                        nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                        z2 = false;
                    }
                    h02Var.b(z2);
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new q21((byte) 25);
                        h02Var.i0(objK);
                    }
                    j73 j73VarN1111111 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                    cn4 cn4VarY1111111 = vn4.y(k33.x, h02Var);
                    long j1111111111111 = aw2Var3.g;
                    long j1111111111112 = aw2Var3.y;
                    nm0 nm0VarM1111111111115 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111111111114, nm0VarM2, nm0VarM1), h02Var);
                    int i21111110 = i15 >> 9;
                    f2 = f;
                    uz4.g(j73VarN1111111, cn4VarY1111111, j1111111111111, j1111111111112, f2, 0.0f, null, nm0VarM1111111111115, h02Var, (57344 & i21111110) | 12582912 | (i21111110 & 458752), 64);
                    j73Var3 = j73Var4;
                    bz1Var10 = bz1Var14;
                    aw2Var2 = aw2Var3;
                    bz1Var9 = bz1Var13;
                    bz1Var11 = bz1Var15;
                    bz1Var12 = bz1Var16;
                } else {
                    h02Var.Q();
                    j73Var3 = j73Var2;
                    bz1Var9 = bz1Var5;
                    bz1Var10 = bz1Var6;
                    bz1Var11 = bz1Var7;
                    bz1Var12 = bz1Var8;
                    aw2Var2 = aw2VarH;
                    f2 = f;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: bw2
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                            return og5.g;
                        }
                    };
                }
            }
            i3 |= 12582912;
            i14 = i3 | 100663296;
            i15 = i14;
            b = 1;
            if ((i14 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                i16 = i & 1;
                g73Var = g73.g;
                nm0VarM0 = null;
                if (i16 != 0) {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                } else {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                }
                bz1Var13 = bz1Var5;
                bz1Var14 = bz1Var6;
                bz1Var15 = bz1Var7;
                bz1Var16 = bz1Var8;
                aw2Var3 = aw2VarH;
                h02Var.s();
                nm0 nm0VarM1111111111116 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                if (bz1Var14 == null) {
                    h02Var.X(-510713870);
                    z2 = false;
                    h02Var.b(false);
                    nm0VarM1 = null;
                } else {
                    z2 = false;
                    h02Var.X(-510713869);
                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                    h02Var.b(false);
                }
                if (bz1Var13 == null) {
                    h02Var.X(-510395686);
                    h02Var.b(z2);
                    nm0VarM2 = null;
                } else {
                    h02Var.X(-510395685);
                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var15 == null) {
                    h02Var.X(-510083888);
                    h02Var.b(z2);
                    nm0VarM3 = null;
                } else {
                    h02Var.X(-510083887);
                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var16 == null) {
                    h02Var.X(-509666659);
                } else {
                    h02Var.X(-509666658);
                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                    z2 = false;
                }
                h02Var.b(z2);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new q21((byte) 25);
                    h02Var.i0(objK);
                }
                j73 j73VarN1111112 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                cn4 cn4VarY1111112 = vn4.y(k33.x, h02Var);
                long j1111111111113 = aw2Var3.g;
                long j1111111111114 = aw2Var3.y;
                nm0 nm0VarM1111111111117 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111111111116, nm0VarM2, nm0VarM1), h02Var);
                int i21111111 = i15 >> 9;
                f2 = f;
                uz4.g(j73VarN1111112, cn4VarY1111112, j1111111111113, j1111111111114, f2, 0.0f, null, nm0VarM1111111111117, h02Var, (57344 & i21111111) | 12582912 | (i21111111 & 458752), 64);
                j73Var3 = j73Var4;
                bz1Var10 = bz1Var14;
                aw2Var2 = aw2Var3;
                bz1Var9 = bz1Var13;
                bz1Var11 = bz1Var15;
                bz1Var12 = bz1Var16;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                bz1Var9 = bz1Var5;
                bz1Var10 = bz1Var6;
                bz1Var11 = bz1Var7;
                bz1Var12 = bz1Var8;
                aw2Var2 = aw2VarH;
                f2 = f;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: bw2
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 196608;
        bz1Var8 = bz1Var4;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                aw2VarH = aw2Var;
                if (h02Var.x(aw2VarH)) {
                }
                i3 |= i19;
            } else {
                aw2VarH = aw2Var;
            }
            i3 |= i19;
        } else {
            aw2VarH = aw2Var;
        }
        i12 = i2 & 128;
        if (i12 != 0) {
            if ((i & 12582912) == 0) {
                if (h02Var.r(f)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            i14 = i3 | 100663296;
            i15 = i14;
            b = 1;
            if ((i14 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i15 & 1, z)) {
                h02Var.S();
                i16 = i & 1;
                g73Var = g73.g;
                nm0VarM0 = null;
                if (i16 != 0) {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                } else {
                    if (i18 != 0) {
                        j73Var2 = g73Var;
                    }
                    if (i4 != 0) {
                        bz1Var5 = null;
                    }
                    if (i6 != 0) {
                        bz1Var6 = null;
                    }
                    if (i8 != 0) {
                        bz1Var7 = null;
                    }
                    if (i10 != 0) {
                        bz1Var8 = null;
                    }
                    if ((i2 & 64) != 0) {
                        i17 = i15 & (-3670017);
                        aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                    } else {
                        i17 = i15;
                    }
                    if (i12 != 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = f;
                    }
                    f = f3;
                    j73Var4 = j73Var2;
                    i15 = i17;
                }
                bz1Var13 = bz1Var5;
                bz1Var14 = bz1Var6;
                bz1Var15 = bz1Var7;
                bz1Var16 = bz1Var8;
                aw2Var3 = aw2VarH;
                h02Var.s();
                nm0 nm0VarM1111111111118 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
                if (bz1Var14 == null) {
                    h02Var.X(-510713870);
                    z2 = false;
                    h02Var.b(false);
                    nm0VarM1 = null;
                } else {
                    z2 = false;
                    h02Var.X(-510713869);
                    nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                    h02Var.b(false);
                }
                if (bz1Var13 == null) {
                    h02Var.X(-510395686);
                    h02Var.b(z2);
                    nm0VarM2 = null;
                } else {
                    h02Var.X(-510395685);
                    nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var15 == null) {
                    h02Var.X(-510083888);
                    h02Var.b(z2);
                    nm0VarM3 = null;
                } else {
                    h02Var.X(-510083887);
                    nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                    h02Var.b(z2);
                }
                if (bz1Var16 == null) {
                    h02Var.X(-509666659);
                } else {
                    h02Var.X(-509666658);
                    nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                    z2 = false;
                }
                h02Var.b(z2);
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new q21((byte) 25);
                    h02Var.i0(objK);
                }
                j73 j73VarN1111113 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
                cn4 cn4VarY1111113 = vn4.y(k33.x, h02Var);
                long j1111111111115 = aw2Var3.g;
                long j1111111111116 = aw2Var3.y;
                nm0 nm0VarM1111111111119 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM1111111111118, nm0VarM2, nm0VarM1), h02Var);
                int i21111112 = i15 >> 9;
                f2 = f;
                uz4.g(j73VarN1111113, cn4VarY1111113, j1111111111115, j1111111111116, f2, 0.0f, null, nm0VarM1111111111119, h02Var, (57344 & i21111112) | 12582912 | (i21111112 & 458752), 64);
                j73Var3 = j73Var4;
                bz1Var10 = bz1Var14;
                aw2Var2 = aw2Var3;
                bz1Var9 = bz1Var13;
                bz1Var11 = bz1Var15;
                bz1Var12 = bz1Var16;
            } else {
                h02Var.Q();
                j73Var3 = j73Var2;
                bz1Var9 = bz1Var5;
                bz1Var10 = bz1Var6;
                bz1Var11 = bz1Var7;
                bz1Var12 = bz1Var8;
                aw2Var2 = aw2VarH;
                f2 = f;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: bw2
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i3 |= 12582912;
        i14 = i3 | 100663296;
        i15 = i14;
        b = 1;
        if ((i14 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (h02Var.N(i15 & 1, z)) {
            h02Var.S();
            i16 = i & 1;
            g73Var = g73.g;
            nm0VarM0 = null;
            if (i16 != 0) {
                if (i18 != 0) {
                    j73Var2 = g73Var;
                }
                if (i4 != 0) {
                    bz1Var5 = null;
                }
                if (i6 != 0) {
                    bz1Var6 = null;
                }
                if (i8 != 0) {
                    bz1Var7 = null;
                }
                if (i10 != 0) {
                    bz1Var8 = null;
                }
                if ((i2 & 64) != 0) {
                    i17 = i15 & (-3670017);
                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                } else {
                    i17 = i15;
                }
                if (i12 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f;
                }
                f = f3;
                j73Var4 = j73Var2;
                i15 = i17;
            } else {
                if (i18 != 0) {
                    j73Var2 = g73Var;
                }
                if (i4 != 0) {
                    bz1Var5 = null;
                }
                if (i6 != 0) {
                    bz1Var6 = null;
                }
                if (i8 != 0) {
                    bz1Var7 = null;
                }
                if (i10 != 0) {
                    bz1Var8 = null;
                }
                if ((i2 & 64) != 0) {
                    i17 = i15 & (-3670017);
                    aw2VarH = jr2.h((rj0) h02Var.a(tj0.g));
                } else {
                    i17 = i15;
                }
                if (i12 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f;
                }
                f = f3;
                j73Var4 = j73Var2;
                i15 = i17;
            }
            bz1Var13 = bz1Var5;
            bz1Var14 = bz1Var6;
            bz1Var15 = bz1Var7;
            bz1Var16 = bz1Var8;
            aw2Var3 = aw2VarH;
            h02Var.s();
            nm0 nm0VarM11111111111110 = ue5.m0(629852750, new m90(aw2Var3, nm0Var, b), h02Var);
            if (bz1Var14 == null) {
                h02Var.X(-510713870);
                z2 = false;
                h02Var.b(false);
                nm0VarM1 = null;
            } else {
                z2 = false;
                h02Var.X(-510713869);
                nm0VarM1 = ue5.m0(-1291211644, new ew2(aw2Var3, bz1Var14, b), h02Var);
                h02Var.b(false);
            }
            if (bz1Var13 == null) {
                h02Var.X(-510395686);
                h02Var.b(z2);
                nm0VarM2 = null;
            } else {
                h02Var.X(-510395685);
                nm0VarM2 = ue5.m0(372414991, new fw2(aw2Var3, bz1Var13, z2 ? (byte) 1 : (byte) 0), h02Var);
                h02Var.b(z2);
            }
            if (bz1Var15 == null) {
                h02Var.X(-510083888);
                h02Var.b(z2);
                nm0VarM3 = null;
            } else {
                h02Var.X(-510083887);
                nm0VarM3 = ue5.m0(449548451, new ew2(aw2Var3, bz1Var15, z2 ? (byte) 1 : (byte) 0), h02Var);
                h02Var.b(z2);
            }
            if (bz1Var16 == null) {
                h02Var.X(-509666659);
            } else {
                h02Var.X(-509666658);
                nm0VarM0 = ue5.m0(1946411067, new fw2(aw2Var3, bz1Var16, (byte) 1), h02Var);
                z2 = false;
            }
            h02Var.b(z2);
            objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new q21((byte) 25);
                h02Var.i0(objK);
            }
            j73 j73VarN1111114 = dj4.g(g73Var, true, (xy1) objK).n(j73Var4);
            cn4 cn4VarY1111114 = vn4.y(k33.x, h02Var);
            long j1111111111117 = aw2Var3.g;
            long j1111111111118 = aw2Var3.y;
            nm0 nm0VarM11111111111111 = ue5.m0(1192488737, new dw2(nm0VarM3, nm0VarM0, nm0VarM11111111111110, nm0VarM2, nm0VarM1), h02Var);
            int i21111113 = i15 >> 9;
            f2 = f;
            uz4.g(j73VarN1111114, cn4VarY1111114, j1111111111117, j1111111111118, f2, 0.0f, null, nm0VarM11111111111111, h02Var, (57344 & i21111113) | 12582912 | (i21111113 & 458752), 64);
            j73Var3 = j73Var4;
            bz1Var10 = bz1Var14;
            aw2Var2 = aw2Var3;
            bz1Var9 = bz1Var13;
            bz1Var11 = bz1Var15;
            bz1Var12 = bz1Var16;
        } else {
            h02Var.Q();
            j73Var3 = j73Var2;
            bz1Var9 = bz1Var5;
            bz1Var10 = bz1Var6;
            bz1Var11 = bz1Var7;
            bz1Var12 = bz1Var8;
            aw2Var2 = aw2VarH;
            f2 = f;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: bw2
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lr2.r(nm0Var, j73Var3, bz1Var9, bz1Var10, bz1Var11, bz1Var12, aw2Var2, f2, (h02) obj, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }

    public static final float s(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00de  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0111  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void t(final p04 p04Var, final String str, final xn5 xn5Var, final String str2, Integer num, xy1 xy1Var, h02 h02Var, final int i, final int i2) {
        final Integer num2;
        int i3;
        xy1 xy1Var2;
        int i4;
        int i5;
        boolean z;
        final xy1 xy1Var3;
        u34 u34VarP;
        Integer num3;
        boolean z2;
        xy1 xy1Var4;
        int i6;
        Intent intent;
        boolean z3;
        Object objK;
        p04Var.getClass();
        str2.getClass();
        h02Var.Z(1363302282);
        int i7 = (h02Var.j(p04Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i7 |= h02Var.x(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i7 |= h02Var.n(xn5Var == null ? -1 : xn5Var.ordinal()) ? 256 : 128;
        }
        int i8 = i7 | (h02Var.x(str2) ? 2048 : 1024);
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                num2 = num;
                i8 |= h02Var.x(num2) ? 16384 : 8192;
            }
            i3 = i2 & 32;
            if (i3 != 0) {
                i5 = i8 | 196608;
                xy1Var2 = xy1Var;
            } else {
                xy1Var2 = xy1Var;
                if (h02Var.j(xy1Var2)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i5 = i8 | i4;
            }
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (h02Var.N(i5 & 1, z)) {
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i3 != 0) {
                    objK = h02Var.K();
                    if (objK == oo0.g) {
                        objK = new qc5((byte) 20);
                        h02Var.i0(objK);
                    }
                    xy1Var4 = (xy1) objK;
                    z2 = true;
                } else {
                    z2 = true;
                    xy1Var4 = xy1Var2;
                }
                Context context = (Context) h02Var.a(ep0.y);
                if (str == null) {
                    i6 = R.drawable.ic_bluetooth_24dp;
                } else if (xn5Var == xn5.j) {
                    i6 = R.drawable.ic_bluetooth_connected_24dp;
                } else if (xn5Var == xn5.t) {
                    i6 = R.drawable.ic_bluetooth_searching_24dp;
                } else {
                    i6 = R.drawable.ic_baseline_bluetooth_disabled_24;
                }
                int i10 = i6;
                intent = new Intent(context, (Class<?>) MainActivity.class);
                intent.setFlags(335544320);
                if (str != null) {
                    intent.putExtra("io.appground.MAC_ADDRESS", str);
                }
                if (vb1.g(yb1.g(((yb1) h02Var.a(ep0.g)).g), 100.0f) >= 0) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                a11.y(gn5.g(h02Var), ue5.m0(-1522704383, new co5(z3, i10, str2, intent, p04Var, xy1Var4, num3, (byte) 0), h02Var), h02Var, 48);
                xy1Var3 = xy1Var4;
                num2 = num3;
            } else {
                h02Var.Q();
                xy1Var3 = xy1Var2;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: do5
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lr2.t(p04Var, str, xn5Var, str2, num2, xy1Var3, (h02) obj, aq2.J(i | 1), i2);
                        return og5.g;
                    }
                };
            }
        }
        i8 |= 24576;
        num2 = num;
        i3 = i2 & 32;
        if (i3 != 0) {
            i5 = i8 | 196608;
            xy1Var2 = xy1Var;
        } else {
            xy1Var2 = xy1Var;
            if (h02Var.j(xy1Var2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i5 = i8 | i4;
        }
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (h02Var.N(i5 & 1, z)) {
            if (i9 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i3 != 0) {
                objK = h02Var.K();
                if (objK == oo0.g) {
                    objK = new qc5((byte) 20);
                    h02Var.i0(objK);
                }
                xy1Var4 = (xy1) objK;
                z2 = true;
            } else {
                z2 = true;
                xy1Var4 = xy1Var2;
            }
            Context context2 = (Context) h02Var.a(ep0.y);
            if (str == null) {
                i6 = R.drawable.ic_bluetooth_24dp;
            } else if (xn5Var == xn5.j) {
                i6 = R.drawable.ic_bluetooth_connected_24dp;
            } else if (xn5Var == xn5.t) {
                i6 = R.drawable.ic_bluetooth_searching_24dp;
            } else {
                i6 = R.drawable.ic_baseline_bluetooth_disabled_24;
            }
            int i11 = i6;
            intent = new Intent(context2, (Class<?>) MainActivity.class);
            intent.setFlags(335544320);
            if (str != null) {
                intent.putExtra("io.appground.MAC_ADDRESS", str);
            }
            if (vb1.g(yb1.g(((yb1) h02Var.a(ep0.g)).g), 100.0f) >= 0) {
                z3 = z2;
            } else {
                z3 = false;
            }
            a11.y(gn5.g(h02Var), ue5.m0(-1522704383, new co5(z3, i11, str2, intent, p04Var, xy1Var4, num3, (byte) 0), h02Var), h02Var, 48);
            xy1Var3 = xy1Var4;
            num2 = num3;
        } else {
            h02Var.Q();
            xy1Var3 = xy1Var2;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: do5
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lr2.t(p04Var, str, xn5Var, str2, num2, xy1Var3, (h02) obj, aq2.J(i | 1), i2);
                    return og5.g;
                }
            };
        }
    }

    public static StaticLayout u(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            nc2.g("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            nc2.g("invalid end value");
        }
        if (i3 < 0) {
            nc2.g("invalid maxLines value");
        }
        if (i < 0) {
            nc2.g("invalid width value");
        }
        if (i4 < 0) {
            nc2.g("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            builderObtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            x70.n(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final void v(String str, h02 h02Var, int i) {
        str.getClass();
        h02Var.Z(1357057255);
        int i2 = (h02Var.x(str) ? 4 : 2) | i;
        byte b = 0;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) h02Var.a(ep0.y);
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.setFlags(335544320);
            intent.putExtra("io.appground.blek.SHOW_UPGRADE", true);
            a11.y(gn5.g(h02Var), ue5.m0(-328903970, new ao5(str, context, intent, b), h02Var), h02Var, 48);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new wo(str, i, (byte) 13);
        }
    }

    public static final void w(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final void x(final String str, final o04 o04Var, final my1 my1Var, final boolean z, final o22 o22Var, h02 h02Var, final int i) {
        int i2;
        boolean z2;
        String strValueOf;
        h02Var.Z(1709939506);
        if ((i & 6) == 0) {
            i2 = (h02Var.x(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.j(o04Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(my1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= h02Var.l(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= h02Var.x(o22Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if (h02Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            String strN = xq2.n(o04Var);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new rp3(0L);
                h02Var.i0(objK);
            }
            rp3 rp3Var = (rp3) objK;
            boolean z3 = (i3 & 896) == 256;
            Object objK2 = h02Var.K();
            if (z3 || objK2 == l76Var) {
                objK2 = new rg((Object) rp3Var, (Object) my1Var, (byte) 26);
                h02Var.i0(objK2);
            }
            my1 my1Var2 = (my1) objK2;
            h02Var.Y(-242680581);
            if (str == null || str.length() == 0) {
                h02Var.Y(-1287793883);
                strValueOf = String.valueOf(pw5.s(h02Var));
                h02Var.b(false);
            } else {
                h02Var.Y(-1287796002);
                h02Var.b(false);
                strValueOf = str;
            }
            lk2 lk2Var = new lk2(strValueOf, my1Var2);
            h02Var.b(false);
            c33 c33Var = (c33) cj0.m0(o04Var.w, c33.B);
            ue5.n(o22Var, null, ue5.m0(-1730812016, new zq1(o04Var, c33Var != null ? c33Var.j : 0, strN, lk2Var, z2), h02Var), h02Var, ((i3 >> 12) & 14) | 384, 2);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: bo5
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lr2.x(str, o04Var, my1Var, z, o22Var, (h02) obj, aq2.J(i | 1));
                    return og5.g;
                }
            };
        }
    }

    public static final void y(Object obj, int i, mr2 mr2Var, nm0 nm0Var, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(872548579);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.j(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.n(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var.j(mr2Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= h02Var.j(nm0Var) ? 2048 : 1024;
        }
        if (h02Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zX = h02Var.x(obj) | h02Var.x(mr2Var);
            Object objK = h02Var.K();
            Object obj2 = oo0.g;
            if (zX || objK == obj2) {
                objK = new kr2(obj, mr2Var);
                h02Var.i0(objK);
            }
            kr2 kr2Var = (kr2) objK;
            kr2Var.r = i;
            tp3 tp3Var = kr2Var.l;
            j14 j14Var = ss3.g;
            kr2 kr2Var2 = (kr2) h02Var.a(j14Var);
            at4 at4VarM = js2.m();
            xy1 xy1VarV = at4VarM != null ? at4VarM.v() : null;
            at4 at4VarB = js2.b(at4VarM);
            try {
                if (kr2Var2 != ((kr2) tp3Var.getValue())) {
                    tp3Var.setValue(kr2Var2);
                    if (kr2Var.n > 0) {
                        kr2 kr2Var3 = kr2Var.v;
                        if (kr2Var3 != null) {
                            kr2Var3.y();
                        }
                        if (kr2Var2 != null) {
                            kr2Var2.g();
                        } else {
                            kr2Var2 = null;
                        }
                        kr2Var.v = kr2Var2;
                    }
                }
                js2.z(at4VarM, at4VarB, xy1VarV);
                boolean zX2 = h02Var.x(kr2Var);
                Object objK2 = h02Var.K();
                if (zX2 || objK2 == obj2) {
                    objK2 = new z6(kr2Var, (byte) 20);
                    h02Var.i0(objK2);
                }
                k33.j(kr2Var, (xy1) objK2, h02Var);
                og0.y(j14Var.g(kr2Var), nm0Var, h02Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                js2.z(at4VarM, at4VarB, xy1VarV);
                throw th;
            }
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ne1(obj, i, mr2Var, nm0Var, i2, (byte) 1);
        }
    }

    public static final float z(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public abstract void B(int i);

    public abstract void C(Typeface typeface, boolean z);

    public long J() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
