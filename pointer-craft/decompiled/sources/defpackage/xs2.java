package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.Window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xs2 {
    public static ha2 g;
    public static ha2 y;

    public static final void A(h02 h02Var, Integer num) {
        on0 on0Var = tg1.c;
        if (h02Var.S) {
            h02Var.y(on0Var, num);
        }
    }

    public static final boolean B(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static float C(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final void D(h02 h02Var) {
        h02Var.y(new od4((byte) 24), og5.g);
    }

    public static final void E(bz1 bz1Var, h02 h02Var, Object obj) {
        if (h02Var.S || !yf2.p(h02Var.K(), obj)) {
            h02Var.i0(obj);
            h02Var.y(bz1Var, obj);
        }
    }

    public static void F(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            t70.r(window, z);
        } else if (i >= 30) {
            g2.n(window, z);
        } else {
            lb6.r(window, z);
        }
    }

    public static ke2 G(me2 me2Var, int i) {
        me2Var.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            up.m("Step must be positive, was: ", numValueOf, 46);
            return null;
        }
        int i2 = me2Var.j;
        int i3 = me2Var.t;
        if (me2Var.a <= 0) {
            i = -i;
        }
        return new ke2(i2, i3, i);
    }

    public static final String[] H(int i, h02 h02Var) {
        return ((Resources) h02Var.a(sa.r)).getStringArray(i);
    }

    public static final String I(int i, h02 h02Var) {
        return ((Resources) h02Var.a(sa.r)).getString(i);
    }

    public static final String J(int i, Object[] objArr, h02 h02Var) {
        return ((Resources) h02Var.a(sa.r)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static me2 K(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new me2(i, i2 - 1, 1);
        }
        me2 me2Var = me2.m;
        return me2.m;
    }

    public static void L(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                l0.q(xi3.j("at index ", i2));
                return;
            }
        }
    }

    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        l0.z(str);
    }

    public static final int b(int i, List list) {
        int i2;
        byte b;
        int i3 = ((hp3) cj0.r0(list)).r;
        if (i > ((hp3) cj0.r0(list)).r) {
            nc2.g("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            hp3 hp3Var = (hp3) list.get(i2);
            if (hp3Var.y > i) {
                b = 1;
            } else {
                b = hp3Var.r <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String strG = tw2.g(list, null, new m92((byte) 15), 31);
        StringBuilder sbS = du4.s(i2, size2, "Found paragraph index ", " should be in range [0, ", ").\nDebug info: index=");
        sbS.append(i);
        sbS.append(", paragraphs=[");
        sbS.append(strG);
        sbS.append("]");
        nc2.g(sbS.toString());
        return i2;
    }

    public static long c(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static final tl5 d(wl5 wl5Var) {
        return wl5Var instanceof a52 ? ((a52) wl5Var).x() : e41.g;
    }

    public static final cj e(int i, Object[] objArr, h02 h02Var) {
        ju4 ju4Var;
        Spanned spannedFromHtml = Html.fromHtml(J(i, Arrays.copyOf(objArr, objArr.length), h02Var));
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(spannedFromHtml.toString());
        Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), Object.class);
        spans.getClass();
        for (Object obj : spans) {
            ju4 ju4Var2 = null;
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    ju4Var2 = new ju4(0L, 0L, qv1.f, (lv1) null, (mv1) null, (lu1) null, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65531);
                } else if (style == 2) {
                    ju4Var2 = new ju4(0L, 0L, (qv1) null, new lv1(1), (mv1) null, (lu1) null, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65527);
                } else if (style == 3) {
                    ju4Var2 = new ju4(0L, 0L, qv1.f, new lv1(1), (mv1) null, (lu1) null, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65523);
                }
            } else {
                if (obj instanceof UnderlineSpan) {
                    ju4Var = new ju4(0L, 0L, (qv1) null, (lv1) null, (mv1) null, (lu1) null, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, l45.r, (ym4) null, 61439);
                } else if (obj instanceof ForegroundColorSpan) {
                    ju4Var = new ju4(ra.n(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (qv1) null, (lv1) null, (mv1) null, (lu1) null, (String) null, 0L, (ry) null, (n65) null, (tx2) null, 0L, (l45) null, (ym4) null, 65534);
                }
                ju4Var2 = ju4Var;
            }
            if (ju4Var2 != null) {
                arrayList.add(new zi(ju4Var2, spannedFromHtml.getSpanStart(obj), spannedFromHtml.getSpanEnd(obj), 8));
            }
        }
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((zi) arrayList.get(i2)).y(sb.length()));
        }
        return new cj(string, arrayList2);
    }

    public static final ArrayList f(String str, Bundle bundle) {
        Class cls = v54.g(Bundle.class).g;
        cls.getClass();
        ArrayList arrayListR = Build.VERSION.SDK_INT >= 34 ? x70.r(bundle, str, cls) : bundle.getParcelableArrayList(str);
        if (arrayListR != null) {
            return arrayListR;
        }
        gf6.n(str);
        throw null;
    }

    public static final void g(nm0 nm0Var, h02 h02Var, int i) {
        h02Var.Z(-709502251);
        byte b = 0;
        if (h02Var.N(i & 1, (i & 3) != 2)) {
            vf1 vf1Var = wc4.g;
            uc4 uc4Var = (uc4) h02Var.a(vf1Var);
            sc4 sc4VarU = js2.u(h02Var);
            Object[] objArr = {uc4Var};
            ji jiVar = new ji((Object) new on0((byte) 22), (Object) new xf(uc4Var, sc4VarU, (byte) 10), (byte) 29);
            boolean zJ = h02Var.j(uc4Var) | h02Var.j(sc4VarU);
            Object objK = h02Var.K();
            byte b2 = 14;
            if (zJ || objK == oo0.g) {
                objK = new rg(uc4Var, sc4VarU, b2);
                h02Var.i0(objK);
            }
            vs2 vs2Var = (vs2) xq2.d(objArr, jiVar, (my1) objK, h02Var, 0);
            og0.y(vf1Var.g(vs2Var), ue5.m0(-412824043, new vn(nm0Var, vs2Var, b2), h02Var), h02Var, 56);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new ws2(nm0Var, i, b);
        }
    }

    public static final int h(String str, Bundle bundle) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        gf6.n(str);
        throw null;
    }

    public static Comparable i(Float f, ki0 ki0Var) {
        ki0Var.getClass();
        float f2 = ki0Var.y;
        float f3 = ki0Var.g;
        if (f3 > f2) {
            up.m("Cannot coerce value to an empty range: ", ki0Var, 46);
            return null;
        }
        if (!ki0.g(f, Float.valueOf(f3)) || ki0.g(Float.valueOf(f3), f)) {
            return (!ki0.g(Float.valueOf(f2), f) || ki0.g(f, Float.valueOf(f2))) ? f : Float.valueOf(f2);
        }
        return Float.valueOf(f3);
    }

    public static void j(int i) {
        if (i >= 0) {
            return;
        }
        t94.g();
    }

    public static final zx0 k(wl5 wl5Var) {
        return wl5Var instanceof a52 ? ((a52) wl5Var).l() : xx0.y;
    }

    public static void l(boolean z) {
        if (z) {
            return;
        }
        t94.g();
    }

    public static double m(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float n(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static String o(Class cls) {
        LinkedHashMap linkedHashMap = tf3.y;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            rf3 rf3Var = (rf3) cls.getAnnotation(rf3.class);
            strValue = rf3Var != null ? rf3Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                l0.t("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    public static final int p(ArrayList arrayList, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((hp3) cj0.r0(arrayList)).l) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            hp3 hp3Var = (hp3) arrayList.get(i2);
            if (hp3Var.x > f) {
                b = 1;
            } else {
                b = hp3Var.l <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static float q(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final long r(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = vb5.r;
        return jFloatToRawIntBits;
    }

    public static final int s(int i, List list) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            hp3 hp3Var = (hp3) list.get(i3);
            if (hp3Var.n > i) {
                b = 1;
            } else {
                b = hp3Var.v <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static void t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        l0.q(str);
    }

    public static final void u(ArrayList arrayList, long j, xy1 xy1Var) {
        int size = arrayList.size();
        for (int iB = b(u75.x(j), arrayList); iB < size; iB++) {
            hp3 hp3Var = (hp3) arrayList.get(iB);
            if (hp3Var.y >= u75.v(j)) {
                return;
            }
            if (hp3Var.y != hp3Var.r) {
                xy1Var.a(hp3Var);
            }
        }
    }

    public static int w(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static void x(String str, boolean z) {
        if (z) {
            return;
        }
        l0.u(str);
    }

    public static final void y(j73 j73Var, h02 h02Var, int i, int i2) {
        j73 j73Var2;
        int i3;
        h02Var.Z(-334718031);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            j73Var2 = j73Var;
        } else if ((i & 6) == 0) {
            j73Var2 = j73Var;
            i3 = i | (h02Var.x(j73Var2) ? 4 : 2);
        } else {
            j73Var2 = j73Var;
            i3 = i;
        }
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            j73 j73Var3 = i4 != 0 ? g73.g : j73Var2;
            ma4 ma4Var = na4.g;
            mr3 mr3VarR = v70.r(100);
            j73 j73VarH = y94.h(j73Var3, new ma4(mr3VarR, mr3VarR, mr3VarR, mr3VarR));
            vf1 vf1Var = tj0.g;
            g75.y("PRO", ue5.e0(og0.a(j73VarH, ((rj0) h02Var.a(vf1Var)).p, yf2.b), 4.0f), ((rj0) h02Var.a(vf1Var)).g, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, k85.g(((mf5) h02Var.a(of5.g)).i, 0L, 0L, qv1.f, null, 0L, 0L, null, 16777211), h02Var, 6, 0, 131064);
            j73Var2 = j73Var3;
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new jy1(j73Var2, i, i2);
        }
    }

    public static final w33 z(dr2 dr2Var, int i, long j, jo3 jo3Var, long j2, j00 j00Var, fl2 fl2Var, int i2, ha3 ha3Var) {
        List list;
        Object objY = jo3Var.y(i);
        List list2 = (List) ha3Var.y(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listG = dr2Var.g(i);
            int size = listG.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((p33) listG.get(i3)).v(j));
            }
            ha3Var.t(i, arrayList);
            list = arrayList;
        }
        return new w33(i, i2, list, j2, objY, j00Var, fl2Var);
    }

    public void v() {
    }
}
