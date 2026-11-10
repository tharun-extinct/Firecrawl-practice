package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.appground.blek.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ue5 {
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int o = 0;
    public static final float p = 24.0f;
    public static final /* synthetic */ int s = 0;
    public static final float u = 24.0f;
    public static ha2 z;
    public static final nm0 j = new nm0(641200809, false, new xm0(28));
    public static final vy t = new vy();
    public static final in4 a = in4.w;
    public static final nf5 m = nf5.q;
    public static final sj0 q = sj0.d;
    public static final float w = 3.0f;
    public static final in4 c = in4.a;
    public static final int[] i = {R.attr.colorPrimary};
    public static final int[] b = {R.attr.colorPrimaryVariant};

    public static final float A(zn3 zn3Var, fl2 fl2Var) {
        return fl2Var == fl2.j ? zn3Var.g(fl2Var) : zn3Var.y(fl2Var);
    }

    public static boolean B(ts0 ts0Var) {
        int[] iArr = ts0Var.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        us0 us0Var = ts0Var.T;
        if (us0Var == null) {
            us0Var = null;
        }
        if (us0Var != null) {
            int i4 = us0Var.p0[0];
        }
        if (us0Var != null) {
            int i5 = us0Var.p0[1];
        }
        boolean z2 = i2 == 1 || ts0Var.A() || i2 == 2 || (i2 == 3 && ts0Var.p == 0 && ts0Var.W == 0.0f && ts0Var.z(0)) || (i2 == 3 && ts0Var.p == 1 && ts0Var.h(0, ts0Var.s()));
        boolean z3 = i3 == 1 || ts0Var.B() || i3 == 2 || (i3 == 3 && ts0Var.u == 0 && ts0Var.W == 0.0f && ts0Var.z(1)) || (i3 == 3 && ts0Var.u == 1 && ts0Var.h(1, ts0Var.m()));
        return (ts0Var.W > 0.0f && (z2 || z3)) || (z2 && z3);
    }

    public static void C(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p24.L, i2, i3);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                F(context, b, "Theme.MaterialComponents");
            }
        }
        F(context, i, "Theme.AppCompat");
    }

    public static int D(Context context, String str) {
        if (str == null) {
            l0.q("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return ai3.y(context).g() ? 0 : -1;
    }

    public static void E(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p24.L, i2, i3);
        boolean z2 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            int length = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z2 = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i4], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i4++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z2 = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z2) {
            return;
        }
        l0.u("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void F(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                l0.u(du4.i("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final j73 G(j73 j73Var, ja3 ja3Var, hb2 hb2Var, boolean z2, o94 o94Var, my1 my1Var) {
        j73 j73VarN;
        if (hb2Var != null) {
            j73VarN = new sh0(ja3Var, hb2Var, false, z2, null, o94Var, my1Var);
        } else if (hb2Var == null) {
            j73VarN = new sh0(ja3Var, null, false, z2, null, o94Var, my1Var);
        } else {
            g73 g73Var = g73.g;
            j73VarN = ja3Var != null ? db2.g(g73Var, ja3Var, hb2Var).n(new sh0(ja3Var, null, false, z2, null, o94Var, my1Var)) : m50.F(g73Var, new uh0(hb2Var, z2, o94Var, my1Var));
        }
        return j73Var.n(j73VarN);
    }

    public static /* synthetic */ j73 H(j73 j73Var, ja3 ja3Var, m94 m94Var, boolean z2, o94 o94Var, my1 my1Var, int i2) {
        if ((i2 & 16) != 0) {
            o94Var = null;
        }
        return G(j73Var, ja3Var, m94Var, z2, o94Var, my1Var);
    }

    public static j73 I(j73 j73Var, boolean z2, String str, o94 o94Var, my1 my1Var, int i2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return j73Var.n(new sh0(null, null, true, z2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : o94Var, my1Var));
    }

    public static j73 J(j73 j73Var, ja3 ja3Var, my1 my1Var) {
        return j73Var.n(new kk0(my1Var, ja3Var));
    }

    public static ImageView.ScaleType K(int i2) {
        if (i2 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i2 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i2 != 5) {
            return i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static void L(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ll0 ll0Var = (ll0) obj;
            dz0 dz0Var = new dz0(ll0Var);
            for (e24 e24Var : ll0Var.y) {
                boolean z2 = ll0Var.v;
                ez0 ez0Var = new ez0(e24Var, z2);
                if (!map.containsKey(ez0Var)) {
                    map.put(ez0Var, new HashSet());
                }
                Set set = (Set) map.get(ez0Var);
                if (!set.isEmpty() && !z2) {
                    t94.r(e24Var, ".", "Multiple components provide ");
                    return;
                }
                set.add(dz0Var);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (dz0 dz0Var2 : (Set) it.next()) {
                for (p51 p51Var : dz0Var2.g.r) {
                    if (p51Var.r == 0) {
                        Set<dz0> set2 = (Set) map.get(new ez0(p51Var.g, p51Var.y == 2));
                        if (set2 != null) {
                            for (dz0 dz0Var3 : set2) {
                                dz0Var2.y.add(dz0Var3);
                                dz0Var3.r.add(dz0Var2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<dz0> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (dz0 dz0Var4 : hashSet) {
            if (dz0Var4.r.isEmpty()) {
                hashSet2.add(dz0Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            dz0 dz0Var5 = (dz0) hashSet2.iterator().next();
            hashSet2.remove(dz0Var5);
            i2++;
            for (dz0 dz0Var6 : dz0Var5.y) {
                dz0Var6.r.remove(dz0Var5);
                if (dz0Var6.r.isEmpty()) {
                    hashSet2.add(dz0Var6);
                }
            }
        }
        if (i2 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (dz0 dz0Var7 : hashSet) {
            if (!dz0Var7.r.isEmpty() && !dz0Var7.y.isEmpty()) {
                arrayList2.add(dz0Var7.g);
            }
        }
        throw new r51(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object M(er1 er1Var, ou0 ou0Var) {
        hs1 hs1Var;
        u54 u54Var;
        r e;
        c90 c90Var;
        ky2 ky2Var = a11.o;
        if (ou0Var instanceof hs1) {
            hs1Var = (hs1) ou0Var;
            int i2 = hs1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hs1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                hs1Var = new hs1(ou0Var);
            }
        } else {
            hs1Var = new hs1(ou0Var);
        }
        Object obj = hs1Var.w;
        int i3 = hs1Var.c;
        if (i3 == 0) {
            js2.o(obj);
            u54Var = new u54();
            u54Var.j = ky2Var;
            c90 c90Var2 = new c90((Object) u54Var, (byte) 4);
            try {
                hs1Var.m = u54Var;
                hs1Var.q = c90Var2;
                hs1Var.c = 1;
                Object objR = er1Var.r(c90Var2, hs1Var);
                Object obj2 = px0.j;
                if (objR == obj2) {
                    return obj2;
                }
            } catch (r e2) {
                e = e2;
                c90Var = c90Var2;
                if (e.j == c90Var) {
                    throw e;
                }
                fx0 fx0Var = hs1Var.t;
                fx0Var.getClass();
                v70.s(fx0Var);
            }
        } else {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c90Var = hs1Var.q;
            u54Var = hs1Var.m;
            try {
                js2.o(obj);
            } catch (r e3) {
                e = e3;
                if (e.j == c90Var) {
                    throw e;
                }
                fx0 fx0Var2 = hs1Var.t;
                fx0Var2.getClass();
                v70.s(fx0Var2);
            }
        }
        Object obj3 = u54Var.j;
        if (obj3 != ky2Var) {
            return obj3;
        }
        l0.s("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object N(er1 er1Var, bz1 bz1Var, ou0 ou0Var) {
        is1 is1Var;
        u54 u54Var;
        r e;
        cr0 cr0Var;
        ky2 ky2Var = a11.o;
        if (ou0Var instanceof is1) {
            is1Var = (is1) ou0Var;
            int i2 = is1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                is1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                is1Var = new is1(ou0Var);
            }
        } else {
            is1Var = new is1(ou0Var);
        }
        Object obj = is1Var.w;
        int i3 = is1Var.c;
        byte b2 = 1;
        if (i3 == 0) {
            js2.o(obj);
            u54 u54Var2 = new u54();
            u54Var2.j = ky2Var;
            cr0 cr0Var2 = new cr0(bz1Var, u54Var2, b2);
            try {
                is1Var.m = u54Var2;
                is1Var.q = cr0Var2;
                is1Var.c = 1;
                Object objR = er1Var.r(cr0Var2, is1Var);
                Object obj2 = px0.j;
                if (objR == obj2) {
                    return obj2;
                }
                u54Var = u54Var2;
            } catch (r e2) {
                u54Var = u54Var2;
                e = e2;
                cr0Var = cr0Var2;
                if (e.j == cr0Var) {
                    throw e;
                }
                fx0 fx0Var = is1Var.t;
                fx0Var.getClass();
                v70.s(fx0Var);
            }
        } else {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cr0Var = is1Var.q;
            u54Var = is1Var.m;
            try {
                js2.o(obj);
            } catch (r e3) {
                e = e3;
                if (e.j == cr0Var) {
                    throw e;
                }
                fx0 fx0Var2 = is1Var.t;
                fx0Var2.getClass();
                v70.s(fx0Var2);
            }
        }
        Object obj3 = u54Var.j;
        if (obj3 != ky2Var) {
            return obj3;
        }
        l0.s("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object O(er1 er1Var, vg0 vg0Var, ou0 ou0Var) {
        ls1 ls1Var;
        u54 u54Var;
        r e;
        kr0 kr0Var;
        if (ou0Var instanceof ls1) {
            ls1Var = (ls1) ou0Var;
            int i2 = ls1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ls1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                ls1Var = new ls1(ou0Var);
            }
        } else {
            ls1Var = new ls1(ou0Var);
        }
        Object obj = ls1Var.w;
        int i3 = ls1Var.c;
        if (i3 == 0) {
            js2.o(obj);
            u54 u54Var2 = new u54();
            kr0 kr0Var2 = new kr0(vg0Var, u54Var2, (byte) 5);
            try {
                ls1Var.m = u54Var2;
                ls1Var.q = kr0Var2;
                ls1Var.c = 1;
                Object objR = er1Var.r(kr0Var2, ls1Var);
                Object obj2 = px0.j;
                if (objR == obj2) {
                    return obj2;
                }
                u54Var = u54Var2;
            } catch (r e2) {
                u54Var = u54Var2;
                e = e2;
                kr0Var = kr0Var2;
                if (e.j == kr0Var) {
                    throw e;
                }
                fx0 fx0Var = ls1Var.t;
                fx0Var.getClass();
                v70.s(fx0Var);
            }
        } else {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kr0Var = ls1Var.q;
            u54Var = ls1Var.m;
            try {
                js2.o(obj);
            } catch (r e3) {
                e = e3;
                if (e.j == kr0Var) {
                    throw e;
                }
                fx0 fx0Var2 = ls1Var.t;
                fx0Var2.getClass();
                v70.s(fx0Var2);
            }
        }
        return u54Var.j;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object P(er1 er1Var, ou0 ou0Var) {
        ks1 ks1Var;
        u54 u54Var;
        r e;
        rc rcVar;
        if (ou0Var instanceof ks1) {
            ks1Var = (ks1) ou0Var;
            int i2 = ks1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ks1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                ks1Var = new ks1(ou0Var);
            }
        } else {
            ks1Var = new ks1(ou0Var);
        }
        Object obj = ks1Var.w;
        int i3 = ks1Var.c;
        if (i3 == 0) {
            js2.o(obj);
            u54Var = new u54();
            rc rcVar2 = new rc(u54Var, (byte) 6);
            try {
                ks1Var.m = u54Var;
                ks1Var.q = rcVar2;
                ks1Var.c = 1;
                Object objR = er1Var.r(rcVar2, ks1Var);
                Object obj2 = px0.j;
                if (objR == obj2) {
                    return obj2;
                }
            } catch (r e2) {
                e = e2;
                rcVar = rcVar2;
                if (e.j == rcVar) {
                    throw e;
                }
                fx0 fx0Var = ks1Var.t;
                fx0Var.getClass();
                v70.s(fx0Var);
            }
        } else {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rcVar = ks1Var.q;
            u54Var = ks1Var.m;
            try {
                js2.o(obj);
            } catch (r e3) {
                e = e3;
                if (e.j == rcVar) {
                    throw e;
                }
                fx0 fx0Var2 = ks1Var.t;
                fx0Var2.getClass();
                v70.s(fx0Var2);
            }
        }
        return u54Var.j;
    }

    public static Application Q(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        uo1.j(context, "Could not find an Application in the given context: ");
        return null;
    }

    public static ColorStateList R(Context context, int i2) {
        ColorStateList colorStateListG;
        ColorStateList colorStateList;
        u74 u74Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        v74 v74Var = new v74(resources, theme);
        synchronized (x74.r) {
            try {
                SparseArray sparseArray = (SparseArray) x74.y.get(v74Var);
                colorStateListG = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (u74Var = (u74) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (u74Var.y.equals(resources.getConfiguration())) {
                        if (theme != null || u74Var.r != 0) {
                            if (theme == null || u74Var.r != theme.hashCode()) {
                            }
                        }
                        colorStateList = u74Var.g;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = x74.g;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListG = xj0.g(resources, resources.getXml(i2), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListG == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (x74.r) {
            try {
                WeakHashMap weakHashMap = x74.y;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(v74Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(v74Var, sparseArray2);
                }
                sparseArray2.append(i2, new u74(colorStateListG, v74Var.g.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListG;
    }

    public static final Object S(p33 p33Var) {
        Object objA = p33Var.a();
        cm2 cm2Var = objA instanceof cm2 ? (cm2) objA : null;
        if (cm2Var != null) {
            return cm2Var.o;
        }
        return null;
    }

    public static final Paint T(cd cdVar) {
        if (cdVar == null) {
            lc2.g("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + v54.g(cdVar.getClass()).y());
        }
        return (Paint) cdVar.y;
    }

    public static void U(int i2, gs0 gs0Var, ts0 ts0Var, boolean z2) {
        as0 as0Var;
        as0 as0Var2;
        boolean z3;
        as0 as0Var3;
        as0 as0Var4;
        if (ts0Var.w) {
            return;
        }
        if (!(ts0Var instanceof us0) && ts0Var.e() && B(ts0Var)) {
            us0.V(ts0Var, gs0Var, new vy());
        }
        as0 as0VarT = ts0Var.t(2);
        as0 as0VarT2 = ts0Var.t(4);
        int iN = as0VarT.n();
        int iN2 = as0VarT2.n();
        HashSet<as0> hashSet = as0VarT.g;
        if (hashSet != null && as0VarT.r) {
            for (as0 as0Var5 : hashSet) {
                ts0 ts0Var2 = as0Var5.n;
                int i3 = i2 + 1;
                boolean zB = B(ts0Var2);
                as0 as0Var6 = ts0Var2.I;
                as0 as0Var7 = ts0Var2.K;
                if (ts0Var2.e() && zB) {
                    z3 = true;
                    us0.V(ts0Var2, gs0Var, new vy());
                } else {
                    z3 = true;
                }
                boolean z4 = ((as0Var5 == as0Var6 && (as0Var4 = as0Var7.x) != null && as0Var4.r) || (as0Var5 == as0Var7 && (as0Var3 = as0Var6.x) != null && as0Var3.r)) ? z3 : false;
                int i4 = ts0Var2.p0[0];
                if (i4 != 3 || zB) {
                    if (!ts0Var2.e()) {
                        if (as0Var5 == as0Var6 && as0Var7.x == null) {
                            int iV = as0Var6.v() + iN;
                            ts0Var2.J(iV, ts0Var2.s() + iV);
                            U(i3, gs0Var, ts0Var2, z2);
                        } else if (as0Var5 == as0Var7 && as0Var6.x == null) {
                            int iV2 = iN - as0Var7.v();
                            ts0Var2.J(iV2 - ts0Var2.s(), iV2);
                            U(i3, gs0Var, ts0Var2, z2);
                        } else if (z4 && !ts0Var2.k()) {
                            p0(i3, gs0Var, ts0Var2, z2);
                        }
                    }
                } else if (i4 == 3 && ts0Var2.o >= 0 && ts0Var2.h >= 0 && (ts0Var2.g0 == 8 || (ts0Var2.p == 0 && ts0Var2.W == 0.0f))) {
                    if (!ts0Var2.k() && !ts0Var2.F && z4 && !ts0Var2.k()) {
                        q0(i3, ts0Var, gs0Var, ts0Var2, z2);
                    }
                }
            }
        }
        if (ts0Var instanceof m42) {
            return;
        }
        HashSet<as0> hashSet2 = as0VarT2.g;
        if (hashSet2 != null && as0VarT2.r) {
            for (as0 as0Var8 : hashSet2) {
                ts0 ts0Var3 = as0Var8.n;
                int i5 = i2 + 1;
                boolean zB2 = B(ts0Var3);
                as0 as0Var9 = ts0Var3.I;
                as0 as0Var10 = ts0Var3.K;
                if (ts0Var3.e() && zB2) {
                    us0.V(ts0Var3, gs0Var, new vy());
                }
                boolean z5 = (as0Var8 == as0Var9 && (as0Var2 = as0Var10.x) != null && as0Var2.r) || (as0Var8 == as0Var10 && (as0Var = as0Var9.x) != null && as0Var.r);
                int i6 = ts0Var3.p0[0];
                if (i6 != 3 || zB2) {
                    if (!ts0Var3.e()) {
                        if (as0Var8 == as0Var9 && as0Var10.x == null) {
                            int iV3 = as0Var9.v() + iN2;
                            ts0Var3.J(iV3, ts0Var3.s() + iV3);
                            U(i5, gs0Var, ts0Var3, z2);
                        } else if (as0Var8 == as0Var10 && as0Var9.x == null) {
                            int iV4 = iN2 - as0Var10.v();
                            ts0Var3.J(iV4 - ts0Var3.s(), iV4);
                            U(i5, gs0Var, ts0Var3, z2);
                        } else if (z5 && !ts0Var3.k()) {
                            p0(i5, gs0Var, ts0Var3, z2);
                        }
                    }
                } else if (i6 == 3 && ts0Var3.o >= 0 && ts0Var3.h >= 0) {
                    if (ts0Var3.g0 == 8 || (ts0Var3.p == 0 && ts0Var3.W == 0.0f)) {
                        if (!ts0Var3.k() && !ts0Var3.F && z5 && !ts0Var3.k()) {
                            q0(i5, ts0Var, gs0Var, ts0Var3, z2);
                        }
                    }
                }
            }
        }
        ts0Var.w = true;
    }

    public static final boolean V(KeyEvent keyEvent) {
        long jR = mx5.r(keyEvent);
        int i2 = fi2.Q;
        return fi2.g(jR, dt5.n()) || fi2.g(jR, dt5.t()) || fi2.g(jR, dt5.w()) || fi2.g(jR, dt5.b());
    }

    public static boolean W(int i2, Object obj) {
        int iR;
        if (obj instanceof jz1) {
            if (obj instanceof lz1) {
                iR = ((lz1) obj).r();
            } else if (obj instanceof my1) {
                iR = 0;
            } else if (obj instanceof xy1) {
                iR = 1;
            } else if (obj instanceof bz1) {
                iR = 2;
            } else if (obj instanceof cz1) {
                iR = 3;
            } else if (obj instanceof dz1) {
                iR = 4;
            } else if (obj instanceof ez1) {
                iR = 5;
            } else if (obj instanceof fz1) {
                iR = 6;
            } else if (obj instanceof gz1) {
                iR = 7;
            } else if (obj instanceof hz1) {
                iR = 8;
            } else if (obj instanceof iz1) {
                iR = 9;
            } else if (obj instanceof ny1) {
                iR = 10;
            } else if (obj instanceof oy1) {
                iR = 11;
            } else if (obj instanceof qy1) {
                iR = 13;
            } else if (obj instanceof ry1) {
                iR = 14;
            } else if (obj instanceof sy1) {
                iR = 15;
            } else if (obj instanceof ty1) {
                iR = 16;
            } else if (obj instanceof uy1) {
                iR = 17;
            } else if (obj instanceof vy1) {
                iR = 18;
            } else if (obj instanceof wy1) {
                iR = 19;
            } else if (obj instanceof yy1) {
                iR = 20;
            } else {
                iR = obj instanceof zy1 ? 21 : -1;
            }
            if (iR == i2) {
                return true;
            }
        }
        return false;
    }

    public static final j73 X(j73 j73Var, Object obj) {
        return j73Var.n(new bm2(obj));
    }

    public static TypedArray Y(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        C(context, attributeSet, i2, i3);
        E(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static bo3 b(int i2, float f) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        float f2 = (i2 & 2) == 0 ? 8.0f : 0.0f;
        return new bo3(f, f2, f, f2);
    }

    public static final void c(final qr0 qr0Var, xy1 xy1Var, final my1 my1Var, h02 h02Var, int i2) {
        ArrayList arrayList;
        Object obj;
        qr0Var.getClass();
        xy1Var.getClass();
        my1Var.getClass();
        h02Var.Z(873845762);
        byte b2 = 2;
        int i3 = i2 | (h02Var.j(qr0Var) ? 4 : 2) | (h02Var.j(xy1Var) ? 32 : 16) | (h02Var.j(my1Var) ? 256 : 128);
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            final ob3 ob3VarJ = v13.j(qr0Var.t, h02Var);
            final ob3 ob3VarJ2 = v13.j(qr0Var.m, h02Var);
            mu0 mu0Var = null;
            ob3 ob3VarL = v13.l(qr0Var.q, null, h02Var, 48, 2);
            boolean zX = h02Var.x((List) ob3VarL.getValue()) | h02Var.x((g61) ob3VarJ2.getValue());
            Object objK = h02Var.K();
            Object obj2 = oo0.g;
            if (zX || objK == obj2) {
                obj = objK;
                List list = (List) ob3VarL.getValue();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        g61 g61Var = (g61) obj3;
                        if (g61Var.i) {
                            String str = g61Var.t;
                            g61 g61Var2 = (g61) ob3VarJ2.getValue();
                            if (!yf2.p(str, g61Var2 != null ? g61Var2.t : null)) {
                                arrayList.add(obj3);
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                h02Var.i0(arrayList);
                obj = arrayList;
            }
            final List list2 = (List) obj;
            Object objQ = kq2.Q(xy1Var, h02Var);
            if (((List) ob3VarL.getValue()) == null || !((list2 == null || list2.isEmpty()) && ((g61) ob3VarJ2.getValue()) == null)) {
                h02Var.X(943080512);
                h02Var.b(false);
            } else {
                h02Var.X(942994022);
                Boolean bool = Boolean.TRUE;
                boolean zX2 = h02Var.x(objQ);
                Object objK2 = h02Var.K();
                if (zX2 || objK2 == obj2) {
                    objK2 = new o40(objQ, mu0Var, b2);
                    h02Var.i0(objK2);
                }
                k33.b((bz1) objK2, h02Var, bool);
                h02Var.b(false);
            }
            kq2.v(null, null, null, null, m0(-1791761765, new f(xy1Var, (byte) 14), h02Var), 1, 0L, 0L, new op1(0), m0(29156051, new cz1() { // from class: v61
                @Override // defpackage.cz1
                public final Object x(Object obj4, Object obj5, Object obj6) {
                    zn3 zn3Var = (zn3) obj4;
                    h02 h02Var2 = (h02) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    zn3Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= h02Var2.x(zn3Var) ? 4 : 2;
                    }
                    if (h02Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        uz4.g(ue5.d0(g73.g, zn3Var).n(mq4.r), null, 0L, 0L, 0.0f, 0.0f, null, ue5.m0(1359474030, new fo(qr0Var, my1Var, ob3VarJ2, ob3VarJ, list2), h02Var2), h02Var2, 12582912, 126);
                    } else {
                        h02Var2.Q();
                    }
                    return og5.g;
                }
            }, h02Var), h02Var, 805330944, 207);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new m61(qr0Var, xy1Var, my1Var, i2, (byte) 2);
        }
    }

    public static final int d(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final j73 d0(j73 j73Var, zn3 zn3Var) {
        return j73Var.n(new ao3(zn3Var));
    }

    public static final float e(zn3 zn3Var, fl2 fl2Var) {
        return fl2Var == fl2.j ? zn3Var.y(fl2Var) : zn3Var.g(fl2Var);
    }

    public static final j73 e0(j73 j73Var, float f) {
        return j73Var.n(new wn3(f, f, f, f));
    }

    public static void f(int i2, Object obj) {
        if (obj == null || W(i2, obj)) {
            return;
        }
        t0(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static final j73 f0(j73 j73Var, float f, float f2) {
        return j73Var.n(new wn3(f, f2, f, f2));
    }

    public static j73 g0(j73 j73Var, float f, float f2, int i2) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return f0(j73Var, f, f2);
    }

    public static void h(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final j73 h0(j73 j73Var, float f, float f2, float f3, float f4) {
        return j73Var.n(new wn3(f, f2, f3, f4));
    }

    public static final void i(int i2, h02 h02Var) {
        h02 h02Var2;
        h02Var.Z(-399374486);
        byte b2 = 1;
        if (h02Var.N(i2 & 1, i2 != 0)) {
            h02Var2 = h02Var;
            fb6.r(g0(mq4.r(g73.g, 1.0f), 8.0f, 0.0f, 2), null, null, null, null, og0.w, h02Var2, 196614, 30);
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new vq0(i2, b2);
        }
    }

    public static j73 i0(j73 j73Var, float f, float f2, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f4 = 0.0f;
        }
        return h0(j73Var, f, f2, f3, f4);
    }

    public static byte[] j0(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i2 = (int) length;
            byte[] bArrCopyOf = new byte[i2];
            int i3 = i2;
            int i4 = 0;
            while (i3 > 0) {
                int i5 = fileInputStream.read(bArrCopyOf, i4, i3);
                if (i5 < 0) {
                    break;
                }
                i3 -= i5;
                i4 += i5;
            }
            if (i3 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4);
            } else {
                int i6 = fileInputStream.read();
                if (i6 != -1) {
                    tm1 tm1Var = new tm1();
                    tm1Var.write(i6);
                    ai5.g(fileInputStream, tm1Var);
                    int size = tm1Var.size() + i2;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrY = tm1Var.y();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    pr.L(i2, 0, tm1Var.size(), bArrY, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                gp4.C(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final int k(int i2, rb3 rb3Var) {
        int i3 = rb3Var.a - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            Object[] objArr = rb3Var.j;
            int i6 = ((of2) objArr[i5]).g;
            if (i6 != i2) {
                if (i6 < i2) {
                    i4 = i5 + 1;
                    if (i2 < ((of2) objArr[i4]).g) {
                    }
                } else {
                    i3 = i5 - 1;
                }
            }
            return i5;
        }
        return i4;
    }

    public static void k0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final void l(g61 g61Var, j73 j73Var, my1 my1Var, my1 my1Var2, my1 my1Var3, my1 my1Var4, h02 h02Var, int i2) {
        v81 v81Var;
        h02Var.Z(512642022);
        int i3 = i2 | (h02Var.j(g61Var) ? 4 : 2) | (h02Var.x(j73Var) ? 32 : 16) | (h02Var.j(my1Var) ? 256 : 128) | (h02Var.j(my1Var2) ? 2048 : 1024) | (h02Var.j(my1Var3) ? 16384 : 8192) | (h02Var.j(my1Var4) ? 131072 : 65536);
        if (h02Var.N(i3 & 1, (74899 & i3) != 74898)) {
            boolean zN = h02Var.n(g61Var.c);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zN || objK == l76Var) {
                objK = ra.e(g61Var);
                h02Var.i0(objK);
            }
            v81 v81Var2 = (v81) objK;
            String str = g61Var.t;
            str.getClass();
            v81Var2.getClass();
            boolean zX = h02Var.x(str);
            Object objK2 = h02Var.K();
            if (zX || objK2 == l76Var) {
                objK2 = kq2.M(v81Var2);
                h02Var.i0(objK2);
            }
            ob3 ob3Var = (ob3) objK2;
            boolean zX2 = h02Var.x(str);
            Object objK3 = h02Var.K();
            if (zX2 || objK3 == l76Var) {
                objK3 = new qp3(0);
                h02Var.i0(objK3);
            }
            qp3 qp3Var = (qp3) objK3;
            boolean zX3 = h02Var.x(ob3Var) | h02Var.j(v81Var2) | h02Var.x(qp3Var);
            Object objK4 = h02Var.K();
            if (zX3 || objK4 == l76Var) {
                v81Var = v81Var2;
                objK4 = new dp((Object) v81Var, (Object) ob3Var, (Object) qp3Var, (mu0) null, (byte) 2);
                h02Var.i0(objK4);
            } else {
                v81Var = v81Var2;
            }
            fb6.g(mq4.r(e0(j73Var, 8.0f), 1.0f), null, null, null, null, m0(-372134348, new w61(v81Var, g61Var, my1Var4, aq2.A(null, str, v81Var, (bz1) objK4, h02Var, 518), my1Var2, my1Var, my1Var3), h02Var), h02Var, 196608, 30);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new x61(g61Var, j73Var, my1Var, my1Var2, my1Var3, my1Var4, i2);
        }
    }

    public static Intent l0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return rj.n(context, broadcastReceiver, intentFilter);
        }
        return i2 >= 26 ? tm.t(context, broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, null, null);
    }

    public static final void m(final g61 g61Var, final List list, final boolean z2, final xy1 xy1Var, final xy1 xy1Var2, final xy1 xy1Var3, final xy1 xy1Var4, final my1 my1Var, final xy1 xy1Var5, h02 h02Var, final int i2) {
        int i3;
        boolean z3;
        final xy1 xy1Var6;
        xy1 xy1Var7;
        h02Var.Z(465330289);
        if ((i2 & 6) == 0) {
            i3 = (h02Var.j(g61Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.x(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z3 = z2;
            i3 |= h02Var.l(z3) ? 256 : 128;
        } else {
            z3 = z2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= h02Var.j(xy1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            xy1Var6 = xy1Var2;
            i3 |= h02Var.j(xy1Var6) ? 16384 : 8192;
        } else {
            xy1Var6 = xy1Var2;
        }
        if ((196608 & i2) == 0) {
            xy1Var7 = xy1Var3;
            i3 |= h02Var.j(xy1Var7) ? 131072 : 65536;
        } else {
            xy1Var7 = xy1Var3;
        }
        if ((1572864 & i2) == 0) {
            i3 |= h02Var.j(xy1Var4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= h02Var.j(my1Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= h02Var.j(xy1Var5) ? 67108864 : 33554432;
        }
        byte b2 = 0;
        if (h02Var.N(i3 & 1, (i3 & 38347923) != 38347922)) {
            final ss2 ss2VarG = us2.g(h02Var);
            Object objK = h02Var.K();
            Object obj = oo0.g;
            if (objK == obj) {
                objK = pt4.y(new p61(ss2VarG, b2));
                h02Var.i0(objK);
            }
            final bw4 bw4Var = (bw4) objK;
            Object objK2 = h02Var.K();
            if (objK2 == obj) {
                objK2 = k33.E(h02Var);
                h02Var.i0(objK2);
            }
            final ox0 ox0Var = (ox0) objK2;
            bo3 bo3VarS = s(0.0f, 0.0f, 0.0f, 80.0f, 7);
            boolean zJ = ((i3 & 896) == 256) | ((234881024 & i3) == 67108864) | h02Var.j(g61Var) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((29360128 & i3) == 8388608) | ((3670016 & i3) == 1048576) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | h02Var.j(ox0Var) | h02Var.x(ss2VarG);
            Object objK3 = h02Var.K();
            if (zJ || objK3 == obj) {
                final boolean z4 = z3;
                final xy1 xy1Var8 = xy1Var7;
                Object obj2 = new xy1() { // from class: q61
                    @Override // defpackage.xy1
                    public final Object a(Object obj3) {
                        es2 es2Var = (es2) obj3;
                        es2Var.getClass();
                        byte b3 = 3;
                        if (z4) {
                            es2.G(es2Var, null, new nm0(47833409, true, new s61(xy1Var5, (byte) 0)), 3);
                        }
                        g61 g61Var2 = g61Var;
                        bw4 bw4Var2 = bw4Var;
                        xy1 xy1Var9 = xy1Var4;
                        if (g61Var2 != null) {
                            if (Build.VERSION.SDK_INT >= 33 && g61Var2.l()) {
                                es2.G(es2Var, "notification", og0.x, 2);
                            }
                            final boolean zBooleanValue = ((Boolean) bw4Var2.getValue()).booleanValue();
                            final int i4 = R.string.device_list_section_active_device;
                            es2Var.I("active_device", "header", new nm0(-1110308588, true, new dz1() { // from class: u61
                                @Override // defpackage.dz1
                                public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                                    ((Integer) obj5).getClass();
                                    h02 h02Var2 = (h02) obj6;
                                    int iIntValue = ((Integer) obj7).intValue();
                                    ((bq2) obj4).getClass();
                                    if (h02Var2.N(iIntValue & 1, (iIntValue & 129) != 128)) {
                                        Object objK4 = h02Var2.K();
                                        l76 l76Var = oo0.g;
                                        if (objK4 == l76Var) {
                                            objK4 = kq2.M(Boolean.FALSE);
                                            h02Var2.i0(objK4);
                                        }
                                        ob3 ob3Var = (ob3) objK4;
                                        bw4 bw4VarG = ug.g((zBooleanValue && ((Boolean) ob3Var.getValue()).booleanValue()) ? 4.0f : 0.0f, null, h02Var2, 14);
                                        Object objK5 = h02Var2.K();
                                        if (objK5 == l76Var) {
                                            objK5 = new ff(ob3Var, (byte) 8);
                                            h02Var2.i0(objK5);
                                        }
                                        uz4.g(mq4.r(k33.N(g73.g, (xy1) objK5), 1.0f), null, 0L, 0L, 0.0f, ((vb1) bw4VarG.getValue()).j, null, ue5.m0(-647456465, new xy0(i4), h02Var2), h02Var2, 12582918, 94);
                                    } else {
                                        h02Var2.Q();
                                    }
                                    return og5.g;
                                }
                            }));
                            es2.G(es2Var, g61Var2.t, new nm0(232277610, true, new v80((Object) g61Var2, (Object) xy1Var6, (Object) xy1Var8, (Object) my1Var, (Object) xy1Var9, (byte) 1)), 2);
                        }
                        List list2 = list;
                        if (!list2.isEmpty()) {
                            final boolean zBooleanValue2 = ((Boolean) bw4Var2.getValue()).booleanValue();
                            final int i5 = R.string.device_list_section_configured_devices;
                            es2Var.I("configured_devices", "header", new nm0(-1110308588, true, new dz1() { // from class: u61
                                @Override // defpackage.dz1
                                public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                                    ((Integer) obj5).getClass();
                                    h02 h02Var2 = (h02) obj6;
                                    int iIntValue = ((Integer) obj7).intValue();
                                    ((bq2) obj4).getClass();
                                    if (h02Var2.N(iIntValue & 1, (iIntValue & 129) != 128)) {
                                        Object objK4 = h02Var2.K();
                                        l76 l76Var = oo0.g;
                                        if (objK4 == l76Var) {
                                            objK4 = kq2.M(Boolean.FALSE);
                                            h02Var2.i0(objK4);
                                        }
                                        ob3 ob3Var = (ob3) objK4;
                                        bw4 bw4VarG = ug.g((zBooleanValue2 && ((Boolean) ob3Var.getValue()).booleanValue()) ? 4.0f : 0.0f, null, h02Var2, 14);
                                        Object objK5 = h02Var2.K();
                                        if (objK5 == l76Var) {
                                            objK5 = new ff(ob3Var, (byte) 8);
                                            h02Var2.i0(objK5);
                                        }
                                        uz4.g(mq4.r(k33.N(g73.g, (xy1) objK5), 1.0f), null, 0L, 0L, 0.0f, ((vb1) bw4VarG.getValue()).j, null, ue5.m0(-647456465, new xy0(i5), h02Var2), h02Var2, 12582918, 94);
                                    } else {
                                        h02Var2.Q();
                                    }
                                    return og5.g;
                                }
                            }));
                            es2Var.H(list2.size(), new sd(new wm0((byte) 19), list2, b3), new wk0(list2, (byte) 1), new nm0(802480018, true, new c71(list2, xy1Var, ox0Var, ss2VarG, xy1Var9)));
                        }
                        return og5.g;
                    }
                };
                h02Var.i0(obj2);
                objK3 = obj2;
            }
            aq2.g(null, ss2VarG, bo3VarS, null, null, null, false, null, (xy1) objK3, h02Var, 384, 505);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: r61
                @Override // defpackage.bz1
                public final Object l(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    ue5.m(g61Var, list, z2, xy1Var, xy1Var2, xy1Var3, xy1Var4, my1Var, xy1Var5, (h02) obj3, aq2.J(i2 | 1));
                    return og5.g;
                }
            };
        }
    }

    public static final nm0 m0(int i2, jz1 jz1Var, h02 h02Var) {
        Object objK = h02Var.K();
        if (objK == oo0.g) {
            objK = new nm0(i2, true, jz1Var);
            h02Var.i0(objK);
        }
        nm0 nm0Var = (nm0) objK;
        if (!yf2.p(nm0Var.a, jz1Var)) {
            boolean z2 = nm0Var.a == null;
            nm0Var.a = jz1Var;
            if (!z2 && nm0Var.t) {
                u34 u34Var = nm0Var.m;
                if (u34Var != null) {
                    yo0 yo0Var = u34Var.g;
                    if (yo0Var != null) {
                        yo0Var.u(u34Var, null);
                    }
                    nm0Var.m = null;
                }
                ArrayList arrayList = nm0Var.q;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        u34 u34Var2 = (u34) arrayList.get(i3);
                        yo0 yo0Var2 = u34Var2.g;
                        if (yo0Var2 != null) {
                            yo0Var2.u(u34Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return nm0Var;
    }

    public static final void n(final o22 o22Var, t6 t6Var, final nm0 nm0Var, h02 h02Var, final int i2, final int i3) {
        int i4;
        h02Var.Z(227045628);
        if ((i2 & 6) == 0) {
            i4 = (h02Var.x(o22Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= h02Var.x(t6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= h02Var.j(nm0Var) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && h02Var.e()) {
            h02Var.Q();
        } else {
            if (i5 != 0) {
                t6Var = t6.r;
            }
            h02Var.Y(1849434622);
            Object objK = h02Var.K();
            if (objK == oo0.g) {
                objK = x50.i;
                h02Var.i0(objK);
            }
            h02Var.b(false);
            my1 my1Var = (my1) ((nz1) objK);
            h02Var.Y(-683746039);
            int i6 = (((i4 & 896) | 6) & 896) | 6;
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
            xs2.E(new gg((byte) 11), h02Var, o22Var);
            xs2.E(new gg((byte) 12), h02Var, t6Var);
            nm0Var.l(h02Var, Integer.valueOf((i6 >> 6) & 14));
            h02Var.b(true);
            h02Var.b(false);
            h02Var.b(false);
        }
        final t6 t6Var2 = t6Var;
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: w50
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ue5.n(o22Var, t6Var2, nm0Var, (h02) obj, aq2.J(i2 | 1), i3);
                    return og5.g;
                }
            };
        }
    }

    public static final j73 n0(j73 j73Var, gg4 gg4Var, um3 um3Var, tb tbVar, boolean z2, bq1 bq1Var, ja3 ja3Var, s60 s60Var) {
        um3 um3Var2 = um3.j;
        g73 g73Var = g73.g;
        return j73Var.n(um3Var == um3Var2 ? y94.h(g73Var, k72.r) : y94.h(g73Var, k72.y)).n(new sf4(tbVar, s60Var, bq1Var, ja3Var, um3Var, gg4Var, z2, false));
    }

    public static Map o(Object obj) {
        if ((obj instanceof vh2) && !(obj instanceof yh2)) {
            t0(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            yf2.X(e, ue5.class.getName());
            throw e;
        }
    }

    public static void o0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = zHasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        if (Build.VERSION.SDK_INT >= 26 || !z3 || z2) {
            checkableImageButton.setLongClickable(z2);
        }
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static final cd p() {
        return new cd(new Paint(7));
    }

    public static void p0(int i2, gs0 gs0Var, ts0 ts0Var, boolean z2) {
        float f = ts0Var.d0;
        as0 as0Var = ts0Var.I;
        int iN = as0Var.x.n();
        as0 as0Var2 = ts0Var.K;
        int iN2 = as0Var2.x.n();
        int iV = as0Var.v() + iN;
        int iV2 = iN2 - as0Var2.v();
        if (iN == iN2) {
            f = 0.5f;
        } else {
            iN = iV;
            iN2 = iV2;
        }
        int iS = ts0Var.s();
        int i3 = (iN2 - iN) - iS;
        if (iN > iN2) {
            i3 = (iN - iN2) - iS;
        }
        int i4 = ((int) (i3 > 0 ? (f * i3) + 0.5f : f * i3)) + iN;
        int i5 = i4 + iS;
        if (iN > iN2) {
            i5 = i4 - iS;
        }
        ts0Var.J(i4, i5);
        U(i2 + 1, gs0Var, ts0Var, z2);
    }

    public static final void q(g61 g61Var, my1 my1Var, my1 my1Var2, j73 j73Var, h02 h02Var, int i2) {
        h02Var.Z(-2127451812);
        byte b2 = 2;
        byte b3 = 4;
        int i3 = i2 | (h02Var.j(g61Var) ? 4 : 2) | (h02Var.j(my1Var) ? 32 : 16) | (h02Var.j(my1Var2) ? 256 : 128) | (h02Var.x(j73Var) ? 2048 : 1024);
        byte b4 = 1;
        if (h02Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zN = h02Var.n(g61Var.c);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zN || objK == l76Var) {
                objK = ra.e(g61Var);
                h02Var.i0(objK);
            }
            v81 v81Var = (v81) objK;
            boolean z2 = (i3 & 112) == 32;
            Object objK2 = h02Var.K();
            if (z2 || objK2 == l76Var) {
                objK2 = new ss(my1Var, b2);
                h02Var.i0(objK2);
            }
            lr2.r(m0(-2141619522, new ht(g61Var, b4), h02Var), I(j73Var, false, null, null, (my1) objK2, 15), null, m0(632697179, new ed(v81Var, (byte) 6), h02Var), null, m0(1050585881, new ys(my1Var2, b3), h02Var), null, 0.0f, h02Var, 199686, 468);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new zy(g61Var, my1Var, my1Var2, j73Var, i2);
        }
    }

    public static void q0(int i2, ts0 ts0Var, gs0 gs0Var, ts0 ts0Var2, boolean z2) {
        float f = ts0Var2.d0;
        as0 as0Var = ts0Var2.I;
        int iV = as0Var.v() + as0Var.x.n();
        as0 as0Var2 = ts0Var2.K;
        int iN = as0Var2.x.n() - as0Var2.v();
        if (iN >= iV) {
            int iS = ts0Var2.s();
            if (ts0Var2.g0 != 8) {
                int i3 = ts0Var2.p;
                if (i3 == 2) {
                    iS = (int) (ts0Var2.d0 * 0.5f * (ts0Var instanceof us0 ? ts0Var.s() : ts0Var.T.s()));
                } else if (i3 == 0) {
                    iS = iN - iV;
                }
                iS = Math.max(ts0Var2.h, iS);
                int i4 = ts0Var2.o;
                if (i4 > 0) {
                    iS = Math.min(i4, iS);
                }
            }
            int i5 = iV + ((int) ((f * ((iN - iV) - iS)) + 0.5f));
            ts0Var2.J(i5, iS + i5);
            U(i2 + 1, gs0Var, ts0Var2, z2);
        }
    }

    public static void r0(int i2, gs0 gs0Var, ts0 ts0Var) {
        float f = ts0Var.e0;
        as0 as0Var = ts0Var.J;
        int iN = as0Var.x.n();
        as0 as0Var2 = ts0Var.L;
        int iN2 = as0Var2.x.n();
        int iV = as0Var.v() + iN;
        int iV2 = iN2 - as0Var2.v();
        if (iN == iN2) {
            f = 0.5f;
        } else {
            iN = iV;
            iN2 = iV2;
        }
        int iM = ts0Var.m();
        int i3 = (iN2 - iN) - iM;
        if (iN > iN2) {
            i3 = (iN - iN2) - iM;
        }
        int i4 = (int) (i3 > 0 ? (f * i3) + 0.5f : f * i3);
        int i5 = iN + i4;
        int i6 = i5 + iM;
        if (iN > iN2) {
            i5 = iN - i4;
            i6 = i5 - iM;
        }
        ts0Var.K(i5, i6);
        v0(i2 + 1, gs0Var, ts0Var);
    }

    public static bo3 s(float f, float f2, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f4 = 0.0f;
        }
        return new bo3(f, f2, f3, f4);
    }

    public static void s0(int i2, ts0 ts0Var, gs0 gs0Var, ts0 ts0Var2) {
        float f = ts0Var2.e0;
        as0 as0Var = ts0Var2.J;
        int iV = as0Var.v() + as0Var.x.n();
        as0 as0Var2 = ts0Var2.L;
        int iN = as0Var2.x.n() - as0Var2.v();
        if (iN >= iV) {
            int iM = ts0Var2.m();
            if (ts0Var2.g0 != 8) {
                int i3 = ts0Var2.u;
                if (i3 == 2) {
                    iM = (int) (f * 0.5f * (ts0Var instanceof us0 ? ts0Var.m() : ts0Var.T.m()));
                } else if (i3 == 0) {
                    iM = iN - iV;
                }
                iM = Math.max(ts0Var2.k, iM);
                int i4 = ts0Var2.d;
                if (i4 > 0) {
                    iM = Math.min(i4, iM);
                }
            }
            int i5 = iV + ((int) ((f * ((iN - iV) - iM)) + 0.5f));
            ts0Var2.K(i5, iM + i5);
            v0(i2 + 1, gs0Var, ts0Var2);
        }
    }

    public static void t0(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(du4.i(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        yf2.X(classCastException, ue5.class.getName());
        throw classCastException;
    }

    public static final void u(String str, h02 h02Var, int i2) {
        h02 h02Var2;
        h02Var.Z(223941474);
        int i3 = i2 | 6;
        byte b2 = 1;
        if (h02Var.N(i3 & 1, (i3 & 3) != 2)) {
            yl0 yl0VarF = gp4.F((Context) h02Var.a(sa.y));
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new rp3(0L);
                h02Var.i0(objK);
            }
            rp3 rp3Var = (rp3) objK;
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = kq2.M(Boolean.FALSE);
                h02Var.i0(objK2);
            }
            ob3 ob3Var = (ob3) objK2;
            u4 u4Var = new u4(b2);
            boolean zJ = h02Var.j(yl0VarF);
            Object objK3 = h02Var.K();
            if (zJ || objK3 == l76Var) {
                objK3 = new q2((Object) yl0VarF, (Object) rp3Var, (Object) ob3Var, (byte) 9);
                h02Var.i0(objK3);
            }
            x03 x03VarL = ra.L(u4Var, (xy1) objK3, h02Var, 0);
            vt2 vt2Var = vt2.ON_RESUME;
            boolean zJ2 = h02Var.j(yl0VarF) | h02Var.j(x03VarL);
            Object objK4 = h02Var.K();
            if (zJ2 || objK4 == l76Var) {
                objK4 = new lt((Object) yl0VarF, (Object) x03VarL, (Object) ob3Var, (byte) 4);
                h02Var.i0(objK4);
            }
            aq2.r(vt2Var, null, (my1) objK4, h02Var, 6);
            boolean zBooleanValue = ((Boolean) ob3Var.getValue()).booleanValue();
            boolean zJ3 = h02Var.j(x03VarL);
            Object objK5 = h02Var.K();
            if (zJ3 || objK5 == l76Var) {
                objK5 = new m(x03VarL, rp3Var, (byte) 19);
                h02Var.i0(objK5);
            }
            h02Var2 = h02Var;
            k05.g(zBooleanValue, (xy1) objK5, null, null, false, null, h02Var2, 0, 124);
            str = "android.permission.POST_NOTIFICATIONS";
        } else {
            h02Var2 = h02Var;
            h02Var2.Q();
        }
        u34 u34VarP = h02Var2.p();
        if (u34VarP != null) {
            u34VarP.n = new wo(str, i2, (byte) 7);
        }
    }

    public static void u0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            checkableImageButton.setTooltipText(charSequence);
        } else if (onLongClickListener == null) {
            zy5.y(checkableImageButton, charSequence);
        }
    }

    public static final void v(j73 j73Var, xy1 xy1Var, h02 h02Var, int i2) {
        h02Var.Z(-932836462);
        int i3 = (h02Var.x(j73Var) ? 4 : 2) | i2 | (h02Var.j(xy1Var) ? 32 : 16);
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            mq2.y(h02Var, a11.w(j73Var, xy1Var));
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new vn((byte) 5, i2, j73Var, xy1Var);
        }
    }

    public static void v0(int i2, gs0 gs0Var, ts0 ts0Var) {
        boolean z2;
        as0 as0Var;
        as0 as0Var2;
        as0 as0Var3;
        as0 as0Var4;
        if (ts0Var.c) {
            return;
        }
        if (!(ts0Var instanceof us0) && ts0Var.e() && B(ts0Var)) {
            us0.V(ts0Var, gs0Var, new vy());
        }
        as0 as0VarT = ts0Var.t(3);
        as0 as0VarT2 = ts0Var.t(5);
        int iN = as0VarT.n();
        int iN2 = as0VarT2.n();
        HashSet<as0> hashSet = as0VarT.g;
        if (hashSet != null && as0VarT.r) {
            for (as0 as0Var5 : hashSet) {
                ts0 ts0Var2 = as0Var5.n;
                int i3 = i2 + 1;
                boolean zB = B(ts0Var2);
                as0 as0Var6 = ts0Var2.J;
                as0 as0Var7 = ts0Var2.L;
                if (ts0Var2.e() && zB) {
                    us0.V(ts0Var2, gs0Var, new vy());
                }
                boolean z3 = (as0Var5 == as0Var6 && (as0Var4 = as0Var7.x) != null && as0Var4.r) || (as0Var5 == as0Var7 && (as0Var3 = as0Var6.x) != null && as0Var3.r);
                int i4 = ts0Var2.p0[1];
                if (i4 != 3 || zB) {
                    if (!ts0Var2.e()) {
                        if (as0Var5 == as0Var6 && as0Var7.x == null) {
                            int iV = as0Var6.v() + iN;
                            ts0Var2.K(iV, ts0Var2.m() + iV);
                            v0(i3, gs0Var, ts0Var2);
                        } else if (as0Var5 == as0Var7 && as0Var6.x == null) {
                            int iV2 = iN - as0Var7.v();
                            ts0Var2.K(iV2 - ts0Var2.m(), iV2);
                            v0(i3, gs0Var, ts0Var2);
                        } else if (z3 && !ts0Var2.d()) {
                            r0(i3, gs0Var, ts0Var2);
                        }
                    }
                } else if (i4 == 3 && ts0Var2.d >= 0 && ts0Var2.k >= 0 && (ts0Var2.g0 == 8 || (ts0Var2.u == 0 && ts0Var2.W == 0.0f))) {
                    if (!ts0Var2.d() && !ts0Var2.F && z3 && !ts0Var2.d()) {
                        s0(i3, ts0Var, gs0Var, ts0Var2);
                    }
                }
            }
        }
        boolean z4 = true;
        z4 = true;
        z4 = true;
        if (ts0Var instanceof m42) {
            return;
        }
        HashSet<as0> hashSet2 = as0VarT2.g;
        if (hashSet2 != null && as0VarT2.r) {
            for (as0 as0Var8 : hashSet2) {
                ts0 ts0Var3 = as0Var8.n;
                int i5 = i2 + 1;
                boolean zB2 = B(ts0Var3);
                as0 as0Var9 = ts0Var3.J;
                as0 as0Var10 = ts0Var3.L;
                if (ts0Var3.e() && zB2) {
                    us0.V(ts0Var3, gs0Var, new vy());
                }
                boolean z5 = (as0Var8 == as0Var9 && (as0Var2 = as0Var10.x) != null && as0Var2.r) || (as0Var8 == as0Var10 && (as0Var = as0Var9.x) != null && as0Var.r);
                int i6 = ts0Var3.p0[1];
                if (i6 != 3 || zB2) {
                    if (!ts0Var3.e()) {
                        if (as0Var8 == as0Var9 && as0Var10.x == null) {
                            int iV3 = as0Var9.v() + iN2;
                            ts0Var3.K(iV3, ts0Var3.m() + iV3);
                            v0(i5, gs0Var, ts0Var3);
                        } else if (as0Var8 == as0Var10 && as0Var9.x == null) {
                            int iV4 = iN2 - as0Var10.v();
                            ts0Var3.K(iV4 - ts0Var3.m(), iV4);
                            v0(i5, gs0Var, ts0Var3);
                        } else if (z5 && !ts0Var3.d()) {
                            r0(i5, gs0Var, ts0Var3);
                        }
                    }
                } else if (i6 == 3 && ts0Var3.d >= 0 && ts0Var3.k >= 0 && (ts0Var3.g0 == 8 || (ts0Var3.u == 0 && ts0Var3.W == 0.0f))) {
                    if (!ts0Var3.d() && !ts0Var3.F && z5 && !ts0Var3.d()) {
                        s0(i5, ts0Var, gs0Var, ts0Var3);
                    }
                }
            }
        }
        as0 as0VarT3 = ts0Var.t(6);
        if (as0VarT3.g != null && as0VarT3.r) {
            int iN3 = as0VarT3.n();
            for (as0 as0Var11 : as0VarT3.g) {
                ts0 ts0Var4 = as0Var11.n;
                int i7 = i2 + 1;
                boolean zB3 = B(ts0Var4);
                as0 as0Var12 = ts0Var4.M;
                if (ts0Var4.e() && zB3) {
                    us0.V(ts0Var4, gs0Var, new vy());
                }
                if (ts0Var4.p0[z4 ? 1 : 0] != 3 || zB3) {
                    if (!ts0Var4.e()) {
                        if (as0Var11 == as0Var12) {
                            int iV5 = as0Var11.v() + iN3;
                            if (ts0Var4.E) {
                                int i8 = iV5 - ts0Var4.a0;
                                int i9 = ts0Var4.V + i8;
                                ts0Var4.Z = i8;
                                ts0Var4.J.q(i8);
                                ts0Var4.L.q(i9);
                                as0Var12.q(iV5);
                                z2 = z4 ? 1 : 0;
                                ts0Var4.q = z2;
                            } else {
                                z2 = z4 ? 1 : 0;
                            }
                            v0(i7, gs0Var, ts0Var4);
                        }
                        z4 = z2;
                    }
                }
                z2 = z4 ? 1 : 0;
                z4 = z2;
            }
        }
        ts0Var.c = z4;
    }

    public static final void w(qr0 qr0Var, xy1 xy1Var, my1 my1Var, h02 h02Var, int i2) {
        qr0Var.getClass();
        xy1Var.getClass();
        my1Var.getClass();
        h02Var.Z(521645308);
        int i3 = (h02Var.j(qr0Var) ? 4 : 2) | i2 | (h02Var.j(xy1Var) ? 32 : 16) | (h02Var.j(my1Var) ? 256 : 128);
        if (h02Var.N(i3 & 1, (i3 & 147) != 146)) {
            k33.n(qr0Var, m0(170506475, new m61(qr0Var, xy1Var, my1Var), h02Var), h02Var, (i3 & 14) | 56);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new m61(qr0Var, xy1Var, my1Var, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    public static final void x(final xy1 xy1Var, final boolean z2, h02 h02Var, final int i2) {
        int i3;
        boolean z3;
        h02Var.Z(-155628918);
        if ((i2 & 6) == 0) {
            i3 = i2 | (h02Var.j(xy1Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= h02Var.l(z2) ? 32 : 16;
        }
        if (h02Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (objK == l76Var) {
                objK = new ym0((byte) 24);
                h02Var.i0(objK);
            }
            final ob3 ob3Var = (ob3) xq2.f(objArr, (my1) objK, h02Var);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                String str = Build.DEVICE;
                str.getClass();
                if (ay4.P(str, "OnePlus", false) || str.equals("Nord")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            final boolean z4 = i4 < 30 && pr.J(new String[]{"curtana", "joyeuse", "Nord", "rav", "sofiar"}, Build.DEVICE);
            Object objK2 = h02Var.K();
            if (objK2 == l76Var) {
                objK2 = kq2.M(Boolean.valueOf(z2));
                h02Var.i0(objK2);
            }
            final ob3 ob3Var2 = (ob3) objK2;
            final boolean z5 = z3;
            fb6.r(g0(g73.g, 8.0f, 0.0f, 2), null, null, null, null, m0(645320598, new cz1() { // from class: n61
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.cz1
                public final Object x(Object obj, Object obj2, Object obj3) {
                    boolean z6;
                    h02 h02Var2;
                    g73 g73Var;
                    h02 h02Var3;
                    int i5;
                    h02 h02Var4 = (h02) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((gk0) obj).getClass();
                    if (h02Var4.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        g73 g73Var2 = g73.g;
                        j73 j73VarE0 = ue5.e0(g73Var2, 16.0f);
                        ek0 ek0VarG = ck0.g(v70.n, hi0.h, h02Var4, 0);
                        int iHashCode = Long.hashCode(h02Var4.T);
                        tr3 tr3VarQ = h02Var4.q();
                        j73 j73VarW = m50.W(h02Var4, j73VarE0);
                        jo0.n.getClass();
                        h02Var4.b0();
                        boolean z7 = h02Var4.S;
                        sx1 sx1Var = um2.Z;
                        if (z7) {
                            h02Var4.m(sx1Var);
                        } else {
                            h02Var4.l0();
                        }
                        on0 on0Var = tg1.w;
                        xs2.E(on0Var, h02Var4, ek0VarG);
                        on0 on0Var2 = tg1.q;
                        xs2.E(on0Var2, h02Var4, tr3VarQ);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        on0 on0Var3 = tg1.c;
                        xs2.E(on0Var3, h02Var4, numValueOf);
                        xs2.D(h02Var4);
                        on0 on0Var4 = tg1.m;
                        xs2.E(on0Var4, h02Var4, j73VarW);
                        String strI = xs2.I(R.string.compatibility_mode_title, h02Var4);
                        vf1 vf1Var = of5.g;
                        g75.y(strI, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var4.a(vf1Var)).j, h02Var4, 0, 0, 131070);
                        g75.y(xs2.I(R.string.compatibility_mode_text_short, h02Var4), ue5.i0(g73Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var4.a(vf1Var)).m, h02Var4, 48, 0, 131068);
                        h02 h02Var5 = h02Var4;
                        if (z5) {
                            h02Var5.X(2114185230);
                            g75.y(xs2.I(R.string.compatibility_mode_text_developer_option, h02Var5), ue5.i0(g73Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((rj0) h02Var5.a(tj0.g)).f, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var5.a(vf1Var)).m, h02Var5, 48, 0, 131064);
                            h02 h02Var6 = h02Var5;
                            z6 = false;
                            h02Var6.b(false);
                            h02Var2 = h02Var6;
                        } else {
                            z6 = false;
                            h02Var5.X(2114511970);
                            h02Var5.b(false);
                            h02Var2 = h02Var5;
                        }
                        if (z4) {
                            h02Var2.X(2114555215);
                            h02 h02Var7 = h02Var2;
                            g73Var = g73Var2;
                            boolean z8 = z6;
                            g75.y(xs2.I(R.string.compatibility_mode_text_software_update, h02Var2), ue5.i0(g73Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((rj0) h02Var2.a(tj0.g)).f, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var2.a(vf1Var)).m, h02Var7, 48, 0, 131064);
                            h02 h02Var8 = h02Var7;
                            h02Var8.b(z8);
                            i5 = z8;
                            h02Var3 = h02Var8;
                        } else {
                            g73Var = g73Var2;
                            boolean z9 = z6;
                            h02Var2.X(2114880994);
                            h02Var2.b(z9);
                            i5 = z9;
                            h02Var3 = h02Var2;
                        }
                        mq2.y(h02Var3, mq4.n(g73Var, 16.0f));
                        j73 j73VarR = mq4.r(g73Var, 1.0f);
                        kb4 kb4VarG = jb4.g(v70.y, hi0.p, h02Var3, i5);
                        int iHashCode2 = Long.hashCode(h02Var3.T);
                        tr3 tr3VarQ2 = h02Var3.q();
                        j73 j73VarW2 = m50.W(h02Var3, j73VarR);
                        h02Var3.b0();
                        if (h02Var3.S) {
                            h02Var3.m(sx1Var);
                        } else {
                            h02Var3.l0();
                        }
                        xs2.E(on0Var, h02Var3, kb4VarG);
                        xs2.E(on0Var2, h02Var3, tr3VarQ2);
                        du4.k(iHashCode2, h02Var3, on0Var3, h02Var3);
                        xs2.E(on0Var4, h02Var3, j73VarW2);
                        h02 h02Var9 = h02Var3;
                        g75.y(xs2.I(R.string.compatibility_mode_connection_fix, h02Var3), new tp2(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((mf5) h02Var3.a(vf1Var)).t, h02Var9, 0, 0, 131068);
                        ob3 ob3Var3 = ob3Var2;
                        boolean zBooleanValue = ((Boolean) ob3Var3.getValue()).booleanValue();
                        xy1 xy1Var2 = xy1Var;
                        boolean zX = h02Var9.x(xy1Var2);
                        Object objK3 = h02Var9.K();
                        l76 l76Var2 = oo0.g;
                        if (zX || objK3 == l76Var2) {
                            objK3 = new d80((byte) 1, xy1Var2, ob3Var3);
                            h02Var9.i0(objK3);
                        }
                        k05.g(zBooleanValue, (xy1) objK3, null, null, false, null, h02Var9, 0, 124);
                        h02Var9.b(true);
                        ob3 ob3Var4 = ob3Var;
                        gp4.y(gk0.g, ((Boolean) ob3Var4.getValue()).booleanValue(), null, null, null, null, og0.c, h02Var9, 1572870, 30);
                        boolean zX2 = h02Var9.x(ob3Var4);
                        Object objK4 = h02Var9.K();
                        if (zX2 || objK4 == l76Var2) {
                            objK4 = new ef(ob3Var4, (byte) 15);
                            h02Var9.i0(objK4);
                        }
                        c93.s((my1) objK4, yf2.T(-8.0f), false, null, null, null, og0.i, h02Var9, 805306416, 508);
                        h02Var9.b(true);
                    } else {
                        h02Var4.Q();
                    }
                    return og5.g;
                }
            }, h02Var), h02Var, 196614, 30);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new bz1() { // from class: o61
                @Override // defpackage.bz1
                public final Object l(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = aq2.J(i2 | 1);
                    ue5.x(xy1Var, z2, (h02) obj, iJ);
                    return og5.g;
                }
            };
        }
    }

    public static j73 z(j73 j73Var) {
        Map map = ym5.g;
        return y94.o(j73Var).n(new dq4(m50.b0(0.0f, 400.0f, new qe2(4294967297L), 1)));
    }

    public abstract void Z(Throwable th);

    public abstract View a0(int i2);

    public abstract boolean b0();

    public abstract void c0(kb5 kb5Var);
}
