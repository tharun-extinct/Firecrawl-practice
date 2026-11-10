package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ad5 {
    public final long a;
    public final ComponentName c;
    public final Context g;
    public final y22 i;
    public final kd2 j;
    public final AtomicInteger l;
    public final int m;
    public final al2 n;
    public final boolean q;
    public final boolean r;
    public final AtomicBoolean t;
    public final int v;
    public final Integer w;
    public final boolean x;
    public final int y;

    public ad5(Context context, int i, boolean z, al2 al2Var, int i2, boolean z2, AtomicInteger atomicInteger, kd2 kd2Var, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName, y22 y22Var) {
        this.g = context;
        this.y = i;
        this.r = z;
        this.n = al2Var;
        this.v = i2;
        this.x = z2;
        this.l = atomicInteger;
        this.j = kd2Var;
        this.t = atomicBoolean;
        this.a = j;
        this.m = i3;
        this.q = z3;
        this.w = num;
        this.c = componentName;
        this.i = y22Var;
    }

    public static ad5 g(ad5 ad5Var, int i, AtomicInteger atomicInteger, kd2 kd2Var, AtomicBoolean atomicBoolean, long j, Integer num, int i2) {
        return new ad5(ad5Var.g, ad5Var.y, ad5Var.r, ad5Var.n, (i2 & 16) != 0 ? ad5Var.v : i, (i2 & 32) != 0 ? ad5Var.x : true, (i2 & 64) != 0 ? ad5Var.l : atomicInteger, (i2 & 128) != 0 ? ad5Var.j : kd2Var, (i2 & 256) != 0 ? ad5Var.t : atomicBoolean, (i2 & 512) != 0 ? ad5Var.a : j, (i2 & 1024) != 0 ? ad5Var.m : 0, (i2 & 4096) != 0 ? ad5Var.q : true, (i2 & 8192) != 0 ? ad5Var.w : num, ad5Var.c, ad5Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad5) {
            ad5 ad5Var = (ad5) obj;
            return yf2.p(this.g, ad5Var.g) && this.y == ad5Var.y && this.r == ad5Var.r && this.n == ad5Var.n && this.v == ad5Var.v && this.x == ad5Var.x && yf2.p(this.l, ad5Var.l) && yf2.p(this.j, ad5Var.j) && yf2.p(this.t, ad5Var.t) && this.a == ad5Var.a && this.m == ad5Var.m && this.q == ad5Var.q && yf2.p(this.w, ad5Var.w) && yf2.p(this.c, ad5Var.c) && this.i == ad5Var.i;
        }
        return false;
    }

    public final int hashCode() {
        int iL = xi3.l(du4.r(-1, du4.r(this.m, xi3.v((this.t.hashCode() + ((this.j.hashCode() + ((this.l.hashCode() + xi3.l(du4.r(this.v, (this.n.hashCode() + xi3.l(du4.r(this.y, this.g.hashCode() * 31, 31), 31, this.r)) * 31, 31), 31, this.x)) * 31)) * 31)) * 31, 31, this.a), 31), 31), 31, this.q);
        Integer num = this.w;
        int iHashCode = (iL + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.c;
        return this.i.hashCode() + ((iHashCode + (componentName != null ? componentName.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.g + ", appWidgetId=" + this.y + ", isRtl=" + this.r + ", layoutConfiguration=" + this.n + ", itemPosition=" + this.v + ", isLazyCollectionDescendant=" + this.x + ", lastViewId=" + this.l + ", parentContext=" + this.j + ", isBackgroundSpecified=" + this.t + ", layoutSize=" + ((Object) yb1.r(this.a)) + ", layoutCollectionViewId=" + this.m + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.q + ", actionTargetId=" + this.w + ", actionBroadcastReceiver=" + this.c + ", glanceComponents=" + this.i + ')';
    }

    public final ad5 y(kd2 kd2Var, int i) {
        return g(this, i, null, kd2Var, null, 0L, null, 65391);
    }
}
