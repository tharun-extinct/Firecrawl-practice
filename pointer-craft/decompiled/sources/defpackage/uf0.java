package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uf0 {
    public final HashMap g = new HashMap();
    public final HashMap y;

    public uf0(HashMap map) {
        this.y = map;
        for (Map.Entry entry : map.entrySet()) {
            vt2 vt2Var = (vt2) entry.getValue();
            List arrayList = (List) this.g.get(vt2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.g.put(vt2Var, arrayList);
            }
            arrayList.add((vf0) entry.getKey());
        }
    }

    public static void g(List list, gu2 gu2Var, vt2 vt2Var, fu2 fu2Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                vf0 vf0Var = (vf0) list.get(size);
                Method method = vf0Var.y;
                try {
                    int i = vf0Var.g;
                    if (i == 0) {
                        method.invoke(fu2Var, null);
                    } else if (i == 1) {
                        method.invoke(fu2Var, gu2Var);
                    } else if (i == 2) {
                        method.invoke(fu2Var, gu2Var, vt2Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    uo1.w("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
