package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kd2 {
    public final int g;
    public final Map r;
    public final int y;

    public /* synthetic */ kd2(int i, int i2, Map map, int i3) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? qi1.j : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd2)) {
            return false;
        }
        kd2 kd2Var = (kd2) obj;
        return this.g == kd2Var.g && this.y == kd2Var.y && yf2.p(this.r, kd2Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + du4.r(this.y, Integer.hashCode(this.g) * 31, 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.g + ", complexViewId=" + this.y + ", children=" + this.r + ')';
    }

    public kd2(int i, int i2, Map map) {
        this.g = i;
        this.y = i2;
        this.r = map;
    }
}
