package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class al2 {
    public static final d93 l = new d93((byte) 12);
    public final Context g;
    public final int n;
    public int r;
    public final LinkedHashSet v;
    public final Set x;
    public final LinkedHashMap y;

    public al2(Context context, LinkedHashMap linkedHashMap, int i, int i2, Set set, int i3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        set = (i3 & 32) != 0 ? new LinkedHashSet() : set;
        this.g = context;
        this.y = linkedHashMap;
        this.r = i;
        this.n = i2;
        this.v = linkedHashSet;
        this.x = set;
    }

    public final int g(jh1 jh1Var) {
        zo2 zo2VarT = js2.t(this.g, jh1Var);
        synchronized (this) {
            Integer num = (Integer) this.y.get(zo2VarT);
            if (num != null) {
                int iIntValue = num.intValue();
                this.v.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int i = this.r;
            while (this.x.contains(Integer.valueOf(i))) {
                i = (i + 1) % ip2.r;
                if (i == this.r) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.r = (i + 1) % ip2.r;
            this.v.add(Integer.valueOf(i));
            this.x.add(Integer.valueOf(i));
            this.y.put(zo2VarT, Integer.valueOf(i));
            return i;
        }
    }

    public final Object y(aq aqVar) throws Throwable {
        Object objN = w22.g.n(this.g, mp2.g, js2.c(this.n), new mt(this, null, (byte) 11), aqVar);
        return objN == px0.j ? objN : og5.g;
    }
}
