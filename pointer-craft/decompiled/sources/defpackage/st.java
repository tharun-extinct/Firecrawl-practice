package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class st implements ji3 {
    public static final st g = new st();
    public static final un1 n;
    public static final un1 r;
    public static final un1 v;
    public static final un1 y;

    static {
        zr zrVar = new zr(1);
        HashMap map = new HashMap();
        map.put(a14.class, zrVar);
        y = new un1("window", fj.l(map));
        zr zrVar2 = new zr(2);
        HashMap map2 = new HashMap();
        map2.put(a14.class, zrVar2);
        r = new un1("logSourceMetrics", fj.l(map2));
        zr zrVar3 = new zr(3);
        HashMap map3 = new HashMap();
        map3.put(a14.class, zrVar3);
        n = new un1("globalMetrics", fj.l(map3));
        zr zrVar4 = new zr(4);
        HashMap map4 = new HashMap();
        map4.put(a14.class, zrVar4);
        v = new un1("appNamespace", fj.l(map4));
    }

    @Override // defpackage.bj1
    public final void g(Object obj, Object obj2) {
        zh0 zh0Var = (zh0) obj;
        ki3 ki3Var = (ki3) obj2;
        ki3Var.g(y, zh0Var.g);
        ki3Var.g(r, zh0Var.y);
        ki3Var.g(n, zh0Var.r);
        ki3Var.g(v, zh0Var.n);
    }
}
