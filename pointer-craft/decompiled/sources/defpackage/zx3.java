package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class zx3 {
    public static final SparseArray g = new SparseArray();
    public static final HashMap y;

    static {
        HashMap map = new HashMap();
        y = map;
        map.put(xx3.j, 0);
        map.put(xx3.t, 1);
        map.put(xx3.a, 2);
        for (xx3 xx3Var : map.keySet()) {
            g.append(((Integer) y.get(xx3Var)).intValue(), xx3Var);
        }
    }

    public static int g(xx3 xx3Var) {
        Integer num = (Integer) y.get(xx3Var);
        if (num != null) {
            return num.intValue();
        }
        uo1.j(xx3Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static xx3 y(int i) {
        xx3 xx3Var = (xx3) g.get(i);
        if (xx3Var != null) {
            return xx3Var;
        }
        l0.u(xi3.j("Unknown Priority for value ", i));
        return null;
    }
}
