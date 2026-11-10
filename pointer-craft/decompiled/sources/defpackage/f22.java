package defpackage;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f22 {
    public static final rw3 l;
    public static final a22 n = new a22();
    public static final qw3 v;
    public static vz0 x;
    public final Context g;
    public final o05 r = new o05(new gf((Object) this, (byte) 10));
    public final AppWidgetManager y;

    static {
        String processName;
        StringBuilder sb = new StringBuilder("GlanceAppWidgetManager-");
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            objInvoke.getClass();
            processName = (String) objInvoke;
        }
        sb.append(processName);
        v = aq2.d(sb.toString(), null, null, 14);
        l = new rw3("list::Providers");
    }

    public f22(Context context) {
        this.g = context;
        this.y = AppWidgetManager.getInstance(context);
    }

    public final Object g(zz4 zz4Var) {
        String packageName = this.g.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.y.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (yf2.p(((AppWidgetProviderInfo) obj).provider.getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        byte b = 10;
        ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((AppWidgetProviderInfo) obj2).provider.getClassName());
        }
        Object objG = ((vz0) this.r.getValue()).g(new mt(cj0.J0(arrayList2), null, b), zz4Var);
        return objG == px0.j ? objG : og5.g;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0159  */
    /* JADX WARN: Code duplicated, block: B:50:0x015f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c7 -> B:30:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0108 -> B:36:0x010b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0140 -> B:44:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0159 -> B:49:0x015d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object n(defpackage.tf0 r20, defpackage.ia3 r21, defpackage.ou0 r22) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f22.n(tf0, ia3, ou0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(ou0 ou0Var) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        d22 d22Var;
        f22 f22Var;
        db3 db3Var;
        f22 f22Var2;
        String packageName;
        Set<String> set;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        Object arrayList2;
        ComponentName componentName;
        String str2;
        fp3 fp3Var;
        if (ou0Var instanceof d22) {
            d22Var = (d22) ou0Var;
            int i = d22Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d22Var.c = i - Integer.MIN_VALUE;
            } else {
                d22Var = new d22(this, ou0Var);
            }
        } else {
            d22Var = new d22(this, ou0Var);
        }
        Object objM = d22Var.q;
        int i2 = d22Var.c;
        o05 o05Var = this.r;
        a22 a22Var = n;
        rw3 rw3Var = l;
        mu0 mu0Var = null;
        px0 px0Var = px0.j;
        if (i2 == 0) {
            js2.o(objM);
            er1 er1VarY = ((vz0) o05Var.getValue()).y();
            d22Var.m = this;
            d22Var.c = 1;
            objM = ue5.M(er1VarY, d22Var);
            if (objM != px0Var) {
                f22Var = this;
            }
            return px0Var;
        }
        if (i2 == 1) {
            f22Var = d22Var.m;
            js2.o(objM);
        } else {
            if (i2 != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f22Var2 = d22Var.m;
            js2.o(objM);
        }
        db3Var = (db3) objM;
        f22Var = f22Var2;
        packageName = f22Var.g.getPackageName();
        set = (Set) db3Var.r(rw3Var);
        if (set == null) {
            qi1 qi1Var = qi1.j;
            return new b22(qi1Var, qi1Var);
        }
        arrayList = new ArrayList();
        for (String str3 : set) {
            componentName = new ComponentName(packageName, str3);
            ci2[] ci2VarArr = a22.g;
            a22Var.getClass();
            str2 = (String) db3Var.r(a22.g(str3));
            if (str2 == null) {
                fp3Var = null;
            } else {
                fp3Var = new fp3(componentName, str2);
            }
            if (fp3Var != null) {
                arrayList.add(fp3Var);
            }
        }
        Map mapI = v13.I(arrayList);
        Set<Map.Entry> setEntrySet = mapI.entrySet();
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            str = (String) entry.getValue();
            arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((ComponentName) entry.getKey());
        }
        return new b22(mapI, linkedHashMap);
        if (((db3) objM).r(rw3Var) == null) {
            objM = null;
        }
        db3Var = (db3) objM;
        if (db3Var == null) {
            d22Var.m = f22Var;
            d22Var.c = 2;
            List<AppWidgetProviderInfo> installedProviders = this.y.getInstalledProviders();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : installedProviders) {
                if (yf2.p(((AppWidgetProviderInfo) obj).provider.getPackageName(), this.g.getPackageName())) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                ci2[] ci2VarArr2 = a22.g;
                a22Var.getClass();
                Object objNewInstance = Class.forName(((AppWidgetProviderInfo) obj2).provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
                l22 l22Var = objNewInstance instanceof l22 ? (l22) objNewInstance : null;
                if (l22Var != null) {
                    arrayList4.add(l22Var);
                }
            }
            objM = ((vz0) o05Var.getValue()).g(new ko((Object) arrayList4, mu0Var, (byte) 8), d22Var);
            if (objM != px0Var) {
                f22Var2 = f22Var;
                db3Var = (db3) objM;
                f22Var = f22Var2;
            }
            return px0Var;
        }
        packageName = f22Var.g.getPackageName();
        set = (Set) db3Var.r(rw3Var);
        if (set == null) {
            qi1 qi1Var2 = qi1.j;
            return new b22(qi1Var2, qi1Var2);
        }
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            componentName = new ComponentName(packageName, str3);
            ci2[] ci2VarArr3 = a22.g;
            a22Var.getClass();
            str2 = (String) db3Var.r(a22.g(str3));
            if (str2 == null) {
                fp3Var = null;
            } else {
                fp3Var = new fp3(componentName, str2);
            }
            if (fp3Var != null) {
                arrayList.add(fp3Var);
            }
        }
        Map mapI2 = v13.I(arrayList);
        Set<Map.Entry> setEntrySet2 = mapI2.entrySet();
        linkedHashMap = new LinkedHashMap();
        while (r0.hasNext()) {
            str = (String) entry.getValue();
            arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((ComponentName) entry.getKey());
        }
        return new b22(mapI2, linkedHashMap);
    }

    public final Object v(l22 l22Var, w12 w12Var, s12 s12Var) {
        ci2[] ci2VarArr = a22.g;
        n.getClass();
        String canonicalName = l22Var.getClass().getCanonicalName();
        mu0 mu0Var = null;
        if (canonicalName == null) {
            l0.u("no receiver name");
            return null;
        }
        String canonicalName2 = w12Var.getClass().getCanonicalName();
        if (canonicalName2 != null) {
            Object objG = ((vz0) this.r.getValue()).g(new mo(canonicalName, canonicalName2, mu0Var, (byte) 3), s12Var);
            return objG == px0.j ? objG : og5.g;
        }
        l0.u("no provider name");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable y(Class cls, ou0 ou0Var) {
        c22 c22Var;
        if (ou0Var instanceof c22) {
            c22Var = (c22) ou0Var;
            int i = c22Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22Var.c = i - Integer.MIN_VALUE;
            } else {
                c22Var = new c22(this, ou0Var);
            }
        } else {
            c22Var = new c22(this, ou0Var);
        }
        Object objR = c22Var.q;
        int i2 = c22Var.c;
        if (i2 == 0) {
            js2.o(objR);
            c22Var.m = cls;
            c22Var.c = 1;
            objR = r(c22Var);
            px0 px0Var = px0.j;
            if (objR == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cls = c22Var.m;
            js2.o(objR);
        }
        b22 b22Var = (b22) objR;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            l0.u("no canonical provider name");
            return null;
        }
        List list = (List) b22Var.y.get(canonicalName);
        if (list == null) {
            return pi1.j;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int[] appWidgetIds = this.y.getAppWidgetIds((ComponentName) it.next());
            ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
            for (int i3 : appWidgetIds) {
                arrayList2.add(new tp(i3));
            }
            hj0.a0(arrayList, arrayList2);
        }
        return arrayList;
    }
}
