package defpackage;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class h83 {
    public long g;
    public int n;
    public TimeInterpolator r;
    public int v;
    public long y;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h83)) {
            return false;
        }
        h83 h83Var = (h83) obj;
        if (this.g == h83Var.g && this.y == h83Var.y && this.n == h83Var.n && this.v == h83Var.v) {
            return g().getClass().equals(h83Var.g().getClass());
        }
        return false;
    }

    public final TimeInterpolator g() {
        TimeInterpolator timeInterpolator = this.r;
        return timeInterpolator != null ? timeInterpolator : qi.y;
    }

    public final int hashCode() {
        long j = this.g;
        long j2 = this.y;
        return ((((g().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.n) * 31) + this.v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(h83.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.g);
        sb.append(" duration: ");
        sb.append(this.y);
        sb.append(" interpolator: ");
        sb.append(g().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.n);
        sb.append(" repeatMode: ");
        return xi3.m(sb, this.v, "}\n");
    }
}
