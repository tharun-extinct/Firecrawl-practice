package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mc5 {
    public final hn1 g;
    public final ae4 n;
    public final wc0 r;
    public final boolean v;
    public final Map x;
    public final vq4 y;

    public /* synthetic */ mc5(hn1 hn1Var, vq4 vq4Var, wc0 wc0Var, ae4 ae4Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : hn1Var, (i & 2) != 0 ? null : vq4Var, (i & 4) != 0 ? null : wc0Var, (i & 8) != 0 ? null : ae4Var, (i & 32) == 0, (i & 64) != 0 ? qi1.j : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc5)) {
            return false;
        }
        mc5 mc5Var = (mc5) obj;
        return yf2.p(this.g, mc5Var.g) && yf2.p(this.y, mc5Var.y) && yf2.p(this.r, mc5Var.r) && yf2.p(this.n, mc5Var.n) && this.v == mc5Var.v && yf2.p(this.x, mc5Var.x);
    }

    public final int hashCode() {
        hn1 hn1Var = this.g;
        int iHashCode = (hn1Var == null ? 0 : hn1Var.hashCode()) * 31;
        vq4 vq4Var = this.y;
        int iHashCode2 = (iHashCode + (vq4Var == null ? 0 : vq4Var.hashCode())) * 31;
        wc0 wc0Var = this.r;
        int iHashCode3 = (iHashCode2 + (wc0Var == null ? 0 : wc0Var.hashCode())) * 31;
        ae4 ae4Var = this.n;
        return this.x.hashCode() + xi3.l((iHashCode3 + (ae4Var != null ? ae4Var.hashCode() : 0)) * 961, 31, this.v);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.g + ", slide=" + this.y + ", changeSize=" + this.r + ", scale=" + this.n + ", veil=null, hold=" + this.v + ", effectsMap=" + this.x + ")";
    }

    public mc5(hn1 hn1Var, vq4 vq4Var, wc0 wc0Var, ae4 ae4Var, boolean z, Map map) {
        this.g = hn1Var;
        this.y = vq4Var;
        this.r = wc0Var;
        this.n = ae4Var;
        this.v = z;
        this.x = map;
    }
}
