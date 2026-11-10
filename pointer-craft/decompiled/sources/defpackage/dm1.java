package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dm1 {
    public static final dm1 r;
    public static final dm1 y;
    public final mc5 g;

    static {
        LinkedHashMap linkedHashMap = null;
        hn1 hn1Var = null;
        vq4 vq4Var = null;
        wc0 wc0Var = null;
        ae4 ae4Var = null;
        y = new dm1(new mc5(hn1Var, vq4Var, wc0Var, ae4Var, linkedHashMap, 127));
        r = new dm1(new mc5(hn1Var, vq4Var, wc0Var, ae4Var, linkedHashMap, 95));
    }

    public dm1(mc5 mc5Var) {
        this.g = mc5Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dm1) && ((dm1) obj).g.equals(this.g);
    }

    public final dm1 g(dm1 dm1Var) {
        hn1 hn1Var = dm1Var.g.g;
        if (hn1Var == null) {
            hn1Var = this.g.g;
        }
        mc5 mc5Var = dm1Var.g;
        vq4 vq4Var = mc5Var.y;
        if (vq4Var == null) {
            vq4Var = this.g.y;
        }
        wc0 wc0Var = mc5Var.r;
        if (wc0Var == null) {
            wc0Var = this.g.r;
        }
        ae4 ae4Var = mc5Var.n;
        if (ae4Var == null) {
            ae4Var = this.g.n;
        }
        boolean z = mc5Var.v;
        mc5 mc5Var2 = this.g;
        boolean z2 = z || mc5Var2.v;
        Map map = mc5Var2.x;
        Map map2 = mc5Var.x;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new dm1(new mc5(hn1Var, vq4Var, wc0Var, ae4Var, z2, linkedHashMap));
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        if (equals(y)) {
            return "ExitTransition.None";
        }
        if (equals(r)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        mc5 mc5Var = this.g;
        hn1 hn1Var = mc5Var.g;
        String string = hn1Var != null ? hn1Var.toString() : null;
        vq4 vq4Var = mc5Var.y;
        String string2 = vq4Var != null ? vq4Var.toString() : null;
        wc0 wc0Var = mc5Var.r;
        String string3 = wc0Var != null ? wc0Var.toString() : null;
        ae4 ae4Var = mc5Var.n;
        String string4 = ae4Var != null ? ae4Var.toString() : null;
        boolean z = mc5Var.v;
        StringBuilder sbZ = du4.z("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
        du4.B(sbZ, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        sbZ.append(z);
        return sbZ.toString();
    }
}
