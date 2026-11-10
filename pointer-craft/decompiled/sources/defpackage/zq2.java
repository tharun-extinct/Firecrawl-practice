package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.SQLException;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spanned;
import android.util.Log;
import android.util.SizeF;
import android.util.TypedValue;
import android.widget.RemoteViews;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zq2 {
    public static final /* synthetic */ int g = 0;

    public zq2() {
        new ConcurrentHashMap();
    }

    public static final String A(Object[] objArr, int i, int i2, u0 u0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == u0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final void B(String str, int i) {
        throw new SQLException(xi3.j("Error code: ", i).concat(", message: ".concat(str)));
    }

    public static final int C(t6 t6Var) {
        int i = t6Var.g;
        int i2 = 8388611;
        if (i != 0) {
            if (i == 2) {
                i2 = 8388613;
            } else if (i == 1) {
                i2 = 1;
            } else {
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) q6.y(i)));
            }
        }
        int i3 = t6Var.y;
        int i4 = 48;
        if (i3 != 0) {
            if (i3 == 2) {
                i4 = 80;
            } else if (i3 == 1) {
                i4 = 16;
            } else {
                Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) s6.y(i3)));
            }
        }
        return i2 | i4;
    }

    public static String D(long j) {
        return "PointerId(value=" + j + ")";
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0264  */
    public static final void E(RemoteViews remoteViews, ad5 ad5Var, ah1 ah1Var) {
        np2 np2Var;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        z = false;
        if (ah1Var instanceof bh1) {
            bh1 bh1Var = (bh1) ah1Var;
            ArrayList arrayList = bh1Var.y;
            int size = arrayList.size();
            o22 o22Var = bh1Var.r;
            t6 t6Var = bh1Var.n;
            kd2 kd2VarY = ip2.y(remoteViews, ad5Var, np2.a, size, o22Var, new q6(t6Var.g), new s6(t6Var.y));
            m50.e(ad5Var, remoteViews, bh1Var.r, kd2VarY);
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                ah1 ah1Var2 = (ah1) obj;
                ah1Var2.r(ah1Var2.y().n(new c7(bh1Var.n)));
            }
            e(remoteViews, ad5Var, kd2VarY, arrayList);
            return;
        }
        if (ah1Var instanceof fh1) {
            fh1 fh1Var = (fh1) ah1Var;
            np2 np2Var2 = (Build.VERSION.SDK_INT < 31 || !js2.w(fh1Var.r)) ? np2.j : np2.I;
            ArrayList arrayList2 = fh1Var.y;
            kd2 kd2VarY2 = ip2.y(remoteViews, ad5Var, np2Var2, arrayList2.size(), fh1Var.r, null, new s6(fh1Var.v));
            remoteViews.setInt(kd2VarY2.g, "setGravity", C(new t6(fh1Var.n, fh1Var.v)));
            m50.e(ad5.g(ad5Var, 0, null, null, null, 0L, null, 61439), remoteViews, fh1Var.r, kd2VarY2);
            e(remoteViews, ad5Var, kd2VarY2, arrayList2);
            if (!js2.w(fh1Var.r) || arrayList2.isEmpty()) {
                return;
            }
            int size3 = arrayList2.size();
            while (i2 < size3) {
                Object obj2 = arrayList2.get(i2);
                i2++;
            }
            return;
        }
        if (ah1Var instanceof ch1) {
            ch1 ch1Var = (ch1) ah1Var;
            np2 np2Var3 = (Build.VERSION.SDK_INT < 31 || !js2.w(ch1Var.r)) ? np2.t : np2.J;
            ArrayList arrayList3 = ch1Var.y;
            kd2 kd2VarY3 = ip2.y(remoteViews, ad5Var, np2Var3, arrayList3.size(), ch1Var.r, new q6(ch1Var.v), null);
            remoteViews.setInt(kd2VarY3.g, "setGravity", C(new t6(ch1Var.v, ch1Var.n)));
            m50.e(ad5.g(ad5Var, 0, null, null, null, 0L, null, 61439), remoteViews, ch1Var.r, kd2VarY3);
            e(remoteViews, ad5Var, kd2VarY3, arrayList3);
            if (!js2.w(ch1Var.r) || arrayList3.isEmpty()) {
                return;
            }
            int size4 = arrayList3.size();
            while (i3 < size4) {
                Object obj3 = arrayList3.get(i3);
                i3++;
            }
            return;
        }
        if (ah1Var instanceof ih1) {
            xx5.r(remoteViews, ad5Var, (ih1) ah1Var);
            return;
        }
        if (ah1Var instanceof hh1) {
            m50.e(ad5Var, remoteViews, null, ip2.r(remoteViews, ad5Var, np2.b, null));
            return;
        }
        if (!(ah1Var instanceof eh1)) {
            if (!(ah1Var instanceof gh1)) {
                t94.j(ah1Var.getClass().getCanonicalName(), "Unknown element type ");
                return;
            }
            ArrayList arrayList4 = ((gh1) ah1Var).y;
            if (arrayList4.size() <= 1) {
                ah1 ah1Var3 = (ah1) cj0.l0(arrayList4);
                if (ah1Var3 != null) {
                    E(remoteViews, ad5Var, ah1Var3);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList4.size() + ". The normalization of the composition tree failed.").toString());
        }
        eh1 eh1Var = (eh1) ah1Var;
        boolean zE = ra.E(eh1Var);
        byte b = eh1Var.v;
        if (b == 0) {
            np2Var = zE ? np2.D : np2.A;
        } else {
            np2 np2Var4 = np2.B;
            if (b == 1) {
                np2Var = zE ? np2.E : np2Var4;
            } else if (b == 2) {
                np2Var = zE ? np2.F : np2.C;
            } else {
                Log.w("GlanceAppWidget", "Unsupported ContentScale user: " + ((Object) xt0.g(eh1Var.v)));
            }
        }
        kd2 kd2VarR = ip2.r(remoteViews, ad5Var, np2Var, eh1Var.g);
        Context context = ad5Var.g;
        int i4 = kd2VarR.g;
        he heVar = eh1Var.y;
        if (!(heVar instanceof he)) {
            l0.u("An unsupported ImageProvider type was used.");
            return;
        }
        remoteViews.setImageViewResource(i4, heVar.g);
        u95 u95Var = eh1Var.r;
        if (u95Var != null) {
            if (!(u95Var instanceof u95)) {
                l0.u("An unsupported ColorFilter was used.");
                return;
            }
            qj0 qj0Var = u95Var.g;
            if (Build.VERSION.SDK_INT < 31) {
                remoteViews.setInt(i4, "setColorFilter", ra.U(qj0Var.g(context)));
            } else if (qj0Var instanceof w01) {
                w01 w01Var = (w01) qj0Var;
                r64.x(remoteViews, i4, "setColorFilter", ra.U(w01Var.g), ra.U(w01Var.y));
            } else if (qj0Var instanceof o74) {
                r64.n(remoteViews, i4, "setColorFilter", ((o74) qj0Var).g);
            } else {
                remoteViews.setInt(i4, "setColorFilter", ra.U(qj0Var.g(context)));
            }
        }
        Float f = eh1Var.n;
        if (f != null) {
            remoteViews.setInt(i4, "setImageAlpha", xs2.w((int) Math.rint(xs2.q(f.floatValue(), 0.0f, 1.0f) * 255.0f), 0, 255));
        }
        m50.e(ad5Var, remoteViews, eh1Var.g, kd2VarR);
        if (eh1Var.v == 1) {
            go5 go5Var = (go5) eh1Var.g.g(cn0.p, null);
            x91 x91Var = go5Var != null ? go5Var.g : null;
            w91 w91Var = w91.g;
            if (yf2.p(x91Var, w91Var)) {
                z = true;
            } else {
                k52 k52Var = (k52) eh1Var.g.g(cn0.u, null);
                if (yf2.p(k52Var != null ? k52Var.g : null, w91Var)) {
                    z = true;
                }
            }
        }
        remoteViews.setBoolean(i4, "setAdjustViewBounds", z);
    }

    public static final RemoteViews F(Context context, int i, u64 u64Var, al2 al2Var, int i2, ComponentName componentName, y22 y22Var) {
        boolean z = true;
        if (context.getResources().getConfiguration().getLayoutDirection() != 1) {
            z = false;
        }
        ad5 ad5Var = new ad5(context, i, z, al2Var, -1, false, new AtomicInteger(-1), new kd2(0, 0, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName, y22Var);
        ArrayList arrayList = u64Var.y;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (!(((ah1) obj) instanceof gh1)) {
                    ah1 ah1Var = (ah1) cj0.z0(arrayList);
                    t64 t64VarG = ip2.g(ad5Var, ah1Var.y(), i2);
                    RemoteViews remoteViews = t64VarG.g;
                    E(remoteViews, ad5.g(ad5Var.y(t64VarG.y, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), 0L, null, 65215), ah1Var);
                    return remoteViews;
                }
            }
        }
        Object objJ0 = cj0.j0(arrayList);
        objJ0.getClass();
        pq4 pq4Var = ((gh1) objJ0).n;
        ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            ah1 ah1Var2 = (ah1) obj2;
            ah1Var2.getClass();
            gh1 gh1Var = (gh1) ah1Var2;
            long j = gh1Var.r;
            t64 t64VarG2 = ip2.g(ad5Var, gh1Var.y(), i2);
            RemoteViews remoteViews2 = t64VarG2.g;
            E(remoteViews2, ad5.g(ad5Var.y(t64VarG2.y, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), j, null, 64703), ah1Var2);
            arrayList2.add(new fp3(new SizeF(yb1.y(j), yb1.g(j)), remoteViews2));
        }
        if (pq4Var instanceof oq4) {
            return (RemoteViews) ((fp3) cj0.z0(arrayList2)).t;
        }
        if (!yf2.p(pq4Var, nq4.g)) {
            uo1.g();
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return wa.y(v13.I(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            l0.u("unsupported views size");
            return null;
        }
        ArrayList arrayList3 = new ArrayList(dj0.Y(arrayList2, 10));
        int size3 = arrayList2.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            arrayList3.add((RemoteViews) ((fp3) obj3).t);
        }
        int size4 = arrayList3.size();
        if (size4 == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size4 == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        l0.u("There must be between 1 and 2 views.");
        return null;
    }

    public static void G(int i, int i2) {
        String strJ;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strJ = hc6.j("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    l0.u(xi3.j("negative size: ", i2));
                    return;
                }
                strJ = hc6.j("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static void H(int i, int i2) {
        if (i < 0 || i > i2) {
            l0.p(J(i, i2, "index"));
        }
    }

    public static void I(int i, int i2, int i3) {
        String strJ;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strJ = J(i, i3, "start index");
            } else {
                strJ = (i2 < 0 || i2 > i3) ? J(i2, i3, "end index") : hc6.j("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static String J(int i, int i2, String str) {
        if (i < 0) {
            return hc6.j("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return hc6.j("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        l0.u(xi3.j("negative size: ", i2));
        return null;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static ColorStateList b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListR;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListR = ue5.R(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListR;
    }

    public static final void d(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final void e(RemoteViews remoteViews, ad5 ad5Var, kd2 kd2Var, ArrayList arrayList) {
        int i = 0;
        for (Object obj : cj0.C0(arrayList, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                pw5.R();
                throw null;
            }
            E(remoteViews, ad5Var.y(kd2Var, i), (ah1) obj);
            i = i2;
        }
    }

    public static List f(pr4 pr4Var, int i, pr4 pr4Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iZ = pr4Var.z(i);
        int i2 = i + iZ;
        int iX = pr4Var.x(pr4Var.y, pr4Var.s(i));
        int iX2 = pr4Var.x(pr4Var.y, pr4Var.s(i2));
        int i3 = iX2 - iX;
        boolean z5 = i >= 0 && (pr4Var.y[(pr4Var.s(i) * 5) + 1] & 201326592) != 0;
        pr4Var2.o(iZ);
        pr4Var2.f(i3, pr4Var2.z);
        if (pr4Var.l < i2) {
            pr4Var.A(i2);
        }
        if (pr4Var.m < iX2) {
            pr4Var.B(iX2, i2);
        }
        int[] iArr = pr4Var2.y;
        int i4 = pr4Var2.z;
        int i5 = i4 * 5;
        pr.M(i5, i * 5, i2 * 5, pr4Var.y, iArr);
        Object[] objArr = pr4Var2.r;
        int i6 = pr4Var2.t;
        System.arraycopy(pr4Var.r, iX, objArr, i6, i3);
        int i7 = pr4Var2.o;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iZ;
        int iX3 = i6 - pr4Var2.x(iArr, i4);
        int i10 = pr4Var2.w;
        int i11 = pr4Var2.q;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = pr4.j(pr4Var2.x(iArr, i13) + iX3, i12 < i13 ? 0 : pr4Var2.m, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        pr4Var2.w = i12;
        int iY = or4.y(pr4Var.n, i, pr4Var.i());
        int iY2 = or4.y(pr4Var.n, i2, pr4Var.i());
        if (iY < iY2) {
            ArrayList arrayList = pr4Var.n;
            ArrayList arrayList2 = new ArrayList(iY2 - iY);
            for (int i15 = iY; i15 < iY2; i15++) {
                c02 c02Var = (c02) arrayList.get(i15);
                c02Var.g += i8;
                arrayList2.add(c02Var);
            }
            pr4Var2.n.addAll(or4.y(pr4Var2.n, pr4Var2.z, pr4Var2.i()), arrayList2);
            arrayList.subList(iY, iY2).clear();
            list = arrayList2;
        } else {
            list = pi1.j;
        }
        if (!list.isEmpty()) {
            HashMap map = pr4Var.v;
            HashMap map2 = pr4Var2.v;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = pr4Var2.o;
        pr4Var2.N(i7);
        int iD = pr4Var.D(pr4Var.y, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iD >= 0;
            if (z7) {
                pr4Var.O();
                pr4Var.g(iD - pr4Var.z);
                pr4Var.O();
            }
            pr4Var.g(i - pr4Var.z);
            boolean zG = pr4Var.G();
            if (z7) {
                pr4Var.L();
                pr4Var.t();
                pr4Var.L();
                pr4Var.t();
            }
            z4 = zG;
        } else {
            boolean zH = pr4Var.H(i, iZ);
            pr4Var.I(iX, i3, i - 1);
            z4 = zH;
        }
        if (z4) {
            qo0.g("Unexpectedly removed anchors");
        }
        int i18 = pr4Var2.i;
        int i19 = iArr3[i5 + 1];
        pr4Var2.i = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            pr4Var2.z = i9;
            pr4Var2.t = i6 + i3;
        }
        if (z6) {
            pr4Var2.S(i7);
        }
        return list;
    }

    public static final boolean h(Object obj) {
        return obj == v70.t;
    }

    public static ColorStateList i(Context context, ro roVar, int i) {
        int resourceId;
        ColorStateList colorStateListR;
        TypedArray typedArray = (TypedArray) roVar.t;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListR = ue5.R(context, resourceId)) == null) ? roVar.s(i) : colorStateListR;
    }

    public static final long j() {
        return Thread.currentThread().getId();
    }

    public static final hj5 k(ha2 ha2Var, h02 h02Var) {
        j51 j51Var = (j51) h02Var.a(hp0.j);
        boolean zV = h02Var.v((((long) Float.floatToRawIntBits(j51Var.y())) & 4294967295L) | (((long) Float.floatToRawIntBits(ha2Var.a)) << 32));
        Object objK = h02Var.K();
        if (zV || objK == oo0.g) {
            j42 j42Var = new j42();
            x(j42Var, ha2Var.x);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(j51Var.e(ha2Var.y))) << 32) | (((long) Float.floatToRawIntBits(j51Var.e(ha2Var.r))) & 4294967295L);
            float fIntBitsToFloat = ha2Var.n;
            float fIntBitsToFloat2 = ha2Var.v;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            hj5 hj5Var = new hj5(j42Var);
            String str = ha2Var.g;
            long j = ha2Var.l;
            m30 m30Var = j != 16 ? new m30(ha2Var.j, j) : null;
            boolean z = ha2Var.t;
            hj5Var.v.setValue(new cq4(jFloatToRawIntBits));
            hj5Var.x.setValue(Boolean.valueOf(z));
            ti5 ti5Var = hj5Var.l;
            ti5Var.l.setValue(m30Var);
            ti5Var.t.setValue(new cq4(jFloatToRawIntBits2));
            ti5Var.r = str;
            h02Var.i0(hj5Var);
            objK = hj5Var;
        }
        return (hj5) objK;
    }

    public static final jd3 l(Context context) {
        context.getClass();
        jd3 jd3Var = new jd3(context);
        vc3 vc3Var = jd3Var.y;
        tf3 tf3Var = vc3Var.u;
        tf3Var.g(new sn0(tf3Var));
        tf3 tf3Var2 = vc3Var.u;
        tf3Var2.g(new un0());
        tf3Var2.g(new n91());
        return jd3Var;
    }

    public static final void m(tb4 tb4Var, String str) {
        tb4Var.getClass();
        cc4 cc4VarO = tb4Var.O(str);
        try {
            cc4VarO.H();
            c93.h(cc4VarO, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c93.h(cc4VarO, th);
                throw th2;
            }
        }
    }

    public static boolean o(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static Drawable p(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableJ;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableJ = k33.J(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableJ;
    }

    public static tv1 q(tv1[] tv1VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        tv1 tv1Var = null;
        int i3 = Integer.MAX_VALUE;
        for (tv1 tv1Var2 : tv1VarArr) {
            int iAbs = (Math.abs(mz5.r(tv1Var2) - i2) * 2) + (mz5.n(tv1Var2) == z ? 0 : 1);
            if (tv1Var == null || i3 > iAbs) {
                tv1Var = tv1Var2;
                i3 = iAbs;
            }
        }
        return tv1Var;
    }

    public static int s(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static final void t(xd1 xd1Var, int i, long j, float f, float f2) {
        if (i == 1) {
            float f3 = f / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (xd1Var.n() >> 32)) - f3) - f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) / 2.0f;
            xd1.F(xd1Var, j, f3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), null, 120);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (xd1Var.n() >> 32)) - f) - f2;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (xd1Var.n() & 4294967295L)) - f) / 2.0f;
        xd1.B(xd1Var, j, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))), 0.0f, 120);
    }

    public static final nh4 u(Object obj) {
        if (obj != v70.t) {
            return (nh4) obj;
        }
        l0.z("Does not contain segment");
        return null;
    }

    public static final int w(int i, yq2 yq2Var, Object obj) {
        int iV;
        return (obj == null || yq2Var.g() == 0 || (i < yq2Var.g() && obj.equals(yq2Var.y(i))) || (iV = yq2Var.v(obj)) == -1) ? i : iV;
    }

    public static final void x(j42 j42Var, ej5 ej5Var) {
        ArrayList arrayList = ej5Var.s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gj5 gj5Var = (gj5) arrayList.get(i);
            if (gj5Var instanceof ij5) {
                lq3 lq3Var = new lq3();
                ij5 ij5Var = (ij5) gj5Var;
                lq3Var.n = ij5Var.t;
                lq3Var.c = true;
                lq3Var.r();
                lq3Var.u.g.setFillType(ij5Var.a == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                lq3Var.r();
                lq3Var.r();
                lq3Var.y = ij5Var.m;
                lq3Var.r();
                lq3Var.r = ij5Var.q;
                lq3Var.r();
                lq3Var.l = ij5Var.w;
                lq3Var.r();
                lq3Var.v = ij5Var.c;
                lq3Var.r();
                lq3Var.x = ij5Var.i;
                lq3Var.i = true;
                lq3Var.r();
                lq3Var.j = ij5Var.b;
                lq3Var.i = true;
                lq3Var.r();
                lq3Var.t = ij5Var.s;
                lq3Var.i = true;
                lq3Var.r();
                lq3Var.a = ij5Var.p;
                lq3Var.i = true;
                lq3Var.r();
                lq3Var.m = ij5Var.u;
                lq3Var.b = true;
                lq3Var.r();
                lq3Var.q = ij5Var.z;
                lq3Var.b = true;
                lq3Var.r();
                lq3Var.w = ij5Var.h;
                lq3Var.b = true;
                lq3Var.r();
                j42Var.v(i, lq3Var);
            } else if (gj5Var instanceof ej5) {
                j42 j42Var2 = new j42();
                ej5 ej5Var2 = (ej5) gj5Var;
                j42Var2.m = ej5Var2.j;
                j42Var2.r();
                j42Var2.q = ej5Var2.t;
                j42Var2.u = true;
                j42Var2.r();
                j42Var2.i = ej5Var2.q;
                j42Var2.u = true;
                j42Var2.r();
                j42Var2.b = ej5Var2.w;
                j42Var2.u = true;
                j42Var2.r();
                j42Var2.s = ej5Var2.c;
                j42Var2.u = true;
                j42Var2.r();
                j42Var2.p = ej5Var2.i;
                j42Var2.u = true;
                j42Var2.r();
                j42Var2.w = ej5Var2.a;
                j42Var2.u = true;
                j42Var2.r();
                j42Var2.c = ej5Var2.m;
                j42Var2.u = true;
                j42Var2.r();
                j42Var2.x = ej5Var2.b;
                j42Var2.l = true;
                j42Var2.r();
                x(j42Var2, ej5Var2);
                j42Var.v(i, j42Var2);
            }
        }
    }

    public static final boolean z(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public Object c() {
        throw new IllegalStateException("");
    }

    public boolean g(k14 k14Var) {
        return false;
    }

    public Typeface n(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface r(Context context, tv1[] tv1VarArr, int i);

    public Typeface v(Context context, Resources resources, int i, String str, int i2) {
        File fileF = br2.f(context);
        if (fileF == null) {
            return null;
        }
        try {
            if (br2.m(fileF, resources, i)) {
                return Typeface.createFromFile(fileF.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileF.delete();
        }
    }

    public abstract Typeface y(Context context, fv1 fv1Var, Resources resources, int i);
}
