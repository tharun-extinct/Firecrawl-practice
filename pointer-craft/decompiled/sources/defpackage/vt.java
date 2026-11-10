package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class vt implements ji3 {
    public static final vt g = new vt();
    public static final un1 r;
    public static final un1 y;

    static {
        zr zrVar = new zr(1);
        HashMap map = new HashMap();
        map.put(a14.class, zrVar);
        y = new un1("logSource", fj.l(map));
        zr zrVar2 = new zr(2);
        HashMap map2 = new HashMap();
        map2.put(a14.class, zrVar2);
        r = new un1("logEventDropped", fj.l(map2));
    }

    @Override // defpackage.bj1
    public final void g(Object obj, Object obj2) {
        gy2 gy2Var = (gy2) obj;
        ki3 ki3Var = (ki3) obj2;
        ki3Var.g(y, gy2Var.g);
        ki3Var.g(r, gy2Var.y);
    }
}
