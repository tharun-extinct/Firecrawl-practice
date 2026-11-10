package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ho5 implements c53 {
    public final g00 g;

    public ho5(g00 g00Var) {
        this.g = g00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ho5) && this.g.equals(((ho5) obj).g);
    }

    @Override // defpackage.c53
    public final int g(ne2 ne2Var, long j, int i, fl2 fl2Var) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (fl2Var == fl2.j ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return xs2.w(this.g.g(i, i2, fl2Var), 0, i2 - i);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.g.g) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.g + ", margin=0)";
    }
}
