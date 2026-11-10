package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ub {
    public final Context g;
    public final bo3 n;
    public final long r;
    public final j51 y;

    public ub(Context context, j51 j51Var, long j, bo3 bo3Var) {
        this.g = context;
        this.y = j51Var;
        this.r = j;
        this.n = bo3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ub.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ub ubVar = (ub) obj;
        if (!yf2.p(this.g, ubVar.g) || !yf2.p(this.y, ubVar.y)) {
            return false;
        }
        long j = ubVar.r;
        int i = jj0.t;
        return tf5.g(this.r, j) && this.n.equals(ubVar.n);
    }

    public final int hashCode() {
        int iHashCode = (this.y.hashCode() + (this.g.hashCode() * 31)) * 31;
        int i = jj0.t;
        return this.n.hashCode() + xi3.v(iHashCode, 31, this.r);
    }
}
