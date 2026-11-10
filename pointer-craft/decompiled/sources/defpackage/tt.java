package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class tt implements ji3 {
    public static final tt g = new tt();
    public static final un1 y;

    static {
        zr zrVar = new zr(1);
        HashMap map = new HashMap();
        map.put(a14.class, zrVar);
        y = new un1("storageMetrics", fj.l(map));
    }

    @Override // defpackage.bj1
    public final void g(Object obj, Object obj2) {
        ((ki3) obj2).g(y, ((z22) obj).g);
    }
}
