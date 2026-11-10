package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ew extends pl5 {
    public jy3 n;
    public final String r;
    public final String y = "SaveableStateHolder_BackStackEntryKey";

    public ew(yc4 yc4Var) {
        Object value;
        Object obj;
        yc4Var.getClass();
        rv rvVar = yc4Var.y;
        LinkedHashMap linkedHashMap = (LinkedHashMap) rvVar.j;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) rvVar.m;
        try {
            ew4 ew4Var = (ew4) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (ew4Var == null || (value = ew4Var.getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) rvVar.a).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        String string = (String) value;
        if (string == null) {
            string = UUID.randomUUID().toString();
            String str = this.y;
            str.getClass();
            if (string != null) {
                ArrayList arrayList = ad4.g;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    do {
                        if (i < size) {
                            obj = arrayList.get(i);
                            i++;
                        }
                    } while (!((Class) obj).isInstance(string));
                }
                uo1.C(string.getClass(), " into saved state", "Can't put value with type ");
                throw null;
            }
            ArrayList arrayList2 = ad4.g;
            Object obj2 = yc4Var.g.get(str);
            ka3 ka3Var = obj2 instanceof ka3 ? (ka3) obj2 : null;
            if (ka3Var != null) {
                ka3Var.r(string);
            }
            rvVar.o(string, str);
        }
        this.r = string;
    }

    @Override // defpackage.pl5
    public final void n() {
        jy3 jy3Var = this.n;
        if (jy3Var == null) {
            yf2.Y("saveableStateHolderRef");
            throw null;
        }
        qc4 qc4Var = (qc4) ((WeakReference) jy3Var.j).get();
        if (qc4Var != null) {
            qc4Var.r(this.r);
        }
        jy3 jy3Var2 = this.n;
        if (jy3Var2 != null) {
            ((WeakReference) jy3Var2.j).clear();
        } else {
            yf2.Y("saveableStateHolderRef");
            throw null;
        }
    }
}
