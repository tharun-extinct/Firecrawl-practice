package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface a93 {
    default int g(rf2 rf2Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new b21((p33) list2.get(i3), sf2.t, wf2.t, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return r(new eg2(rf2Var, rf2Var.getLayoutDirection()), arrayList2, zs0.y(0, i, 0, 0, 13)).g();
    }

    default int n(rf2 rf2Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new b21((p33) list2.get(i3), sf2.j, wf2.t, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return r(new eg2(rf2Var, rf2Var.getLayoutDirection()), arrayList2, zs0.y(0, i, 0, 0, 13)).g();
    }

    u33 r(v33 v33Var, List list, long j);

    default int v(rf2 rf2Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new b21((p33) list2.get(i3), sf2.j, wf2.j, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return r(new eg2(rf2Var, rf2Var.getLayoutDirection()), arrayList2, zs0.y(0, 0, 0, i, 7)).y();
    }

    default int y(rf2 rf2Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new b21((p33) list2.get(i3), sf2.t, wf2.j, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return r(new eg2(rf2Var, rf2Var.getLayoutDirection()), arrayList2, zs0.y(0, 0, 0, i, 7)).y();
    }
}
