package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dj {
    public static final cj g = new cj("");

    public static final List g(cj cjVar, int i, int i2, l1 l1Var) {
        List list;
        if (i == i2 || (list = cjVar.j) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= cjVar.t.length()) {
            if (l1Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) l1Var.a(((bj) obj).g)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            bj bjVar = (bj) list.get(i3);
            if (l1Var != null ? ((Boolean) l1Var.a(bjVar.g)).booleanValue() : true) {
                int i4 = bjVar.y;
                int i5 = bjVar.r;
                if (y(i, i2, i4, i5)) {
                    arrayList2.add(new bj(xs2.w(bjVar.y, i, i2) - i, xs2.w(i5, i, i2) - i, (yi) bjVar.g, bjVar.n));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean y(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
