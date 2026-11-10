package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface t33 {
    default int g(rf2 rf2Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new b21((p33) list.get(i2), sf2.t, wf2.t, b));
        }
        return r(new eg2(rf2Var, rf2Var.getLayoutDirection()), arrayList, zs0.y(0, i, 0, 0, 13)).g();
    }

    default int n(rf2 rf2Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new b21((p33) list.get(i2), sf2.j, wf2.t, b));
        }
        return r(new eg2(rf2Var, rf2Var.getLayoutDirection()), arrayList, zs0.y(0, i, 0, 0, 13)).g();
    }

    u33 r(v33 v33Var, List list, long j);

    default int v(rf2 rf2Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new b21((p33) list.get(i2), sf2.j, wf2.j, b));
        }
        return r(new eg2(rf2Var, rf2Var.getLayoutDirection()), arrayList, zs0.y(0, 0, 0, i, 7)).y();
    }

    default int y(rf2 rf2Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new b21((p33) list.get(i2), sf2.t, wf2.j, b));
        }
        return r(new eg2(rf2Var, rf2Var.getLayoutDirection()), arrayList, zs0.y(0, 0, 0, i, 7)).y();
    }
}
