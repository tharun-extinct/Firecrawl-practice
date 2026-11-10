package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import io.appground.blehid.BleHidService;
import io.appground.blehid.ClassicHidService;
import io.appground.blek.widget.ConnectDeviceActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class xq2 {
    public static final void A(hb3 hb3Var, Object obj) {
        boolean zL;
        long[] jArr = hb3Var.g;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = hb3Var.y[i4];
                        Object obj3 = hb3Var.r[i4];
                        if (obj3 instanceof ib3) {
                            ib3 ib3Var = (ib3) obj3;
                            ib3Var.q(obj);
                            zL = ib3Var.l();
                        } else {
                            zL = obj3 == obj;
                        }
                        if (zL) {
                            hb3Var.w(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static int B(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    public static final float C(long j, float f, j51 j51Var) {
        float fR;
        long jY = n85.y(j);
        if (o85.g(jY, 4294967296L)) {
            if (j51Var.w() <= 1.05d) {
                return j51Var.j0(j);
            }
            fR = n85.r(j) / n85.r(j51Var.s0(f));
        } else {
            if (!o85.g(jY, 8589934592L)) {
                return Float.NaN;
            }
            fR = n85.r(j);
        }
        return fR * f;
    }

    public static final void D(o04 o04Var, Context context, yi2 yi2Var, l62 l62Var, String str) {
        boolean z;
        boolean z2;
        o04Var.getClass();
        context.getClass();
        yi2Var.getClass();
        l62Var.getClass();
        Bundle bundleV = ua6.v(y70.y(yi2Var, o04Var));
        g61 g61Var = (g61) pw5.j((ew4) l62Var.x.j).j.getValue();
        boolean z3 = false;
        try {
            if (str != null) {
                if (!yf2.p(g61Var != null ? g61Var.t : null, str)) {
                    SharedPreferences sharedPreferences = d52.b;
                    if (sharedPreferences != null) {
                        z2 = sharedPreferences.getBoolean("forceBleMode_" + Build.VERSION.SDK_INT, false);
                    } else {
                        z2 = false;
                    }
                    l62Var.n(z2);
                    l62Var.l.g(str);
                }
            } else if (g61Var == null) {
                SharedPreferences sharedPreferences2 = d52.b;
                if (sharedPreferences2 != null) {
                    z = sharedPreferences2.getBoolean("forceBleMode_" + Build.VERSION.SDK_INT, false);
                } else {
                    z = false;
                }
                l62Var.n(z);
            }
        } catch (Throwable unused) {
        }
        SharedPreferences sharedPreferences3 = d52.b;
        if (sharedPreferences3 != null) {
            z3 = sharedPreferences3.getBoolean("forceBleMode_" + Build.VERSION.SDK_INT, false);
        }
        Context context2 = l62Var.g;
        Intent intent = new Intent(context2, (Class<?>) ((l62Var.v(z3) || Build.VERSION.SDK_INT < 28) ? BleHidService.class : ClassicHidService.class));
        intent.setAction("io.appground.action.COMMAND");
        intent.putExtras(bundleV);
        context2.startService(intent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public static final void E(o04 o04Var, Context context, yi2 yi2Var, l62 l62Var, String str, String str2) throws Exception {
        String str3;
        context.getClass();
        yi2Var.getClass();
        l62Var.getClass();
        rv rvVar = l62Var.x;
        Collection collection = (List) cj0.s0(((co4) rvVar.t).g());
        if (collection == null) {
            collection = pi1.j;
        }
        g61 g61Var = (g61) pw5.j((ew4) rvVar.j).j.getValue();
        boolean z = true;
        if (str != null) {
            if (collection.isEmpty()) {
                if (g61Var != null) {
                    str3 = g61Var.t;
                } else {
                    str3 = null;
                }
                if (yf2.p(str3, str) || !g61Var.l()) {
                    z = false;
                }
            } else {
                Iterator it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        g61 g61Var2 = (g61) it.next();
                        if (!yf2.p(g61Var2.t, str) || !g61Var2.l()) {
                        }
                    } else {
                        if (g61Var != null) {
                            str3 = g61Var.t;
                        } else {
                            str3 = null;
                        }
                        if (yf2.p(str3, str)) {
                            z = false;
                        } else {
                            z = false;
                        }
                    }
                }
            }
        } else if (g61Var == null || !g61Var.l()) {
            z = false;
        }
        if (str == null || z) {
            try {
                D(o04Var, context, yi2Var, l62Var, str);
                return;
            } catch (Exception e) {
                if (str == null) {
                    throw e;
                }
            }
        }
        Intent intent = new Intent(context, (Class<?>) ConnectDeviceActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("io.appground.MAC_ADDRESS", str);
        intent.putExtra("io.appground.blek.DEVICE_NAME", str2);
        intent.putExtra("action", ex.y(ex.v, np3.t(o04Var)));
        context.startActivity(intent);
    }

    public static final void F(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(ra.U(j)), i, i2, 33);
        }
    }

    public static final void G(Spannable spannable, long j, j51 j51Var, int i, int i2) {
        long jY = n85.y(j);
        if (o85.g(jY, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(k33.Z(j51Var.j0(j)), false), i, i2, 33);
        } else if (o85.g(jY, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(n85.r(j)), i, i2, 33);
        }
    }

    public static final void H(em3 em3Var, int i, Object obj) {
        em3Var.x[(em3Var.l - em3Var.y[em3Var.r - 1].y) + i] = obj;
    }

    public static final void I(em3 em3Var, int i, Object obj, int i2, Object obj2) {
        int i3 = em3Var.l - em3Var.y[em3Var.r - 1].y;
        Object[] objArr = em3Var.x;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final o22 J(o22 o22Var, float f) {
        return o22Var.n(new go5(new s91(f))).n(new k52(new s91(f)));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[PHI: r16
  0x0072: PHI (r16v3 long) = (r16v2 long), (r16v5 long) binds: [B:30:0x0065, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x007e A[LOOP:0: B:25:0x0054->B:39:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0092 A[EDGE_INSN: B:58:0x0092->B:43:0x0092 BREAK  A[LOOP:0: B:25:0x0054->B:39:0x007e], SYNTHETIC] */
    public static final long K(String str, long j, long j2, long j3) {
        String property;
        boolean z;
        long j4;
        int i;
        long j5;
        int i2 = f15.g;
        Long lValueOf = null;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        int i3 = 10;
        a11.x(10);
        int length = property.length();
        if (length != 0) {
            int i4 = 0;
            char cCharAt = property.charAt(0);
            long j6 = -9223372036854775807L;
            if (cCharAt < '0') {
                z = true;
                if (length != 1) {
                    if (cCharAt == '+') {
                        z = false;
                        i4 = 1;
                    } else if (cCharAt == '-') {
                        j6 = Long.MIN_VALUE;
                        i4 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j7 = 0;
            long j8 = -256204778801521550L;
            while (true) {
                if (i4 >= length) {
                    if (!z) {
                        lValueOf = Long.valueOf(-j7);
                        break;
                    }
                    lValueOf = Long.valueOf(j7);
                    break;
                }
                int iDigit = Character.digit((int) property.charAt(i4), i3);
                if (iDigit < 0) {
                    break;
                }
                if (j7 < j8) {
                    if (j8 != -256204778801521550L) {
                        break;
                    }
                    j8 = j6 / 10;
                    if (j7 < j8) {
                        break;
                    }
                    j4 = j7 * 10;
                    i = length;
                    j5 = iDigit;
                    if (j4 < j6 + j5) {
                        break;
                        break;
                    }
                    j7 = j4 - j5;
                    i4++;
                    length = i;
                    i3 = 10;
                } else {
                    j4 = j7 * 10;
                    i = length;
                    j5 = iDigit;
                    if (j4 < j6 + j5) {
                        break;
                    }
                    j7 = j4 - j5;
                    i4++;
                    length = i;
                    i3 = 10;
                }
            }
        }
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int L(int i, int i2, String str) {
        return (int) K(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object M(ou0 ou0Var) throws ha1 {
        Object obj;
        fx0 fx0VarV = ou0Var.v();
        v70.s(fx0VarV);
        mu0 mu0VarO = pw5.o(ou0Var);
        ia1 ia1Var = mu0VarO instanceof ia1 ? (ia1) mu0VarO : null;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        if (ia1Var == null) {
            obj = og5Var;
        } else {
            hx0 hx0Var = ia1Var.m;
            if (pw5.M(hx0Var, fx0VarV)) {
                ia1Var.w = og5Var;
                ia1Var.a = 1;
                hx0Var.P(fx0VarV, ia1Var);
            } else {
                fx0 fx0VarB = fx0VarV.b(new ms5(ms5.t));
                ia1Var.w = og5Var;
                ia1Var.a = 1;
                hx0Var.P(fx0VarB, ia1Var);
            }
            obj = px0Var;
        }
        return obj == px0Var ? obj : og5Var;
    }

    public static hb3 a() {
        long[] jArr = ee4.g;
        return new hb3();
    }

    public static ColorStateList b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!p(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = xj0.g;
        try {
            return xj0.g(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static final String c(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object d(Object[] objArr, md4 md4Var, my1 my1Var, h02 h02Var, int i) {
        return k(Arrays.copyOf(objArr, objArr.length), md4Var, my1Var, h02Var, ((i << 3) & 7168) | 384);
    }

    public static final boolean e(hb3 hb3Var, Object obj, Object obj2) {
        Object objL = hb3Var.l(obj);
        if (objL == null) {
            return false;
        }
        if (!(objL instanceof ib3)) {
            if (!objL.equals(obj2)) {
                return false;
            }
            hb3Var.q(obj);
            return true;
        }
        ib3 ib3Var = (ib3) objL;
        boolean zQ = ib3Var.q(obj2);
        if (zQ && ib3Var.l()) {
            hb3Var.q(obj);
        }
        return zQ;
    }

    public static final Object f(Object[] objArr, my1 my1Var, h02 h02Var) {
        return k(Arrays.copyOf(objArr, objArr.length), c93.o, my1Var, h02Var, 3456);
    }

    public static final void g(nm0 nm0Var, h02 h02Var, int i) {
        h02 h02Var2;
        h02Var.Z(-1672032565);
        if (h02Var.N(i & 1, (i & 3) != 2)) {
            h02Var2 = h02Var;
            o33.g(null, false, false, false, true, ue5.m0(476817946, new ws2(nm0Var, (byte) 3), h02Var), h02Var2, 1794048);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new ws2(nm0Var, i, (byte) 4);
        }
    }

    public static int h(float f, int i, int i2) {
        return zj0.y(zj0.n(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int i(Context context, int i, int i2) {
        TypedValue typedValueU = mq2.u(context.getTheme(), i);
        Integer numValueOf = typedValueU != null ? Integer.valueOf(B(context, typedValueU)) : null;
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static void j(ed3 ed3Var, String str, List list, List list2, xy1 xy1Var, xy1 xy1Var2, nm0 nm0Var, int i) {
        int i2 = i & 2;
        pi1 pi1Var = pi1.j;
        if (i2 != 0) {
            list = pi1Var;
        }
        if ((i & 4) != 0) {
            list2 = pi1Var;
        }
        if ((i & 8) != 0) {
            xy1Var = null;
        }
        if ((i & 16) != 0) {
            xy1Var2 = null;
        }
        tf3 tf3Var = ed3Var.x;
        tf3Var.getClass();
        vn0 vn0Var = new vn0((un0) tf3Var.y(xs2.o(un0.class)), str, nm0Var);
        for (fc3 fc3Var : list) {
            vn0Var.r.put(fc3Var.g, fc3Var.y);
        }
        for (yc3 yc3Var : list2) {
            yc3Var.getClass();
            vn0Var.n.add(yc3Var);
        }
        vn0Var.j = xy1Var;
        vn0Var.t = xy1Var2;
        vn0Var.a = xy1Var;
        vn0Var.m = xy1Var2;
        ed3Var.j.add(vn0Var.g());
    }

    public static final Object k(Object[] objArr, md4 md4Var, my1 my1Var, h02 h02Var, int i) {
        Object[] objArr2;
        md4 md4Var2;
        final Object obj;
        Object objX;
        long j = h02Var.T;
        a11.x(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        md4Var.getClass();
        final uc4 uc4Var = (uc4) h02Var.a(wc4.g);
        Object objK = h02Var.K();
        Object obj2 = oo0.g;
        if (objK == obj2) {
            Object objR = (uc4Var == null || (objX = uc4Var.x(string)) == null) ? null : md4Var.r(objX);
            if (objR == null) {
                objR = my1Var.g();
            }
            objArr2 = objArr;
            md4Var2 = md4Var;
            Object pc4Var = new pc4(md4Var2, uc4Var, string, objR, objArr2);
            h02Var.i0(pc4Var);
            objK = pc4Var;
        } else {
            objArr2 = objArr;
            md4Var2 = md4Var;
        }
        final pc4 pc4Var2 = (pc4) objK;
        Object objG = Arrays.equals(objArr2, pc4Var2.q) ? pc4Var2.m : null;
        if (objG == null) {
            objG = my1Var.g();
        }
        boolean zJ = h02Var.j(pc4Var2) | ((((i & 112) ^ 48) > 32 && h02Var.j(md4Var2)) || (i & 48) == 32) | h02Var.j(uc4Var) | h02Var.x(string) | h02Var.j(objG) | h02Var.j(objArr2);
        Object objK2 = h02Var.K();
        if (zJ || objK2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objG;
            final md4 md4Var3 = md4Var2;
            Object obj3 = new my1() { // from class: k64
                @Override // defpackage.my1
                public final Object g() {
                    boolean z;
                    pc4 pc4Var3 = pc4Var2;
                    uc4 uc4Var2 = pc4Var3.t;
                    uc4 uc4Var3 = uc4Var;
                    boolean z2 = true;
                    if (uc4Var2 != uc4Var3) {
                        pc4Var3.t = uc4Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = pc4Var3.a;
                    String str2 = string;
                    if (yf2.p(str, str2)) {
                        z2 = z;
                    } else {
                        pc4Var3.a = str2;
                    }
                    pc4Var3.j = md4Var3;
                    pc4Var3.m = obj;
                    pc4Var3.q = objArr3;
                    tc4 tc4Var = pc4Var3.w;
                    if (tc4Var != null && z2) {
                        ((ro) tc4Var).f0();
                        pc4Var3.w = null;
                        pc4Var3.y();
                    }
                    return og5.g;
                }
            };
            h02Var.i0(obj3);
            objK2 = obj3;
        } else {
            obj = objG;
        }
        k33.z((my1) objK2, h02Var);
        return obj;
    }

    public static final void l(int i) {
        if (i >= 1) {
            return;
        }
        l0.t(xi3.j("Expected positive parallelism level, but got ", i));
    }

    public static final boolean m(long j, long j2) {
        return j == j2;
    }

    public static final String n(o04 o04Var) {
        o04Var.getClass();
        String str = o04Var.m;
        if (str == null) {
            return "???";
        }
        if (tx4.Y(str)) {
            n04[] n04VarArr = o04Var.t;
            n04VarArr.getClass();
            n04 n04Var = (n04) pr.X(n04VarArr);
            str = n04Var != null ? n04Var.m : null;
        }
        return str == null ? "???" : str;
    }

    public static TypedArray o(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final o22 q(o22 o22Var) {
        u91 u91Var = u91.g;
        return o22Var.n(new go5(u91Var)).n(new k52(u91Var));
    }

    public static final void r(yq2 yq2Var, Object obj, int i, Object obj2, h02 h02Var, int i2) {
        h02Var.Z(1439843069);
        int i3 = (h02Var.x(yq2Var) ? 4 : 2) | i2 | (h02Var.x(obj) ? 32 : 16) | (h02Var.n(i) ? 256 : 128) | (h02Var.x(obj2) ? 2048 : 1024);
        if (h02Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ((qc4) obj).y(obj2, ue5.m0(980966366, new tk(i, yq2Var, obj2), h02Var), h02Var, 48);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new hg(yq2Var, obj, i, obj2, i2);
        }
    }

    public static bm s(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        bm bmVarR;
        if (p(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new bm(null, null, typedValue.data);
            }
            try {
                bmVarR = bm.r(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                bmVarR = null;
            }
            if (bmVarR != null) {
                return bmVarR;
            }
        }
        return new bm(null, null, 0);
    }

    public static int t(int i, int i2) {
        return zj0.n(i, (Color.alpha(i) * i2) / 255);
    }

    public static boolean u(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = zj0.g;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            l0.u("outXyz must have a length of 3.");
            return false;
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    public static final void v(hb3 hb3Var, Object obj, Object obj2) {
        int iX = hb3Var.x(obj);
        boolean z = iX < 0;
        Object obj3 = z ? null : hb3Var.r[iX];
        if (obj3 != null) {
            if (obj3 instanceof ib3) {
                ((ib3) obj3).g(obj2);
            } else if (obj3 != obj2) {
                ib3 ib3Var = new ib3();
                ib3Var.g(obj3);
                ib3Var.g(obj2);
                obj2 = ib3Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            hb3Var.r[iX] = obj2;
            return;
        }
        int i = ~iX;
        hb3Var.y[i] = obj;
        hb3Var.r[i] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d A[EDGE_INSN: B:44:0x008d->B:40:0x008d BREAK  A[LOOP:0: B:10:0x0011->B:48:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x006e A[SYNTHETIC] */
    public static final List w(jy3 jy3Var, int i, int i2) {
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        fp3 fp3Var;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        if (i == i2) {
            return pi1.j;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z2) {
                if (i <= i2) {
                    return arrayList;
                }
                linkedHashMap = (LinkedHashMap) jy3Var.j;
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        fp3Var = null;
                    } else {
                        fp3Var = new fp3(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        fp3Var = null;
                    } else {
                        fp3Var = new fp3(treeMap, treeMap.keySet());
                    }
                }
                if (fp3Var == null) {
                    Map map = (Map) fp3Var.j;
                    it = ((Iterable) fp3Var.t).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i2 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i >= i2) {
                    return arrayList;
                }
                linkedHashMap = (LinkedHashMap) jy3Var.j;
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        fp3Var = null;
                    } else {
                        fp3Var = new fp3(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        fp3Var = null;
                    } else {
                        fp3Var = new fp3(treeMap, treeMap.keySet());
                    }
                }
                if (fp3Var == null) {
                    Map map2 = (Map) fp3Var.j;
                    it = ((Iterable) fp3Var.t).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i2 <= iIntValue && iIntValue < i) {
                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                obj.getClass();
                                arrayList.add(obj);
                                z = true;
                                i = iIntValue;
                                break;
                                break;
                            }
                        } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                            obj2.getClass();
                            arrayList.add(obj2);
                            z = true;
                            i = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object x(ez3 ez3Var, my1 my1Var, ou0 ou0Var) {
        bz3 bz3Var;
        if (ou0Var instanceof bz3) {
            bz3Var = (bz3) ou0Var;
            int i = bz3Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                bz3Var.w = i - Integer.MIN_VALUE;
            } else {
                bz3Var = new bz3(ou0Var);
            }
        } else {
            bz3Var = new bz3(ou0Var);
        }
        Object obj = bz3Var.q;
        int i2 = bz3Var.w;
        try {
            if (i2 == 0) {
                js2.o(obj);
                fx0 fx0Var = bz3Var.t;
                fx0Var.getClass();
                if (fx0Var.h(d52.m) != ez3Var) {
                    l0.z("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                bz3Var.m = my1Var;
                bz3Var.w = 1;
                ib0 ib0Var = new ib0(1, pw5.o(bz3Var));
                ib0Var.o();
                ez3Var.u0(new x60(ib0Var, (byte) 3));
                Object objZ = ib0Var.z();
                px0 px0Var = px0.j;
                if (objZ == px0Var) {
                    return px0Var;
                }
            } else {
                if (i2 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                my1Var = bz3Var.m;
                js2.o(obj);
            }
            my1Var.g();
            return og5.g;
        } catch (Throwable th) {
            my1Var.g();
            throw th;
        }
    }

    public static final void y(o22 o22Var, int i, final nm0 nm0Var, h02 h02Var, final int i2, final int i3) {
        int i4;
        int i5;
        h02Var.Z(-1208072102);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (h02Var.x(o22Var) ? 4 : 2) | i2;
        }
        int i7 = i4 | 48;
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 = i4 | 432;
        } else {
            i5 = (h02Var.n(i) ? 256 : 128) | i7;
        }
        if ((i5 & 1171) == 1170 && h02Var.e()) {
            h02Var.Q();
        } else {
            if (i6 != 0) {
                o22Var = m22.g;
            }
            if (i8 != 0) {
                i = 0;
            }
            h02Var.Y(1849434622);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = ib4.i;
                h02Var.i0(objK);
            }
            h02Var.b(false);
            my1 my1Var = (my1) ((nz1) objK);
            h02Var.Y(-683746039);
            h02Var.Y(-548224868);
            if (!(h02Var.g instanceof lq)) {
                pw5.f();
                throw null;
            }
            h02Var.V();
            if (h02Var.S) {
                h02Var.m(my1Var);
            } else {
                h02Var.l0();
            }
            xs2.E(new on0((byte) 26), h02Var, o22Var);
            xs2.E(new on0((byte) 27), h02Var, new s6(i));
            xs2.E(new on0((byte) 28), h02Var, new q6(0));
            nm0Var.x(mb4.g, h02Var, 54);
            h02Var.b(true);
            h02Var.b(false);
            h02Var.b(false);
        }
        final o22 o22Var2 = o22Var;
        final int i9 = i;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1(i9, nm0Var, i2, i3) { // from class: hb4
                public final /* synthetic */ nm0 a;
                public final /* synthetic */ byte m;
                public final /* synthetic */ boolean t;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.m = i3;
                }

                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(3073);
                    o22 o22Var3 = this.j;
                    boolean z = this.t;
                    nm0 nm0Var2 = this.a;
                    byte b = this.m;
                    xq2.y(o22Var3, z ? 1 : 0, nm0Var2, (h02) obj, iJ, b);
                    return og5.g;
                }
            };
        }
    }

    public static final boolean z(q01 q01Var, int i, int i2) {
        q01Var.getClass();
        if (i > i2 && q01Var.q) {
            return false;
        }
        Set set = q01Var.w;
        return q01Var.m && (set == null || !set.contains(Integer.valueOf(i)));
    }
}
