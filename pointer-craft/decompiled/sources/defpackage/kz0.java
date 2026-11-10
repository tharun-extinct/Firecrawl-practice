package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kz0 implements c41, v62, uw1, q02, i03, sp0, rn5 {
    public final nz0 g;
    public final kz0 r = this;
    public final lz0 y;

    public kz0(nz0 nz0Var, lz0 lz0Var) {
        this.g = nz0Var;
        this.y = lz0Var;
    }

    public final yp2 g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(15);
        int i = ue5.s;
        Boolean bool = Boolean.TRUE;
        linkedHashMap.put("gp", bool);
        int i2 = og0.k;
        linkedHashMap.put("b30", bool);
        int i3 = k33.J;
        linkedHashMap.put("b90", bool);
        int i4 = k33.J;
        linkedHashMap.put("zk0", bool);
        int i5 = c93.F;
        linkedHashMap.put("qr0", bool);
        int i6 = ra.G;
        linkedHashMap.put("yv0", bool);
        int i7 = ue5.s;
        linkedHashMap.put("sj2", bool);
        int i8 = og0.k;
        linkedHashMap.put("xl2", bool);
        int i9 = ue5.s;
        linkedHashMap.put("ao2", bool);
        linkedHashMap.put("wm4", bool);
        linkedHashMap.put("un5", bool);
        return new yp2(linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap));
    }
}
