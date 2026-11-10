package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class xt implements ji3 {
    public static final xt g = new xt();
    public static final un1 r;
    public static final un1 y;

    static {
        zr zrVar = new zr(1);
        HashMap map = new HashMap();
        map.put(a14.class, zrVar);
        y = new un1("currentCacheSizeBytes", fj.l(map));
        zr zrVar2 = new zr(2);
        HashMap map2 = new HashMap();
        map2.put(a14.class, zrVar2);
        r = new un1("maxCacheSizeBytes", fj.l(map2));
    }

    @Override // defpackage.bj1
    public final void g(Object obj, Object obj2) {
        mx4 mx4Var = (mx4) obj;
        ki3 ki3Var = (ki3) obj2;
        ki3Var.n(y, mx4Var.g);
        ki3Var.n(r, mx4Var.y);
    }
}
