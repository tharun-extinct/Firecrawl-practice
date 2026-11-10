package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y70 {
    public static final LinkedHashMap g = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    public static final ArrayList g(yi2 yi2Var, n04 n04Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        byte b = n04Var.t;
        byte b2 = 1;
        if (b == 1) {
            int i = (b == 1 ? (k04) n04Var.a : null).t;
            Bundle bundle = new Bundle();
            bundle.putInt("mediaKey", i);
            bundle.putBoolean("down", z);
            arrayList.add(new mz1(oz1.t, bundle));
            return arrayList;
        }
        if (b == 2) {
            l04 l04Var = b == 2 ? (l04) n04Var.a : null;
            ?? arrayList2 = new ArrayList();
            boolean z2 = l04Var.a;
            int[] iArr = l04Var.t;
            if (z2) {
                for (int i2 : iArr) {
                    arrayList2.add(Integer.valueOf(i2));
                }
            } else {
                for (int i3 : iArr) {
                    Integer numN = yi2Var.n(i3);
                    if (numN != null) {
                        arrayList2.add(Integer.valueOf(numN.intValue()));
                    }
                }
            }
            if (!z) {
                arrayList2 = cj0.y0(arrayList2);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("modifierCode", 0);
                bundle2.putInt("keyCode", iIntValue);
                bundle2.putBoolean("down", z);
                arrayList.add(new mz1(oz1.j, bundle2));
            }
        } else if (b == 3 && z) {
            ArrayList arrayListX = yi2Var.x((b == 3 ? (m04) n04Var.a : null).t, new m92(b2));
            Bundle bundle3 = new Bundle();
            bundle3.putIntegerArrayList("keystrokes", new ArrayList<>(arrayListX));
            arrayList.add(new mz1(oz1.a, bundle3));
            return arrayList;
        }
        return arrayList;
    }

    public static final ArrayList r(yi2 yi2Var, o04 o04Var, boolean z) {
        int i;
        int i2 = 0;
        yi2Var.getClass();
        o04Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = o04Var.a;
        if (i3 == 0) {
            if (o04Var.t.length > 1) {
                LinkedHashMap linkedHashMap = g;
                Integer num = (Integer) linkedHashMap.get(0);
                int iIntValue = num != null ? num.intValue() : 0;
                if (!z) {
                    int i4 = iIntValue + 1;
                    linkedHashMap.put(0, Integer.valueOf(i4 < o04Var.t.length ? i4 : 0));
                }
                i2 = iIntValue;
            }
            n04 n04Var = o04Var.t[i2];
            n04Var.getClass();
            arrayList.addAll(g(yi2Var, n04Var, z));
            return arrayList;
        }
        if (i3 == 1) {
            n04[] n04VarArr = o04Var.t;
            if (n04VarArr.length <= 1) {
                n04 n04Var2 = (n04) pr.X(n04VarArr);
                if (n04Var2 != null) {
                    arrayList.addAll(g(yi2Var, n04Var2, z));
                    return arrayList;
                }
            } else if (z) {
                int length = n04VarArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    n04 n04Var3 = n04VarArr[i5];
                    int i7 = i6 + 1;
                    if (i6 > 0 && (i = n04Var3.q) > 0) {
                        arrayList.add(ua6.n(i));
                    }
                    n04Var3.getClass();
                    arrayList.addAll(g(yi2Var, n04Var3, true));
                    arrayList.add(ua6.n(0L));
                    arrayList.addAll(g(yi2Var, n04Var3, false));
                    arrayList.add(ua6.n(0L));
                    i5++;
                    i6 = i7;
                }
            }
        }
        return arrayList;
    }

    public static final ArrayList y(yi2 yi2Var, o04 o04Var) {
        yi2Var.getClass();
        o04Var.getClass();
        return cj0.w0(cj0.x0(r(yi2Var, o04Var, true), ua6.n(0L)), r(yi2Var, o04Var, false));
    }
}
