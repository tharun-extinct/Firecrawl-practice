package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import io.appground.blek.R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k33 {
    public static final tg1 A;
    public static final cm1 B;
    public static final d52 C;
    public static final y85 D;
    public static final int[] E;
    public static final byte[] F;
    public static ha2 G;
    public static ha2 H;
    public static final /* synthetic */ int I = 0;
    public static final /* synthetic */ int J = 0;
    public static final /* synthetic */ int K = 0;
    public static final float a;
    public static final float b;
    public static final nf5 c;
    public static final nf5 d;
    public static final float e;
    public static final sj0 f;
    public static final nf5 h;
    public static final sj0 i;
    public static final float j;
    public static final float k;
    public static final sj0 l;
    public static final sj0 m;
    public static final wa1 n;
    public static final float o;
    public static final sj0 p;
    public static final float q;
    public static final zt3 r;
    public static final float s;
    public static final sj0 t;
    public static final nf5 u;
    public static final sj0 v;
    public static final sj0 w;
    public static final in4 x;
    public static final sj0 z;
    public static final l1 g = new l1(13);
    public static final nm0 y = new nm0(1614356822, false, new xm0(22));

    static {
        new nm0(861793791, false, new hn0((byte) 29));
        new nm0(228584910, false, new zm0((byte) 0));
        r = new zt3(null, new jt3());
        n = new wa1();
        v = sj0.k;
        x = in4.b;
        sj0 sj0Var = sj0.i;
        l = sj0Var;
        j = 0.38f;
        t = sj0Var;
        a = 0.38f;
        m = sj0Var;
        q = 0.38f;
        w = sj0Var;
        c = nf5.j;
        sj0 sj0Var2 = sj0.b;
        i = sj0Var2;
        b = 24.0f;
        s = 56.0f;
        p = sj0Var2;
        nf5 nf5Var = nf5.c;
        u = nf5Var;
        z = sj0Var2;
        h = nf5.t;
        o = 88.0f;
        f = sj0Var2;
        k = 24.0f;
        d = nf5Var;
        e = 72.0f;
        byte b2 = 15;
        A = new tg1(b2);
        B = new cm1(b2);
        C = new d52(b2);
        D = new y85(0, new long[0], new Object[0]);
        E = new int[0];
        F = new byte[0];
    }

    public static final Object A(er1 er1Var, bz1 bz1Var, zz4 zz4Var) {
        int i2 = fs1.g;
        Object objR = c93.u(new id0(new es1(bz1Var, null, (byte) 0), er1Var, ni1.j, -2, f70.j), 0).r(rh3.j, zz4Var);
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        if (objR != px0Var) {
            objR = og5Var;
        }
        return objR == px0Var ? objR : og5Var;
    }

    public static final Object B(bz1 bz1Var, mu0 mu0Var) {
        re4 re4Var = new re4(mu0Var, mu0Var.v());
        return lr2.G(re4Var, true, re4Var, bz1Var);
    }

    public static final my1 C(final xy1 xy1Var, h02 h02Var, int i2) {
        final int iHashCode = Long.hashCode(h02Var.T);
        final Context context = (Context) h02Var.a(sa.y);
        final f02 f02VarH = pw5.H(h02Var);
        final uc4 uc4Var = (uc4) h02Var.a(wc4.g);
        final View view = (View) h02Var.a(sa.x);
        boolean zJ = ((((i2 & 14) ^ 6) > 4 && h02Var.x(xy1Var)) || (i2 & 6) == 4) | h02Var.j(context) | h02Var.j(f02VarH) | h02Var.j(uc4Var) | h02Var.n(iHashCode) | h02Var.j(view);
        Object objK = h02Var.K();
        if (zJ || objK == oo0.g) {
            Object obj = new my1() { // from class: jg
                @Override // defpackage.my1
                public final Object g() {
                    KeyEvent.Callback callback = view;
                    callback.getClass();
                    return new fl5(context, xy1Var, f02VarH, uc4Var, iHashCode, (pn3) callback).getLayoutNode();
                }
            };
            h02Var.i0(obj);
            objK = obj;
        }
        return (my1) objK;
    }

    public static Handler D(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return oa1.g(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final ox0 E(h02 h02Var) {
        return new m64(h02Var.R);
    }

    public static final yc4 F(zx0 zx0Var) {
        yc4 yc4Var;
        zx0Var.getClass();
        id4 id4Var = (id4) zx0Var.g(A);
        Bundle bundle = null;
        if (id4Var == null) {
            l0.u("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        wl5 wl5Var = (wl5) zx0Var.g(B);
        if (wl5Var == null) {
            l0.u("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) zx0Var.g(C);
        String str = (String) zx0Var.g(og0.f);
        if (str == null) {
            l0.u("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        fd4 fd4VarH = id4Var.r().H("androidx.lifecycle.internal.SavedStateHandlesProvider");
        cd4 cd4Var = fd4VarH instanceof cd4 ? (cd4) fd4VarH : null;
        if (cd4Var == null) {
            l0.z("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = L(wl5Var).y;
        yc4 yc4Var2 = (yc4) linkedHashMap.get(str);
        if (yc4Var2 != null) {
            return yc4Var2;
        }
        cd4Var.y();
        Bundle bundle3 = cd4Var.r;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = a11.n((fp3[]) Arrays.copyOf(new fp3[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                cd4Var.r = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            yc4Var = new yc4();
        } else {
            ClassLoader classLoader = yc4.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            f13 f13Var = new f13(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                f13Var.put(str2, bundle2.get(str2));
            }
            yc4Var = new yc4(f13Var.y());
        }
        linkedHashMap.put(str, yc4Var);
        return yc4Var;
    }

    public static final void G(id4 id4Var) {
        wt2 wt2Var = id4Var.a().t;
        if (wt2Var != wt2.t && wt2Var != wt2.a) {
            uo1.o("Failed to enable `SavedStateHandle` for `", id4Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", wt2Var, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (id4Var.r().H("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            cd4 cd4Var = new cd4(id4Var.r(), (wl5) id4Var);
            id4Var.r().T("androidx.lifecycle.internal.SavedStateHandlesProvider", cd4Var);
            id4Var.a().g(new j44(cd4Var, (byte) 3));
        }
    }

    public static final ha2 H() {
        ha2 ha2Var = G;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new rq3(7.0f, 10.0f));
        arrayList.add(new yq3(5.0f, 5.0f));
        arrayList.add(new yq3(5.0f, -5.0f));
        arrayList.add(nq3.r);
        ga2.g(ga2Var, arrayList, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        G = ha2VarY;
        return ha2VarY;
    }

    public static final ha2 I() {
        ha2 ha2Var = H;
        if (ha2Var != null) {
            return ha2Var;
        }
        ga2 ga2Var = new ga2("Outlined.BluetoothDisabled", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = fj5.g;
        cu4 cu4Var = new cu4(jj0.y);
        kq3 kq3Var = new kq3();
        kq3Var.j(13.0f, 5.83f);
        kq3Var.l(1.88f, 1.88f);
        kq3Var.l(-1.6f, 1.6f);
        kq3Var.l(1.41f, 1.41f);
        kq3Var.l(3.02f, -3.02f);
        kq3Var.x(12.0f, 2.0f);
        kq3Var.v(-1.0f);
        kq3Var.w(5.03f);
        kq3Var.l(2.0f, 2.0f);
        kq3Var.w(-3.2f);
        kq3Var.g();
        kq3Var.j(5.41f, 4.0f);
        kq3Var.x(4.0f, 5.41f);
        kq3Var.x(10.59f, 12.0f);
        kq3Var.x(5.0f, 17.59f);
        kq3Var.x(6.41f, 19.0f);
        kq3Var.x(11.0f, 14.41f);
        kq3Var.q(22.0f);
        kq3Var.v(1.0f);
        kq3Var.l(4.29f, -4.29f);
        kq3Var.l(2.3f, 2.29f);
        kq3Var.x(20.0f, 18.59f);
        kq3Var.x(5.41f, 4.0f);
        kq3Var.g();
        kq3Var.j(13.0f, 18.17f);
        kq3Var.w(-3.76f);
        kq3Var.l(1.88f, 1.88f);
        kq3Var.x(13.0f, 18.17f);
        kq3Var.g();
        ga2.g(ga2Var, kq3Var.g, 0, cu4Var);
        ha2 ha2VarY = ga2Var.y();
        H = ha2VarY;
        return ha2VarY;
    }

    public static Drawable J(Context context, int i2) {
        return s74.y().r(context, i2);
    }

    public static final int K(ni0 ni0Var, int i2) {
        int iR = ni0Var.r();
        ni0Var.z(i2);
        int i3 = 1;
        while (ni0Var.p() == i2) {
            ni0Var.z(i2);
            i3++;
        }
        ni0Var.u(iR);
        return i3;
    }

    public static final dd4 L(wl5 wl5Var) {
        bd4 bd4Var = new bd4();
        zx0 zx0VarK = xs2.k(wl5Var);
        zx0VarK.getClass();
        vl5 vl5VarT = wl5Var.t();
        vl5VarT.getClass();
        return (dd4) new kb5(vl5VarT, bd4Var, zx0VarK).h(v54.g(dd4.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final boolean M(ox0 ox0Var) {
        dh2 dh2Var = (dh2) ox0Var.w().h(d52.m);
        if (dh2Var != null) {
            return dh2Var.y();
        }
        return true;
    }

    public static final j73 N(j73 j73Var, xy1 xy1Var) {
        return j73Var.n(new bk3(xy1Var));
    }

    public static ev1 O(XmlResourceParser xmlResourceParser, Resources resources) throws Throwable {
        int next;
        int i2;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            b0(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), l24.y);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), l24.r);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z2 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            b0(xmlResourceParser);
                        }
                        arrayList.add(new gv1(i5, i7, resourceId2, string7, string6, z2));
                    } else {
                        b0(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new fv1((gv1[]) arrayList.toArray(new gv1[0]));
        }
        List listR = R(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), l24.n);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i2);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i4) {
                            b0(xmlResourceParser);
                        }
                        try {
                            typedArray = typedArrayObtainAttributes3;
                            try {
                                xu1 xu1Var = new xu1(string, string2, string8, listR, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(xu1Var);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = typedArrayObtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                b0(xmlResourceParser);
                i4 = i4;
                integer = integer;
                i2 = 2;
                i3 = 0;
            }
        }
        int i9 = integer;
        if (!arrayList2.isEmpty()) {
            return new hv1(arrayList2, i9, integer2, string5);
        }
        if (string3 == null) {
            l0.u("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new xu1(string, string2, string3, listR, null, null));
        if (string4 != null) {
            arrayList2.add(new xu1(string, string2, string4, listR, null, null));
        }
        return new hv1(arrayList2, i9, integer2, string5);
    }

    public static final long P(long j2, long j3) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L);
    }

    public static final i73 Q(rb3 rb3Var) {
        int i2;
        if (rb3Var == null || (i2 = rb3Var.a) == 0) {
            return null;
        }
        return (i73) rb3Var.w(i2 - 1);
    }

    public static List R(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final void S(o41 o41Var) {
        a9 autofillManager;
        um2 um2VarV = V(o41Var);
        if (um2VarV.A) {
            return;
        }
        ba baVar = (ba) xm2.g(um2VarV);
        if (!ba.n() || (autofillManager = baVar.m4getAutofillManager()) == null) {
            return;
        }
        Rect rect = autofillManager.w;
        m44 m44Var = autofillManager.m;
        um2 um2Var = (um2) m44Var.g.y(um2VarV.t);
        if (um2Var == null || um2Var.c == -4) {
            return;
        }
        bm bmVar = m44Var.r;
        int iN = m44Var.n(um2Var);
        long[] jArr = (long[]) bmVar.y;
        long j2 = jArr[iN];
        long j3 = jArr[iN + 1];
        rect.set((int) (j2 >> 32), (int) j2, (int) (j3 >> 32), (int) j3);
        autofillManager.j.G().requestAutofill(autofillManager.a, um2VarV.t, rect);
    }

    public static final gh3 T(o41 o41Var, int i2) {
        gh3 gh3Var = ((i73) o41Var).j.i;
        gh3Var.getClass();
        if (gh3Var.Y0() != o41Var || !hh3.l(i2)) {
            return gh3Var;
        }
        gh3 gh3Var2 = gh3Var.C;
        gh3Var2.getClass();
        return gh3Var2;
    }

    public static final gh3 U(o41 o41Var) {
        if (!((i73) o41Var).j.h) {
            mc2.y("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        gh3 gh3VarT = T(o41Var, 2);
        if (!gh3VarT.Y0().h) {
            mc2.y("LayoutCoordinates is not attached.");
        }
        return gh3VarT;
    }

    public static final um2 V(o41 o41Var) {
        gh3 gh3Var = ((i73) o41Var).j.i;
        if (gh3Var != null) {
            return gh3Var.B;
        }
        mc2.r("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        l0.x();
        return null;
    }

    public static final pn3 W(o41 o41Var) {
        pn3 pn3Var = V(o41Var).h;
        if (pn3Var != null) {
            return pn3Var;
        }
        mc2.r("This node does not have an owner.");
        l0.x();
        return null;
    }

    public static final fl5 X(um2 um2Var) {
        fl5 fl5Var = um2Var.o;
        if (fl5Var != null) {
            return fl5Var;
        }
        mc2.r("Required value was null.");
        l0.x();
        return null;
    }

    public static final long Y(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static int Z(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        l0.u("Cannot round NaN value.");
        return 0;
    }

    public static final void a(Object[] objArr, xy1 xy1Var, h02 h02Var) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zN = h02Var.n(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zN |= h02Var.x(obj);
        }
        Object objK = h02Var.K();
        if (zN || objK == oo0.g) {
            h02Var.i0(new ua1(xy1Var));
        }
    }

    public static long a0(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        l0.u("Cannot round NaN value.");
        return 0L;
    }

    public static final void b(bz1 bz1Var, h02 h02Var, Object obj) {
        fx0 fx0Var = h02Var.R;
        boolean zX = h02Var.x(obj);
        Object objK = h02Var.K();
        if (zX || objK == oo0.g) {
            objK = new pk2(fx0Var, bz1Var);
            h02Var.i0(objK);
        }
    }

    public static void b0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final void c(j73 j73Var, my1 my1Var, boolean z2, cn4 cn4Var, k92 k92Var, bz1 bz1Var, h02 h02Var, int i2) {
        int i3;
        h02Var.Z(-1134296466);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.x(j73Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.j(my1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var.l(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= h02Var.x(cn4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= h02Var.x(k92Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= h02Var.x(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= h02Var.j(bz1Var) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (h02Var.N(i4 & 1, (599187 & i4) != 599186)) {
            h02Var.X(977045485);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = du4.n(h02Var);
            }
            ja3 ja3Var = (ja3) objK;
            h02Var.b(false);
            f72 f72Var = ye2.g;
            j73 j73VarN = j73Var.n(c63.g);
            float f2 = a11.B;
            long jM = m(a11.C + f2 + f2, 40.0f);
            ho1 ho1Var = mq4.g;
            j73 j73VarE = e(ue5.H(og0.a(y94.h(mq4.t(j73VarN, yb1.y(jM), yb1.g(jM)), cn4Var), z2 ? k92Var.g : k92Var.r, cn4Var), ja3Var, k94.g(0.0f, 7, 0L, false), z2, new o94(0), my1Var, 8));
            t33 t33VarR = z50.r(hi0.w, false);
            int iS = pw5.s(h02Var);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarE);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            on0 on0Var = tg1.c;
            if (h02Var.S || !yf2.p(h02Var.K(), Integer.valueOf(iS))) {
                du4.f(iS, h02Var, iS, on0Var);
            }
            xs2.E(tg1.m, h02Var, j73VarW);
            og0.y(du4.t(z2 ? k92Var.y : k92Var.n, mt0.g), bz1Var, h02Var, ((i4 >> 15) & 112) | 8);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new co5(j73Var, my1Var, z2, cn4Var, k92Var, bz1Var, i2);
        }
    }

    public static final void c0(h02 h02Var, j73 j73Var, int i2, j51 j51Var, gu2 gu2Var, id4 id4Var, fl2 fl2Var, tr3 tr3Var) {
        jo0.n.getClass();
        xs2.E(tg1.q, h02Var, tr3Var);
        xs2.E(new gg((byte) 9), h02Var, j73Var);
        xs2.E(new gg((byte) 0), h02Var, j51Var);
        xs2.E(new gg((byte) 1), h02Var, gu2Var);
        xs2.E(new gg((byte) 2), h02Var, id4Var);
        xs2.E(new gg((byte) 3), h02Var, fl2Var);
        xs2.E(tg1.c, h02Var, Integer.valueOf(i2));
    }

    public static final void d(ox0 ox0Var, CancellationException cancellationException) {
        dh2 dh2Var = (dh2) ox0Var.w().h(d52.m);
        if (dh2Var != null) {
            dh2Var.x(cancellationException);
        } else {
            l0.b(ox0Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static j73 e(j73 j73Var) {
        return j73Var.n(new he0(new l1((byte) 24)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final lm2 f(i73 i73Var) {
        if ((i73Var.a & 2) != 0) {
            if (i73Var instanceof lm2) {
                return (lm2) i73Var;
            }
            if (i73Var instanceof p41) {
                i73 i73Var2 = ((p41) i73Var).f;
                while (i73Var2 != 0) {
                    if (i73Var2 instanceof lm2) {
                        return (lm2) i73Var2;
                    }
                    i73Var2 = (!(i73Var2 instanceof p41) || (i73Var2.a & 2) == 0) ? i73Var2.w : ((p41) i73Var2).f;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:73:0x0177  */
    /* JADX WARN: Code duplicated, block: B:76:0x0181  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void g(final xy1 xy1Var, final j73 j73Var, xy1 xy1Var2, final xy1 xy1Var3, final xy1 xy1Var4, h02 h02Var, final int i2, final int i3) {
        int i4;
        xy1 xy1Var5;
        boolean z2;
        final xy1 xy1Var6;
        u34 u34VarP;
        int iHashCode;
        j73 j73VarW;
        j51 j51Var;
        fl2 fl2Var;
        xy1 xy1Var7;
        tr3 tr3VarQ;
        gu2 gu2Var;
        id4 id4Var;
        xy1 xy1Var8;
        my1 my1VarC;
        my1 my1VarC2;
        int i5;
        int i6;
        h02Var.Z(-180024211);
        t tVar = h02Var.g;
        if ((i2 & 6) == 0) {
            i4 = (h02Var.j(xy1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= h02Var.x(j73Var) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 384) == 0) {
                xy1Var5 = xy1Var2;
                i4 |= h02Var.j(xy1Var5) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if (h02Var.j(xy1Var3)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) == 0) {
                if (h02Var.j(xy1Var4)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            if ((i4 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (h02Var.N(i4 & 1, z2)) {
                if (i7 != 0) {
                    xy1Var5 = null;
                }
                iHashCode = Long.hashCode(h02Var.T);
                j73VarW = m50.W(h02Var, j73Var.n(dt1.g).n(bu1.g).n(du1.g).n(zt1.g));
                j51Var = (j51) h02Var.a(hp0.j);
                fl2Var = (fl2) h02Var.a(hp0.c);
                xy1Var7 = xy1Var5;
                tr3VarQ = h02Var.q();
                gu2Var = (gu2) h02Var.a(ix2.g);
                id4Var = (id4) h02Var.a(qx2.g);
                if (xy1Var7 != null) {
                    h02Var.X(1313917368);
                    my1VarC2 = C(xy1Var, h02Var, i4 & 14);
                    if (tVar instanceof wf5) {
                        pw5.f();
                        throw null;
                    }
                    h02Var.b0();
                    if (h02Var.S) {
                        h02Var.m(my1VarC2);
                    } else {
                        h02Var.l0();
                    }
                    xy1Var8 = xy1Var7;
                    c0(h02Var, j73VarW, iHashCode, j51Var, gu2Var, id4Var, fl2Var, tr3VarQ);
                    xs2.E(new gg((byte) 4), h02Var, xy1Var8);
                    xs2.E(new gg((byte) 5), h02Var, xy1Var4);
                    xs2.E(new gg((byte) 6), h02Var, xy1Var3);
                    h02Var.b(true);
                    h02Var.b(false);
                } else {
                    xy1Var8 = xy1Var7;
                    h02Var.X(1314774735);
                    my1VarC = C(xy1Var, h02Var, i4 & 14);
                    if (tVar instanceof wf5) {
                        pw5.f();
                        throw null;
                    }
                    h02Var.V();
                    if (h02Var.S) {
                        h02Var.m(my1VarC);
                    } else {
                        h02Var.l0();
                    }
                    c0(h02Var, j73VarW, iHashCode, j51Var, gu2Var, id4Var, fl2Var, tr3VarQ);
                    xs2.E(new gg((byte) 7), h02Var, xy1Var4);
                    xs2.E(new gg((byte) 8), h02Var, xy1Var3);
                    h02Var.b(true);
                    h02Var.b(false);
                }
                xy1Var6 = xy1Var8;
            } else {
                h02Var.Q();
                xy1Var6 = xy1Var5;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: ig
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k33.g(xy1Var, j73Var, xy1Var6, xy1Var3, xy1Var4, (h02) obj, aq2.J(i2 | 1), i3);
                        return og5.g;
                    }
                };
            }
        }
        i4 |= 384;
        xy1Var5 = xy1Var2;
        if ((i2 & 3072) == 0) {
            if (h02Var.j(xy1Var3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (h02Var.j(xy1Var4)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((i4 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (h02Var.N(i4 & 1, z2)) {
            if (i7 != 0) {
                xy1Var5 = null;
            }
            iHashCode = Long.hashCode(h02Var.T);
            j73VarW = m50.W(h02Var, j73Var.n(dt1.g).n(bu1.g).n(du1.g).n(zt1.g));
            j51Var = (j51) h02Var.a(hp0.j);
            fl2Var = (fl2) h02Var.a(hp0.c);
            xy1Var7 = xy1Var5;
            tr3VarQ = h02Var.q();
            gu2Var = (gu2) h02Var.a(ix2.g);
            id4Var = (id4) h02Var.a(qx2.g);
            if (xy1Var7 != null) {
                h02Var.X(1313917368);
                my1VarC2 = C(xy1Var, h02Var, i4 & 14);
                if (tVar instanceof wf5) {
                    pw5.f();
                    throw null;
                }
                h02Var.b0();
                if (h02Var.S) {
                    h02Var.m(my1VarC2);
                } else {
                    h02Var.l0();
                }
                xy1Var8 = xy1Var7;
                c0(h02Var, j73VarW, iHashCode, j51Var, gu2Var, id4Var, fl2Var, tr3VarQ);
                xs2.E(new gg((byte) 4), h02Var, xy1Var8);
                xs2.E(new gg((byte) 5), h02Var, xy1Var4);
                xs2.E(new gg((byte) 6), h02Var, xy1Var3);
                h02Var.b(true);
                h02Var.b(false);
            } else {
                xy1Var8 = xy1Var7;
                h02Var.X(1314774735);
                my1VarC = C(xy1Var, h02Var, i4 & 14);
                if (tVar instanceof wf5) {
                    pw5.f();
                    throw null;
                }
                h02Var.V();
                if (h02Var.S) {
                    h02Var.m(my1VarC);
                } else {
                    h02Var.l0();
                }
                c0(h02Var, j73VarW, iHashCode, j51Var, gu2Var, id4Var, fl2Var, tr3VarQ);
                xs2.E(new gg((byte) 7), h02Var, xy1Var4);
                xs2.E(new gg((byte) 8), h02Var, xy1Var3);
                h02Var.b(true);
                h02Var.b(false);
            }
            xy1Var6 = xy1Var8;
        } else {
            h02Var.Q();
            xy1Var6 = xy1Var5;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: ig
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k33.g(xy1Var, j73Var, xy1Var6, xy1Var3, xy1Var4, (h02) obj, aq2.J(i2 | 1), i3);
                    return og5.g;
                }
            };
        }
    }

    public static final void h(final boolean z2, final xy1 xy1Var, final j73 j73Var, final boolean z3, final cn4 cn4Var, final u92 u92Var, h02 h02Var, final int i2) {
        int i3;
        xy1 xy1Var2;
        cn4 cn4Var2;
        h02Var.Z(-1118363928);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.l(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            xy1Var2 = xy1Var;
            i3 |= h02Var.j(xy1Var2) ? 32 : 16;
        } else {
            xy1Var2 = xy1Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= h02Var.x(j73Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= h02Var.l(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            cn4Var2 = cn4Var;
            i3 |= h02Var.x(cn4Var2) ? 16384 : 8192;
        } else {
            cn4Var2 = cn4Var;
        }
        if ((196608 & i2) == 0) {
            i3 |= h02Var.x(u92Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= h02Var.x(null) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= h02Var.x(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= h02Var.j(oz5.y) ? 67108864 : 33554432;
        }
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new m92(b2);
                h02Var.i0(objK);
            }
            uz4.r(z2, xy1Var2, dj4.g(j73Var, false, (xy1) objK), z3, cn4Var2, ((jj0) u92Var.g(z3, z2, h02Var).getValue()).g, ((jj0) u92Var.y(z3, z2, h02Var).getValue()).g, null, null, ue5.m0(1492028158, new pm0((byte) 7), h02Var), h02Var, (64638 & i3) | ((i3 << 9) & 1879048192));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: n92
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k33.h(z2, xy1Var, j73Var, z3, cn4Var, u92Var, (h02) obj, aq2.J(i2 | 1));
                    return og5.g;
                }
            };
        }
    }

    public static final void i(my1 my1Var, h02 h02Var, int i2) {
        h02 h02Var2;
        my1Var.getClass();
        h02Var.Z(35830419);
        int i3 = i2 & 1;
        if (h02Var.N(i3, i3 != 0)) {
            Context context = (Context) h02Var.a(sa.y);
            boolean zJ = h02Var.j(context);
            Object objK = h02Var.K();
            if (zJ || objK == oo0.g) {
                objK = new sn(context, (byte) 5);
                h02Var.i0(objK);
            }
            h02Var2 = h02Var;
            w((my1) objK, null, false, null, null, c93.q, h02Var2, 1572864, 62);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new vk(i2, my1Var);
        }
    }

    public static final void j(Object obj, xy1 xy1Var, h02 h02Var) {
        boolean zX = h02Var.x(obj);
        Object objK = h02Var.K();
        if (zX || objK == oo0.g) {
            objK = new ua1(xy1Var);
            h02Var.i0(objK);
        }
    }

    public static final int k(zy2 zy2Var, v6 v6Var) {
        zy2 zy2VarX0 = zy2Var.x0();
        if (zy2VarX0 == null) {
            mc2.y("Child of " + zy2Var + " cannot be null when calculating alignment line");
        }
        if (zy2Var.F0().r().containsKey(v6Var)) {
            Integer num = (Integer) zy2Var.F0().r().get(v6Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iC0 = zy2VarX0.c0(v6Var);
            if (iC0 != Integer.MIN_VALUE) {
                boolean z2 = zy2Var.h;
                boolean z3 = zy2Var.o;
                zy2VarX0.h = true;
                zy2Var.o = true;
                zy2Var.L0();
                zy2VarX0.h = z2;
                zy2Var.o = z3;
                return iC0 + ((int) (v6Var instanceof f72 ? zy2VarX0.H0() & 4294967295L : zy2VarX0.H0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final n51 l(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        iv1 iv1VarG = jv1.g(f2);
        if (iv1VarG == null) {
            iv1VarG = new cv2(f2);
        }
        return new n51(f3, f2, iv1VarG);
    }

    public static final long m(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void n(qr0 qr0Var, nm0 nm0Var, h02 h02Var, int i2) {
        l40 l40Var;
        qr0Var.getClass();
        h02Var.Z(92540233);
        byte b2 = 4;
        int i3 = (h02Var.j(qr0Var) ? 4 : 2) | i2;
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            aa3 aa3VarF = sp2.f(Build.VERSION.SDK_INT >= 31 ? pw5.d("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE") : pw5.k("android.permission.BLUETOOTH"), h02Var, 0);
            ob3 ob3VarJ = v13.j(qr0Var.b, h02Var);
            ob3 ob3VarJ2 = v13.j(qr0Var.c, h02Var);
            if (aa3VarF.v()) {
                l40Var = ((s30) ob3VarJ.getValue()) == s30.t ? l40.t : l40.a;
            } else {
                l40Var = l40.j;
            }
            y94.y(l40Var, null, null, null, "ViewStatus", null, ue5.m0(1053076196, new m40(aa3VarF, qr0Var, nm0Var, ob3VarJ2, (byte) 0), h02Var), h02Var, 1597440, 46);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vn(b2, i2, qr0Var, nm0Var);
        }
    }

    public static final void o(rb3 rb3Var, i73 i73Var) {
        rb3 rb3VarB = V(i73Var).B();
        int i2 = rb3VarB.a - 1;
        Object[] objArr = rb3VarB.j;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                rb3Var.y(((um2) objArr[i2]).M.x);
                i2--;
            }
        }
    }

    public static final void p(aa3 aa3Var, h02 h02Var, int i2) {
        h02 h02Var2;
        h02Var.Z(206607968);
        int i3 = (h02Var.x(aa3Var) ? 4 : 2) | i2;
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) h02Var.a(sa.y);
            boolean zV = aa3Var.v();
            l76 l76Var = oo0.g;
            if (zV || aa3Var.l()) {
                h02Var.X(370174818);
                h02Var.b(false);
            } else {
                h02Var.X(370037395);
                Boolean boolValueOf = Boolean.valueOf(aa3Var.v());
                boolean z2 = (i3 & 14) == 4;
                Object objK = h02Var.K();
                if (z2 || objK == l76Var) {
                    objK = new o40(aa3Var, null, b2);
                    h02Var.i0(objK);
                }
                b((bz1) objK, h02Var, boolValueOf);
                h02Var.b(false);
            }
            boolean zJ = h02Var.j(context) | ((i3 & 14) == 4);
            Object objK2 = h02Var.K();
            if (zJ || objK2 == l76Var) {
                objK2 = new rg((Object) aa3Var, (Object) context, (byte) 5);
                h02Var.i0(objK2);
            }
            h02Var2 = h02Var;
            y94.a((my1) objK2, xs2.J(R.string.connection_permission_required, new Object[]{xs2.I(R.string.app_name, h02Var), xs2.I(R.string.permgrouplab_nearby_devices, h02Var)}, h02Var), null, xs2.I(aa3Var.l() ? R.string.button_allow_access : R.string.button_open_settings, h02Var), v70.l, h02Var2, 24576, 4);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new f(aa3Var, i2, (byte) 7);
        }
    }

    public static final void q(boolean z2, xy1 xy1Var, j73 j73Var, boolean z3, cn4 cn4Var, u92 u92Var, h02 h02Var, int i2) {
        j73 j73Var2;
        boolean z4;
        cn4 cn4Var2;
        u92 u92Var2;
        int i3;
        cn4 cn4Var3;
        u92 u92Var3;
        h02Var.Z(-713829427);
        int i4 = i2 | (h02Var.l(z2) ? 4 : 2) | (h02Var.j(xy1Var) ? 32 : 16) | 1649664;
        boolean z5 = true;
        if (h02Var.N(i4 & 1, (4793491 & i4) != 4793490)) {
            h02Var.S();
            if ((i2 & 1) == 0 || h02Var.k()) {
                cn4 cn4VarY = vn4.y(a11.A, h02Var);
                rj0 rj0Var = (rj0) h02Var.a(tj0.g);
                u92 u92Var4 = rj0Var.i0;
                if (u92Var4 == null) {
                    u92 u92Var5 = new u92(tj0.n(rj0Var, hb6.t()), tj0.n(rj0Var, hb6.j()), jj0.y(hb6.n(), tj0.n(rj0Var, hb6.r())), jj0.y(hb6.v(), tj0.n(rj0Var, hb6.y())), tj0.n(rj0Var, hb6.l()), tj0.n(rj0Var, hb6.x()));
                    rj0Var.i0 = u92Var5;
                    u92Var4 = u92Var5;
                }
                i3 = i4 & (-516097);
                cn4Var3 = cn4VarY;
                u92Var3 = u92Var4;
            } else {
                h02Var.Q();
                i3 = i4 & (-516097);
                z5 = z3;
                cn4Var3 = cn4Var;
                u92Var3 = u92Var;
            }
            h02Var.s();
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = new wm0((byte) 29);
                h02Var.i0(objK);
            }
            j73Var2 = j73Var;
            boolean z6 = z5;
            h(z2, xy1Var, dj4.g(j73Var2, false, (xy1) objK), z6, cn4Var3, u92Var3, h02Var, (i3 & 112) | (i3 & 14) | 1572864 | 113249280);
            cn4Var2 = cn4Var3;
            u92Var2 = u92Var3;
            z4 = z6;
        } else {
            j73Var2 = j73Var;
            h02Var.Q();
            z4 = z3;
            cn4Var2 = cn4Var;
            u92Var2 = u92Var;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new l92(z2, xy1Var, j73Var2, z4, cn4Var2, u92Var2, i2);
        }
    }

    public static final void r(my1 my1Var, h02 h02Var, int i2) {
        int i3;
        my1 my1Var2;
        h02 h02Var2;
        h02Var.Z(-1002404726);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.j(my1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 1;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            my1Var2 = my1Var;
            h02Var2 = h02Var;
            y94.a(my1Var2, Html.fromHtml(xs2.I(R.string.connection_bluetooth_disabled, h02Var)).toString(), null, xs2.I(R.string.button_enable_bluetooth, h02Var), v70.j, h02Var2, (i3 & 14) | 24576, 4);
        } else {
            my1Var2 = my1Var;
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new ms(my1Var2, i2, b2);
        }
    }

    public static final void s(Object obj, Object obj2, bz1 bz1Var, h02 h02Var) {
        fx0 fx0Var = h02Var.R;
        boolean zX = h02Var.x(obj) | h02Var.x(obj2);
        Object objK = h02Var.K();
        if (zX || objK == oo0.g) {
            objK = new pk2(fx0Var, bz1Var);
            h02Var.i0(objK);
        }
    }

    public static final void t(Object obj, Object obj2, xy1 xy1Var, h02 h02Var) {
        boolean zX = h02Var.x(obj) | h02Var.x(obj2);
        Object objK = h02Var.K();
        if (zX || objK == oo0.g) {
            objK = new ua1(xy1Var);
            h02Var.i0(objK);
        }
    }

    public static final void u(int i2, h02 h02Var) {
        h02 h02Var2 = h02Var;
        h02Var2.Z(806356682);
        if (h02Var2.N(i2 & 1, i2 != 0)) {
            g73 g73Var = g73.g;
            j73 j73VarN = ue5.e0(g73Var, 16.0f).n(mq4.r);
            ek0 ek0VarG = ck0.g(v70.v, hi0.o, h02Var2, 54);
            int iHashCode = Long.hashCode(h02Var2.T);
            tr3 tr3VarQ = h02Var2.q();
            j73 j73VarW = m50.W(h02Var2, j73VarN);
            jo0.n.getClass();
            h02Var2.b0();
            if (h02Var2.S) {
                h02Var2.m(um2.Z);
            } else {
                h02Var2.l0();
            }
            xs2.E(tg1.w, h02Var2, ek0VarG);
            xs2.E(tg1.q, h02Var2, tr3VarQ);
            xs2.E(tg1.c, h02Var2, Integer.valueOf(iHashCode));
            xs2.D(h02Var2);
            xs2.E(tg1.m, h02Var2, j73VarW);
            b04.g(null, 0L, 0.0f, 0L, 0, 0.0f, h02Var2, 0, 63);
            g75.y(xs2.I(R.string.checking_device_capabilities, h02Var2), ue5.i0(g73Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(of5.g)).l, h02Var, 48, 0, 131068);
            h02Var2 = h02Var;
            h02Var2.b(true);
        } else {
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new gg(i2);
        }
    }

    public static final CancellationException v(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108  */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0114  */
    /* JADX WARN: Code duplicated, block: B:82:0x0152  */
    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void w(final my1 my1Var, j73 j73Var, boolean z2, k92 k92Var, cn4 cn4Var, final bz1 bz1Var, h02 h02Var, final int i2, final int i3) {
        int i4;
        j73 j73Var2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        final k92 k92Var2;
        final j73 j73Var3;
        final boolean z5;
        final cn4 cn4Var2;
        u34 u34VarP;
        j73 j73Var4;
        long j2;
        rj0 rj0Var;
        k92 k92Var3;
        long j3;
        long j4;
        long jY;
        long j5;
        int i8;
        cn4 cn4VarY;
        j73 j73Var5;
        boolean z6;
        int i9;
        h02Var.Z(1413012038);
        if ((i2 & 6) == 0) {
            i4 = (h02Var.j(my1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 == 0) {
            if ((i2 & 48) == 0) {
                j73Var2 = j73Var;
                i4 |= h02Var.x(j73Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    z3 = z2;
                    if (h02Var.l(z3)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    i4 |= 1024;
                }
                i7 = i4 | 24576;
                if ((196608 & i2) == 0) {
                    i7 = 90112 | i4;
                }
                if ((1572864 & i2) != 0) {
                    if (h02Var.j(bz1Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i7 |= i9;
                }
                if ((599187 & i7) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (h02Var.N(i7 & 1, z4)) {
                    h02Var.S();
                    if ((i2 & 1) != 0 || h02Var.k()) {
                        if (i10 != 0) {
                            j73Var4 = g73.g;
                        } else {
                            j73Var4 = j73Var2;
                        }
                        boolean z7 = i5 == 0 ? z3 : true;
                        j2 = ((jj0) h02Var.a(mt0.g)).g;
                        rj0Var = (rj0) h02Var.a(tj0.g);
                        k92Var3 = rj0Var.h0;
                        if (k92Var3 == null) {
                            long j6 = jj0.l;
                            k92Var3 = new k92(j6, j2, j6, jj0.y(0.38f, j2));
                            j3 = j2;
                            rj0Var.h0 = k92Var3;
                        } else {
                            j3 = j2;
                        }
                        j4 = k92Var3.y;
                        if (!tf5.g(j4, j3)) {
                            jY = jj0.y(0.38f, j3);
                            long j7 = k92Var3.g;
                            long j8 = k92Var3.r;
                            if (j3 != 16) {
                                j5 = j3;
                            } else {
                                j5 = j4;
                            }
                            if (jY == 16) {
                                jY = k92Var3.n;
                            }
                            k92Var3 = new k92(j7, j5, j8, jY);
                        }
                        i8 = i7 & (-465921);
                        cn4VarY = vn4.y(a11.A, h02Var);
                        j73Var5 = j73Var4;
                        k92Var2 = k92Var3;
                        z6 = z7;
                    } else {
                        h02Var.Q();
                        k92Var2 = k92Var;
                        i8 = i7 & (-465921);
                        j73Var5 = j73Var2;
                        z6 = z3;
                        cn4VarY = cn4Var;
                    }
                    h02Var.s();
                    int i11 = i8 << 3;
                    c(j73Var5, my1Var, z6, cn4VarY, k92Var2, bz1Var, h02Var, ((i8 >> 3) & 14) | (i11 & 112) | (i8 & 896) | (i11 & 458752) | (i8 & 3670016));
                    cn4Var2 = cn4VarY;
                    z5 = z6;
                    j73Var3 = j73Var5;
                } else {
                    h02Var.Q();
                    k92Var2 = k92Var;
                    j73Var3 = j73Var2;
                    z5 = z3;
                    cn4Var2 = cn4Var;
                }
                u34VarP = h02Var.p();
                if (u34VarP != null) {
                    u34VarP.n = new bz1() { // from class: o92
                        @Override // defpackage.bz1
                        public final Object l(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k33.w(my1Var, j73Var3, z5, k92Var2, cn4Var2, bz1Var, (h02) obj, aq2.J(i2 | 1), i3);
                            return og5.g;
                        }
                    };
                }
            }
            i4 |= 384;
            z3 = z2;
            if ((i2 & 3072) == 0) {
                i4 |= 1024;
            }
            i7 = i4 | 24576;
            if ((196608 & i2) == 0) {
                i7 = 90112 | i4;
            }
            if ((1572864 & i2) != 0) {
                if (h02Var.j(bz1Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i7 |= i9;
            }
            if ((599187 & i7) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (h02Var.N(i7 & 1, z4)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if (i5 == 0) {
                    }
                    j2 = ((jj0) h02Var.a(mt0.g)).g;
                    rj0Var = (rj0) h02Var.a(tj0.g);
                    k92Var3 = rj0Var.h0;
                    if (k92Var3 == null) {
                        long j9 = jj0.l;
                        k92Var3 = new k92(j9, j2, j9, jj0.y(0.38f, j2));
                        j3 = j2;
                        rj0Var.h0 = k92Var3;
                    } else {
                        j3 = j2;
                    }
                    j4 = k92Var3.y;
                    if (!tf5.g(j4, j3)) {
                        jY = jj0.y(0.38f, j3);
                        long j10 = k92Var3.g;
                        long j11 = k92Var3.r;
                        if (j3 != 16) {
                            j5 = j3;
                        } else {
                            j5 = j4;
                        }
                        if (jY == 16) {
                            jY = k92Var3.n;
                        }
                        k92Var3 = new k92(j10, j5, j11, jY);
                    }
                    i8 = i7 & (-465921);
                    cn4VarY = vn4.y(a11.A, h02Var);
                    j73Var5 = j73Var4;
                    k92Var2 = k92Var3;
                    z6 = z7;
                } else {
                    if (i10 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if (i5 == 0) {
                    }
                    j2 = ((jj0) h02Var.a(mt0.g)).g;
                    rj0Var = (rj0) h02Var.a(tj0.g);
                    k92Var3 = rj0Var.h0;
                    if (k92Var3 == null) {
                        long j12 = jj0.l;
                        k92Var3 = new k92(j12, j2, j12, jj0.y(0.38f, j2));
                        j3 = j2;
                        rj0Var.h0 = k92Var3;
                    } else {
                        j3 = j2;
                    }
                    j4 = k92Var3.y;
                    if (!tf5.g(j4, j3)) {
                        jY = jj0.y(0.38f, j3);
                        long j13 = k92Var3.g;
                        long j14 = k92Var3.r;
                        if (j3 != 16) {
                            j5 = j3;
                        } else {
                            j5 = j4;
                        }
                        if (jY == 16) {
                            jY = k92Var3.n;
                        }
                        k92Var3 = new k92(j13, j5, j14, jY);
                    }
                    i8 = i7 & (-465921);
                    cn4VarY = vn4.y(a11.A, h02Var);
                    j73Var5 = j73Var4;
                    k92Var2 = k92Var3;
                    z6 = z7;
                }
                h02Var.s();
                int i12 = i8 << 3;
                c(j73Var5, my1Var, z6, cn4VarY, k92Var2, bz1Var, h02Var, ((i8 >> 3) & 14) | (i12 & 112) | (i8 & 896) | (i12 & 458752) | (i8 & 3670016));
                cn4Var2 = cn4VarY;
                z5 = z6;
                j73Var3 = j73Var5;
            } else {
                h02Var.Q();
                k92Var2 = k92Var;
                j73Var3 = j73Var2;
                z5 = z3;
                cn4Var2 = cn4Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: o92
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k33.w(my1Var, j73Var3, z5, k92Var2, cn4Var2, bz1Var, (h02) obj, aq2.J(i2 | 1), i3);
                        return og5.g;
                    }
                };
            }
        }
        i4 |= 48;
        j73Var2 = j73Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                z3 = z2;
                if (h02Var.l(z3)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                i4 |= 1024;
            }
            i7 = i4 | 24576;
            if ((196608 & i2) == 0) {
                i7 = 90112 | i4;
            }
            if ((1572864 & i2) != 0) {
                if (h02Var.j(bz1Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i7 |= i9;
            }
            if ((599187 & i7) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (h02Var.N(i7 & 1, z4)) {
                h02Var.S();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if (i5 == 0) {
                    }
                    j2 = ((jj0) h02Var.a(mt0.g)).g;
                    rj0Var = (rj0) h02Var.a(tj0.g);
                    k92Var3 = rj0Var.h0;
                    if (k92Var3 == null) {
                        long j15 = jj0.l;
                        k92Var3 = new k92(j15, j2, j15, jj0.y(0.38f, j2));
                        j3 = j2;
                        rj0Var.h0 = k92Var3;
                    } else {
                        j3 = j2;
                    }
                    j4 = k92Var3.y;
                    if (!tf5.g(j4, j3)) {
                        jY = jj0.y(0.38f, j3);
                        long j16 = k92Var3.g;
                        long j17 = k92Var3.r;
                        if (j3 != 16) {
                            j5 = j3;
                        } else {
                            j5 = j4;
                        }
                        if (jY == 16) {
                            jY = k92Var3.n;
                        }
                        k92Var3 = new k92(j16, j5, j17, jY);
                    }
                    i8 = i7 & (-465921);
                    cn4VarY = vn4.y(a11.A, h02Var);
                    j73Var5 = j73Var4;
                    k92Var2 = k92Var3;
                    z6 = z7;
                } else {
                    if (i10 != 0) {
                        j73Var4 = g73.g;
                    } else {
                        j73Var4 = j73Var2;
                    }
                    if (i5 == 0) {
                    }
                    j2 = ((jj0) h02Var.a(mt0.g)).g;
                    rj0Var = (rj0) h02Var.a(tj0.g);
                    k92Var3 = rj0Var.h0;
                    if (k92Var3 == null) {
                        long j18 = jj0.l;
                        k92Var3 = new k92(j18, j2, j18, jj0.y(0.38f, j2));
                        j3 = j2;
                        rj0Var.h0 = k92Var3;
                    } else {
                        j3 = j2;
                    }
                    j4 = k92Var3.y;
                    if (!tf5.g(j4, j3)) {
                        jY = jj0.y(0.38f, j3);
                        long j19 = k92Var3.g;
                        long j110 = k92Var3.r;
                        if (j3 != 16) {
                            j5 = j3;
                        } else {
                            j5 = j4;
                        }
                        if (jY == 16) {
                            jY = k92Var3.n;
                        }
                        k92Var3 = new k92(j19, j5, j110, jY);
                    }
                    i8 = i7 & (-465921);
                    cn4VarY = vn4.y(a11.A, h02Var);
                    j73Var5 = j73Var4;
                    k92Var2 = k92Var3;
                    z6 = z7;
                }
                h02Var.s();
                int i13 = i8 << 3;
                c(j73Var5, my1Var, z6, cn4VarY, k92Var2, bz1Var, h02Var, ((i8 >> 3) & 14) | (i13 & 112) | (i8 & 896) | (i13 & 458752) | (i8 & 3670016));
                cn4Var2 = cn4VarY;
                z5 = z6;
                j73Var3 = j73Var5;
            } else {
                h02Var.Q();
                k92Var2 = k92Var;
                j73Var3 = j73Var2;
                z5 = z3;
                cn4Var2 = cn4Var;
            }
            u34VarP = h02Var.p();
            if (u34VarP != null) {
                u34VarP.n = new bz1() { // from class: o92
                    @Override // defpackage.bz1
                    public final Object l(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k33.w(my1Var, j73Var3, z5, k92Var2, cn4Var2, bz1Var, (h02) obj, aq2.J(i2 | 1), i3);
                        return og5.g;
                    }
                };
            }
        }
        i4 |= 384;
        z3 = z2;
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        i7 = i4 | 24576;
        if ((196608 & i2) == 0) {
            i7 = 90112 | i4;
        }
        if ((1572864 & i2) != 0) {
            if (h02Var.j(bz1Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i7 |= i9;
        }
        if ((599187 & i7) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (h02Var.N(i7 & 1, z4)) {
            h02Var.S();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if (i5 == 0) {
                }
                j2 = ((jj0) h02Var.a(mt0.g)).g;
                rj0Var = (rj0) h02Var.a(tj0.g);
                k92Var3 = rj0Var.h0;
                if (k92Var3 == null) {
                    long j111 = jj0.l;
                    k92Var3 = new k92(j111, j2, j111, jj0.y(0.38f, j2));
                    j3 = j2;
                    rj0Var.h0 = k92Var3;
                } else {
                    j3 = j2;
                }
                j4 = k92Var3.y;
                if (!tf5.g(j4, j3)) {
                    jY = jj0.y(0.38f, j3);
                    long j112 = k92Var3.g;
                    long j113 = k92Var3.r;
                    if (j3 != 16) {
                        j5 = j3;
                    } else {
                        j5 = j4;
                    }
                    if (jY == 16) {
                        jY = k92Var3.n;
                    }
                    k92Var3 = new k92(j112, j5, j113, jY);
                }
                i8 = i7 & (-465921);
                cn4VarY = vn4.y(a11.A, h02Var);
                j73Var5 = j73Var4;
                k92Var2 = k92Var3;
                z6 = z7;
            } else {
                if (i10 != 0) {
                    j73Var4 = g73.g;
                } else {
                    j73Var4 = j73Var2;
                }
                if (i5 == 0) {
                }
                j2 = ((jj0) h02Var.a(mt0.g)).g;
                rj0Var = (rj0) h02Var.a(tj0.g);
                k92Var3 = rj0Var.h0;
                if (k92Var3 == null) {
                    long j114 = jj0.l;
                    k92Var3 = new k92(j114, j2, j114, jj0.y(0.38f, j2));
                    j3 = j2;
                    rj0Var.h0 = k92Var3;
                } else {
                    j3 = j2;
                }
                j4 = k92Var3.y;
                if (!tf5.g(j4, j3)) {
                    jY = jj0.y(0.38f, j3);
                    long j115 = k92Var3.g;
                    long j116 = k92Var3.r;
                    if (j3 != 16) {
                        j5 = j3;
                    } else {
                        j5 = j4;
                    }
                    if (jY == 16) {
                        jY = k92Var3.n;
                    }
                    k92Var3 = new k92(j115, j5, j116, jY);
                }
                i8 = i7 & (-465921);
                cn4VarY = vn4.y(a11.A, h02Var);
                j73Var5 = j73Var4;
                k92Var2 = k92Var3;
                z6 = z7;
            }
            h02Var.s();
            int i14 = i8 << 3;
            c(j73Var5, my1Var, z6, cn4VarY, k92Var2, bz1Var, h02Var, ((i8 >> 3) & 14) | (i14 & 112) | (i8 & 896) | (i14 & 458752) | (i8 & 3670016));
            cn4Var2 = cn4VarY;
            z5 = z6;
            j73Var3 = j73Var5;
        } else {
            h02Var.Q();
            k92Var2 = k92Var;
            j73Var3 = j73Var2;
            z5 = z3;
            cn4Var2 = cn4Var;
        }
        u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: o92
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k33.w(my1Var, j73Var3, z5, k92Var2, cn4Var2, bz1Var, (h02) obj, aq2.J(i2 | 1), i3);
                    return og5.g;
                }
            };
        }
    }

    public static final ku0 x(fx0 fx0Var) {
        if (fx0Var.h(d52.m) == null) {
            fx0Var = fx0Var.b(v70.v());
        }
        return new ku0(fx0Var);
    }

    public static final void y(xy1 xy1Var, j73 j73Var, xy1 xy1Var2, h02 h02Var, int i2) {
        int i3;
        xy1 xy1Var3;
        h02Var.Z(-1783766393);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.j(xy1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.x(j73Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (h02Var.N(i4 & 1, (i4 & 147) != 146)) {
            l1 l1Var = g;
            xy1Var3 = l1Var;
            g(xy1Var, j73Var, null, l1Var, xy1Var3, h02Var, (i4 & 14) | 3072 | (i4 & 112) | ((i4 << 6) & 57344), 4);
        } else {
            h02Var.Q();
            xy1Var3 = xy1Var2;
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new hg((Object) xy1Var, j73Var, (jz1) xy1Var3, i2, (byte) 0);
        }
    }

    public static final void z(my1 my1Var, h02 h02Var) {
        em3 em3Var = h02Var.M.y.C;
        em3Var.N(ql3.r);
        xq2.H(em3Var, 0, my1Var);
    }
}
